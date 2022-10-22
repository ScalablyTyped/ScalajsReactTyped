package typingsJapgolly.tailwindcss.anon

import typingsJapgolly.tailwindcss.typesConfigMod.Screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max
  extends StObject
     with Screen {
  
  var max: String
}
object Max {
  
  inline def apply(max: String): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
