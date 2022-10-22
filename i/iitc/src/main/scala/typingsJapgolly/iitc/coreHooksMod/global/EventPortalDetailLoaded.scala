package typingsJapgolly.iitc.coreHooksMod.global

import typingsJapgolly.iitc.coreIitctypesMod.IITC.PortalDataDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.iitc.anon.Details
  - typingsJapgolly.iitc.anon.Guid
*/
trait EventPortalDetailLoaded extends StObject
object EventPortalDetailLoaded {
  
  inline def Details(details: PortalDataDetail, ent: PortalDetailEnt, guid: String): typingsJapgolly.iitc.anon.Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], ent = ent.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], success = true)
    __obj.asInstanceOf[typingsJapgolly.iitc.anon.Details]
  }
  
  inline def Guid(guid: String): typingsJapgolly.iitc.anon.Guid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], success = false)
    __obj.asInstanceOf[typingsJapgolly.iitc.anon.Guid]
  }
}
