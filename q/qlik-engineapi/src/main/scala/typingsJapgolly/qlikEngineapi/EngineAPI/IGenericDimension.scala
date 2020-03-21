package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at dimension level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the dimension.
  */
trait IGenericDimension extends js.Object {
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns - A promise of a Qlik engine reply.
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit]
  /**
    * Returns the definition of a dimension.
    *
    * @returns - A promise GenericDimension.
    */
  def getDimension(): js.Promise[IGenericDimensionProperties]
  /**
    * Returns the type and identifier of the object.
    */
  def getInfo(): js.Promise[INxInfo]
  /**
    * Evaluates a dimension and displays its properties, including the dynamic properties.
    *
    * @returns - A promise GenericDimensionLayout.
    */
  def getLayout(): js.Promise[IGenericDimensionLayout]
  /**
    * Return a lists the linked objects to a generic object, a dimension or a measure.
    * @returns - A promise Array of NxLinkedObjectInfo
    */
  def getLinkedObjects(): js.Promise[js.Array[INxLinkedObjectInfo]]
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the dimension.
    *
    * Note: If the member delta is set to true in the request object, only the delta is retrieved.
    */
  def getProperties(): js.Promise[IGenericDimensionProperties]
  /**
    * Publishes a dimension.
    */
  def publish(): js.Promise[Unit]
  /**
    * Sets some properties for a dimension.
    */
  def setProperties(): js.Promise[IGenericDimensionProperties]
  /**
    * Unpublishes a dimension.
    */
  def unPublish(): js.Promise[Unit]
}

object IGenericDimension {
  @scala.inline
  def apply(
    applyPatches: js.Array[INxPatch] => CallbackTo[js.Promise[Unit]],
    getDimension: CallbackTo[js.Promise[IGenericDimensionProperties]],
    getInfo: CallbackTo[js.Promise[INxInfo]],
    getLayout: CallbackTo[js.Promise[IGenericDimensionLayout]],
    getLinkedObjects: CallbackTo[js.Promise[js.Array[INxLinkedObjectInfo]]],
    getProperties: CallbackTo[js.Promise[IGenericDimensionProperties]],
    publish: CallbackTo[js.Promise[Unit]],
    setProperties: CallbackTo[js.Promise[IGenericDimensionProperties]],
    unPublish: CallbackTo[js.Promise[Unit]]
  ): IGenericDimension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyPatches")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.qlikEngineapi.EngineAPI.INxPatch]) => applyPatches(t0).runNow()))
    __obj.updateDynamic("getDimension")(getDimension.toJsFn)
    __obj.updateDynamic("getInfo")(getInfo.toJsFn)
    __obj.updateDynamic("getLayout")(getLayout.toJsFn)
    __obj.updateDynamic("getLinkedObjects")(getLinkedObjects.toJsFn)
    __obj.updateDynamic("getProperties")(getProperties.toJsFn)
    __obj.updateDynamic("publish")(publish.toJsFn)
    __obj.updateDynamic("setProperties")(setProperties.toJsFn)
    __obj.updateDynamic("unPublish")(unPublish.toJsFn)
    __obj.asInstanceOf[IGenericDimension]
  }
}

