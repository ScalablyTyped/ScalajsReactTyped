package typingsJapgolly.nivoArcs

import typingsJapgolly.nivoArcs.anon.Arc
import typingsJapgolly.nivoArcs.anon.InnerRadius
import typingsJapgolly.nivoArcs.distTypesTypesMod.ArcGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUseAnimatedArcMod {
  
  @JSImport("@nivo/arcs/dist/types/useAnimatedArc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimatedArc(datumWithArc: Arc, arcGenerator: ArcGenerator): InnerRadius = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedArc")(datumWithArc.asInstanceOf[js.Any], arcGenerator.asInstanceOf[js.Any])).asInstanceOf[InnerRadius]
}
