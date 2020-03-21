package typingsJapgolly.stylefire.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var aliasMap: js.UndefOr[StringDictionary[String]] = js.undefined
  var uncachedValues: js.UndefOr[Set[String]] = js.undefined
  var useCache: js.UndefOr[Boolean] = js.undefined
  def onRead(key: String, props: Props): js.Any
  def onRender(state: State, props: Props, changedValues: ChangedValues): Unit
}

object Config {
  @scala.inline
  def apply(
    onRead: (String, Props) => CallbackTo[js.Any],
    onRender: (State, Props, ChangedValues) => Callback,
    aliasMap: StringDictionary[String] = null,
    uncachedValues: Set[String] = null,
    useCache: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onRead")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.stylefire.typesMod.Props) => onRead(t0, t1).runNow()))
    __obj.updateDynamic("onRender")(js.Any.fromFunction3((t0: typingsJapgolly.stylefire.typesMod.State, t1: typingsJapgolly.stylefire.typesMod.Props, t2: typingsJapgolly.stylefire.typesMod.ChangedValues) => onRender(t0, t1, t2).runNow()))
    if (aliasMap != null) __obj.updateDynamic("aliasMap")(aliasMap.asInstanceOf[js.Any])
    if (uncachedValues != null) __obj.updateDynamic("uncachedValues")(uncachedValues.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

