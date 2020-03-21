package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.CSSProperties
import typingsJapgolly.spectacle.mod.LayoutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layout {
  def apply(
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LayoutProps, typingsJapgolly.spectacle.mod.Layout, Unit, LayoutProps] = {
    val __obj = js.Dynamic.literal()
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.LayoutProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.Layout](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.LayoutProps])(children: _*)
  }
  @JSImport("spectacle", "Layout")
  @js.native
  object componentImport extends js.Object
  
}

