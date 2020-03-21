package typingsJapgolly.intercomjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.intercomjs.intercom.Intercom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntercomStatic extends js.Object {
  /**
    * Removes all data associated with intercom from localStorage.
    */
  def destroy(): Unit
  /**
    * Returns an instance of Intercom. If one doesn't exist, it will be instantiated.
    * @return an instance of Intercom.
    */
  def getInstance(): Intercom
}

object IntercomStatic {
  @scala.inline
  def apply(destroy: Callback, getInstance: CallbackTo[Intercom]): IntercomStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getInstance")(getInstance.toJsFn)
    __obj.asInstanceOf[IntercomStatic]
  }
}

