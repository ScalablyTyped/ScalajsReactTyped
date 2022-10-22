package typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod

import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.Uri
import typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.DocumentDiagnosticReport
import typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.PreviousResultId
import typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.ResultReporter
import typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod.vsdiag.WorkspaceDiagnosticReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ProvideDiagnosticSignature = js.ThisFunction3[
/* this */ Unit, 
/* document */ TextDocument | Uri, 
/* previousResultId */ js.UndefOr[String], 
/* token */ CancellationToken, 
ProviderResult[DocumentDiagnosticReport]]

type ProvideWorkspaceDiagnosticSignature = js.ThisFunction3[
/* this */ Unit, 
/* resultIds */ js.Array[PreviousResultId], 
/* token */ CancellationToken, 
/* resultReporter */ ResultReporter, 
ProviderResult[WorkspaceDiagnosticReport]]
