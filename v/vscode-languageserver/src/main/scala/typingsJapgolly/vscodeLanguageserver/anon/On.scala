package typingsJapgolly.vscodeLanguageserver.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.ServerRequestHandler
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticServerCancellationData
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReport
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DocumentDiagnosticReportPartialResult
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReport
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.WorkspaceDiagnosticReportPartialResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait On extends StObject {
  
  /**
    * Installs a handler for the document diagnostic request.
    *
    * @param handler The corresponding handler.
    */
  def on(
    handler: ServerRequestHandler[
      DocumentDiagnosticParams, 
      DocumentDiagnosticReport, 
      DocumentDiagnosticReportPartialResult, 
      DiagnosticServerCancellationData
    ]
  ): Disposable
  
  /**
    * Installs a handler for the workspace diagnostic request.
    *
    * @param handler The corresponding handler.
    */
  def onWorkspace(
    handler: ServerRequestHandler[
      WorkspaceDiagnosticParams, 
      WorkspaceDiagnosticReport, 
      WorkspaceDiagnosticReportPartialResult, 
      DiagnosticServerCancellationData
    ]
  ): Disposable
  
  /**
    * Asks the client to refresh all diagnostics provided by this server by
    * pull for the corresponding documents again.
    */
  def refresh(): Unit
}
object On {
  
  inline def apply(
    on: ServerRequestHandler[
      DocumentDiagnosticParams, 
      DocumentDiagnosticReport, 
      DocumentDiagnosticReportPartialResult, 
      DiagnosticServerCancellationData
    ] => Disposable,
    onWorkspace: ServerRequestHandler[
      WorkspaceDiagnosticParams, 
      WorkspaceDiagnosticReport, 
      WorkspaceDiagnosticReportPartialResult, 
      DiagnosticServerCancellationData
    ] => Disposable,
    refresh: Callback
  ): On = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), onWorkspace = js.Any.fromFunction1(onWorkspace), refresh = refresh.toJsFn)
    __obj.asInstanceOf[On]
  }
  
  extension [Self <: On](x: Self) {
    
    inline def setOn(
      value: ServerRequestHandler[
          DocumentDiagnosticParams, 
          DocumentDiagnosticReport, 
          DocumentDiagnosticReportPartialResult, 
          DiagnosticServerCancellationData
        ] => Disposable
    ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setOnWorkspace(
      value: ServerRequestHandler[
          WorkspaceDiagnosticParams, 
          WorkspaceDiagnosticReport, 
          WorkspaceDiagnosticReportPartialResult, 
          DiagnosticServerCancellationData
        ] => Disposable
    ): Self = StObject.set(x, "onWorkspace", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
  }
}
