package typingsJapgolly.atom

import typingsJapgolly.atom.mod.Invisibles
import typingsJapgolly.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueInvisibles extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Invisibles
}

object AnonValueInvisibles {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Invisibles): AnonValueInvisibles = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueInvisibles]
  }
}

