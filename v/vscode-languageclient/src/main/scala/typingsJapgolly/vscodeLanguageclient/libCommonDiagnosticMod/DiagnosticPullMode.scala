package typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiagnosticPullMode extends StObject
@JSImport("vscode-languageclient/lib/common/diagnostic", "DiagnosticPullMode")
@js.native
object DiagnosticPullMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DiagnosticPullMode & String] = js.native
  
  @js.native
  sealed trait onSave
    extends StObject
       with DiagnosticPullMode
  /* "onSave" */ val onSave: typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod.DiagnosticPullMode.onSave & String = js.native
  
  @js.native
  sealed trait onType
    extends StObject
       with DiagnosticPullMode
  /* "onType" */ val onType: typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod.DiagnosticPullMode.onType & String = js.native
}
