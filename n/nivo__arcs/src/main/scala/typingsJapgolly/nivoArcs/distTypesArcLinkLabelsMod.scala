package typingsJapgolly.nivoArcs

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.nivoArcs.anon.ComputeExtraProps
import typingsJapgolly.nivoArcs.anon.DiagonalLength
import typingsJapgolly.nivoArcs.anon.InterpolateLink
import typingsJapgolly.nivoArcs.anon.Offset
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelsLayerMod.ArcLinkLabelsLayerProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLink
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkLabel
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkWithDatum
import typingsJapgolly.nivoArcs.distTypesTypesMod.Arc
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArc
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoArcs.nivoArcsStrings.data
import typingsJapgolly.nivoArcs.nivoArcsStrings.end
import typingsJapgolly.nivoArcs.nivoArcsStrings.points
import typingsJapgolly.nivoArcs.nivoArcsStrings.side
import typingsJapgolly.nivoArcs.nivoArcsStrings.start
import typingsJapgolly.nivoCore.mod.CompleteTheme
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLinkLabelsMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLinkLabelComponent[Datum /* <: DatumWithArcAndColor */](hasLabelStyle: ArcLinkLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelComponent")(hasLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLinkLabelsLayer[Datum /* <: DatumWithArcAndColor */](
    hasCenterDataLabelAccessorSkipAngleOffsetDiagonalLengthStraightLengthStrokeWidthTextOffsetTextColorLinkColorComponent: ArcLinkLabelsLayerProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelsLayer")(hasCenterDataLabelAccessorSkipAngleOffsetDiagonalLengthStraightLengthStrokeWidthTextOffsetTextColorLinkColorComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def computeArcLink(arc: Arc, offset: Double, diagonalLength: Double, straightLength: Double): ArcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLink")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], diagonalLength.asInstanceOf[js.Any], straightLength.asInstanceOf[js.Any])).asInstanceOf[ArcLink]
  
  inline def computeArcLinkTextAnchor(arc: Arc): start | end = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLinkTextAnchor")(arc.asInstanceOf[js.Any]).asInstanceOf[start | end]
  
  inline def drawCanvasArcLinkLabels[Datum /* <: DatumWithArcAndColor */](
    ctx: CanvasRenderingContext2D,
    labels: js.Array[ArcLinkLabel[Datum]],
    theme: CompleteTheme,
    strokeWidth: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLinkLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], strokeWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
}
