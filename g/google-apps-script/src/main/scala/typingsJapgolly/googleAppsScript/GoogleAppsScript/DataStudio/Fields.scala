package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a set of Fields for a community connector. This set of fields define which
  * dimensions and metrics can be used in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var fields = cc.getFields();
  *     var types = cc.FieldType;
  *
  *     var field1 = fields.newDimension()
  *       // Set other properties as needed.
  *       .setId('field1_id');
  */
trait Fields extends StObject {
  
  def asArray(): js.Array[Field]
  
  def build(): js.Array[Any]
  
  def forIds(ids: js.Array[String]): Fields
  
  def getDefaultDimension(): Field | Null
  
  def getDefaultMetric(): Field | Null
  
  def getFieldById(fieldId: String): Field | Null
  
  def newDimension(): Field
  
  def newMetric(): Field
  
  def setDefaultDimension(fieldId: String): Unit
  
  def setDefaultMetric(fieldId: String): Unit
}
object Fields {
  
  inline def apply(
    asArray: CallbackTo[js.Array[Field]],
    build: CallbackTo[js.Array[Any]],
    forIds: js.Array[String] => Fields,
    getDefaultDimension: CallbackTo[Field | Null],
    getDefaultMetric: CallbackTo[Field | Null],
    getFieldById: String => Field | Null,
    newDimension: CallbackTo[Field],
    newMetric: CallbackTo[Field],
    setDefaultDimension: String => Callback,
    setDefaultMetric: String => Callback
  ): Fields = {
    val __obj = js.Dynamic.literal(asArray = asArray.toJsFn, build = build.toJsFn, forIds = js.Any.fromFunction1(forIds), getDefaultDimension = getDefaultDimension.toJsFn, getDefaultMetric = getDefaultMetric.toJsFn, getFieldById = js.Any.fromFunction1(getFieldById), newDimension = newDimension.toJsFn, newMetric = newMetric.toJsFn, setDefaultDimension = js.Any.fromFunction1((t0: String) => setDefaultDimension(t0).runNow()), setDefaultMetric = js.Any.fromFunction1((t0: String) => setDefaultMetric(t0).runNow()))
    __obj.asInstanceOf[Fields]
  }
  
  extension [Self <: Fields](x: Self) {
    
    inline def setAsArray(value: CallbackTo[js.Array[Field]]): Self = StObject.set(x, "asArray", value.toJsFn)
    
    inline def setBuild(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setForIds(value: js.Array[String] => Fields): Self = StObject.set(x, "forIds", js.Any.fromFunction1(value))
    
    inline def setGetDefaultDimension(value: CallbackTo[Field | Null]): Self = StObject.set(x, "getDefaultDimension", value.toJsFn)
    
    inline def setGetDefaultMetric(value: CallbackTo[Field | Null]): Self = StObject.set(x, "getDefaultMetric", value.toJsFn)
    
    inline def setGetFieldById(value: String => Field | Null): Self = StObject.set(x, "getFieldById", js.Any.fromFunction1(value))
    
    inline def setNewDimension(value: CallbackTo[Field]): Self = StObject.set(x, "newDimension", value.toJsFn)
    
    inline def setNewMetric(value: CallbackTo[Field]): Self = StObject.set(x, "newMetric", value.toJsFn)
    
    inline def setSetDefaultDimension(value: String => Callback): Self = StObject.set(x, "setDefaultDimension", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDefaultMetric(value: String => Callback): Self = StObject.set(x, "setDefaultMetric", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
