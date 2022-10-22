package typingsJapgolly.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.opentok.mod.BroadcastLayoutOptions
  - typingsJapgolly.opentok.mod.CustomBroadcastLayoutOptions
*/
trait BroadcastLayout extends StObject
object BroadcastLayout {
  
  inline def BroadcastLayoutOptions(): typingsJapgolly.opentok.mod.BroadcastLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.opentok.mod.BroadcastLayoutOptions]
  }
  
  inline def CustomBroadcastLayoutOptions(stylesheet: String): typingsJapgolly.opentok.mod.CustomBroadcastLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typingsJapgolly.opentok.mod.CustomBroadcastLayoutOptions]
  }
}
