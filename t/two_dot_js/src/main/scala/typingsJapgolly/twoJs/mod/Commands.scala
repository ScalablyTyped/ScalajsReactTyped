package typingsJapgolly.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Commands extends StObject
@JSImport("two.js", "Commands")
@js.native
object Commands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Commands & Double] = js.native
  
  @js.native
  sealed trait arc
    extends StObject
       with Commands
  /* 3 */ val arc: typingsJapgolly.twoJs.mod.Commands.arc & Double = js.native
  
  @js.native
  sealed trait close
    extends StObject
       with Commands
  /* 4 */ val close: typingsJapgolly.twoJs.mod.Commands.close & Double = js.native
  
  @js.native
  sealed trait curve
    extends StObject
       with Commands
  /* 2 */ val curve: typingsJapgolly.twoJs.mod.Commands.curve & Double = js.native
  
  @js.native
  sealed trait line
    extends StObject
       with Commands
  /* 1 */ val line: typingsJapgolly.twoJs.mod.Commands.line & Double = js.native
  
  @js.native
  sealed trait move
    extends StObject
       with Commands
  /* 0 */ val move: typingsJapgolly.twoJs.mod.Commands.move & Double = js.native
}
