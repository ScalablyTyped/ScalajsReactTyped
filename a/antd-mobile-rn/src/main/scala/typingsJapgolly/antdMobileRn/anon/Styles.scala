package typingsJapgolly.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Styles extends StObject {
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object Styles {
  
  inline def apply(styles: StringDictionary[RegisteredStyle[Any]]): Styles = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
  
  extension [Self <: Styles](x: Self) {
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
