package typingsJapgolly.reactFocusLock.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFocusLock.interfacesMod.FreeFocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FreeFocusInside {
  def apply(
    className: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    FreeFocusProps, 
    typingsJapgolly.reactFocusLock.mod.FreeFocusInside, 
    Unit, 
    FreeFocusProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFocusLock.interfacesMod.FreeFocusProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFocusLock.mod.FreeFocusInside](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFocusLock.interfacesMod.FreeFocusProps])(children: _*)
  }
  @JSImport("react-focus-lock", "FreeFocusInside")
  @js.native
  object componentImport extends js.Object
  
}

