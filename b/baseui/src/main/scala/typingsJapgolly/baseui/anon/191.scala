package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.KN
import typingsJapgolly.baseui.baseuiStrings.Plussign1869
import typingsJapgolly.baseui.baseuiStrings.`Saint Kitts and Nevis`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `191` extends StObject {
  
  val dialCode: Plussign1869
  
  val id: KN
  
  val label: `Saint Kitts and Nevis`
}
object `191` {
  
  inline def apply(): `191` = {
    val __obj = js.Dynamic.literal(dialCode = "+1869", id = "KN", label = "Saint Kitts and Nevis")
    __obj.asInstanceOf[`191`]
  }
  
  extension [Self <: `191`](x: Self) {
    
    inline def setDialCode(value: Plussign1869): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: KN): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Saint Kitts and Nevis`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
