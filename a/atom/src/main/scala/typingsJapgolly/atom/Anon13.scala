package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.experimental
import typingsJapgolly.atom.atomStrings.native
import typingsJapgolly.atom.atomStrings.poll
import typingsJapgolly.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon13 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: native | experimental | poll | typingsJapgolly.atom.atomStrings.atom
}

object Anon13 {
  @scala.inline
  def apply(
    scopeDescriptor: ScopeDescriptor,
    value: native | experimental | poll | typingsJapgolly.atom.atomStrings.atom
  ): Anon13 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon13]
  }
}

