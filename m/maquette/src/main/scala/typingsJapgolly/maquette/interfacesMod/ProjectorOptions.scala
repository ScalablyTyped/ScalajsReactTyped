package typingsJapgolly.maquette.interfacesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectorOptions extends js.Object {
  /**
    * Can be used to log performance metrics
    */
  var performanceLogger: js.UndefOr[ProjectorPerformanceLogger] = js.undefined
  /**
    * May be used to add vendor prefixes when applying inline styles when needed.
    * This function is called when [[styles]] is used.
    * This function should execute `domNode.style[styleName] = value` or do something smarter.
    *
    * @param domNode   The DOM Node that needs to receive the style
    * @param styleName The name of the style that should be applied, for example `transform`.
    * @param value     The value of this style, for example `rotate(45deg)`.
    */
  var styleApplyer: js.UndefOr[
    js.Function3[/* domNode */ HTMLElement, /* styleName */ String, /* value */ String, Unit]
  ] = js.undefined
}

object ProjectorOptions {
  @scala.inline
  def apply(
    performanceLogger: (/* eventType */ PerformanceLoggerEvent, /* trigger */ js.UndefOr[Event_]) => Callback = null,
    styleApplyer: (/* domNode */ HTMLElement, /* styleName */ String, /* value */ String) => Callback = null
  ): ProjectorOptions = {
    val __obj = js.Dynamic.literal()
    if (performanceLogger != null) __obj.updateDynamic("performanceLogger")(js.Any.fromFunction2((t0: /* eventType */ typingsJapgolly.maquette.interfacesMod.PerformanceLoggerEvent, t1: /* trigger */ js.UndefOr[typingsJapgolly.std.Event_]) => performanceLogger(t0, t1).runNow()))
    if (styleApplyer != null) __obj.updateDynamic("styleApplyer")(js.Any.fromFunction3((t0: /* domNode */ org.scalajs.dom.raw.HTMLElement, t1: /* styleName */ java.lang.String, t2: /* value */ java.lang.String) => styleApplyer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ProjectorOptions]
  }
}

