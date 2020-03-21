package typingsJapgolly.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.rotJs.discreteShadowcastingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "FOV")
@js.native
object FOV extends js.Object {
  @js.native
  class DiscreteShadowcasting () extends default
  
  @js.native
  class PreciseShadowcasting ()
    extends typingsJapgolly.rotJs.preciseShadowcastingMod.default
  
  @js.native
  class RecursiveShadowcasting ()
    extends typingsJapgolly.rotJs.recursiveShadowcastingMod.default
  
  @js.native
  object DiscreteShadowcasting extends TopLevel[Instantiable0[default]]
  
  @js.native
  object PreciseShadowcasting
    extends TopLevel[Instantiable0[typingsJapgolly.rotJs.preciseShadowcastingMod.default]]
  
  @js.native
  object RecursiveShadowcasting
    extends TopLevel[Instantiable0[typingsJapgolly.rotJs.recursiveShadowcastingMod.default]]
  
}

