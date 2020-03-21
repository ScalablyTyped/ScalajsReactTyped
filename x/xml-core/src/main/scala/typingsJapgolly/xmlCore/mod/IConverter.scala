package typingsJapgolly.xmlCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConverter[T] extends js.Object {
  /**
    * Converts value from Object to Xml element
    *
    * @memberOf IConverter
    */
  def get(value: T): js.UndefOr[String]
  /**
    * Converts value from Xml element to Object
    *
    * @memberOf IConverter
    */
  def set(value: String): T
}

object IConverter {
  @scala.inline
  def apply[T](get: T => CallbackTo[js.UndefOr[String]], set: String => CallbackTo[T]): IConverter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: T) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: java.lang.String) => set(t0).runNow()))
    __obj.asInstanceOf[IConverter[T]]
  }
}

