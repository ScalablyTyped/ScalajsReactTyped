package typingsJapgolly.vegaLite

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.vegaLite.anon.ContinuousAxis
import typingsJapgolly.vegaLite.anon.CustomTooltipWithoutAggregatedField
import typingsJapgolly.vegaLite.anon.EndPositionPrefix
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Field
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.PositionFieldDef
import typingsJapgolly.vegaLite.buildSrcCompositemarkMod.CompositeMark
import typingsJapgolly.vegaLite.buildSrcCompositemarkMod.CompositeMarkDef
import typingsJapgolly.vegaLite.buildSrcEncodingMod.Encoding
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcMarkMod.ColorMixins
import typingsJapgolly.vegaLite.buildSrcMarkMod.GenericMarkDef
import typingsJapgolly.vegaLite.buildSrcMarkMod.MarkConfig
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionParameter
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionType
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typingsJapgolly.vegaLite.vegaLiteStrings.x
import typingsJapgolly.vegaLite.vegaLiteStrings.y
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Orientation
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Text
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompositemarkCommonMod {
  
  @JSImport("vega-lite/build/src/compositemark/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compositeMarkContinuousAxis[M /* <: CompositeMark */](
    spec: GenericUnitSpec[
      Encoding[String], 
      CompositeMark | CompositeMarkDef, 
      SelectionParameter[SelectionType]
    ],
    orient: Orientation,
    compositeMark: M
  ): ContinuousAxis = (^.asInstanceOf[js.Dynamic].applyDynamic("compositeMarkContinuousAxis")(spec.asInstanceOf[js.Any], orient.asInstanceOf[js.Any], compositeMark.asInstanceOf[js.Any])).asInstanceOf[ContinuousAxis]
  
  inline def compositeMarkOrient[M /* <: CompositeMark */](
    spec: GenericUnitSpec[
      Encoding[String], 
      CompositeMark | CompositeMarkDef, 
      SelectionParameter[SelectionType]
    ],
    compositeMark: M
  ): Orientation = (^.asInstanceOf[js.Dynamic].applyDynamic("compositeMarkOrient")(spec.asInstanceOf[js.Any], compositeMark.asInstanceOf[js.Any])).asInstanceOf[Orientation]
  
  inline def filterTooltipWithAggregatedField[F /* <: Field */](oldEncoding: Encoding[F]): CustomTooltipWithoutAggregatedField[F] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterTooltipWithAggregatedField")(oldEncoding.asInstanceOf[js.Any]).asInstanceOf[CustomTooltipWithoutAggregatedField[F]]
  
  inline def getCompositeMarkTooltip(
    tooltipSummary: js.Array[CompositeMarkTooltipSummary],
    continuousAxisChannelDef: PositionFieldDef[String],
    encodingWithoutContinuousAxis: Encoding[String]
  ): Encoding[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompositeMarkTooltip")(tooltipSummary.asInstanceOf[js.Any], continuousAxisChannelDef.asInstanceOf[js.Any], encodingWithoutContinuousAxis.asInstanceOf[js.Any])).asInstanceOf[Encoding[String]]
  inline def getCompositeMarkTooltip(
    tooltipSummary: js.Array[CompositeMarkTooltipSummary],
    continuousAxisChannelDef: PositionFieldDef[String],
    encodingWithoutContinuousAxis: Encoding[String],
    withFieldName: Boolean
  ): Encoding[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompositeMarkTooltip")(tooltipSummary.asInstanceOf[js.Any], continuousAxisChannelDef.asInstanceOf[js.Any], encodingWithoutContinuousAxis.asInstanceOf[js.Any], withFieldName.asInstanceOf[js.Any])).asInstanceOf[Encoding[String]]
  
  inline def getTitle(continuousAxisChannelDef: PositionFieldDef[String]): SignalRef | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(continuousAxisChannelDef.asInstanceOf[js.Any]).asInstanceOf[SignalRef | Text]
  
  inline def makeCompositeAggregatePartFactory[P /* <: PartsMixins[Any] */](
    compositeMarkDef: GenericCompositeMarkDef[Any] & P,
    continuousAxis: x | y,
    continuousAxisChannelDef: PositionFieldDef[String],
    sharedEncoding: Encoding[String],
    compositeMarkConfig: P
  ): js.Function1[
    /* hasPartNameMarkPositionPrefixEndPositionPrefixExtraEncoding */ EndPositionPrefix[P], 
    js.Array[NormalizedUnitSpec]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeCompositeAggregatePartFactory")(compositeMarkDef.asInstanceOf[js.Any], continuousAxis.asInstanceOf[js.Any], continuousAxisChannelDef.asInstanceOf[js.Any], sharedEncoding.asInstanceOf[js.Any], compositeMarkConfig.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* hasPartNameMarkPositionPrefixEndPositionPrefixExtraEncoding */ EndPositionPrefix[P], 
    js.Array[NormalizedUnitSpec]
  ]]
  
  inline def partLayerMixins[P /* <: PartsMixins[Any] */](
    markDef: GenericCompositeMarkDef[Any] & P,
    part: /* keyof P */ String,
    compositeMarkConfig: P,
    partBaseSpec: NormalizedUnitSpec
  ): js.Array[NormalizedUnitSpec] = (^.asInstanceOf[js.Dynamic].applyDynamic("partLayerMixins")(markDef.asInstanceOf[js.Any], part.asInstanceOf[js.Any], compositeMarkConfig.asInstanceOf[js.Any], partBaseSpec.asInstanceOf[js.Any])).asInstanceOf[js.Array[NormalizedUnitSpec]]
  
  trait CompositeMarkTooltipSummary extends StObject {
    
    /**
      * The prefix of the field to be shown in tooltip
      */
    var fieldPrefix: String
    
    /**
      * The title prefix to show, corresponding to the field with field prefix `fieldPrefix`
      */
    var titlePrefix: Text | SignalRef
  }
  object CompositeMarkTooltipSummary {
    
    inline def apply(fieldPrefix: String, titlePrefix: Text | SignalRef): CompositeMarkTooltipSummary = {
      val __obj = js.Dynamic.literal(fieldPrefix = fieldPrefix.asInstanceOf[js.Any], titlePrefix = titlePrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeMarkTooltipSummary]
    }
    
    extension [Self <: CompositeMarkTooltipSummary](x: Self) {
      
      inline def setFieldPrefix(value: String): Self = StObject.set(x, "fieldPrefix", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefix(value: Text | SignalRef): Self = StObject.set(x, "titlePrefix", value.asInstanceOf[js.Any])
      
      inline def setTitlePrefixVarargs(value: String*): Self = StObject.set(x, "titlePrefix", js.Array(value*))
    }
  }
  
  trait GenericCompositeMarkDef[T]
    extends StObject
       with GenericMarkDef[T]
       with ColorMixins[ExprRef | SignalRef] {
    
    /**
      * Whether a composite mark be clipped to the enclosing group’s width and height.
      */
    var clip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The opacity (value between [0,1]) of the mark.
      *
      * @minimum 0
      * @maximum 1
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object GenericCompositeMarkDef {
    
    inline def apply[T](`type`: T): GenericCompositeMarkDef[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericCompositeMarkDef[T]]
    }
    
    extension [Self <: GenericCompositeMarkDef[?], T](x: Self & GenericCompositeMarkDef[T]) {
      
      inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  type PartsMixins[P /* <: String */] = Partial[Record[P, Boolean | (MarkConfig[ExprRef | SignalRef])]]
}
