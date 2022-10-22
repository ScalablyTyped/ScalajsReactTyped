package typingsJapgolly.cesium.mod

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "InfoBox")
@js.native
open class InfoBox protected () extends StObject {
  def this(container: String) = this()
  def this(container: Element) = this()
  
  /**
    * Gets the parent container.
    */
  var container: Element = js.native
  
  /**
    * Destroys the widget.  Should be called if permanently
    * removing the widget from layout.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the iframe used to display the description.
    */
  var frame: HTMLIFrameElement = js.native
  
  /**
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the view model.
    */
  var viewModel: InfoBoxViewModel = js.native
}
