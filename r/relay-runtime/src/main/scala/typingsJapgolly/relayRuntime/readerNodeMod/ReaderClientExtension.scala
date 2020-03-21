package typingsJapgolly.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderClientExtension extends ReaderSelection {
  val kind: String
   // 'ClientExtension';
  val selections: js.Array[ReaderSelection]
}

object ReaderClientExtension {
  @scala.inline
  def apply(kind: String, selections: js.Array[ReaderSelection]): ReaderClientExtension = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReaderClientExtension]
  }
}

