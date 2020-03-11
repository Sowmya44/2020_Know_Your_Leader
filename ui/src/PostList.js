import React, { Component }  from 'react';
import Post from './Post.js'

const PostList = ({ posts=[], onRate=f=>f }) => 
     <div> { 
              posts.map(post =>
                        <Post key={post.actionid} {...post}
                        onRate={(ratingvalue,comment) => onRate(post.actionid, ratingvalue,comment)} />
                    )
    }
    </div>

export default PostList;