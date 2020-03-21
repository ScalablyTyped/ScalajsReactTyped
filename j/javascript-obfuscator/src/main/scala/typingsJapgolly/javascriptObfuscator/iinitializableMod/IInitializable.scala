package typingsJapgolly.javascriptObfuscator.iinitializableMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitializable[T /* <: js.Array[_] */]
  extends /* key */ StringDictionary[js.Any] {
  /**
    * @param args
    */
  def initialize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Unit
}

object IInitializable {
  @scala.inline
  def apply[T /* <: js.Array[_] */](initialize: T => Callback, StringDictionary: /* key */ StringDictionary[js.Any] = null): IInitializable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: T) => initialize(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IInitializable[T]]
  }
}

