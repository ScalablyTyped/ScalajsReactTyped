package typingsJapgolly.randomJs

import typingsJapgolly.randomJs.typesMod.StringDistribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/hex", JSImport.Namespace)
@js.native
object hexMod extends js.Object {
  def hex(): StringDistribution = js.native
  def hex(uppercase: Boolean): StringDistribution = js.native
}

