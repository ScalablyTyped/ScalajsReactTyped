package typingsJapgolly.googleProtobuf.googleProtobufTypePbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Syntax extends StObject
@JSImport("google-protobuf/google/protobuf/type_pb", "Syntax")
@js.native
object Syntax extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Syntax & Double] = js.native
  
  @js.native
  sealed trait SYNTAX_PROTO2
    extends StObject
       with Syntax
  /* 0 */ val SYNTAX_PROTO2: typingsJapgolly.googleProtobuf.googleProtobufTypePbMod.Syntax.SYNTAX_PROTO2 & Double = js.native
  
  @js.native
  sealed trait SYNTAX_PROTO3
    extends StObject
       with Syntax
  /* 1 */ val SYNTAX_PROTO3: typingsJapgolly.googleProtobuf.googleProtobufTypePbMod.Syntax.SYNTAX_PROTO3 & Double = js.native
}
