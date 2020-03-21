package typingsJapgolly.reactTabsRedux.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTabsRedux.tabLinkMod.TabLinkProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabLink {
  def apply(
    to: Double | String,
    activeClassName: String = null,
    activeStyle: js.Object = null,
    className: String = null,
    component: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    handleSelect: (/* tab */ String, /* name */ String) => Callback = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    namespace: String = null,
    onClick: /* event */ Event_ => Callback = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabLinkProps, typingsJapgolly.reactTabsRedux.mod.TabLink, Unit, TabLinkProps] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
      if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (handleSelect != null) __obj.updateDynamic("handleSelect")(js.Any.fromFunction2((t0: /* tab */ java.lang.String, t1: /* name */ java.lang.String) => handleSelect(t0, t1).runNow()))
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTabsRedux.tabLinkMod.TabLinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTabsRedux.mod.TabLink](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTabsRedux.tabLinkMod.TabLinkProps])(children: _*)
  }
  @JSImport("react-tabs-redux", "TabLink")
  @js.native
  object componentImport extends js.Object
  
}

