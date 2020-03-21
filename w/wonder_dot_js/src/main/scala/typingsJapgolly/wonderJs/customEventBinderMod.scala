package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.entityObjectMod.EntityObject
import typingsJapgolly.wonderJs.eventBinderMod.EventBinder
import typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/CustomEventBinder", JSImport.Namespace)
@js.native
object customEventBinderMod extends js.Object {
  @js.native
  class CustomEventBinder () extends EventBinder {
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
  @js.native
  object CustomEventBinder extends js.Object {
    def getInstance(): js.Any = js.native
  }
  
}

