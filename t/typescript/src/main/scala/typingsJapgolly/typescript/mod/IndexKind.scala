package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexKind extends js.Object

@JSImport("typescript", "IndexKind")
@js.native
object IndexKind extends js.Object {
  @js.native
  sealed trait Number extends IndexKind
  
  @js.native
  sealed trait String extends IndexKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexKind with Double] = js.native
  /* 1 */ @js.native
  object Number extends TopLevel[Number with Double]
  
  /* 0 */ @js.native
  object String
    extends TopLevel[typingsJapgolly.typescript.mod.IndexKind.String with Double]
  
}

