package typingsJapgolly.jqueryMouseExit.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_.TriggeredEvent
import typingsJapgolly.jqueryMouseExit.jqueryMouseExitStrings.mouseExit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait JQuery extends js.Object {
    def mouseExit(): JQuery = js.native
    def mouseExit(options: Options): JQuery = js.native
    @JSName("on")
    def on_mouseExit(
      event: mouseExit,
      handler: js.Function2[/* event */ TriggeredEvent[HTMLElement, _, _, _], /* data */ FocusElements, Unit]
    ): JQuery = js.native
  }
  
}

