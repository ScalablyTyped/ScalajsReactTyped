package typingsJapgolly.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Full extends StObject {
  
  var full: Boolean
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object Full {
  
  inline def apply(full: Boolean, styles: StringDictionary[RegisteredStyle[Any]]): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  extension [Self <: Full](x: Self) {
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
