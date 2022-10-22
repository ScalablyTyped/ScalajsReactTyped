package typingsJapgolly.reactWidgets.components

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
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactTransitionGroup.transitionMod.TransitionProps
import typingsJapgolly.reactWidgets.anon.DateButton
import typingsJapgolly.reactWidgets.anon.MoveBack
import typingsJapgolly.reactWidgets.anon.PartialCalendarPropsunkno
import typingsJapgolly.reactWidgets.anon.PartialDatePickerInputPro
import typingsJapgolly.reactWidgets.anon.PartialTimeInputProps
import typingsJapgolly.reactWidgets.esmLocalizationMod.DateFormats
import typingsJapgolly.reactWidgets.esmPopupMod.PopupProps
import typingsJapgolly.reactWidgets.esmSharedMod.InferFormat
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`additions removals`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`additions text`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`inline`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`removals additions`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`removals text`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`text additions`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.`text removals`
import typingsJapgolly.reactWidgets.reactWidgetsStrings.additions
import typingsJapgolly.reactWidgets.reactWidgetsStrings.all
import typingsJapgolly.reactWidgets.reactWidgetsStrings.ascending
import typingsJapgolly.reactWidgets.reactWidgetsStrings.assertive
import typingsJapgolly.reactWidgets.reactWidgetsStrings.both
import typingsJapgolly.reactWidgets.reactWidgetsStrings.copy
import typingsJapgolly.reactWidgets.reactWidgetsStrings.date
import typingsJapgolly.reactWidgets.reactWidgetsStrings.decimal
import typingsJapgolly.reactWidgets.reactWidgetsStrings.descending
import typingsJapgolly.reactWidgets.reactWidgetsStrings.dialog
import typingsJapgolly.reactWidgets.reactWidgetsStrings.email
import typingsJapgolly.reactWidgets.reactWidgetsStrings.execute
import typingsJapgolly.reactWidgets.reactWidgetsStrings.grammar
import typingsJapgolly.reactWidgets.reactWidgetsStrings.grid
import typingsJapgolly.reactWidgets.reactWidgetsStrings.horizontal
import typingsJapgolly.reactWidgets.reactWidgetsStrings.inherit
import typingsJapgolly.reactWidgets.reactWidgetsStrings.link
import typingsJapgolly.reactWidgets.reactWidgetsStrings.list
import typingsJapgolly.reactWidgets.reactWidgetsStrings.listbox
import typingsJapgolly.reactWidgets.reactWidgetsStrings.location
import typingsJapgolly.reactWidgets.reactWidgetsStrings.menu
import typingsJapgolly.reactWidgets.reactWidgetsStrings.milliseconds
import typingsJapgolly.reactWidgets.reactWidgetsStrings.minutes
import typingsJapgolly.reactWidgets.reactWidgetsStrings.mixed
import typingsJapgolly.reactWidgets.reactWidgetsStrings.move
import typingsJapgolly.reactWidgets.reactWidgetsStrings.no
import typingsJapgolly.reactWidgets.reactWidgetsStrings.none
import typingsJapgolly.reactWidgets.reactWidgetsStrings.numeric
import typingsJapgolly.reactWidgets.reactWidgetsStrings.off
import typingsJapgolly.reactWidgets.reactWidgetsStrings.on
import typingsJapgolly.reactWidgets.reactWidgetsStrings.other
import typingsJapgolly.reactWidgets.reactWidgetsStrings.page
import typingsJapgolly.reactWidgets.reactWidgetsStrings.polite
import typingsJapgolly.reactWidgets.reactWidgetsStrings.popup
import typingsJapgolly.reactWidgets.reactWidgetsStrings.removals
import typingsJapgolly.reactWidgets.reactWidgetsStrings.search
import typingsJapgolly.reactWidgets.reactWidgetsStrings.seconds
import typingsJapgolly.reactWidgets.reactWidgetsStrings.spelling
import typingsJapgolly.reactWidgets.reactWidgetsStrings.step
import typingsJapgolly.reactWidgets.reactWidgetsStrings.tel
import typingsJapgolly.reactWidgets.reactWidgetsStrings.text
import typingsJapgolly.reactWidgets.reactWidgetsStrings.time
import typingsJapgolly.reactWidgets.reactWidgetsStrings.tree
import typingsJapgolly.reactWidgets.reactWidgetsStrings.url
import typingsJapgolly.reactWidgets.reactWidgetsStrings.vertical
import typingsJapgolly.reactWidgets.reactWidgetsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DatePickerPropsRefAttributes2034774610[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
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
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def autoSave(value: String): this.type = set("autoSave", value.asInstanceOf[js.Any])
  
  inline def autofilling(value: Boolean): this.type = set("autofilling", value.asInstanceOf[js.Any])
  
  inline def calendarProps(value: PartialCalendarPropsunkno): this.type = set("calendarProps", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  
  inline def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
  
  inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
  
  inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
  
  inline def currentDate(value: js.Date): this.type = set("currentDate", value.asInstanceOf[js.Any])
  
  inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
  
  inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
  
  inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  
  inline def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def defaultValueNull: this.type = set("defaultValue", null)
  
  inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
  
  inline def dropUp(value: Boolean): this.type = set("dropUp", value.asInstanceOf[js.Any])
  
  inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
  
  inline def formats(value: DateFormats[InferFormat[Any]]): this.type = set("formats", value.asInstanceOf[js.Any])
  
  inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def includeTime(value: Boolean): this.type = set("includeTime", value.asInstanceOf[js.Any])
  
  inline def inlist(value: Any): this.type = set("inlist", value.asInstanceOf[js.Any])
  
  inline def inputMode(value: none | text | tel | url | email | numeric | decimal | search): this.type = set("inputMode", value.asInstanceOf[js.Any])
  
  inline def inputProps(value: PartialDatePickerInputPro): this.type = set("inputProps", value.asInstanceOf[js.Any])
  
  inline def is(value: String): this.type = set("is", value.asInstanceOf[js.Any])
  
  inline def itemID(value: String): this.type = set("itemID", value.asInstanceOf[js.Any])
  
  inline def itemProp(value: String): this.type = set("itemProp", value.asInstanceOf[js.Any])
  
  inline def itemRef(value: String): this.type = set("itemRef", value.asInstanceOf[js.Any])
  
  inline def itemScope(value: Boolean): this.type = set("itemScope", value.asInstanceOf[js.Any])
  
  inline def itemType(value: String): this.type = set("itemType", value.asInstanceOf[js.Any])
  
  inline def lang(value: String): this.type = set("lang", value.asInstanceOf[js.Any])
  
  inline def max(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
  
  inline def messages(value: js.UndefOr[MoveBack] & DateButton): this.type = set("messages", value.asInstanceOf[js.Any])
  
  inline def min(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def onAbort(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onAnimationEndCapture(value: ReactAnimationEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onAnimationEndCapture", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onAnimationIterationCapture(value: ReactAnimationEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onAnimationIterationCapture", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onAnimationStartCapture(value: ReactAnimationEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onAnimationStartCapture", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onAuxClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onAuxClickCapture(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onAuxClickCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onBeforeInput(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
  
  inline def onBlurCapture(value: ReactFocusEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onBlurCapture", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onCanPlay(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onCanPlayThrough(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onChange(value: (/* date */ js.UndefOr[js.Date | Null], /* rawValue */ String) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* date */ js.UndefOr[js.Date | Null], t1: /* rawValue */ String) => (value(t0, t1)).runNow()))
  
  inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onClickCapture(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onClickCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onContextMenu(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onContextMenuCapture(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onContextMenuCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onCopy(value: ReactClipboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onCurrentDateChange(value: Callback): this.type = set("onCurrentDateChange", value.toJsFn)
  
  inline def onCut(value: ReactClipboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDoubleClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDoubleClickCapture(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDoubleClickCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDrag(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragCapture(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragEnd(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragEndCapture(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragEndCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragEnter(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragEnterCapture(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragEnterCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragExit(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragExitCapture(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragExitCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragLeave(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragLeaveCapture(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragLeaveCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragOver(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragOverCapture(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragOverCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragStart(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDragStartCapture(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDragStartCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDrop(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDropCapture(value: ReactDragEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDropCapture", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onDurationChange(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onEmptied(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onEncrypted(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onEnded(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onError(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
  
  inline def onFocusCapture(value: ReactFocusEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onFocusCapture", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onGotPointerCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onGotPointerCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onGotPointerCaptureCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onGotPointerCaptureCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onInput(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onInvalid(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onKeyDown(value: /* e */ ReactKeyboardEventFrom[HTMLDivElement] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: /* e */ ReactKeyboardEventFrom[HTMLDivElement]) => value(t0).runNow()))
  
  inline def onKeyDownCapture(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onKeyDownCapture", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onKeyPress(value: /* e */ ReactKeyboardEventFrom[HTMLDivElement] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: /* e */ ReactKeyboardEventFrom[HTMLDivElement]) => value(t0).runNow()))
  
  inline def onKeyPressCapture(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onKeyPressCapture", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onKeyUpCapture(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onKeyUpCapture", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onLoad(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onLoadStart(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onLoadedData(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onLoadedMetadata(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onLostPointerCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onLostPointerCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onLostPointerCaptureCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onLostPointerCaptureCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseDown(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseDownCapture(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseDownCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseMove(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseMoveCapture(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseMoveCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseOut(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseOutCapture(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseOutCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseOver(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseOverCapture(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseOverCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseUp(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onMouseUpCapture(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onMouseUpCapture", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPaste(value: ReactClipboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPause(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPlay(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPlaying(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerCancel(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerCancelCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerDown(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerDownCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerEnter(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerEnterCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerLeave(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerLeaveCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerMove(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerMoveCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerOut(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerOutCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerOutCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerOver(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerOverCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerOverCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerUp(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onPointerUpCapture(value: ReactPointerEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onProgress(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onRateChange(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onReset(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onScroll(value: ReactUIEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onScrollCapture(value: ReactUIEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onScrollCapture", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onSeeked(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onSeeking(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onSelect(value: (/* date */ js.Date | Null, /* rawValue */ String) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: /* date */ js.Date | Null, t1: /* rawValue */ String) => (value(t0, t1)).runNow()))
  
  inline def onStalled(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onSubmit(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onSuspend(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTimeUpdate(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onToggle(value: /* isOpen */ Boolean => Callback): this.type = set("onToggle", js.Any.fromFunction1((t0: /* isOpen */ Boolean) => value(t0).runNow()))
  
  inline def onTouchCancel(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTouchCancelCapture(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchCancelCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTouchEnd(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTouchEndCapture(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTouchMove(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTouchMoveCapture(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchMoveCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTouchStart(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTouchStartCapture(value: ReactTouchEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTouchStartCapture", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onTransitionEndCapture(value: ReactTransitionEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onTransitionEndCapture", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onVolumeChange(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onWaiting(value: ReactEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onWheel(value: ReactWheelEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def onWheelCapture(value: ReactWheelEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onWheelCapture", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
  
  inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  inline def parse(
    value: String | (js.Function2[/* str */ String, /* localizer */ js.UndefOr[Any], js.UndefOr[js.Date]])
  ): this.type = set("parse", value.asInstanceOf[js.Any])
  
  inline def parseFunction2(value: (/* str */ String, /* localizer */ js.UndefOr[Any]) => js.UndefOr[js.Date]): this.type = set("parse", js.Any.fromFunction2(value))
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def popupComponent(value: ComponentType[PopupProps]): this.type = set("popupComponent", value.asInstanceOf[js.Any])
  
  inline def popupProps(value: js.Object): this.type = set("popupProps", value.asInstanceOf[js.Any])
  
  inline def popupTransition(value: ComponentType[TransitionProps[Unit]]): this.type = set("popupTransition", value.asInstanceOf[js.Any])
  
  inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
  
  inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
  
  inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
  
  inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  
  inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
  
  inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
  
  inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
  
  inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
  
  inline def selectIcon(value: VdomNode): this.type = set("selectIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def selectIconNull: this.type = set("selectIcon", null)
  
  inline def selectIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("selectIcon", js.Array(value*))
  
  inline def selectIconVdomElement(value: VdomElement): this.type = set("selectIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
  
  inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
  
  inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
  
  inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
  
  inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def timeInputProps(value: PartialTimeInputProps): this.type = set("timeInputProps", value.asInstanceOf[js.Any])
  
  inline def timePrecision(value: minutes | seconds | milliseconds): this.type = set("timePrecision", value.asInstanceOf[js.Any])
  
  inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
  
  inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
  
  inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
  
  inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueDisplayFormat(value: InferFormat[Any]): this.type = set("valueDisplayFormat", value.asInstanceOf[js.Any])
  
  inline def valueEditFormat(value: InferFormat[Any]): this.type = set("valueEditFormat", value.asInstanceOf[js.Any])
  
  inline def valueFormat(value: InferFormat[Any]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
  
  inline def valueNull: this.type = set("value", null)
  
  inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
}
