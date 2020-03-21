package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Config")
@js.native
class Config ()
  extends typingsJapgolly.nodegit.configMod.Config

/* static members */
@JSImport("nodegit", "Config")
@js.native
object Config extends js.Object {
  def findProgramdata(): js.Promise[typingsJapgolly.nodegit.bufMod.Buf] = js.native
  def openDefault(): js.Promise[typingsJapgolly.nodegit.configMod.Config] = js.native
}

