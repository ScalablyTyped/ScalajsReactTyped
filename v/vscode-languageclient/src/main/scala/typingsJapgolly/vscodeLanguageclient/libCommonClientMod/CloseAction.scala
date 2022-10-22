package typingsJapgolly.vscodeLanguageclient.libCommonClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloseAction extends StObject
@JSImport("vscode-languageclient/lib/common/client", "CloseAction")
@js.native
object CloseAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CloseAction & Double] = js.native
  
  /**
    * Don't restart the server. The connection stays closed.
    */
  @js.native
  sealed trait DoNotRestart
    extends StObject
       with CloseAction
  /* 1 */ val DoNotRestart: typingsJapgolly.vscodeLanguageclient.libCommonClientMod.CloseAction.DoNotRestart & Double = js.native
  
  /**
    * Restart the server.
    */
  @js.native
  sealed trait Restart
    extends StObject
       with CloseAction
  /* 2 */ val Restart: typingsJapgolly.vscodeLanguageclient.libCommonClientMod.CloseAction.Restart & Double = js.native
}
