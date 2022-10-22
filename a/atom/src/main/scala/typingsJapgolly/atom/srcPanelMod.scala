package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPanelMod {
  
  trait Panel[T] extends StObject {
    
    // Construction and Destruction
    /** Destroy and remove this panel from the UI. */
    def destroy(): Unit
    
    // Panel Details
    /** Returns the panel's item. */
    def getItem(): T
    
    /** Returns a number indicating this panel's priority. */
    def getPriority(): Double
    
    /** Hide this panel. */
    def hide(): Unit
    
    /** Returns a boolean true when the panel is visible. */
    def isVisible(): Boolean
    
    // Event Subscription
    /** Invoke the given callback when the pane hidden or shown. */
    def onDidChangeVisible(callback: js.Function1[/* visible */ Boolean, Unit]): Disposable
    
    /** Invoke the given callback when the pane is destroyed. */
    def onDidDestroy(callback: js.Function1[/* panel */ Panel[T], Unit]): Disposable
    
    /** Show this panel. */
    def show(): Unit
    
    /** Whether or not the Panel is visible. */
    val visible: Boolean
  }
  object Panel {
    
    inline def apply[T](
      destroy: Callback,
      getItem: CallbackTo[T],
      getPriority: CallbackTo[Double],
      hide: Callback,
      isVisible: CallbackTo[Boolean],
      onDidChangeVisible: js.Function1[/* visible */ Boolean, Unit] => Disposable,
      onDidDestroy: js.Function1[/* panel */ Panel[T], Unit] => Disposable,
      show: Callback,
      visible: Boolean
    ): Panel[T] = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getItem = getItem.toJsFn, getPriority = getPriority.toJsFn, hide = hide.toJsFn, isVisible = isVisible.toJsFn, onDidChangeVisible = js.Any.fromFunction1(onDidChangeVisible), onDidDestroy = js.Any.fromFunction1(onDidDestroy), show = show.toJsFn, visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Panel[T]]
    }
    
    extension [Self <: Panel[?], T](x: Self & Panel[T]) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetItem(value: CallbackTo[T]): Self = StObject.set(x, "getItem", value.toJsFn)
      
      inline def setGetPriority(value: CallbackTo[Double]): Self = StObject.set(x, "getPriority", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
      
      inline def setOnDidChangeVisible(value: js.Function1[/* visible */ Boolean, Unit] => Disposable): Self = StObject.set(x, "onDidChangeVisible", js.Any.fromFunction1(value))
      
      inline def setOnDidDestroy(value: js.Function1[/* panel */ Panel[T], Unit] => Disposable): Self = StObject.set(x, "onDidDestroy", js.Any.fromFunction1(value))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
