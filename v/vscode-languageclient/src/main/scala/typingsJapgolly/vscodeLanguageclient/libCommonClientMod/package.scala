package typingsJapgolly.vscodeLanguageclient.libCommonClientMod

import typingsJapgolly.vscode.mod.Diagnostic
import typingsJapgolly.vscode.mod.Uri
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ProgressToken
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressBegin
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressEnd
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotprogressMod.WorkDoneProgressReport
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.FileEvent
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeError
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ResponseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DidChangeWatchedFileSignature = js.ThisFunction1[/* this */ Unit, /* event */ FileEvent, js.Promise[Unit]]

type HandleDiagnosticsSignature = js.ThisFunction2[/* this */ Unit, /* uri */ Uri, /* diagnostics */ js.Array[Diagnostic], Unit]

type HandleWorkDoneProgressSignature = js.ThisFunction2[
/* this */ Unit, 
/* token */ ProgressToken, 
/* params */ WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd, 
Unit]

type InitializationFailedHandler = /**
  * @param error The error returned from the server
  * @returns if true is returned the client tries to reinitialize the server.
  *  Implementors of a handler are responsible to not initialize the server
  *  infinitely. Return false if initialization should stop and an error
  *  should be reported.
  */
js.Function1[/* error */ ResponseError[InitializeError] | js.Error | Any, Boolean]

type WindowMiddleware = _WindowMiddleware
