package typingsJapgolly.materialUiCore.components

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
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.anon.PartialClassNameMapSnackbAnchorOriginBottomCenter
import typingsJapgolly.materialUiCore.anon.PartialClickAwayListenerP
import typingsJapgolly.materialUiCore.anon.PartialSnackbarContentPro
import typingsJapgolly.materialUiCore.anon.TransitionPropschildrenRe
import typingsJapgolly.materialUiCore.materialUiCoreStrings.`additions removals`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.`additions text`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.`inline`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.`removals additions`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.`removals text`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.`text additions`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.`text removals`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.additions
import typingsJapgolly.materialUiCore.materialUiCoreStrings.all
import typingsJapgolly.materialUiCore.materialUiCoreStrings.ascending
import typingsJapgolly.materialUiCore.materialUiCoreStrings.assertive
import typingsJapgolly.materialUiCore.materialUiCoreStrings.both
import typingsJapgolly.materialUiCore.materialUiCoreStrings.copy
import typingsJapgolly.materialUiCore.materialUiCoreStrings.date
import typingsJapgolly.materialUiCore.materialUiCoreStrings.decimal
import typingsJapgolly.materialUiCore.materialUiCoreStrings.descending
import typingsJapgolly.materialUiCore.materialUiCoreStrings.dialog
import typingsJapgolly.materialUiCore.materialUiCoreStrings.email
import typingsJapgolly.materialUiCore.materialUiCoreStrings.execute
import typingsJapgolly.materialUiCore.materialUiCoreStrings.grammar
import typingsJapgolly.materialUiCore.materialUiCoreStrings.grid
import typingsJapgolly.materialUiCore.materialUiCoreStrings.horizontal
import typingsJapgolly.materialUiCore.materialUiCoreStrings.inherit
import typingsJapgolly.materialUiCore.materialUiCoreStrings.link
import typingsJapgolly.materialUiCore.materialUiCoreStrings.list
import typingsJapgolly.materialUiCore.materialUiCoreStrings.listbox
import typingsJapgolly.materialUiCore.materialUiCoreStrings.location
import typingsJapgolly.materialUiCore.materialUiCoreStrings.menu
import typingsJapgolly.materialUiCore.materialUiCoreStrings.mixed
import typingsJapgolly.materialUiCore.materialUiCoreStrings.move
import typingsJapgolly.materialUiCore.materialUiCoreStrings.no
import typingsJapgolly.materialUiCore.materialUiCoreStrings.none
import typingsJapgolly.materialUiCore.materialUiCoreStrings.numeric
import typingsJapgolly.materialUiCore.materialUiCoreStrings.off
import typingsJapgolly.materialUiCore.materialUiCoreStrings.on
import typingsJapgolly.materialUiCore.materialUiCoreStrings.other
import typingsJapgolly.materialUiCore.materialUiCoreStrings.page
import typingsJapgolly.materialUiCore.materialUiCoreStrings.polite
import typingsJapgolly.materialUiCore.materialUiCoreStrings.popup
import typingsJapgolly.materialUiCore.materialUiCoreStrings.removals
import typingsJapgolly.materialUiCore.materialUiCoreStrings.search
import typingsJapgolly.materialUiCore.materialUiCoreStrings.spelling
import typingsJapgolly.materialUiCore.materialUiCoreStrings.step
import typingsJapgolly.materialUiCore.materialUiCoreStrings.tel
import typingsJapgolly.materialUiCore.materialUiCoreStrings.text
import typingsJapgolly.materialUiCore.materialUiCoreStrings.time
import typingsJapgolly.materialUiCore.materialUiCoreStrings.tree
import typingsJapgolly.materialUiCore.materialUiCoreStrings.url
import typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical
import typingsJapgolly.materialUiCore.materialUiCoreStrings.yes
import typingsJapgolly.materialUiCore.snackbarSnackbarMod.SnackbarCloseReason
import typingsJapgolly.materialUiCore.snackbarSnackbarMod.SnackbarOrigin
import typingsJapgolly.materialUiCore.snackbarSnackbarMod.SnackbarProps
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Snackbar {
  
  @JSImport("@material-ui/core", "Snackbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ClickAwayListenerProps(value: PartialClickAwayListenerP): this.type = set("ClickAwayListenerProps", value.asInstanceOf[js.Any])
    
    inline def ContentProps(value: PartialSnackbarContentPro): this.type = set("ContentProps", value.asInstanceOf[js.Any])
    
    inline def TransitionComponent(value: ComponentType[TransitionPropschildrenRe]): this.type = set("TransitionComponent", value.asInstanceOf[js.Any])
    
    inline def TransitionProps(value: typingsJapgolly.materialUiCore.transitionsTransitionMod.TransitionProps): this.type = set("TransitionProps", value.asInstanceOf[js.Any])
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def action(value: VdomNode): this.type = set("action", value.rawNode.asInstanceOf[js.Any])
    
    inline def actionNull: this.type = set("action", null)
    
    inline def actionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("action", js.Array(value*))
    
    inline def actionVdomElement(value: VdomElement): this.type = set("action", value.rawElement.asInstanceOf[js.Any])
    
    inline def anchorOrigin(value: SnackbarOrigin): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    
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
    
    inline def autoHideDuration(value: Double): this.type = set("autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def autoHideDurationNull: this.type = set("autoHideDuration", null)
    
    inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: PartialClassNameMapSnackbAnchorOriginBottomCenter): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disableWindowBlurListener(value: Boolean): this.type = set("disableWindowBlurListener", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
    
    inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
    
    inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
    
    inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
    
    inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
    
    inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
    
    inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
    
    inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
    
    inline def message(value: VdomNode): this.type = set("message", value.rawNode.asInstanceOf[js.Any])
    
    inline def messageNull: this.type = set("message", null)
    
    inline def messageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("message", js.Array(value*))
    
    inline def messageVdomElement(value: VdomElement): this.type = set("message", value.rawElement.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAuxClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onBeforeInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCanPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClose(
      value: (/* event */ ReactEventFrom[Any & org.scalajs.dom.Element], /* reason */ SnackbarCloseReason) => Callback
    ): this.type = set("onClose", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Any & org.scalajs.dom.Element], t1: /* reason */ SnackbarCloseReason) => (value(t0, t1)).runNow()))
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCopy(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCut(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDrag(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragEnd(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragExit(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDragStart(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDrop(value: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDurationChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEmptied(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEncrypted(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEnded(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEnter(value: Any): this.type = set("onEnter", value.asInstanceOf[js.Any])
    
    inline def onEntered(value: Any): this.type = set("onEntered", value.asInstanceOf[js.Any])
    
    inline def onEntering(value: Any): this.type = set("onEntering", value.asInstanceOf[js.Any])
    
    inline def onError(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onExit(value: Any): this.type = set("onExit", value.asInstanceOf[js.Any])
    
    inline def onExited(value: Any): this.type = set("onExited", value.asInstanceOf[js.Any])
    
    inline def onExiting(value: Any): this.type = set("onExiting", value.asInstanceOf[js.Any])
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onInput(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onInvalid(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoad(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadStart(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadedData(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[Any & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseOut(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPause(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPlay(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPlaying(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerCancel(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerOut(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerOver(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onProgress(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onRateChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onReset(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onScroll(value: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSeeked(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSeeking(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSelect(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onStalled(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSubmit(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onSuspend(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onWaiting(value: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def ref(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * Inlined react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps> * /
    {  defaultChecked :boolean | undefined,   defaultValue :string | number | std.ReadonlyArray<string> | undefined,   suppressContentEditableWarning :boolean | undefined,   suppressHydrationWarning :boolean | undefined,   accessKey :string | undefined,   className :string | undefined,   contentEditable :react.react.Booleanish | 'inherit' | undefined,   contextMenu :string | undefined,   dir :string | undefined,   draggable :react.react.Booleanish | undefined,   hidden :boolean | undefined,   id :string | undefined,   lang :string | undefined,   placeholder :string | undefined,   slot :string | undefined,   spellCheck :react.react.Booleanish | undefined,   style :react.react.CSSProperties | undefined,   tabIndex :number | undefined,   title :string | undefined,   translate :'yes' | 'no' | undefined,   radioGroup :string | undefined,   role :react.react.AriaRole | undefined,   about :string | undefined,   datatype :string | undefined,   inlist :any | undefined,   prefix :string | undefined,   property :string | undefined,   resource :string | undefined,   typeof :string | undefined,   vocab :string | undefined,   autoCapitalize :string | undefined,   autoCorrect :string | undefined,   autoSave :string | undefined,   color :string | undefined,   itemProp :string | undefined,   itemScope :boolean | undefined,   itemType :string | undefined,   itemID :string | undefined,   itemRef :string | undefined,   results :number | undefined,   security :string | undefined,   unselectable :'on' | 'off' | undefined,   inputMode :'none' | 'text' | 'tel' | 'url' | 'email' | 'numeric' | 'decimal' | 'search' | undefined,   is :string | undefined,   aria-activedescendant :string | undefined,   aria-atomic :react.react.Booleanish | undefined,   aria-autocomplete :'none' | 'inline' | 'list' | 'both' | undefined,   aria-busy :react.react.Booleanish | undefined,   aria-checked :boolean | 'false' | 'mixed' | 'true' | undefined,   aria-colcount :number | undefined,   aria-colindex :number | undefined,   aria-colspan :number | undefined,   aria-controls :string | undefined,   aria-current :boolean | 'false' | 'true' | 'page' | 'step' | 'location' | 'date' | 'time' | undefined,   aria-describedby :string | undefined,   aria-details :string | undefined,   aria-disabled :react.react.Booleanish | undefined,   aria-dropeffect :'none' | 'copy' | 'execute' | 'link' | 'move' | 'popup' | undefined,   aria-errormessage :string | undefined,   aria-expanded :react.react.Booleanish | undefined,   aria-flowto :string | undefined,   aria-grabbed :react.react.Booleanish | undefined,   aria-haspopup :boolean | 'false' | 'true' | 'menu' | 'listbox' | 'tree' | 'grid' | 'dialog' | undefined,   aria-hidden :react.react.Booleanish | undefined,   aria-invalid :boolean | 'false' | 'true' | 'grammar' | 'spelling' | undefined,   aria-keyshortcuts :string | undefined,   aria-label :string | undefined,   aria-labelledby :string | undefined,   aria-level :number | undefined,   aria-live :'off' | 'assertive' | 'polite' | undefined,   aria-modal :react.react.Booleanish | undefined,   aria-multiline :react.react.Booleanish | undefined,   aria-multiselectable :react.react.Booleanish | undefined,   aria-orientation :'horizontal' | 'vertical' | undefined,   aria-owns :string | undefined,   aria-placeholder :string | undefined,   aria-posinset :number | undefined,   aria-pressed :boolean | 'false' | 'mixed' | 'true' | undefined,   aria-readonly :react.react.Booleanish | undefined,   aria-relevant :'additions' | 'additions removals' | 'additions text' | 'all' | 'removals' | 'removals additions' | 'removals text' | 'text' | 'text additions' | 'text removals' | undefined,   aria-required :react.react.Booleanish | undefined,   aria-roledescription :string | undefined,   aria-rowcount :number | undefined,   aria-rowindex :number | undefined,   aria-rowspan :number | undefined,   aria-selected :react.react.Booleanish | undefined,   aria-setsize :number | undefined,   aria-sort :'none' | 'ascending' | 'descending' | 'other' | undefined,   aria-valuemax :number | undefined,   aria-valuemin :number | undefined,   aria-valuenow :number | undefined,   aria-valuetext :string | undefined,   children :react.react.ReactNode | undefined,   dangerouslySetInnerHTML :react.anon.Html | undefined,   onCopy :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onCut :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onPaste :react.react.ClipboardEventHandler<std.HTMLDivElement> | undefined,   onCompositionEnd :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onCompositionStart :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onCompositionUpdate :react.react.CompositionEventHandler<std.HTMLDivElement> | undefined,   onFocus :react.react.FocusEventHandler<std.HTMLDivElement> | undefined,   onBlur :react.react.FocusEventHandler<std.HTMLDivElement> | undefined,   onChange :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onBeforeInput :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onInput :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onReset :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onSubmit :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onInvalid :react.react.FormEventHandler<std.HTMLDivElement> | undefined,   onLoad :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onError :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onKeyDown :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onKeyPress :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onKeyUp :react.react.KeyboardEventHandler<std.HTMLDivElement> | undefined,   onAbort :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onCanPlay :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onCanPlayThrough :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onDurationChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEmptied :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEncrypted :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onEnded :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadedData :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadedMetadata :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onLoadStart :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPause :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPlay :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onPlaying :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onProgress :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onRateChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSeeked :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSeeking :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onStalled :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onSuspend :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onTimeUpdate :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onVolumeChange :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onWaiting :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onAuxClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onContextMenu :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onDoubleClick :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onDrag :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragEnd :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragEnter :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragExit :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragLeave :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragOver :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDragStart :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onDrop :react.react.DragEventHandler<std.HTMLDivElement> | undefined,   onMouseDown :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseEnter :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseLeave :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseMove :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseOut :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseOver :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onMouseUp :react.react.MouseEventHandler<std.HTMLDivElement> | undefined,   onSelect :react.react.ReactEventHandler<std.HTMLDivElement> | undefined,   onTouchCancel :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchEnd :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchMove :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onTouchStart :react.react.TouchEventHandler<std.HTMLDivElement> | undefined,   onPointerDown :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerMove :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerUp :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerCancel :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerEnter :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerLeave :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerOver :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onPointerOut :react.react.PointerEventHandler<std.HTMLDivElement> | undefined,   onScroll :react.react.UIEventHandler<std.HTMLDivElement> | undefined,   onWheel :react.react.WheelEventHandler<std.HTMLDivElement> | undefined,   onAnimationStart :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onAnimationEnd :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onAnimationIteration :react.react.AnimationEventHandler<std.HTMLDivElement> | undefined,   onTransitionEnd :react.react.TransitionEventHandler<std.HTMLDivElement> | undefined,   onExit :any | undefined,   onExited :any | undefined,   onEnter :any | undefined,   onExiting :any | undefined,   onEntered :any | undefined,   onEntering :any | undefined} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def resumeHideDuration(value: Double): this.type = set("resumeHideDuration", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def transitionDuration(value: Any): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Snackbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SnackbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
