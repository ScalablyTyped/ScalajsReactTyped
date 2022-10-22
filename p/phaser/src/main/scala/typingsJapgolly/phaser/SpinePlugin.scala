package typingsJapgolly.phaser

import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.phaser.Phaser.Cache.BaseCache
import typingsJapgolly.phaser.Phaser.Plugins.ScenePlugin
import typingsJapgolly.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typingsJapgolly.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typingsJapgolly.phaser.Phaser.Textures.TextureManager
import typingsJapgolly.phaser.anon.Typeofspine
import typingsJapgolly.phaser.spine.Bone
import typingsJapgolly.phaser.spine.Skeleton
import typingsJapgolly.phaser.spine.TextureAtlas
import typingsJapgolly.phaser.spine.Vector2
import typingsJapgolly.phaser.spine.VertexEffect
import typingsJapgolly.phaser.spine.canvas.SkeletonRenderer
import typingsJapgolly.phaser.spine.webgl.SceneRenderer
import typingsJapgolly.phaser.spine.webgl.SkeletonDebugRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinePlugin
  extends StObject
     with ScenePlugin {
  
  def add(x: Double, y: Double): SpineGameObject = js.native
  def add(x: Double, y: Double, key: String): SpineGameObject = js.native
  def add(x: Double, y: Double, key: String, animationName: String): SpineGameObject = js.native
  def add(x: Double, y: Double, key: String, animationName: String, loop: Boolean): SpineGameObject = js.native
  def add(x: Double, y: Double, key: String, animationName: Unit, loop: Boolean): SpineGameObject = js.native
  def add(x: Double, y: Double, key: Unit, animationName: String): SpineGameObject = js.native
  def add(x: Double, y: Double, key: Unit, animationName: String, loop: Boolean): SpineGameObject = js.native
  def add(x: Double, y: Double, key: Unit, animationName: Unit, loop: Boolean): SpineGameObject = js.native
  
  var cache: BaseCache = js.native
  
  def createAnimationState(skeleton: Skeleton): Any = js.native
  
  def createSkeleton(key: String): Any | Null = js.native
  def createSkeleton(key: String, skeletonJSON: js.Object): Any | Null = js.native
  
  var drawDebug: Boolean = js.native
  
  def getAtlasCanvas(key: String): TextureAtlas = js.native
  
  def getAtlasWebGL(key: String): TextureAtlas = js.native
  
  def getBounds(skeleton: Skeleton): Any = js.native
  
  def getVector2(x: Double, y: Double): Vector2 = js.native
  
  def getVector3(x: Double, y: Double, z: Double): Vector2 = js.native
  
  var gl: WebGLRenderingContext = js.native
  
  val isWebGL: Boolean = js.native
  
  var json: BaseCache = js.native
  
  def make(config: SpineGameObjectConfig): SpineGameObject = js.native
  def make(config: SpineGameObjectConfig, addToScene: Boolean): SpineGameObject = js.native
  
  def onResize(): Unit = js.native
  
  var plugin: Typeofspine = js.native
  
  var renderer: CanvasRenderer | WebGLRenderer = js.native
  
  var sceneRenderer: SceneRenderer = js.native
  
  def setDebugBones(): SpinePlugin = js.native
  def setDebugBones(value: Boolean): SpinePlugin = js.native
  
  def setDebugBoundingBoxes(): SpinePlugin = js.native
  def setDebugBoundingBoxes(value: Boolean): SpinePlugin = js.native
  
  def setDebugClipping(): SpinePlugin = js.native
  def setDebugClipping(value: Boolean): SpinePlugin = js.native
  
  def setDebugMeshHull(): SpinePlugin = js.native
  def setDebugMeshHull(value: Boolean): SpinePlugin = js.native
  
  def setDebugMeshTriangles(): SpinePlugin = js.native
  def setDebugMeshTriangles(value: Boolean): SpinePlugin = js.native
  
  def setDebugPaths(): SpinePlugin = js.native
  def setDebugPaths(value: Boolean): SpinePlugin = js.native
  
  def setDebugRegionAttachments(): SpinePlugin = js.native
  def setDebugRegionAttachments(value: Boolean): SpinePlugin = js.native
  
  def setDebugSkeletonXY(): SpinePlugin = js.native
  def setDebugSkeletonXY(value: Boolean): SpinePlugin = js.native
  
  def setEffect(): SpinePlugin = js.native
  def setEffect(effect: VertexEffect): SpinePlugin = js.native
  
  var skeletonDebugRenderer: SkeletonDebugRenderer = js.native
  
  var skeletonRenderer: SkeletonRenderer | typingsJapgolly.phaser.spine.webgl.SkeletonRenderer = js.native
  
  var spineTextures: BaseCache = js.native
  
  var textures: TextureManager = js.native
  
  def worldToLocal(x: Double, y: Double, skeleton: Skeleton): Vector2 = js.native
  def worldToLocal(x: Double, y: Double, skeleton: Skeleton, bone: Bone): Vector2 = js.native
}
