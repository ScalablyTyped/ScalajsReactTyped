package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvdName extends StObject {
  
  var avdName: String
}
object AvdName {
  
  inline def apply(avdName: String): AvdName = {
    val __obj = js.Dynamic.literal(avdName = avdName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvdName]
  }
  
  extension [Self <: AvdName](x: Self) {
    
    inline def setAvdName(value: String): Self = StObject.set(x, "avdName", value.asInstanceOf[js.Any])
  }
}
