package typingsJapgolly.nivoArcs

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.nivoArcs.distTypesArcLabelsUseArcLabelsMod.ArcLabel
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoCore.mod.CompleteTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLabelsCanvasMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_labels/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawCanvasArcLabels[Datum /* <: DatumWithArcAndColor */](ctx: CanvasRenderingContext2D, labels: js.Array[ArcLabel[Datum]], theme: CompleteTheme): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
