package typingsJapgolly.maplibreGl.mod

import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "NavigationControl")
@js.native
open class NavigationControl protected ()
  extends StObject
     with IControl {
  def this(options: NavigationOptions) = this()
  
  var _compass: HTMLButtonElement = js.native
  
  var _compassIcon: HTMLElement = js.native
  
  var _container: HTMLElement = js.native
  
  def _createButton(className: String, fn: js.Function1[/* e */ js.UndefOr[Any], Any]): HTMLButtonElement = js.native
  
  var _handler: MouseRotateWrapper = js.native
  
  var _map: Map = js.native
  
  def _rotateCompassArrow(): scala.Unit = js.native
  
  def _setButtonTitle(button: HTMLButtonElement, title: String): scala.Unit = js.native
  
  def _updateZoomButtons(): scala.Unit = js.native
  
  var _zoomInButton: HTMLButtonElement = js.native
  
  var _zoomOutButton: HTMLButtonElement = js.native
  
  /**
  	 * Register a control on the map and give it a chance to register event listeners
  	 * and resources. This method is called by {@link Map#addControl}
  	 * internally.
  	 *
  	 * @function
  	 * @memberof IControl
  	 * @instance
  	 * @name onAdd
  	 * @param {Map} map the Map this control will be added to
  	 * @returns {HTMLElement} The control's container element. This should
  	 * be created by the control and returned by onAdd without being attached
  	 * to the DOM: the map will insert the control's element into the DOM
  	 * as necessary.
  	 */
  /* CompleteClass */
  override def onAdd(map: Map): HTMLElement = js.native
  
  def onRemove(): scala.Unit = js.native
  /**
  	 * Unregister a control on the map and give it a chance to detach event listeners
  	 * and resources. This method is called by {@link Map#removeControl}
  	 * internally.
  	 *
  	 * @function
  	 * @memberof IControl
  	 * @instance
  	 * @name onRemove
  	 * @param {Map} map the Map this control will be removed from
  	 * @returns {undefined} there is no required return value for this method
  	 */
  /* CompleteClass */
  override def onRemove(map: Map): scala.Unit = js.native
  
  var options: NavigationOptions = js.native
}
