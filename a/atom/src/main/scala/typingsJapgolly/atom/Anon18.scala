package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typingsJapgolly.atom.atomStrings.`tab and enter`
import typingsJapgolly.atom.atomStrings.enter
import typingsJapgolly.atom.atomStrings.tab
import typingsJapgolly.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon18 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
}

object Anon18 {
  @scala.inline
  def apply(
    scopeDescriptor: ScopeDescriptor,
    value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  ): Anon18 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon18]
  }
}

