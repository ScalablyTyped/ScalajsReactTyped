package typingsJapgolly.phantom.mod

import typingsJapgolly.phantom.phantomBooleans.`true`
import typingsJapgolly.phantom.phantomStrings.callback
import typingsJapgolly.phantom.phantomStrings.phantom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPhantomCallback extends js.Object {
  var method: callback
  var parent: phantom
  var target: js.Function
  var transform: `true`
}

object IPhantomCallback {
  @scala.inline
  def apply(method: callback, parent: phantom, target: js.Function, transform: `true`): IPhantomCallback = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPhantomCallback]
  }
}

