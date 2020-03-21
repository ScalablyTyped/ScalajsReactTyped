package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.always
import typingsJapgolly.atom.atomStrings.no
import typingsJapgolly.atom.atomStrings.yes
import typingsJapgolly.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeDescriptorScopeDescriptorValue extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: no | yes | always
}

object AnonScopeDescriptorScopeDescriptorValue {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: no | yes | always): AnonScopeDescriptorScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScopeDescriptorScopeDescriptorValue]
  }
}

