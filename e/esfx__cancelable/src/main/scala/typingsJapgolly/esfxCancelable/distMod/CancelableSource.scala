package typingsJapgolly.esfxCancelable.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelableSource extends Cancelable

@JSImport("@esfx/cancelable/dist", "CancelableSource")
@js.native
object CancelableSource extends js.Object {
  val cancel: js.Symbol = js.native
  /**
    * A well-known symbol used to define a method to retrieve the `CancelSignal` for an object.
    */
  val cancelSignal: js.Symbol = js.native
  val name: typingsJapgolly.esfxCancelable.esfxCancelableStrings.CancelableSource = js.native
  /**
    * Determines whether a value is a `CancelableSource` object.
    */
  def hasInstance(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = js.native
  /**
    * Determines whether a value is a `Cancelable` object.
    * @deprecated Use `Cancelable.hasInstance` instead.
    */
  def isCancelable(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.Cancelable */ Boolean = js.native
  /**
    * Determines whether a value is a `CancelableSource` object.
    * @deprecated Use `CancelableSource.hasInstance` instead.
    */
  def isCancelableSource(value: js.Any): /* is @esfx/cancelable.@esfx/cancelable/dist.CancelableSource */ Boolean = js.native
}

