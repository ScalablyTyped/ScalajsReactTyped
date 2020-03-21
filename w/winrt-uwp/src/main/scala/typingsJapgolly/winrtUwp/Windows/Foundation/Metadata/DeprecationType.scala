package typingsJapgolly.winrtUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeprecationType extends js.Object

/** Indicates a deprecation as Deprecate or Remove. */
@JSGlobal("Windows.Foundation.Metadata.DeprecationType")
@js.native
object DeprecationType extends js.Object {
  /** Compilers and other tools should treat the entity as deprecated. This is the default. */
  @js.native
  sealed trait deprecate extends DeprecationType
  
  /** Compilers and other tools should treat the entity as removed. */
  @js.native
  sealed trait remove extends DeprecationType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeprecationType with Double] = js.native
  /* 0 */ @js.native
  object deprecate extends TopLevel[deprecate with Double]
  
  /* 1 */ @js.native
  object remove extends TopLevel[remove with Double]
  
}

