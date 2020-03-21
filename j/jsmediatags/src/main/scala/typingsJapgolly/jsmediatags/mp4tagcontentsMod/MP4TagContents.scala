package typingsJapgolly.jsmediatags.mp4tagcontentsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MP4TagContents extends js.Object {
  var _atoms: js.Array[Atom]
  def toArray(): ByteArray
}

object MP4TagContents {
  @scala.inline
  def apply(_atoms: js.Array[Atom], toArray: CallbackTo[ByteArray]): MP4TagContents = {
    val __obj = js.Dynamic.literal(_atoms = _atoms.asInstanceOf[js.Any])
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.asInstanceOf[MP4TagContents]
  }
}

