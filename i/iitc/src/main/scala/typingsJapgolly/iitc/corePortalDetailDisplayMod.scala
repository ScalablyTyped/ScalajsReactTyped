package typingsJapgolly.iitc

import typingsJapgolly.iitc.coreIitctypesMod.IITC.Portal
import typingsJapgolly.iitc.coreIitctypesMod.IITC.PortalDataDetail
import typingsJapgolly.iitc.coreIitctypesMod.PortalGUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePortalDetailDisplayMod {
  
  object global {
    
    inline def getPortalMiscDetails(guid: PortalGUID): String = js.Dynamic.global.applyDynamic("getPortalMiscDetails")(guid.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getPortalMiscDetails(guid: PortalGUID, details: PortalDataDetail): String = (js.Dynamic.global.applyDynamic("getPortalMiscDetails")(guid.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def renderPortalDetails(guid: PortalGUID): Unit = js.Dynamic.global.applyDynamic("renderPortalDetails")(guid.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def resetScrollOnNewPortal(): Unit = js.Dynamic.global.applyDynamic("resetScrollOnNewPortal")().asInstanceOf[Unit]
    
    /**
      * highlights portal with given GUID. Automatically clears highlights
      * on old selection. Returns false if the selected portal changed.
      * @returns true if it's still the same portal that just needs an update.
      */
    inline def selectPortal(guid: PortalGUID): Boolean = js.Dynamic.global.applyDynamic("selectPortal")(guid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * draws link-range and hack-range circles around the portal with the
      * given details. Clear them if parameter 'd' is null.
      */
    inline def setPortalIndicators(p: Portal): Unit = js.Dynamic.global.applyDynamic("setPortalIndicators")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
