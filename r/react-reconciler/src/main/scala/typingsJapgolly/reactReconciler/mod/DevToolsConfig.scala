package typingsJapgolly.reactReconciler.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevToolsConfig[Instance, TextInstance] extends js.Object {
  var bundleType: BundleType
  // Note: this actually *does* depend on Fiber internal fields.
  // Used by "inspect clicked DOM element" in React DevTools.
  var findFiberByHostInstance: js.UndefOr[js.Function1[/* instance */ Instance | TextInstance, Fiber]] = js.undefined
  // Used by RN in-app inspector.
  // This API is unfortunately RN-specific.
  // TODO: Change it to accept Fiber instead and type it properly.
  var getInspectorDataForViewTag: js.UndefOr[js.Function1[/* tag */ Double, js.Object]] = js.undefined
  var rendererPackageName: String
  var version: String
}

object DevToolsConfig {
  @scala.inline
  def apply[Instance, TextInstance](
    bundleType: BundleType,
    rendererPackageName: String,
    version: String,
    findFiberByHostInstance: /* instance */ Instance | TextInstance => CallbackTo[Fiber] = null,
    getInspectorDataForViewTag: /* tag */ Double => CallbackTo[js.Object] = null
  ): DevToolsConfig[Instance, TextInstance] = {
    val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], rendererPackageName = rendererPackageName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (findFiberByHostInstance != null) __obj.updateDynamic("findFiberByHostInstance")(js.Any.fromFunction1((t0: /* instance */ Instance | TextInstance) => findFiberByHostInstance(t0).runNow()))
    if (getInspectorDataForViewTag != null) __obj.updateDynamic("getInspectorDataForViewTag")(js.Any.fromFunction1((t0: /* tag */ scala.Double) => getInspectorDataForViewTag(t0).runNow()))
    __obj.asInstanceOf[DevToolsConfig[Instance, TextInstance]]
  }
}

