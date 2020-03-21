package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.default
import typingsJapgolly.atom.atomStrings.srgb
import typingsJapgolly.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon14 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: default | srgb
}

object Anon14 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: default | srgb): Anon14 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon14]
  }
}

