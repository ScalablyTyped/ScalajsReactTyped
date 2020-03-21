package typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupService extends js.Object {
  /**
  			 * Close an existing popup in the service with the given name. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to close
  			 */
  def closePopup(name: String): Unit
  /**
  			 * Create a new popup element
  			 * @param props The popup properties object, see Popup interface for more
  			 */
  def createPopup(props: typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup): Unit
  /**
  			 * Remove the referenced popup from the popupService, unregister the service
  			 * @param name The name of the popup to remove
  			 */
  def deletePopup(name: String): Unit
  /**
  			 * Gets the currently set popup Id
  			 */
  def getPopupsId(): String
  /**
  			 * Open an existing popup in the service with the given name. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to open
  			 */
  def openPopup(name: String): Unit
  /**
  			 * Sets the ID (on the DOM and in the system) for the root popup element.
  			 * @param id The string to set as the id
  			 */
  def setPopupsId(id: String): Unit
  /**
  			 * Update an existing popup in the service with the given name, patching new content to the same popup element. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to update
  			 * @param newProps the updated properties to give to the popup.
  			 */
  def updatePopup(
    name: String,
    newProps: typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup
  ): Unit
}

object PopupService {
  @scala.inline
  def apply(
    closePopup: String => Callback,
    createPopup: typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup => Callback,
    deletePopup: String => Callback,
    getPopupsId: CallbackTo[String],
    openPopup: String => Callback,
    setPopupsId: String => Callback,
    updatePopup: (String, typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup) => Callback
  ): PopupService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closePopup")(js.Any.fromFunction1((t0: java.lang.String) => closePopup(t0).runNow()))
    __obj.updateDynamic("createPopup")(js.Any.fromFunction1((t0: typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup) => createPopup(t0).runNow()))
    __obj.updateDynamic("deletePopup")(js.Any.fromFunction1((t0: java.lang.String) => deletePopup(t0).runNow()))
    __obj.updateDynamic("getPopupsId")(getPopupsId.toJsFn)
    __obj.updateDynamic("openPopup")(js.Any.fromFunction1((t0: java.lang.String) => openPopup(t0).runNow()))
    __obj.updateDynamic("setPopupsId")(js.Any.fromFunction1((t0: java.lang.String) => setPopupsId(t0).runNow()))
    __obj.updateDynamic("updatePopup")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup) => updatePopup(t0, t1).runNow()))
    __obj.asInstanceOf[PopupService]
  }
}

