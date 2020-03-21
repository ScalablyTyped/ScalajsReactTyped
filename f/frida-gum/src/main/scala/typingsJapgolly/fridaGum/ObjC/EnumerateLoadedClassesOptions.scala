package typingsJapgolly.fridaGum.ObjC

import typingsJapgolly.fridaGum.ModuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateLoadedClassesOptions extends js.Object {
  /**
    * Limit enumeration to modules in the given module map.
    */
  var ownedBy: js.UndefOr[ModuleMap] = js.undefined
}

object EnumerateLoadedClassesOptions {
  @scala.inline
  def apply(ownedBy: ModuleMap = null): EnumerateLoadedClassesOptions = {
    val __obj = js.Dynamic.literal()
    if (ownedBy != null) __obj.updateDynamic("ownedBy")(ownedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateLoadedClassesOptions]
  }
}

