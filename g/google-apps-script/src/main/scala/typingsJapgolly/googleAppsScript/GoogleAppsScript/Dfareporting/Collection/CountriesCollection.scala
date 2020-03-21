package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CountriesListResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Country
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesCollection extends js.Object {
  // Gets one country by ID.
  def get(profileId: String, dartId: String): Country
  // Retrieves a list of countries.
  def list(profileId: String): CountriesListResponse
}

object CountriesCollection {
  @scala.inline
  def apply(get: (String, String) => CallbackTo[Country], list: String => CallbackTo[CountriesListResponse]): CountriesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[CountriesCollection]
  }
}

