package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.contentEditingHelper
  * @description A helper service for most editors, some methods are specific to content/media/member model types but most are used by
  * all editors to share logic and reduce the amount of replicated code among editors.
  */
trait IContentEditingHelper extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#getAllProps
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Returns all propertes contained for the content item (since the normal model has properties contained inside of tabs)
    */
  def getAllProps(content: js.Any): js.Any
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#configureButtons
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Returns a letter array for buttons, with the primary one first based on content model, permissions and editor state
    */
  def getAllowedActions(content: js.Any, creating: js.Any): js.Array[String]
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#getButtonFromAction
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Returns a button object to render a button for the tabbed editor
    * currently only returns built in system buttons for content and media actions
    * returns label, alias, action char and hot-key
    */
  def getButtonFromAction(ch: String): js.Any
  /**
    * @ngdoc function
    * @name umbraco.services.contentEditingHelper#handleSaveError
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * A function to handle what happens when we have validation issues from the server side
    */
  def handleSaveError(args: js.Any*): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.contentEditingHelper#handleSuccessfulSave
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * A function to handle when saving a content item is successful. This will rebind the values of the model that have changed
    * ensure the notifications are displayed and that the appropriate events are fired. This will also check if we need to redirect
    * when we're creating new content.
    */
  def handleSuccessfulSave(args: js.Any*): Unit
  /**
    * @ngdoc method
    * @name umbraco.services.contentEditingHelper#reBindChangedProperties
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * re-binds all changed property values to the origContent object from the savedContent object and returns an array of changed properties.
    */
  def reBindChangedProperties(origContent: js.Any, savedContent: js.Any): Unit
  /**
    * @ngdoc function
    * @name umbraco.services.contentEditingHelper#redirectToCreatedContent
    * @methodOf umbraco.services.contentEditingHelper
    * @function
    *
    * @description
    * Changes the location to be editing the newly created content after create was successful.
    * We need to decide if we need to redirect to edito mode or if we will remain in create mode.
    * We will only need to maintain create mode if we have not fulfilled the basic requirements for creating an entity which is at least having a name.
    */
  def redirectToCreatedContent(id: Double, modelState: js.Any): Unit
}

object IContentEditingHelper {
  @scala.inline
  def apply(
    getAllProps: js.Any => CallbackTo[js.Any],
    getAllowedActions: (js.Any, js.Any) => CallbackTo[js.Array[String]],
    getButtonFromAction: String => CallbackTo[js.Any],
    handleSaveError: /* repeated */ js.Any => Callback,
    handleSuccessfulSave: /* repeated */ js.Any => Callback,
    reBindChangedProperties: (js.Any, js.Any) => Callback,
    redirectToCreatedContent: (Double, js.Any) => Callback
  ): IContentEditingHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllProps")(js.Any.fromFunction1((t0: js.Any) => getAllProps(t0).runNow()))
    __obj.updateDynamic("getAllowedActions")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getAllowedActions(t0, t1).runNow()))
    __obj.updateDynamic("getButtonFromAction")(js.Any.fromFunction1((t0: java.lang.String) => getButtonFromAction(t0).runNow()))
    __obj.updateDynamic("handleSaveError")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => handleSaveError(t0).runNow()))
    __obj.updateDynamic("handleSuccessfulSave")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => handleSuccessfulSave(t0).runNow()))
    __obj.updateDynamic("reBindChangedProperties")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => reBindChangedProperties(t0, t1).runNow()))
    __obj.updateDynamic("redirectToCreatedContent")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => redirectToCreatedContent(t0, t1).runNow()))
    __obj.asInstanceOf[IContentEditingHelper]
  }
}

