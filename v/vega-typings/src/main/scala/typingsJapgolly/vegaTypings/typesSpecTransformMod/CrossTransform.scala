package typingsJapgolly.vegaTypings.typesSpecTransformMod

import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.typesSpecUtilMod.Vector2
import typingsJapgolly.vegaTypings.vegaTypingsStrings.cross
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var filter: js.UndefOr[ExprString] = js.undefined
  
  var `type`: cross
}
object CrossTransform {
  
  inline def apply(): CrossTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("cross")
    __obj.asInstanceOf[CrossTransform]
  }
  
  extension [Self <: CrossTransform](x: Self) {
    
    inline def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setFilter(value: ExprString): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setType(value: cross): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
