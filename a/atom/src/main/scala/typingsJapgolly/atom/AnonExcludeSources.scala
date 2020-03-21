package typingsJapgolly.atom

import typingsJapgolly.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeSources extends js.Object {
  var excludeSources: js.UndefOr[js.Array[String]] = js.undefined
  var scope: js.UndefOr[js.Array[String] | ScopeDescriptor] = js.undefined
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonExcludeSources {
  @scala.inline
  def apply(
    excludeSources: js.Array[String] = null,
    scope: js.Array[String] | ScopeDescriptor = null,
    sources: js.Array[String] = null
  ): AnonExcludeSources = {
    val __obj = js.Dynamic.literal()
    if (excludeSources != null) __obj.updateDynamic("excludeSources")(excludeSources.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludeSources]
  }
}

