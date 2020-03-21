package typingsJapgolly.draftJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "ContentState")
@js.native
class ContentState ()
  extends typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState

/* static members */
@JSImport("draft-js", "ContentState")
@js.native
object ContentState extends js.Object {
  def createFromBlockArray(blocks: js.Array[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock]): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromBlockArray(
    blocks: js.Array[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentBlock],
    entityMap: js.Any
  ): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String, delimiter: String): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
}

