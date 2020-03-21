package typingsJapgolly.node.NodeJS

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireExtensions
  extends /* ext */ StringDictionary[js.Function2[/* m */ Module, /* filename */ String, _]] {
  @JSName(".js")
  def Dotjs(m: Module, filename: String): js.Any
  @JSName(".json")
  def Dotjson(m: Module, filename: String): js.Any
  @JSName(".node")
  def Dotnode(m: Module, filename: String): js.Any
}

object RequireExtensions {
  @scala.inline
  def apply(
    Dotjs: (Module, String) => CallbackTo[js.Any],
    Dotjson: (Module, String) => CallbackTo[js.Any],
    Dotnode: (Module, String) => CallbackTo[js.Any],
    StringDictionary: /* ext */ StringDictionary[js.Function2[/* m */ Module, /* filename */ String, _]] = null
  ): RequireExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Dotjs")(js.Any.fromFunction2((t0: typingsJapgolly.node.NodeJS.Module, t1: java.lang.String) => Dotjs(t0, t1).runNow()))
    __obj.updateDynamic("Dotjson")(js.Any.fromFunction2((t0: typingsJapgolly.node.NodeJS.Module, t1: java.lang.String) => Dotjson(t0, t1).runNow()))
    __obj.updateDynamic("Dotnode")(js.Any.fromFunction2((t0: typingsJapgolly.node.NodeJS.Module, t1: java.lang.String) => Dotnode(t0, t1).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RequireExtensions]
  }
}

