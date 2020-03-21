package typingsJapgolly.avoscloudSdk.leanengineMod

import typingsJapgolly.avoscloudSdk.mod.Push.PushData
import typingsJapgolly.avoscloudSdk.mod.Push.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains functions to deal with Push in AV
  * @name AV.Push
  * @namespace
  */
@JSImport("leanengine", "Push")
@js.native
object Push extends js.Object {
  def send[T](data: PushData): typingsJapgolly.avoscloudSdk.mod.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): typingsJapgolly.avoscloudSdk.mod.Promise[T] = js.native
}

