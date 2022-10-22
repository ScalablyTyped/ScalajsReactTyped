package typingsJapgolly.expo

import org.scalajs.dom.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLogsRemoteConsoleMod {
  
  @JSImport("expo/build/logs/RemoteConsole", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRemoteConsole(originalConsole: Console): Console = ^.asInstanceOf[js.Dynamic].applyDynamic("createRemoteConsole")(originalConsole.asInstanceOf[js.Any]).asInstanceOf[Console]
}
