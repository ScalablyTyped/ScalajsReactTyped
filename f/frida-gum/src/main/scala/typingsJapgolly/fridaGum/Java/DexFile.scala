package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DexFile extends js.Object {
  /**
    * Determines available class names.
    */
  def getClassNames(): js.Array[String]
  /**
    * Loads the contained classes into the VM.
    */
  def load(): Unit
}

object DexFile {
  @scala.inline
  def apply(getClassNames: CallbackTo[js.Array[String]], load: Callback): DexFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getClassNames")(getClassNames.toJsFn)
    __obj.updateDynamic("load")(load.toJsFn)
    __obj.asInstanceOf[DexFile]
  }
}

