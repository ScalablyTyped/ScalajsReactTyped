package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.limited
import typingsJapgolly.atom.atomStrings.no
import typingsJapgolly.atom.atomStrings.undecided
import typingsJapgolly.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon12 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: limited | no | undecided
}

object Anon12 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: limited | no | undecided): Anon12 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon12]
  }
}

