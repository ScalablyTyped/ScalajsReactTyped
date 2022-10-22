package typingsJapgolly.vegaTypings.typesSpecScaleMod

import typingsJapgolly.vegaTypings.vegaTypingsStrings.sqrt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqrtScale
  extends StObject
     with NumericScale
     with Scale {
  
  @JSName("type")
  var type_SqrtScale: sqrt
}
object SqrtScale {
  
  inline def apply(name: String): SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sqrt")
    __obj.asInstanceOf[SqrtScale]
  }
  
  extension [Self <: SqrtScale](x: Self) {
    
    inline def setType(value: sqrt): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
