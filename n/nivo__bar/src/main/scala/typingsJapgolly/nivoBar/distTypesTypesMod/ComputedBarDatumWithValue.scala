package typingsJapgolly.nivoBar.distTypesTypesMod

import typingsJapgolly.nivoBar.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedBarDatumWithValue[RawDatum]
  extends StObject
     with ComputedBarDatum[RawDatum] {
  
  @JSName("data")
  var data_ComputedBarDatumWithValue: ComputedDatum[RawDatum] & Value
}
object ComputedBarDatumWithValue {
  
  inline def apply[RawDatum](
    absX: Double,
    absY: Double,
    color: String,
    data: ComputedDatum[RawDatum] & Value,
    height: Double,
    index: Double,
    key: String,
    label: String,
    width: Double,
    x: Double,
    y: Double
  ): ComputedBarDatumWithValue[RawDatum] = {
    val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedBarDatumWithValue[RawDatum]]
  }
  
  extension [Self <: ComputedBarDatumWithValue[?], RawDatum](x: Self & ComputedBarDatumWithValue[RawDatum]) {
    
    inline def setData(value: ComputedDatum[RawDatum] & Value): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
