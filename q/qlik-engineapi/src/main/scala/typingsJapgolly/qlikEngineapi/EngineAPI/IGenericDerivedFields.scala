package typingsJapgolly.qlikEngineapi.EngineAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikEngineapi.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGenericDerivedFields extends IGeneratedAPI {
  /**
    * @returns qField
    */
  def getDerivedField(qId: String): js.Promise[_]
  /**
    * @returns qData
    */
  def getDerivedFieldData(): js.Promise[_]
  /**
    * @returns qFields
    */
  def getDerivedFields(): js.Promise[_]
  /**
    * @returns qGroups
    */
  def getDerivedGroups(): js.Promise[_]
  /**
    * @returns qInfo
    */
  def getInfo(): js.Promise[_]
  /**
    * @returns qListData
    */
  def getListData(): js.Promise[_]
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the derived field.
    *
    * @returns - A Promise IGenericDerivedFieldProperties
    */
  def getProperties(): js.Promise[IGenericDerivedFieldProperties]
}

object IGenericDerivedFields {
  @scala.inline
  def apply(
    getDerivedField: String => CallbackTo[js.Promise[js.Any]],
    getDerivedFieldData: CallbackTo[js.Promise[js.Any]],
    getDerivedFields: CallbackTo[js.Promise[js.Any]],
    getDerivedGroups: CallbackTo[js.Promise[js.Any]],
    getInfo: CallbackTo[js.Promise[js.Any]],
    getListData: CallbackTo[js.Promise[js.Any]],
    getProperties: CallbackTo[js.Promise[IGenericDerivedFieldProperties]]
  ): IGenericDerivedFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDerivedField")(js.Any.fromFunction1((t0: java.lang.String) => getDerivedField(t0).runNow()))
    __obj.updateDynamic("getDerivedFieldData")(getDerivedFieldData.toJsFn)
    __obj.updateDynamic("getDerivedFields")(getDerivedFields.toJsFn)
    __obj.updateDynamic("getDerivedGroups")(getDerivedGroups.toJsFn)
    __obj.updateDynamic("getInfo")(getInfo.toJsFn)
    __obj.updateDynamic("getListData")(getListData.toJsFn)
    __obj.updateDynamic("getProperties")(getProperties.toJsFn)
    __obj.asInstanceOf[IGenericDerivedFields]
  }
}

