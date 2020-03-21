package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Fields extends js.Object {
  def asArray(): js.Array[Field]
  def build(): js.Array[_]
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
  @scala.inline
  def apply(
    asArray: CallbackTo[js.Array[Field]],
    build: CallbackTo[js.Array[js.Any]],
    forIds: js.Array[String] => CallbackTo[Fields],
    getDefaultDimension: CallbackTo[Field | Null],
    getDefaultMetric: CallbackTo[Field | Null],
    getFieldById: String => CallbackTo[Field | Null],
    newDimension: CallbackTo[Field],
    newMetric: CallbackTo[Field],
    setDefaultDimension: String => Callback,
    setDefaultMetric: String => Callback
  ): Fields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asArray")(asArray.toJsFn)
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("forIds")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => forIds(t0).runNow()))
    __obj.updateDynamic("getDefaultDimension")(getDefaultDimension.toJsFn)
    __obj.updateDynamic("getDefaultMetric")(getDefaultMetric.toJsFn)
    __obj.updateDynamic("getFieldById")(js.Any.fromFunction1((t0: java.lang.String) => getFieldById(t0).runNow()))
    __obj.updateDynamic("newDimension")(newDimension.toJsFn)
    __obj.updateDynamic("newMetric")(newMetric.toJsFn)
    __obj.updateDynamic("setDefaultDimension")(js.Any.fromFunction1((t0: java.lang.String) => setDefaultDimension(t0).runNow()))
    __obj.updateDynamic("setDefaultMetric")(js.Any.fromFunction1((t0: java.lang.String) => setDefaultMetric(t0).runNow()))
    __obj.asInstanceOf[Fields]
  }
}

