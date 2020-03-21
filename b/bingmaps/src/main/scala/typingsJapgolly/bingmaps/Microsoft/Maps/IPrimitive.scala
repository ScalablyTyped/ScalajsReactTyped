package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrimitive extends js.Object {
  /** Optional property to store any additional metadata for this primitive. */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  def getCursor(): String
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  def getVisible(): Boolean
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  def setOptions(options: IPrimitiveOptions): Unit
}

object IPrimitive {
  @scala.inline
  def apply(
    getCursor: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setOptions: IPrimitiveOptions => Callback,
    metadata: js.Any = null
  ): IPrimitive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCursor")(getCursor.toJsFn)
    __obj.updateDynamic("getVisible")(getVisible.toJsFn)
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.bingmaps.Microsoft.Maps.IPrimitiveOptions) => setOptions(t0).runNow()))
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrimitive]
  }
}

