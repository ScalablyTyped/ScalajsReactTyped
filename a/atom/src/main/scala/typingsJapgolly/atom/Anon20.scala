package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.Subsequence
import typingsJapgolly.atom.atomStrings.Symbol
import typingsJapgolly.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon20 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Subsequence | Symbol
}

object Anon20 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Subsequence | Symbol): Anon20 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon20]
  }
}

