package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikEngineapi.AnonQEndIndex
import typingsJapgolly.qlikEngineapi.AnonQFieldValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at bookmark level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the bookmark.
  */
trait IGenericBookmark extends js.Object {
  /**
    * Applies a bookmark.
    * @returns - A promise true or false
    */
  @JSName("apply")
  def apply(): js.Promise[Boolean]
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns - A promise of a Qlik engine reply.
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit]
  /**
    * Get the selected values in the bookmark for a specific field.
    *
    * Note: from shema file
    * @param qField - Name of the field
    * @param qGetExcludedValues - Get Excluded Values
    * @param qDataPage - Start and End of DataPage
    * @returns - A promise of Array of FieldValues.
    */
  def getFieldValues(qField: String, qGetExcludedValues: Boolean, qDataPage: AnonQEndIndex): js.Promise[AnonQFieldValues]
  /**
    * Returns:
    *
    * - the type of the object
    * - the identifier of the object
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @returns - A promise InfoObject
    */
  def getInfo(): js.Promise[INxInfo]
  /**
    * Evaluates an object and displays its properties including the dynamic properties.
    * If the member delta is set to true in the request object, only the delta is evaluated..
    * @returns - A promise of GenericBookmarkLayout
    */
  def getLayout(): js.Promise[IGenericBookmarkLayout]
  /**
    * Shows the properties of an object.
    * If the member delta is set to true in the request object, only the delta is retrieved.
    * @returns - A promise of GenericBookmarkProperties
    */
  def getProperties(): js.Promise[IGenericBookmarkProperties]
  /**
    * Publishes a bookmark.
    * @returns - A promise of a Qlik engine reply.
    */
  def publish(): js.Promise[Unit]
  /**
    * Sets some properties for a bookmark.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qProp - Information about the bookmark
    * >> This parameter is mandatory.
    * @returns - A promise of a Qlik engine reply.
    */
  def setProperties(qProp: IGenericBookmarkProperties): js.Promise[Unit]
  /**
    * Unpublishes a bookmark.
    * @returns - A promise of a Qlik engine reply.
    */
  def unPublish(): js.Promise[Unit]
}

object IGenericBookmark {
  @scala.inline
  def apply(
    apply: CallbackTo[js.Promise[Boolean]],
    applyPatches: js.Array[INxPatch] => CallbackTo[js.Promise[Unit]],
    getFieldValues: (String, Boolean, AnonQEndIndex) => CallbackTo[js.Promise[AnonQFieldValues]],
    getInfo: CallbackTo[js.Promise[INxInfo]],
    getLayout: CallbackTo[js.Promise[IGenericBookmarkLayout]],
    getProperties: CallbackTo[js.Promise[IGenericBookmarkProperties]],
    publish: CallbackTo[js.Promise[Unit]],
    setProperties: IGenericBookmarkProperties => CallbackTo[js.Promise[Unit]],
    unPublish: CallbackTo[js.Promise[Unit]]
  ): IGenericBookmark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(apply.toJsFn)
    __obj.updateDynamic("applyPatches")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.qlikEngineapi.EngineAPI.INxPatch]) => applyPatches(t0).runNow()))
    __obj.updateDynamic("getFieldValues")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: typingsJapgolly.qlikEngineapi.AnonQEndIndex) => getFieldValues(t0, t1, t2).runNow()))
    __obj.updateDynamic("getInfo")(getInfo.toJsFn)
    __obj.updateDynamic("getLayout")(getLayout.toJsFn)
    __obj.updateDynamic("getProperties")(getProperties.toJsFn)
    __obj.updateDynamic("publish")(publish.toJsFn)
    __obj.updateDynamic("setProperties")(js.Any.fromFunction1((t0: typingsJapgolly.qlikEngineapi.EngineAPI.IGenericBookmarkProperties) => setProperties(t0).runNow()))
    __obj.updateDynamic("unPublish")(unPublish.toJsFn)
    __obj.asInstanceOf[IGenericBookmark]
  }
}

