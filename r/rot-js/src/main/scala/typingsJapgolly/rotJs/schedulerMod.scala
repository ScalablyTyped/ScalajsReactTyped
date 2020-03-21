package typingsJapgolly.rotJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.rotJs.speedMod.SpeedActor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/scheduler", JSImport.Namespace)
@js.native
object schedulerMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class Action[T] ()
      extends typingsJapgolly.rotJs.actionMod.default[T]
    
    @js.native
    class Simple[T] ()
      extends typingsJapgolly.rotJs.simpleMod.default[T]
    
    @js.native
    class Speed[T /* <: SpeedActor */] ()
      extends typingsJapgolly.rotJs.speedMod.default[T]
    
    @js.native
    object Action
      extends TopLevel[Instantiable0[typingsJapgolly.rotJs.actionMod.default[js.Object]]]
    
    @js.native
    object Simple
      extends TopLevel[Instantiable0[typingsJapgolly.rotJs.simpleMod.default[js.Object]]]
    
    @js.native
    object Speed
      extends TopLevel[Instantiable0[typingsJapgolly.rotJs.speedMod.default[SpeedActor]]]
    
  }
  
}

