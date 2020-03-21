package typingsJapgolly.graylog2

import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(message: String): Unit = js.native
  def apply(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(message: String, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def apply(
    message: String,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def apply(message: String, additionalFields: Record[String, _]): Unit = js.native
  def apply(
    message: String,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(message: String, fullMessage: String): Unit = js.native
  def apply(message: String, fullMessage: String, additionalFields: Record[String, _]): Unit = js.native
  def apply(message: String, fullMessage: String, additionalFields: Record[String, _], timestamp: Double): Unit = js.native
  def apply(message: Error): Unit = js.native
  def apply(
    message: Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(message: Error, _underscore: js.UndefOr[scala.Nothing], additionalFields: Record[String, _]): Unit = js.native
  def apply(
    message: Error,
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
  def apply(message: Error, additionalFields: Record[String, _]): Unit = js.native
  def apply(
    message: Error,
    additionalFields: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(message: Record[String, _]): Unit = js.native
  def apply(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: js.UndefOr[scala.Nothing],
    timestamp: Double
  ): Unit = js.native
  def apply(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _]
  ): Unit = js.native
  def apply(
    message: Record[String, _],
    _underscore: js.UndefOr[scala.Nothing],
    additionalFields: Record[String, _],
    timestamp: Double
  ): Unit = js.native
}

