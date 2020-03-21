package typingsJapgolly.jupyterlabCoreutils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangedArgs[T, U /* <: String */] extends js.Object {
  /**
    * The name of the changed attribute.
    */
  var name: U
  /**
    * The new value of the changed attribute.
    */
  var newValue: T
  /**
    * The old value of the changed attribute.
    */
  var oldValue: T
}

object IChangedArgs {
  @scala.inline
  def apply[T, U /* <: String */](name: U, newValue: T, oldValue: T): IChangedArgs[T, U] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IChangedArgs[T, U]]
  }
}

