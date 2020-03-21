package typingsJapgolly.unzipper.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.unzipper.AnonCompressedSize
import typingsJapgolly.unzipper.AnonDisknum
import typingsJapgolly.unzipper.AnonPath
import typingsJapgolly.unzipper.TransformpromisePromisevo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends Transform {
  var extra: AnonDisknum = js.native
  var path: String = js.native
  var props: AnonPath = js.native
  var `type`: String = js.native
  var vars: AnonCompressedSize = js.native
  def autodrain(): TransformpromisePromisevo = js.native
  def buffer(): js.Promise[Buffer] = js.native
}

