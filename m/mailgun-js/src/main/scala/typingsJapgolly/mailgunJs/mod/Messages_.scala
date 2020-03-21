package typingsJapgolly.mailgunJs.mod

import typingsJapgolly.mailgunJs.mod.messages.BatchData
import typingsJapgolly.mailgunJs.mod.messages.SendData
import typingsJapgolly.mailgunJs.mod.messages.SendResponse
import typingsJapgolly.mailgunJs.mod.messages.SendTemplateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages_ extends js.Object {
  def send(data: BatchData): js.Promise[SendResponse] = js.native
  def send(data: BatchData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
  def send(data: SendData): js.Promise[SendResponse] = js.native
  def send(data: SendData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
  def send(data: SendTemplateData): js.Promise[SendResponse] = js.native
  def send(data: SendTemplateData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
}

