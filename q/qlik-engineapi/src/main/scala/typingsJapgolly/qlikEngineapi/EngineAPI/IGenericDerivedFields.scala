package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikEngineapi.enigmaJS.IGeneratedAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGenericDerivedFields
  extends StObject
     with IGeneratedAPI {
  
  /**
    * @returns qField
    */
  def getDerivedField(qId: String): js.Promise[Any]
  
  /**
    * @returns qData
    */
  def getDerivedFieldData(): js.Promise[Any]
  
  /**
    * @returns qFields
    */
  def getDerivedFields(): js.Promise[Any]
  
  /**
    * @returns qGroups
    */
  def getDerivedGroups(): js.Promise[Any]
  
  /**
    * @returns qInfo
    */
  def getInfo(): js.Promise[Any]
  
  /**
    * @returns qListData
    */
  def getListData(): js.Promise[Any]
  
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the derived field.
    *
    * @returns - A Promise IGenericDerivedFieldProperties
    */
  def getProperties(): js.Promise[IGenericDerivedFieldProperties]
}
object IGenericDerivedFields {
  
  inline def apply(
    getDerivedField: String => js.Promise[Any],
    getDerivedFieldData: CallbackTo[js.Promise[Any]],
    getDerivedFields: CallbackTo[js.Promise[Any]],
    getDerivedGroups: CallbackTo[js.Promise[Any]],
    getInfo: CallbackTo[js.Promise[Any]],
    getListData: CallbackTo[js.Promise[Any]],
    getProperties: CallbackTo[js.Promise[IGenericDerivedFieldProperties]]
  ): IGenericDerivedFields = {
    val __obj = js.Dynamic.literal(getDerivedField = js.Any.fromFunction1(getDerivedField), getDerivedFieldData = getDerivedFieldData.toJsFn, getDerivedFields = getDerivedFields.toJsFn, getDerivedGroups = getDerivedGroups.toJsFn, getInfo = getInfo.toJsFn, getListData = getListData.toJsFn, getProperties = getProperties.toJsFn)
    __obj.asInstanceOf[IGenericDerivedFields]
  }
  
  extension [Self <: IGenericDerivedFields](x: Self) {
    
    inline def setGetDerivedField(value: String => js.Promise[Any]): Self = StObject.set(x, "getDerivedField", js.Any.fromFunction1(value))
    
    inline def setGetDerivedFieldData(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getDerivedFieldData", value.toJsFn)
    
    inline def setGetDerivedFields(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getDerivedFields", value.toJsFn)
    
    inline def setGetDerivedGroups(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getDerivedGroups", value.toJsFn)
    
    inline def setGetInfo(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getInfo", value.toJsFn)
    
    inline def setGetListData(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getListData", value.toJsFn)
    
    inline def setGetProperties(value: CallbackTo[js.Promise[IGenericDerivedFieldProperties]]): Self = StObject.set(x, "getProperties", value.toJsFn)
  }
}
