package typingsJapgolly.jestTypes.anon

import typingsJapgolly.jestTypes.jestTypesStrings.teardown
import typingsJapgolly.jestTypes.mod.AsyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`
  extends StObject
     with AsyncEvent {
  
  var name: teardown
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(name = "teardown")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setName(value: teardown): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
