package typingsJapgolly.vegaLite

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vegaLite.anon.FieldGroup
import typingsJapgolly.vegaLite.anon.FieldOrDatumDef2
import typingsJapgolly.vegaLite.anon.FieldTest
import typingsJapgolly.vegaLite.anon.MidPointParamschannelPosi
import typingsJapgolly.vegaLite.anon.Offset
import typingsJapgolly.vegaLite.anon.Ref
import typingsJapgolly.vegaLite.anon.TestValue
import typingsJapgolly.vegaLite.anon.`5`
import typingsJapgolly.vegaLite.buildSrcBinMod.Bin
import typingsJapgolly.vegaLite.buildSrcChannelMod.Channel
import typingsJapgolly.vegaLite.buildSrcChannelMod.PolarPositionChannel
import typingsJapgolly.vegaLite.buildSrcChannelMod.PositionChannel
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.ChannelDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.DatumDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDefBase
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldDefWithoutScale
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldName
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldRefOption
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.OrderFieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.PrimitiveValue
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.SecondaryChannelDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.StringFieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Value
import typingsJapgolly.vegaLite.buildSrcCompileScaleComponentMod.ScaleComponent
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcDatetimeMod.DateTime
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcMarkMod.Mark
import typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef
import typingsJapgolly.vegaLite.buildSrcStackMod.StackProperties
import typingsJapgolly.vegaLite.buildSrcTypeMod.StandardType
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodeValuerefMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def datumDefToExpr(datumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("datumDefToExpr")(datumDef.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fieldInvalidPredicate(field: FieldDef[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidPredicate")(field.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fieldInvalidPredicate(field: FieldDef[String, Any], invalid: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidPredicate")(field.asInstanceOf[js.Any], invalid.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def fieldInvalidPredicate(field: FieldName): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidPredicate")(field.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fieldInvalidPredicate(field: FieldName, invalid: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidPredicate")(field.asInstanceOf[js.Any], invalid.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fieldInvalidTestValueRef(fieldDef: FieldDef[String, Any], channel: PolarPositionChannel): FieldTest | TestValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidTestValueRef")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[FieldTest | TestValue]
  inline def fieldInvalidTestValueRef(fieldDef: FieldDef[String, Any], channel: PositionChannel): FieldTest | TestValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldInvalidTestValueRef")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[FieldTest | TestValue]
  
  inline def interpolatedSignalRef(hasScaleNameFieldOrDatumDefFieldOrDatumDef2OffsetStartSuffixBandPosition: FieldOrDatumDef2): VgValueRef = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolatedSignalRef")(hasScaleNameFieldOrDatumDefFieldOrDatumDef2OffsetStartSuffixBandPosition.asInstanceOf[js.Any]).asInstanceOf[VgValueRef]
  
  inline def midPoint(
    hasChannelChannelDefChannel2DefMarkDefConfigScaleNameScaleStackOffsetDefaultRefBandPosition: MidPointParams
  ): VgValueRef = ^.asInstanceOf[js.Dynamic].applyDynamic("midPoint")(hasChannelChannelDefChannel2DefMarkDefConfigScaleNameScaleStackOffsetDefaultRefBandPosition.asInstanceOf[js.Any]).asInstanceOf[VgValueRef]
  
  inline def midPointRefWithPositionInvalidTest(params: MidPointParamschannelPosi): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("midPointRefWithPositionInvalidTest")(params.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
  
  inline def valueRefForFieldOrDatumDef(
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleName: String,
    opt: FieldRefOption,
    encode: Offset
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("valueRefForFieldOrDatumDef")(fieldDef.asInstanceOf[js.Any], scaleName.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def valueRefForFieldOrDatumDef(fieldDef: FieldDefBase[String, Bin], scaleName: String, opt: FieldRefOption, encode: Offset): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("valueRefForFieldOrDatumDef")(fieldDef.asInstanceOf[js.Any], scaleName.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  
  inline def widthHeightValueOrSignalRef(channel: Channel, value: Value[ExprRef | SignalRef]): SignalRef | `5` | FieldGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("widthHeightValueOrSignalRef")(channel.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[SignalRef | `5` | FieldGroup]
  inline def widthHeightValueOrSignalRef(channel: Channel, value: SignalRef): SignalRef | `5` | FieldGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("widthHeightValueOrSignalRef")(channel.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[SignalRef | `5` | FieldGroup]
  
  inline def wrapPositionInvalidTest(hasFieldDefChannelMarkDefRefConfig: Ref): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapPositionInvalidTest")(hasFieldDefChannelMarkDefRefConfig.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
  
  trait MidPointParams extends StObject {
    
    var bandPosition: js.UndefOr[Double | SignalRef] = js.undefined
    
    var channel: Channel
    
    var channel2Def: js.UndefOr[SecondaryChannelDef[String]] = js.undefined
    
    var channelDef: ChannelDef[String]
    
    var config: Config[SignalRef]
    
    var defaultRef: VgValueRef | js.Function0[VgValueRef]
    
    var markDef: MarkDef[Mark, SignalRef]
    
    var offset: js.UndefOr[Double | SignalRef | VgValueRef] = js.undefined
    
    var scale: ScaleComponent
    
    var scaleName: String
    
    var stack: js.UndefOr[StackProperties] = js.undefined
  }
  object MidPointParams {
    
    inline def apply(
      channel: Channel,
      config: Config[SignalRef],
      defaultRef: VgValueRef | js.Function0[VgValueRef],
      markDef: MarkDef[Mark, SignalRef],
      scale: ScaleComponent,
      scaleName: String
    ): MidPointParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], defaultRef = defaultRef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MidPointParams]
    }
    
    extension [Self <: MidPointParams](x: Self) {
      
      inline def setBandPosition(value: Double | SignalRef): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannel2Def(value: SecondaryChannelDef[String]): Self = StObject.set(x, "channel2Def", value.asInstanceOf[js.Any])
      
      inline def setChannel2DefUndefined: Self = StObject.set(x, "channel2Def", js.undefined)
      
      inline def setChannelDef(value: ChannelDef[String]): Self = StObject.set(x, "channelDef", value.asInstanceOf[js.Any])
      
      inline def setChannelDefNull: Self = StObject.set(x, "channelDef", null)
      
      inline def setChannelDefUndefined: Self = StObject.set(x, "channelDef", js.undefined)
      
      inline def setChannelDefVarargs(
        value: ((FieldDefWithoutScale[String, StandardType]) | OrderFieldDef[String] | StringFieldDef[String])*
      ): Self = StObject.set(x, "channelDef", js.Array(value*))
      
      inline def setConfig(value: Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDefaultRef(value: VgValueRef | js.Function0[VgValueRef]): Self = StObject.set(x, "defaultRef", value.asInstanceOf[js.Any])
      
      inline def setDefaultRefCallbackTo(value: CallbackTo[VgValueRef]): Self = StObject.set(x, "defaultRef", value.toJsFn)
      
      inline def setMarkDef(value: MarkDef[Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double | SignalRef | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setScale(value: ScaleComponent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
      
      inline def setStack(value: StackProperties): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
