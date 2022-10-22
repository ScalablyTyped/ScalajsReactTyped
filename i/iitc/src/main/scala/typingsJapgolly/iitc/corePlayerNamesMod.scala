package typingsJapgolly.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePlayerNamesMod {
  
  object global {
    
    /**
      * test to see if a specific player GUID is a special system account (e.g. __JARVIS__, __ADA__) that shouldn't be listed as a player
      */
    inline def isSystemPlayer(name: String): Boolean = js.Dynamic.global.applyDynamic("isSystemPlayer")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
