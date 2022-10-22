package typingsJapgolly.ionicAngular

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.FrameRequestCallback
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesMod {
  
  @js.native
  trait HTMLStencilElement
    extends StObject
       with HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    var componentOnReady: js.UndefOr[js.Function0[js.Promise[this.type]]] = js.native
    
    var forceUpdate: js.UndefOr[js.Function0[Unit]] = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  
  trait IonicGlobal extends StObject {
    
    var asyncQueue: js.UndefOr[Boolean] = js.undefined
    
    var config: js.UndefOr[Any] = js.undefined
  }
  object IonicGlobal {
    
    inline def apply(): IonicGlobal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonicGlobal]
    }
    
    extension [Self <: IonicGlobal](x: Self) {
      
      inline def setAsyncQueue(value: Boolean): Self = StObject.set(x, "asyncQueue", value.asInstanceOf[js.Any])
      
      inline def setAsyncQueueUndefined: Self = StObject.set(x, "asyncQueue", js.undefined)
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
  
  @js.native
  trait IonicWindow
    extends StObject
       with Window {
    
    var Ionic: IonicGlobal = js.native
    
    var __zone_symbol__requestAnimationFrame: js.UndefOr[js.Function1[/* ts */ FrameRequestCallback, Double]] = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
}
