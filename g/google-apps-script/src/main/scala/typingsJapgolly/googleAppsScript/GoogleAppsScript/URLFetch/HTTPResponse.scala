package typingsJapgolly.googleAppsScript.GoogleAppsScript.URLFetch

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Byte
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class allows users to access specific information on HTTP responses.
  * See also
  *
  * UrlFetchApp
  */
@js.native
trait HTTPResponse extends js.Object {
  def getAllHeaders(): js.Object = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getContent(): js.Array[Byte] = js.native
  def getContentText(): String = js.native
  def getContentText(charset: String): String = js.native
  def getHeaders(): js.Object = js.native
  def getResponseCode(): Integer = js.native
}

