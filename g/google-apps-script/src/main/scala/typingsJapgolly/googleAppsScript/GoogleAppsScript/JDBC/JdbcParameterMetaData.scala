package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC ParameterMetaData. For documentation of this class, see
  * java.sql.ParameterMetaData.
  */
trait JdbcParameterMetaData extends js.Object {
  def getParameterClassName(param: Integer): String
  def getParameterCount(): Integer
  def getParameterMode(param: Integer): Integer
  def getParameterType(param: Integer): Integer
  def getParameterTypeName(param: Integer): String
  def getPrecision(param: Integer): Integer
  def getScale(param: Integer): Integer
  def isNullable(param: Integer): Integer
  def isSigned(param: Integer): Boolean
}

object JdbcParameterMetaData {
  @scala.inline
  def apply(
    getParameterClassName: Integer => CallbackTo[String],
    getParameterCount: CallbackTo[Integer],
    getParameterMode: Integer => CallbackTo[Integer],
    getParameterType: Integer => CallbackTo[Integer],
    getParameterTypeName: Integer => CallbackTo[String],
    getPrecision: Integer => CallbackTo[Integer],
    getScale: Integer => CallbackTo[Integer],
    isNullable: Integer => CallbackTo[Integer],
    isSigned: Integer => CallbackTo[Boolean]
  ): JdbcParameterMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getParameterClassName")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getParameterClassName(t0).runNow()))
    __obj.updateDynamic("getParameterCount")(getParameterCount.toJsFn)
    __obj.updateDynamic("getParameterMode")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getParameterMode(t0).runNow()))
    __obj.updateDynamic("getParameterType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getParameterType(t0).runNow()))
    __obj.updateDynamic("getParameterTypeName")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getParameterTypeName(t0).runNow()))
    __obj.updateDynamic("getPrecision")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getPrecision(t0).runNow()))
    __obj.updateDynamic("getScale")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => getScale(t0).runNow()))
    __obj.updateDynamic("isNullable")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isNullable(t0).runNow()))
    __obj.updateDynamic("isSigned")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => isSigned(t0).runNow()))
    __obj.asInstanceOf[JdbcParameterMetaData]
  }
}

