package typingsJapgolly.nivoArcs

import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLink
import typingsJapgolly.nivoArcs.distTypesTypesMod.Arc
import typingsJapgolly.nivoArcs.nivoArcsStrings.end
import typingsJapgolly.nivoArcs.nivoArcsStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLinkLabelsComputeMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeArcLink(arc: Arc, offset: Double, diagonalLength: Double, straightLength: Double): ArcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLink")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], diagonalLength.asInstanceOf[js.Any], straightLength.asInstanceOf[js.Any])).asInstanceOf[ArcLink]
  
  inline def computeArcLinkTextAnchor(arc: Arc): start | end = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLinkTextAnchor")(arc.asInstanceOf[js.Any]).asInstanceOf[start | end]
}
