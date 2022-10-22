package typingsJapgolly.nivoArcs

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.nivoArcs.anon.Data
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelsLayerMod.ArcLabelsLayerProps
import typingsJapgolly.nivoArcs.distTypesArcLabelsUseArcLabelsMod.ArcLabel
import typingsJapgolly.nivoArcs.distTypesCentersMod.ArcCenter
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoArcs.nivoArcsStrings.data
import typingsJapgolly.nivoArcs.nivoArcsStrings.x
import typingsJapgolly.nivoArcs.nivoArcsStrings.y
import typingsJapgolly.nivoCore.mod.CompleteTheme
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLabelsMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_labels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLabelComponent[Datum /* <: DatumWithArcAndColor */](hasLabelStyle: ArcLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabelComponent")(hasLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLabelsLayer[Datum /* <: DatumWithArcAndColor */](
    hasCenterDataTransitionModeLabelAccessorRadiusOffsetSkipAngleTextColorComponent: ArcLabelsLayerProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabelsLayer")(hasCenterDataTransitionModeLabelAccessorRadiusOffsetSkipAngleTextColorComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def drawCanvasArcLabels[Datum /* <: DatumWithArcAndColor */](ctx: CanvasRenderingContext2D, labels: js.Array[ArcLabel[Datum]], theme: CompleteTheme): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
}
