package typingsJapgolly.powerbiVisualsTools.mod

import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`0`
import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`1`
import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`2`
import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines various events Visuals can notify the host on.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`0`
  - typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`1`
  - typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`2`
  - typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`3`
*/
trait VisualEventType extends StObject
object VisualEventType {
  
  /** Should be used by visuals to trace errors in PBI telemetry. */
  inline def Error: `3` = 3.asInstanceOf[`3`]
  
  /** Should be used at the end of a visual's rendering operation. */
  inline def RenderCompleted: `1` = 1.asInstanceOf[`1`]
  
  /** Should be used at the beginning of a visual's rendering operation. */
  inline def RenderStarted: `0` = 0.asInstanceOf[`0`]
  
  /** Should be used by visuals to trace information in PBI telemetry. */
  inline def Trace: `2` = 2.asInstanceOf[`2`]
}
