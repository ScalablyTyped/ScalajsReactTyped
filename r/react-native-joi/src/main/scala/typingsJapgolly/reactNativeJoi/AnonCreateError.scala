package typingsJapgolly.reactNativeJoi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeJoi.mod.Context
import typingsJapgolly.reactNativeJoi.mod.Err
import typingsJapgolly.reactNativeJoi.mod.State
import typingsJapgolly.reactNativeJoi.mod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateError extends js.Object {
  /**
    * Creates a joi error object.
    * Used in conjunction with custom rules.
    * @param type - the type of rule to create the error for.
    * @param context - provide properties that will be available in the `language` templates.
    * @param state - should the context passed into the `validate` function in a custom rule
    * @param options - should the context passed into the `validate` function in a custom rule
    */
  def createError(`type`: String, context: Context, state: State, options: ValidationOptions): Err
}

object AnonCreateError {
  @scala.inline
  def apply(createError: (String, Context, State, ValidationOptions) => CallbackTo[Err]): AnonCreateError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createError")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.reactNativeJoi.mod.Context, t2: typingsJapgolly.reactNativeJoi.mod.State, t3: typingsJapgolly.reactNativeJoi.mod.ValidationOptions) => createError(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AnonCreateError]
  }
}

