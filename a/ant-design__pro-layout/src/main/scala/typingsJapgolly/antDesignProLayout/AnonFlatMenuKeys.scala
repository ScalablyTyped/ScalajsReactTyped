package typingsJapgolly.antDesignProLayout

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.typingsMod.MenuDataItem
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlatMenuKeys extends js.Object {
  var flatMenuKeys: js.Array[String]
  var flatMenus: js.UndefOr[StringDictionary[MenuDataItem]] = js.undefined
  var setFlatMenuKeys: Dispatch[SetStateAction[js.Array[String]]]
  var setFlatMenus: Dispatch[SetStateAction[js.UndefOr[StringDictionary[MenuDataItem]]]]
}

object AnonFlatMenuKeys {
  @scala.inline
  def apply(
    flatMenuKeys: js.Array[String],
    setFlatMenuKeys: SetStateAction[js.Array[String]] => Callback,
    setFlatMenus: SetStateAction[js.UndefOr[StringDictionary[MenuDataItem]]] => Callback,
    flatMenus: StringDictionary[MenuDataItem] = null
  ): AnonFlatMenuKeys = {
    val __obj = js.Dynamic.literal(flatMenuKeys = flatMenuKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("setFlatMenuKeys")(js.Any.fromFunction1((t0: typingsJapgolly.react.mod.SetStateAction[js.Array[java.lang.String]]) => setFlatMenuKeys(t0).runNow()))
    __obj.updateDynamic("setFlatMenus")(js.Any.fromFunction1((t0: typingsJapgolly.react.mod.SetStateAction[
  js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[typingsJapgolly.antDesignProLayout.typingsMod.MenuDataItem]
  ]]) => setFlatMenus(t0).runNow()))
    if (flatMenus != null) __obj.updateDynamic("flatMenus")(flatMenus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlatMenuKeys]
  }
}

