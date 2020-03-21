package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/factory/EventBinderFactory", JSImport.Namespace)
@js.native
object eventBinderFactoryMod extends js.Object {
  @js.native
  class EventBinderFactory () extends js.Object
  
  /* static members */
  @js.native
  object EventBinderFactory extends js.Object {
    def createEventBinder(eventName: EEventName): js.Any = js.native
  }
  
}

