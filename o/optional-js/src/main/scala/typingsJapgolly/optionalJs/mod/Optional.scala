package typingsJapgolly.optionalJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optional[T] extends js.Object {
  val _value: js.Any
  /**
    * If a value is present, and the value matches the given predicate, return an Optional describing the value,
    * otherwise return an empty Optional.
    *
    * @param predicate A predicate to apply to the value, if present
    * @return an Optional describing the value of this Optional if a value is present and the value matches the given
    * predicate, otherwise an empty Optional
    * @throws Error if the predicate is null
    */
  def filter(predicate: js.Function1[/* value */ T, Boolean]): Optional[js.UndefOr[T | Null]]
  /**
    * If a value is present, apply the provided Optional-bearing mapping function to it, return that result,
    * otherwise return an empty Optional. This method is similar to map(Function), but the provided mapper is one whose
    * result is already an Optional, and if invoked, flatMap does not wrap it with an additional Optional.
    *
    * @typeparam U The type parameter to the Optional returned by the mapping function
    * @param mapper a mapping function to apply to the value, if present the mapping function
    * @return the result of applying an Optional-bearing mapping function to the value of this Optional,
    * if a value is present, otherwise an empty Optional
    * @throws Error if the mapping function is null or returns a null result
    */
  def flatMap[U](mapper: js.Function1[/* value */ T, js.UndefOr[Optional[U] | Null]]): Optional[U]
  /**
    * If a value is present in this Optional, returns the value, otherwise throws an Error.
    *
    * @return the non-null value held by this Optional
    * @throws Error if the value is null;
    */
  def get(): T
  /**
    * If a value is present, invoke the specified consumer with the value, otherwise do nothing.
    *
    * @param consumer function to be executed if a value is present
    */
  def ifPresent(consumer: js.Function1[/* value */ T, Unit]): Unit
  /**
    * If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
    *
    * @param action the action to be performed, if a value is present
    * @param emptyAction the empty-based action to be performed, if no value is present
    * @throws if a value is present and the given action is null, or no value is present and the given empty-based action is null.
    */
  def ifPresentOrElse(action: js.Function1[/* value */ T, Unit], emptyAction: js.Function0[Unit]): Unit
  /**
    * Return true if there is a value present, otherwise false.
    *
    * @return true if there is a value present, otherwise false
    */
  def isPresent(): Boolean
  /**
    * If a value is present, apply the provided mapping function to it, and if the result is non-null,
    * return an Optional describing the result. Otherwise return an empty Optional.
    *
    * @typeparam U The type of the result of the mapping function
    * @param mapper a mapping function to apply to the value, if present.
    * @return an Optional describing the result of applying a mapping function to the value of this Optional,
    * if a value is present, otherwise an empty Optional
    * @throws Error if the mapping function is null
    */
  def map[U](mapper: js.Function1[/* value */ T, js.UndefOr[U | Null]]): Optional[U]
  /**
    * If a value is present, returns an Optional describing the value, otherwise returns an Optional produced by the supplying function.
    *
    * @param optionalSupplier the supplying function that produces an Optional to be returned
    * @return returns an Optional describing the value of this Optional, if a value is present,
    * otherwise an Optional produced by the supplying function.
    * @throws Error if the supplying function is null or produces a null result
    */
  def or(optionalSupplier: js.Function0[Optional[T]]): Optional[T]
  /**
    * If a value is present, returns the value, otherwise returns other.
    *
    * @param other the value to be returned, if no value is present. May be null.
    * @return the value, if present, otherwise other
    */
  def orElse(other: T): T
  /**
    * If a value is present, returns the value, otherwise returns the result produced by the supplying function.
    *
    * @param supplier the supplying function that produces a value to be returned
    * @return the value, if present, otherwise the result produced by the supplying function
    * @throws Error if no value is present and the supplying function is null
    */
  def orElseGet(supplier: js.Function0[T]): T
  /**
    * If a value is present, returns the value, otherwise throws an exception produced by the exception supplying function.
    *
    * @param exceptionSupplier the supplying function that produces an exception to be thrown
    * @return the value, if present
    * @throws Error if no value is present and the exception supplying function is null
    */
  def orElseThrow(exceptionSupplier: js.Function0[js.Error]): T
}

object Optional {
  @scala.inline
  def apply[T](
    _value: js.Any,
    filter: js.Function1[/* value */ T, Boolean] => CallbackTo[Optional[js.UndefOr[T | Null]]],
    flatMap: js.Function1[/* value */ T, js.UndefOr[Optional[js.Any] | Null]] => CallbackTo[Optional[js.Any]],
    get: CallbackTo[T],
    ifPresent: js.Function1[/* value */ T, Unit] => Callback,
    ifPresentOrElse: (js.Function1[/* value */ T, Unit], js.Function0[Unit]) => Callback,
    isPresent: CallbackTo[Boolean],
    map: js.Function1[/* value */ T, js.UndefOr[js.Any | Null]] => CallbackTo[Optional[js.Any]],
    or: js.Function0[Optional[T]] => CallbackTo[Optional[T]],
    orElse: T => CallbackTo[T],
    orElseGet: js.Function0[T] => CallbackTo[T],
    orElseThrow: js.Function0[js.Error] => CallbackTo[T]
  ): Optional[T] = {
    val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any])
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: js.Function1[/* value */ T, scala.Boolean]) => filter(t0).runNow()))
    __obj.updateDynamic("flatMap")(js.Any.fromFunction1((t0: js.Function1[
  /* value */ T, 
  js.UndefOr[typingsJapgolly.optionalJs.mod.Optional[js.Any] | scala.Null]]) => flatMap(t0).runNow()))
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("ifPresent")(js.Any.fromFunction1((t0: js.Function1[/* value */ T, scala.Unit]) => ifPresent(t0).runNow()))
    __obj.updateDynamic("ifPresentOrElse")(js.Any.fromFunction2((t0: js.Function1[/* value */ T, scala.Unit], t1: js.Function0[scala.Unit]) => ifPresentOrElse(t0, t1).runNow()))
    __obj.updateDynamic("isPresent")(isPresent.toJsFn)
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function1[/* value */ T, js.UndefOr[js.Any | scala.Null]]) => map(t0).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: js.Function0[typingsJapgolly.optionalJs.mod.Optional[T]]) => or(t0).runNow()))
    __obj.updateDynamic("orElse")(js.Any.fromFunction1((t0: T) => orElse(t0).runNow()))
    __obj.updateDynamic("orElseGet")(js.Any.fromFunction1((t0: js.Function0[T]) => orElseGet(t0).runNow()))
    __obj.updateDynamic("orElseThrow")(js.Any.fromFunction1((t0: js.Function0[js.Error]) => orElseThrow(t0).runNow()))
    __obj.asInstanceOf[Optional[T]]
  }
}

