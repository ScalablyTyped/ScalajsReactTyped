package typingsJapgolly.antvComponent

import typingsJapgolly.antvComponent.libLegendBaseMod.default
import typingsJapgolly.antvComponent.libTypesMod.LegendBaseCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLegendMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/legend", "Base")
  @js.native
  open class Base[T /* <: LegendBaseCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/legend", "Category")
  @js.native
  open class Category ()
    extends typingsJapgolly.antvComponent.libLegendCategoryMod.default
  
  @JSImport("@antv/component/lib/legend", "Continuous")
  @js.native
  open class Continuous ()
    extends typingsJapgolly.antvComponent.libLegendContinuousMod.default
}
