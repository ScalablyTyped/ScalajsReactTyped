package typingsJapgolly.nivoArcs

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.nivoArcs.anon.ComputeExtraProps
import typingsJapgolly.nivoArcs.anon.CornerRadius
import typingsJapgolly.nivoArcs.anon.Data
import typingsJapgolly.nivoArcs.anon.DiagonalLength
import typingsJapgolly.nivoArcs.anon.Enter
import typingsJapgolly.nivoArcs.anon.Height
import typingsJapgolly.nivoArcs.anon.InnerRadius
import typingsJapgolly.nivoArcs.anon.Interpolate
import typingsJapgolly.nivoArcs.anon.InterpolateLink
import typingsJapgolly.nivoArcs.anon.Offset
import typingsJapgolly.nivoArcs.anon.SkipAngle
import typingsJapgolly.nivoArcs.anon.Transition
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelsLayerMod.ArcLabelsLayerProps
import typingsJapgolly.nivoArcs.distTypesArcLabelsUseArcLabelsMod.ArcLabel
import typingsJapgolly.nivoArcs.distTypesArcLineMod.ArcLineProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelsLayerMod.ArcLinkLabelsLayerProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLink
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkLabel
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkWithDatum
import typingsJapgolly.nivoArcs.distTypesArcShapeMod.ArcShapeProps
import typingsJapgolly.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typingsJapgolly.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionModeConfig
import typingsJapgolly.nivoArcs.distTypesArcTransitionModeMod.TransitionExtra
import typingsJapgolly.nivoArcs.distTypesArcsLayerMod.ArcsLayerProps
import typingsJapgolly.nivoArcs.distTypesCentersMod.ArcCenter
import typingsJapgolly.nivoArcs.distTypesTypesMod.Arc
import typingsJapgolly.nivoArcs.distTypesTypesMod.ArcGenerator
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArc
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoArcs.distTypesTypesMod.Point
import typingsJapgolly.nivoArcs.nivoArcsStrings.centerRadius
import typingsJapgolly.nivoArcs.nivoArcsStrings.data
import typingsJapgolly.nivoArcs.nivoArcsStrings.end
import typingsJapgolly.nivoArcs.nivoArcsStrings.endAngle
import typingsJapgolly.nivoArcs.nivoArcsStrings.innerRadius
import typingsJapgolly.nivoArcs.nivoArcsStrings.middleAngle
import typingsJapgolly.nivoArcs.nivoArcsStrings.outerRadius
import typingsJapgolly.nivoArcs.nivoArcsStrings.points
import typingsJapgolly.nivoArcs.nivoArcsStrings.pushIn
import typingsJapgolly.nivoArcs.nivoArcsStrings.pushOut
import typingsJapgolly.nivoArcs.nivoArcsStrings.side
import typingsJapgolly.nivoArcs.nivoArcsStrings.start
import typingsJapgolly.nivoArcs.nivoArcsStrings.startAngle
import typingsJapgolly.nivoArcs.nivoArcsStrings.x
import typingsJapgolly.nivoArcs.nivoArcsStrings.y
import typingsJapgolly.nivoCore.mod.CompleteTheme
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/arcs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLabelComponent[Datum /* <: DatumWithArcAndColor */](hasLabelStyle: ArcLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabelComponent")(hasLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLabelsLayer[Datum /* <: DatumWithArcAndColor */](
    hasCenterDataTransitionModeLabelAccessorRadiusOffsetSkipAngleTextColorComponent: ArcLabelsLayerProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabelsLayer")(hasCenterDataTransitionModeLabelAccessorRadiusOffsetSkipAngleTextColorComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLine(hasAnimatedPropsRest: ArcLineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLine")(hasAnimatedPropsRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLinkLabelComponent[Datum /* <: DatumWithArcAndColor */](hasLabelStyle: ArcLinkLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelComponent")(hasLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLinkLabelsLayer[Datum /* <: DatumWithArcAndColor */](
    hasCenterDataLabelAccessorSkipAngleOffsetDiagonalLengthStraightLengthStrokeWidthTextOffsetTextColorLinkColorComponent: ArcLinkLabelsLayerProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelsLayer")(hasCenterDataLabelAccessorSkipAngleOffsetDiagonalLengthStraightLengthStrokeWidthTextOffsetTextColorLinkColorComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcShape[Datum /* <: DatumWithArcAndColor */](hasDatumStyleOnClickOnMouseEnterOnMouseMoveOnMouseLeave: ArcShapeProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcShape")(hasDatumStyleOnClickOnMouseEnterOnMouseMoveOnMouseLeave.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcsLayer[Datum /* <: DatumWithArcAndColor */](
    hasCenterDataArcGeneratorBorderWidthBorderColorOnClickOnMouseEnterOnMouseMoveOnMouseLeaveTransitionModeComponent: ArcsLayerProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcsLayer")(hasCenterDataArcGeneratorBorderWidthBorderColorOnClickOnMouseEnterOnMouseMoveOnMouseLeaveTransitionModeComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/arcs", "arcTransitionModeById")
  @js.native
  val arcTransitionModeById: Record[ArcTransitionMode, ArcTransitionModeConfig] = js.native
  
  @JSImport("@nivo/arcs", "arcTransitionModes")
  @js.native
  val arcTransitionModes: js.Tuple8[startAngle, middleAngle, endAngle, innerRadius, centerRadius, outerRadius, pushIn, pushOut] = js.native
  
  inline def computeArcBoundingBox(centerX: Double, centerY: Double, radius: Double, startAngle: Double, endAngle: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcBoundingBox")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def computeArcBoundingBox(
    centerX: Double,
    centerY: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    includeCenter: Boolean
  ): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcBoundingBox")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], includeCenter.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def computeArcCenter(arc: Arc, offset: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcCenter")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def computeArcLink(arc: Arc, offset: Double, diagonalLength: Double, straightLength: Double): ArcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLink")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], diagonalLength.asInstanceOf[js.Any], straightLength.asInstanceOf[js.Any])).asInstanceOf[ArcLink]
  
  inline def computeArcLinkTextAnchor(arc: Arc): start | end = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLinkTextAnchor")(arc.asInstanceOf[js.Any]).asInstanceOf[start | end]
  
  inline def drawCanvasArcLabels[Datum /* <: DatumWithArcAndColor */](ctx: CanvasRenderingContext2D, labels: js.Array[ArcLabel[Datum]], theme: CompleteTheme): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawCanvasArcLinkLabels[Datum /* <: DatumWithArcAndColor */](
    ctx: CanvasRenderingContext2D,
    labels: js.Array[ArcLinkLabel[Datum]],
    theme: CompleteTheme,
    strokeWidth: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLinkLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], strokeWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findArcUnderCursor[A /* <: Arc */](
    centerX: Double,
    centerY: Double,
    radius: Double,
    innerRadius: Double,
    arcs: js.Array[A],
    cursorX: Double,
    cursorY: Double
  ): js.UndefOr[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("findArcUnderCursor")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any], arcs.asInstanceOf[js.Any], cursorX.asInstanceOf[js.Any], cursorY.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[A]]
  
  inline def interpolateArc(
    startAngleValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    endAngleValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    innerRadiusValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    outerRadiusValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    arcGenerator: ArcGenerator
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArc")(startAngleValue.asInstanceOf[js.Any], endAngleValue.asInstanceOf[js.Any], innerRadiusValue.asInstanceOf[js.Any], outerRadiusValue.asInstanceOf[js.Any], arcGenerator.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def interpolateArcCenter(offset: Double): js.Function4[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* startAngleValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* endAngleValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* innerRadiusValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* outerRadiusValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.Interpolation<string, any> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArcCenter")(offset.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* startAngleValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* endAngleValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* innerRadiusValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* outerRadiusValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.Interpolation<string, any> */ Any
  ]]
  
  inline def isCursorInRing(
    centerX: Double,
    centerY: Double,
    radius: Double,
    innerRadius: Double,
    cursorX: Double,
    cursorY: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCursorInRing")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any], cursorX.asInstanceOf[js.Any], cursorY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useAnimatedArc(datumWithArc: typingsJapgolly.nivoArcs.anon.Arc, arcGenerator: ArcGenerator): InnerRadius = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedArc")(datumWithArc.asInstanceOf[js.Any], arcGenerator.asInstanceOf[js.Any])).asInstanceOf[InnerRadius]
  
  inline def useArcCenters[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](hasDataOffsetSkipAngleComputeExtraProps: SkipAngle[Datum, ExtraProps]): js.Array[ArcCenter[Datum] & ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcCenters")(hasDataOffsetSkipAngleComputeExtraProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[ArcCenter[Datum] & ExtraProps]]
  
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum]): Interpolate = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any]).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Double): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Double, mode: Unit, extra: TransitionExtra[Datum, ExtraProps]): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Double, mode: ArcTransitionMode): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](
    data: js.Array[Datum],
    offset: Double,
    mode: ArcTransitionMode,
    extra: TransitionExtra[Datum, ExtraProps]
  ): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Unit, mode: Unit, extra: TransitionExtra[Datum, ExtraProps]): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Unit, mode: ArcTransitionMode): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](
    data: js.Array[Datum],
    offset: Unit,
    mode: ArcTransitionMode,
    extra: TransitionExtra[Datum, ExtraProps]
  ): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  
  inline def useArcGenerator(): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcGenerator")().asInstanceOf[ArcGenerator]
  inline def useArcGenerator(hasCornerRadiusPadAngle: CornerRadius): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcGenerator")(hasCornerRadiusPadAngle.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator]
  
  inline def useArcLabels[Datum /* <: DatumWithArcAndColor */](hasDataOffsetSkipAngleLabelTextColor: Data[Datum]): js.Array[
    ArcCenter[Datum] & (Omit[
      ArcLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/centers.ArcCenter<Datum> */ data | x | y
    ])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLabels")(hasDataOffsetSkipAngleLabelTextColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ArcCenter[Datum] & (Omit[
      ArcLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/centers.ArcCenter<Datum> */ data | x | y
    ])
  ]]
  
  inline def useArcLinkLabels[Datum /* <: DatumWithArcAndColor */](
    hasDataSkipAngleOffsetDiagonalLengthStraightLengthTextOffsetLabelLinkColorTextColor: DiagonalLength[Datum]
  ): js.Array[
    ArcLinkWithDatum[Datum] & (Omit[
      ArcLinkLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/arc_link_labels/types.ArcLinkWithDatum<Datum> */ data | side | points
    ])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinkLabels")(hasDataSkipAngleOffsetDiagonalLengthStraightLengthTextOffsetLabelLinkColorTextColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ArcLinkWithDatum[Datum] & (Omit[
      ArcLinkLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/arc_link_labels/types.ArcLinkWithDatum<Datum> */ data | side | points
    ])
  ]]
  
  inline def useArcLinkLabelsTransition[Datum /* <: DatumWithArcAndColor */](hasDataOffsetDiagonalLengthStraightLengthSkipAngleTextOffsetLinkColorTextColor: Offset[Datum]): InterpolateLink = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinkLabelsTransition")(hasDataOffsetDiagonalLengthStraightLengthSkipAngleTextOffsetLinkColorTextColor.asInstanceOf[js.Any]).asInstanceOf[InterpolateLink]
  
  inline def useArcLinks[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](
    hasDataSkipAngleOffsetDiagonalLengthStraightLengthComputeExtraProps: ComputeExtraProps[Datum, ExtraProps]
  ): js.Array[ArcLinkWithDatum[Datum] & ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinks")(hasDataSkipAngleOffsetDiagonalLengthStraightLengthComputeExtraProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[ArcLinkWithDatum[Datum] & ExtraProps]]
  
  inline def useArcTransitionMode[Datum /* <: DatumWithArc */, ExtraProps](mode: ArcTransitionMode): Enter[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcTransitionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Enter[Datum]]
  inline def useArcTransitionMode[Datum /* <: DatumWithArc */, ExtraProps](mode: ArcTransitionMode, extraTransition: TransitionExtra[Datum, ExtraProps]): Enter[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcTransitionMode")(mode.asInstanceOf[js.Any], extraTransition.asInstanceOf[js.Any])).asInstanceOf[Enter[Datum]]
  
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum]): Transition = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any]).asInstanceOf[Transition]
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], mode: Unit, extra: TransitionExtra[Datum, ExtraProps]): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Transition]
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], mode: ArcTransitionMode): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Transition]
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], mode: ArcTransitionMode, extra: TransitionExtra[Datum, ExtraProps]): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Transition]
}
