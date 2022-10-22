package typingsJapgolly.iitc

import typingsJapgolly.iitc.coreIitctypesMod.IITC.PortalData
import typingsJapgolly.iitc.iitcInts.`0`
import typingsJapgolly.iitc.iitcInts.`1`
import typingsJapgolly.iitc.iitcInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreEntityInfoMod {
  
  object global {
    
    /**
      * given the entity detail data, returns the team the entity belongs to. Uses TEAM_* enum values.
      */
    inline def getTeam(details: PortalData): `0` | `1` | `2` = js.Dynamic.global.applyDynamic("getTeam")(details.asInstanceOf[js.Any]).asInstanceOf[`0` | `1` | `2`]
    
    inline def teamStringToId(teamStr: String): `0` | `1` | `2` = js.Dynamic.global.applyDynamic("teamStringToId")(teamStr.asInstanceOf[js.Any]).asInstanceOf[`0` | `1` | `2`]
  }
}
