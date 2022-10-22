package typingsJapgolly.antvComponent

import typingsJapgolly.antvComponent.libGridBaseMod.default
import typingsJapgolly.antvComponent.libTypesMod.GroupComponentCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridMod {
  
  /* note: abstract class */ @JSImport("@antv/component/lib/grid", "Base")
  @js.native
  open class Base[T /* <: GroupComponentCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/grid", "Circle")
  @js.native
  open class Circle ()
    extends typingsJapgolly.antvComponent.libGridCircleMod.default
  
  @JSImport("@antv/component/lib/grid", "Line")
  @js.native
  open class Line ()
    extends typingsJapgolly.antvComponent.libGridLineMod.default
}
