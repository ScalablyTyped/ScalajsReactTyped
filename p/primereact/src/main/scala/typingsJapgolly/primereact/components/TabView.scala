package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonIndex
import typingsJapgolly.primereact.tabViewMod.TabViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabView {
  def apply(
    activeIndex: Int | Double = null,
    className: String = null,
    id: String = null,
    onTabChange: /* e */ AnonIndex => Callback = null,
    renderActiveOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TabViewProps, 
    typingsJapgolly.primereact.primereactTabviewMod.TabView, 
    Unit, 
    TabViewProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonIndex) => onTabChange(t0).runNow()))
    if (!js.isUndefined(renderActiveOnly)) __obj.updateDynamic("renderActiveOnly")(renderActiveOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.tabViewMod.TabViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactTabviewMod.TabView](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.tabViewMod.TabViewProps])(children: _*)
  }
  @JSImport("primereact/tabview", "TabView")
  @js.native
  object componentImport extends js.Object
  
}

