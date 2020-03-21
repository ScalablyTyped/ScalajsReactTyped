package typingsJapgolly.reactApp.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactApp.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  def apply(
    to: String,
    className: String = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LinkProps, typingsJapgolly.reactApp.mod.Link, Unit, LinkProps] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactApp.mod.LinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactApp.mod.Link](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactApp.mod.LinkProps])(children: _*)
  }
  @JSImport("react-app", "Link")
  @js.native
  object componentImport extends js.Object
  
}

