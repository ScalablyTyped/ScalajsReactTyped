package typingsJapgolly.cesium.mod

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTilesInspector")
@js.native
open class Cesium3DTilesInspector protected () extends StObject {
  def this(container: String, scene: Scene) = this()
  def this(container: Element, scene: Scene) = this()
  
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
    * @returns true if the object has been destroyed, false otherwise.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the view model.
    */
  var viewModel: Cesium3DTilesInspectorViewModel = js.native
}
