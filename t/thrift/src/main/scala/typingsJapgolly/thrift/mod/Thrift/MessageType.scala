package typingsJapgolly.thrift.mod.Thrift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends StObject
@JSImport("thrift", "Thrift.MessageType")
@js.native
object MessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType & Double] = js.native
  
  @js.native
  sealed trait CALL
    extends StObject
       with MessageType
  /* 1 */ val CALL: typingsJapgolly.thrift.mod.Thrift.MessageType.CALL & Double = js.native
  
  @js.native
  sealed trait EXCEPTION
    extends StObject
       with MessageType
  /* 3 */ val EXCEPTION: typingsJapgolly.thrift.mod.Thrift.MessageType.EXCEPTION & Double = js.native
  
  @js.native
  sealed trait ONEWAY
    extends StObject
       with MessageType
  /* 4 */ val ONEWAY: typingsJapgolly.thrift.mod.Thrift.MessageType.ONEWAY & Double = js.native
  
  @js.native
  sealed trait REPLY
    extends StObject
       with MessageType
  /* 2 */ val REPLY: typingsJapgolly.thrift.mod.Thrift.MessageType.REPLY & Double = js.native
}
