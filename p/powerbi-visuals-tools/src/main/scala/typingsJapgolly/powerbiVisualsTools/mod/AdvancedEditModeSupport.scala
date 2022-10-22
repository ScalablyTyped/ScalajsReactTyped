package typingsJapgolly.powerbiVisualsTools.mod

import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`0`
import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`1`
import typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`0`
  - typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`1`
  - typingsJapgolly.powerbiVisualsTools.powerbiVisualsToolsInts.`2`
*/
trait AdvancedEditModeSupport extends StObject
object AdvancedEditModeSupport {
  
  /** The visual doesn't support Advanced Edit mode. Do not display the 'Edit' button on this visual. */
  inline def NotSupported: `0` = 0.asInstanceOf[`0`]
  
  /** The visual supports Advanced Edit mode, and requires that the host pops out the visual when entering Advanced EditMode. */
  inline def SupportedInFocus: `2` = 2.asInstanceOf[`2`]
  
  /** The visual supports Advanced Edit mode, but doesn't require any further changes aside from setting EditMode=Advanced. */
  inline def SupportedNoAction: `1` = 1.asInstanceOf[`1`]
}
