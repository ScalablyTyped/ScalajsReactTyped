package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the fields to show.
  */
trait IFieldListDef extends js.Object {
  /**
    * Shows the fields defined on the fly if set to true.
    */
  var qShowDefinitionOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows the fields and derived fields if set to true.
    */
  var qShowDerivedFields: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows the hidden fields if set to true.
    */
  var qShowHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows the Direct Discovery measure fields if set to true.
    */
  var qShowImplicit: js.UndefOr[Boolean] = js.undefined
  /**
    * Show the semantic fields if set to true.
    */
  var qShowSemantic: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows the tables and fields present in the data model viewer if set to true.
    */
  var qShowSrcTables: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows the system tables if set to true.
    */
  var qShowSystem: js.UndefOr[Boolean] = js.undefined
}

object IFieldListDef {
  @scala.inline
  def apply(
    qShowDefinitionOnly: js.UndefOr[Boolean] = js.undefined,
    qShowDerivedFields: js.UndefOr[Boolean] = js.undefined,
    qShowHidden: js.UndefOr[Boolean] = js.undefined,
    qShowImplicit: js.UndefOr[Boolean] = js.undefined,
    qShowSemantic: js.UndefOr[Boolean] = js.undefined,
    qShowSrcTables: js.UndefOr[Boolean] = js.undefined,
    qShowSystem: js.UndefOr[Boolean] = js.undefined
  ): IFieldListDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(qShowDefinitionOnly)) __obj.updateDynamic("qShowDefinitionOnly")(qShowDefinitionOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowDerivedFields)) __obj.updateDynamic("qShowDerivedFields")(qShowDerivedFields.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowHidden)) __obj.updateDynamic("qShowHidden")(qShowHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowImplicit)) __obj.updateDynamic("qShowImplicit")(qShowImplicit.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowSemantic)) __obj.updateDynamic("qShowSemantic")(qShowSemantic.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowSrcTables)) __obj.updateDynamic("qShowSrcTables")(qShowSrcTables.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowSystem)) __obj.updateDynamic("qShowSystem")(qShowSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldListDef]
  }
}

