package typingsJapgolly.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeMark extends StObject {
  
  var themeMark: String
}
object ThemeMark {
  
  inline def apply(themeMark: String): ThemeMark = {
    val __obj = js.Dynamic.literal(themeMark = themeMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeMark]
  }
  
  extension [Self <: ThemeMark](x: Self) {
    
    inline def setThemeMark(value: String): Self = StObject.set(x, "themeMark", value.asInstanceOf[js.Any])
  }
}
