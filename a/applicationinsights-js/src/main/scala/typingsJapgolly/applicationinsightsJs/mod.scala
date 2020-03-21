package typingsJapgolly.applicationinsightsJs

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.applicationinsightsJs.Microsoft.ApplicationInsights.IAppInsights
import typingsJapgolly.applicationinsightsJs.Microsoft.ApplicationInsights.UtilHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Util () extends UtilHelpers
  
  val AppInsights: IAppInsights = js.native
  @js.native
  object Util extends Instantiable0[UtilHelpers] {
    /**
      * Generate a random ID string
      */
    def newId(): String = js.native
  }
  
}

