package typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod

import typingsJapgolly.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BanAdd
  extends StObject
     with ResponseEntry {
  
  var banid: String
}
object BanAdd {
  
  inline def apply(banid: String): BanAdd = {
    val __obj = js.Dynamic.literal(banid = banid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanAdd]
  }
  
  extension [Self <: BanAdd](x: Self) {
    
    inline def setBanid(value: String): Self = StObject.set(x, "banid", value.asInstanceOf[js.Any])
  }
}
