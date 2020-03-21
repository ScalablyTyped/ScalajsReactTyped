package typingsJapgolly.sugar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjs {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sugar.ArrayConstructor
    - typingsJapgolly.sugar.DateConstructor
    - typingsJapgolly.std.FunctionConstructor
    - typingsJapgolly.sugar.NumberConstructor
    - typingsJapgolly.sugar.ObjectConstructor
    - typingsJapgolly.sugar.RegExpConstructor
    - typingsJapgolly.sugar.StringConstructor
    - typingsJapgolly.std.BooleanConstructor
    - typingsJapgolly.std.ErrorConstructor
  */
  type NativeConstructor = typingsJapgolly.sugar.sugarjs._NativeConstructor | typingsJapgolly.std.FunctionConstructor | typingsJapgolly.std.BooleanConstructor | typingsJapgolly.std.ErrorConstructor
  type SugarDefaultChainable[RawValue] = (typingsJapgolly.sugar.sugarjs.Array.Chainable[_, RawValue]) with typingsJapgolly.sugar.sugarjs.Date.Chainable[RawValue] with typingsJapgolly.sugar.sugarjs.Function.Chainable[RawValue] with typingsJapgolly.sugar.sugarjs.Number.Chainable[RawValue] with typingsJapgolly.sugar.sugarjs.Object.Chainable[RawValue] with typingsJapgolly.sugar.sugarjs.RegExp.Chainable[RawValue] with typingsJapgolly.sugar.sugarjs.String.Chainable[RawValue]
}
