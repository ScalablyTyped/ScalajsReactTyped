package typingsJapgolly.jimpCustom

import typingsJapgolly.jimpCore.etcMod.Image
import typingsJapgolly.jimpCore.pluginsMod.JimpPlugin
import typingsJapgolly.jimpCore.pluginsMod.JimpType
import typingsJapgolly.jimpCore.utilsMod.FunctionRet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlugins[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */] extends js.Object {
  var plugins: js.UndefOr[PluginFuncArr] = js.undefined
  var types: js.UndefOr[TypesFuncArr] = js.undefined
}

object AnonPlugins {
  @scala.inline
  def apply[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */](plugins: PluginFuncArr = null, types: TypesFuncArr = null): AnonPlugins[TypesFuncArr, PluginFuncArr] = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlugins[TypesFuncArr, PluginFuncArr]]
  }
}

