import React, { Component, useState } from "react";
import {
    Form,
    Button,
    Row,
    Col
} from 'react-bootstrap'

    function Comment(props){
        
        const handleCommentChange = event => {
            const { name, value } = event.target
          }
          
        return(
            <div>
            <Form>
            <Form.Group as={Row}>
                <Col>
                    <Form.Control placeholder="comment here..." name="comment" as="textarea" rows="2" value={props.comment} onChange={handleCommentChange}/>
                </Col>
                <Col>
                    <Button variant="primary" onClick={ (e) => props.onComment(e,props.comment) }>Post</Button>
                </Col>
            </Form.Group>
            </Form>
        </div>
        );
    }


    export default Comment;