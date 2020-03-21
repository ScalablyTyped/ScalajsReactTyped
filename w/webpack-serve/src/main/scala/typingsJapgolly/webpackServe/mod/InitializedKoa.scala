package typingsJapgolly.webpackServe.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.node.netMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializedKoa
  extends typingsJapgolly.koa.mod.^[DefaultState, DefaultContext] {
  var server: Server = js.native
  def stop(): Unit = js.native
}

