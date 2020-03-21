package typingsJapgolly.javascriptObfuscator.icalleedataextractorMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import typingsJapgolly.javascriptObfuscator.icalleedataMod.ICalleeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalleeDataExtractor extends js.Object {
  /**
    * @param blockScopeBody
    * @param callee
    * @returns ICalleeData|null
    */
  def extract(blockScopeBody: js.Array[Node], callee: Node): ICalleeData | Null
}

object ICalleeDataExtractor {
  @scala.inline
  def apply(extract: (js.Array[Node], Node) => CallbackTo[ICalleeData | Null]): ICalleeDataExtractor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extract")(js.Any.fromFunction2((t0: js.Array[org.scalajs.dom.raw.Node], t1: org.scalajs.dom.raw.Node) => extract(t0, t1).runNow()))
    __obj.asInstanceOf[ICalleeDataExtractor]
  }
}

