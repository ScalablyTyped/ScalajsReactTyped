package typingsJapgolly.koaCsrf.mod.koaAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var csrf: String
}

object Context {
  @scala.inline
  def apply(csrf: String): Context = {
    val __obj = js.Dynamic.literal(csrf = csrf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

