package typingsJapgolly.uirouterCore.urlInterfaceMod

import typingsJapgolly.uirouterCore.uirouterCoreStrings.REGEXP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpRule extends UrlRule {
  var regexp: js.RegExp = js.native
  @JSName("type")
  var type_RegExpRule: REGEXP = js.native
}

