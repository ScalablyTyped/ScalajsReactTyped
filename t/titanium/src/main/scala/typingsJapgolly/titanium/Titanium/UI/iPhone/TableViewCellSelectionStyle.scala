package typingsJapgolly.titanium.Titanium.UI.iPhone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the style that can be used for the `selectionStyle` property of
			 * <Titanium.UI.TableViewRow>.
			 */
@JSGlobal("Titanium.UI.iPhone.TableViewCellSelectionStyle")
@js.native
object TableViewCellSelectionStyle extends js.Object {
  /**
  				 * The cell when selected has a blue background. This is the default value.
  				 */
  val BLUE: Double = js.native
  /**
  				 * Then cell when selected has a gray background.
  				 */
  val GRAY: Double = js.native
  /**
  				 * The cell has no distinct style for when it is selected.
  				 */
  val NONE: Double = js.native
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String = js.native
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: Boolean = js.native
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewCellSelectionStyle.apiName> property.
  				 */
  def getApiName(): String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.TableViewCellSelectionStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.TableViewCellSelectionStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
}

