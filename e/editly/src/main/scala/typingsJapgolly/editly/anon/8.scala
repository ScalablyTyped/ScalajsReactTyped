package typingsJapgolly.editly.anon

import typingsJapgolly.editly.editlyStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var `type`: image
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
