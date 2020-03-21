package typingsJapgolly.libpq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultError extends js.Object {
  var constraintName: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var dataTypeName: js.UndefOr[String] = js.undefined
  var internalPosition: js.UndefOr[String] = js.undefined
  var internalQuery: js.UndefOr[String] = js.undefined
  var messageDetail: js.UndefOr[String] = js.undefined
  var messageHint: js.UndefOr[String] = js.undefined
  var messagePrimary: String
  var schemaName: js.UndefOr[String] = js.undefined
  var severity: String
  var sourceFile: String
  var sourceFunction: String
  var sourceLine: String
  var sqlState: String
  var statementPosition: js.UndefOr[String] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
}

object ResultError {
  @scala.inline
  def apply(
    messagePrimary: String,
    severity: String,
    sourceFile: String,
    sourceFunction: String,
    sourceLine: String,
    sqlState: String,
    constraintName: String = null,
    context: String = null,
    dataTypeName: String = null,
    internalPosition: String = null,
    internalQuery: String = null,
    messageDetail: String = null,
    messageHint: String = null,
    schemaName: String = null,
    statementPosition: String = null,
    tableName: String = null
  ): ResultError = {
    val __obj = js.Dynamic.literal(messagePrimary = messagePrimary.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceFunction = sourceFunction.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any], sqlState = sqlState.asInstanceOf[js.Any])
    if (constraintName != null) __obj.updateDynamic("constraintName")(constraintName.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataTypeName != null) __obj.updateDynamic("dataTypeName")(dataTypeName.asInstanceOf[js.Any])
    if (internalPosition != null) __obj.updateDynamic("internalPosition")(internalPosition.asInstanceOf[js.Any])
    if (internalQuery != null) __obj.updateDynamic("internalQuery")(internalQuery.asInstanceOf[js.Any])
    if (messageDetail != null) __obj.updateDynamic("messageDetail")(messageDetail.asInstanceOf[js.Any])
    if (messageHint != null) __obj.updateDynamic("messageHint")(messageHint.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    if (statementPosition != null) __obj.updateDynamic("statementPosition")(statementPosition.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultError]
  }
}

