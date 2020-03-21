package typingsJapgolly.watchify.mod

import typingsJapgolly.browserify.mod.BrowserifyObject
import typingsJapgolly.watchify.AnonCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Watch mode for browserify builds.
  * Update any source file and your browserify bundle will be recompiled on the spot
  */
@js.native
trait Constructor extends js.Object {
  var args: AnonCache = js.native
  def apply(b: BrowserifyObject): BrowserifyObject = js.native
  def apply(b: BrowserifyObject, opts: Options): BrowserifyObject = js.native
  def apply[T /* <: BrowserifyObject */](b: T): T = js.native
  def apply[T /* <: BrowserifyObject */](b: T, opts: Options): T = js.native
  /** Close all the open watch handles. */
  def close(): Unit = js.native
}

