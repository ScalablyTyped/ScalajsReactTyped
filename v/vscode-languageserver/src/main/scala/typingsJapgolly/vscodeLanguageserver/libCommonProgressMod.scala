package typingsJapgolly.vscodeLanguageserver

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.ProgressToken
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.Feature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod._RemoteWindow
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProgressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProgressMod {
  
  @JSImport("vscode-languageserver/lib/common/progress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageserver/lib/common/progress", "ProgressFeature")
  @js.native
  val ProgressFeature: Feature[_RemoteWindow, WindowProgress] = js.native
  
  inline def attachPartialResult[R](connection: ProgressContext, params: PartialResultParams): js.UndefOr[ResultProgressReporter[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("attachPartialResult")(connection.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResultProgressReporter[R]]]
  
  inline def attachWorkDone(connection: ProgressContext): WorkDoneProgressReporter = ^.asInstanceOf[js.Dynamic].applyDynamic("attachWorkDone")(connection.asInstanceOf[js.Any]).asInstanceOf[WorkDoneProgressReporter]
  inline def attachWorkDone(connection: ProgressContext, params: WorkDoneProgressParams): WorkDoneProgressReporter = (^.asInstanceOf[js.Dynamic].applyDynamic("attachWorkDone")(connection.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[WorkDoneProgressReporter]
  
  trait ProgressContext extends StObject {
    
    def sendProgress[P](`type`: ProgressType[P], token: ProgressToken, value: P): Unit
  }
  object ProgressContext {
    
    inline def apply(sendProgress: (ProgressType[Any], ProgressToken, Any) => Callback): ProgressContext = {
      val __obj = js.Dynamic.literal(sendProgress = js.Any.fromFunction3((t0: ProgressType[Any], t1: ProgressToken, t2: Any) => (sendProgress(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[ProgressContext]
    }
    
    extension [Self <: ProgressContext](x: Self) {
      
      inline def setSendProgress(value: (ProgressType[Any], ProgressToken, Any) => Callback): Self = StObject.set(x, "sendProgress", js.Any.fromFunction3((t0: ProgressType[Any], t1: ProgressToken, t2: Any) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait ResultProgressReporter[R] extends StObject {
    
    def report(data: R): Unit
  }
  object ResultProgressReporter {
    
    inline def apply[R](report: R => Callback): ResultProgressReporter[R] = {
      val __obj = js.Dynamic.literal(report = js.Any.fromFunction1((t0: R) => report(t0).runNow()))
      __obj.asInstanceOf[ResultProgressReporter[R]]
    }
    
    extension [Self <: ResultProgressReporter[?], R](x: Self & ResultProgressReporter[R]) {
      
      inline def setReport(value: R => Callback): Self = StObject.set(x, "report", js.Any.fromFunction1((t0: R) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait WindowProgress extends StObject {
    
    def attachWorkDoneProgress(): WorkDoneProgressReporter = js.native
    def attachWorkDoneProgress(token: ProgressToken): WorkDoneProgressReporter = js.native
    
    def createWorkDoneProgress(): js.Promise[WorkDoneProgressServerReporter] = js.native
  }
  
  @js.native
  trait WorkDoneProgressReporter extends StObject {
    
    def begin(title: String): Unit = js.native
    def begin(title: String, percentage: Double): Unit = js.native
    def begin(title: String, percentage: Double, message: String): Unit = js.native
    def begin(title: String, percentage: Double, message: String, cancellable: Boolean): Unit = js.native
    def begin(title: String, percentage: Double, message: Unit, cancellable: Boolean): Unit = js.native
    def begin(title: String, percentage: Unit, message: String): Unit = js.native
    def begin(title: String, percentage: Unit, message: String, cancellable: Boolean): Unit = js.native
    def begin(title: String, percentage: Unit, message: Unit, cancellable: Boolean): Unit = js.native
    
    def done(): Unit = js.native
    
    def report(message: String): Unit = js.native
    def report(percentage: Double): Unit = js.native
    def report(percentage: Double, message: String): Unit = js.native
  }
  
  @js.native
  trait WorkDoneProgressServerReporter
    extends StObject
       with WorkDoneProgressReporter {
    
    val token: CancellationToken = js.native
  }
}
