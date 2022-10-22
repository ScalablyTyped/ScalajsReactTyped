package typingsJapgolly.ts3NodejsLibrary.libTypesResponseTypesMod

import typingsJapgolly.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerGroupCopy
  extends StObject
     with ResponseEntry {
  
  /** only available when a new group gets created */
  var sgid: js.UndefOr[String] = js.undefined
}
object ServerGroupCopy {
  
  inline def apply(): ServerGroupCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupCopy]
  }
  
  extension [Self <: ServerGroupCopy](x: Self) {
    
    inline def setSgid(value: String): Self = StObject.set(x, "sgid", value.asInstanceOf[js.Any])
    
    inline def setSgidUndefined: Self = StObject.set(x, "sgid", js.undefined)
  }
}
