package typingsJapgolly.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentGray extends StObject {
  
  var accent: Gray
}
object AccentGray {
  
  inline def apply(accent: Gray): AccentGray = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentGray]
  }
  
  extension [Self <: AccentGray](x: Self) {
    
    inline def setAccent(value: Gray): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
