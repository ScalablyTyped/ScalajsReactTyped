package typingsJapgolly.vscodeLanguageserver.libCommonServerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeLanguageserver.libCommonProgressMod.ResultProgressReporter
import typingsJapgolly.vscodeLanguageserver.libCommonProgressMod.WorkDoneProgressReporter
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProgressType
import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Notebooks
  extends StObject
     with FeatureBase {
  
  def attachPartialResultProgress[PR](`type`: ProgressType[PR], params: PartialResultParams): js.UndefOr[ResultProgressReporter[PR]]
  
  def attachWorkDoneProgress(params: WorkDoneProgressParams): WorkDoneProgressReporter
  
  var connection: Connection
}
object _Notebooks {
  
  inline def apply(
    attachPartialResultProgress: (ProgressType[Any], PartialResultParams) => js.UndefOr[ResultProgressReporter[Any]],
    attachWorkDoneProgress: WorkDoneProgressParams => WorkDoneProgressReporter,
    connection: Connection,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Callback,
    initialize: ClientCapabilities => Callback
  ): _Notebooks = {
    val __obj = js.Dynamic.literal(attachPartialResultProgress = js.Any.fromFunction2(attachPartialResultProgress), attachWorkDoneProgress = js.Any.fromFunction1(attachWorkDoneProgress), connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1((t0: ServerCapabilities[LSPAny]) => fillServerCapabilities(t0).runNow()), initialize = js.Any.fromFunction1((t0: ClientCapabilities) => initialize(t0).runNow()))
    __obj.asInstanceOf[_Notebooks]
  }
  
  extension [Self <: _Notebooks](x: Self) {
    
    inline def setAttachPartialResultProgress(value: (ProgressType[Any], PartialResultParams) => js.UndefOr[ResultProgressReporter[Any]]): Self = StObject.set(x, "attachPartialResultProgress", js.Any.fromFunction2(value))
    
    inline def setAttachWorkDoneProgress(value: WorkDoneProgressParams => WorkDoneProgressReporter): Self = StObject.set(x, "attachWorkDoneProgress", js.Any.fromFunction1(value))
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}
