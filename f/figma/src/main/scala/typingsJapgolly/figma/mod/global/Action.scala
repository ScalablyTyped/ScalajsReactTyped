package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.BACK
import typingsJapgolly.figma.figmaStrings.CLOSE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.anon.Type
  - typingsJapgolly.figma.anon.Url
  - typingsJapgolly.figma.anon.DestinationId
*/
trait Action extends StObject
object Action {
  
  inline def DestinationId(navigation: Navigation, preserveScrollPosition: Boolean): typingsJapgolly.figma.anon.DestinationId = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any], destinationId = null, transition = null)
    __obj.updateDynamic("type")("NODE")
    __obj.asInstanceOf[typingsJapgolly.figma.anon.DestinationId]
  }
  
  inline def Type(`type`: BACK | CLOSE): typingsJapgolly.figma.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.anon.Type]
  }
  
  inline def Url(url: String): typingsJapgolly.figma.anon.Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("URL")
    __obj.asInstanceOf[typingsJapgolly.figma.anon.Url]
  }
}
