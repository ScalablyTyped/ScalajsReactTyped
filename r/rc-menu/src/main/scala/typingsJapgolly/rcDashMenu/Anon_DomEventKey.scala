package typingsJapgolly.rcDashMenu

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomEventKey extends js.Object {
  var domEvent: ReactMouseEventFrom[HTMLElement]
  var key: Key
}

object Anon_DomEventKey {
  @scala.inline
  def apply(domEvent: ReactMouseEventFrom[HTMLElement], key: Key): Anon_DomEventKey = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DomEventKey]
  }
}

