package typingsJapgolly.reactMdMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactMdButton.reactMdButtonStrings.`additions removals`
import typingsJapgolly.reactMdButton.reactMdButtonStrings.`additions text`
import typingsJapgolly.reactMdButton.reactMdButtonStrings.`inline`
import typingsJapgolly.reactMdButton.reactMdButtonStrings.`removals additions`
import typingsJapgolly.reactMdButton.reactMdButtonStrings.`removals text`
import typingsJapgolly.reactMdButton.reactMdButtonStrings.`text additions`
import typingsJapgolly.reactMdButton.reactMdButtonStrings.`text removals`
import typingsJapgolly.reactMdButton.reactMdButtonStrings.additions
import typingsJapgolly.reactMdButton.reactMdButtonStrings.all
import typingsJapgolly.reactMdButton.reactMdButtonStrings.ascending
import typingsJapgolly.reactMdButton.reactMdButtonStrings.assertive
import typingsJapgolly.reactMdButton.reactMdButtonStrings.both
import typingsJapgolly.reactMdButton.reactMdButtonStrings.button
import typingsJapgolly.reactMdButton.reactMdButtonStrings.copy
import typingsJapgolly.reactMdButton.reactMdButtonStrings.date
import typingsJapgolly.reactMdButton.reactMdButtonStrings.decimal
import typingsJapgolly.reactMdButton.reactMdButtonStrings.descending
import typingsJapgolly.reactMdButton.reactMdButtonStrings.dialog
import typingsJapgolly.reactMdButton.reactMdButtonStrings.email
import typingsJapgolly.reactMdButton.reactMdButtonStrings.execute
import typingsJapgolly.reactMdButton.reactMdButtonStrings.grammar
import typingsJapgolly.reactMdButton.reactMdButtonStrings.grid
import typingsJapgolly.reactMdButton.reactMdButtonStrings.horizontal
import typingsJapgolly.reactMdButton.reactMdButtonStrings.inherit
import typingsJapgolly.reactMdButton.reactMdButtonStrings.link
import typingsJapgolly.reactMdButton.reactMdButtonStrings.list
import typingsJapgolly.reactMdButton.reactMdButtonStrings.listbox
import typingsJapgolly.reactMdButton.reactMdButtonStrings.location
import typingsJapgolly.reactMdButton.reactMdButtonStrings.menu
import typingsJapgolly.reactMdButton.reactMdButtonStrings.mixed
import typingsJapgolly.reactMdButton.reactMdButtonStrings.move
import typingsJapgolly.reactMdButton.reactMdButtonStrings.no
import typingsJapgolly.reactMdButton.reactMdButtonStrings.none
import typingsJapgolly.reactMdButton.reactMdButtonStrings.numeric
import typingsJapgolly.reactMdButton.reactMdButtonStrings.off
import typingsJapgolly.reactMdButton.reactMdButtonStrings.on
import typingsJapgolly.reactMdButton.reactMdButtonStrings.other
import typingsJapgolly.reactMdButton.reactMdButtonStrings.page
import typingsJapgolly.reactMdButton.reactMdButtonStrings.polite
import typingsJapgolly.reactMdButton.reactMdButtonStrings.popup
import typingsJapgolly.reactMdButton.reactMdButtonStrings.removals
import typingsJapgolly.reactMdButton.reactMdButtonStrings.reset
import typingsJapgolly.reactMdButton.reactMdButtonStrings.search
import typingsJapgolly.reactMdButton.reactMdButtonStrings.spelling
import typingsJapgolly.reactMdButton.reactMdButtonStrings.step
import typingsJapgolly.reactMdButton.reactMdButtonStrings.submit
import typingsJapgolly.reactMdButton.reactMdButtonStrings.tel
import typingsJapgolly.reactMdButton.reactMdButtonStrings.text
import typingsJapgolly.reactMdButton.reactMdButtonStrings.time
import typingsJapgolly.reactMdButton.reactMdButtonStrings.tree
import typingsJapgolly.reactMdButton.reactMdButtonStrings.url
import typingsJapgolly.reactMdButton.reactMdButtonStrings.vertical
import typingsJapgolly.reactMdButton.reactMdButtonStrings.yes
import typingsJapgolly.reactMdButton.typesButtonThemeClassNamesMod.ButtonTheme
import typingsJapgolly.reactMdButton.typesButtonThemeClassNamesMod.ButtonThemeType
import typingsJapgolly.reactMdButton.typesButtonThemeClassNamesMod.ButtonType
import typingsJapgolly.reactMdButton.typesFabMod.FABPosition
import typingsJapgolly.reactMdButton.typesFabMod.FABProps
import typingsJapgolly.reactMdList.typesGetListItemHeightMod.ListItemHeight
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonPosition
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonType
import typingsJapgolly.reactMdMenu.anon.ReadonlyCalculateFixedPos
import typingsJapgolly.reactMdMenu.anon.ReadonlyMenuButtonIconRot
import typingsJapgolly.reactMdMenu.anon.ReadonlyOmitMenuWidgetPro
import typingsJapgolly.reactMdMenu.anon.ReadonlyOmitTextIconSpaci
import typingsJapgolly.reactMdMenu.anon.ReadonlyPropsWithRefOmitL
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.children
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.id
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.menuitem
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.onRequestClose
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.visible
import typingsJapgolly.reactMdMenu.typesTypesMod.RenderMenuAsSheet
import typingsJapgolly.reactMdPortal.typesGetContainerMod.PortalInto
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetPosition
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetProps
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetVerticalSize
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.MergableRippleHandlers
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import typingsJapgolly.reactMdUtils.typesPositioningTypesMod.PositionAnchor
import typingsJapgolly.reactMdUtils.typesTypesMod.PropsWithRef
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu {
  
  object DropdownMenuButtonProps {
    
    inline def apply(id: String): Builder = {
      val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactMdMenu.typesTypesMod.DropdownMenuButtonProps]))
    }
    
    @JSImport("@react-md/menu", "DropdownMenu")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      inline def anchor(value: PositionAnchor): this.type = set("anchor", value.asInstanceOf[js.Any])
      
      inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
      
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
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      inline def buttonChildren(value: VdomNode): this.type = set("buttonChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def buttonChildrenNull: this.type = set("buttonChildren", null)
      
      inline def buttonChildrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("buttonChildren", js.Array(value*))
      
      inline def buttonChildrenVdomElement(value: VdomElement): this.type = set("buttonChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def buttonType(value: ButtonType): this.type = set("buttonType", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classNames(value: CSSTransitionClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
      
      inline def closeOnResize(value: Boolean): this.type = set("closeOnResize", value.asInstanceOf[js.Any])
      
      inline def closeOnScroll(value: Boolean): this.type = set("closeOnScroll", value.asInstanceOf[js.Any])
      
      inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
      
      inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      inline def disableDropdownIcon(value: Boolean): this.type = set("disableDropdownIcon", value.asInstanceOf[js.Any])
      
      inline def disableEnterClick(value: Boolean): this.type = set("disableEnterClick", value.asInstanceOf[js.Any])
      
      inline def disableFocusOnMount(value: Boolean): this.type = set("disableFocusOnMount", value.asInstanceOf[js.Any])
      
      inline def disableFocusOnUnmount(value: Boolean): this.type = set("disableFocusOnUnmount", value.asInstanceOf[js.Any])
      
      inline def disablePressedFallback(value: Boolean): this.type = set("disablePressedFallback", value.asInstanceOf[js.Any])
      
      inline def disableProgrammaticRipple(value: Boolean): this.type = set("disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      inline def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def enablePressedAndRipple(value: Boolean): this.type = set("enablePressedAndRipple", value.asInstanceOf[js.Any])
      
      inline def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
      
      inline def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
      
      inline def fixedPositionOptions(value: ReadonlyCalculateFixedPos): this.type = set("fixedPositionOptions", value.asInstanceOf[js.Any])
      
      inline def floating(value: FABPosition): this.type = set("floating", value.asInstanceOf[js.Any])
      
      inline def floatingNull: this.type = set("floating", null)
      
      inline def floatingProps(value: PropsWithRef[FABProps, HTMLSpanElement]): this.type = set("floatingProps", value.asInstanceOf[js.Any])
      
      inline def form(value: String): this.type = set("form", value.asInstanceOf[js.Any])
      
      inline def formAction(value: String): this.type = set("formAction", value.asInstanceOf[js.Any])
      
      inline def formEncType(value: String): this.type = set("formEncType", value.asInstanceOf[js.Any])
      
      inline def formMethod(value: String): this.type = set("formMethod", value.asInstanceOf[js.Any])
      
      inline def formNoValidate(value: Boolean): this.type = set("formNoValidate", value.asInstanceOf[js.Any])
      
      inline def formTarget(value: String): this.type = set("formTarget", value.asInstanceOf[js.Any])
      
      inline def getFixedPositionOptions(value: CallbackTo[ReadonlyCalculateFixedPos]): this.type = set("getFixedPositionOptions", value.toJsFn)
      
      inline def handlers(value: MergableRippleHandlers[HTMLButtonElement]): this.type = set("handlers", value.asInstanceOf[js.Any])
      
      inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
      
      inline def icon(value: Element | Node): this.type = set("icon", value.asInstanceOf[js.Any])
      
      inline def iconAfter(value: Boolean): this.type = set("iconAfter", value.asInstanceOf[js.Any])
      
      inline def iconNull: this.type = set("icon", null)
      
      inline def iconRotatorProps(value: ReadonlyMenuButtonIconRot): this.type = set("iconRotatorProps", value.asInstanceOf[js.Any])
      
      inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
      
      inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
      
      inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      inline def listClassName(value: String): this.type = set("listClassName", value.asInstanceOf[js.Any])
      
      inline def listProps(value: ReadonlyPropsWithRefOmitL): this.type = set("listProps", value.asInstanceOf[js.Any])
      
      inline def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
      
      inline def menuClassName(value: String): this.type = set("menuClassName", value.asInstanceOf[js.Any])
      
      inline def menuLabel(value: String): this.type = set("menuLabel", value.asInstanceOf[js.Any])
      
      inline def menuProps(value: ReadonlyOmitMenuWidgetPro): this.type = set("menuProps", value.asInstanceOf[js.Any])
      
      inline def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
      
      inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      inline def onAbort(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAuxClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBeforeInput(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBlur(value: ReactFocusEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlay(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlayThrough(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onChange(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onContextMenu(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCopy(value: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCut(value: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDoubleClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrag(value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnd(value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnter(value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragExit(value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragLeave(value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragOver(value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragStart(value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrop(value: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDurationChange(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEmptied(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEncrypted(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEnded(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEnter(value: /* appearing */ Boolean => Callback): this.type = set("onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def onEntered(value: /* appearing */ Boolean => Callback): this.type = set("onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def onEntering(value: /* appearing */ Boolean => Callback): this.type = set("onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def onError(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onExit(value: Callback): this.type = set("onExit", value.toJsFn)
      
      inline def onExited(value: Callback): this.type = set("onExited", value.toJsFn)
      
      inline def onExiting(value: Callback): this.type = set("onExiting", value.toJsFn)
      
      inline def onFocus(value: ReactFocusEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInput(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInvalid(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoad(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadStart(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedData(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedMetadata(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseEnter(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseLeave(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseMove(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOut(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOver(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseUp(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPaste(value: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPause(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlay(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlaying(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerCancel(value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerDown(value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerEnter(value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerLeave(value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerMove(value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOut(value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOver(value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerUp(value: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onProgress(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onRateChange(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onReset(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onScroll(value: ReactUIEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeked(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeking(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSelect(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onStalled(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSubmit(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSuspend(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTimeUpdate(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchCancel(value: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchEnd(value: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchMove(value: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchStart(value: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onVolumeChange(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWaiting(value: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWheel(value: ReactWheelEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
      
      inline def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
      
      inline def portalIntoCallbackTo(value: CallbackTo[HTMLElement | Null]): this.type = set("portalInto", value.toJsFn)
      
      inline def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
      
      inline def portalIntoNull: this.type = set("portalInto", null)
      
      inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      inline def preventScroll(value: Boolean): this.type = set("preventScroll", value.asInstanceOf[js.Any])
      
      inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      inline def renderAsSheet(value: RenderMenuAsSheet): this.type = set("renderAsSheet", value.asInstanceOf[js.Any])
      
      inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      inline def rippleClassName(value: String): this.type = set("rippleClassName", value.asInstanceOf[js.Any])
      
      inline def rippleClassNames(value: CSSTransitionClassNames): this.type = set("rippleClassNames", value.asInstanceOf[js.Any])
      
      inline def rippleContainerClassName(value: String): this.type = set("rippleContainerClassName", value.asInstanceOf[js.Any])
      
      inline def rippleTimeout(value: TransitionTimeout): this.type = set("rippleTimeout", value.asInstanceOf[js.Any])
      
      inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
      
      inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      inline def sheetClassName(value: String): this.type = set("sheetClassName", value.asInstanceOf[js.Any])
      
      inline def sheetFooter(value: VdomNode): this.type = set("sheetFooter", value.rawNode.asInstanceOf[js.Any])
      
      inline def sheetFooterNull: this.type = set("sheetFooter", null)
      
      inline def sheetFooterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sheetFooter", js.Array(value*))
      
      inline def sheetFooterVdomElement(value: VdomElement): this.type = set("sheetFooter", value.rawElement.asInstanceOf[js.Any])
      
      inline def sheetHeader(value: VdomNode): this.type = set("sheetHeader", value.rawNode.asInstanceOf[js.Any])
      
      inline def sheetHeaderNull: this.type = set("sheetHeader", null)
      
      inline def sheetHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sheetHeader", js.Array(value*))
      
      inline def sheetHeaderVdomElement(value: VdomElement): this.type = set("sheetHeader", value.rawElement.asInstanceOf[js.Any])
      
      inline def sheetMenuProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("sheetMenuProps", value.asInstanceOf[js.Any])
      
      inline def sheetPosition(value: SheetPosition): this.type = set("sheetPosition", value.asInstanceOf[js.Any])
      
      inline def sheetProps(value: Omit[SheetProps, id | visible | onRequestClose | children]): this.type = set("sheetProps", value.asInstanceOf[js.Any])
      
      inline def sheetStyle(value: CSSProperties): this.type = set("sheetStyle", value.asInstanceOf[js.Any])
      
      inline def sheetVerticalSize(value: SheetVerticalSize): this.type = set("sheetVerticalSize", value.asInstanceOf[js.Any])
      
      inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def temporary(value: Boolean): this.type = set("temporary", value.asInstanceOf[js.Any])
      
      inline def textIconSpacingProps(value: ReadonlyOmitTextIconSpaci): this.type = set("textIconSpacingProps", value.asInstanceOf[js.Any])
      
      inline def theme(value: ButtonTheme): this.type = set("theme", value.asInstanceOf[js.Any])
      
      inline def themeType(value: ButtonThemeType): this.type = set("themeType", value.asInstanceOf[js.Any])
      
      inline def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      inline def `type`(value: button | reset | submit): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      inline def value(value: String | js.Array[String] | Double): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def valueVarargs(value: String*): this.type = set("value", js.Array(value*))
      
      inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactMdMenu.typesTypesMod.DropdownMenuButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object DropdownMenuItemProps {
    
    inline def apply(id: String): Builder = {
      val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactMdMenu.typesTypesMod.DropdownMenuItemProps]))
    }
    
    @JSImport("@react-md/menu", "DropdownMenu")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
      inline def anchor(value: PositionAnchor): this.type = set("anchor", value.asInstanceOf[js.Any])
      
      inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
      
      inline def `aria-activedescendant`(value: String): this.type = set("aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `aria-atomic`(value: Booleanish): this.type = set("aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `aria-autocomplete`(
        value: typingsJapgolly.reactMdMenu.reactMdMenuStrings.none | typingsJapgolly.reactMdMenu.reactMdMenuStrings.`inline` | typingsJapgolly.reactMdMenu.reactMdMenuStrings.list | typingsJapgolly.reactMdMenu.reactMdMenuStrings.both
      ): this.type = set("aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `aria-busy`(value: Booleanish): this.type = set("aria-busy", value.asInstanceOf[js.Any])
      
      inline def `aria-checked`(value: Boolean | typingsJapgolly.reactMdMenu.reactMdMenuStrings.mixed): this.type = set("aria-checked", value.asInstanceOf[js.Any])
      
      inline def `aria-colcount`(value: Double): this.type = set("aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `aria-colindex`(value: Double): this.type = set("aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `aria-colspan`(value: Double): this.type = set("aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
      
      inline def `aria-current`(
        value: Boolean | typingsJapgolly.reactMdMenu.reactMdMenuStrings.page | typingsJapgolly.reactMdMenu.reactMdMenuStrings.step | typingsJapgolly.reactMdMenu.reactMdMenuStrings.location | typingsJapgolly.reactMdMenu.reactMdMenuStrings.date | typingsJapgolly.reactMdMenu.reactMdMenuStrings.time
      ): this.type = set("aria-current", value.asInstanceOf[js.Any])
      
      inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
      
      inline def `aria-disabled`(value: Booleanish): this.type = set("aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `aria-dropeffect`(
        value: typingsJapgolly.reactMdMenu.reactMdMenuStrings.none | typingsJapgolly.reactMdMenu.reactMdMenuStrings.copy | typingsJapgolly.reactMdMenu.reactMdMenuStrings.execute | typingsJapgolly.reactMdMenu.reactMdMenuStrings.link | typingsJapgolly.reactMdMenu.reactMdMenuStrings.move | typingsJapgolly.reactMdMenu.reactMdMenuStrings.popup
      ): this.type = set("aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `aria-expanded`(value: Booleanish): this.type = set("aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `aria-flowto`(value: String): this.type = set("aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `aria-grabbed`(value: Booleanish): this.type = set("aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `aria-haspopup`(
        value: Boolean | typingsJapgolly.reactMdMenu.reactMdMenuStrings.menu | typingsJapgolly.reactMdMenu.reactMdMenuStrings.listbox | typingsJapgolly.reactMdMenu.reactMdMenuStrings.tree | typingsJapgolly.reactMdMenu.reactMdMenuStrings.grid | typingsJapgolly.reactMdMenu.reactMdMenuStrings.dialog
      ): this.type = set("aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `aria-hidden`(value: Booleanish): this.type = set("aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `aria-invalid`(
        value: Boolean | typingsJapgolly.reactMdMenu.reactMdMenuStrings.grammar | typingsJapgolly.reactMdMenu.reactMdMenuStrings.spelling
      ): this.type = set("aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `aria-keyshortcuts`(value: String): this.type = set("aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `aria-level`(value: Double): this.type = set("aria-level", value.asInstanceOf[js.Any])
      
      inline def `aria-live`(
        value: typingsJapgolly.reactMdMenu.reactMdMenuStrings.off | typingsJapgolly.reactMdMenu.reactMdMenuStrings.assertive | typingsJapgolly.reactMdMenu.reactMdMenuStrings.polite
      ): this.type = set("aria-live", value.asInstanceOf[js.Any])
      
      inline def `aria-modal`(value: Booleanish): this.type = set("aria-modal", value.asInstanceOf[js.Any])
      
      inline def `aria-multiline`(value: Booleanish): this.type = set("aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `aria-multiselectable`(value: Booleanish): this.type = set("aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `aria-orientation`(
        value: typingsJapgolly.reactMdMenu.reactMdMenuStrings.horizontal | typingsJapgolly.reactMdMenu.reactMdMenuStrings.vertical
      ): this.type = set("aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `aria-owns`(value: String): this.type = set("aria-owns", value.asInstanceOf[js.Any])
      
      inline def `aria-placeholder`(value: String): this.type = set("aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `aria-posinset`(value: Double): this.type = set("aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `aria-pressed`(value: Boolean | typingsJapgolly.reactMdMenu.reactMdMenuStrings.mixed): this.type = set("aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `aria-readonly`(value: Booleanish): this.type = set("aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `aria-relevant`(
        value: typingsJapgolly.reactMdMenu.reactMdMenuStrings.additions | (typingsJapgolly.reactMdMenu.reactMdMenuStrings.`additions removals`) | (typingsJapgolly.reactMdMenu.reactMdMenuStrings.`additions text`) | typingsJapgolly.reactMdMenu.reactMdMenuStrings.all | typingsJapgolly.reactMdMenu.reactMdMenuStrings.removals | (typingsJapgolly.reactMdMenu.reactMdMenuStrings.`removals additions`) | (typingsJapgolly.reactMdMenu.reactMdMenuStrings.`removals text`) | typingsJapgolly.reactMdMenu.reactMdMenuStrings.text | (typingsJapgolly.reactMdMenu.reactMdMenuStrings.`text additions`) | (typingsJapgolly.reactMdMenu.reactMdMenuStrings.`text removals`)
      ): this.type = set("aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `aria-required`(value: Booleanish): this.type = set("aria-required", value.asInstanceOf[js.Any])
      
      inline def `aria-roledescription`(value: String): this.type = set("aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `aria-rowcount`(value: Double): this.type = set("aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `aria-rowindex`(value: Double): this.type = set("aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `aria-rowspan`(value: Double): this.type = set("aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `aria-selected`(value: Booleanish): this.type = set("aria-selected", value.asInstanceOf[js.Any])
      
      inline def `aria-setsize`(value: Double): this.type = set("aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `aria-sort`(
        value: typingsJapgolly.reactMdMenu.reactMdMenuStrings.none | typingsJapgolly.reactMdMenu.reactMdMenuStrings.ascending | typingsJapgolly.reactMdMenu.reactMdMenuStrings.descending | typingsJapgolly.reactMdMenu.reactMdMenuStrings.other
      ): this.type = set("aria-sort", value.asInstanceOf[js.Any])
      
      inline def `aria-valuemax`(value: Double): this.type = set("aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `aria-valuemin`(value: Double): this.type = set("aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `aria-valuenow`(value: Double): this.type = set("aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `aria-valuetext`(value: String): this.type = set("aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def autoCapitalize(value: String): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
      
      inline def autoCorrect(value: String): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
      
      inline def buttonChildren(value: VdomNode): this.type = set("buttonChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def buttonChildrenNull: this.type = set("buttonChildren", null)
      
      inline def buttonChildrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("buttonChildren", js.Array(value*))
      
      inline def buttonChildrenVdomElement(value: VdomElement): this.type = set("buttonChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classNames(value: CSSTransitionClassNames): this.type = set("classNames", value.asInstanceOf[js.Any])
      
      inline def clickable(value: Boolean): this.type = set("clickable", value.asInstanceOf[js.Any])
      
      inline def closeOnResize(value: Boolean): this.type = set("closeOnResize", value.asInstanceOf[js.Any])
      
      inline def closeOnScroll(value: Boolean): this.type = set("closeOnScroll", value.asInstanceOf[js.Any])
      
      inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def contentEditable(value: Booleanish | typingsJapgolly.reactMdMenu.reactMdMenuStrings.inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
      
      inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      inline def disableDropdownIcon(value: Boolean): this.type = set("disableDropdownIcon", value.asInstanceOf[js.Any])
      
      inline def disableEnterClick(value: Boolean): this.type = set("disableEnterClick", value.asInstanceOf[js.Any])
      
      inline def disableFocusOnMount(value: Boolean): this.type = set("disableFocusOnMount", value.asInstanceOf[js.Any])
      
      inline def disableFocusOnUnmount(value: Boolean): this.type = set("disableFocusOnUnmount", value.asInstanceOf[js.Any])
      
      inline def disablePressedFallback(value: Boolean): this.type = set("disablePressedFallback", value.asInstanceOf[js.Any])
      
      inline def disableProgrammaticRipple(value: Boolean): this.type = set("disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      inline def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
      
      inline def disableSpacebarClick(value: Boolean): this.type = set("disableSpacebarClick", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def disabledOpacity(value: Boolean): this.type = set("disabledOpacity", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def enablePressedAndRipple(value: Boolean): this.type = set("enablePressedAndRipple", value.asInstanceOf[js.Any])
      
      inline def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
      
      inline def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
      
      inline def fixedPositionOptions(value: ReadonlyCalculateFixedPos): this.type = set("fixedPositionOptions", value.asInstanceOf[js.Any])
      
      inline def forceAddonWrap(value: Boolean): this.type = set("forceAddonWrap", value.asInstanceOf[js.Any])
      
      inline def getFixedPositionOptions(value: CallbackTo[ReadonlyCalculateFixedPos]): this.type = set("getFixedPositionOptions", value.toJsFn)
      
      inline def handlers(value: MergableRippleHandlers[HTMLLIElement]): this.type = set("handlers", value.asInstanceOf[js.Any])
      
      inline def height(value: ListItemHeight): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
      
      inline def iconRotatorProps(value: ReadonlyMenuButtonIconRot): this.type = set("iconRotatorProps", value.asInstanceOf[js.Any])
      
      inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      inline def inputMode(
        value: typingsJapgolly.reactMdMenu.reactMdMenuStrings.none | typingsJapgolly.reactMdMenu.reactMdMenuStrings.text | typingsJapgolly.reactMdMenu.reactMdMenuStrings.tel | typingsJapgolly.reactMdMenu.reactMdMenuStrings.url | typingsJapgolly.reactMdMenu.reactMdMenuStrings.email | typingsJapgolly.reactMdMenu.reactMdMenuStrings.numeric | typingsJapgolly.reactMdMenu.reactMdMenuStrings.decimal | typingsJapgolly.reactMdMenu.reactMdMenuStrings.search
      ): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
      inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
      
      inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
      
      inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
      
      inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
      
      inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
      
      inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
      
      inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
      
      inline def leftAddon(value: VdomNode): this.type = set("leftAddon", value.rawNode.asInstanceOf[js.Any])
      
      inline def leftAddonNull: this.type = set("leftAddon", null)
      
      inline def leftAddonPosition(value: ListItemAddonPosition): this.type = set("leftAddonPosition", value.asInstanceOf[js.Any])
      
      inline def leftAddonType(value: ListItemAddonType): this.type = set("leftAddonType", value.asInstanceOf[js.Any])
      
      inline def leftAddonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("leftAddon", js.Array(value*))
      
      inline def leftAddonVdomElement(value: VdomElement): this.type = set("leftAddon", value.rawElement.asInstanceOf[js.Any])
      
      inline def listClassName(value: String): this.type = set("listClassName", value.asInstanceOf[js.Any])
      
      inline def listProps(value: ReadonlyPropsWithRefOmitL): this.type = set("listProps", value.asInstanceOf[js.Any])
      
      inline def listStyle(value: CSSProperties): this.type = set("listStyle", value.asInstanceOf[js.Any])
      
      inline def menuClassName(value: String): this.type = set("menuClassName", value.asInstanceOf[js.Any])
      
      inline def menuLabel(value: String): this.type = set("menuLabel", value.asInstanceOf[js.Any])
      
      inline def menuProps(value: ReadonlyOmitMenuWidgetPro): this.type = set("menuProps", value.asInstanceOf[js.Any])
      
      inline def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
      
      inline def onAbort(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAuxClick(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBeforeInput(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBlur(value: ReactFocusEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlay(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlayThrough(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onChange(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onClick(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onContextMenu(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCopy(value: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCut(value: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDoubleClick(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrag(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnd(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnter(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragExit(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragLeave(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragOver(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragStart(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrop(value: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDurationChange(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEmptied(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEncrypted(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEnded(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEnter(value: /* appearing */ Boolean => Callback): this.type = set("onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def onEntered(value: /* appearing */ Boolean => Callback): this.type = set("onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def onEntering(value: /* appearing */ Boolean => Callback): this.type = set("onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def onError(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onExit(value: Callback): this.type = set("onExit", value.toJsFn)
      
      inline def onExited(value: Callback): this.type = set("onExited", value.toJsFn)
      
      inline def onExiting(value: Callback): this.type = set("onExiting", value.toJsFn)
      
      inline def onFocus(value: ReactFocusEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInput(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInvalid(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoad(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadStart(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedData(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedMetadata(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseEnter(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseLeave(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseMove(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOut(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOver(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseUp(value: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPaste(value: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPause(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlay(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlaying(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerCancel(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerDown(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerEnter(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerLeave(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerMove(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOut(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOver(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerUp(value: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onProgress(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onRateChange(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onReset(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onScroll(value: ReactUIEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeked(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeking(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSelect(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onStalled(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSubmit(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSuspend(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTimeUpdate(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchCancel(value: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchEnd(value: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchMove(value: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchStart(value: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onVolumeChange(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWaiting(value: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWheel(value: ReactWheelEventFrom[HTMLLIElement & org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLLIElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
      
      inline def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
      
      inline def portalIntoCallbackTo(value: CallbackTo[HTMLElement | Null]): this.type = set("portalInto", value.toJsFn)
      
      inline def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
      
      inline def portalIntoNull: this.type = set("portalInto", null)
      
      inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      inline def preventScroll(value: Boolean): this.type = set("preventScroll", value.asInstanceOf[js.Any])
      
      inline def primaryText(value: VdomNode): this.type = set("primaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def primaryTextNull: this.type = set("primaryText", null)
      
      inline def primaryTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("primaryText", js.Array(value*))
      
      inline def primaryTextVdomElement(value: VdomElement): this.type = set("primaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      inline def renderAsSheet(value: RenderMenuAsSheet): this.type = set("renderAsSheet", value.asInstanceOf[js.Any])
      
      inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
      
      inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
      
      inline def rightAddon(value: VdomNode): this.type = set("rightAddon", value.rawNode.asInstanceOf[js.Any])
      
      inline def rightAddonNull: this.type = set("rightAddon", null)
      
      inline def rightAddonPosition(value: ListItemAddonPosition): this.type = set("rightAddonPosition", value.asInstanceOf[js.Any])
      
      inline def rightAddonType(value: ListItemAddonType): this.type = set("rightAddonType", value.asInstanceOf[js.Any])
      
      inline def rightAddonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rightAddon", js.Array(value*))
      
      inline def rightAddonVdomElement(value: VdomElement): this.type = set("rightAddon", value.rawElement.asInstanceOf[js.Any])
      
      inline def rippleClassName(value: String): this.type = set("rippleClassName", value.asInstanceOf[js.Any])
      
      inline def rippleClassNames(value: CSSTransitionClassNames): this.type = set("rippleClassNames", value.asInstanceOf[js.Any])
      
      inline def rippleContainerClassName(value: String): this.type = set("rippleContainerClassName", value.asInstanceOf[js.Any])
      
      inline def rippleTimeout(value: TransitionTimeout): this.type = set("rippleTimeout", value.asInstanceOf[js.Any])
      
      inline def role(value: menuitem): this.type = set("role", value.asInstanceOf[js.Any])
      
      inline def secondaryText(value: VdomNode): this.type = set("secondaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def secondaryTextClassName(value: String): this.type = set("secondaryTextClassName", value.asInstanceOf[js.Any])
      
      inline def secondaryTextNull: this.type = set("secondaryText", null)
      
      inline def secondaryTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("secondaryText", js.Array(value*))
      
      inline def secondaryTextVdomElement(value: VdomElement): this.type = set("secondaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
      
      inline def sheetClassName(value: String): this.type = set("sheetClassName", value.asInstanceOf[js.Any])
      
      inline def sheetFooter(value: VdomNode): this.type = set("sheetFooter", value.rawNode.asInstanceOf[js.Any])
      
      inline def sheetFooterNull: this.type = set("sheetFooter", null)
      
      inline def sheetFooterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sheetFooter", js.Array(value*))
      
      inline def sheetFooterVdomElement(value: VdomElement): this.type = set("sheetFooter", value.rawElement.asInstanceOf[js.Any])
      
      inline def sheetHeader(value: VdomNode): this.type = set("sheetHeader", value.rawNode.asInstanceOf[js.Any])
      
      inline def sheetHeaderNull: this.type = set("sheetHeader", null)
      
      inline def sheetHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sheetHeader", js.Array(value*))
      
      inline def sheetHeaderVdomElement(value: VdomElement): this.type = set("sheetHeader", value.rawElement.asInstanceOf[js.Any])
      
      inline def sheetMenuProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("sheetMenuProps", value.asInstanceOf[js.Any])
      
      inline def sheetPosition(value: SheetPosition): this.type = set("sheetPosition", value.asInstanceOf[js.Any])
      
      inline def sheetProps(value: Omit[SheetProps, id | visible | onRequestClose | children]): this.type = set("sheetProps", value.asInstanceOf[js.Any])
      
      inline def sheetStyle(value: CSSProperties): this.type = set("sheetStyle", value.asInstanceOf[js.Any])
      
      inline def sheetVerticalSize(value: SheetVerticalSize): this.type = set("sheetVerticalSize", value.asInstanceOf[js.Any])
      
      inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def temporary(value: Boolean): this.type = set("temporary", value.asInstanceOf[js.Any])
      
      inline def textChildren(value: Boolean): this.type = set("textChildren", value.asInstanceOf[js.Any])
      
      inline def textClassName(value: String): this.type = set("textClassName", value.asInstanceOf[js.Any])
      
      inline def threeLines(value: Boolean): this.type = set("threeLines", value.asInstanceOf[js.Any])
      
      inline def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def translate(
        value: typingsJapgolly.reactMdMenu.reactMdMenuStrings.yes | typingsJapgolly.reactMdMenu.reactMdMenuStrings.no
      ): this.type = set("translate", value.asInstanceOf[js.Any])
      
      inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      inline def unselectable(
        value: typingsJapgolly.reactMdMenu.reactMdMenuStrings.on | typingsJapgolly.reactMdMenu.reactMdMenuStrings.off
      ): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactMdMenu.typesTypesMod.DropdownMenuItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
