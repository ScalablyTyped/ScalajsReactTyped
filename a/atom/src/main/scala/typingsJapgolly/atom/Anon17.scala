package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.auto
import typingsJapgolly.atom.atomStrings.hard
import typingsJapgolly.atom.atomStrings.soft
import typingsJapgolly.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon17 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: auto | soft | hard
}

object Anon17 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: auto | soft | hard): Anon17 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon17]
  }
}

