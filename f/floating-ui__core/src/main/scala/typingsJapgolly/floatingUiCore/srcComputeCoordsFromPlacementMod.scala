package typingsJapgolly.floatingUiCore

import typingsJapgolly.floatingUiCore.srcTypesMod.Coords
import typingsJapgolly.floatingUiCore.srcTypesMod.ElementRects
import typingsJapgolly.floatingUiCore.srcTypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComputeCoordsFromPlacementMod {
  
  @JSImport("@floating-ui/core/src/computeCoordsFromPlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeCoordsFromPlacement(hasReferenceFloating: ElementRects, placement: Placement): Coords = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCoordsFromPlacement")(hasReferenceFloating.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[Coords]
  inline def computeCoordsFromPlacement(hasReferenceFloating: ElementRects, placement: Placement, rtl: Boolean): Coords = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCoordsFromPlacement")(hasReferenceFloating.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[Coords]
}
