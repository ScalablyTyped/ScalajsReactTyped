package typingsJapgolly.nivoBar.anon

import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.BarsWithHidden
import typingsJapgolly.nivoBar.distTypesTypesMod.LegendLabelDatum
import typingsJapgolly.nivoBar.nivoBarStrings.indexes
import typingsJapgolly.nivoBar.nivoBarStrings.keys
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction[RawDatum /* <: BarDatum */] extends StObject {
  
  var bars: BarsWithHidden[RawDatum]
  
  var direction: LegendDirection
  
  var from: indexes | keys
  
  var legendLabel: js.UndefOr[PropertyAccessor[LegendLabelDatum[RawDatum], String]] = js.undefined
}
object Direction {
  
  inline def apply[RawDatum /* <: BarDatum */](bars: BarsWithHidden[RawDatum], direction: LegendDirection, from: indexes | keys): Direction[RawDatum] = {
    val __obj = js.Dynamic.literal(bars = bars.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction[RawDatum]]
  }
  
  extension [Self <: Direction[?], RawDatum /* <: BarDatum */](x: Self & Direction[RawDatum]) {
    
    inline def setBars(value: BarsWithHidden[RawDatum]): Self = StObject.set(x, "bars", value.asInstanceOf[js.Any])
    
    inline def setBarsVarargs(value: (Partialkeystringxnumberyn & `0`[RawDatum])*): Self = StObject.set(x, "bars", js.Array(value*))
    
    inline def setDirection(value: LegendDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: indexes | keys): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setLegendLabel(value: PropertyAccessor[LegendLabelDatum[RawDatum], String]): Self = StObject.set(x, "legendLabel", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelFunction1(value: LegendLabelDatum[RawDatum] => String): Self = StObject.set(x, "legendLabel", js.Any.fromFunction1(value))
    
    inline def setLegendLabelUndefined: Self = StObject.set(x, "legendLabel", js.undefined)
  }
}
