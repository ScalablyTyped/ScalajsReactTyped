package typingsJapgolly.dragControls

import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.dragControls.anon.THREE
import typingsJapgolly.three.mod.Camera
import typingsJapgolly.three.mod.EventDispatcher
import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("drag-controls", JSImport.Namespace)
  @js.native
  open class ^ protected () extends DragControls {
    def this(objects: js.Array[Object3D[Event]], camera: Camera, domElement: HTMLCanvasElement) = this()
  }
  @JSImport("drag-controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def install(library: THREE): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(library.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait DragControls extends EventDispatcher[Event] {
    
    def deactivate(): Unit = js.native
  }
}
