package typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod

import typingsJapgolly.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelClientPermSidEntry
  extends StObject
     with ResponseEntry {
  
  var cid: String
  
  var cldbid: String
  
  var permnegated: Boolean
  
  var permsid: String
  
  var permskip: Boolean
  
  var permvalue: Double
}
object ChannelClientPermSidEntry {
  
  inline def apply(
    cid: String,
    cldbid: String,
    permnegated: Boolean,
    permsid: String,
    permskip: Boolean,
    permvalue: Double
  ): ChannelClientPermSidEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], permnegated = permnegated.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelClientPermSidEntry]
  }
  
  extension [Self <: ChannelClientPermSidEntry](x: Self) {
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setPermnegated(value: Boolean): Self = StObject.set(x, "permnegated", value.asInstanceOf[js.Any])
    
    inline def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
    
    inline def setPermskip(value: Boolean): Self = StObject.set(x, "permskip", value.asInstanceOf[js.Any])
    
    inline def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
  }
}
