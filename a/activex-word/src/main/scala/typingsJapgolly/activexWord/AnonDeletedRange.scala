package typingsJapgolly.activexWord

import typingsJapgolly.activexWord.Word.Range
import typingsJapgolly.activexWord.Word.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeletedRange extends js.Object {
  val DeletedRange: Range
  val InUndoRedo: Boolean
  val OldXMLNode: XMLNode
}

object AnonDeletedRange {
  @scala.inline
  def apply(DeletedRange: Range, InUndoRedo: Boolean, OldXMLNode: XMLNode): AnonDeletedRange = {
    val __obj = js.Dynamic.literal(DeletedRange = DeletedRange.asInstanceOf[js.Any], InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeletedRange]
  }
}

