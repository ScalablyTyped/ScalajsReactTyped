package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcChannelMod.PolarPositionScaleChannel
import typingsJapgolly.vegaLite.buildSrcChannelMod.PositionScaleChannel
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.ChannelDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.OrderFieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.SecondaryChannelDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typingsJapgolly.vegaLite.buildSrcTypeMod.StandardType
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  var channel: PositionScaleChannel | PolarPositionScaleChannel
  
  var config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[SignalRef]
  
  var fieldDef: ChannelDef[String]
  
  var fieldDef2: js.UndefOr[SecondaryChannelDef[String]] = js.undefined
  
  var markDef: typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef[typingsJapgolly.vegaLite.buildSrcMarkMod.Mark, SignalRef]
  
  var scaleType: typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleType
  
  var useVlSizeChannel: js.UndefOr[Boolean] = js.undefined
}
object Channel {
  
  inline def apply(
    channel: PositionScaleChannel | PolarPositionScaleChannel,
    config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[SignalRef],
    markDef: typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef[typingsJapgolly.vegaLite.buildSrcMarkMod.Mark, SignalRef],
    scaleType: typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleType
  ): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setChannel(value: PositionScaleChannel | PolarPositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(value: ChannelDef[String]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setFieldDef2(value: SecondaryChannelDef[String]): Self = StObject.set(x, "fieldDef2", value.asInstanceOf[js.Any])
    
    inline def setFieldDef2Undefined: Self = StObject.set(x, "fieldDef2", js.undefined)
    
    inline def setFieldDefNull: Self = StObject.set(x, "fieldDef", null)
    
    inline def setFieldDefUndefined: Self = StObject.set(x, "fieldDef", js.undefined)
    
    inline def setFieldDefVarargs(
      value: ((FieldDefWithoutScale[String, StandardType]) | OrderFieldDef[String] | StringFieldDef[String])*
    ): Self = StObject.set(x, "fieldDef", js.Array(value*))
    
    inline def setMarkDef(
      value: typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef[typingsJapgolly.vegaLite.buildSrcMarkMod.Mark, SignalRef]
    ): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setUseVlSizeChannel(value: Boolean): Self = StObject.set(x, "useVlSizeChannel", value.asInstanceOf[js.Any])
    
    inline def setUseVlSizeChannelUndefined: Self = StObject.set(x, "useVlSizeChannel", js.undefined)
  }
}
