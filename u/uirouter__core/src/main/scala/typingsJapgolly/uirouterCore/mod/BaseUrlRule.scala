package typingsJapgolly.uirouterCore.mod

import typingsJapgolly.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import typingsJapgolly.uirouterCore.urlInterfaceMod.UrlRuleMatchFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "BaseUrlRule")
@js.native
class BaseUrlRule protected ()
  extends typingsJapgolly.uirouterCore.libUrlMod.BaseUrlRule {
  def this(`match`: UrlRuleMatchFn) = this()
  def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
}

