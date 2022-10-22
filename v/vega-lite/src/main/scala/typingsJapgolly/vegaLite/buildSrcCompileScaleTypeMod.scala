package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcBinMod.BinParams
import typingsJapgolly.vegaLite.buildSrcChannelMod.ScaleChannel
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.DatumDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.PrimitiveValue
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typingsJapgolly.vegaLite.buildSrcDatetimeMod.DateTime
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcMarkMod.Mark
import typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef
import typingsJapgolly.vegaLite.buildSrcScaleMod.Scale
import typingsJapgolly.vegaLite.buildSrcScaleMod.ScaleType
import typingsJapgolly.vegaLite.vegaLiteStrings.binned
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileScaleTypeMod {
  
  @JSImport("vega-lite/build/src/compile/scale/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scaleType(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: ScaleChannel,
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    mark: MarkDef[Mark, ExprRef | SignalRef]
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  inline def scaleType(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: ScaleChannel,
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    mark: MarkDef[Mark, ExprRef | SignalRef],
    hasNestedOffsetScale: Boolean
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  
  inline def scaleType_binned(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: ScaleChannel,
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    mark: MarkDef[Mark, ExprRef | SignalRef]
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  inline def scaleType_binned(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: ScaleChannel,
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    mark: MarkDef[Mark, ExprRef | SignalRef],
    hasNestedOffsetScale: Boolean
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.continuous
    - typingsJapgolly.vegaLite.vegaLiteStrings.discrete
    - typingsJapgolly.vegaLite.vegaLiteStrings.flexible
    - scala.Unit
  */
  type RangeType = js.UndefOr[_RangeType]
  
  trait _RangeType extends StObject
}
