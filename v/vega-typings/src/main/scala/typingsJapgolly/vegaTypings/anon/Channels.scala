package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.std.Record
import typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channels extends StObject {
  
  var channels: Record[String, expr]
  
  var marktype: String
}
object Channels {
  
  inline def apply(channels: Record[String, expr], marktype: String): Channels = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channels]
  }
  
  extension [Self <: Channels](x: Self) {
    
    inline def setChannels(value: Record[String, expr]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setMarktype(value: String): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
  }
}
