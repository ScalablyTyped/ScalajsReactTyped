package typingsJapgolly.oracleOraclejet.ojcompositeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModel extends js.Object {
  def activated(param0: ViewModelContext): js.Promise[_] | Unit
  def bindingsApplied(param0: ViewModelContext): Unit
  def connected(param0: ViewModelContext): Unit
  def disconnected(param0: Element): Unit
  def propertyChanged(param0: PropertyChangedContext): Unit
}

object ViewModel {
  @scala.inline
  def apply(
    activated: ViewModelContext => CallbackTo[js.Promise[js.Any] | Unit],
    bindingsApplied: ViewModelContext => Callback,
    connected: ViewModelContext => Callback,
    disconnected: Element => Callback,
    propertyChanged: PropertyChangedContext => Callback
  ): ViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activated")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojcompositeMod.ViewModelContext) => activated(t0).runNow()))
    __obj.updateDynamic("bindingsApplied")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojcompositeMod.ViewModelContext) => bindingsApplied(t0).runNow()))
    __obj.updateDynamic("connected")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojcompositeMod.ViewModelContext) => connected(t0).runNow()))
    __obj.updateDynamic("disconnected")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => disconnected(t0).runNow()))
    __obj.updateDynamic("propertyChanged")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojcompositeMod.PropertyChangedContext) => propertyChanged(t0).runNow()))
    __obj.asInstanceOf[ViewModel]
  }
}

