package typingsJapgolly.webicon.mod

import typingsJapgolly.webicon.configMod.Config
import typingsJapgolly.webicon.configurationHandlerMod.ConfigurationHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait JQuery[TElement] extends js.Object {
    /**
      * Initializes the web-icons.
      *
      * @param config
      * Either the configuration for initializing web-icons or a callback for configuring the web-icons.
      */
    def webicons(config: Config): this.type = js.native
    def webicons(config: ConfigurationHandler): this.type = js.native
  }
  
}

