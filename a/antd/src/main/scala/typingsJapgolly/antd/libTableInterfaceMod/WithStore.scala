package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libTableCreateStoreMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStore extends js.Object {
  var checkboxPropsCache: CheckboxPropsCache
  var store: Store
  def setCheckboxPropsCache(cache: CheckboxPropsCache): Unit
}

object WithStore {
  @scala.inline
  def apply(
    checkboxPropsCache: CheckboxPropsCache,
    setCheckboxPropsCache: CheckboxPropsCache => Callback,
    store: Store
  ): WithStore = {
    val __obj = js.Dynamic.literal(checkboxPropsCache = checkboxPropsCache.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.updateDynamic("setCheckboxPropsCache")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libTableInterfaceMod.CheckboxPropsCache) => setCheckboxPropsCache(t0).runNow()))
    __obj.asInstanceOf[WithStore]
  }
}

