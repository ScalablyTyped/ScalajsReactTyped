package typingsJapgolly.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IMErrorType extends StObject
@JSImport("voximplant-websdk", "IMErrorType")
@js.native
object IMErrorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMErrorType & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with IMErrorType
  /* 1 */ val Error: typingsJapgolly.voximplantWebsdk.mod.IMErrorType.Error & Double = js.native
  
  @js.native
  sealed trait RemoteFunctionError
    extends StObject
       with IMErrorType
  /* 0 */ val RemoteFunctionError: typingsJapgolly.voximplantWebsdk.mod.IMErrorType.RemoteFunctionError & Double = js.native
  
  @js.native
  sealed trait RosterError
    extends StObject
       with IMErrorType
  /* 2 */ val RosterError: typingsJapgolly.voximplantWebsdk.mod.IMErrorType.RosterError & Double = js.native
}
