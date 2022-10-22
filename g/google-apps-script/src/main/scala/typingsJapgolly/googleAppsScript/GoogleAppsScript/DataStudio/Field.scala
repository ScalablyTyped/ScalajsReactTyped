package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains field-related data. Its properties determine how the field is used in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var fields = cc.getFields();
  *     var types = cc.FieldType;
  *
  *     var field1 = fields.newDimension()
  *       .setId('field1_id')
  *       .setName('Field 1 ID')
  *       .setDescription('The first field.')
  *       .setType(types.YEAR_MONTH)
  *       .setGroup('DATETIME');
  */
trait Field extends StObject {
  
  def getAggregation(): AggregationType | Null
  
  def getDescription(): String | Null
  
  def getFormula(): String | Null
  
  def getGroup(): String | Null
  
  def getId(): String | Null
  
  def getIsReaggregatable(): Boolean | Null
  
  def getName(): String | Null
  
  def getType(): FieldType | Null
  
  def isDefault(): Boolean
  
  def isDimension(): Boolean
  
  def isHidden(): Boolean
  
  def isMetric(): Boolean
  
  def setAggregation(aggregation: AggregationType): Field
  
  def setDescription(description: String): Field
  
  def setFormula(formula: String): Field
  
  def setGroup(group: String): Field
  
  def setId(id: String): Field
  
  def setIsHidden(isHidden: Boolean): Field
  
  def setIsReaggregatable(isReaggregatable: Boolean): Field
  
  def setName(name: String): Field
  
  def setType(`type`: FieldType): Field
}
object Field {
  
  inline def apply(
    getAggregation: CallbackTo[AggregationType | Null],
    getDescription: CallbackTo[String | Null],
    getFormula: CallbackTo[String | Null],
    getGroup: CallbackTo[String | Null],
    getId: CallbackTo[String | Null],
    getIsReaggregatable: CallbackTo[Boolean | Null],
    getName: CallbackTo[String | Null],
    getType: CallbackTo[FieldType | Null],
    isDefault: CallbackTo[Boolean],
    isDimension: CallbackTo[Boolean],
    isHidden: CallbackTo[Boolean],
    isMetric: CallbackTo[Boolean],
    setAggregation: AggregationType => Field,
    setDescription: String => Field,
    setFormula: String => Field,
    setGroup: String => Field,
    setId: String => Field,
    setIsHidden: Boolean => Field,
    setIsReaggregatable: Boolean => Field,
    setName: String => Field,
    setType: FieldType => Field
  ): Field = {
    val __obj = js.Dynamic.literal(getAggregation = getAggregation.toJsFn, getDescription = getDescription.toJsFn, getFormula = getFormula.toJsFn, getGroup = getGroup.toJsFn, getId = getId.toJsFn, getIsReaggregatable = getIsReaggregatable.toJsFn, getName = getName.toJsFn, getType = getType.toJsFn, isDefault = isDefault.toJsFn, isDimension = isDimension.toJsFn, isHidden = isHidden.toJsFn, isMetric = isMetric.toJsFn, setAggregation = js.Any.fromFunction1(setAggregation), setDescription = js.Any.fromFunction1(setDescription), setFormula = js.Any.fromFunction1(setFormula), setGroup = js.Any.fromFunction1(setGroup), setId = js.Any.fromFunction1(setId), setIsHidden = js.Any.fromFunction1(setIsHidden), setIsReaggregatable = js.Any.fromFunction1(setIsReaggregatable), setName = js.Any.fromFunction1(setName), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setGetAggregation(value: CallbackTo[AggregationType | Null]): Self = StObject.set(x, "getAggregation", value.toJsFn)
    
    inline def setGetDescription(value: CallbackTo[String | Null]): Self = StObject.set(x, "getDescription", value.toJsFn)
    
    inline def setGetFormula(value: CallbackTo[String | Null]): Self = StObject.set(x, "getFormula", value.toJsFn)
    
    inline def setGetGroup(value: CallbackTo[String | Null]): Self = StObject.set(x, "getGroup", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String | Null]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIsReaggregatable(value: CallbackTo[Boolean | Null]): Self = StObject.set(x, "getIsReaggregatable", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[FieldType | Null]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefault", value.toJsFn)
    
    inline def setIsDimension(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDimension", value.toJsFn)
    
    inline def setIsHidden(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHidden", value.toJsFn)
    
    inline def setIsMetric(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMetric", value.toJsFn)
    
    inline def setSetAggregation(value: AggregationType => Field): Self = StObject.set(x, "setAggregation", js.Any.fromFunction1(value))
    
    inline def setSetDescription(value: String => Field): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
    
    inline def setSetFormula(value: String => Field): Self = StObject.set(x, "setFormula", js.Any.fromFunction1(value))
    
    inline def setSetGroup(value: String => Field): Self = StObject.set(x, "setGroup", js.Any.fromFunction1(value))
    
    inline def setSetId(value: String => Field): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetIsHidden(value: Boolean => Field): Self = StObject.set(x, "setIsHidden", js.Any.fromFunction1(value))
    
    inline def setSetIsReaggregatable(value: Boolean => Field): Self = StObject.set(x, "setIsReaggregatable", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => Field): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetType(value: FieldType => Field): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
  }
}
