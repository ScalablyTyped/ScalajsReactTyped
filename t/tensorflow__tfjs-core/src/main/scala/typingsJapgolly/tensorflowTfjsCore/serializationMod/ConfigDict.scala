package typingsJapgolly.tensorflowTfjsCore.serializationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigDict
  extends /* key */ StringDictionary[ConfigDictValue]
     with _ConfigDictValue

object ConfigDict {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[ConfigDictValue] = null): ConfigDict = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ConfigDict]
  }
}

