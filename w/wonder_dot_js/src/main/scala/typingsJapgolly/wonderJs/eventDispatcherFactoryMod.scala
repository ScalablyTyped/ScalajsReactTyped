package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.eventMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/factory/EventDispatcherFactory", JSImport.Namespace)
@js.native
object eventDispatcherFactoryMod extends js.Object {
  @js.native
  class EventDispatcherFactory () extends js.Object
  
  /* static members */
  @js.native
  object EventDispatcherFactory extends js.Object {
    def createEventDispatcher(event: Event): js.Any = js.native
  }
  
}

