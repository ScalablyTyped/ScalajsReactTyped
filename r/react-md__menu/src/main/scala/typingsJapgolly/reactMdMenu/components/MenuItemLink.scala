package typingsJapgolly.reactMdMenu.components

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
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributeAnchorTarget
import typingsJapgolly.react.mod.HTMLAttributeReferrerPolicy
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdList.reactMdListStrings.`additions removals`
import typingsJapgolly.reactMdList.reactMdListStrings.`additions text`
import typingsJapgolly.reactMdList.reactMdListStrings.`inline`
import typingsJapgolly.reactMdList.reactMdListStrings.`removals additions`
import typingsJapgolly.reactMdList.reactMdListStrings.`removals text`
import typingsJapgolly.reactMdList.reactMdListStrings.`text additions`
import typingsJapgolly.reactMdList.reactMdListStrings.`text removals`
import typingsJapgolly.reactMdList.reactMdListStrings.additions
import typingsJapgolly.reactMdList.reactMdListStrings.all
import typingsJapgolly.reactMdList.reactMdListStrings.ascending
import typingsJapgolly.reactMdList.reactMdListStrings.assertive
import typingsJapgolly.reactMdList.reactMdListStrings.both
import typingsJapgolly.reactMdList.reactMdListStrings.copy
import typingsJapgolly.reactMdList.reactMdListStrings.date
import typingsJapgolly.reactMdList.reactMdListStrings.decimal
import typingsJapgolly.reactMdList.reactMdListStrings.descending
import typingsJapgolly.reactMdList.reactMdListStrings.dialog
import typingsJapgolly.reactMdList.reactMdListStrings.email
import typingsJapgolly.reactMdList.reactMdListStrings.execute
import typingsJapgolly.reactMdList.reactMdListStrings.grammar
import typingsJapgolly.reactMdList.reactMdListStrings.grid
import typingsJapgolly.reactMdList.reactMdListStrings.horizontal
import typingsJapgolly.reactMdList.reactMdListStrings.inherit
import typingsJapgolly.reactMdList.reactMdListStrings.link
import typingsJapgolly.reactMdList.reactMdListStrings.list
import typingsJapgolly.reactMdList.reactMdListStrings.listbox
import typingsJapgolly.reactMdList.reactMdListStrings.location
import typingsJapgolly.reactMdList.reactMdListStrings.menu
import typingsJapgolly.reactMdList.reactMdListStrings.mixed
import typingsJapgolly.reactMdList.reactMdListStrings.move
import typingsJapgolly.reactMdList.reactMdListStrings.no
import typingsJapgolly.reactMdList.reactMdListStrings.none
import typingsJapgolly.reactMdList.reactMdListStrings.numeric
import typingsJapgolly.reactMdList.reactMdListStrings.off
import typingsJapgolly.reactMdList.reactMdListStrings.on
import typingsJapgolly.reactMdList.reactMdListStrings.other
import typingsJapgolly.reactMdList.reactMdListStrings.page
import typingsJapgolly.reactMdList.reactMdListStrings.polite
import typingsJapgolly.reactMdList.reactMdListStrings.popup
import typingsJapgolly.reactMdList.reactMdListStrings.removals
import typingsJapgolly.reactMdList.reactMdListStrings.search
import typingsJapgolly.reactMdList.reactMdListStrings.spelling
import typingsJapgolly.reactMdList.reactMdListStrings.step
import typingsJapgolly.reactMdList.reactMdListStrings.tel
import typingsJapgolly.reactMdList.reactMdListStrings.text
import typingsJapgolly.reactMdList.reactMdListStrings.time
import typingsJapgolly.reactMdList.reactMdListStrings.tree
import typingsJapgolly.reactMdList.reactMdListStrings.url
import typingsJapgolly.reactMdList.reactMdListStrings.vertical
import typingsJapgolly.reactMdList.reactMdListStrings.yes
import typingsJapgolly.reactMdList.typesGetListItemHeightMod.ListItemHeight
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonPosition
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonType
import typingsJapgolly.reactMdMenu.anon.ReadonlyHTMLAttributesHTM
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.menuitem
import typingsJapgolly.reactMdMenu.typesMenuItemLinkMod.MenuItemLinkProps
import typingsJapgolly.reactMdMenu.typesMenuItemLinkMod.MenuItemLinkWithComponentProps
import typingsJapgolly.reactMdStates.typesRipplesTypesMod.MergableRippleHandlers
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuItemLink {
  
  object MenuItemLinkPropsRefAttributes {
    
    @JSImport("@react-md/menu", "MenuItemLink")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[HTMLAnchorElement] {
      
      inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
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
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def component(value: ElementType): this.type = set("component", value.asInstanceOf[js.Any])
      
      inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
      
      inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      inline def disableEnterClick(value: Boolean): this.type = set("disableEnterClick", value.asInstanceOf[js.Any])
      
      inline def disablePressedFallback(value: Boolean): this.type = set("disablePressedFallback", value.asInstanceOf[js.Any])
      
      inline def disableProgrammaticRipple(value: Boolean): this.type = set("disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      inline def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
      
      inline def disableSpacebarClick(value: Boolean): this.type = set("disableSpacebarClick", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def download(value: Any): this.type = set("download", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def enablePressedAndRipple(value: Boolean): this.type = set("enablePressedAndRipple", value.asInstanceOf[js.Any])
      
      inline def forceAddonWrap(value: Boolean): this.type = set("forceAddonWrap", value.asInstanceOf[js.Any])
      
      inline def handlers(value: MergableRippleHandlers[HTMLAnchorElement]): this.type = set("handlers", value.asInstanceOf[js.Any])
      
      inline def height(value: ListItemHeight): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
      
      inline def hrefLang(value: String): this.type = set("hrefLang", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
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
      
      inline def liProps(value: ReadonlyHTMLAttributesHTM): this.type = set("liProps", value.asInstanceOf[js.Any])
      
      inline def media(value: String): this.type = set("media", value.asInstanceOf[js.Any])
      
      inline def onAbort(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAuxClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBeforeInput(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBlur(value: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlay(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlayThrough(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onContextMenu(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCopy(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCut(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDoubleClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrag(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnd(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnter(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragExit(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragLeave(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragOver(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragStart(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrop(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDurationChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEmptied(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEncrypted(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEnded(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onError(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocus(value: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInput(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInvalid(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoad(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadStart(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedData(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedMetadata(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseEnter(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseLeave(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseMove(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOut(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOver(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseUp(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPaste(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPause(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlay(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlaying(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerCancel(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerDown(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerEnter(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerLeave(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerMove(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOut(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOver(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerUp(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onProgress(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onRateChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onReset(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onScroll(value: ReactUIEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeked(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeking(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSelect(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onStalled(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSubmit(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSuspend(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTimeUpdate(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchCancel(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchEnd(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchMove(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchStart(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onVolumeChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWaiting(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWheel(value: ReactWheelEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def ping(value: String): this.type = set("ping", value.asInstanceOf[js.Any])
      
      inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      inline def primaryText(value: VdomNode): this.type = set("primaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def primaryTextNull: this.type = set("primaryText", null)
      
      inline def primaryTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("primaryText", js.Array(value*))
      
      inline def primaryTextVdomElement(value: VdomElement): this.type = set("primaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      inline def referrerPolicy(value: HTMLAttributeReferrerPolicy): this.type = set("referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
      
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
      
      inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def target(value: HTMLAttributeAnchorTarget): this.type = set("target", value.asInstanceOf[js.Any])
      
      inline def textChildren(value: Boolean): this.type = set("textChildren", value.asInstanceOf[js.Any])
      
      inline def textClassName(value: String): this.type = set("textClassName", value.asInstanceOf[js.Any])
      
      inline def threeLines(value: Boolean): this.type = set("threeLines", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: MenuItemLinkPropsRefAttributes.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MenuItemLinkProps & RefAttributes[HTMLAnchorElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object MenuItemLinkWithComponentPropsRefAttributes {
    
    inline def apply(component: ElementType): Builder = {
      val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[MenuItemLinkWithComponentProps & RefAttributes[HTMLAnchorElement]]))
    }
    
    @JSImport("@react-md/menu", "MenuItemLink")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[HTMLAnchorElement] {
      
      inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
      
      inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
      
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
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
      
      inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
      
      inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
      
      inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
      
      inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
      
      inline def disableEnterClick(value: Boolean): this.type = set("disableEnterClick", value.asInstanceOf[js.Any])
      
      inline def disablePressedFallback(value: Boolean): this.type = set("disablePressedFallback", value.asInstanceOf[js.Any])
      
      inline def disableProgrammaticRipple(value: Boolean): this.type = set("disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      inline def disableRipple(value: Boolean): this.type = set("disableRipple", value.asInstanceOf[js.Any])
      
      inline def disableSpacebarClick(value: Boolean): this.type = set("disableSpacebarClick", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def download(value: Any): this.type = set("download", value.asInstanceOf[js.Any])
      
      inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
      
      inline def enablePressedAndRipple(value: Boolean): this.type = set("enablePressedAndRipple", value.asInstanceOf[js.Any])
      
      inline def forceAddonWrap(value: Boolean): this.type = set("forceAddonWrap", value.asInstanceOf[js.Any])
      
      inline def handlers(value: MergableRippleHandlers[HTMLAnchorElement]): this.type = set("handlers", value.asInstanceOf[js.Any])
      
      inline def height(value: ListItemHeight): this.type = set("height", value.asInstanceOf[js.Any])
      
      inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
      
      inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
      
      inline def hrefLang(value: String): this.type = set("hrefLang", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
      
      inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
      
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
      
      inline def liProps(value: ReadonlyHTMLAttributesHTM): this.type = set("liProps", value.asInstanceOf[js.Any])
      
      inline def media(value: String): this.type = set("media", value.asInstanceOf[js.Any])
      
      inline def onAbort(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onAuxClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBeforeInput(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onBlur(value: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlay(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCanPlayThrough(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onContextMenu(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCopy(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onCut(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDoubleClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrag(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnd(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragEnter(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragExit(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragLeave(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragOver(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDragStart(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDrop(value: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onDurationChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEmptied(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEncrypted(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onEnded(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onError(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocus(value: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInput(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onInvalid(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoad(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadStart(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedData(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onLoadedMetadata(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseDown(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseEnter(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseLeave(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseMove(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOut(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseOver(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onMouseUp(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPaste(value: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPause(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlay(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPlaying(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerCancel(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerDown(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerEnter(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerLeave(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerMove(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOut(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerOver(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onPointerUp(value: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onProgress(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onRateChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onReset(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onScroll(value: ReactUIEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeked(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSeeking(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSelect(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onStalled(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSubmit(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onSuspend(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTimeUpdate(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchCancel(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchEnd(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchMove(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTouchStart(value: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onVolumeChange(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWaiting(value: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onWheel(value: ReactWheelEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def ping(value: String): this.type = set("ping", value.asInstanceOf[js.Any])
      
      inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
      
      inline def primaryText(value: VdomNode): this.type = set("primaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def primaryTextNull: this.type = set("primaryText", null)
      
      inline def primaryTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("primaryText", js.Array(value*))
      
      inline def primaryTextVdomElement(value: VdomElement): this.type = set("primaryText", value.rawElement.asInstanceOf[js.Any])
      
      inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
      
      inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
      
      inline def referrerPolicy(value: HTMLAttributeReferrerPolicy): this.type = set("referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def rel(value: String): this.type = set("rel", value.asInstanceOf[js.Any])
      
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
      
      inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
      
      inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
      
      inline def target(value: HTMLAttributeAnchorTarget): this.type = set("target", value.asInstanceOf[js.Any])
      
      inline def textChildren(value: Boolean): this.type = set("textChildren", value.asInstanceOf[js.Any])
      
      inline def textClassName(value: String): this.type = set("textClassName", value.asInstanceOf[js.Any])
      
      inline def threeLines(value: Boolean): this.type = set("threeLines", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
      
      inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
      
      inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
      
      inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: MenuItemLinkWithComponentProps & RefAttributes[HTMLAnchorElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
