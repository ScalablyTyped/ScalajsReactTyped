package typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionErrors extends StObject
@JSImport("vscode-jsonrpc/lib/common/connection", "ConnectionErrors")
@js.native
object ConnectionErrors extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionErrors & Double] = js.native
  
  /**
    * The connection is already in listening mode.
    */
  @js.native
  sealed trait AlreadyListening
    extends StObject
       with ConnectionErrors
  /* 3 */ val AlreadyListening: typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ConnectionErrors.AlreadyListening & Double = js.native
  
  /**
    * The connection is closed.
    */
  @js.native
  sealed trait Closed
    extends StObject
       with ConnectionErrors
  /* 1 */ val Closed: typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ConnectionErrors.Closed & Double = js.native
  
  /**
    * The connection got disposed.
    */
  @js.native
  sealed trait Disposed
    extends StObject
       with ConnectionErrors
  /* 2 */ val Disposed: typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ConnectionErrors.Disposed & Double = js.native
}
