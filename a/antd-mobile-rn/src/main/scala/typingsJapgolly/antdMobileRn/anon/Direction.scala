package typingsJapgolly.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: String
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object Direction {
  
  inline def apply(direction: String, styles: StringDictionary[RegisteredStyle[Any]]): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
