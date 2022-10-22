package typingsJapgolly.materialDialog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.materialBase.typesMod.SpecificWindowEventListener
import typingsJapgolly.materialBase.typesMod.WindowEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ACTIONATTRIBUTE extends StObject {
    
    var ACTION_ATTRIBUTE: String
    
    var BUTTON_DEFAULT_ATTRIBUTE: String
    
    var BUTTON_SELECTOR: String
    
    var CLOSED_EVENT: String
    
    var CLOSE_ACTION: String
    
    var CLOSING_EVENT: String
    
    var CONTAINER_SELECTOR: String
    
    var CONTENT_SELECTOR: String
    
    var DESTROY_ACTION: String
    
    var INITIAL_FOCUS_ATTRIBUTE: String
    
    var OPENED_EVENT: String
    
    var OPENING_EVENT: String
    
    var SCRIM_SELECTOR: String
    
    var SUPPRESS_DEFAULT_PRESS_SELECTOR: String
    
    var SURFACE_SELECTOR: String
  }
  object ACTIONATTRIBUTE {
    
    inline def apply(
      ACTION_ATTRIBUTE: String,
      BUTTON_DEFAULT_ATTRIBUTE: String,
      BUTTON_SELECTOR: String,
      CLOSED_EVENT: String,
      CLOSE_ACTION: String,
      CLOSING_EVENT: String,
      CONTAINER_SELECTOR: String,
      CONTENT_SELECTOR: String,
      DESTROY_ACTION: String,
      INITIAL_FOCUS_ATTRIBUTE: String,
      OPENED_EVENT: String,
      OPENING_EVENT: String,
      SCRIM_SELECTOR: String,
      SUPPRESS_DEFAULT_PRESS_SELECTOR: String,
      SURFACE_SELECTOR: String
    ): ACTIONATTRIBUTE = {
      val __obj = js.Dynamic.literal(ACTION_ATTRIBUTE = ACTION_ATTRIBUTE.asInstanceOf[js.Any], BUTTON_DEFAULT_ATTRIBUTE = BUTTON_DEFAULT_ATTRIBUTE.asInstanceOf[js.Any], BUTTON_SELECTOR = BUTTON_SELECTOR.asInstanceOf[js.Any], CLOSED_EVENT = CLOSED_EVENT.asInstanceOf[js.Any], CLOSE_ACTION = CLOSE_ACTION.asInstanceOf[js.Any], CLOSING_EVENT = CLOSING_EVENT.asInstanceOf[js.Any], CONTAINER_SELECTOR = CONTAINER_SELECTOR.asInstanceOf[js.Any], CONTENT_SELECTOR = CONTENT_SELECTOR.asInstanceOf[js.Any], DESTROY_ACTION = DESTROY_ACTION.asInstanceOf[js.Any], INITIAL_FOCUS_ATTRIBUTE = INITIAL_FOCUS_ATTRIBUTE.asInstanceOf[js.Any], OPENED_EVENT = OPENED_EVENT.asInstanceOf[js.Any], OPENING_EVENT = OPENING_EVENT.asInstanceOf[js.Any], SCRIM_SELECTOR = SCRIM_SELECTOR.asInstanceOf[js.Any], SUPPRESS_DEFAULT_PRESS_SELECTOR = SUPPRESS_DEFAULT_PRESS_SELECTOR.asInstanceOf[js.Any], SURFACE_SELECTOR = SURFACE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[ACTIONATTRIBUTE]
    }
    
    extension [Self <: ACTIONATTRIBUTE](x: Self) {
      
      inline def setACTION_ATTRIBUTE(value: String): Self = StObject.set(x, "ACTION_ATTRIBUTE", value.asInstanceOf[js.Any])
      
      inline def setBUTTON_DEFAULT_ATTRIBUTE(value: String): Self = StObject.set(x, "BUTTON_DEFAULT_ATTRIBUTE", value.asInstanceOf[js.Any])
      
      inline def setBUTTON_SELECTOR(value: String): Self = StObject.set(x, "BUTTON_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setCLOSED_EVENT(value: String): Self = StObject.set(x, "CLOSED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setCLOSE_ACTION(value: String): Self = StObject.set(x, "CLOSE_ACTION", value.asInstanceOf[js.Any])
      
      inline def setCLOSING_EVENT(value: String): Self = StObject.set(x, "CLOSING_EVENT", value.asInstanceOf[js.Any])
      
      inline def setCONTAINER_SELECTOR(value: String): Self = StObject.set(x, "CONTAINER_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setCONTENT_SELECTOR(value: String): Self = StObject.set(x, "CONTENT_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setDESTROY_ACTION(value: String): Self = StObject.set(x, "DESTROY_ACTION", value.asInstanceOf[js.Any])
      
      inline def setINITIAL_FOCUS_ATTRIBUTE(value: String): Self = StObject.set(x, "INITIAL_FOCUS_ATTRIBUTE", value.asInstanceOf[js.Any])
      
      inline def setOPENED_EVENT(value: String): Self = StObject.set(x, "OPENED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setOPENING_EVENT(value: String): Self = StObject.set(x, "OPENING_EVENT", value.asInstanceOf[js.Any])
      
      inline def setSCRIM_SELECTOR(value: String): Self = StObject.set(x, "SCRIM_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setSUPPRESS_DEFAULT_PRESS_SELECTOR(value: String): Self = StObject.set(x, "SUPPRESS_DEFAULT_PRESS_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setSURFACE_SELECTOR(value: String): Self = StObject.set(x, "SURFACE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait CLOSING extends StObject {
    
    var CLOSING: String
    
    var FULLSCREEN: String
    
    var OPEN: String
    
    var OPENING: String
    
    var SCRIM_HIDDEN: String
    
    var SCROLLABLE: String
    
    var SCROLL_DIVIDER_FOOTER: String
    
    var SCROLL_DIVIDER_HEADER: String
    
    var SCROLL_LOCK: String
    
    var STACKED: String
    
    var SURFACE_SCRIM_HIDING: String
    
    var SURFACE_SCRIM_SHOWING: String
    
    var SURFACE_SCRIM_SHOWN: String
  }
  object CLOSING {
    
    inline def apply(
      CLOSING: String,
      FULLSCREEN: String,
      OPEN: String,
      OPENING: String,
      SCRIM_HIDDEN: String,
      SCROLLABLE: String,
      SCROLL_DIVIDER_FOOTER: String,
      SCROLL_DIVIDER_HEADER: String,
      SCROLL_LOCK: String,
      STACKED: String,
      SURFACE_SCRIM_HIDING: String,
      SURFACE_SCRIM_SHOWING: String,
      SURFACE_SCRIM_SHOWN: String
    ): CLOSING = {
      val __obj = js.Dynamic.literal(CLOSING = CLOSING.asInstanceOf[js.Any], FULLSCREEN = FULLSCREEN.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], OPENING = OPENING.asInstanceOf[js.Any], SCRIM_HIDDEN = SCRIM_HIDDEN.asInstanceOf[js.Any], SCROLLABLE = SCROLLABLE.asInstanceOf[js.Any], SCROLL_DIVIDER_FOOTER = SCROLL_DIVIDER_FOOTER.asInstanceOf[js.Any], SCROLL_DIVIDER_HEADER = SCROLL_DIVIDER_HEADER.asInstanceOf[js.Any], SCROLL_LOCK = SCROLL_LOCK.asInstanceOf[js.Any], STACKED = STACKED.asInstanceOf[js.Any], SURFACE_SCRIM_HIDING = SURFACE_SCRIM_HIDING.asInstanceOf[js.Any], SURFACE_SCRIM_SHOWING = SURFACE_SCRIM_SHOWING.asInstanceOf[js.Any], SURFACE_SCRIM_SHOWN = SURFACE_SCRIM_SHOWN.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLOSING]
    }
    
    extension [Self <: CLOSING](x: Self) {
      
      inline def setCLOSING(value: String): Self = StObject.set(x, "CLOSING", value.asInstanceOf[js.Any])
      
      inline def setFULLSCREEN(value: String): Self = StObject.set(x, "FULLSCREEN", value.asInstanceOf[js.Any])
      
      inline def setOPEN(value: String): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
      
      inline def setOPENING(value: String): Self = StObject.set(x, "OPENING", value.asInstanceOf[js.Any])
      
      inline def setSCRIM_HIDDEN(value: String): Self = StObject.set(x, "SCRIM_HIDDEN", value.asInstanceOf[js.Any])
      
      inline def setSCROLLABLE(value: String): Self = StObject.set(x, "SCROLLABLE", value.asInstanceOf[js.Any])
      
      inline def setSCROLL_DIVIDER_FOOTER(value: String): Self = StObject.set(x, "SCROLL_DIVIDER_FOOTER", value.asInstanceOf[js.Any])
      
      inline def setSCROLL_DIVIDER_HEADER(value: String): Self = StObject.set(x, "SCROLL_DIVIDER_HEADER", value.asInstanceOf[js.Any])
      
      inline def setSCROLL_LOCK(value: String): Self = StObject.set(x, "SCROLL_LOCK", value.asInstanceOf[js.Any])
      
      inline def setSTACKED(value: String): Self = StObject.set(x, "STACKED", value.asInstanceOf[js.Any])
      
      inline def setSURFACE_SCRIM_HIDING(value: String): Self = StObject.set(x, "SURFACE_SCRIM_HIDING", value.asInstanceOf[js.Any])
      
      inline def setSURFACE_SCRIM_SHOWING(value: String): Self = StObject.set(x, "SURFACE_SCRIM_SHOWING", value.asInstanceOf[js.Any])
      
      inline def setSURFACE_SCRIM_SHOWN(value: String): Self = StObject.set(x, "SURFACE_SCRIM_SHOWN", value.asInstanceOf[js.Any])
    }
  }
  
  trait DIALOGANIMATIONCLOSETIMEMS extends StObject {
    
    var DIALOG_ANIMATION_CLOSE_TIME_MS: Double
    
    var DIALOG_ANIMATION_OPEN_TIME_MS: Double
  }
  object DIALOGANIMATIONCLOSETIMEMS {
    
    inline def apply(DIALOG_ANIMATION_CLOSE_TIME_MS: Double, DIALOG_ANIMATION_OPEN_TIME_MS: Double): DIALOGANIMATIONCLOSETIMEMS = {
      val __obj = js.Dynamic.literal(DIALOG_ANIMATION_CLOSE_TIME_MS = DIALOG_ANIMATION_CLOSE_TIME_MS.asInstanceOf[js.Any], DIALOG_ANIMATION_OPEN_TIME_MS = DIALOG_ANIMATION_OPEN_TIME_MS.asInstanceOf[js.Any])
      __obj.asInstanceOf[DIALOGANIMATIONCLOSETIMEMS]
    }
    
    extension [Self <: DIALOGANIMATIONCLOSETIMEMS](x: Self) {
      
      inline def setDIALOG_ANIMATION_CLOSE_TIME_MS(value: Double): Self = StObject.set(x, "DIALOG_ANIMATION_CLOSE_TIME_MS", value.asInstanceOf[js.Any])
      
      inline def setDIALOG_ANIMATION_OPEN_TIME_MS(value: Double): Self = StObject.set(x, "DIALOG_ANIMATION_OPEN_TIME_MS", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/dialog.@material/dialog/adapter.MDCDialogAdapter> */
  trait PartialMDCDialogAdapter extends StObject {
    
    var addBodyClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var areButtonsStacked: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var clickDefaultButton: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var deregisterContentEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var deregisterWindowEventHandler: js.UndefOr[
        js.Function2[
          /* evtType */ WindowEventType, 
          /* handler */ SpecificWindowEventListener[WindowEventType], 
          Unit
        ]
      ] = js.undefined
    
    var eventTargetMatches: js.UndefOr[js.Function2[/* target */ EventTarget | Null, /* selector */ String, Boolean]] = js.undefined
    
    var getActionFromEvent: js.UndefOr[js.Function1[/* evt */ Event, String | Null]] = js.undefined
    
    var getInitialFocusEl: js.UndefOr[js.Function0[HTMLElement | Null]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var isContentScrollable: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var isScrollableContentAtBottom: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var isScrollableContentAtTop: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var notifyClosed: js.UndefOr[js.Function1[/* action */ String, Unit]] = js.undefined
    
    var notifyClosing: js.UndefOr[js.Function1[/* action */ String, Unit]] = js.undefined
    
    var notifyOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var notifyOpening: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var registerContentEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerWindowEventHandler: js.UndefOr[
        js.Function2[
          /* evtType */ WindowEventType, 
          /* handler */ SpecificWindowEventListener[WindowEventType], 
          Unit
        ]
      ] = js.undefined
    
    var releaseFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeBodyClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var reverseButtons: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var trapFocus: js.UndefOr[js.Function1[/* focusElement */ HTMLElement | Null, Unit]] = js.undefined
  }
  object PartialMDCDialogAdapter {
    
    inline def apply(): PartialMDCDialogAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCDialogAdapter]
    }
    
    extension [Self <: PartialMDCDialogAdapter](x: Self) {
      
      inline def setAddBodyClass(value: /* className */ String => Callback): Self = StObject.set(x, "addBodyClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setAddBodyClassUndefined: Self = StObject.set(x, "addBodyClass", js.undefined)
      
      inline def setAddClass(value: /* className */ String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setAreButtonsStacked(value: CallbackTo[Boolean]): Self = StObject.set(x, "areButtonsStacked", value.toJsFn)
      
      inline def setAreButtonsStackedUndefined: Self = StObject.set(x, "areButtonsStacked", js.undefined)
      
      inline def setClickDefaultButton(value: Callback): Self = StObject.set(x, "clickDefaultButton", value.toJsFn)
      
      inline def setClickDefaultButtonUndefined: Self = StObject.set(x, "clickDefaultButton", js.undefined)
      
      inline def setDeregisterContentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "deregisterContentEventHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterContentEventHandlerUndefined: Self = StObject.set(x, "deregisterContentEventHandler", js.undefined)
      
      inline def setDeregisterWindowEventHandler(
        value: (/* evtType */ WindowEventType, /* handler */ SpecificWindowEventListener[WindowEventType]) => Callback
      ): Self = StObject.set(x, "deregisterWindowEventHandler", js.Any.fromFunction2((t0: /* evtType */ WindowEventType, t1: /* handler */ SpecificWindowEventListener[WindowEventType]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterWindowEventHandlerUndefined: Self = StObject.set(x, "deregisterWindowEventHandler", js.undefined)
      
      inline def setEventTargetMatches(value: (/* target */ EventTarget | Null, /* selector */ String) => Boolean): Self = StObject.set(x, "eventTargetMatches", js.Any.fromFunction2(value))
      
      inline def setEventTargetMatchesUndefined: Self = StObject.set(x, "eventTargetMatches", js.undefined)
      
      inline def setGetActionFromEvent(value: /* evt */ Event => String | Null): Self = StObject.set(x, "getActionFromEvent", js.Any.fromFunction1(value))
      
      inline def setGetActionFromEventUndefined: Self = StObject.set(x, "getActionFromEvent", js.undefined)
      
      inline def setGetInitialFocusEl(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "getInitialFocusEl", value.toJsFn)
      
      inline def setGetInitialFocusElUndefined: Self = StObject.set(x, "getInitialFocusEl", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setIsContentScrollable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isContentScrollable", value.toJsFn)
      
      inline def setIsContentScrollableUndefined: Self = StObject.set(x, "isContentScrollable", js.undefined)
      
      inline def setIsScrollableContentAtBottom(value: CallbackTo[Boolean]): Self = StObject.set(x, "isScrollableContentAtBottom", value.toJsFn)
      
      inline def setIsScrollableContentAtBottomUndefined: Self = StObject.set(x, "isScrollableContentAtBottom", js.undefined)
      
      inline def setIsScrollableContentAtTop(value: CallbackTo[Boolean]): Self = StObject.set(x, "isScrollableContentAtTop", value.toJsFn)
      
      inline def setIsScrollableContentAtTopUndefined: Self = StObject.set(x, "isScrollableContentAtTop", js.undefined)
      
      inline def setNotifyClosed(value: /* action */ String => Callback): Self = StObject.set(x, "notifyClosed", js.Any.fromFunction1((t0: /* action */ String) => value(t0).runNow()))
      
      inline def setNotifyClosedUndefined: Self = StObject.set(x, "notifyClosed", js.undefined)
      
      inline def setNotifyClosing(value: /* action */ String => Callback): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1((t0: /* action */ String) => value(t0).runNow()))
      
      inline def setNotifyClosingUndefined: Self = StObject.set(x, "notifyClosing", js.undefined)
      
      inline def setNotifyOpened(value: Callback): Self = StObject.set(x, "notifyOpened", value.toJsFn)
      
      inline def setNotifyOpenedUndefined: Self = StObject.set(x, "notifyOpened", js.undefined)
      
      inline def setNotifyOpening(value: Callback): Self = StObject.set(x, "notifyOpening", value.toJsFn)
      
      inline def setNotifyOpeningUndefined: Self = StObject.set(x, "notifyOpening", js.undefined)
      
      inline def setRegisterContentEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "registerContentEventHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterContentEventHandlerUndefined: Self = StObject.set(x, "registerContentEventHandler", js.undefined)
      
      inline def setRegisterWindowEventHandler(
        value: (/* evtType */ WindowEventType, /* handler */ SpecificWindowEventListener[WindowEventType]) => Callback
      ): Self = StObject.set(x, "registerWindowEventHandler", js.Any.fromFunction2((t0: /* evtType */ WindowEventType, t1: /* handler */ SpecificWindowEventListener[WindowEventType]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterWindowEventHandlerUndefined: Self = StObject.set(x, "registerWindowEventHandler", js.undefined)
      
      inline def setReleaseFocus(value: Callback): Self = StObject.set(x, "releaseFocus", value.toJsFn)
      
      inline def setReleaseFocusUndefined: Self = StObject.set(x, "releaseFocus", js.undefined)
      
      inline def setRemoveBodyClass(value: /* className */ String => Callback): Self = StObject.set(x, "removeBodyClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setRemoveBodyClassUndefined: Self = StObject.set(x, "removeBodyClass", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setReverseButtons(value: Callback): Self = StObject.set(x, "reverseButtons", value.toJsFn)
      
      inline def setReverseButtonsUndefined: Self = StObject.set(x, "reverseButtons", js.undefined)
      
      inline def setTrapFocus(value: /* focusElement */ HTMLElement | Null => Callback): Self = StObject.set(x, "trapFocus", js.Any.fromFunction1((t0: /* focusElement */ HTMLElement | Null) => value(t0).runNow()))
      
      inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
}
