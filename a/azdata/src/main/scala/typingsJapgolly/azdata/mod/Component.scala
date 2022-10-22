package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component
  extends StObject
     with ComponentProperties {
  
  /**
    * Focuses the component.
    */
  def focus(): Thenable[Unit] = js.native
  
  val id: String = js.native
  
  /**
    * Event fired to notify that the component's validity has changed
    */
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any]): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Any): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onValidityChanged(listener: js.Function1[/* e */ Boolean, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  
  /**
    * Updates the specified CSS Styles and notifies the UI
    * @param cssStyles The styles to update
    * @returns Thenable that completes once the update has been applied to the UI
    */
  def updateCssStyles(cssStyles: CssStyles): Thenable[Unit] = js.native
  
  /**
    * Sends any updated properties of the component to the UI
    *
    * @returns Thenable that completes once the update
    * has been applied in the UI
    */
  def updateProperties(properties: StringDictionary[Any]): Thenable[Unit] = js.native
  
  /**
    * Sends an updated property of the component to the UI
    *
    * @returns Thenable that completes once the update
    * has been applied in the UI
    */
  def updateProperty(key: String, value: Any): Thenable[Unit] = js.native
  
  /**
    * Whether the component is valid or not
    */
  val valid: Boolean = js.native
  
  /**
    * Run the component's validations
    */
  def validate(): Thenable[Boolean] = js.native
}
