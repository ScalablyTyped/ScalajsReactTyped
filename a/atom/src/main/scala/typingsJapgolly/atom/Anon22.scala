package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.backward
import typingsJapgolly.atom.atomStrings.closest
import typingsJapgolly.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon22 extends js.Object {
  var clipDirection: backward | forward | closest
}

object Anon22 {
  @scala.inline
  def apply(clipDirection: backward | forward | closest): Anon22 = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon22]
  }
}

