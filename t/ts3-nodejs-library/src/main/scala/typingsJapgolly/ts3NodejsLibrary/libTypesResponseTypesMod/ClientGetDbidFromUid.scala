package typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod

import typingsJapgolly.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientGetDbidFromUid
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var cluid: String
}
object ClientGetDbidFromUid {
  
  inline def apply(cldbid: String, cluid: String): ClientGetDbidFromUid = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetDbidFromUid]
  }
  
  extension [Self <: ClientGetDbidFromUid](x: Self) {
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
  }
}
