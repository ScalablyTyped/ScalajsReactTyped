package typingsJapgolly.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listenable extends js.Object {
  var listen: ListenFn
}

object Listenable {
  @scala.inline
  def apply(listen: ListenFn): Listenable = {
    val __obj = js.Dynamic.literal(listen = listen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Listenable]
  }
}

