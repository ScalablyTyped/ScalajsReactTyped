package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMHatchFill
  extends StObject
     with CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The line symbol that is used to draw the hatch lines in the fill.
    */
  var lineSymbol: js.UndefOr[CIMLineSymbol] = js.undefined
  
  /**
    * How much to move the stroke to a new X-position.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * How much to move the stroke to a new Y-position.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * The angle of rotation for all the strokes, in degrees.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance between the line symbols in the hatch pattern.
    */
  var separation: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMHatchFill: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMHatchFill
}
object CIMHatchFill {
  
  inline def apply(): CIMHatchFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMHatchFill")
    __obj.asInstanceOf[CIMHatchFill]
  }
  
  extension [Self <: CIMHatchFill](x: Self) {
    
    inline def setLineSymbol(value: CIMLineSymbol): Self = StObject.set(x, "lineSymbol", value.asInstanceOf[js.Any])
    
    inline def setLineSymbolUndefined: Self = StObject.set(x, "lineSymbol", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSeparation(value: Double): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    inline def setSeparationUndefined: Self = StObject.set(x, "separation", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMHatchFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
