package typingsJapgolly.maquette.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectionOptions extends ProjectorOptions {
  /**
    * May be used to intercept registration of event-handlers.
    *
    * Used by the [[Projector]] to wrap eventHandler-calls to call [[scheduleRender]] as well.
    *
    * @param propertyName             The name of the property to be assigned, for example onclick
    * @param eventHandler             The function that was registered on the [[VNode]]
    * @param domNode                  The real DOM element
    * @param properties               The whole set of properties that was put on the VNode
    * @returns                        The function that is to be placed on the DOM node as the event handler, instead of `eventHandler`.
    */
  var eventHandlerInterceptor: js.UndefOr[EventHandlerInterceptor] = js.undefined
  /**
    * Only for internal use. Used for rendering SVG Nodes.
    */
  val namespace: js.UndefOr[String] = js.undefined
}

object ProjectionOptions {
  @scala.inline
  def apply(
    eventHandlerInterceptor: (/* propertyName */ String, /* eventHandler */ js.Function, /* domNode */ Node, /* properties */ VNodeProperties) => CallbackTo[js.UndefOr[js.Function]] = null,
    namespace: String = null,
    performanceLogger: (/* eventType */ PerformanceLoggerEvent, /* trigger */ js.UndefOr[Event_]) => Callback = null,
    styleApplyer: (/* domNode */ HTMLElement, /* styleName */ String, /* value */ String) => Callback = null
  ): ProjectionOptions = {
    val __obj = js.Dynamic.literal()
    if (eventHandlerInterceptor != null) __obj.updateDynamic("eventHandlerInterceptor")(js.Any.fromFunction4((t0: /* propertyName */ java.lang.String, t1: /* eventHandler */ js.Function, t2: /* domNode */ org.scalajs.dom.raw.Node, t3: /* properties */ typingsJapgolly.maquette.interfacesMod.VNodeProperties) => eventHandlerInterceptor(t0, t1, t2, t3).runNow()))
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (performanceLogger != null) __obj.updateDynamic("performanceLogger")(js.Any.fromFunction2((t0: /* eventType */ typingsJapgolly.maquette.interfacesMod.PerformanceLoggerEvent, t1: /* trigger */ js.UndefOr[typingsJapgolly.std.Event_]) => performanceLogger(t0, t1).runNow()))
    if (styleApplyer != null) __obj.updateDynamic("styleApplyer")(js.Any.fromFunction3((t0: /* domNode */ org.scalajs.dom.raw.HTMLElement, t1: /* styleName */ java.lang.String, t2: /* value */ java.lang.String) => styleApplyer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ProjectionOptions]
  }
}

