package typingsJapgolly.babylonjs

import org.scalajs.dom.PointerEvent
import typingsJapgolly.babylonjs.anon.OffsetX
import typingsJapgolly.babylonjs.camerasCameraInputsManagerMod.ICameraInput
import typingsJapgolly.babylonjs.camerasFreeCameraMod.FreeCamera
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasInputsFreeCameraMouseInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/freeCameraMouseInput", "FreeCameraMouseInput")
  @js.native
  /**
    * Manage the mouse inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param touchEnabled Defines if touch is enabled or not
    */
  open class FreeCameraMouseInput ()
    extends StObject
       with ICameraInput[FreeCamera] {
    def this(/**
      * Define if touch is enabled in the mouse input
      */
    touchEnabled: Boolean) = this()
    
    /**
      * @internal
      * If the camera should be rotated automatically based on pointer movement
      */
    var _allowCameraRotation: Boolean = js.native
    
    /* private */ var _contextMenuBind: Any = js.native
    
    /* private */ var _currentActiveButton: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _onMouseMove: Any = js.native
    
    /* private */ var _pointerInput: Any = js.native
    
    /* private */ var _previousPosition: Any = js.native
    
    /**
      * Defines the pointer angular sensibility  along the X and Y axis or how fast is the camera rotating.
      */
    var angularSensibility: Double = js.native
    
    /**
      * Defines the buttons associated with the input to handle camera move.
      */
    var buttons: js.Array[Double] = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_FreeCameraMouseInput: FreeCamera = js.native
    
    /**
      * Called on JS contextmenu event.
      * Override this method to provide functionality.
      * @param evt
      */
    def onContextMenu(evt: PointerEvent): Unit = js.native
    
    /**
      * Observable for when a pointer move event occurs containing the move offset
      */
    var onPointerMovedObservable: Observable[OffsetX] = js.native
    
    /**
      * Define if touch is enabled in the mouse input
      */
    var touchEnabled: Boolean = js.native
  }
}
