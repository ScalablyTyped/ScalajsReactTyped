package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.Position
import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.enginesEngineMod.Engine
import typingsJapgolly.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcess
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesVolumetricLightScatteringPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/volumetricLightScatteringPostProcess", "VolumetricLightScatteringPostProcess")
  @js.native
  open class VolumetricLightScatteringPostProcess protected () extends PostProcess {
    /**
      * @constructor
      * @param name The post-process name
      * @param ratio The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
      * @param camera The camera that the post-process will be attached to
      * @param mesh The mesh used to create the light scattering
      * @param samples The post-process quality, default 100
      * @param samplingMode The post-process filtering mode
      * @param engine The babylon engine
      * @param reusable If the post-process is reusable
      * @param scene The constructor needs a scene reference to initialize internal components. If "camera" is null a "scene" must be provided
      */
    def this(
      name: String,
      ratio: Any,
      camera: Nullable[Camera],
      mesh: js.UndefOr[Mesh],
      samples: js.UndefOr[Double],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      scene: js.UndefOr[Scene]
    ) = this()
    
    /* private */ var _createPass: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ var _meshExcluded: Any = js.native
    
    /* private */ var _screenCoordinates: Any = js.native
    
    /* private */ var _updateMeshScreenCoordinates: Any = js.native
    
    /* private */ var _viewPort: Any = js.native
    
    /* private */ var _volumetricLightScatteringRTT: Any = js.native
    
    /**
      * If not undefined, the mesh position is computed from the attached node position
      */
    var attachedNode: Position = js.native
    
    /**
      * Custom position of the mesh. Used if "useCustomMeshPosition" is set to "true"
      */
    var customMeshPosition: Vector3 = js.native
    
    /**
      * Dissipates each sample's contribution in range [0, 1]
      */
    var decay: Double = js.native
    
    /**
      * Controls the density of each sample
      */
    var density: Double = js.native
    
    /**
      * Array containing the excluded meshes not rendered in the internal pass
      */
    var excludedMeshes: js.Array[AbstractMesh] = js.native
    
    /**
      * Controls the overall intensity of the post-process
      */
    var exposure: Double = js.native
    
    /**
      * Returns the light position for light scattering effect
      * @returns Vector3 The custom light position
      */
    def getCustomMeshPosition(): Vector3 = js.native
    
    /**
      * Returns the render target texture used by the post-process
      * @returns the render target texture used by the post-process
      */
    def getPass(): RenderTargetTexture = js.native
    
    /**
      * If the post-process should inverse the light scattering direction
      */
    var invert: Boolean = js.native
    
    /**
      * The internal mesh used by the post-process
      */
    var mesh: Mesh = js.native
    
    /**
      * Sets the new light position for light scattering effect
      * @param position The new custom light position
      */
    def setCustomMeshPosition(position: Vector3): Unit = js.native
    
    /**
      * Set if the post-process should use a custom position for the light source (true) or the internal mesh position (false)
      */
    var useCustomMeshPosition: Boolean = js.native
    
    /**
      * @internal
      * VolumetricLightScatteringPostProcess.useDiffuseColor is no longer used, use the mesh material directly instead
      */
    def useDiffuseColor: Boolean = js.native
    def useDiffuseColor_=(useDiffuseColor: Boolean): Unit = js.native
    
    /**
      * Controls the overall intensity of each sample
      */
    var weight: Double = js.native
  }
  /* static members */
  object VolumetricLightScatteringPostProcess {
    
    @JSImport("babylonjs/PostProcesses/volumetricLightScatteringPostProcess", "VolumetricLightScatteringPostProcess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a default mesh for the Volumeric Light Scattering post-process
      * @param name The mesh name
      * @param scene The scene where to create the mesh
      * @returns the default mesh
      */
    inline def CreateDefaultMesh(name: String, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefaultMesh")(name.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  }
}
