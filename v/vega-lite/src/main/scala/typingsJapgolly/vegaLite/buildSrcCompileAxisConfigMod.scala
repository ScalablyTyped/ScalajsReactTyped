package typingsJapgolly.vegaLite

import typingsJapgolly.std.Partial
import typingsJapgolly.std.ReturnType
import typingsJapgolly.vegaLite.anon.AxisConfigStyle
import typingsJapgolly.vegaLite.anon.ConfigFrom
import typingsJapgolly.vegaLite.buildSrcChannelMod.PositionScaleChannel
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcConfigMod.StyleConfigIndex
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleType
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileAxisConfigMod {
  
  @JSImport("vega-lite/build/src/compile/axis/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79, starting with typingsJapgolly.vegaLite.vegaLiteStrings.title, typingsJapgolly.vegaLite.vegaLiteStrings.format, typingsJapgolly.vegaLite.vegaLiteStrings.formatType */ Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  inline def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79, starting with typingsJapgolly.vegaLite.vegaLiteStrings.title, typingsJapgolly.vegaLite.vegaLiteStrings.format, typingsJapgolly.vegaLite.vegaLiteStrings.formatType */ Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String,
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any], axisConfigs.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  inline def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79, starting with typingsJapgolly.vegaLite.vegaLiteStrings.title, typingsJapgolly.vegaLite.vegaLiteStrings.format, typingsJapgolly.vegaLite.vegaLiteStrings.formatType */ Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String]
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  inline def getAxisConfig(
    property: /* keyof vega-lite.vega-lite/build/src/axis.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79, starting with typingsJapgolly.vegaLite.vegaLiteStrings.title, typingsJapgolly.vegaLite.vegaLiteStrings.format, typingsJapgolly.vegaLite.vegaLiteStrings.formatType */ Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String],
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any], axisConfigs.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  
  inline def getAxisConfigStyle(axisConfigTypes: js.Array[String], config: Config[ExprRef | SignalRef]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfigStyle")(axisConfigTypes.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: String,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfigs")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], orient.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AxisConfigStyle]
  inline def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: SignalRef,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfigs")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], orient.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AxisConfigStyle]
  
  type AxisConfigs = ReturnType[
    js.Function4[
      /* channel */ PositionScaleChannel, 
      /* scaleType */ ScaleType, 
      /* orient */ String | SignalRef, 
      /* config */ Config[ExprRef | SignalRef], 
      AxisConfigStyle
    ]
  ]
}
