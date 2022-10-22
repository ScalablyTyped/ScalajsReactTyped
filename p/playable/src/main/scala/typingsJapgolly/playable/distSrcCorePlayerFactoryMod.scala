package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import typingsJapgolly.playable.distSrcCoreConfigMod.IPlayerConfig
import typingsJapgolly.playable.distSrcCoreDefaultModulesMod.IPlayer
import typingsJapgolly.playable.distSrcCoreDependencyContainerCreateContainerMod.Container
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCorePlayerFactoryMod {
  
  @JSImport("playable/dist/src/core/player-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearAdditionalModules(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAdditionalModules")().asInstanceOf[Unit]
  
  inline def clearPlaybackAdapters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPlaybackAdapters")().asInstanceOf[Unit]
  
  @JSImport("playable/dist/src/core/player-factory", "container")
  @js.native
  val container: Container = js.native
  
  inline def create(): IPlayerInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IPlayerInstance]
  inline def create(params: Unit, themeConfig: IThemeConfig): IPlayerInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any], themeConfig.asInstanceOf[js.Any])).asInstanceOf[IPlayerInstance]
  inline def create(params: IPlayerConfig): IPlayerInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[IPlayerInstance]
  inline def create(params: IPlayerConfig, themeConfig: IThemeConfig): IPlayerInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any], themeConfig.asInstanceOf[js.Any])).asInstanceOf[IPlayerInstance]
  
  inline def registerModule(id: String, module: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerModule")(id.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerPlaybackAdapter(adapter: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlaybackAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IPlayerInstance
    extends StObject
       with IPlayer {
    
    def destroy(): Unit
  }
  object IPlayerInstance {
    
    inline def apply(destroy: Callback): IPlayerInstance = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
      __obj.asInstanceOf[IPlayerInstance]
    }
    
    extension [Self <: IPlayerInstance](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    }
  }
}
