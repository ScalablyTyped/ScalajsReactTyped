package typingsJapgolly.baseui.themesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontTokens extends StObject {
  
  var primaryFontFamily: String
}
object FontTokens {
  
  inline def apply(primaryFontFamily: String): FontTokens = {
    val __obj = js.Dynamic.literal(primaryFontFamily = primaryFontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontTokens]
  }
  
  extension [Self <: FontTokens](x: Self) {
    
    inline def setPrimaryFontFamily(value: String): Self = StObject.set(x, "primaryFontFamily", value.asInstanceOf[js.Any])
  }
}
