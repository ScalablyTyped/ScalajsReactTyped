package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.TcpListenOptions
  - typingsJapgolly.fridaGum.UnixListenOptions
*/
trait SocketListenOptions extends StObject
object SocketListenOptions {
  
  inline def TcpListenOptions(): typingsJapgolly.fridaGum.TcpListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.fridaGum.TcpListenOptions]
  }
  
  inline def UnixListenOptions(path: String): typingsJapgolly.fridaGum.UnixListenOptions = {
    val __obj = js.Dynamic.literal(family = "unix", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.UnixListenOptions]
  }
}
