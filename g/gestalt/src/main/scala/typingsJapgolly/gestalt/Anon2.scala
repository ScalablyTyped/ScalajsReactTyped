package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var event: ReactEventFrom[HTMLVideoElement]
}

object Anon2 {
  @scala.inline
  def apply(event: ReactEventFrom[HTMLVideoElement]): Anon2 = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon2]
  }
}

