package typingsJapgolly.polished

import typingsJapgolly.polished.sideKeywordMod.SideKeyword
import typingsJapgolly.polished.styleMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("polished/lib/shorthands/border", JSImport.Namespace)
@js.native
object borderMod extends js.Object {
  def default(sideKeyword: String, values: (String | Double)*): Styles = js.native
  def default(sideKeyword: Double, values: (String | Double)*): Styles = js.native
  def default(sideKeyword: SideKeyword, values: (String | Double)*): Styles = js.native
}

