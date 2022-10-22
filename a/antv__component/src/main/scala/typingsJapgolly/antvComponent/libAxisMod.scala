package typingsJapgolly.antvComponent

import typingsJapgolly.antvComponent.libAxisBaseMod.default
import typingsJapgolly.antvComponent.libTypesMod.AxisBaseCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAxisMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/axis", "Base")
  @js.native
  open class Base[T /* <: AxisBaseCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/axis", "Circle")
  @js.native
  open class Circle ()
    extends typingsJapgolly.antvComponent.libAxisCircleMod.default
  
  @JSImport("@antv/component/lib/axis", "Line")
  @js.native
  open class Line ()
    extends typingsJapgolly.antvComponent.libAxisLineMod.default
}
