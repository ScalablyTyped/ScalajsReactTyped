package typingsJapgolly.gapiUrlshortener.gapi.client.urlshortener

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiUrlshortener.AnonFields
import typingsJapgolly.gapiUrlshortener.AnonProjection
import typingsJapgolly.gapiUrlshortener.AnonRequestBody
import typingsJapgolly.gapiUrlshortener.GoogleApiUrlShortenerUrlResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait url extends js.Object {
  /**
    * Expands a short URL or gets creation time and analytics.
    */
  def get(`object`: AnonFields): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Creates a new short URL.
    */
  def insert(`object`: AnonRequestBody): HttpRequest[GoogleApiUrlShortenerUrlResource]
  /**
    * Retrieves a list of URLs shortened by a user.
    */
  def list(`object`: AnonProjection): HttpRequest[GoogleApiUrlShortenerUrlResource]
}

object url {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[HttpRequest[GoogleApiUrlShortenerUrlResource]],
    insert: AnonRequestBody => CallbackTo[HttpRequest[GoogleApiUrlShortenerUrlResource]],
    list: AnonProjection => CallbackTo[HttpRequest[GoogleApiUrlShortenerUrlResource]]
  ): url = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiUrlshortener.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiUrlshortener.AnonRequestBody) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiUrlshortener.AnonProjection) => list(t0).runNow()))
    __obj.asInstanceOf[url]
  }
}

