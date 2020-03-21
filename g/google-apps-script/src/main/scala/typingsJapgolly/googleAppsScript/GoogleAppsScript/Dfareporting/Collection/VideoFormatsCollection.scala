package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.VideoFormat
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.VideoFormatsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsCollection extends js.Object {
  // Gets one video format by ID.
  def get(profileId: String, id: Double): VideoFormat
  // Lists available video formats.
  def list(profileId: String): VideoFormatsListResponse
}

object VideoFormatsCollection {
  @scala.inline
  def apply(
    get: (String, Double) => CallbackTo[VideoFormat],
    list: String => CallbackTo[VideoFormatsListResponse]
  ): VideoFormatsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[VideoFormatsCollection]
  }
}

