package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign1
import typingsJapgolly.baseui.baseuiStrings.US
import typingsJapgolly.baseui.baseuiStrings.`United States`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `241` extends StObject {
  
  val dialCode: Plussign1
  
  val id: US
  
  val label: `United States`
}
object `241` {
  
  inline def apply(): `241` = {
    val __obj = js.Dynamic.literal(dialCode = "+1", id = "US", label = "United States")
    __obj.asInstanceOf[`241`]
  }
  
  extension [Self <: `241`](x: Self) {
    
    inline def setDialCode(value: Plussign1): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: US): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `United States`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
