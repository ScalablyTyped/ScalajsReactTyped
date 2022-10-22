package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typingsJapgolly.wonderJs.distEs2015EventBinderEventBinderMod.EventBinder
import typingsJapgolly.wonderJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventBinderCustomEventBinderMod {
  
  @JSImport("wonder.js/dist/es2015/event/binder/CustomEventBinder", "CustomEventBinder")
  @js.native
  open class CustomEventBinder () extends EventBinder {
    
    def off(): Unit = js.native
    def off(eventName: String): Unit = js.native
    def off(eventName: String, handler: js.Function): Unit = js.native
    def off(eventName: EEventName): Unit = js.native
    def off(eventName: EEventName, handler: js.Function): Unit = js.native
    def off(target: EntityObject): Unit = js.native
    def off(target: EntityObject, eventName: String): Unit = js.native
    def off(target: EntityObject, eventName: String, handler: js.Function): Unit = js.native
    def off(target: EntityObject, eventName: EEventName): Unit = js.native
    def off(target: EntityObject, eventName: EEventName, handler: js.Function): Unit = js.native
    
    def on(eventName: String, handler: js.Function): Unit = js.native
    def on(eventName: String, handler: js.Function, priority: Double): Unit = js.native
    def on(eventName: EEventName, handler: js.Function): Unit = js.native
    def on(eventName: EEventName, handler: js.Function, priority: Double): Unit = js.native
    def on(target: EntityObject, eventName: String, handler: js.Function): Unit = js.native
    def on(target: EntityObject, eventName: String, handler: js.Function, priority: Double): Unit = js.native
    def on(target: EntityObject, eventName: EEventName, handler: js.Function): Unit = js.native
    def on(target: EntityObject, eventName: EEventName, handler: js.Function, priority: Double): Unit = js.native
  }
  /* static members */
  object CustomEventBinder {
    
    @JSImport("wonder.js/dist/es2015/event/binder/CustomEventBinder", "CustomEventBinder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Any]
  }
}
