package typingsJapgolly.d3pie.anon

import typingsJapgolly.d3pie.d3pieStrings.`label-percentage1`
import typingsJapgolly.d3pie.d3pieStrings.`label-percentage2`
import typingsJapgolly.d3pie.d3pieStrings.`label-value1`
import typingsJapgolly.d3pie.d3pieStrings.`label-value2`
import typingsJapgolly.d3pie.d3pieStrings.label
import typingsJapgolly.d3pie.d3pieStrings.percentage
import typingsJapgolly.d3pie.d3pieStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  pieDistance :number | undefined} & d3pie.d3pie.ID3PieLabelsOptions */
trait pieDistancenumberundefine extends StObject {
  
  var format: js.UndefOr[
    label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
  ] = js.undefined
  
  var hideWhenLessThanPercentage: js.UndefOr[Double] = js.undefined
  
  var pieDistance: js.UndefOr[Double] = js.undefined
}
object pieDistancenumberundefine {
  
  inline def apply(): pieDistancenumberundefine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pieDistancenumberundefine]
  }
  
  extension [Self <: pieDistancenumberundefine](x: Self) {
    
    inline def setFormat(
      value: label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHideWhenLessThanPercentage(value: Double): Self = StObject.set(x, "hideWhenLessThanPercentage", value.asInstanceOf[js.Any])
    
    inline def setHideWhenLessThanPercentageUndefined: Self = StObject.set(x, "hideWhenLessThanPercentage", js.undefined)
    
    inline def setPieDistance(value: Double): Self = StObject.set(x, "pieDistance", value.asInstanceOf[js.Any])
    
    inline def setPieDistanceUndefined: Self = StObject.set(x, "pieDistance", js.undefined)
  }
}
