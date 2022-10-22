package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`12`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`13`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`14`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`15`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.views.XAbstractView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  */
  trait AttrChangeType extends StObject
  object AttrChangeType {
    
    inline def ADDITION: `1` = 1.asInstanceOf[`1`]
    
    inline def MODIFICATION: `0` = 0.asInstanceOf[`0`]
    
    inline def REMOVAL: `2` = 2.asInstanceOf[`2`]
  }
  
  trait EventException
    extends StObject
       with Exception {
    
    var code: Double
  }
  object EventException {
    
    inline def apply(Context: XInterface, Message: String, code: Double): EventException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventException]
    }
    
    extension [Self <: EventException](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`14`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`15`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`13`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`12`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  */
  trait EventType extends StObject
  object EventType {
    
    inline def DOMActivate: `2` = 2.asInstanceOf[`2`]
    
    inline def DOMAttrModified: `14` = 14.asInstanceOf[`14`]
    
    inline def DOMCharacterDataModified: `15` = 15.asInstanceOf[`15`]
    
    inline def DOMFocusIn: `0` = 0.asInstanceOf[`0`]
    
    inline def DOMFocusOut: `1` = 1.asInstanceOf[`1`]
    
    inline def DOMNodeInserted: `10` = 10.asInstanceOf[`10`]
    
    inline def DOMNodeInsertedIntoDocument: `13` = 13.asInstanceOf[`13`]
    
    inline def DOMNodeRemoved: `11` = 11.asInstanceOf[`11`]
    
    inline def DOMNodeRemovedFromDocument: `12` = 12.asInstanceOf[`12`]
    
    inline def DOMSubtreeModified: `9` = 9.asInstanceOf[`9`]
    
    inline def click: `3` = 3.asInstanceOf[`3`]
    
    inline def mousedown: `4` = 4.asInstanceOf[`4`]
    
    inline def mousemove: `7` = 7.asInstanceOf[`7`]
    
    inline def mouseout: `8` = 8.asInstanceOf[`8`]
    
    inline def mouseover: `6` = 6.asInstanceOf[`6`]
    
    inline def mouseup: `5` = 5.asInstanceOf[`5`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  */
  trait PhaseType extends StObject
  object PhaseType {
    
    inline def AT_TARGET: `1` = 1.asInstanceOf[`1`]
    
    inline def BUBBLING_PHASE: `2` = 2.asInstanceOf[`2`]
    
    inline def CAPTURING_PHASE: `0` = 0.asInstanceOf[`0`]
  }
  
  trait XDocumentEvent
    extends StObject
       with XInterface {
    
    def createEvent(eventType: String): XEvent
  }
  object XDocumentEvent {
    
    inline def apply(acquire: Callback, createEvent: String => XEvent, queryInterface: `type` => Any, release: Callback): XDocumentEvent = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createEvent = js.Any.fromFunction1(createEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XDocumentEvent]
    }
    
    extension [Self <: XDocumentEvent](x: Self) {
      
      inline def setCreateEvent(value: String => XEvent): Self = StObject.set(x, "createEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait XEvent
    extends StObject
       with XInterface {
    
    val Bubbles: Boolean
    
    val Cancelable: Boolean
    
    val CurrentTarget: XEventTarget
    
    val EventPhase: PhaseType
    
    val Target: XEventTarget
    
    val TimeStamp: Time
    
    val Type: String
    
    def getBubbles(): Boolean
    
    def getCancelable(): Boolean
    
    def getCurrentTarget(): XEventTarget
    
    def getEventPhase(): PhaseType
    
    def getTarget(): XEventTarget
    
    def getTimeStamp(): Time
    
    def getType(): String
    
    def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit
    
    def preventDefault(): Unit
    
    def stopPropagation(): Unit
  }
  object XEvent {
    
    inline def apply(
      Bubbles: Boolean,
      Cancelable: Boolean,
      CurrentTarget: XEventTarget,
      EventPhase: PhaseType,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      acquire: Callback,
      getBubbles: CallbackTo[Boolean],
      getCancelable: CallbackTo[Boolean],
      getCurrentTarget: CallbackTo[XEventTarget],
      getEventPhase: CallbackTo[PhaseType],
      getTarget: CallbackTo[XEventTarget],
      getTimeStamp: CallbackTo[Time],
      getType: CallbackTo[String],
      initEvent: (String, Boolean, Boolean) => Callback,
      preventDefault: Callback,
      queryInterface: `type` => Any,
      release: Callback,
      stopPropagation: Callback
    ): XEvent = {
      val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBubbles = getBubbles.toJsFn, getCancelable = getCancelable.toJsFn, getCurrentTarget = getCurrentTarget.toJsFn, getEventPhase = getEventPhase.toJsFn, getTarget = getTarget.toJsFn, getTimeStamp = getTimeStamp.toJsFn, getType = getType.toJsFn, initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), preventDefault = preventDefault.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, stopPropagation = stopPropagation.toJsFn)
      __obj.asInstanceOf[XEvent]
    }
    
    extension [Self <: XEvent](x: Self) {
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "Bubbles", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "Cancelable", value.asInstanceOf[js.Any])
      
      inline def setCurrentTarget(value: XEventTarget): Self = StObject.set(x, "CurrentTarget", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: PhaseType): Self = StObject.set(x, "EventPhase", value.asInstanceOf[js.Any])
      
      inline def setGetBubbles(value: CallbackTo[Boolean]): Self = StObject.set(x, "getBubbles", value.toJsFn)
      
      inline def setGetCancelable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getCancelable", value.toJsFn)
      
      inline def setGetCurrentTarget(value: CallbackTo[XEventTarget]): Self = StObject.set(x, "getCurrentTarget", value.toJsFn)
      
      inline def setGetEventPhase(value: CallbackTo[PhaseType]): Self = StObject.set(x, "getEventPhase", value.toJsFn)
      
      inline def setGetTarget(value: CallbackTo[XEventTarget]): Self = StObject.set(x, "getTarget", value.toJsFn)
      
      inline def setGetTimeStamp(value: CallbackTo[Time]): Self = StObject.set(x, "getTimeStamp", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setInitEvent(value: (String, Boolean, Boolean) => Callback): Self = StObject.set(x, "initEvent", js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTarget(value: XEventTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Time): Self = StObject.set(x, "TimeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait XEventListener
    extends StObject
       with XInterface {
    
    def handleEvent(evt: XEvent): Unit
  }
  object XEventListener {
    
    inline def apply(
      acquire: Callback,
      handleEvent: XEvent => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XEventListener = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, handleEvent = js.Any.fromFunction1((t0: XEvent) => handleEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XEventListener]
    }
    
    extension [Self <: XEventListener](x: Self) {
      
      inline def setHandleEvent(value: XEvent => Callback): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1((t0: XEvent) => value(t0).runNow()))
    }
  }
  
  trait XEventTarget
    extends StObject
       with XInterface {
    
    def addEventListener(eventType: String, listener: XEventListener, useCapture: Boolean): Unit
    
    def dispatchEvent(evt: XEvent): Boolean
    
    def removeEventListener(eventType: String, listener: XEventListener, useCapture: Boolean): Unit
  }
  object XEventTarget {
    
    inline def apply(
      acquire: Callback,
      addEventListener: (String, XEventListener, Boolean) => Callback,
      dispatchEvent: XEvent => Boolean,
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: (String, XEventListener, Boolean) => Callback
    ): XEventTarget = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction3((t0: String, t1: XEventListener, t2: Boolean) => (addEventListener(t0, t1, t2)).runNow()), dispatchEvent = js.Any.fromFunction1(dispatchEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction3((t0: String, t1: XEventListener, t2: Boolean) => (removeEventListener(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[XEventTarget]
    }
    
    extension [Self <: XEventTarget](x: Self) {
      
      inline def setAddEventListener(value: (String, XEventListener, Boolean) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3((t0: String, t1: XEventListener, t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setDispatchEvent(value: XEvent => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setRemoveEventListener(value: (String, XEventListener, Boolean) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3((t0: String, t1: XEventListener, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait XMouseEvent
    extends StObject
       with XUIEvent {
    
    val AltKey: Boolean
    
    val Button: Double
    
    val ClientX: Double
    
    val ClientY: Double
    
    val CtrlKey: Boolean
    
    val MetaKey: Boolean
    
    val RelatedTarget: XEventTarget
    
    val ScreenX: Double
    
    val ScreenY: Double
    
    val ShiftKey: Boolean
    
    def getAltKey(): Boolean
    
    def getButton(): Double
    
    def getClientX(): Double
    
    def getClientY(): Double
    
    def getCtrlKey(): Boolean
    
    def getMetaKey(): Boolean
    
    def getRelatedTarget(): XEventTarget
    
    def getScreenX(): Double
    
    def getScreenY(): Double
    
    def getShiftKey(): Boolean
    
    def initMouseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: XAbstractView,
      detailArg: Double,
      screenXArg: Double,
      screenYArg: Double,
      clientXArg: Double,
      clientYArg: Double,
      ctrlKeyArg: Boolean,
      altKeyArg: Boolean,
      shiftKeyArg: Boolean,
      metaKeyArg: Boolean,
      buttonArg: Double,
      relatedTargetArg: XEventTarget
    ): Unit
  }
  object XMouseEvent {
    
    inline def apply(
      AltKey: Boolean,
      Bubbles: Boolean,
      Button: Double,
      Cancelable: Boolean,
      ClientX: Double,
      ClientY: Double,
      CtrlKey: Boolean,
      CurrentTarget: XEventTarget,
      Detail: Double,
      EventPhase: PhaseType,
      MetaKey: Boolean,
      RelatedTarget: XEventTarget,
      ScreenX: Double,
      ScreenY: Double,
      ShiftKey: Boolean,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      View: XAbstractView,
      acquire: Callback,
      getAltKey: CallbackTo[Boolean],
      getBubbles: CallbackTo[Boolean],
      getButton: CallbackTo[Double],
      getCancelable: CallbackTo[Boolean],
      getClientX: CallbackTo[Double],
      getClientY: CallbackTo[Double],
      getCtrlKey: CallbackTo[Boolean],
      getCurrentTarget: CallbackTo[XEventTarget],
      getDetail: CallbackTo[Double],
      getEventPhase: CallbackTo[PhaseType],
      getMetaKey: CallbackTo[Boolean],
      getRelatedTarget: CallbackTo[XEventTarget],
      getScreenX: CallbackTo[Double],
      getScreenY: CallbackTo[Double],
      getShiftKey: CallbackTo[Boolean],
      getTarget: CallbackTo[XEventTarget],
      getTimeStamp: CallbackTo[Time],
      getType: CallbackTo[String],
      getView: CallbackTo[XAbstractView],
      initEvent: (String, Boolean, Boolean) => Callback,
      initMouseEvent: (String, Boolean, Boolean, XAbstractView, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, XEventTarget) => Callback,
      initUIEvent: (String, Boolean, Boolean, XAbstractView, Double) => Callback,
      preventDefault: Callback,
      queryInterface: `type` => Any,
      release: Callback,
      stopPropagation: Callback
    ): XMouseEvent = {
      val __obj = js.Dynamic.literal(AltKey = AltKey.asInstanceOf[js.Any], Bubbles = Bubbles.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], ClientX = ClientX.asInstanceOf[js.Any], ClientY = ClientY.asInstanceOf[js.Any], CtrlKey = CtrlKey.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], MetaKey = MetaKey.asInstanceOf[js.Any], RelatedTarget = RelatedTarget.asInstanceOf[js.Any], ScreenX = ScreenX.asInstanceOf[js.Any], ScreenY = ScreenY.asInstanceOf[js.Any], ShiftKey = ShiftKey.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAltKey = getAltKey.toJsFn, getBubbles = getBubbles.toJsFn, getButton = getButton.toJsFn, getCancelable = getCancelable.toJsFn, getClientX = getClientX.toJsFn, getClientY = getClientY.toJsFn, getCtrlKey = getCtrlKey.toJsFn, getCurrentTarget = getCurrentTarget.toJsFn, getDetail = getDetail.toJsFn, getEventPhase = getEventPhase.toJsFn, getMetaKey = getMetaKey.toJsFn, getRelatedTarget = getRelatedTarget.toJsFn, getScreenX = getScreenX.toJsFn, getScreenY = getScreenY.toJsFn, getShiftKey = getShiftKey.toJsFn, getTarget = getTarget.toJsFn, getTimeStamp = getTimeStamp.toJsFn, getType = getType.toJsFn, getView = getView.toJsFn, initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), initMouseEvent = js.Any.fromFunction15((t0: String, t1: Boolean, t2: Boolean, t3: XAbstractView, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double, t9: Boolean, t10: Boolean, t11: Boolean, t12: Boolean, t13: Double, t14: XEventTarget) => (initMouseEvent(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)).runNow()), initUIEvent = js.Any.fromFunction5((t0: String, t1: Boolean, t2: Boolean, t3: XAbstractView, t4: Double) => (initUIEvent(t0, t1, t2, t3, t4)).runNow()), preventDefault = preventDefault.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, stopPropagation = stopPropagation.toJsFn)
      __obj.asInstanceOf[XMouseEvent]
    }
    
    extension [Self <: XMouseEvent](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "AltKey", value.asInstanceOf[js.Any])
      
      inline def setButton(value: Double): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      inline def setClientX(value: Double): Self = StObject.set(x, "ClientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "ClientY", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "CtrlKey", value.asInstanceOf[js.Any])
      
      inline def setGetAltKey(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAltKey", value.toJsFn)
      
      inline def setGetButton(value: CallbackTo[Double]): Self = StObject.set(x, "getButton", value.toJsFn)
      
      inline def setGetClientX(value: CallbackTo[Double]): Self = StObject.set(x, "getClientX", value.toJsFn)
      
      inline def setGetClientY(value: CallbackTo[Double]): Self = StObject.set(x, "getClientY", value.toJsFn)
      
      inline def setGetCtrlKey(value: CallbackTo[Boolean]): Self = StObject.set(x, "getCtrlKey", value.toJsFn)
      
      inline def setGetMetaKey(value: CallbackTo[Boolean]): Self = StObject.set(x, "getMetaKey", value.toJsFn)
      
      inline def setGetRelatedTarget(value: CallbackTo[XEventTarget]): Self = StObject.set(x, "getRelatedTarget", value.toJsFn)
      
      inline def setGetScreenX(value: CallbackTo[Double]): Self = StObject.set(x, "getScreenX", value.toJsFn)
      
      inline def setGetScreenY(value: CallbackTo[Double]): Self = StObject.set(x, "getScreenY", value.toJsFn)
      
      inline def setGetShiftKey(value: CallbackTo[Boolean]): Self = StObject.set(x, "getShiftKey", value.toJsFn)
      
      inline def setInitMouseEvent(
        value: (String, Boolean, Boolean, XAbstractView, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, XEventTarget) => Callback
      ): Self = StObject.set(x, "initMouseEvent", js.Any.fromFunction15((t0: String, t1: Boolean, t2: Boolean, t3: XAbstractView, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double, t9: Boolean, t10: Boolean, t11: Boolean, t12: Boolean, t13: Double, t14: XEventTarget) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14)).runNow()))
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "MetaKey", value.asInstanceOf[js.Any])
      
      inline def setRelatedTarget(value: XEventTarget): Self = StObject.set(x, "RelatedTarget", value.asInstanceOf[js.Any])
      
      inline def setScreenX(value: Double): Self = StObject.set(x, "ScreenX", value.asInstanceOf[js.Any])
      
      inline def setScreenY(value: Double): Self = StObject.set(x, "ScreenY", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "ShiftKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait XMutationEvent
    extends StObject
       with XEvent {
    
    val AttrChange: AttrChangeType
    
    val AttrName: String
    
    val NewValue: String
    
    val PrevValue: String
    
    val RelatedNode: XNode
    
    def getAttrChange(): AttrChangeType
    
    def getAttrName(): String
    
    def getNewValue(): String
    
    def getPrevValue(): String
    
    def getRelatedNode(): XNode
    
    def initMutationEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      relatedNodeArg: XNode,
      prevValueArg: String,
      newValueArg: String,
      attrNameArg: String,
      attrChangeArg: AttrChangeType
    ): Unit
  }
  object XMutationEvent {
    
    inline def apply(
      AttrChange: AttrChangeType,
      AttrName: String,
      Bubbles: Boolean,
      Cancelable: Boolean,
      CurrentTarget: XEventTarget,
      EventPhase: PhaseType,
      NewValue: String,
      PrevValue: String,
      RelatedNode: XNode,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      acquire: Callback,
      getAttrChange: CallbackTo[AttrChangeType],
      getAttrName: CallbackTo[String],
      getBubbles: CallbackTo[Boolean],
      getCancelable: CallbackTo[Boolean],
      getCurrentTarget: CallbackTo[XEventTarget],
      getEventPhase: CallbackTo[PhaseType],
      getNewValue: CallbackTo[String],
      getPrevValue: CallbackTo[String],
      getRelatedNode: CallbackTo[XNode],
      getTarget: CallbackTo[XEventTarget],
      getTimeStamp: CallbackTo[Time],
      getType: CallbackTo[String],
      initEvent: (String, Boolean, Boolean) => Callback,
      initMutationEvent: (String, Boolean, Boolean, XNode, String, String, String, AttrChangeType) => Callback,
      preventDefault: Callback,
      queryInterface: `type` => Any,
      release: Callback,
      stopPropagation: Callback
    ): XMutationEvent = {
      val __obj = js.Dynamic.literal(AttrChange = AttrChange.asInstanceOf[js.Any], AttrName = AttrName.asInstanceOf[js.Any], Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], PrevValue = PrevValue.asInstanceOf[js.Any], RelatedNode = RelatedNode.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAttrChange = getAttrChange.toJsFn, getAttrName = getAttrName.toJsFn, getBubbles = getBubbles.toJsFn, getCancelable = getCancelable.toJsFn, getCurrentTarget = getCurrentTarget.toJsFn, getEventPhase = getEventPhase.toJsFn, getNewValue = getNewValue.toJsFn, getPrevValue = getPrevValue.toJsFn, getRelatedNode = getRelatedNode.toJsFn, getTarget = getTarget.toJsFn, getTimeStamp = getTimeStamp.toJsFn, getType = getType.toJsFn, initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), initMutationEvent = js.Any.fromFunction8((t0: String, t1: Boolean, t2: Boolean, t3: XNode, t4: String, t5: String, t6: String, t7: AttrChangeType) => (initMutationEvent(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), preventDefault = preventDefault.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, stopPropagation = stopPropagation.toJsFn)
      __obj.asInstanceOf[XMutationEvent]
    }
    
    extension [Self <: XMutationEvent](x: Self) {
      
      inline def setAttrChange(value: AttrChangeType): Self = StObject.set(x, "AttrChange", value.asInstanceOf[js.Any])
      
      inline def setAttrName(value: String): Self = StObject.set(x, "AttrName", value.asInstanceOf[js.Any])
      
      inline def setGetAttrChange(value: CallbackTo[AttrChangeType]): Self = StObject.set(x, "getAttrChange", value.toJsFn)
      
      inline def setGetAttrName(value: CallbackTo[String]): Self = StObject.set(x, "getAttrName", value.toJsFn)
      
      inline def setGetNewValue(value: CallbackTo[String]): Self = StObject.set(x, "getNewValue", value.toJsFn)
      
      inline def setGetPrevValue(value: CallbackTo[String]): Self = StObject.set(x, "getPrevValue", value.toJsFn)
      
      inline def setGetRelatedNode(value: CallbackTo[XNode]): Self = StObject.set(x, "getRelatedNode", value.toJsFn)
      
      inline def setInitMutationEvent(value: (String, Boolean, Boolean, XNode, String, String, String, AttrChangeType) => Callback): Self = StObject.set(x, "initMutationEvent", js.Any.fromFunction8((t0: String, t1: Boolean, t2: Boolean, t3: XNode, t4: String, t5: String, t6: String, t7: AttrChangeType) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
      
      inline def setNewValue(value: String): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
      
      inline def setPrevValue(value: String): Self = StObject.set(x, "PrevValue", value.asInstanceOf[js.Any])
      
      inline def setRelatedNode(value: XNode): Self = StObject.set(x, "RelatedNode", value.asInstanceOf[js.Any])
    }
  }
  
  trait XUIEvent
    extends StObject
       with XEvent {
    
    val Detail: Double
    
    val View: XAbstractView
    
    def getDetail(): Double
    
    def getView(): XAbstractView
    
    def initUIEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: XAbstractView,
      detailArg: Double
    ): Unit
  }
  object XUIEvent {
    
    inline def apply(
      Bubbles: Boolean,
      Cancelable: Boolean,
      CurrentTarget: XEventTarget,
      Detail: Double,
      EventPhase: PhaseType,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      View: XAbstractView,
      acquire: Callback,
      getBubbles: CallbackTo[Boolean],
      getCancelable: CallbackTo[Boolean],
      getCurrentTarget: CallbackTo[XEventTarget],
      getDetail: CallbackTo[Double],
      getEventPhase: CallbackTo[PhaseType],
      getTarget: CallbackTo[XEventTarget],
      getTimeStamp: CallbackTo[Time],
      getType: CallbackTo[String],
      getView: CallbackTo[XAbstractView],
      initEvent: (String, Boolean, Boolean) => Callback,
      initUIEvent: (String, Boolean, Boolean, XAbstractView, Double) => Callback,
      preventDefault: Callback,
      queryInterface: `type` => Any,
      release: Callback,
      stopPropagation: Callback
    ): XUIEvent = {
      val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBubbles = getBubbles.toJsFn, getCancelable = getCancelable.toJsFn, getCurrentTarget = getCurrentTarget.toJsFn, getDetail = getDetail.toJsFn, getEventPhase = getEventPhase.toJsFn, getTarget = getTarget.toJsFn, getTimeStamp = getTimeStamp.toJsFn, getType = getType.toJsFn, getView = getView.toJsFn, initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), initUIEvent = js.Any.fromFunction5((t0: String, t1: Boolean, t2: Boolean, t3: XAbstractView, t4: Double) => (initUIEvent(t0, t1, t2, t3, t4)).runNow()), preventDefault = preventDefault.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, stopPropagation = stopPropagation.toJsFn)
      __obj.asInstanceOf[XUIEvent]
    }
    
    extension [Self <: XUIEvent](x: Self) {
      
      inline def setDetail(value: Double): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
      
      inline def setGetDetail(value: CallbackTo[Double]): Self = StObject.set(x, "getDetail", value.toJsFn)
      
      inline def setGetView(value: CallbackTo[XAbstractView]): Self = StObject.set(x, "getView", value.toJsFn)
      
      inline def setInitUIEvent(value: (String, Boolean, Boolean, XAbstractView, Double) => Callback): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction5((t0: String, t1: Boolean, t2: Boolean, t3: XAbstractView, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setView(value: XAbstractView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    }
  }
}
