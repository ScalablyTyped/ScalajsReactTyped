package typingsJapgolly.reactFocusLock.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFocusLock.interfacesMod.InFocusGuardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InFocusGuard {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    InFocusGuardProps, 
    typingsJapgolly.reactFocusLock.mod.InFocusGuard, 
    Unit, 
    InFocusGuardProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFocusLock.interfacesMod.InFocusGuardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFocusLock.mod.InFocusGuard](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFocusLock.interfacesMod.InFocusGuardProps])(children: _*)
  }
  @JSImport("react-focus-lock", "InFocusGuard")
  @js.native
  object componentImport extends js.Object
  
}

