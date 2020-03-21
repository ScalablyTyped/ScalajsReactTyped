package typingsJapgolly.jimpCore

import typingsJapgolly.jimpCore.etcMod.Image
import typingsJapgolly.jimpCore.pluginsMod.JimpPlugin
import typingsJapgolly.jimpCore.pluginsMod.JimpType
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/core/types/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  type FunctionRet[T] = js.Array[js.Function1[/* props */ js.Array[js.Any] | scala.Nothing, T]]
  type GetIntersectionFromPlugins[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] = UnionToIntersection[GetPluginFuncArrValues[PluginFuncArr]]
  type GetPluginFuncArrValues[PluginFuncArr] = js.UndefOr[// Get the plugin value, may be ill-formed or well-formed
  GetPluginVal[js.Any]]
  type GetPluginVal[Q] = Q | WellFormedValues[Q]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type UnionToIntersection[U] = js.Any
  type WellFormedValues[T /* <: js.Any */] = /* import warning: importer.ImportType#apply Failed type conversion: T['class'] */ js.Any
}

