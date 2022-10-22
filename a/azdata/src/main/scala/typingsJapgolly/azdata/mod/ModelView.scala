package typingsJapgolly.azdata.mod

import typingsJapgolly.azdata.mod.connection.Connection
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelView extends StObject {
  
  /**
    * The connection info for the dashboard the webview exists on
    */
  val connection: Connection = js.native
  
  /**
    * Initializes the model with a root component definition.
    * Once this has been done, the components will be laid out in the UI and
    * can be accessed and altered as needed.
    */
  def initializeModel[T /* <: Component */](root: T): Thenable[Unit] = js.native
  
  /**
    * The model backing the model-based view
    */
  val modelBuilder: ModelBuilder = js.native
  
  /**
    * Raised when the view closed.
    */
  def onClosed(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Raised when the model view's valid property changes
    */
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any]): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Any): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * The info on the server for the dashboard
    */
  val serverInfo: ServerInfo = js.native
  
  /**
    * Whether or not the model view's root component is valid
    */
  val valid: Boolean = js.native
  
  /**
    * Run the model view root component's validations
    */
  def validate(): Thenable[Boolean] = js.native
}
