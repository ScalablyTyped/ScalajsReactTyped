package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.MenuDataItemisUrlboolean
import typingsJapgolly.antDesignProLayout.baseMenuMod.BaseMenuProps
import typingsJapgolly.antDesignProLayout.typingsMod.MenuDataItem
import typingsJapgolly.antDesignProLayout.typingsMod.MessageDescriptor
import typingsJapgolly.antDesignProLayout.typingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BaseMenu {
  def apply(
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    formatMessage: /* message */ MessageDescriptor => CallbackTo[String] = null,
    handleOpenChange: /* openKeys */ js.Array[String] => Callback = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    menuData: js.Array[MenuDataItem] = null,
    menuItemRender: WithFalse[js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ Node, Node]] = null,
    menuProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps */ js.Any = null,
    mode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuMode */ js.Any = null,
    onCollapse: /* collapsed */ Boolean => Callback = null,
    openKeys: WithFalse[js.Array[String]] = null,
    style: CSSProperties = null,
    subMenuItemRender: WithFalse[js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ Node, Node]] = null,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    BaseMenuProps, 
    MountedWithRawType[BaseMenuProps, js.Object, RawMounted[BaseMenuProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.antDesignProLayout.typingsMod.MessageDescriptor) => formatMessage(t0).runNow()))
    if (handleOpenChange != null) __obj.updateDynamic("handleOpenChange")(js.Any.fromFunction1((t0: /* openKeys */ js.Array[java.lang.String]) => handleOpenChange(t0).runNow()))
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (menuData != null) __obj.updateDynamic("menuData")(menuData.asInstanceOf[js.Any])
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: /* collapsed */ scala.Boolean) => onCollapse(t0).runNow()))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuItemRender != null) __obj.updateDynamic("subMenuItemRender")(subMenuItemRender.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignProLayout.baseMenuMod.BaseMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.baseMenuMod.BaseMenuProps])(children: _*)
  }
  @JSImport("@ant-design/pro-layout/lib/SiderMenu/BaseMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

