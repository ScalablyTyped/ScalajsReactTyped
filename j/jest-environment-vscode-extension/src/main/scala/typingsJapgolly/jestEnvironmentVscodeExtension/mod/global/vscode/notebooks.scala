package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.NotebookCell
import typingsJapgolly.vscode.mod.NotebookCellStatusBarItemProvider
import typingsJapgolly.vscode.mod.NotebookController
import typingsJapgolly.vscode.mod.NotebookDocument
import typingsJapgolly.vscode.mod.NotebookRendererMessaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notebooks {
  
  @JSGlobal("vscode.notebooks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNotebookController(id: String, notebookType: String, label: String): NotebookController = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotebookController")(id.asInstanceOf[js.Any], notebookType.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[NotebookController]
  inline def createNotebookController(
    id: String,
    notebookType: String,
    label: String,
    handler: js.Function3[
      /* cells */ js.Array[NotebookCell], 
      /* notebook */ NotebookDocument, 
      /* controller */ NotebookController, 
      Unit | Thenable[Unit]
    ]
  ): NotebookController = (^.asInstanceOf[js.Dynamic].applyDynamic("createNotebookController")(id.asInstanceOf[js.Any], notebookType.asInstanceOf[js.Any], label.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[NotebookController]
  
  inline def createRendererMessaging(rendererId: String): NotebookRendererMessaging = ^.asInstanceOf[js.Dynamic].applyDynamic("createRendererMessaging")(rendererId.asInstanceOf[js.Any]).asInstanceOf[NotebookRendererMessaging]
  
  inline def registerNotebookCellStatusBarItemProvider(notebookType: String, provider: NotebookCellStatusBarItemProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerNotebookCellStatusBarItemProvider")(notebookType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
}
