package typingsJapgolly.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default entity types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.draftJs.draftJsStrings.LINK
  - typingsJapgolly.draftJs.draftJsStrings.TOKEN
  - typingsJapgolly.draftJs.draftJsStrings.PHOTO
  - typingsJapgolly.draftJs.draftJsStrings.IMAGE
*/
trait ComposedEntityType extends js.Object

object ComposedEntityType {
  @scala.inline
  def IMAGE: typingsJapgolly.draftJs.draftJsStrings.IMAGE = this.cast("IMAGE")
  @scala.inline
  def LINK: typingsJapgolly.draftJs.draftJsStrings.LINK = this.cast("LINK")
  @scala.inline
  def PHOTO: typingsJapgolly.draftJs.draftJsStrings.PHOTO = this.cast("PHOTO")
  @scala.inline
  def TOKEN: typingsJapgolly.draftJs.draftJsStrings.TOKEN = this.cast("TOKEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

