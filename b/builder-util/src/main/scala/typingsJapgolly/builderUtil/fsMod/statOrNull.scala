package typingsJapgolly.builderUtil.fsMod

import typingsJapgolly.fsExtra.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/fs", "statOrNull")
@js.native
object statOrNull extends js.Object {
  def apply(file: String): js.Promise[Stats | Null] = js.native
}

