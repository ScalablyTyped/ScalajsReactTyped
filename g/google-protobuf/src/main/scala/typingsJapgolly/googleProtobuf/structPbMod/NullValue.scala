package typingsJapgolly.googleProtobuf.structPbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NullValue extends js.Object

@JSImport("google-protobuf/google/protobuf/struct_pb", "NullValue")
@js.native
object NullValue extends js.Object {
  @js.native
  sealed trait NULL_VALUE extends NullValue
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NullValue with Double] = js.native
  /* 0 */ @js.native
  object NULL_VALUE extends TopLevel[NULL_VALUE with Double]
  
}

