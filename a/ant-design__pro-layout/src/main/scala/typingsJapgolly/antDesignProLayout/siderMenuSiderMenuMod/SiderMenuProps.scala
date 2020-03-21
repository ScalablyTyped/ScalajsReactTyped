package typingsJapgolly.antDesignProLayout.siderMenuSiderMenuMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsJapgolly.antDesignProLayout.typingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'className' | 'collapsed' | 'isMobile' | 'menuData' | 'mode' | 'openKeys' | 'menuProps' | 'style' | 'theme' | 'subMenuItemRender' | 'menuItemRender', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps[P]} */ trait SiderMenuProps extends js.Object {
  var breakpoint: js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false`
  ] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var links: js.UndefOr[js.Array[Node]] = js.undefined
  var logo: js.UndefOr[Node] = js.undefined
  var menuHeaderRender: js.UndefOr[
    WithFalse[
      js.Function3[/* logo */ Node, /* title */ Node, /* props */ js.UndefOr[this.type], Node]
    ]
  ] = js.undefined
  var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ WithFalse[js.Array[String]], Unit]] = js.undefined
  var siderWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SiderMenuProps {
  @scala.inline
  def apply(
    breakpoint: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false` = null,
    className: String = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    links: js.Array[Node] = null,
    logo: VdomNode = null,
    menuHeaderRender: WithFalse[
      js.Function3[/* logo */ Node, /* title */ Node, /* props */ js.UndefOr[SiderMenuProps], Node]
    ] = null,
    onMenuHeaderClick: /* e */ ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onOpenChange: /* openKeys */ WithFalse[js.Array[String]] => Callback = null,
    siderWidth: Int | Double = null,
    style: CSSProperties = null
  ): SiderMenuProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.rawNode.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMenuHeaderClick(t0).runNow()))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* openKeys */ typingsJapgolly.antDesignProLayout.typingsMod.WithFalse[js.Array[java.lang.String]]) => onOpenChange(t0).runNow()))
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderMenuProps]
  }
}

