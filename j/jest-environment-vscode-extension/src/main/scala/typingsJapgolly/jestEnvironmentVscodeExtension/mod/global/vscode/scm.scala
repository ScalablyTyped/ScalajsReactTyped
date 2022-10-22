package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.mod.SourceControl
import typingsJapgolly.vscode.mod.SourceControlInputBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scm {
  
  @JSGlobal("vscode.scm")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSourceControl(id: String, label: String): SourceControl = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceControl")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[SourceControl]
  inline def createSourceControl(id: String, label: String, rootUri: typingsJapgolly.vscode.mod.Uri): SourceControl = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceControl")(id.asInstanceOf[js.Any], label.asInstanceOf[js.Any], rootUri.asInstanceOf[js.Any])).asInstanceOf[SourceControl]
  
  @JSGlobal("vscode.scm.inputBox")
  @js.native
  val inputBox: SourceControlInputBox = js.native
}
