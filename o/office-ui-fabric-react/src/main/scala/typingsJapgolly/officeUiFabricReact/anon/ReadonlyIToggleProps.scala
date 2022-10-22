package typingsJapgolly.officeUiFabricReact.anon

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
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipProps
import typingsJapgolly.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggle
import typingsJapgolly.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggleStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsToggleToggleDottypesMod.IToggleStyles
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`additions removals`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`additions text`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`inline`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`removals additions`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`removals text`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`text additions`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`text removals`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.additions
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.all
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.ascending
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.assertive
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.both
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.checkbox
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.copy
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.date
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.decimal
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.descending
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.dialog
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.email
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.execute
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.grammar
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.grid
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.horizontal
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.link
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.list
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.listbox
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.location
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.menu
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.menuitemcheckbox
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.mixed
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.move
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.no
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.none
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.numeric
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.off
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.on
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.other
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.page
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.polite
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.popup
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.removals
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.search
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.spelling
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.step
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.switch
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.tel
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.text
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.time
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.tree
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.url
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.vertical
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.yes
import typingsJapgolly.react.anon.Html
import typingsJapgolly.react.mod.AnimationEventHandler
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.DragEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.react.mod.TransitionEventHandler
import typingsJapgolly.react.mod.UIEventHandler
import typingsJapgolly.react.mod.WheelEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libIcomponentasMod.IComponentAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Toggle/Toggle.types.IToggleProps> */
trait ReadonlyIToggleProps extends StObject {
  
  val about: js.UndefOr[String] = js.undefined
  
  val accessKey: js.UndefOr[String] = js.undefined
  
  val `aria-activedescendant`: js.UndefOr[String] = js.undefined
  
  val `aria-atomic`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.undefined
  
  val `aria-busy`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-checked`: js.UndefOr[Boolean | mixed] = js.undefined
  
  val `aria-colcount`: js.UndefOr[Double] = js.undefined
  
  val `aria-colindex`: js.UndefOr[Double] = js.undefined
  
  val `aria-colspan`: js.UndefOr[Double] = js.undefined
  
  val `aria-controls`: js.UndefOr[String] = js.undefined
  
  val `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.undefined
  
  val `aria-describedby`: js.UndefOr[String] = js.undefined
  
  val `aria-details`: js.UndefOr[String] = js.undefined
  
  val `aria-disabled`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.undefined
  
  val `aria-errormessage`: js.UndefOr[String] = js.undefined
  
  val `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-flowto`: js.UndefOr[String] = js.undefined
  
  val `aria-grabbed`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  
  val `aria-hidden`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.undefined
  
  val `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
  
  val `aria-label`: js.UndefOr[String] = js.undefined
  
  val `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  val `aria-level`: js.UndefOr[Double] = js.undefined
  
  val `aria-live`: js.UndefOr[off | assertive | polite] = js.undefined
  
  val `aria-modal`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-multiline`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-multiselectable`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-orientation`: js.UndefOr[horizontal | vertical] = js.undefined
  
  val `aria-owns`: js.UndefOr[String] = js.undefined
  
  val `aria-placeholder`: js.UndefOr[String] = js.undefined
  
  val `aria-posinset`: js.UndefOr[Double] = js.undefined
  
  val `aria-pressed`: js.UndefOr[Boolean | mixed] = js.undefined
  
  val `aria-readonly`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-relevant`: js.UndefOr[
    additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
  ] = js.undefined
  
  val `aria-required`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-roledescription`: js.UndefOr[String] = js.undefined
  
  val `aria-rowcount`: js.UndefOr[Double] = js.undefined
  
  val `aria-rowindex`: js.UndefOr[Double] = js.undefined
  
  val `aria-rowspan`: js.UndefOr[Double] = js.undefined
  
  val `aria-selected`: js.UndefOr[Booleanish] = js.undefined
  
  val `aria-setsize`: js.UndefOr[Double] = js.undefined
  
  val `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.undefined
  
  val `aria-valuemax`: js.UndefOr[Double] = js.undefined
  
  val `aria-valuemin`: js.UndefOr[Double] = js.undefined
  
  val `aria-valuenow`: js.UndefOr[Double] = js.undefined
  
