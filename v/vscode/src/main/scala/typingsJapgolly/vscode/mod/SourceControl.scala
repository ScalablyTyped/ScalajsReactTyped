package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceControl extends StObject {
  
  /**
    * Optional accept input command.
    *
    * This command will be invoked when the user accepts the value
    * in the Source Control input.
    */
  var acceptInputCommand: js.UndefOr[Command] = js.undefined
  
  /**
    * Optional commit template string.
    *
    * The Source Control viewlet will populate the Source Control
    * input with this value when appropriate.
    */
  var commitTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * The UI-visible count of {@link SourceControlResourceState resource states} of
    * this source control.
    *
    * If undefined, this source control will
    * - display its UI-visible count as zero, and
    * - contribute the count of its {@link SourceControlResourceState resource states} to the UI-visible aggregated count for all source controls
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Create a new {@link SourceControlResourceGroup resource group}.
    */
  def createResourceGroup(id: String, label: String): SourceControlResourceGroup
  
  /**
    * Dispose this source control.
    */
  def dispose(): Unit
  
  /**
    * The id of this source control.
    */
  val id: String
  
  /**
    * The {@link SourceControlInputBox input box} for this source control.
    */
  val inputBox: SourceControlInputBox
  
  /**
    * The human-readable label of this source control.
    */
  val label: String
  
  /**
    * An optional {@link QuickDiffProvider quick diff provider}.
    */
  var quickDiffProvider: js.UndefOr[QuickDiffProvider] = js.undefined
  
  /**
    * The (optional) Uri of the root of this source control.
    */
  val rootUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * Optional status bar commands.
    *
    * These commands will be displayed in the editor's status bar.
    */
  var statusBarCommands: js.UndefOr[js.Array[Command]] = js.undefined
}
object SourceControl {
  
  inline def apply(
    createResourceGroup: (String, String) => SourceControlResourceGroup,
    dispose: Callback,
    id: String,
    inputBox: SourceControlInputBox,
    label: String
  ): SourceControl = {
    val __obj = js.Dynamic.literal(createResourceGroup = js.Any.fromFunction2(createResourceGroup), dispose = dispose.toJsFn, id = id.asInstanceOf[js.Any], inputBox = inputBox.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControl]
  }
  
  extension [Self <: SourceControl](x: Self) {
    
    inline def setAcceptInputCommand(value: Command): Self = StObject.set(x, "acceptInputCommand", value.asInstanceOf[js.Any])
    
    inline def setAcceptInputCommandUndefined: Self = StObject.set(x, "acceptInputCommand", js.undefined)
    
    inline def setCommitTemplate(value: String): Self = StObject.set(x, "commitTemplate", value.asInstanceOf[js.Any])
    
    inline def setCommitTemplateUndefined: Self = StObject.set(x, "commitTemplate", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCreateResourceGroup(value: (String, String) => SourceControlResourceGroup): Self = StObject.set(x, "createResourceGroup", js.Any.fromFunction2(value))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputBox(value: SourceControlInputBox): Self = StObject.set(x, "inputBox", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setQuickDiffProvider(value: QuickDiffProvider): Self = StObject.set(x, "quickDiffProvider", value.asInstanceOf[js.Any])
    
    inline def setQuickDiffProviderUndefined: Self = StObject.set(x, "quickDiffProvider", js.undefined)
    
    inline def setRootUri(value: Uri): Self = StObject.set(x, "rootUri", value.asInstanceOf[js.Any])
    
    inline def setRootUriUndefined: Self = StObject.set(x, "rootUri", js.undefined)
    
    inline def setStatusBarCommands(value: js.Array[Command]): Self = StObject.set(x, "statusBarCommands", value.asInstanceOf[js.Any])
    
    inline def setStatusBarCommandsUndefined: Self = StObject.set(x, "statusBarCommands", js.undefined)
    
    inline def setStatusBarCommandsVarargs(value: Command*): Self = StObject.set(x, "statusBarCommands", js.Array(value*))
  }
}
