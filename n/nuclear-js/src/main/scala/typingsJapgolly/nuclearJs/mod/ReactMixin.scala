package typingsJapgolly.nuclearJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactMixin extends js.Object {
  def componentDidMount(): Unit
  def componentWillUnmount(): Unit
  def getInitialState(): js.Any
}

object ReactMixin {
  @scala.inline
  def apply(componentDidMount: Callback, componentWillUnmount: Callback, getInitialState: CallbackTo[js.Any]): ReactMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentDidMount")(componentDidMount.toJsFn)
    __obj.updateDynamic("componentWillUnmount")(componentWillUnmount.toJsFn)
    __obj.updateDynamic("getInitialState")(getInitialState.toJsFn)
    __obj.asInstanceOf[ReactMixin]
  }
}

