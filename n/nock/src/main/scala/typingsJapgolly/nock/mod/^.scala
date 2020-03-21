package typingsJapgolly.nock.mod

import typingsJapgolly.node.NodeJS.EventEmitter
import typingsJapgolly.node.urlMod.Url
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var back: Back_ = js.native
  var emitter: EventEmitter = js.native
  var recorder: Recorder_ = js.native
  def apply(basePath: String): Scope = js.native
  def apply(basePath: String, options: Options): Scope = js.native
  def apply(basePath: Url): Scope = js.native
  def apply(basePath: Url, options: Options): Scope = js.native
  def apply(basePath: RegExp): Scope = js.native
  def apply(basePath: RegExp, options: Options): Scope = js.native
}

