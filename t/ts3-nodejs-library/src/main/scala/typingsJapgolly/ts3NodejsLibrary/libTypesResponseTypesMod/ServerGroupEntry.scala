package typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod

import typingsJapgolly.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroupEntry
  extends StObject
     with ResponseEntry {
  
  var iconid: String
  
  var nMemberAddp: Double
  
  var nMemberRemovep: Double
  
  var nModifyp: Double
  
  var name: String
  
  var namemode: Double
  
  var savedb: Double
  
  var sgid: String
  
  var sortid: Double
  
  var `type`: Double
}
object ServerGroupEntry {
  
  inline def apply(
    iconid: String,
    nMemberAddp: Double,
    nMemberRemovep: Double,
    nModifyp: Double,
    name: String,
    namemode: Double,
    savedb: Double,
    sgid: String,
    sortid: Double,
    `type`: Double
  ): ServerGroupEntry = {
    val __obj = js.Dynamic.literal(iconid = iconid.asInstanceOf[js.Any], nMemberAddp = nMemberAddp.asInstanceOf[js.Any], nMemberRemovep = nMemberRemovep.asInstanceOf[js.Any], nModifyp = nModifyp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namemode = namemode.asInstanceOf[js.Any], savedb = savedb.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any], sortid = sortid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupEntry]
  }
  
  extension [Self <: ServerGroupEntry](x: Self) {
    
    inline def setIconid(value: String): Self = StObject.set(x, "iconid", value.asInstanceOf[js.Any])
    
    inline def setNMemberAddp(value: Double): Self = StObject.set(x, "nMemberAddp", value.asInstanceOf[js.Any])
    
    inline def setNMemberRemovep(value: Double): Self = StObject.set(x, "nMemberRemovep", value.asInstanceOf[js.Any])
    
    inline def setNModifyp(value: Double): Self = StObject.set(x, "nModifyp", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamemode(value: Double): Self = StObject.set(x, "namemode", value.asInstanceOf[js.Any])
    
    inline def setSavedb(value: Double): Self = StObject.set(x, "savedb", value.asInstanceOf[js.Any])
    
    inline def setSgid(value: String): Self = StObject.set(x, "sgid", value.asInstanceOf[js.Any])
    
    inline def setSortid(value: Double): Self = StObject.set(x, "sortid", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
