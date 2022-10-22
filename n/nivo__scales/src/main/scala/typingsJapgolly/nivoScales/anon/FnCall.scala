package typingsJapgolly.nivoScales.anon

import typingsJapgolly.nivoScales.distTypesComputeMod.NestedSerie
import typingsJapgolly.nivoScales.distTypesComputeMod.SerieDatum
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[S, D /* <: SerieDatum */](series: js.Array[NestedSerie[S, D]], xScaleSpec: ScaleSpec, yScaleSpec: ScaleSpec): Y = js.native
}
