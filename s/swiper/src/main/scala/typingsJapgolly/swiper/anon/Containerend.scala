package typingsJapgolly.swiper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Containerend extends StObject {
  
  var default: VirtualData
}
object Containerend {
  
  inline def apply(default: VirtualData): Containerend = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Containerend]
  }
  
  extension [Self <: Containerend](x: Self) {
    
    inline def setDefault(value: VirtualData): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
