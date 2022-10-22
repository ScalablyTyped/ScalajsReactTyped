package typingsJapgolly.nivoArcs

import typingsJapgolly.nivoArcs.anon.DiagonalLength
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkLabel
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkWithDatum
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoArcs.nivoArcsStrings.data
import typingsJapgolly.nivoArcs.nivoArcsStrings.points
import typingsJapgolly.nivoArcs.nivoArcsStrings.side
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLinkLabelsUseArcLinkLabelsMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels/useArcLinkLabels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
