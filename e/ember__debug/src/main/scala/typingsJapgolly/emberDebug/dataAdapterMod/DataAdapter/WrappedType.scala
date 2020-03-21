package typingsJapgolly.emberDebug.dataAdapterMod.DataAdapter

import japgolly.scalajs.react.Callback
import typingsJapgolly.emberDebug.AnonColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedType extends js.Object {
  var `type`: AnonColumns
  def release(): Unit
}

object WrappedType {
  @scala.inline
  def apply(release: Callback, `type`: AnonColumns): WrappedType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedType]
  }
}

