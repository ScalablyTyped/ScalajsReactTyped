package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.scrollPanelMod.ScrollPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollPanel {
  def apply(
    className: String = null,
    id: String = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ScrollPanelProps, 
    typingsJapgolly.primereact.primereactScrollpanelMod.ScrollPanel, 
    Unit, 
    ScrollPanelProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.scrollPanelMod.ScrollPanelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactScrollpanelMod.ScrollPanel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.scrollPanelMod.ScrollPanelProps])(children: _*)
  }
  @JSImport("primereact/scrollpanel", "ScrollPanel")
  @js.native
  object componentImport extends js.Object
  
}

