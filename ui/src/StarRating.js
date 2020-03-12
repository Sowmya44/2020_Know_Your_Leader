import React, { Component, useState } from "react";
import "./rating.css";
import Rating from './Rating.js'
import PropTypes from 'prop-types';

const Star = ({ selected = false, onClick = f => f }) => (
  <div className={selected ? "star selected" : "star"} onClick={onClick} />
);

const StarRating = ({ starsSelected = 0, totalStars = 5, onRate = f => f }) =>
  <div className="star-rating">
    {[...Array(totalStars)].map((n, i) =>
      <Star key={i}
        selected={i < starsSelected} onClick={() => onRate(i + 1)} />
    )}
    <p>{starsSelected} of {totalStars} stars</p> </div>


export default StarRating;

