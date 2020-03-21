package typingsJapgolly.hexo.mod.Locals

import typingsJapgolly.hexo.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var length: Double
  var name: String
  var path: String
  var permalink: String
  var posts: Model[Post]
  var slug: String
}

object Tag {
  @scala.inline
  def apply(length: Double, name: String, path: String, permalink: String, posts: Model[Post], slug: String): Tag = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

