package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.globalHeaderMod.GlobalHeaderProps
import typingsJapgolly.antDesignProLayout.globalHeaderMod.default
import typingsJapgolly.antDesignProLayout.typingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GlobalHeader {
  def apply(
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedButtonRender: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], Node]] = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    logo: VdomNode = null,
    menuHeaderRender: WithFalse[
      js.Function3[/* logo */ Node, /* title */ Node, /* props */ js.UndefOr[GlobalHeaderProps], Node]
    ] = null,
    menuRender: /* import warning: importer.ImportType#apply Failed type conversion: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps['menuRender'] */ js.Any = null,
    onCollapse: /* collapsed */ Boolean => Callback = null,
    rightContentRender: WithFalse[js.Function1[GlobalHeaderProps, Node]] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GlobalHeaderProps, default, Unit, GlobalHeaderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.rawNode.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: /* collapsed */ scala.Boolean) => onCollapse(t0).runNow()))
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignProLayout.globalHeaderMod.GlobalHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignProLayout.globalHeaderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.globalHeaderMod.GlobalHeaderProps])(children: _*)
  }
  @JSImport("@ant-design/pro-layout/lib/GlobalHeader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

