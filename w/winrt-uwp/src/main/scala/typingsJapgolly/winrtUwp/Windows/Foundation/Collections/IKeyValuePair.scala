package typingsJapgolly.winrtUwp.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a key-value pair. This is typically used as a constraint type when you need to encapsulate two type parameters into one to satisfy the constraints of another generic interface. */
trait IKeyValuePair[K, V] extends js.Object {
  /** Gets the key of the key-value pair. */
  var key: K
  /** Gets the value of the key-value pair. */
  var value: V
}

object IKeyValuePair {
  @scala.inline
  def apply[K, V](key: K, value: V): IKeyValuePair[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeyValuePair[K, V]]
  }
}

