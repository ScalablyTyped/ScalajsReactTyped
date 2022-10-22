package typingsJapgolly.vegaLite.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vegaLite.buildSrcChannelMod.PolarPositionChannel
import typingsJapgolly.vegaLite.buildSrcChannelMod.PositionChannel
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.ChannelDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.OrderFieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.SecondaryChannelDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typingsJapgolly.vegaLite.buildSrcCompileScaleComponentMod.ScaleComponent
import typingsJapgolly.vegaLite.buildSrcStackMod.StackProperties
import typingsJapgolly.vegaLite.buildSrcTypeMod.StandardType
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/compile/mark/encode/valueref.MidPointParams & {  channel :vega-lite.vega-lite/build/src/channel.PositionChannel | vega-lite.vega-lite/build/src/channel.PolarPositionChannel} */
trait MidPointParamschannelPosi extends StObject {
  
  var bandPosition: js.UndefOr[Double | SignalRef] = js.undefined
  
  var channel: typingsJapgolly.vegaLite.buildSrcChannelMod.Channel & (PositionChannel | PolarPositionChannel)
  
  var channel2Def: js.UndefOr[SecondaryChannelDef[String]] = js.undefined
  
  var channelDef: ChannelDef[String]
  
  var config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[SignalRef]
  
  var defaultRef: VgValueRef | js.Function0[VgValueRef]
  
  var markDef: typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef[typingsJapgolly.vegaLite.buildSrcMarkMod.Mark, SignalRef]
  
  var offset: js.UndefOr[Double | SignalRef | VgValueRef] = js.undefined
  
  var scale: ScaleComponent
  
  var scaleName: String
  
  var stack: js.UndefOr[StackProperties] = js.undefined
}
object MidPointParamschannelPosi {
  
  inline def apply(
    channel: typingsJapgolly.vegaLite.buildSrcChannelMod.Channel & (PositionChannel | PolarPositionChannel),
    config: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[SignalRef],
    defaultRef: VgValueRef | js.Function0[VgValueRef],
    markDef: typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef[typingsJapgolly.vegaLite.buildSrcMarkMod.Mark, SignalRef],
    scale: ScaleComponent,
    scaleName: String
  ): MidPointParamschannelPosi = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], defaultRef = defaultRef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidPointParamschannelPosi]
  }
  
  extension [Self <: MidPointParamschannelPosi](x: Self) {
    
    inline def setBandPosition(value: Double | SignalRef): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
    
    inline def setChannel(
      value: typingsJapgolly.vegaLite.buildSrcChannelMod.Channel & (PositionChannel | PolarPositionChannel)
    ): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannel2Def(value: SecondaryChannelDef[String]): Self = StObject.set(x, "channel2Def", value.asInstanceOf[js.Any])
    
    inline def setChannel2DefUndefined: Self = StObject.set(x, "channel2Def", js.undefined)
    
    inline def setChannelDef(value: ChannelDef[String]): Self = StObject.set(x, "channelDef", value.asInstanceOf[js.Any])
    
    inline def setChannelDefNull: Self = StObject.set(x, "channelDef", null)
    
    inline def setChannelDefUndefined: Self = StObject.set(x, "channelDef", js.undefined)
    
    inline def setChannelDefVarargs(
      value: ((FieldDefWithoutScale[String, StandardType]) | OrderFieldDef[String] | StringFieldDef[String])*
    ): Self = StObject.set(x, "channelDef", js.Array(value*))
    
    inline def setConfig(value: typingsJapgolly.vegaLite.buildSrcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDefaultRef(value: VgValueRef | js.Function0[VgValueRef]): Self = StObject.set(x, "defaultRef", value.asInstanceOf[js.Any])
    
    inline def setDefaultRefCallbackTo(value: CallbackTo[VgValueRef]): Self = StObject.set(x, "defaultRef", value.toJsFn)
    
    inline def setMarkDef(
      value: typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef[typingsJapgolly.vegaLite.buildSrcMarkMod.Mark, SignalRef]
    ): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double | SignalRef | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setScale(value: ScaleComponent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
    
    inline def setStack(value: StackProperties): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
