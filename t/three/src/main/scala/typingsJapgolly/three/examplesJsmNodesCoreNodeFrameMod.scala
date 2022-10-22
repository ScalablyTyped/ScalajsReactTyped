package typingsJapgolly.three

import japgolly.scalajs.react.Callback
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcRenderersWebGLRendererMod.Renderer
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Material
import typingsJapgolly.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeFrameMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeFrame", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NodeFrame {
    
    /* CompleteClass */
    var camera: Null | Camera = js.native
    
    /* CompleteClass */
    var deltaTime: Double = js.native
    
    /* CompleteClass */
    var frameId: Double = js.native
    
    /* CompleteClass */
    var material: Null | Material = js.native
    
    /* CompleteClass */
    var `object`: Null | Object3D[Event] = js.native
    
    /* CompleteClass */
    var renderer: Null | Renderer = js.native
    
    /* CompleteClass */
    var startTime: Null | Double = js.native
    
    /* CompleteClass */
    var time: Double = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* CompleteClass */
    override def updateNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): Unit = js.native
  }
  
  trait NodeFrame extends StObject {
    
    var camera: Null | Camera
    
    var deltaTime: Double
    
    var frameId: Double
    
    var material: Null | Material
    
    var `object`: Null | Object3D[Event]
    
    var renderer: Null | Renderer
    
    var startTime: Null | Double
    
    var time: Double
    
    def update(): Unit
    
    def updateNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): Unit
  }
  object NodeFrame {
    
    inline def apply(
      deltaTime: Double,
      frameId: Double,
      time: Double,
      update: Callback,
      updateNode: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default => Callback
    ): NodeFrame = {
      val __obj = js.Dynamic.literal(deltaTime = deltaTime.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], update = update.toJsFn, updateNode = js.Any.fromFunction1((t0: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default) => updateNode(t0).runNow()), camera = null, material = null, renderer = null, startTime = null)
      __obj.updateDynamic("object")(null)
      __obj.asInstanceOf[NodeFrame]
    }
    
    extension [Self <: NodeFrame](x: Self) {
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraNull: Self = StObject.set(x, "camera", null)
      
      inline def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setMaterial(value: Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialNull: Self = StObject.set(x, "material", null)
      
      inline def setObject(value: Object3D[Event]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectNull: Self = StObject.set(x, "object", null)
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererNull: Self = StObject.set(x, "renderer", null)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
      
      inline def setUpdateNode(value: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default => Callback): Self = StObject.set(x, "updateNode", js.Any.fromFunction1((t0: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default) => value(t0).runNow()))
    }
  }
}
