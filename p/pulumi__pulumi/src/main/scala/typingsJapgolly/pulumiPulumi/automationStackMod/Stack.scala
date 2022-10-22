package typingsJapgolly.pulumiPulumi.automationStackMod

import typingsJapgolly.pulumiPulumi.automationConfigMod.ConfigMap
import typingsJapgolly.pulumiPulumi.automationConfigMod.ConfigValue
import typingsJapgolly.pulumiPulumi.automationWorkspaceMod.Deployment
import typingsJapgolly.pulumiPulumi.automationWorkspaceMod.Workspace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/automation/stack", "Stack")
@js.native
/* private */ open class Stack () extends StObject {
  
  /**
    * Cancel stops a stack's currently running update. It returns an error if no update is currently running.
    * Note that this operation is _very dangerous_, and may leave the stack in an inconsistent state
    * if a resource operation was pending when the update was canceled.
    * This command is not supported for local backends.
    */
  def cancel(): js.Promise[Unit] = js.native
  
  /**
    * Destroy deletes all resources in a stack, leaving all history and configuration intact.
    *
    * @param opts Options to customize the behavior of the destroy.
    */
  def destroy(): js.Promise[DestroyResult] = js.native
  def destroy(opts: DestroyOptions): js.Promise[DestroyResult] = js.native
  
  /**
    * exportStack exports the deployment state of the stack.
    * This can be combined with Stack.importStack to edit a stack's state (such as recovery from failed deployments).
    */
  def exportStack(): js.Promise[Deployment] = js.native
  
  /**
    * Returns the full config map associated with the stack in the Workspace.
    */
  def getAllConfig(): js.Promise[ConfigMap] = js.native
  
  /**
    * Returns the config value associated with the specified key.
    *
    * @param key The key to use for the config lookup
    */
  def getConfig(key: String): js.Promise[ConfigValue] = js.native
  
  /**
    * Returns a list summarizing all previous and current results from Stack lifecycle operations
    * (up/preview/refresh/destroy).
    */
  def history(): js.Promise[js.Array[UpdateSummary]] = js.native
  def history(pageSize: Double): js.Promise[js.Array[UpdateSummary]] = js.native
  def history(pageSize: Double, page: Double): js.Promise[js.Array[UpdateSummary]] = js.native
  def history(pageSize: Double, page: Double, showSecrets: Boolean): js.Promise[js.Array[UpdateSummary]] = js.native
  def history(pageSize: Double, page: Unit, showSecrets: Boolean): js.Promise[js.Array[UpdateSummary]] = js.native
  def history(pageSize: Unit, page: Double): js.Promise[js.Array[UpdateSummary]] = js.native
  def history(pageSize: Unit, page: Double, showSecrets: Boolean): js.Promise[js.Array[UpdateSummary]] = js.native
  def history(pageSize: Unit, page: Unit, showSecrets: Boolean): js.Promise[js.Array[UpdateSummary]] = js.native
  
  /**
    * importStack imports the specified deployment state into a pre-existing stack.
    * This can be combined with Stack.exportStack to edit a stack's state (such as recovery from failed deployments).
    *
    * @param state the stack state to import.
    */
  def importStack(state: Deployment): js.Promise[Unit] = js.native
  
  def info(): js.Promise[js.UndefOr[UpdateSummary]] = js.native
  def info(showSecrets: Boolean): js.Promise[js.UndefOr[UpdateSummary]] = js.native
  
  /**
    * The name identifying the Stack.
    */
  val name: String = js.native
  
  /**
    * Gets the current set of Stack outputs from the last Stack.up().
    */
  def outputs(): js.Promise[OutputMap] = js.native
  
  /**
    * Performs a dry-run update to a stack, returning pending changes.
    * https://www.pulumi.com/docs/reference/cli/pulumi_preview/
    *
    * @param opts Options to customize the behavior of the preview.
    */
  def preview(): js.Promise[PreviewResult] = js.native
  def preview(opts: PreviewOptions): js.Promise[PreviewResult] = js.native
  
  /* private */ var readLines: Any = js.native
  
  /* private */ var ready: Any = js.native
  
  /**
    * Compares the current stack’s resource state with the state known to exist in the actual
    * cloud provider. Any such changes are adopted into the current stack.
    *
    * @param opts Options to customize the behavior of the refresh.
    */
  def refresh(): js.Promise[RefreshResult] = js.native
  def refresh(opts: RefreshOptions): js.Promise[RefreshResult] = js.native
  
  /**
    * Gets and sets the config map used with the last update.
    */
  def refreshConfig(): js.Promise[ConfigMap] = js.native
  
  /**
    * Removes the specified config keys from the Stack in the associated Workspace.
    *
    * @param keys The config keys to remove.
    */
  def removeAllConfig(keys: js.Array[String]): js.Promise[Unit] = js.native
  
  /**
    * Removes the specified config key from the Stack in the associated Workspace.
    *
    * @param key The config key to remove.
    */
  def removeConfig(key: String): js.Promise[Unit] = js.native
  
  /* private */ var runPulumiCmd: Any = js.native
  
  /**
    * Sets all specified config values on the stack in the associated Workspace.
    *
    * @param config The map of config key-value pairs to set.
    */
  def setAllConfig(config: ConfigMap): js.Promise[Unit] = js.native
  
  /**
    * Sets a config key-value pair on the Stack in the associated Workspace.
    *
    * @param key The key to set.
    * @param value The config value to set.
    */
  def setConfig(key: String, value: ConfigValue): js.Promise[Unit] = js.native
  
  /**
    * Creates or updates the resources in a stack by executing the program in the Workspace.
    * https://www.pulumi.com/docs/reference/cli/pulumi_up/
    *
    * @param opts Options to customize the behavior of the update.
    */
  def up(): js.Promise[UpResult] = js.native
  def up(opts: UpOptions): js.Promise[UpResult] = js.native
  
  /**
    * The Workspace the Stack was created from.
    */
  val workspace: Workspace = js.native
}
/* static members */
object Stack {
  
  @JSImport("@pulumi/pulumi/automation/stack", "Stack")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new stack using the given workspace, and stack name.
    * It fails if a stack with that name already exists
    *
    * @param name The name identifying the Stack.
    * @param workspace The Workspace the Stack was created from.
    */
  inline def create(name: String, workspace: Workspace): js.Promise[Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stack]]
  
  /**
    * Tries to create a new stack using the given workspace and
    * stack name if the stack does not already exist,
    * or falls back to selecting the existing stack. If the stack does not exist,
    * it will be created and selected.
    *
    * @param name The name identifying the Stack.
    * @param workspace The Workspace the Stack was created from.
    */
  inline def createOrSelect(name: String, workspace: Workspace): js.Promise[Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelect")(name.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stack]]
  
  /**
    * Selects stack using the given workspace, and stack name.
    * It returns an error if the given Stack does not exist.
    *
    * @param name The name identifying the Stack.
    * @param workspace The Workspace the Stack was created from.
    */
  inline def select(name: String, workspace: Workspace): js.Promise[Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stack]]
}
