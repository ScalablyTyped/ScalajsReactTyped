package typingsJapgolly.antvGLite

import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCameraMod {
  
  @JSImport("@antv/g-lite/dist/camera", "Camera")
  @js.native
  open class Camera ()
    extends typingsJapgolly.antvGLite.distCameraCameraMod.Camera
  
  @JSImport("@antv/g-lite/dist/camera", "CameraContribution")
  @js.native
  val CameraContribution: DefinedToken = js.native
  
  object CameraEvent {
    
    @JSImport("@antv/g-lite/dist/camera", "CameraEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/camera", "CameraEvent.UPDATED")
    @js.native
    def UPDATED: String = js.native
    inline def UPDATED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g-lite/dist/camera", "CameraProjectionMode")
  @js.native
  object CameraProjectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraProjectionMode & Double] = js.native
    
    /* 0 */ val ORTHOGRAPHIC: typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraProjectionMode.ORTHOGRAPHIC & Double = js.native
    
    /* 1 */ val PERSPECTIVE: typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraProjectionMode.PERSPECTIVE & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera", "CameraTrackingMode")
  @js.native
  object CameraTrackingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraTrackingMode & Double] = js.native
    
    /* 3 */ val CINEMATIC: typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraTrackingMode.CINEMATIC & Double = js.native
    
    /* 0 */ val DEFAULT: typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraTrackingMode.DEFAULT & Double = js.native
    
    /* 1 */ val ROTATIONAL: typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraTrackingMode.ROTATIONAL & Double = js.native
    
    /* 2 */ val TRANSLATIONAL: typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraTrackingMode.TRANSLATIONAL & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera", "CameraType")
  @js.native
  object CameraType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraType & Double] = js.native
    
    /* 1 */ val EXPLORING: typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraType.EXPLORING & Double = js.native
    
    /* 0 */ val ORBITING: typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraType.ORBITING & Double = js.native
    
    /* 2 */ val TRACKING: typingsJapgolly.antvGLite.distCameraInterfacesMod.CameraType.TRACKING & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/camera", "DefaultCamera")
  @js.native
  val DefaultCamera: DefinedToken = js.native
}
