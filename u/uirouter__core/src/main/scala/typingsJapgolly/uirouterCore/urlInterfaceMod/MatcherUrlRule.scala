package typingsJapgolly.uirouterCore.urlInterfaceMod

import typingsJapgolly.uirouterCore.uirouterCoreStrings.STATE
import typingsJapgolly.uirouterCore.uirouterCoreStrings.URLMATCHER
import typingsJapgolly.uirouterCore.urlMatcherMod.UrlMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherUrlRule extends UrlRule {
  @JSName("type")
  var type_MatcherUrlRule: URLMATCHER | STATE = js.native
  var urlMatcher: UrlMatcher = js.native
}

