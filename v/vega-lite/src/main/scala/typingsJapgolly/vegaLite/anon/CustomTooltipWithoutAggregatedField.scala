package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.StringFieldDefWithCondition
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.StringValueDefWithCondition
import typingsJapgolly.vegaLite.buildSrcTypeMod.StandardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTooltipWithoutAggregatedField[F /* <: typingsJapgolly.vegaLite.buildSrcChanneldefMod.Field */] extends StObject {
  
  var customTooltipWithoutAggregatedField: js.UndefOr[
    StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
  ] = js.undefined
  
  var filteredEncoding: typingsJapgolly.vegaLite.buildSrcEncodingMod.Encoding[F]
}
object CustomTooltipWithoutAggregatedField {
  
  inline def apply[F /* <: typingsJapgolly.vegaLite.buildSrcChanneldefMod.Field */](filteredEncoding: typingsJapgolly.vegaLite.buildSrcEncodingMod.Encoding[F]): CustomTooltipWithoutAggregatedField[F] = {
    val __obj = js.Dynamic.literal(filteredEncoding = filteredEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTooltipWithoutAggregatedField[F]]
  }
  
  extension [Self <: CustomTooltipWithoutAggregatedField[?], F /* <: typingsJapgolly.vegaLite.buildSrcChanneldefMod.Field */](x: Self & CustomTooltipWithoutAggregatedField[F]) {
    
    inline def setCustomTooltipWithoutAggregatedField(
      value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
    ): Self = StObject.set(x, "customTooltipWithoutAggregatedField", value.asInstanceOf[js.Any])
    
    inline def setCustomTooltipWithoutAggregatedFieldUndefined: Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.undefined)
    
    inline def setCustomTooltipWithoutAggregatedFieldVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.Array(value*))
    
    inline def setFilteredEncoding(value: typingsJapgolly.vegaLite.buildSrcEncodingMod.Encoding[F]): Self = StObject.set(x, "filteredEncoding", value.asInstanceOf[js.Any])
  }
}
