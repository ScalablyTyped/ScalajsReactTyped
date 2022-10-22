package typingsJapgolly.expoPrebuildConfig.anon

import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.backgroundColor
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.systemBackgroundColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemColor extends StObject {
  
  var key: String | backgroundColor
  
  var systemColor: String | systemBackgroundColor
}
object SystemColor {
  
  inline def apply(key: String | backgroundColor, systemColor: String | systemBackgroundColor): SystemColor = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], systemColor = systemColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemColor]
  }
  
  extension [Self <: SystemColor](x: Self) {
    
    inline def setKey(value: String | backgroundColor): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSystemColor(value: String | systemBackgroundColor): Self = StObject.set(x, "systemColor", value.asInstanceOf[js.Any])
  }
}
