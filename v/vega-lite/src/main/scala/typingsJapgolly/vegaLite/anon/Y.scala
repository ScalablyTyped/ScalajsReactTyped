package typingsJapgolly.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  val x: typingsJapgolly.vegaLite.vegaLiteInts.`1`
  
  val y: typingsJapgolly.vegaLite.vegaLiteInts.`1`
}
object Y {
  
  inline def apply(): Y = {
    val __obj = js.Dynamic.literal(x = 1, y = 1)
    __obj.asInstanceOf[Y]
  }
  
  extension [Self <: Y](x: Self) {
    
    inline def setX(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: typingsJapgolly.vegaLite.vegaLiteInts.`1`): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
