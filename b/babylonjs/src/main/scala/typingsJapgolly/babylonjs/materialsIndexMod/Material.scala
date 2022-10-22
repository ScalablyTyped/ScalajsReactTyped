package typingsJapgolly.babylonjs.materialsIndexMod

import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "Material")
@js.native
open class Material protected ()
  extends typingsJapgolly.babylonjs.materialsMaterialMod.Material {
  /**
    * Creates a material instance
    * @param name defines the name of the material
    * @param scene defines the scene to reference
    * @param doNotAdd specifies if the material should be added to the scene
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[Scene]) = this()
  def this(name: String, scene: Unit, doNotAdd: Boolean) = this()
  def this(name: String, scene: Nullable[Scene], doNotAdd: Boolean) = this()
}
/* static members */
object Material {
  
  @JSImport("babylonjs/Materials/index", "Material")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The all dirty flag value
    */
  @JSImport("babylonjs/Materials/index", "Material.AllDirtyFlag")
  @js.native
  val AllDirtyFlag: Double = js.native
  
  /**
    * The dirty attribute flag value
    */
  @JSImport("babylonjs/Materials/index", "Material.AttributesDirtyFlag")
  @js.native
  val AttributesDirtyFlag: Double = js.native
  
  /**
    * Stores the clock-wise side orientation
    */
  @JSImport("babylonjs/Materials/index", "Material.ClockWiseSideOrientation")
  @js.native
  val ClockWiseSideOrientation: Double = js.native
  
  /**
    * Stores the counter clock-wise side orientation
    */
  @JSImport("babylonjs/Materials/index", "Material.CounterClockWiseSideOrientation")
  @js.native
  val CounterClockWiseSideOrientation: Double = js.native
  
  /**
    * The dirty fresnel flag value
    */
  @JSImport("babylonjs/Materials/index", "Material.FresnelDirtyFlag")
  @js.native
  val FresnelDirtyFlag: Double = js.native
  
  /**
    * The dirty light flag value
    */
  @JSImport("babylonjs/Materials/index", "Material.LightDirtyFlag")
  @js.native
  val LightDirtyFlag: Double = js.native
  
  /**
    * Returns the line list draw mode
    */
  @JSImport("babylonjs/Materials/index", "Material.LineListDrawMode")
  @js.native
  val LineListDrawMode: Double = js.native
  
  /**
    * Returns the line loop draw mode
    */
  @JSImport("babylonjs/Materials/index", "Material.LineLoopDrawMode")
  @js.native
  val LineLoopDrawMode: Double = js.native
  
  /**
    * Returns the line strip draw mode
    */
  @JSImport("babylonjs/Materials/index", "Material.LineStripDrawMode")
  @js.native
  val LineStripDrawMode: Double = js.native
  
  /**
    * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    */
  @JSImport("babylonjs/Materials/index", "Material.MATERIAL_ALPHABLEND")
  @js.native
  val MATERIAL_ALPHABLEND: Double = js.native
  
  /**
    * MaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
    */
  @JSImport("babylonjs/Materials/index", "Material.MATERIAL_ALPHATEST")
  @js.native
  val MATERIAL_ALPHATEST: Double = js.native
  
  /**
    * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    * They are also discarded below the alpha cutoff threshold to improve performances.
    */
  @JSImport("babylonjs/Materials/index", "Material.MATERIAL_ALPHATESTANDBLEND")
  @js.native
  val MATERIAL_ALPHATESTANDBLEND: Double = js.native
  
  /**
    * The Reoriented Normal Mapping method is used to blend normals.
    * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
    */
  @JSImport("babylonjs/Materials/index", "Material.MATERIAL_NORMALBLENDMETHOD_RNM")
  @js.native
  val MATERIAL_NORMALBLENDMETHOD_RNM: Double = js.native
  
  /**
    * The Whiteout method is used to blend normals.
    * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
    */
  @JSImport("babylonjs/Materials/index", "Material.MATERIAL_NORMALBLENDMETHOD_WHITEOUT")
  @js.native
  val MATERIAL_NORMALBLENDMETHOD_WHITEOUT: Double = js.native
  
  /**
    * MaterialTransparencyMode: No transparency mode, Alpha channel is not use.
    */
  @JSImport("babylonjs/Materials/index", "Material.MATERIAL_OPAQUE")
  @js.native
  val MATERIAL_OPAQUE: Double = js.native
  
  /**
    * The dirty misc flag value
    */
  @JSImport("babylonjs/Materials/index", "Material.MiscDirtyFlag")
  @js.native
  val MiscDirtyFlag: Double = js.native
  
  /**
    * Event observable which raises global events common to all materials (like MaterialPluginEvent.Created)
    */
  @JSImport("babylonjs/Materials/index", "Material.OnEventObservable")
  @js.native
  def OnEventObservable: Observable[typingsJapgolly.babylonjs.materialsMaterialMod.Material] = js.native
  inline def OnEventObservable_=(x: Observable[typingsJapgolly.babylonjs.materialsMaterialMod.Material]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnEventObservable")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a material from parsed material data
    * @param parsedMaterial defines parsed material data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures
    * @returns a new material
    */
  inline def Parse(parsedMaterial: Any, scene: Scene, rootUrl: String): Nullable[typingsJapgolly.babylonjs.materialsMaterialMod.Material] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMaterial.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsMaterialMod.Material]]
  
  /**
    * Returns the point fill mode
    */
  @JSImport("babylonjs/Materials/index", "Material.PointFillMode")
  @js.native
  val PointFillMode: Double = js.native
  
  /**
    * Returns the point list draw mode
    */
  @JSImport("babylonjs/Materials/index", "Material.PointListDrawMode")
  @js.native
  val PointListDrawMode: Double = js.native
  
  /**
    * The dirty prepass flag value
    */
  @JSImport("babylonjs/Materials/index", "Material.PrePassDirtyFlag")
  @js.native
  val PrePassDirtyFlag: Double = js.native
  
  /**
    * The dirty texture flag value
    */
  @JSImport("babylonjs/Materials/index", "Material.TextureDirtyFlag")
  @js.native
  val TextureDirtyFlag: Double = js.native
  
  /**
    * Returns the triangle fan draw mode
    */
  @JSImport("babylonjs/Materials/index", "Material.TriangleFanDrawMode")
  @js.native
  val TriangleFanDrawMode: Double = js.native
  
  /**
    * Returns the triangle fill mode
    */
  @JSImport("babylonjs/Materials/index", "Material.TriangleFillMode")
  @js.native
  val TriangleFillMode: Double = js.native
  
  /**
    * Returns the triangle strip draw mode
    */
  @JSImport("babylonjs/Materials/index", "Material.TriangleStripDrawMode")
  @js.native
  val TriangleStripDrawMode: Double = js.native
  
  /**
    * Returns the wireframe mode
    */
  @JSImport("babylonjs/Materials/index", "Material.WireFrameFillMode")
  @js.native
  val WireFrameFillMode: Double = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._AllDirtyCallBack")
  @js.native
  val _AllDirtyCallBack: Any = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._AttributeDirtyCallBack")
  @js.native
  val _AttributeDirtyCallBack: Any = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._DirtyCallbackArray")
  @js.native
  val _DirtyCallbackArray: Any = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._FresnelAndMiscDirtyCallBack")
  @js.native
  def _FresnelAndMiscDirtyCallBack: Any = js.native
  inline def _FresnelAndMiscDirtyCallBack_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FresnelAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Materials/index", "Material._FresnelDirtyCallBack")
  @js.native
  val _FresnelDirtyCallBack: Any = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._ImageProcessingDirtyCallBack")
  @js.native
  val _ImageProcessingDirtyCallBack: Any = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._LightsDirtyCallBack")
  @js.native
  val _LightsDirtyCallBack: Any = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._MiscDirtyCallBack")
  @js.native
  val _MiscDirtyCallBack: Any = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._PrePassDirtyCallBack")
  @js.native
  val _PrePassDirtyCallBack: Any = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._RunDirtyCallBacks")
  @js.native
  val _RunDirtyCallBacks: Any = js.native
  
  @JSImport("babylonjs/Materials/index", "Material._TextureAndMiscDirtyCallBack")
  @js.native
  def _TextureAndMiscDirtyCallBack: Any = js.native
  inline def _TextureAndMiscDirtyCallBack_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Materials/index", "Material._TextureDirtyCallBack")
  @js.native
  val _TextureDirtyCallBack: Any = js.native
}
