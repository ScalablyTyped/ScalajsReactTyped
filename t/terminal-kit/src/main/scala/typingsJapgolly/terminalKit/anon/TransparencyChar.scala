package typingsJapgolly.terminalKit.anon

import typingsJapgolly.terminalKit.screenBufferMod.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransparencyChar extends StObject {
  
  var attr: Double | Attributes
  
  var transparencyChar: String
  
  var transparencyType: Double
}
object TransparencyChar {
  
  inline def apply(attr: Double | Attributes, transparencyChar: String, transparencyType: Double): TransparencyChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], transparencyChar = transparencyChar.asInstanceOf[js.Any], transparencyType = transparencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransparencyChar]
  }
  
  extension [Self <: TransparencyChar](x: Self) {
    
    inline def setAttr(value: Double | Attributes): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setTransparencyChar(value: String): Self = StObject.set(x, "transparencyChar", value.asInstanceOf[js.Any])
    
    inline def setTransparencyType(value: Double): Self = StObject.set(x, "transparencyType", value.asInstanceOf[js.Any])
  }
}
