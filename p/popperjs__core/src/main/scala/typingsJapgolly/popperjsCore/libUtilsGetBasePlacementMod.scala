package typingsJapgolly.popperjsCore

import typingsJapgolly.popperjsCore.libEnumsMod.BasePlacement
import typingsJapgolly.popperjsCore.libEnumsMod.Placement
import typingsJapgolly.popperjsCore.popperjsCoreStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsGetBasePlacementMod {
  
  @JSImport("@popperjs/core/lib/utils/getBasePlacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(placement: Placement): BasePlacement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(placement.asInstanceOf[js.Any]).asInstanceOf[BasePlacement]
  
  inline def default_auto(placement: auto): BasePlacement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(placement.asInstanceOf[js.Any]).asInstanceOf[BasePlacement]
}
