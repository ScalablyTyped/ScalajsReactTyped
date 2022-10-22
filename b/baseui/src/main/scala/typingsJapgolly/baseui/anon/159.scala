package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.NR
import typingsJapgolly.baseui.baseuiStrings.Nauru
import typingsJapgolly.baseui.baseuiStrings.Plussign674
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `159` extends StObject {
  
  val dialCode: Plussign674
  
  val id: NR
  
  val label: Nauru
}
object `159` {
  
  inline def apply(): `159` = {
    val __obj = js.Dynamic.literal(dialCode = "+674", id = "NR", label = "Nauru")
    __obj.asInstanceOf[`159`]
  }
  
  extension [Self <: `159`](x: Self) {
    
    inline def setDialCode(value: Plussign674): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: NR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Nauru): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
