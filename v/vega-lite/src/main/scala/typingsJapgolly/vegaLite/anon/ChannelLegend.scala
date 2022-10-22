package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcChannelMod.NonPositionScaleChannel
import typingsJapgolly.vegaLite.buildSrcLegendMod.LegendInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelLegend extends StObject {
  
  var channel: NonPositionScaleChannel
  
  var legend: LegendInternal
  
  var scaleType: typingsJapgolly.vegaLite.buildSrcScaleMod.ScaleType
  
  var timeUnit: js.UndefOr[typingsJapgolly.vegaLite.buildSrcTimeunitMod.TimeUnit] = js.undefined
}
object ChannelLegend {
  
  inline def apply(
    channel: NonPositionScaleChannel,
    legend: LegendInternal,
    scaleType: typingsJapgolly.vegaLite.buildSrcScaleMod.ScaleType
  ): ChannelLegend = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelLegend]
  }
  
  extension [Self <: ChannelLegend](x: Self) {
    
    inline def setChannel(value: NonPositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: LegendInternal): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: typingsJapgolly.vegaLite.buildSrcScaleMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setTimeUnit(value: typingsJapgolly.vegaLite.buildSrcTimeunitMod.TimeUnit): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
  }
}
