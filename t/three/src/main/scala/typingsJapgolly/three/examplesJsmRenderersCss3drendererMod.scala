package typingsJapgolly.three

import org.scalajs.dom.HTMLElement
import typingsJapgolly.three.anon.Width
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmRenderersCss3drendererMod {
  
  @JSImport("three/examples/jsm/renderers/CSS3DRenderer", "CSS3DObject")
  @js.native
  open class CSS3DObject protected () extends Object3D[Event] {
    def this(element: HTMLElement) = this()
    
    var element: HTMLElement = js.native
    
    def onAfterRender(renderer: Any, scene: Scene, camera: Camera): Unit = js.native
    
    def onBeforeRender(renderer: Any, scene: Scene, camera: Camera): Unit = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/CSS3DRenderer", "CSS3DRenderer")
  @js.native
  open class CSS3DRenderer () extends StObject {
    def this(parameters: CSS3DParameters) = this()
    
    var domElement: HTMLElement = js.native
    
    def getSize(): Width = js.native
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/CSS3DRenderer", "CSS3DSprite")
  @js.native
  open class CSS3DSprite protected () extends CSS3DObject {
    def this(element: HTMLElement) = this()
  }
  
  trait CSS3DParameters extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.undefined
  }
  object CSS3DParameters {
    
    inline def apply(): CSS3DParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSS3DParameters]
    }
    
    extension [Self <: CSS3DParameters](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
}
