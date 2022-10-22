package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Portrait extends StObject {
  
  var portrait: Height
}
object Portrait {
  
  inline def apply(portrait: Height): Portrait = {
    val __obj = js.Dynamic.literal(portrait = portrait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Portrait]
  }
  
  extension [Self <: Portrait](x: Self) {
    
    inline def setPortrait(value: Height): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
  }
}