  val `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  val ariaLabel: js.UndefOr[String] = js.undefined
  
  val as: js.UndefOr[IComponentAs[HTMLAttributes[HTMLElement]]] = js.undefined
  
  val autoCapitalize: js.UndefOr[String] = js.undefined
  
  val autoCorrect: js.UndefOr[String] = js.undefined
  
  val autoSave: js.UndefOr[String] = js.undefined
  
  val checked: js.UndefOr[Boolean] = js.undefined
  
  val children: js.UndefOr[Node] = js.undefined
  
  val className: js.UndefOr[String] = js.undefined
  
  val color: js.UndefOr[String] = js.undefined
  
  val componentRef: js.UndefOr[IRefObject[IToggle]] = js.undefined
  
  val contentEditable: js.UndefOr[Booleanish | inherit] = js.undefined
  
  val contextMenu: js.UndefOr[String] = js.undefined
  
  val dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  val datatype: js.UndefOr[String] = js.undefined
  
  val defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  val defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.undefined
  
  val dir: js.UndefOr[String] = js.undefined
  
  val disabled: js.UndefOr[Boolean] = js.undefined
  
  val draggable: js.UndefOr[Booleanish] = js.undefined
  
  val hidden: js.UndefOr[Boolean] = js.undefined
  
  val id: js.UndefOr[String] = js.undefined
  
  val inlineLabel: js.UndefOr[Boolean] = js.undefined
  
  val inlist: js.UndefOr[Any] = js.undefined
  
  val inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.undefined
  
  val is: js.UndefOr[String] = js.undefined
  
  val itemID: js.UndefOr[String] = js.undefined
  
  val itemProp: js.UndefOr[String] = js.undefined
  
  val itemRef: js.UndefOr[String] = js.undefined
  
  val itemScope: js.UndefOr[Boolean] = js.undefined
  
  val itemType: js.UndefOr[String] = js.undefined
  
  val keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  
  val label: js.UndefOr[String | Element] = js.undefined
  
  val lang: js.UndefOr[String] = js.undefined
  
  val offAriaLabel: js.UndefOr[String] = js.undefined
  
  val offText: js.UndefOr[String] = js.undefined
  
  val onAbort: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
  
  val onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
  
  val onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLElement]] = js.undefined
  
  val onAriaLabel: js.UndefOr[String] = js.undefined
  
  val onAuxClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onBeforeInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  
  val onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  
  val onCanPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onChange: js.UndefOr[
    js.Function2[
      /* event */ ReactMouseEventFrom[HTMLElement], 
      /* checked */ js.UndefOr[Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  
  val onChanged: js.UndefOr[js.Function1[/* checked */ Boolean, scala.Unit]] = js.undefined
  
  val onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
  
  val onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
  
  val onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLElement]] = js.undefined
  
  val onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onCopy: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
  
  val onCut: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
  
  val onDoubleClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onDrag: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  
  val onDragEnd: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  
  val onDragEnter: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  
  val onDragExit: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  
  val onDragLeave: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  
  val onDragOver: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  
  val onDragStart: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  
  val onDrop: js.UndefOr[DragEventHandler[HTMLElement]] = js.undefined
  
  val onDurationChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onEmptied: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onEncrypted: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onEnded: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onError: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
  
  val onInput: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  
  val onInvalid: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  
  val onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  
  val onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  
  val onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  
  val onLoad: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onLoadStart: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onLoadedData: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onMouseDown: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onMouseMove: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onMouseOut: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onMouseOver: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onMouseUp: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  val onPaste: js.UndefOr[ClipboardEventHandler[HTMLElement]] = js.undefined
  
  val onPause: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onPlay: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onPlaying: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onPointerCancel: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  
  val onPointerDown: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  
  val onPointerEnter: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  
  val onPointerLeave: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  
  val onPointerMove: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  
  val onPointerOut: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  
  val onPointerOver: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  
  val onPointerUp: js.UndefOr[PointerEventHandler[HTMLElement]] = js.undefined
  
  val onProgress: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onRateChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onReset: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  
  val onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.undefined
  
  val onSeeked: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onSeeking: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onSelect: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onStalled: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onSubmit: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  
  val onSuspend: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onText: js.UndefOr[String] = js.undefined
  
  val onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onTouchCancel: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  
  val onTouchEnd: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  
  val onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  
  val onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  
  val onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLElement]] = js.undefined
  
  val onVolumeChange: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onWaiting: js.UndefOr[ReactEventHandler[HTMLElement]] = js.undefined
  
  val onWheel: js.UndefOr[WheelEventHandler[HTMLElement]] = js.undefined
  
  val placeholder: js.UndefOr[String] = js.undefined
  
  val prefix: js.UndefOr[String] = js.undefined
  
  val property: js.UndefOr[String] = js.undefined
  
  val radioGroup: js.UndefOr[String] = js.undefined
  
  val resource: js.UndefOr[String] = js.undefined
  
  val results: js.UndefOr[Double] = js.undefined
  
  val role: js.UndefOr[checkbox | switch | menuitemcheckbox] = js.undefined
  
  val security: js.UndefOr[String] = js.undefined
  
  val slot: js.UndefOr[String] = js.undefined
  
  val spellCheck: js.UndefOr[Booleanish] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val styles: js.UndefOr[IStyleFunctionOrObject[IToggleStyleProps, IToggleStyles]] = js.undefined
  
  val suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined
  
  val suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined
  
  val tabIndex: js.UndefOr[Double] = js.undefined
  
  val theme: js.UndefOr[ITheme] = js.undefined
  
  val title: js.UndefOr[String] = js.undefined
  
  val translate: js.UndefOr[yes | no] = js.undefined
  
  val typeof: js.UndefOr[String] = js.undefined
  
  val unselectable: js.UndefOr[on | off] = js.undefined
  
  val vocab: js.UndefOr[String] = js.undefined
}
object ReadonlyIToggleProps {
  
  inline def apply(): ReadonlyIToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyIToggleProps]
  }
  
  extension [Self <: ReadonlyIToggleProps](x: Self) {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
    
    inline def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
    
    inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
    
    inline def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
    
    inline def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
    
    inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
    
    inline def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
    
    inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
    
    inline def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
    
    inline def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
    
    inline def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
    
    inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
    
    inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
    
    inline def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
    
    inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
    
    inline def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
    
    inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
    
    inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
    
    inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
    
    inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
    
    inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
    
    inline def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
    
    inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
    
    inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
    
    inline def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
    
    inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
    
    inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
    
    inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
    
    inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
    
    inline def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
    
    inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
    
    inline def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
    
    inline def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
    
    inline def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
    
    inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
    
    inline def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
    
    inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
    
    inline def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
    
    inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
    
    inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
    
    inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
    
    inline def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
    
    inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
    
    inline def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
    
    inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
    
    inline def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
    
    inline def `setAria-relevant`(
      value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
    ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
    
    inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
    
    inline def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
    
    inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
    
    inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
    
    inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
    
    inline def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
    
    inline def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
    
    inline def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
    
    inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
    
    inline def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
    
    inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
    
    inline def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
    
    inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
    
    inline def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
    
    inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
    
    inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
    
    inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
    
    inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
    
    inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAs(value: IComponentAs[HTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
    
    inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setComponentRef(value: IRefObject[IToggle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    inline def setComponentRefFunction1(value: /* ref */ IToggle | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IToggle | Null) => value(t0).runNow()))
    
    inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    inline def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    inline def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
    
    inline def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlineLabel(value: Boolean): Self = StObject.set(x, "inlineLabel", value.asInstanceOf[js.Any])
    
    inline def setInlineLabelUndefined: Self = StObject.set(x, "inlineLabel", js.undefined)
    
    inline def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
    
    inline def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
    
    inline def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
    
    inline def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
    
    inline def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
    
    inline def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
    
    inline def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
    
    inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
    
    inline def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
    
    inline def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
    
    inline def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
    
    inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
    
    inline def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
    
    inline def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
    
    inline def setLabel(value: String | Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOffAriaLabel(value: String): Self = StObject.set(x, "offAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setOffAriaLabelUndefined: Self = StObject.set(x, "offAriaLabel", js.undefined)
    
    inline def setOffText(value: String): Self = StObject.set(x, "offText", value.asInstanceOf[js.Any])
    
    inline def setOffTextUndefined: Self = StObject.set(x, "offText", js.undefined)
    
    inline def setOnAbort(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(
      value: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(
      value: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(
      value: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAriaLabel(value: String): Self = StObject.set(x, "onAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setOnAriaLabelUndefined: Self = StObject.set(x, "onAriaLabel", js.undefined)
    
    inline def setOnAuxClick(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(
      value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayThrough(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(
      value: (/* event */ ReactMouseEventFrom[HTMLElement], /* checked */ js.UndefOr[Boolean]) => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* checked */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnChanged(value: /* checked */ Boolean => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onChanged", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
    
    inline def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
    
    inline def setOnClick(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(
      value: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(
      value: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(
      value: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(
      value: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(
      value: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDoubleClick(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(
      value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEnd(
      value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(
      value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(
      value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(
      value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(
      value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(
      value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(
      value: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(
      value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnInput(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(
      value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(
      value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(
      value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadStart(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnMouseDown(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(
      value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(
      value: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(
      value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(
      value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(
      value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(
      value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(
      value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(
      value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(
      value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(
      value: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(value: ReactUIEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnText(value: String): Self = StObject.set(x, "onText", value.asInstanceOf[js.Any])
    
    inline def setOnTextUndefined: Self = StObject.set(x, "onText", js.undefined)
    
    inline def setOnTimeUpdate(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(
      value: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(
      value: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(
      value: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(
      value: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(
      value: ReactTransitionEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(
      value: ReactWheelEventFrom[HTMLElement & org.scalajs.dom.Element] => japgolly.scalajs.react.Callback
    ): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setRole(value: checkbox | switch | menuitemcheckbox): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
    
    inline def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyles(value: IStyleFunctionOrObject[IToggleStyleProps, IToggleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: IToggleStyleProps => DeepPartial[IToggleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
    
    inline def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
    
    inline def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    inline def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
    
    inline def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    
    inline def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
    
    inline def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
  }
}
