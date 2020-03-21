package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** JdbcAdvancedParameters */
trait CloudSqlAdvancedParameters extends js.Object {
  /** connection timeout in seconds */
  var connectTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  /** the database to connect to */
  var database: js.UndefOr[String] = js.undefined
  /** the name of a Google SQL Service instance */
  var instance: js.UndefOr[String] = js.undefined
  /** the user's password */
  var password: js.UndefOr[String] = js.undefined
  /** query timeout in seconds */
  var queryTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  /** the username to pass to the database */
  var user: js.UndefOr[String] = js.undefined
}

object CloudSqlAdvancedParameters {
  @scala.inline
  def apply(
    connectTimeoutSeconds: Int | Double = null,
    database: String = null,
    instance: String = null,
    password: String = null,
    queryTimeoutSeconds: Int | Double = null,
    user: String = null
  ): CloudSqlAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    if (connectTimeoutSeconds != null) __obj.updateDynamic("connectTimeoutSeconds")(connectTimeoutSeconds.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (queryTimeoutSeconds != null) __obj.updateDynamic("queryTimeoutSeconds")(queryTimeoutSeconds.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudSqlAdvancedParameters]
  }
}

