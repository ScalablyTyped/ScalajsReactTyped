package typingsJapgolly.expo

import org.scalajs.dom.raw.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/logs/RemoteConsole", JSImport.Namespace)
@js.native
object buildLogsRemoteConsoleMod extends js.Object {
  @js.native
  object default extends js.Object {
    var createRemoteConsole: js.Function1[/* originalConsole */ Console, Console] = js.native
  }
  
}

