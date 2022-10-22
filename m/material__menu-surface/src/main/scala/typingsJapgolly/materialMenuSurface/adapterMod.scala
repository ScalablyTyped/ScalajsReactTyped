package typingsJapgolly.materialMenuSurface

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.materialMenuSurface.anon.PartialMDCMenuDistance
import typingsJapgolly.materialMenuSurface.typesMod.MDCMenuDimensions
import typingsJapgolly.materialMenuSurface.typesMod.MDCMenuPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCMenuSurfaceAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def getAnchorDimensions(): DOMRect | Null
    
    def getBodyDimensions(): MDCMenuDimensions
    
    def getInnerDimensions(): MDCMenuDimensions
    
    var getOwnerDocument: js.UndefOr[js.Function0[Document]] = js.undefined
    
    def getWindowDimensions(): MDCMenuDimensions
    
    def getWindowScroll(): MDCMenuPoint
    
    def hasAnchor(): Boolean
    
    def hasClass(className: String): Boolean
    
    def isElementInContainer(el: Element): Boolean
    
    def isFocused(): Boolean
    
    def isRtl(): Boolean
    
    /** Emits an event when the menu surface is closed. */
    def notifyClose(): Unit
    
    /** Emits an event when the menu surface is closing. */
    def notifyClosing(): Unit
    
    /** Emits an event when the menu surface is opened. */
    def notifyOpen(): Unit
    
    /** Emits an event when the menu surface is opening. */
    def notifyOpening(): Unit
    
    def removeClass(className: String): Unit
    
    /** Restores focus to the element that was focused before the menu surface was opened. */
    def restoreFocus(): Unit
    
    /** Saves the element that was focused before the menu surface was opened. */
    def saveFocus(): Unit
    
    def setMaxHeight(height: String): Unit
    
    def setPosition(position: PartialMDCMenuDistance): Unit
    
    def setTransformOrigin(origin: String): Unit
  }
  object MDCMenuSurfaceAdapter {
    
    inline def apply(
      addClass: String => Callback,
      getAnchorDimensions: CallbackTo[DOMRect | Null],
      getBodyDimensions: CallbackTo[MDCMenuDimensions],
      getInnerDimensions: CallbackTo[MDCMenuDimensions],
      getWindowDimensions: CallbackTo[MDCMenuDimensions],
      getWindowScroll: CallbackTo[MDCMenuPoint],
      hasAnchor: CallbackTo[Boolean],
      hasClass: String => Boolean,
      isElementInContainer: Element => Boolean,
      isFocused: CallbackTo[Boolean],
      isRtl: CallbackTo[Boolean],
      notifyClose: Callback,
      notifyClosing: Callback,
      notifyOpen: Callback,
      notifyOpening: Callback,
      removeClass: String => Callback,
      restoreFocus: Callback,
      saveFocus: Callback,
      setMaxHeight: String => Callback,
      setPosition: PartialMDCMenuDistance => Callback,
      setTransformOrigin: String => Callback
    ): MDCMenuSurfaceAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), getAnchorDimensions = getAnchorDimensions.toJsFn, getBodyDimensions = getBodyDimensions.toJsFn, getInnerDimensions = getInnerDimensions.toJsFn, getWindowDimensions = getWindowDimensions.toJsFn, getWindowScroll = getWindowScroll.toJsFn, hasAnchor = hasAnchor.toJsFn, hasClass = js.Any.fromFunction1(hasClass), isElementInContainer = js.Any.fromFunction1(isElementInContainer), isFocused = isFocused.toJsFn, isRtl = isRtl.toJsFn, notifyClose = notifyClose.toJsFn, notifyClosing = notifyClosing.toJsFn, notifyOpen = notifyOpen.toJsFn, notifyOpening = notifyOpening.toJsFn, removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), restoreFocus = restoreFocus.toJsFn, saveFocus = saveFocus.toJsFn, setMaxHeight = js.Any.fromFunction1((t0: String) => setMaxHeight(t0).runNow()), setPosition = js.Any.fromFunction1((t0: PartialMDCMenuDistance) => setPosition(t0).runNow()), setTransformOrigin = js.Any.fromFunction1((t0: String) => setTransformOrigin(t0).runNow()))
      __obj.asInstanceOf[MDCMenuSurfaceAdapter]
    }
    
    extension [Self <: MDCMenuSurfaceAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetAnchorDimensions(value: CallbackTo[DOMRect | Null]): Self = StObject.set(x, "getAnchorDimensions", value.toJsFn)
      
      inline def setGetBodyDimensions(value: CallbackTo[MDCMenuDimensions]): Self = StObject.set(x, "getBodyDimensions", value.toJsFn)
      
      inline def setGetInnerDimensions(value: CallbackTo[MDCMenuDimensions]): Self = StObject.set(x, "getInnerDimensions", value.toJsFn)
      
      inline def setGetOwnerDocument(value: CallbackTo[Document]): Self = StObject.set(x, "getOwnerDocument", value.toJsFn)
      
      inline def setGetOwnerDocumentUndefined: Self = StObject.set(x, "getOwnerDocument", js.undefined)
      
      inline def setGetWindowDimensions(value: CallbackTo[MDCMenuDimensions]): Self = StObject.set(x, "getWindowDimensions", value.toJsFn)
      
      inline def setGetWindowScroll(value: CallbackTo[MDCMenuPoint]): Self = StObject.set(x, "getWindowScroll", value.toJsFn)
      
      inline def setHasAnchor(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasAnchor", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsElementInContainer(value: Element => Boolean): Self = StObject.set(x, "isElementInContainer", js.Any.fromFunction1(value))
      
      inline def setIsFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setIsRtl(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRtl", value.toJsFn)
      
      inline def setNotifyClose(value: Callback): Self = StObject.set(x, "notifyClose", value.toJsFn)
      
      inline def setNotifyClosing(value: Callback): Self = StObject.set(x, "notifyClosing", value.toJsFn)
      
      inline def setNotifyOpen(value: Callback): Self = StObject.set(x, "notifyOpen", value.toJsFn)
      
      inline def setNotifyOpening(value: Callback): Self = StObject.set(x, "notifyOpening", value.toJsFn)
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRestoreFocus(value: Callback): Self = StObject.set(x, "restoreFocus", value.toJsFn)
      
      inline def setSaveFocus(value: Callback): Self = StObject.set(x, "saveFocus", value.toJsFn)
      
      inline def setSetMaxHeight(value: String => Callback): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetPosition(value: PartialMDCMenuDistance => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: PartialMDCMenuDistance) => value(t0).runNow()))
      
      inline def setSetTransformOrigin(value: String => Callback): Self = StObject.set(x, "setTransformOrigin", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
