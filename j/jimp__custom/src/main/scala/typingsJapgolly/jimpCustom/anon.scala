package typingsJapgolly.jimpCustom

import typingsJapgolly.jimpCore.typesEtcMod.Image
import typingsJapgolly.jimpCore.typesPluginsMod.JimpPlugin
import typingsJapgolly.jimpCore.typesPluginsMod.JimpType
import typingsJapgolly.jimpCore.typesUtilsMod.FunctionRet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Plugins[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */] extends StObject {
    
    var plugins: js.UndefOr[PluginFuncArr] = js.undefined
    
    var types: js.UndefOr[TypesFuncArr] = js.undefined
  }
  object Plugins {
    
    inline def apply[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */](): Plugins[TypesFuncArr, PluginFuncArr] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins[TypesFuncArr, PluginFuncArr]]
    }
    
    extension [Self <: Plugins[?, ?], TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */](x: Self & (Plugins[TypesFuncArr, PluginFuncArr])) {
      
      inline def setPlugins(value: PluginFuncArr): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setTypes(value: TypesFuncArr): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
}
