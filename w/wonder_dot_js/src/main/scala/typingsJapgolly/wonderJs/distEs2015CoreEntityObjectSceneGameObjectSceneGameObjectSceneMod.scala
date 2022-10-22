package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typingsJapgolly.wonderJs.distEs2015CoreEntityObjectSceneSceneMod.Scene
import typingsJapgolly.wonderJs.distEs2015RendererRendererRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015CoreEntityObjectSceneGameObjectSceneGameObjectSceneMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", "GameObjectScene")
  @js.native
  open class GameObjectScene () extends Scene {
    
    def addChild(child: GameObject): GameObject = js.native
    
    var currentCamera: Any = js.native
    
    def render(renderer: Renderer): Unit = js.native
  }
  /* static members */
  object GameObjectScene {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", "GameObjectScene")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): GameObjectScene = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GameObjectScene]
  }
}
