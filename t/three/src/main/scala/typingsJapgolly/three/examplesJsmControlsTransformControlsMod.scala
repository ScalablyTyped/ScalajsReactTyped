package typingsJapgolly.three

import org.scalajs.dom.HTMLElement
import typingsJapgolly.three.anon.LEFT_
import typingsJapgolly.three.anon.Rotate
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.Quaternion
import typingsJapgolly.three.srcThreeMod.Raycaster
import typingsJapgolly.three.srcThreeMod.Vector3
import typingsJapgolly.three.threeBooleans.`true`
import typingsJapgolly.three.threeStrings.E
import typingsJapgolly.three.threeStrings.X
import typingsJapgolly.three.threeStrings.XY
import typingsJapgolly.three.threeStrings.XYZ
import typingsJapgolly.three.threeStrings.XYZE
import typingsJapgolly.three.threeStrings.XZ
import typingsJapgolly.three.threeStrings.Y
import typingsJapgolly.three.threeStrings.YZ
import typingsJapgolly.three.threeStrings.Z
import typingsJapgolly.three.threeStrings.local
import typingsJapgolly.three.threeStrings.rotate
import typingsJapgolly.three.threeStrings.translate
import typingsJapgolly.three.threeStrings.world
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmControlsTransformControlsMod {
  
  @JSImport("three/examples/jsm/controls/TransformControls", "TransformControls")
  @js.native
  open class TransformControls protected () extends Object3D[Event] {
    def this(`object`: Camera) = this()
    def this(`object`: Camera, domElement: HTMLElement) = this()
    
    def attach(`object`: Object3D[Event]): this.type = js.native
    
    var axis: X | Y | Z | E | XY | YZ | XZ | XYZ | XYZE | Null = js.native
    
    // API
    var camera: Camera = js.native
    
    def detach(): this.type = js.native
    
    def dispose(): Unit = js.native
    
    var domElement: HTMLElement = js.native
    
    var dragging: Boolean = js.native
    
    var enabled: Boolean = js.native
    
    def getMode(): translate | rotate | typingsJapgolly.three.threeStrings.scale = js.native
    
    def getRaycaster(): Raycaster = js.native
    
    val isTransformControls: `true` = js.native
    
    var mode: translate | rotate | typingsJapgolly.three.threeStrings.scale = js.native
    
    var mouseButtons: LEFT_ = js.native
    
    var `object`: js.UndefOr[Object3D[Event]] = js.native
    
    def reset(): Unit = js.native
    
    var rotationSnap: Double | Null = js.native
    
    def setMode(mode: translate | rotate | typingsJapgolly.three.threeStrings.scale): Unit = js.native
    
    def setRotationSnap(): Unit = js.native
    def setRotationSnap(rotationSnap: Double): Unit = js.native
    
    def setScaleSnap(): Unit = js.native
    def setScaleSnap(scaleSnap: Double): Unit = js.native
    
    def setSize(size: Double): Unit = js.native
    
    def setSpace(space: world | local): Unit = js.native
    
    def setTranslationSnap(): Unit = js.native
    def setTranslationSnap(translationSnap: Double): Unit = js.native
    
    var showX: Boolean = js.native
    
    var showY: Boolean = js.native
    
    var showZ: Boolean = js.native
    
    var size: Double = js.native
    
    var space: world | local = js.native
    
    var translationSnap: Double | Null = js.native
  }
  
  @JSImport("three/examples/jsm/controls/TransformControls", "TransformControlsGizmo")
  @js.native
  open class TransformControlsGizmo () extends Object3D[Event] {
    
    var gizmo: Rotate = js.native
    
    var helper: Rotate = js.native
    
    var isTransformControlsGizmo: `true` = js.native
    
    var picker: Rotate = js.native
    
    @JSName("type")
    var type_TransformControlsGizmo: typingsJapgolly.three.threeStrings.TransformControlsGizmo = js.native
  }
  
  @JSImport("three/examples/jsm/controls/TransformControls", "TransformControlsPlane")
  @js.native
  open class TransformControlsPlane ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    
    var axis: X | Y | Z | XY | YZ | XZ | XYZ | E = js.native
    
    var eye: Vector3 = js.native
    
    var isTransformControlsPlane: `true` = js.native
    
    var mode: translate | typingsJapgolly.three.threeStrings.scale | rotate = js.native
    
    var space: local | world = js.native
    
    @JSName("type")
    var type_TransformControlsPlane: typingsJapgolly.three.threeStrings.TransformControlsPlane = js.native
    
    var worldPosition: Vector3 = js.native
    
    var worldQuaternion: Quaternion = js.native
  }
}
