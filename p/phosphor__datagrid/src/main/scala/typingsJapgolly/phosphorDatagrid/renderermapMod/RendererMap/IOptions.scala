package typingsJapgolly.phosphorDatagrid.renderermapMod.RendererMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a renderer map.
  */
trait IOptions extends js.Object {
  /**
    * The priority of the metadata keys used for matching.
    *
    * Keys at the front of the array have a higher priority. Metadata
    * keys which are not included in the array are ordered by locale.
    *
    * The default is `[]`.
    */
  var priority: js.UndefOr[js.Array[String]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(priority: js.Array[String] = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

