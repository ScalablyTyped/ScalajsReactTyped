package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Band
  extends StObject
     with ScaledValueRef[Any] {
  
  var band: Boolean | Double
  
  var scale: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field
}
object Band {
  
  inline def apply(band: Boolean | Double, scale: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Band]
  }
  
  extension [Self <: Band](x: Self) {
    
    inline def setBand(value: Boolean | Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setScale(value: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
