package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionBeforeAddEvent extends js.Object {
  var cancellable: Boolean
  var defaultPrevented: Boolean
  var item: js.Any
  var preventDefault: js.Function
}

object CollectionBeforeAddEvent {
  @scala.inline
  def apply(cancellable: Boolean, defaultPrevented: Boolean, item: js.Any, preventDefault: js.Function): CollectionBeforeAddEvent = {
    val __obj = js.Dynamic.literal(cancellable = cancellable.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollectionBeforeAddEvent]
  }
}

