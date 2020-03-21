package typingsJapgolly.xstate.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpecialTargets extends js.Object

@JSImport("xstate/lib/types", "SpecialTargets")
@js.native
object SpecialTargets extends js.Object {
  @js.native
  sealed trait Internal extends SpecialTargets
  
  @js.native
  sealed trait Parent extends SpecialTargets
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpecialTargets with String] = js.native
  /* "#_internal" */ @js.native
  object Internal extends TopLevel[Internal with String]
  
  /* "#_parent" */ @js.native
  object Parent extends TopLevel[Parent with String]
  
}

