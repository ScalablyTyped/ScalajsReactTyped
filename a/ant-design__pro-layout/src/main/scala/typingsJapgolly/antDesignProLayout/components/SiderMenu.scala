package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.AutoClose
import typingsJapgolly.antDesignProLayout.anon.AvatarPropstitleReactNode
import typingsJapgolly.antDesignProLayout.anon.BaseMenuPropsPartialPriva
import typingsJapgolly.antDesignProLayout.anon.Desc
import typingsJapgolly.antDesignProLayout.anon.MenuDataItemisUrlboolean
import typingsJapgolly.antDesignProLayout.anon.MenuDataItemisUrlbooleano
import typingsJapgolly.antDesignProLayout.anon.Pathname
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`additions removals`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`additions text`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`inline`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`removals additions`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`removals text`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`text additions`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.`text removals`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.additions
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.all
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.ascending
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.assertive
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.both
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.copy
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.date
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.decimal
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.descending
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.dialog
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.email
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.execute
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.grammar
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.grid
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.group
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.header
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.horizontal
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.inherit
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.lg
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.light
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.link
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.list
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.listbox
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.location
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.ltr
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.md
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.menu
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.mixed
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.move
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.no
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.none
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.numeric
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.off
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.on
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.other
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.page
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.polite
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.popup
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.removals
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.rtl
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.search
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.side
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.sider
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.sm
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.spelling
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.step
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.sub
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.tel
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.text
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.time
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.top
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.tree
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.url
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.vertical
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.xl
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.xs
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.xxl
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.yes
import typingsJapgolly.antDesignProLayout.esComponentsAppsLogoComponentsTypesMod.AppsLogoComponentsAppList
import typingsJapgolly.antDesignProLayout.esComponentsHeaderMod.HeaderViewProps
import typingsJapgolly.antDesignProLayout.esComponentsSiderMenuBaseMenuMod.BaseMenuProps
import typingsJapgolly.antDesignProLayout.esComponentsSiderMenuBaseMenuMod.MenuMode
import typingsJapgolly.antDesignProLayout.esComponentsSiderMenuSiderMenuMod.PrivateSiderMenuProps
import typingsJapgolly.antDesignProLayout.esComponentsSiderMenuSiderMenuMod.SiderMenuProps
import typingsJapgolly.antDesignProLayout.esDefaultSettingsMod.ContentWidth
import typingsJapgolly.antDesignProLayout.esTypingsMod.MenuDataItem
import typingsJapgolly.antDesignProLayout.esTypingsMod.MessageDescriptor
import typingsJapgolly.antDesignProLayout.esTypingsMod.Route
import typingsJapgolly.antDesignProLayout.esTypingsMod.StaticContext
import typingsJapgolly.antDesignProLayout.esTypingsMod.WithFalse
import typingsJapgolly.antDesignProLayout.esTypingsMod.`match`
import typingsJapgolly.antd.libMenuHooksUseItemsMod.ItemType
import typingsJapgolly.antd.libMenuMenuContextMod.MenuTheme
import typingsJapgolly.antd.libMenuMod.MenuProps
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.Location
import typingsJapgolly.rcMenu.anon.Active
import typingsJapgolly.rcMenu.anon.PartialkeyinMenuModeother
import typingsJapgolly.rcMenu.anon.Selected
import typingsJapgolly.rcMenu.esInterfaceMod.BuiltinPlacements
import typingsJapgolly.rcMenu.esInterfaceMod.MenuInfo
import typingsJapgolly.rcMenu.esInterfaceMod.RenderIconInfo
import typingsJapgolly.rcMenu.esInterfaceMod.RenderIconType
import typingsJapgolly.rcMenu.esInterfaceMod.SelectInfo
import typingsJapgolly.rcMenu.esInterfaceMod.TriggerSubMenuAction
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SiderMenu {
  
  inline def apply(
    matchMenuKeys: js.Array[String],
    mode: js.UndefOr[MenuMode] & js.UndefOr[typingsJapgolly.rcMenu.esInterfaceMod.MenuMode]
  ): Builder = {
    val __props = js.Dynamic.literal(matchMenuKeys = matchMenuKeys.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SiderMenuProps & PrivateSiderMenuProps]))
  }
  
  @JSImport("@ant-design/pro-layout/es/components/SiderMenu", "SiderMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def _internalRenderMenuItem(value: (/* originNode */ Element, /* menuItemProps */ Any, /* stateProps */ Selected) => Element): this.type = set("_internalRenderMenuItem", js.Any.fromFunction3(value))
    
    inline def _internalRenderSubMenuItem(value: (/* originNode */ Element, /* subMenuItemProps */ Any, /* stateProps */ Active) => Element): this.type = set("_internalRenderSubMenuItem", js.Any.fromFunction3(value))
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def actionsRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, js.Array[Node]]]): this.type = set("actionsRender", value.asInstanceOf[js.Any])
    
    inline def actionsRenderFunction1(value: /* props */ HeaderViewProps => js.Array[Node]): this.type = set("actionsRender", js.Any.fromFunction1(value))
    
    inline def activeKey(value: String): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    inline def appList(value: AppsLogoComponentsAppList): this.type = set("appList", value.asInstanceOf[js.Any])
    
    inline def appListVarargs(value: Desc*): this.type = set("appList", js.Array(value*))
    
    inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `aria-autocomplete`(value: none | `inline` | list | both): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
    
    inline def `aria-checked`(value: Boolean | mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
    
    inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def `aria-current`(value: Boolean | page | step | location | date | time): this.type = set("aria-current", value.asInstanceOf[js.Any])
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `aria-dropeffect`(value: none | copy | execute | link | move | popup): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `aria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `aria-invalid`(value: Boolean | grammar | spelling): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
    
    inline def `aria-live`(value: off | assertive | polite): this.type = set("aria-live", value.asInstanceOf[js.Any])
    
    inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
    
    inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `aria-orientation`(value: horizontal | vertical): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
    
    inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `aria-pressed`(value: Boolean | mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `aria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
    
    inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
    
    inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `aria-sort`(value: none | ascending | descending | other): this.type = set("aria-sort", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def avatarProps(value: WithFalse[AvatarPropstitleReactNode]): this.type = set("avatarProps", value.asInstanceOf[js.Any])
    
    inline def breakpoint(value: xs | sm | md | lg | xl | xxl | `false`): this.type = set("breakpoint", value.asInstanceOf[js.Any])
    
    inline def builtinPlacements(value: BuiltinPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    inline def collapsedButtonRender(
      value: WithFalse[
          js.Function2[/* collapsed */ js.UndefOr[Boolean], /* defaultDom */ js.UndefOr[Node], Node]
        ]
    ): this.type = set("collapsedButtonRender", value.asInstanceOf[js.Any])
    
    inline def collapsedButtonRenderFunction2(value: (/* collapsed */ js.UndefOr[Boolean], /* defaultDom */ js.UndefOr[Node]) => Node): this.type = set("collapsedButtonRender", js.Any.fromFunction2(value))
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorPrimary(value: String): this.type = set("colorPrimary", value.asInstanceOf[js.Any])
    
    inline def colorWeak(value: Boolean): this.type = set("colorWeak", value.asInstanceOf[js.Any])
    
    inline def computedMatch(value: `match`[Any]): this.type = set("computedMatch", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contentWidth(value: ContentWidth): this.type = set("contentWidth", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultActiveFirst(value: Boolean): this.type = set("defaultActiveFirst", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultCollapsed(value: Boolean): this.type = set("defaultCollapsed", value.asInstanceOf[js.Any])
    
    inline def defaultMotions(value: PartialkeyinMenuModeother): this.type = set("defaultMotions", value.asInstanceOf[js.Any])
    
    inline def defaultOpenKeys(value: js.Array[String]): this.type = set("defaultOpenKeys", value.asInstanceOf[js.Any])
    
    inline def defaultOpenKeysVarargs(value: String*): this.type = set("defaultOpenKeys", js.Array(value*))
    
    inline def defaultSelectedKeys(value: js.Array[String]): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    inline def defaultSelectedKeysVarargs(value: String*): this.type = set("defaultSelectedKeys", js.Array(value*))
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledOverflow(value: Boolean): this.type = set("disabledOverflow", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def expandIcon(value: RenderIconType): this.type = set("expandIcon", value.asInstanceOf[js.Any])
    
    inline def expandIconFunction1(value: /* props */ RenderIconInfo => Node): this.type = set("expandIcon", js.Any.fromFunction1(value))
    
    inline def expandIconNull: this.type = set("expandIcon", null)
    
    inline def expandIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("expandIcon", js.Array(value*))
    
    inline def expandIconVdomElement(value: VdomElement): this.type = set("expandIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def fixSiderbar(value: Boolean): this.type = set("fixSiderbar", value.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
    
    inline def forceSubMenuRender(value: Boolean): this.type = set("forceSubMenuRender", value.asInstanceOf[js.Any])
    
    inline def formatMessage(value: /* message */ MessageDescriptor => String): this.type = set("formatMessage", js.Any.fromFunction1(value))
    
    inline def getContainer(value: `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    inline def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    inline def handleOpenChange(value: /* openKeys */ js.Array[String] => Callback): this.type = set("handleOpenChange", js.Any.fromFunction1((t0: /* openKeys */ js.Array[String]) => value(t0).runNow()))
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
    
    inline def history(value: History): this.type = set("history", value.asInstanceOf[js.Any])
    
    inline def iconPrefixes(value: String): this.type = set("iconPrefixes", value.asInstanceOf[js.Any])
    
    inline def iconfontUrl(value: String): this.type = set("iconfontUrl", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inlineCollapsed(value: Boolean): this.type = set("inlineCollapsed", value.asInstanceOf[js.Any])
    
    inline def inlineIndent(value: Double): this.type = set("inlineIndent", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemIcon(value: RenderIconType): this.type = set("itemIcon", value.asInstanceOf[js.Any])
    
    inline def itemIconFunction1(value: /* props */ RenderIconInfo => Node): this.type = set("itemIcon", js.Any.fromFunction1(value))
    
    inline def itemIconNull: this.type = set("itemIcon", null)
    
    inline def itemIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("itemIcon", js.Array(value*))
    
    inline def itemIconVdomElement(value: VdomElement): this.type = set("itemIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[ItemType]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: ItemType*): this.type = set("items", js.Array(value*))
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def layout(value: side | top | mix): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def links(value: js.Array[Node]): this.type = set("links", value.asInstanceOf[js.Any])
    
    inline def linksVarargs(value: Node*): this.type = set("links", js.Array(value*))
    
    inline def location(value: Location | Pathname): this.type = set("location", value.asInstanceOf[js.Any])
    
    inline def logo(value: VdomNode): this.type = set("logo", value.rawNode.asInstanceOf[js.Any])
    
    inline def logoNull: this.type = set("logo", null)
    
    inline def logoStyle(value: CSSProperties): this.type = set("logoStyle", value.asInstanceOf[js.Any])
    
    inline def logoVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("logo", js.Array(value*))
    
    inline def logoVdomElement(value: VdomElement): this.type = set("logo", value.rawElement.asInstanceOf[js.Any])
    
    inline def `match`(value: typingsJapgolly.antDesignProLayout.esTypingsMod.`match`[Record[String, Any]]): this.type = set("match", value.asInstanceOf[js.Any])
    
    inline def menu(value: AutoClose): this.type = set("menu", value.asInstanceOf[js.Any])
    
    inline def menuContentRender(value: WithFalse[js.Function2[/* props */ SiderMenuProps, /* defaultDom */ Node, Node]]): this.type = set("menuContentRender", value.asInstanceOf[js.Any])
    
    inline def menuContentRenderFunction2(value: (/* props */ SiderMenuProps, /* defaultDom */ Node) => Node): this.type = set("menuContentRender", js.Any.fromFunction2(value))
    
    inline def menuData(value: js.Array[MenuDataItem]): this.type = set("menuData", value.asInstanceOf[js.Any])
    
    inline def menuDataVarargs(value: MenuDataItem*): this.type = set("menuData", js.Array(value*))
    
    inline def menuExtraRender(value: WithFalse[js.Function1[/* props */ SiderMenuProps, Node]]): this.type = set("menuExtraRender", value.asInstanceOf[js.Any])
    
    inline def menuExtraRenderFunction1(value: /* props */ SiderMenuProps => Node): this.type = set("menuExtraRender", js.Any.fromFunction1(value))
    
    inline def menuFooterRender(value: WithFalse[js.Function1[/* props */ js.UndefOr[SiderMenuProps], Node]]): this.type = set("menuFooterRender", value.asInstanceOf[js.Any])
    
    inline def menuFooterRenderFunction1(value: /* props */ js.UndefOr[SiderMenuProps] => Node): this.type = set("menuFooterRender", js.Any.fromFunction1(value))
    
    inline def menuHeaderRender(
      value: WithFalse[
          js.Function3[/* logo */ Node, /* title */ Node, /* props */ js.UndefOr[SiderMenuProps], Node]
        ]
    ): this.type = set("menuHeaderRender", value.asInstanceOf[js.Any])
    
    inline def menuHeaderRenderFunction3(value: (/* logo */ Node, /* title */ Node, /* props */ js.UndefOr[SiderMenuProps]) => Node): this.type = set("menuHeaderRender", js.Any.fromFunction3(value))
    
    inline def menuItemRender(
      value: WithFalse[
          js.Function3[
            /* item */ MenuDataItemisUrlbooleano, 
            /* defaultDom */ Node, 
            /* menuProps */ BaseMenuPropsPartialPriva, 
            Node
          ]
        ]
    ): this.type = set("menuItemRender", value.asInstanceOf[js.Any])
    
    inline def menuItemRenderFunction3(
      value: (/* item */ MenuDataItemisUrlbooleano, /* defaultDom */ Node, /* menuProps */ BaseMenuPropsPartialPriva) => Node
    ): this.type = set("menuItemRender", js.Any.fromFunction3(value))
    
    inline def menuProps(value: MenuProps): this.type = set("menuProps", value.asInstanceOf[js.Any])
    
    inline def menuRenderType(value: header | sider): this.type = set("menuRenderType", value.asInstanceOf[js.Any])
    
    inline def motion(value: CSSMotionProps): this.type = set("motion", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def navTheme(value: realDark | light): this.type = set("navTheme", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAuxClick(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onBeforeInput(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClick(value: /* info */ MenuInfo => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* info */ MenuInfo) => value(t0).runNow()))
    
    inline def onCollapse(value: /* collapsed */ Boolean => Callback): this.type = set("onCollapse", js.Any.fromFunction1((t0: /* collapsed */ Boolean) => value(t0).runNow()))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDeselect(value: /* info */ SelectInfo => Callback): this.type = set("onDeselect", js.Any.fromFunction1((t0: /* info */ SelectInfo) => value(t0).runNow()))
    
    inline def onDoubleClick(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onError(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onInput(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onInvalid(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMenuHeaderClick(value: /* e */ ReactMouseEventFrom[HTMLDivElement] => Callback): this.type = set("onMenuHeaderClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onOpenChange(value: /* openKeys */ WithFalse[js.Array[String]] => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* openKeys */ WithFalse[js.Array[String]]) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerOut(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerOver(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onProgress(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onReset(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onScroll(value: ReactUIEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSelect(value: /* info */ SelectInfo => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* info */ SelectInfo) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLUListElement & org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLUListElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def openKeys(value: WithFalse[js.Array[String]]): this.type = set("openKeys", value.asInstanceOf[js.Any])
    
    inline def openKeysVarargs(value: String*): this.type = set("openKeys", js.Array(value*))
    
    inline def originCollapsed(value: Boolean): this.type = set("originCollapsed", value.asInstanceOf[js.Any])
    
    inline def overflowedIndicator(value: VdomNode): this.type = set("overflowedIndicator", value.rawNode.asInstanceOf[js.Any])
    
    inline def overflowedIndicatorNull: this.type = set("overflowedIndicator", null)
    
    inline def overflowedIndicatorPopupClassName(value: String): this.type = set("overflowedIndicatorPopupClassName", value.asInstanceOf[js.Any])
    
    inline def overflowedIndicatorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("overflowedIndicator", js.Array(value*))
    
    inline def overflowedIndicatorVdomElement(value: VdomElement): this.type = set("overflowedIndicator", value.rawElement.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def postMenuData(value: /* menusData */ js.UndefOr[js.Array[MenuDataItem]] => js.Array[MenuDataItem]): this.type = set("postMenuData", js.Any.fromFunction1(value))
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def rightContentRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, Node]]): this.type = set("rightContentRender", value.asInstanceOf[js.Any])
    
    inline def rightContentRenderFunction1(value: /* props */ HeaderViewProps => Node): this.type = set("rightContentRender", js.Any.fromFunction1(value))
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    inline def route(value: Route): this.type = set("route", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    
    inline def selectedKeysVarargs(value: String*): this.type = set("selectedKeys", js.Array(value*))
    
    inline def siderMenuType(value: sub | group): this.type = set("siderMenuType", value.asInstanceOf[js.Any])
    
    inline def siderWidth(value: Double): this.type = set("siderWidth", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def splitMenus(value: Boolean): this.type = set("splitMenus", value.asInstanceOf[js.Any])
    
    inline def staticContext(value: StaticContext): this.type = set("staticContext", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def subMenuCloseDelay(value: Double): this.type = set("subMenuCloseDelay", value.asInstanceOf[js.Any])
    
    inline def subMenuItemRender(
      value: WithFalse[
          js.Function3[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ Node, BaseMenuProps, Node]
        ]
    ): this.type = set("subMenuItemRender", value.asInstanceOf[js.Any])
    
    inline def subMenuItemRenderFunction3(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ Node, BaseMenuProps) => Node): this.type = set("subMenuItemRender", js.Any.fromFunction3(value))
    
    inline def subMenuOpenDelay(value: Double): this.type = set("subMenuOpenDelay", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def theme(value: MenuTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String | `false`): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def triggerSubMenuAction(value: TriggerSubMenuAction): this.type = set("triggerSubMenuAction", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SiderMenuProps & PrivateSiderMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
