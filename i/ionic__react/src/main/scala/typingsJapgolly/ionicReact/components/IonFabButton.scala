package typingsJapgolly.ionicReact.components

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
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonFabButtonElement
import typingsJapgolly.ionicReact.anon.Pickanyshowdisabledactiva
import typingsJapgolly.ionicReact.distTypesModelsRouterOptionsMod.RouterOptions
import typingsJapgolly.ionicReact.ionicReactStrings.`additions removals`
import typingsJapgolly.ionicReact.ionicReactStrings.`additions text`
import typingsJapgolly.ionicReact.ionicReactStrings.`inline`
import typingsJapgolly.ionicReact.ionicReactStrings.`removals additions`
import typingsJapgolly.ionicReact.ionicReactStrings.`removals text`
import typingsJapgolly.ionicReact.ionicReactStrings.`text additions`
import typingsJapgolly.ionicReact.ionicReactStrings.`text removals`
import typingsJapgolly.ionicReact.ionicReactStrings.additions
import typingsJapgolly.ionicReact.ionicReactStrings.all
import typingsJapgolly.ionicReact.ionicReactStrings.ascending
import typingsJapgolly.ionicReact.ionicReactStrings.assertive
import typingsJapgolly.ionicReact.ionicReactStrings.back
import typingsJapgolly.ionicReact.ionicReactStrings.both
import typingsJapgolly.ionicReact.ionicReactStrings.copy
import typingsJapgolly.ionicReact.ionicReactStrings.date
import typingsJapgolly.ionicReact.ionicReactStrings.decimal
import typingsJapgolly.ionicReact.ionicReactStrings.descending
import typingsJapgolly.ionicReact.ionicReactStrings.dialog
import typingsJapgolly.ionicReact.ionicReactStrings.email
import typingsJapgolly.ionicReact.ionicReactStrings.execute
import typingsJapgolly.ionicReact.ionicReactStrings.forward
import typingsJapgolly.ionicReact.ionicReactStrings.grammar
import typingsJapgolly.ionicReact.ionicReactStrings.grid
import typingsJapgolly.ionicReact.ionicReactStrings.horizontal
import typingsJapgolly.ionicReact.ionicReactStrings.inherit
import typingsJapgolly.ionicReact.ionicReactStrings.link
import typingsJapgolly.ionicReact.ionicReactStrings.list
import typingsJapgolly.ionicReact.ionicReactStrings.listbox
import typingsJapgolly.ionicReact.ionicReactStrings.location
import typingsJapgolly.ionicReact.ionicReactStrings.menu
import typingsJapgolly.ionicReact.ionicReactStrings.mixed
import typingsJapgolly.ionicReact.ionicReactStrings.move
import typingsJapgolly.ionicReact.ionicReactStrings.no
import typingsJapgolly.ionicReact.ionicReactStrings.none
import typingsJapgolly.ionicReact.ionicReactStrings.numeric
import typingsJapgolly.ionicReact.ionicReactStrings.off
import typingsJapgolly.ionicReact.ionicReactStrings.on
import typingsJapgolly.ionicReact.ionicReactStrings.other
import typingsJapgolly.ionicReact.ionicReactStrings.page
import typingsJapgolly.ionicReact.ionicReactStrings.polite
import typingsJapgolly.ionicReact.ionicReactStrings.popup
import typingsJapgolly.ionicReact.ionicReactStrings.removals
import typingsJapgolly.ionicReact.ionicReactStrings.root
import typingsJapgolly.ionicReact.ionicReactStrings.search
import typingsJapgolly.ionicReact.ionicReactStrings.spelling
import typingsJapgolly.ionicReact.ionicReactStrings.step
import typingsJapgolly.ionicReact.ionicReactStrings.tel
import typingsJapgolly.ionicReact.ionicReactStrings.text
import typingsJapgolly.ionicReact.ionicReactStrings.time
import typingsJapgolly.ionicReact.ionicReactStrings.tree
import typingsJapgolly.ionicReact.ionicReactStrings.url
import typingsJapgolly.ionicReact.ionicReactStrings.vertical
import typingsJapgolly.ionicReact.ionicReactStrings.yes
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AriaRole
import typingsJapgolly.react.mod.Booleanish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IonFabButton {
  
  inline def apply(color: js.UndefOr[Any] & js.UndefOr[String]): Builder = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Pickanyshowdisabledactiva]))
  }
  
  @JSImport("@ionic/react", "IonFabButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLIonFabButtonElement] {
    
    inline def about(value: String): this.type = set("about", value.asInstanceOf[js.Any])
    
    inline def accessKey(value: String): this.type = set("accessKey", value.asInstanceOf[js.Any])
    
    inline def activated(value: Any): this.type = set("activated", value.asInstanceOf[js.Any])
    
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
    
    inline def `class`(value: String): this.type = set("class", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeIcon(value: Any): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    inline def contentEditable(value: Booleanish | inherit): this.type = set("contentEditable", value.asInstanceOf[js.Any])
    
    inline def contextMenu(value: String): this.type = set("contextMenu", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetInnerHTML(value: Html): this.type = set("dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def datatype(value: String): this.type = set("datatype", value.asInstanceOf[js.Any])
    
    inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double | js.Array[String]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: String*): this.type = set("defaultValue", js.Array(value*))
    
    inline def dir(value: String): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Any): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def download(value: Any): this.type = set("download", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Booleanish): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def href(value: Any): this.type = set("href", value.asInstanceOf[js.Any])
    
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
    
    inline def mode(value: Any): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onAbortCapture(value: Any): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
    
    inline def onAnimationEnd(value: ReactAnimationEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationEndCapture(value: Any): this.type = set("onAnimationEndCapture", value.asInstanceOf[js.Any])
    
    inline def onAnimationIteration(value: ReactAnimationEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationIterationCapture(value: Any): this.type = set("onAnimationIterationCapture", value.asInstanceOf[js.Any])
    
    inline def onAnimationStart(value: ReactAnimationEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onAnimationStartCapture(value: Any): this.type = set("onAnimationStartCapture", value.asInstanceOf[js.Any])
    
    inline def onAuxClick(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onAuxClickCapture(value: Any): this.type = set("onAuxClickCapture", value.asInstanceOf[js.Any])
    
    inline def onBeforeInput(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onBeforeInputCapture(value: Any): this.type = set("onBeforeInputCapture", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onBlurCapture(value: Any): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
    
    inline def onCanPlay(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onCanPlayCapture(value: Any): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    inline def onCanPlayThrough(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onCanPlayThroughCapture(value: Any): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    inline def onChange(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onChangeCapture(value: Any): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onClickCapture(value: Any): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
    
    inline def onCompositionEnd(value: ReactCompositionEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionEndCapture(value: Any): this.type = set("onCompositionEndCapture", value.asInstanceOf[js.Any])
    
    inline def onCompositionStart(value: ReactCompositionEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionStartCapture(value: Any): this.type = set("onCompositionStartCapture", value.asInstanceOf[js.Any])
    
    inline def onCompositionUpdate(value: ReactCompositionEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onCompositionUpdateCapture(value: Any): this.type = set("onCompositionUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def onContextMenu(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onContextMenuCapture(value: Any): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    inline def onCopy(value: ReactClipboardEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onCopyCapture(value: Any): this.type = set("onCopyCapture", value.asInstanceOf[js.Any])
    
    inline def onCut(value: ReactClipboardEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onCutCapture(value: Any): this.type = set("onCutCapture", value.asInstanceOf[js.Any])
    
    inline def onDoubleClick(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDoubleClickCapture(value: Any): this.type = set("onDoubleClickCapture", value.asInstanceOf[js.Any])
    
    inline def onDrag(value: ReactDragEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDragCapture(value: Any): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: ReactDragEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDragEndCapture(value: Any): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    inline def onDragEnter(value: ReactDragEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDragEnterCapture(value: Any): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onDragExit(value: ReactDragEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDragExitCapture(value: Any): this.type = set("onDragExitCapture", value.asInstanceOf[js.Any])
    
    inline def onDragLeave(value: ReactDragEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDragLeaveCapture(value: Any): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onDragOver(value: ReactDragEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDragOverCapture(value: Any): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    inline def onDragStart(value: ReactDragEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDragStartCapture(value: Any): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    inline def onDrop(value: ReactDragEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDropCapture(value: Any): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
    
    inline def onDurationChange(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onDurationChangeCapture(value: Any): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onEmptied(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onEmptiedCapture(value: Any): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    inline def onEncrypted(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onEncryptedCapture(value: Any): this.type = set("onEncryptedCapture", value.asInstanceOf[js.Any])
    
    inline def onEnded(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onEndedCapture(value: Any): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
    
    inline def onError(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onErrorCapture(value: Any): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onFocusCapture(value: Any): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
    
    inline def onGotPointerCapture(value: Any): this.type = set("onGotPointerCapture", value.asInstanceOf[js.Any])
    
    inline def onGotPointerCaptureCapture(value: Any): this.type = set("onGotPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def onInput(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onInputCapture(value: Any): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
    
    inline def onInvalid(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onInvalidCapture(value: Any): this.type = set("onInvalidCapture", value.asInstanceOf[js.Any])
    
    inline def onIonBlur(value: Any): this.type = set("onIonBlur", value.asInstanceOf[js.Any])
    
    inline def onIonFocus(value: Any): this.type = set("onIonFocus", value.asInstanceOf[js.Any])
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onKeyDownCapture(value: Any): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyPress(value: ReactKeyboardEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onKeyPressCapture(value: Any): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onKeyUpCapture(value: Any): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    inline def onLoad(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onLoadCapture(value: Any): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadStart(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onLoadStartCapture(value: Any): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadedData(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedDataCapture(value: Any): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    inline def onLoadedMetadata(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onLoadedMetadataCapture(value: Any): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    inline def onLostPointerCapture(value: Any): this.type = set("onLostPointerCapture", value.asInstanceOf[js.Any])
    
    inline def onLostPointerCaptureCapture(value: Any): this.type = set("onLostPointerCaptureCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onMouseDownCapture(value: Any): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onMouseMove(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onMouseMoveCapture(value: Any): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseOut(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOutCapture(value: Any): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseOver(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onMouseOverCapture(value: Any): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    inline def onMouseUp(value: ReactMouseEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onMouseUpCapture(value: Any): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPasteCapture(value: Any): this.type = set("onPasteCapture", value.asInstanceOf[js.Any])
    
    inline def onPause(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPauseCapture(value: Any): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
    
    inline def onPlay(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPlayCapture(value: Any): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
    
    inline def onPlaying(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPlayingCapture(value: Any): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerCancel(value: ReactPointerEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPointerCancelCapture(value: Any): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerDown(value: ReactPointerEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPointerDownCapture(value: Any): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerEnter(value: ReactPointerEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPointerEnterCapture(value: Any): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerLeave(value: ReactPointerEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPointerLeaveCapture(value: Any): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerMove(value: ReactPointerEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPointerMoveCapture(value: Any): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerOut(value: ReactPointerEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOutCapture(value: Any): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerOver(value: ReactPointerEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPointerOverCapture(value: Any): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    inline def onPointerUp(value: ReactPointerEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onPointerUpCapture(value: Any): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def onProgress(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onProgressCapture(value: Any): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
    
    inline def onRateChange(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onRateChangeCapture(value: Any): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onReset(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onResetCapture(value: Any): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
    
    inline def onScroll(value: ReactUIEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onScrollCapture(value: Any): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
    
    inline def onSeeked(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onSeekedCapture(value: Any): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    inline def onSeeking(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onSeekingCapture(value: Any): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    inline def onSelect(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onSelectCapture(value: Any): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
    
    inline def onStalled(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onStalledCapture(value: Any): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
    
    inline def onSubmit(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onSubmitCapture(value: Any): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    inline def onSuspend(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onSuspendCapture(value: Any): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    inline def onTimeUpdate(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onTimeUpdateCapture(value: Any): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onTouchCancelCapture(value: Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onTouchMoveCapture(value: Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onTouchStartCapture(value: Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    inline def onTransitionEnd(value: ReactTransitionEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onTransitionEndCapture(value: Any): this.type = set("onTransitionEndCapture", value.asInstanceOf[js.Any])
    
    inline def onVolumeChange(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onVolumeChangeCapture(value: Any): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    inline def onWaiting(value: ReactEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onWaitingCapture(value: Any): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    inline def onWheel(value: ReactWheelEventFrom[HTMLIonFabButtonElement & Element] => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLIonFabButtonElement & Element]) => value(t0).runNow()))
    
    inline def onWheelCapture(value: Any): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: String): this.type = set("prefix", value.asInstanceOf[js.Any])
    
    inline def property(value: String): this.type = set("property", value.asInstanceOf[js.Any])
    
    inline def radioGroup(value: String): this.type = set("radioGroup", value.asInstanceOf[js.Any])
    
    inline def rel(value: Any): this.type = set("rel", value.asInstanceOf[js.Any])
    
    inline def resource(value: String): this.type = set("resource", value.asInstanceOf[js.Any])
    
    inline def results(value: Double): this.type = set("results", value.asInstanceOf[js.Any])
    
    inline def role(value: AriaRole): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def routerAnimation(value: Any): this.type = set("routerAnimation", value.asInstanceOf[js.Any])
    
    inline def routerDirection(value: none | forward | back | root): this.type = set("routerDirection", value.asInstanceOf[js.Any])
    
    inline def routerLink(value: String): this.type = set("routerLink", value.asInstanceOf[js.Any])
    
    inline def routerOptions(value: RouterOptions): this.type = set("routerOptions", value.asInstanceOf[js.Any])
    
    inline def security(value: String): this.type = set("security", value.asInstanceOf[js.Any])
    
    inline def show(value: Any): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def size(value: Any): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def slot(value: String): this.type = set("slot", value.asInstanceOf[js.Any])
    
    inline def spellCheck(value: Booleanish): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    
    inline def suppressContentEditableWarning(value: Boolean): this.type = set("suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def suppressHydrationWarning(value: Boolean): this.type = set("suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def target(value: Any): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def translate(value: yes | no): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def translucent(value: Any): this.type = set("translucent", value.asInstanceOf[js.Any])
    
    inline def `type`(value: Any): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeof(value: String): this.type = set("typeof", value.asInstanceOf[js.Any])
    
    inline def unselectable(value: on | off): this.type = set("unselectable", value.asInstanceOf[js.Any])
    
    inline def vocab(value: String): this.type = set("vocab", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Pickanyshowdisabledactiva): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
