package typingsJapgolly.sugarCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sugarjs {
  type NativeConstructor = typingsJapgolly.std.ArrayConstructor | typingsJapgolly.std.DateConstructor | typingsJapgolly.std.FunctionConstructor | typingsJapgolly.std.NumberConstructor | typingsJapgolly.std.ObjectConstructor | typingsJapgolly.std.RegExpConstructor | typingsJapgolly.std.StringConstructor | typingsJapgolly.std.BooleanConstructor | typingsJapgolly.std.ErrorConstructor
  type SugarDefaultChainable[RawValue] = (typingsJapgolly.sugarCore.sugarjs.Array.Chainable[_, RawValue]) with typingsJapgolly.sugarCore.sugarjs.Date.Chainable[RawValue] with typingsJapgolly.sugarCore.sugarjs.Function.Chainable[RawValue] with typingsJapgolly.sugarCore.sugarjs.Number.Chainable[RawValue] with typingsJapgolly.sugarCore.sugarjs.Object.Chainable[RawValue] with typingsJapgolly.sugarCore.sugarjs.RegExp.Chainable[RawValue] with typingsJapgolly.sugarCore.sugarjs.String.Chainable[RawValue]
}
