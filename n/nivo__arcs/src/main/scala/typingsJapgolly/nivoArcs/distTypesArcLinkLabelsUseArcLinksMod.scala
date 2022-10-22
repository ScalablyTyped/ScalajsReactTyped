package typingsJapgolly.nivoArcs

import typingsJapgolly.nivoArcs.anon.ComputeExtraProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkWithDatum
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArc
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLinkLabelsUseArcLinksMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels/useArcLinks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useArcLinks[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](
    hasDataSkipAngleOffsetDiagonalLengthStraightLengthComputeExtraProps: ComputeExtraProps[Datum, ExtraProps]
  ): js.Array[ArcLinkWithDatum[Datum] & ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinks")(hasDataSkipAngleOffsetDiagonalLengthStraightLengthComputeExtraProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[ArcLinkWithDatum[Datum] & ExtraProps]]
}
