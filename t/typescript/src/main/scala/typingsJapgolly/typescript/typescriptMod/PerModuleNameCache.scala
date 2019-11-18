package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerModuleNameCache extends js.Object {
  def get(directory: String): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
  def set(directory: String, result: ResolvedModuleWithFailedLookupLocations): Unit
}

object PerModuleNameCache {
  @scala.inline
  def apply(
    get: String => CallbackTo[js.UndefOr[ResolvedModuleWithFailedLookupLocations]],
    set: (String, ResolvedModuleWithFailedLookupLocations) => Callback
  ): PerModuleNameCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.typescript.typescriptMod.ResolvedModuleWithFailedLookupLocations) => set(t0, t1).runNow()))
    __obj.asInstanceOf[PerModuleNameCache]
  }
}

