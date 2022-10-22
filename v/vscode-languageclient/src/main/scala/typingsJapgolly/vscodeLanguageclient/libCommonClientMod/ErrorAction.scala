package typingsJapgolly.vscodeLanguageclient.libCommonClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorAction extends StObject
@JSImport("vscode-languageclient/lib/common/client", "ErrorAction")
@js.native
object ErrorAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorAction & Double] = js.native
  
  /**
    * Continue running the server.
    */
  @js.native
  sealed trait Continue
    extends StObject
       with ErrorAction
  /* 1 */ val Continue: typingsJapgolly.vscodeLanguageclient.libCommonClientMod.ErrorAction.Continue & Double = js.native
  
  /**
    * Shutdown the server.
    */
  @js.native
  sealed trait Shutdown
    extends StObject
       with ErrorAction
  /* 2 */ val Shutdown: typingsJapgolly.vscodeLanguageclient.libCommonClientMod.ErrorAction.Shutdown & Double = js.native
}
