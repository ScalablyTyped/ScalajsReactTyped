package typingsJapgolly.reactQrReader.mod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.reactQrReader.reactQrReaderBooleans.`false`
import typingsJapgolly.reactQrReader.reactQrReaderStrings.environment
import typingsJapgolly.reactQrReader.reactQrReaderStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait props extends js.Object {
  var className: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double | `false`] = js.native
  var facingMode: js.UndefOr[user | environment] = js.native
  var legacyMode: js.UndefOr[Boolean] = js.native
  var onImageLoad: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var resolution: js.UndefOr[Double] = js.native
  var showViewFinder: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Any] = js.native
  def onError(err: js.Any): Unit = js.native
  def onScan(): Unit = js.native
  def onScan(data: String): Unit = js.native
}

