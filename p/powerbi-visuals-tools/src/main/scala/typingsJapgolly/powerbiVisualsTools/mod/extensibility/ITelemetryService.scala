package typingsJapgolly.powerbiVisualsTools.mod.extensibility

import typingsJapgolly.powerbiVisualsTools.mod.VisualEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITelemetryService extends StObject {
  
  val instanceId: String = js.native
  
  def trace(`type`: VisualEventType): Unit = js.native
  def trace(`type`: VisualEventType, payload: String): Unit = js.native
}
