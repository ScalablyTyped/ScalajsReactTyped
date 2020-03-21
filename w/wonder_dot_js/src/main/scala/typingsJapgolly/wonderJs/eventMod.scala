package typingsJapgolly.wonderJs

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.wonderJs.eengineeventMod.EEngineEvent
import typingsJapgolly.wonderJs.eeventphaseMod.EEventPhase
import typingsJapgolly.wonderJs.eeventtypeMod.EEventType
import typingsJapgolly.wonderJs.entityObjectMod.EntityObject
import typingsJapgolly.wonderJs.eventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/Event", JSImport.Namespace)
@js.native
object eventMod extends js.Object {
  @js.native
  abstract class Event protected () extends js.Object {
    protected def this(eventName: EEventName) = this()
    var currentTarget: HTMLElement | EntityObject = js.native
    var isStopPropagation: Boolean = js.native
    var name: String | EEventName | EEngineEvent = js.native
    var phase: EEventPhase = js.native
    var target: HTMLElement | EntityObject = js.native
    val `type`: EEventType = js.native
    /* protected */ def copyMember(destination: Event, source: Event, memberArr: js.Array[_]): Event = js.native
    def stopPropagation(): Unit = js.native
  }
  
}

