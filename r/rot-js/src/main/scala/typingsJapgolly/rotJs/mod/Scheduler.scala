package typingsJapgolly.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.rotJs.actionMod.default
import typingsJapgolly.rotJs.speedMod.SpeedActor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Scheduler")
@js.native
object Scheduler extends js.Object {
  @js.native
  class Action[T] () extends default[T]
  
  @js.native
  class Simple[T] ()
    extends typingsJapgolly.rotJs.simpleMod.default[T]
  
  @js.native
  class Speed[T /* <: SpeedActor */] ()
    extends typingsJapgolly.rotJs.speedMod.default[T]
  
  @js.native
  object Action
    extends TopLevel[Instantiable0[default[js.Object]]]
  
  @js.native
  object Simple
    extends TopLevel[Instantiable0[typingsJapgolly.rotJs.simpleMod.default[js.Object]]]
  
  @js.native
  object Speed
    extends TopLevel[Instantiable0[typingsJapgolly.rotJs.speedMod.default[SpeedActor]]]
  
}

