package typingsJapgolly.materialMenuSurface

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.materialMenuSurface.typesMod.MDCMenuDimensions
import typingsJapgolly.materialMenuSurface.typesMod.MDCMenuPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ANCHOR extends StObject {
    
    var ANCHOR: String
    
    var ANIMATING_CLOSED: String
    
    var ANIMATING_OPEN: String
    
    var FIXED: String
    
    var IS_OPEN_BELOW: String
    
    var OPEN: String
    
    var ROOT: String
  }
  object ANCHOR {
    
    inline def apply(
      ANCHOR: String,
      ANIMATING_CLOSED: String,
      ANIMATING_OPEN: String,
      FIXED: String,
      IS_OPEN_BELOW: String,
      OPEN: String,
      ROOT: String
    ): ANCHOR = {
      val __obj = js.Dynamic.literal(ANCHOR = ANCHOR.asInstanceOf[js.Any], ANIMATING_CLOSED = ANIMATING_CLOSED.asInstanceOf[js.Any], ANIMATING_OPEN = ANIMATING_OPEN.asInstanceOf[js.Any], FIXED = FIXED.asInstanceOf[js.Any], IS_OPEN_BELOW = IS_OPEN_BELOW.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ANCHOR]
    }
    
    extension [Self <: ANCHOR](x: Self) {
      
      inline def setANCHOR(value: String): Self = StObject.set(x, "ANCHOR", value.asInstanceOf[js.Any])
      
      inline def setANIMATING_CLOSED(value: String): Self = StObject.set(x, "ANIMATING_CLOSED", value.asInstanceOf[js.Any])
      
      inline def setANIMATING_OPEN(value: String): Self = StObject.set(x, "ANIMATING_OPEN", value.asInstanceOf[js.Any])
      
      inline def setFIXED(value: String): Self = StObject.set(x, "FIXED", value.asInstanceOf[js.Any])
      
      inline def setIS_OPEN_BELOW(value: String): Self = StObject.set(x, "IS_OPEN_BELOW", value.asInstanceOf[js.Any])
      
      inline def setOPEN(value: String): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
      
      inline def setROOT(value: String): Self = StObject.set(x, "ROOT", value.asInstanceOf[js.Any])
    }
  }
  
  trait ANCHORTOMENUSURFACEWIDTHRATIO extends StObject {
    
    var ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double
    
    var MARGIN_TO_EDGE: Double
    
    var TOUCH_EVENT_WAIT_MS: Double
    
    var TRANSITION_CLOSE_DURATION: Double
    
    var TRANSITION_OPEN_DURATION: Double
  }
  object ANCHORTOMENUSURFACEWIDTHRATIO {
    
    inline def apply(
      ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double,
      MARGIN_TO_EDGE: Double,
      TOUCH_EVENT_WAIT_MS: Double,
      TRANSITION_CLOSE_DURATION: Double,
      TRANSITION_OPEN_DURATION: Double
    ): ANCHORTOMENUSURFACEWIDTHRATIO = {
      val __obj = js.Dynamic.literal(ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO = ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO.asInstanceOf[js.Any], MARGIN_TO_EDGE = MARGIN_TO_EDGE.asInstanceOf[js.Any], TOUCH_EVENT_WAIT_MS = TOUCH_EVENT_WAIT_MS.asInstanceOf[js.Any], TRANSITION_CLOSE_DURATION = TRANSITION_CLOSE_DURATION.asInstanceOf[js.Any], TRANSITION_OPEN_DURATION = TRANSITION_OPEN_DURATION.asInstanceOf[js.Any])
      __obj.asInstanceOf[ANCHORTOMENUSURFACEWIDTHRATIO]
    }
    
    extension [Self <: ANCHORTOMENUSURFACEWIDTHRATIO](x: Self) {
      
      inline def setANCHOR_TO_MENU_SURFACE_WIDTH_RATIO(value: Double): Self = StObject.set(x, "ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO", value.asInstanceOf[js.Any])
      
      inline def setMARGIN_TO_EDGE(value: Double): Self = StObject.set(x, "MARGIN_TO_EDGE", value.asInstanceOf[js.Any])
      
      inline def setTOUCH_EVENT_WAIT_MS(value: Double): Self = StObject.set(x, "TOUCH_EVENT_WAIT_MS", value.asInstanceOf[js.Any])
      
      inline def setTRANSITION_CLOSE_DURATION(value: Double): Self = StObject.set(x, "TRANSITION_CLOSE_DURATION", value.asInstanceOf[js.Any])
      
      inline def setTRANSITION_OPEN_DURATION(value: Double): Self = StObject.set(x, "TRANSITION_OPEN_DURATION", value.asInstanceOf[js.Any])
    }
  }
  
  trait CLOSEDEVENT extends StObject {
    
    var CLOSED_EVENT: String
    
    var CLOSING_EVENT: String
    
    var FOCUSABLE_ELEMENTS: String
    
    var OPENED_EVENT: String
    
    var OPENING_EVENT: String
  }
  object CLOSEDEVENT {
    
    inline def apply(
      CLOSED_EVENT: String,
      CLOSING_EVENT: String,
      FOCUSABLE_ELEMENTS: String,
      OPENED_EVENT: String,
      OPENING_EVENT: String
    ): CLOSEDEVENT = {
      val __obj = js.Dynamic.literal(CLOSED_EVENT = CLOSED_EVENT.asInstanceOf[js.Any], CLOSING_EVENT = CLOSING_EVENT.asInstanceOf[js.Any], FOCUSABLE_ELEMENTS = FOCUSABLE_ELEMENTS.asInstanceOf[js.Any], OPENED_EVENT = OPENED_EVENT.asInstanceOf[js.Any], OPENING_EVENT = OPENING_EVENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[CLOSEDEVENT]
    }
    
    extension [Self <: CLOSEDEVENT](x: Self) {
      
      inline def setCLOSED_EVENT(value: String): Self = StObject.set(x, "CLOSED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setCLOSING_EVENT(value: String): Self = StObject.set(x, "CLOSING_EVENT", value.asInstanceOf[js.Any])
      
      inline def setFOCUSABLE_ELEMENTS(value: String): Self = StObject.set(x, "FOCUSABLE_ELEMENTS", value.asInstanceOf[js.Any])
      
      inline def setOPENED_EVENT(value: String): Self = StObject.set(x, "OPENED_EVENT", value.asInstanceOf[js.Any])
      
      inline def setOPENING_EVENT(value: String): Self = StObject.set(x, "OPENING_EVENT", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@material/menu-surface.@material/menu-surface/types.MDCMenuDistance> */
  trait PartialMDCMenuDistance extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object PartialMDCMenuDistance {
    
    inline def apply(): PartialMDCMenuDistance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCMenuDistance]
    }
    
    extension [Self <: PartialMDCMenuDistance](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@material/menu-surface.@material/menu-surface/adapter.MDCMenuSurfaceAdapter> */
  trait PartialMDCMenuSurfaceAdap extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var getAnchorDimensions: js.UndefOr[js.Function0[DOMRect | Null]] = js.undefined
    
    var getBodyDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.undefined
    
    var getInnerDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.undefined
    
    var getOwnerDocument: js.UndefOr[js.Function0[Document]] = js.undefined
    
    var getWindowDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.undefined
    
    var getWindowScroll: js.UndefOr[js.Function0[MDCMenuPoint]] = js.undefined
    
    var hasAnchor: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var isElementInContainer: js.UndefOr[js.Function1[/* el */ Element, Boolean]] = js.undefined
    
    var isFocused: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var isRtl: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var notifyClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var notifyClosing: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var notifyOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var notifyOpening: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var restoreFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var saveFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setMaxHeight: js.UndefOr[js.Function1[/* height */ String, Unit]] = js.undefined
    
    var setPosition: js.UndefOr[js.Function1[/* position */ PartialMDCMenuDistance, Unit]] = js.undefined
    
    var setTransformOrigin: js.UndefOr[js.Function1[/* origin */ String, Unit]] = js.undefined
  }
  object PartialMDCMenuSurfaceAdap {
    
    inline def apply(): PartialMDCMenuSurfaceAdap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCMenuSurfaceAdap]
    }
    
    extension [Self <: PartialMDCMenuSurfaceAdap](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setGetAnchorDimensions(value: CallbackTo[DOMRect | Null]): Self = StObject.set(x, "getAnchorDimensions", value.toJsFn)
      
      inline def setGetAnchorDimensionsUndefined: Self = StObject.set(x, "getAnchorDimensions", js.undefined)
      
      inline def setGetBodyDimensions(value: CallbackTo[MDCMenuDimensions]): Self = StObject.set(x, "getBodyDimensions", value.toJsFn)
      
      inline def setGetBodyDimensionsUndefined: Self = StObject.set(x, "getBodyDimensions", js.undefined)
      
      inline def setGetInnerDimensions(value: CallbackTo[MDCMenuDimensions]): Self = StObject.set(x, "getInnerDimensions", value.toJsFn)
      
      inline def setGetInnerDimensionsUndefined: Self = StObject.set(x, "getInnerDimensions", js.undefined)
      
      inline def setGetOwnerDocument(value: CallbackTo[Document]): Self = StObject.set(x, "getOwnerDocument", value.toJsFn)
      
      inline def setGetOwnerDocumentUndefined: Self = StObject.set(x, "getOwnerDocument", js.undefined)
      
      inline def setGetWindowDimensions(value: CallbackTo[MDCMenuDimensions]): Self = StObject.set(x, "getWindowDimensions", value.toJsFn)
      
      inline def setGetWindowDimensionsUndefined: Self = StObject.set(x, "getWindowDimensions", js.undefined)
      
      inline def setGetWindowScroll(value: CallbackTo[MDCMenuPoint]): Self = StObject.set(x, "getWindowScroll", value.toJsFn)
      
      inline def setGetWindowScrollUndefined: Self = StObject.set(x, "getWindowScroll", js.undefined)
      
      inline def setHasAnchor(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasAnchor", value.toJsFn)
      
      inline def setHasAnchorUndefined: Self = StObject.set(x, "hasAnchor", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setIsElementInContainer(value: /* el */ Element => Boolean): Self = StObject.set(x, "isElementInContainer", js.Any.fromFunction1(value))
      
      inline def setIsElementInContainerUndefined: Self = StObject.set(x, "isElementInContainer", js.undefined)
      
      inline def setIsFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setIsRtl(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRtl", value.toJsFn)
      
      inline def setIsRtlUndefined: Self = StObject.set(x, "isRtl", js.undefined)
      
      inline def setNotifyClose(value: Callback): Self = StObject.set(x, "notifyClose", value.toJsFn)
      
      inline def setNotifyCloseUndefined: Self = StObject.set(x, "notifyClose", js.undefined)
      
      inline def setNotifyClosing(value: Callback): Self = StObject.set(x, "notifyClosing", value.toJsFn)
      
      inline def setNotifyClosingUndefined: Self = StObject.set(x, "notifyClosing", js.undefined)
      
      inline def setNotifyOpen(value: Callback): Self = StObject.set(x, "notifyOpen", value.toJsFn)
      
      inline def setNotifyOpenUndefined: Self = StObject.set(x, "notifyOpen", js.undefined)
      
      inline def setNotifyOpening(value: Callback): Self = StObject.set(x, "notifyOpening", value.toJsFn)
      
      inline def setNotifyOpeningUndefined: Self = StObject.set(x, "notifyOpening", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setRestoreFocus(value: Callback): Self = StObject.set(x, "restoreFocus", value.toJsFn)
      
      inline def setRestoreFocusUndefined: Self = StObject.set(x, "restoreFocus", js.undefined)
      
      inline def setSaveFocus(value: Callback): Self = StObject.set(x, "saveFocus", value.toJsFn)
      
      inline def setSaveFocusUndefined: Self = StObject.set(x, "saveFocus", js.undefined)
      
      inline def setSetMaxHeight(value: /* height */ String => Callback): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1((t0: /* height */ String) => value(t0).runNow()))
      
      inline def setSetMaxHeightUndefined: Self = StObject.set(x, "setMaxHeight", js.undefined)
      
      inline def setSetPosition(value: /* position */ PartialMDCMenuDistance => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: /* position */ PartialMDCMenuDistance) => value(t0).runNow()))
      
      inline def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
      
      inline def setSetTransformOrigin(value: /* origin */ String => Callback): Self = StObject.set(x, "setTransformOrigin", js.Any.fromFunction1((t0: /* origin */ String) => value(t0).runNow()))
      
      inline def setSetTransformOriginUndefined: Self = StObject.set(x, "setTransformOrigin", js.undefined)
    }
  }
}
