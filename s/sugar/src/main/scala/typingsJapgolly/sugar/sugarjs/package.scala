package typingsJapgolly.sugar.sugarjs

import typingsJapgolly.std.BooleanConstructor
import typingsJapgolly.std.ErrorConstructor
import typingsJapgolly.std.FunctionConstructor
import typingsJapgolly.sugar.sugarjs.Array.Chainable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
type NativeConstructor = _NativeConstructor | FunctionConstructor | BooleanConstructor | ErrorConstructor

type SugarDefaultChainable[RawValue] = (Chainable[Any, RawValue]) & typingsJapgolly.sugar.sugarjs.Date.Chainable[RawValue] & typingsJapgolly.sugar.sugarjs.Function.Chainable[RawValue] & typingsJapgolly.sugar.sugarjs.Number.Chainable[RawValue] & typingsJapgolly.sugar.sugarjs.Object.Chainable[RawValue] & typingsJapgolly.sugar.sugarjs.RegExp.Chainable[RawValue] & typingsJapgolly.sugar.sugarjs.String.Chainable[RawValue]
