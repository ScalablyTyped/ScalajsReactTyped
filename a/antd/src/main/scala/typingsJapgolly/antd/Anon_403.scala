package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_403 extends js.Object {
  def `403`(): Element
  def `404`(): Element
  def `500`(): Element
}

object Anon_403 {
  @scala.inline
  def apply(`403`: CallbackTo[Element], `404`: CallbackTo[Element], `500`: CallbackTo[Element]): Anon_403 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(`403`.toJsFn)
    __obj.updateDynamic("404")(`404`.toJsFn)
    __obj.updateDynamic("500")(`500`.toJsFn)
    __obj.asInstanceOf[Anon_403]
  }
}

