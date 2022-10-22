package typingsJapgolly.jimpCustom

import typingsJapgolly.jimpCore.typesEtcMod.Image
import typingsJapgolly.jimpCore.typesJimpMod.JimpConstructors
import typingsJapgolly.jimpCore.typesPluginsMod.JimpPlugin
import typingsJapgolly.jimpCore.typesPluginsMod.JimpType
import typingsJapgolly.jimpCore.typesUtilsMod.FunctionRet
import typingsJapgolly.jimpCore.typesUtilsMod.GetIntersectionFromPluginsStatics
import typingsJapgolly.jimpCustom.anon.Plugins
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/custom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: JimpConstructors */](configuration: Plugins[TypesFuncArr, PluginFuncArr]): JimpInstance[TypesFuncArr, PluginFuncArr, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(configuration.asInstanceOf[js.Any]).asInstanceOf[JimpInstance[TypesFuncArr, PluginFuncArr, J]]
  inline def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: JimpConstructors */](configuration: Plugins[TypesFuncArr, PluginFuncArr], jimpInstance: J): JimpInstance[TypesFuncArr, PluginFuncArr, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(configuration.asInstanceOf[js.Any], jimpInstance.asInstanceOf[js.Any])).asInstanceOf[JimpInstance[TypesFuncArr, PluginFuncArr, J]]
  
  type JimpInstance[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: JimpConstructors */] = J & (GetIntersectionFromPluginsStatics[Exclude[TypesFuncArr | PluginFuncArr, Unit]]) & js.Object
}
