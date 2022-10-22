package typingsJapgolly.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.oracleOraclejet.anon.LabelCloseIcon
import typingsJapgolly.oracleOraclejet.mod.baseComponent
import typingsJapgolly.oracleOraclejet.mod.baseComponentEventMap
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.ojdialogMod.ojDialog.Position
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`title-bar`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cancelBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.cancelBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dialogTitle
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dialogTitleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragAffordance
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.dragAffordanceChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.escape
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.flip
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.flipfit
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hide
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.icon
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialVisibility
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.initialVisibilityChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.left
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modality
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modalityChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modeless
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeClose
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojClose
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojFocus
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResize
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResizeStart
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.ojResizeStop
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.position
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.positionChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.resizable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.resizeBehavior
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.resizeBehaviorChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.role
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.roleChanged
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.show
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.translations
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojdialogMod {
  
  @js.native
  trait ojDialog
    extends StObject
       with baseComponent[ojDialogSettableProperties] {
    
    def addEventListener(
      `type`: cancelBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    def addEventListener(
      `type`: cancelBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: dragAffordanceChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    def addEventListener(
      `type`: dragAffordanceChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: initialVisibilityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    def addEventListener(
      `type`: initialVisibilityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(`type`: modalityChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    def addEventListener(
      `type`: modalityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: resizeBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]
    ): Unit = js.native
    def addEventListener(
      `type`: resizeBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dialogTitleChanged(`type`: dialogTitleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dialogTitleChanged(
      `type`: dialogTitleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(`type`: ojAnimateEnd, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(`type`: ojAnimateStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeClose(`type`: ojBeforeClose, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeClose(
      `type`: ojBeforeClose,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(`type`: ojBeforeOpen, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(`type`: ojClose, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojFocus(`type`: ojFocus, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojFocus(
      `type`: ojFocus,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(`type`: ojOpen, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(`type`: ojResize, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(
      `type`: ojResize,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStart(`type`: ojResizeStart, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStart(
      `type`: ojResizeStart,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStop(`type`: ojResizeStop, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStop(
      `type`: ojResizeStop,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_positionChanged(`type`: positionChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_positionChanged(
      `type`: positionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_roleChanged(`type`: roleChanged, listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_roleChanged(
      `type`: roleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, CustomEvent, Any],
      useCapture: Boolean
    ): Unit = js.native
    
    var cancelBehavior: icon | escape | none = js.native
    
    def close(): Unit = js.native
    
    var dialogTitle: String | Null = js.native
    
    var dragAffordance: `title-bar` | none = js.native
    
    @JSName("getProperty")
    def getProperty_cancelBehavior(property: cancelBehavior): icon | escape | none = js.native
    @JSName("getProperty")
    def getProperty_dialogTitle(property: dialogTitle): String | Null = js.native
    @JSName("getProperty")
    def getProperty_dragAffordance(property: dragAffordance): `title-bar` | none = js.native
    @JSName("getProperty")
    def getProperty_initialVisibility(property: initialVisibility): hide | show = js.native
    @JSName("getProperty")
    def getProperty_modality(property: modality): modal | modeless = js.native
    @JSName("getProperty")
    def getProperty_position(property: position): Position = js.native
    @JSName("getProperty")
    def getProperty_resizeBehavior(property: resizeBehavior): resizable | none = js.native
    @JSName("getProperty")
    def getProperty_role(property: role): String = js.native
    
    var initialVisibility: hide | show = js.native
    
    def isOpen(): Boolean = js.native
    
    var modality: modal | modeless = js.native
    
    var onCancelBehaviorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onDialogTitleChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onDragAffordanceChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onInitialVisibilityChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onModalityChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjAnimateEnd: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeClose: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjBeforeOpen: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjClose: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjFocus: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjOpen: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjResize: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjResizeStart: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onOjResizeStop: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onPositionChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onResizeBehaviorChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    var onRoleChanged: (js.Function1[CustomEvent, Any]) | Null = js.native
    
    def open(): Unit = js.native
    
    var position: Position = js.native
    
    var resizeBehavior: resizable | none = js.native
    
    var role: String = js.native
    
    def setProperties(properties: ojDialogSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: cancelBehavior, value: icon | escape | none): Unit = js.native
    def setProperty(property: dragAffordance, value: `title-bar` | none): Unit = js.native
    def setProperty(property: initialVisibility, value: hide | show): Unit = js.native
    def setProperty(property: modality, value: modal | modeless): Unit = js.native
    def setProperty(property: resizeBehavior, value: resizable | none): Unit = js.native
    @JSName("setProperty")
    def setProperty_dialogTitle(property: dialogTitle): Unit = js.native
    @JSName("setProperty")
    def setProperty_dialogTitle(property: dialogTitle, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_position(property: position, value: Position): Unit = js.native
    @JSName("setProperty")
    def setProperty_role(property: role, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelCloseIcon): Unit = js.native
    
    @JSName("translations")
    var translations_ojDialog: LabelCloseIcon = js.native
  }
  object ojDialog {
    
    // tslint:disable-next-line interface-over-type-literal
    trait Position extends StObject {
      
      var at: js.UndefOr[PositionAlign] = js.undefined
      
      var collision: js.UndefOr[flip | fit | flipfit | none] = js.undefined
      
      var my: js.UndefOr[PositionAlign] = js.undefined
      
      var of: js.UndefOr[String | PositionPoint] = js.undefined
      
      var offset: js.UndefOr[PositionPoint] = js.undefined
    }
    object Position {
      
      inline def apply(): Position = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Position]
      }
      
      extension [Self <: Position](x: Self) {
        
        inline def setAt(value: PositionAlign): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
        
        inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
        
        inline def setCollision(value: flip | fit | flipfit | none): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
        
        inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
        
        inline def setMy(value: PositionAlign): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
        
        inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
        
        inline def setOf(value: String | PositionPoint): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
        
        inline def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
        
        inline def setOffset(value: PositionPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait PositionAlign extends StObject {
      
      var horizontal: js.UndefOr[start | end | left | center | bottom] = js.undefined
      
      var vertical: js.UndefOr[top | bottom | center] = js.undefined
    }
    object PositionAlign {
      
      inline def apply(): PositionAlign = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionAlign]
      }
      
      extension [Self <: PositionAlign](x: Self) {
        
        inline def setHorizontal(value: start | end | left | center | bottom): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
        
        inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
        
        inline def setVertical(value: top | bottom | center): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
        
        inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    trait PositionPoint extends StObject {
      
      var x: js.UndefOr[Double] = js.undefined
      
      var y: js.UndefOr[Double] = js.undefined
    }
    object PositionPoint {
      
      inline def apply(): PositionPoint = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionPoint]
      }
      
      extension [Self <: PositionPoint](x: Self) {
        
        inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
    
    type ojAnimateEnd = CustomEvent
    
    type ojAnimateStart = CustomEvent
    
    type ojBeforeClose = CustomEvent
    
    type ojBeforeOpen = CustomEvent
    
    type ojClose = CustomEvent
    
    type ojFocus = CustomEvent
    
    type ojOpen = CustomEvent
    
    type ojResize = CustomEvent
    
    type ojResizeStart = CustomEvent
    
    type ojResizeStop = CustomEvent
  }
  
  trait ojDialogEventMap
    extends StObject
       with baseComponentEventMap[ojDialogSettableProperties] {
    
    var cancelBehaviorChanged: CustomEvent
    
    var dialogTitleChanged: CustomEvent
    
    var dragAffordanceChanged: CustomEvent
    
    var initialVisibilityChanged: CustomEvent
    
    var modalityChanged: CustomEvent
    
    var ojAnimateEnd: CustomEvent
    
    var ojAnimateStart: CustomEvent
    
    var ojBeforeClose: CustomEvent
    
    var ojBeforeOpen: CustomEvent
    
    var ojClose: CustomEvent
    
    var ojFocus: CustomEvent
    
    var ojOpen: CustomEvent
    
    var ojResize: CustomEvent
    
    var ojResizeStart: CustomEvent
    
    var ojResizeStop: CustomEvent
    
    var positionChanged: CustomEvent
    
    var resizeBehaviorChanged: CustomEvent
    
    var roleChanged: CustomEvent
  }
  object ojDialogEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      cancelBehaviorChanged: CustomEvent,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      dialogTitleChanged: CustomEvent,
      drag: DragEvent,
      dragAffordanceChanged: CustomEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      initialVisibilityChanged: CustomEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      modalityChanged: CustomEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: CustomEvent,
      ojAnimateStart: CustomEvent,
      ojBeforeClose: CustomEvent,
      ojBeforeOpen: CustomEvent,
      ojClose: CustomEvent,
      ojFocus: CustomEvent,
      ojOpen: CustomEvent,
      ojResize: CustomEvent,
      ojResizeStart: CustomEvent,
      ojResizeStop: CustomEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      positionChanged: CustomEvent,
      progress: ProgressEvent,
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      resizeBehaviorChanged: CustomEvent,
      roleChanged: CustomEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: CustomEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): ojDialogEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancelBehaviorChanged = cancelBehaviorChanged.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dialogTitleChanged = dialogTitleChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragAffordanceChanged = dragAffordanceChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], initialVisibilityChanged = initialVisibilityChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], modalityChanged = modalityChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeClose = ojBeforeClose.asInstanceOf[js.Any], ojBeforeOpen = ojBeforeOpen.asInstanceOf[js.Any], ojClose = ojClose.asInstanceOf[js.Any], ojFocus = ojFocus.asInstanceOf[js.Any], ojOpen = ojOpen.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], ojResizeStart = ojResizeStart.asInstanceOf[js.Any], ojResizeStop = ojResizeStop.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], positionChanged = positionChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], resizeBehaviorChanged = resizeBehaviorChanged.asInstanceOf[js.Any], roleChanged = roleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojDialogEventMap]
    }
    
    extension [Self <: ojDialogEventMap](x: Self) {
      
      inline def setCancelBehaviorChanged(value: CustomEvent): Self = StObject.set(x, "cancelBehaviorChanged", value.asInstanceOf[js.Any])
      
      inline def setDialogTitleChanged(value: CustomEvent): Self = StObject.set(x, "dialogTitleChanged", value.asInstanceOf[js.Any])
      
      inline def setDragAffordanceChanged(value: CustomEvent): Self = StObject.set(x, "dragAffordanceChanged", value.asInstanceOf[js.Any])
      
      inline def setInitialVisibilityChanged(value: CustomEvent): Self = StObject.set(x, "initialVisibilityChanged", value.asInstanceOf[js.Any])
      
      inline def setModalityChanged(value: CustomEvent): Self = StObject.set(x, "modalityChanged", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateEnd(value: CustomEvent): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      inline def setOjAnimateStart(value: CustomEvent): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeClose(value: CustomEvent): Self = StObject.set(x, "ojBeforeClose", value.asInstanceOf[js.Any])
      
      inline def setOjBeforeOpen(value: CustomEvent): Self = StObject.set(x, "ojBeforeOpen", value.asInstanceOf[js.Any])
      
      inline def setOjClose(value: CustomEvent): Self = StObject.set(x, "ojClose", value.asInstanceOf[js.Any])
      
      inline def setOjFocus(value: CustomEvent): Self = StObject.set(x, "ojFocus", value.asInstanceOf[js.Any])
      
      inline def setOjOpen(value: CustomEvent): Self = StObject.set(x, "ojOpen", value.asInstanceOf[js.Any])
      
      inline def setOjResize(value: CustomEvent): Self = StObject.set(x, "ojResize", value.asInstanceOf[js.Any])
      
      inline def setOjResizeStart(value: CustomEvent): Self = StObject.set(x, "ojResizeStart", value.asInstanceOf[js.Any])
      
      inline def setOjResizeStop(value: CustomEvent): Self = StObject.set(x, "ojResizeStop", value.asInstanceOf[js.Any])
      
      inline def setPositionChanged(value: CustomEvent): Self = StObject.set(x, "positionChanged", value.asInstanceOf[js.Any])
      
      inline def setResizeBehaviorChanged(value: CustomEvent): Self = StObject.set(x, "resizeBehaviorChanged", value.asInstanceOf[js.Any])
      
      inline def setRoleChanged(value: CustomEvent): Self = StObject.set(x, "roleChanged", value.asInstanceOf[js.Any])
    }
  }
  
  trait ojDialogSettableProperties
    extends StObject
       with baseComponentSettableProperties {
    
    var cancelBehavior: icon | escape | none
    
    var dialogTitle: String | Null
    
    var dragAffordance: `title-bar` | none
    
    var initialVisibility: hide | show
    
    var modality: modal | modeless
    
    var position: Position
    
    var resizeBehavior: resizable | none
    
    var role: String
    
    @JSName("translations")
    var translations_ojDialogSettableProperties: LabelCloseIcon
  }
  object ojDialogSettableProperties {
    
    inline def apply(
      cancelBehavior: icon | escape | none,
      dragAffordance: `title-bar` | none,
      initialVisibility: hide | show,
      modality: modal | modeless,
      position: Position,
      resizeBehavior: resizable | none,
      role: String,
      translations: LabelCloseIcon
    ): ojDialogSettableProperties = {
      val __obj = js.Dynamic.literal(cancelBehavior = cancelBehavior.asInstanceOf[js.Any], dragAffordance = dragAffordance.asInstanceOf[js.Any], initialVisibility = initialVisibility.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resizeBehavior = resizeBehavior.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], dialogTitle = null)
      __obj.asInstanceOf[ojDialogSettableProperties]
    }
    
    extension [Self <: ojDialogSettableProperties](x: Self) {
      
      inline def setCancelBehavior(value: icon | escape | none): Self = StObject.set(x, "cancelBehavior", value.asInstanceOf[js.Any])
      
      inline def setDialogTitle(value: String): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
      
      inline def setDialogTitleNull: Self = StObject.set(x, "dialogTitle", null)
      
      inline def setDragAffordance(value: `title-bar` | none): Self = StObject.set(x, "dragAffordance", value.asInstanceOf[js.Any])
      
      inline def setInitialVisibility(value: hide | show): Self = StObject.set(x, "initialVisibility", value.asInstanceOf[js.Any])
      
      inline def setModality(value: modal | modeless): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setResizeBehavior(value: resizable | none): Self = StObject.set(x, "resizeBehavior", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: LabelCloseIcon): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdialog.ojDialogSettableProperties> */
  trait ojDialogSettablePropertiesLenient
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var cancelBehavior: js.UndefOr[icon | escape | none] = js.undefined
    
    var dialogTitle: js.UndefOr[String | Null] = js.undefined
    
    var dragAffordance: js.UndefOr[`title-bar` | none] = js.undefined
    
    var initialVisibility: js.UndefOr[hide | show] = js.undefined
    
    var modality: js.UndefOr[modal | modeless] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var resizeBehavior: js.UndefOr[resizable | none] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var translations: js.UndefOr[LabelCloseIcon] = js.undefined
  }
  object ojDialogSettablePropertiesLenient {
    
    inline def apply(): ojDialogSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojDialogSettablePropertiesLenient]
    }
    
    extension [Self <: ojDialogSettablePropertiesLenient](x: Self) {
      
      inline def setCancelBehavior(value: icon | escape | none): Self = StObject.set(x, "cancelBehavior", value.asInstanceOf[js.Any])
      
      inline def setCancelBehaviorUndefined: Self = StObject.set(x, "cancelBehavior", js.undefined)
      
      inline def setDialogTitle(value: String): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
      
      inline def setDialogTitleNull: Self = StObject.set(x, "dialogTitle", null)
      
      inline def setDialogTitleUndefined: Self = StObject.set(x, "dialogTitle", js.undefined)
      
      inline def setDragAffordance(value: `title-bar` | none): Self = StObject.set(x, "dragAffordance", value.asInstanceOf[js.Any])
      
      inline def setDragAffordanceUndefined: Self = StObject.set(x, "dragAffordance", js.undefined)
      
      inline def setInitialVisibility(value: hide | show): Self = StObject.set(x, "initialVisibility", value.asInstanceOf[js.Any])
      
      inline def setInitialVisibilityUndefined: Self = StObject.set(x, "initialVisibility", js.undefined)
      
      inline def setModality(value: modal | modeless): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      inline def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setResizeBehavior(value: resizable | none): Self = StObject.set(x, "resizeBehavior", value.asInstanceOf[js.Any])
      
      inline def setResizeBehaviorUndefined: Self = StObject.set(x, "resizeBehavior", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTranslations(value: LabelCloseIcon): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
