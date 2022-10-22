package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikEngineapi.enigmaJS.IGeneratedAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class describes all the methods that apply at measure level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the measure.
  */
trait IGenericMeasure
  extends StObject
     with IGeneratedAPI {
  
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns -
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit]
  
  /**
    * Returns the type and identifier of the object.
    * @returns - A Promise of NxInfo
    */
  def getInfo(): js.Promise[INxInfo]
  
  /**
    * Evaluates a measure and displays its properties, including the dynamic properties.
    * @returns - A Promise of GenericMeasureLayout
    */
  def getLayout(): js.Promise[IGenericMeasureLayout]
  
  /**
    * Lists the linked objects to a generic object, a dimension or a measure.
    * @returns - Array of NxLinkedObjectInfo
    */
  def getLinkedObjects(): js.Promise[INxLinkedObjectInfo]
  
  /**
    * Returns the definition of a measure
    * @returns - Information about the measure.
    * >> This parameter is mandatory.
    */
  def getMeasure(): js.Promise[IGenericMeasureProperties]
  
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the measure.
    *
    * Note: If the member delta is set to true in the request object, only the delta is retrieved.
    * @returns - A Promise GenericMeasureProperties
    * >> This parameter is mandatory.
    */
  def getProperties(): js.Promise[IGenericMeasureProperties]
  
  /**
    * Publishes a measure.
    */
  def publish(): js.Promise[Unit]
  
  /**
    * Sets some properties for a measure.
    * @param qProp - Information about the measure.
    * This parameter is mandatory.
    * @returns - A Promise of GenericMeasureProperties
    */
  def setProperties(qProp: IGenericMeasureProperties): js.Promise[Unit]
  
  /**
    * Unpublishes a measure.
    */
  def unPublish(): js.Promise[Unit]
}
object IGenericMeasure {
  
  inline def apply(
    applyPatches: js.Array[INxPatch] => js.Promise[Unit],
    getInfo: CallbackTo[js.Promise[INxInfo]],
    getLayout: CallbackTo[js.Promise[IGenericMeasureLayout]],
    getLinkedObjects: CallbackTo[js.Promise[INxLinkedObjectInfo]],
    getMeasure: CallbackTo[js.Promise[IGenericMeasureProperties]],
    getProperties: CallbackTo[js.Promise[IGenericMeasureProperties]],
    publish: CallbackTo[js.Promise[Unit]],
    setProperties: IGenericMeasureProperties => js.Promise[Unit],
    unPublish: CallbackTo[js.Promise[Unit]]
  ): IGenericMeasure = {
    val __obj = js.Dynamic.literal(applyPatches = js.Any.fromFunction1(applyPatches), getInfo = getInfo.toJsFn, getLayout = getLayout.toJsFn, getLinkedObjects = getLinkedObjects.toJsFn, getMeasure = getMeasure.toJsFn, getProperties = getProperties.toJsFn, publish = publish.toJsFn, setProperties = js.Any.fromFunction1(setProperties), unPublish = unPublish.toJsFn)
    __obj.asInstanceOf[IGenericMeasure]
  }
  
  extension [Self <: IGenericMeasure](x: Self) {
    
    inline def setApplyPatches(value: js.Array[INxPatch] => js.Promise[Unit]): Self = StObject.set(x, "applyPatches", js.Any.fromFunction1(value))
    
    inline def setGetInfo(value: CallbackTo[js.Promise[INxInfo]]): Self = StObject.set(x, "getInfo", value.toJsFn)
    
    inline def setGetLayout(value: CallbackTo[js.Promise[IGenericMeasureLayout]]): Self = StObject.set(x, "getLayout", value.toJsFn)
    
    inline def setGetLinkedObjects(value: CallbackTo[js.Promise[INxLinkedObjectInfo]]): Self = StObject.set(x, "getLinkedObjects", value.toJsFn)
    
    inline def setGetMeasure(value: CallbackTo[js.Promise[IGenericMeasureProperties]]): Self = StObject.set(x, "getMeasure", value.toJsFn)
    
    inline def setGetProperties(value: CallbackTo[js.Promise[IGenericMeasureProperties]]): Self = StObject.set(x, "getProperties", value.toJsFn)
    
    inline def setPublish(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "publish", value.toJsFn)
    
    inline def setSetProperties(value: IGenericMeasureProperties => js.Promise[Unit]): Self = StObject.set(x, "setProperties", js.Any.fromFunction1(value))
    
    inline def setUnPublish(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "unPublish", value.toJsFn)
  }
}
