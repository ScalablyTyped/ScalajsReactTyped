package typingsJapgolly.p2.anon

import typingsJapgolly.p2.p2Strings.postStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `type`: postStep
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("postStep")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setType(value: postStep): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
