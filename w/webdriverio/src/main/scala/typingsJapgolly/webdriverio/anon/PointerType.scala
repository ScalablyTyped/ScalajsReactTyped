package typingsJapgolly.webdriverio.anon

import typingsJapgolly.webdriverio.webdriverioStrings.mouse
import typingsJapgolly.webdriverio.webdriverioStrings.pen
import typingsJapgolly.webdriverio.webdriverioStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerType extends StObject {
  
  var pointerType: mouse | pen | touch
}
object PointerType {
  
  inline def apply(pointerType: mouse | pen | touch): PointerType = {
    val __obj = js.Dynamic.literal(pointerType = pointerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerType]
  }
  
  extension [Self <: PointerType](x: Self) {
    
    inline def setPointerType(value: mouse | pen | touch): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
  }
}
