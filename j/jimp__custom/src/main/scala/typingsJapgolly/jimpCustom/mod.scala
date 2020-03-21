package typingsJapgolly.jimpCustom

import typingsJapgolly.jimpCore.etcMod.Image
import typingsJapgolly.jimpCore.jimpMod.Jimp
import typingsJapgolly.jimpCore.jimpMod.JimpConstructors
import typingsJapgolly.jimpCore.pluginsMod.JimpPlugin
import typingsJapgolly.jimpCore.pluginsMod.JimpType
import typingsJapgolly.jimpCore.utilsMod.FunctionRet
import typingsJapgolly.jimpCore.utilsMod.GetIntersectionFromPlugins
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/custom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */](configuration: AnonPlugins[TypesFuncArr, PluginFuncArr]): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */](configuration: AnonPlugins[TypesFuncArr, PluginFuncArr], jimpInstance: J): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  type JimpInstance[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: Jimp */] = (Exclude[J, js.UndefOr[scala.Nothing]]) with (GetIntersectionFromPlugins[Exclude[TypesFuncArr | PluginFuncArr, js.UndefOr[scala.Nothing]]]) with JimpConstructors
}

