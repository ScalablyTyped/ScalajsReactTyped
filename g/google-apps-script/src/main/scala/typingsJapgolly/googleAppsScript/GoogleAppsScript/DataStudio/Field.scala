package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Field extends js.Object {
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
  @scala.inline
  def apply(
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
    setAggregation: AggregationType => CallbackTo[Field],
    setDescription: String => CallbackTo[Field],
    setFormula: String => CallbackTo[Field],
    setGroup: String => CallbackTo[Field],
    setId: String => CallbackTo[Field],
    setIsHidden: Boolean => CallbackTo[Field],
    setIsReaggregatable: Boolean => CallbackTo[Field],
    setName: String => CallbackTo[Field],
    setType: FieldType => CallbackTo[Field]
  ): Field = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAggregation")(getAggregation.toJsFn)
    __obj.updateDynamic("getDescription")(getDescription.toJsFn)
    __obj.updateDynamic("getFormula")(getFormula.toJsFn)
    __obj.updateDynamic("getGroup")(getGroup.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getIsReaggregatable")(getIsReaggregatable.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("isDefault")(isDefault.toJsFn)
    __obj.updateDynamic("isDimension")(isDimension.toJsFn)
    __obj.updateDynamic("isHidden")(isHidden.toJsFn)
    __obj.updateDynamic("isMetric")(isMetric.toJsFn)
    __obj.updateDynamic("setAggregation")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio.AggregationType) => setAggregation(t0).runNow()))
    __obj.updateDynamic("setDescription")(js.Any.fromFunction1((t0: java.lang.String) => setDescription(t0).runNow()))
    __obj.updateDynamic("setFormula")(js.Any.fromFunction1((t0: java.lang.String) => setFormula(t0).runNow()))
    __obj.updateDynamic("setGroup")(js.Any.fromFunction1((t0: java.lang.String) => setGroup(t0).runNow()))
    __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: java.lang.String) => setId(t0).runNow()))
    __obj.updateDynamic("setIsHidden")(js.Any.fromFunction1((t0: scala.Boolean) => setIsHidden(t0).runNow()))
    __obj.updateDynamic("setIsReaggregatable")(js.Any.fromFunction1((t0: scala.Boolean) => setIsReaggregatable(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio.FieldType) => setType(t0).runNow()))
    __obj.asInstanceOf[Field]
  }
}

