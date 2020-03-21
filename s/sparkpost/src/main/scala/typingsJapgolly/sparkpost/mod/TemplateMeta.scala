package typingsJapgolly.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateMeta extends js.Object {
  /** Template description */
  var description: String
  /** Unique template ID */
  var id: String
  /** Template name */
  var name: String
  /** Published state of the template (true = published, false = draft) */
  var published: Boolean
}

object TemplateMeta {
  @scala.inline
  def apply(description: String, id: String, name: String, published: Boolean): TemplateMeta = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemplateMeta]
  }
}

