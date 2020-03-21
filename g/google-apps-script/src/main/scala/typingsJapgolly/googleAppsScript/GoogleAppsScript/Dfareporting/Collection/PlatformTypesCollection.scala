package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlatformType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlatformTypesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesCollection extends js.Object {
  // Gets one platform type by ID.
  def get(profileId: String, id: String): PlatformType
  // Retrieves a list of platform types.
  def list(profileId: String): PlatformTypesListResponse
}

object PlatformTypesCollection {
  @scala.inline
  def apply(
    get: (String, String) => CallbackTo[PlatformType],
    list: String => CallbackTo[PlatformTypesListResponse]
  ): PlatformTypesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[PlatformTypesCollection]
  }
}

