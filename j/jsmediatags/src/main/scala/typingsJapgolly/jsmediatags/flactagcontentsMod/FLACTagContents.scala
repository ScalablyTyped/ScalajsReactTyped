package typingsJapgolly.jsmediatags.flactagcontentsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FLACTagContents extends js.Object {
  var blocks: js.Array[MetadataBlock]
  def toArray(): ByteArray
}

object FLACTagContents {
  @scala.inline
  def apply(blocks: js.Array[MetadataBlock], toArray: CallbackTo[ByteArray]): FLACTagContents = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any])
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.asInstanceOf[FLACTagContents]
  }
}

