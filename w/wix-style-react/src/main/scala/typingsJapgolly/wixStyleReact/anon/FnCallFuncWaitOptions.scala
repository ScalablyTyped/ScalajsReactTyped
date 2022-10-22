package typingsJapgolly.wixStyleReact.anon

import typingsJapgolly.lodash.mod.DebounceSettings
import typingsJapgolly.lodash.mod.DebounceSettingsLeading
import typingsJapgolly.lodash.mod.DebouncedFunc
import typingsJapgolly.lodash.mod.DebouncedFuncLeading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallFuncWaitOptions extends StObject {
  
  def apply[T_1 /* <: js.Function1[/* args */ Any, Any] */](func: T_1): DebouncedFunc[T_1] = js.native
  def apply[T_1 /* <: js.Function1[/* args */ Any, Any] */](func: T_1, wait: Double): DebouncedFunc[T_1] = js.native
  def apply[T_1 /* <: js.Function1[/* args */ Any, Any] */](func: T_1, wait: Double, options: DebounceSettings): DebouncedFunc[T_1] = js.native
  def apply[T_1 /* <: js.Function1[/* args */ Any, Any] */](func: T_1, wait: Unit, options: DebounceSettings): DebouncedFunc[T_1] = js.native
  def apply[T /* <: js.Function1[/* args */ Any, Any] */](func: T, wait: Double, options: DebounceSettingsLeading): DebouncedFuncLeading[T] = js.native
  def apply[T /* <: js.Function1[/* args */ Any, Any] */](func: T, wait: Unit, options: DebounceSettingsLeading): DebouncedFuncLeading[T] = js.native
}
