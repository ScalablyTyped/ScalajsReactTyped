package typingsJapgolly.uapiJson

import typingsJapgolly.uapiJson.anon.CloseSession
import typingsJapgolly.uapiJson.libSettingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTerminalMod {
  
  @JSImport("uapi-json/lib/Terminal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTerminalService(Settings: Settings): CloseSession = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminalService")(Settings.asInstanceOf[js.Any]).asInstanceOf[CloseSession]
}
