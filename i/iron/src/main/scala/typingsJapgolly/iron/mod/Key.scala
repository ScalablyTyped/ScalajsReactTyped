package typingsJapgolly.iron.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var iv: String
  var key: Buffer
  var salt: String
}

object Key {
  @scala.inline
  def apply(iv: String, key: Buffer, salt: String): Key = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Key]
  }
}

