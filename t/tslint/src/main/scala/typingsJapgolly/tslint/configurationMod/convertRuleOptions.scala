package typingsJapgolly.tslint.configurationMod

import typingsJapgolly.std.Map
import typingsJapgolly.tslint.PartialIOptions
import typingsJapgolly.tslint.ruleMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/configuration", "convertRuleOptions")
@js.native
object convertRuleOptions extends js.Object {
  def apply(ruleConfiguration: Map[String, PartialIOptions]): js.Array[IOptions] = js.native
}

