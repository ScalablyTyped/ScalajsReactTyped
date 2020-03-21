package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerModuleNameCache extends js.Object {
  def get(directory: java.lang.String): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
  def set(directory: java.lang.String, result: ResolvedModuleWithFailedLookupLocations): Unit
}

object PerModuleNameCache {
  @scala.inline
  def apply(
    get: java.lang.String => CallbackTo[js.UndefOr[ResolvedModuleWithFailedLookupLocations]],
    set: (java.lang.String, ResolvedModuleWithFailedLookupLocations) => Callback
  ): PerModuleNameCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations) => set(t0, t1).runNow()))
    __obj.asInstanceOf[PerModuleNameCache]
  }
}

