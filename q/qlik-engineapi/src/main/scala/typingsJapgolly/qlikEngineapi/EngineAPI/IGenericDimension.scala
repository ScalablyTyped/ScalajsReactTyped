package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class describes all the methods that apply at dimension level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the dimension.
  */
trait IGenericDimension extends StObject {
  
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
  
  inline def apply(
    applyPatches: js.Array[INxPatch] => js.Promise[Unit],
    getDimension: CallbackTo[js.Promise[IGenericDimensionProperties]],
    getInfo: CallbackTo[js.Promise[INxInfo]],
    getLayout: CallbackTo[js.Promise[IGenericDimensionLayout]],
    getLinkedObjects: CallbackTo[js.Promise[js.Array[INxLinkedObjectInfo]]],
    getProperties: CallbackTo[js.Promise[IGenericDimensionProperties]],
    publish: CallbackTo[js.Promise[Unit]],
    setProperties: CallbackTo[js.Promise[IGenericDimensionProperties]],
    unPublish: CallbackTo[js.Promise[Unit]]
  ): IGenericDimension = {
    val __obj = js.Dynamic.literal(applyPatches = js.Any.fromFunction1(applyPatches), getDimension = getDimension.toJsFn, getInfo = getInfo.toJsFn, getLayout = getLayout.toJsFn, getLinkedObjects = getLinkedObjects.toJsFn, getProperties = getProperties.toJsFn, publish = publish.toJsFn, setProperties = setProperties.toJsFn, unPublish = unPublish.toJsFn)
    __obj.asInstanceOf[IGenericDimension]
  }
  
  extension [Self <: IGenericDimension](x: Self) {
    
    inline def setApplyPatches(value: js.Array[INxPatch] => js.Promise[Unit]): Self = StObject.set(x, "applyPatches", js.Any.fromFunction1(value))
    
    inline def setGetDimension(value: CallbackTo[js.Promise[IGenericDimensionProperties]]): Self = StObject.set(x, "getDimension", value.toJsFn)
    
    inline def setGetInfo(value: CallbackTo[js.Promise[INxInfo]]): Self = StObject.set(x, "getInfo", value.toJsFn)
    
    inline def setGetLayout(value: CallbackTo[js.Promise[IGenericDimensionLayout]]): Self = StObject.set(x, "getLayout", value.toJsFn)
    
    inline def setGetLinkedObjects(value: CallbackTo[js.Promise[js.Array[INxLinkedObjectInfo]]]): Self = StObject.set(x, "getLinkedObjects", value.toJsFn)
    
    inline def setGetProperties(value: CallbackTo[js.Promise[IGenericDimensionProperties]]): Self = StObject.set(x, "getProperties", value.toJsFn)
    
    inline def setPublish(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "publish", value.toJsFn)
    
    inline def setSetProperties(value: CallbackTo[js.Promise[IGenericDimensionProperties]]): Self = StObject.set(x, "setProperties", value.toJsFn)
    
    inline def setUnPublish(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "unPublish", value.toJsFn)
  }
}
