package typingsJapgolly.steamUser.anon

import typingsJapgolly.std.Record
import typingsJapgolly.steamid.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Servers extends StObject {
  
  var servers: Record[String, ^]
}
object Servers {
  
  inline def apply(servers: Record[String, ^]): Servers = {
    val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Servers]
  }
  
  extension [Self <: Servers](x: Self) {
    
    inline def setServers(value: Record[String, ^]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
  }
}
