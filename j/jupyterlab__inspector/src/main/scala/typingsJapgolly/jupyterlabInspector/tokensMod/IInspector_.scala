package typingsJapgolly.jupyterlabInspector.tokensMod

import typingsJapgolly.jupyterlabInspector.tokensMod.IInspector.IInspectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInspector_ extends js.Object {
  /**
    * The source of events the inspector listens for.
    */
  var source: IInspectable | Null
}

object IInspector_ {
  @scala.inline
  def apply(source: IInspectable = null): IInspector_ = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspector_]
  }
}

