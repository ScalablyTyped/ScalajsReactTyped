package typingsJapgolly.knockout.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModelSharedInstance extends _ViewModel {
  var instance: js.Any
}

object ViewModelSharedInstance {
  @scala.inline
  def apply(instance: js.Any): ViewModelSharedInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewModelSharedInstance]
  }
}

