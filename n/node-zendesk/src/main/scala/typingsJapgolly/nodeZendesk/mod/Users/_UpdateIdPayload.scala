package typingsJapgolly.nodeZendesk.mod.Users

import typingsJapgolly.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _UpdateIdPayload extends StObject
object _UpdateIdPayload {
  
  inline def Externalids(external_ids: js.Array[ZendeskID]): typingsJapgolly.nodeZendesk.anon.Externalids = {
    val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nodeZendesk.anon.Externalids]
  }
  
  inline def Ids(ids: js.Array[ZendeskID]): typingsJapgolly.nodeZendesk.anon.Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nodeZendesk.anon.Ids]
  }
}
