package typingsJapgolly.three

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.three.anon.FullHeight
import typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip
import typingsJapgolly.three.srcCamerasCameraMod.Camera
import typingsJapgolly.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreEventDispatcherMod.EventDispatcher
import typingsJapgolly.three.srcCoreEventDispatcherMod.EventListener
import typingsJapgolly.three.srcCoreLayersMod.Layers
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcCoreRaycasterMod.Intersection
import typingsJapgolly.three.srcCoreRaycasterMod.Raycaster
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMathEulerMod.Euler
import typingsJapgolly.three.srcMathMatrix3Mod.Matrix3
import typingsJapgolly.three.srcMathMatrix4Mod.Matrix4
import typingsJapgolly.three.srcMathQuaternionMod.Quaternion
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import typingsJapgolly.three.srcMathVector4Mod.Vector4
import typingsJapgolly.three.srcObjectsGroupMod.Group
import typingsJapgolly.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typingsJapgolly.three.srcRenderersWebxrWebXRControllerMod.XRGripSpace
import typingsJapgolly.three.srcRenderersWebxrWebXRControllerMod.XRHandSpace
import typingsJapgolly.three.srcRenderersWebxrWebXRControllerMod.XRTargetRaySpace
import typingsJapgolly.three.srcScenesSceneMod.Scene
import typingsJapgolly.three.threeBooleans.`true`
import typingsJapgolly.webxr.XRFrame
import typingsJapgolly.webxr.XRFrameRequestCallback
import typingsJapgolly.webxr.XRProjectionLayer
import typingsJapgolly.webxr.XRReferenceSpace
import typingsJapgolly.webxr.XRReferenceSpaceType
import typingsJapgolly.webxr.XRSession
import typingsJapgolly.webxr.XRWebGLBinding
import typingsJapgolly.webxr.XRWebGLLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebxrWebXRManagerMod {
  
  @JSImport("three/src/renderers/webxr/WebXRManager", "WebXRManager")
  @js.native
  open class WebXRManager protected () extends EventDispatcher[Event] {
    def this(renderer: Any, gl: WebGLRenderingContext) = this()
    
    /**
      * @default true
      */
    var cameraAutoUpdate: Boolean = js.native
    
    def dispose(): Unit = js.native
    
    /**
      * @default false
      */
    var enabled: Boolean = js.native
    
    def getBaseLayer(): XRWebGLLayer | XRProjectionLayer = js.native
    
    def getBinding(): XRWebGLBinding = js.native
    
    def getCamera(): WebXRArrayCamera = js.native
    
    def getController(index: Double): XRTargetRaySpace = js.native
    
    def getControllerGrip(index: Double): XRGripSpace = js.native
    
    def getFoveation(): js.UndefOr[Double] = js.native
    
    def getFrame(): XRFrame = js.native
    
    def getHand(index: Double): XRHandSpace = js.native
    
    def getReferenceSpace(): XRReferenceSpace | Null = js.native
    
    def getSession(): XRSession | Null = js.native
    
    /**
      * @default false
      */
    var isPresenting: Boolean = js.native
    
    def setAnimationLoop(): Unit = js.native
    def setAnimationLoop(callback: XRFrameRequestCallback): Unit = js.native
    
    def setFoveation(foveation: Double): Unit = js.native
    
    def setFramebufferScaleFactor(value: Double): Unit = js.native
    
    def setReferenceSpace(value: XRReferenceSpace): Unit = js.native
    
    def setReferenceSpaceType(value: XRReferenceSpaceType): Unit = js.native
    
    def setSession(value: XRSession): js.Promise[Unit] = js.native
    
    def updateCamera(camera: PerspectiveCamera): Unit = js.native
  }
  
  /* Inlined std.Omit<three.three/src/cameras/ArrayCamera.ArrayCamera, 'cameras'> & {  cameras :[three.three/src/renderers/webxr/WebXRManager.WebXRCamera, three.three/src/renderers/webxr/WebXRManager.WebXRCamera]} */
  trait WebXRArrayCamera extends StObject {
    
    var DefaultMatrixAutoUpdate: js.UndefOr[Any] = js.undefined
    
    var DefaultUp: js.UndefOr[Any] = js.undefined
    
    def add(`object`: Object3D[Event]*): this.type
    
    def addEventListener[T /* <: String */](`type`: T, listener: EventListener[Event, T, this.type]): Unit
    @JSName("addEventListener")
    var addEventListener_Original: js.Function2[/* type */ String, /* listener */ EventListener[Event, String, this.type], Unit]
    
    @JSName("add")
    var add_Original: js.Function1[/* repeated */ Object3D[Event], this.type]
    
    var animations: js.Array[AnimationClip]
    
    def applyMatrix4(matrix: Matrix4): Unit
    @JSName("applyMatrix4")
    var applyMatrix4_Original: js.Function1[/* matrix */ Matrix4, Unit]
    
    def applyQuaternion(quaternion: Quaternion): this.type
    @JSName("applyQuaternion")
    var applyQuaternion_Original: js.Function1[/* quaternion */ Quaternion, this.type]
    
    var aspect: Double
    
    def attach(`object`: Object3D[Event]): this.type
    @JSName("attach")
    var attach_Original: js.Function1[/* object */ Object3D[Event], this.type]
    
    var cameras: js.Tuple2[WebXRCamera, WebXRCamera]
    
    var castShadow: Boolean
    
    var children: js.Array[Object3D[Event]]
    
    def clear(): this.type
    
    def clearViewOffset(): Unit
    @JSName("clearViewOffset")
    var clearViewOffset_Original: js.Function0[Unit]
    
    @JSName("clear")
    var clear_Original: js.Function0[this.type]
    
    def clone(recursive: Boolean): this.type
    @JSName("clone")
    var clone_Original: js.Function1[/* recursive */ js.UndefOr[Boolean], this.type]
    
    @JSName("constructor")
    var constructor_Original: js.Function1[/* cameras */ js.UndefOr[js.Array[PerspectiveCamera]], Any]
    
    def copy(source: this.type): this.type
    def copy(source: this.type, recursive: Boolean): this.type
    @JSName("copy")
    var copy_Original: js.Function2[/* source */ this.type, /* recursive */ js.UndefOr[Boolean], this.type]
    
    var customDepthMaterial: Material
    
    var customDistanceMaterial: Material
    
    def dispatchEvent(event: Event): Unit
    @JSName("dispatchEvent")
    var dispatchEvent_Original: js.Function1[/* event */ Event, Unit]
    
    var far: Double
    
    var filmGauge: Double
    
    var filmOffset: Double
    
    var focus: Double
    
    var fov: Double
    
    var frustumCulled: Boolean
    
    def getEffectiveFOV(): Double
    @JSName("getEffectiveFOV")
    var getEffectiveFOV_Original: js.Function0[Double]
    
    def getFilmHeight(): Double
    @JSName("getFilmHeight")
    var getFilmHeight_Original: js.Function0[Double]
    
    def getFilmWidth(): Double
    @JSName("getFilmWidth")
    var getFilmWidth_Original: js.Function0[Double]
    
    def getFocalLength(): Double
    @JSName("getFocalLength")
    var getFocalLength_Original: js.Function0[Double]
    
    def getObjectById(id: Double): js.UndefOr[Object3D[Event]]
    @JSName("getObjectById")
    var getObjectById_Original: js.Function1[/* id */ Double, js.UndefOr[Object3D[Event]]]
    
    def getObjectByName(name: String): js.UndefOr[Object3D[Event]]
    @JSName("getObjectByName")
    var getObjectByName_Original: js.Function1[/* name */ String, js.UndefOr[Object3D[Event]]]
    
    def getObjectByProperty(name: String, value: String): js.UndefOr[Object3D[Event]]
    @JSName("getObjectByProperty")
    var getObjectByProperty_Original: js.Function2[/* name */ String, /* value */ String, js.UndefOr[Object3D[Event]]]
    
    def getWorldDirection(target: Vector3): Vector3
    @JSName("getWorldDirection")
    var getWorldDirection_Original: js.Function1[/* target */ Vector3, Vector3]
    
    def getWorldPosition(target: Vector3): Vector3
    @JSName("getWorldPosition")
    var getWorldPosition_Original: js.Function1[/* target */ Vector3, Vector3]
    
    def getWorldQuaternion(target: Quaternion): Quaternion
    @JSName("getWorldQuaternion")
    var getWorldQuaternion_Original: js.Function1[/* target */ Quaternion, Quaternion]
    
    def getWorldScale(target: Vector3): Vector3
    @JSName("getWorldScale")
    var getWorldScale_Original: js.Function1[/* target */ Vector3, Vector3]
    
    def hasEventListener[T /* <: String */](`type`: T, listener: EventListener[Event, T, this.type]): Boolean
    @JSName("hasEventListener")
    var hasEventListener_Original: js.Function2[/* type */ String, /* listener */ EventListener[Event, String, this.type], Boolean]
    
    var id: Double
    
    var isArrayCamera: `true`
    
    var isCamera: `true`
    
    var isObject3D: `true`
    
    var isPerspectiveCamera: `true`
    
    var layers: Layers
    
    def localToWorld(vector: Vector3): Vector3
    @JSName("localToWorld")
    var localToWorld_Original: js.Function1[/* vector */ Vector3, Vector3]
    
    def lookAt(vector: Vector3): Unit
    @JSName("lookAt")
    var lookAt_Original: js.Function1[/* vector */ Vector3, Unit]
    
    var matrix: Matrix4
    
    var matrixAutoUpdate: Boolean
    
    var matrixWorld: Matrix4
    
    var matrixWorldInverse: Matrix4
    
    var matrixWorldNeedsUpdate: Boolean
    
    var modelViewMatrix: Matrix4
    
    var name: String
    
    var near: Double
    
    var normalMatrix: Matrix3
    
    def onAfterRender(
      renderer: WebGLRenderer,
      scene: Scene,
      camera: Camera,
      geometry: BufferGeometry,
      material: Material,
      group: Group
    ): Unit
    @JSName("onAfterRender")
    var onAfterRender_Original: js.Function6[
        /* renderer */ WebGLRenderer, 
        /* scene */ Scene, 
        /* camera */ Camera, 
        /* geometry */ BufferGeometry, 
        /* material */ Material, 
        /* group */ Group, 
        Unit
      ]
    
    def onBeforeRender(
      renderer: WebGLRenderer,
      scene: Scene,
      camera: Camera,
      geometry: BufferGeometry,
      material: Material,
      group: Group
    ): Unit
    @JSName("onBeforeRender")
    var onBeforeRender_Original: js.Function6[
        /* renderer */ WebGLRenderer, 
        /* scene */ Scene, 
        /* camera */ Camera, 
        /* geometry */ BufferGeometry, 
        /* material */ Material, 
        /* group */ Group, 
        Unit
      ]
    
    var parent: js.UndefOr[Object3D[Event] | Null] = js.undefined
    
    var position: Vector3
    
    var projectionMatrix: Matrix4
    
    var projectionMatrixInverse: Matrix4
    
    var quaternion: Quaternion
    
    def raycast(raycaster: Raycaster, intersects: js.Array[Intersection[Object3D[Event]]]): Unit
    @JSName("raycast")
    var raycast_Original: js.Function2[
        /* raycaster */ Raycaster, 
        /* intersects */ js.Array[Intersection[Object3D[Event]]], 
        Unit
      ]
    
    var receiveShadow: Boolean
    
    def remove(`object`: Object3D[Event]*): this.type
    
    def removeEventListener[T /* <: String */](`type`: T, listener: EventListener[Event, T, this.type]): Unit
    @JSName("removeEventListener")
    var removeEventListener_Original: js.Function2[/* type */ String, /* listener */ EventListener[Event, String, this.type], Unit]
    
    def removeFromParent(): this.type
    @JSName("removeFromParent")
    var removeFromParent_Original: js.Function0[this.type]
    
    @JSName("remove")
    var remove_Original: js.Function1[/* repeated */ Object3D[Event], this.type]
    
    var renderOrder: Double
    
    def rotateOnAxis(axis: Vector3, angle: Double): this.type
    @JSName("rotateOnAxis")
    var rotateOnAxis_Original: js.Function2[/* axis */ Vector3, /* angle */ Double, this.type]
    
    def rotateOnWorldAxis(axis: Vector3, angle: Double): this.type
    @JSName("rotateOnWorldAxis")
    var rotateOnWorldAxis_Original: js.Function2[/* axis */ Vector3, /* angle */ Double, this.type]
    
    def rotateX(angle: Double): this.type
    @JSName("rotateX")
    var rotateX_Original: js.Function1[/* angle */ Double, this.type]
    
    def rotateY(angle: Double): this.type
    @JSName("rotateY")
    var rotateY_Original: js.Function1[/* angle */ Double, this.type]
    
    def rotateZ(angle: Double): this.type
    @JSName("rotateZ")
    var rotateZ_Original: js.Function1[/* angle */ Double, this.type]
    
    var rotation: Euler
    
    var scale: Vector3
    
    def setFocalLength(focalLength: Double): Unit
    @JSName("setFocalLength")
    var setFocalLength_Original: js.Function1[/* focalLength */ Double, Unit]
    
    def setLens(focalLength: Double): Unit
    def setLens(focalLength: Double, frameHeight: Double): Unit
    @JSName("setLens")
    var setLens_Original: js.Function2[/* focalLength */ Double, /* frameHeight */ js.UndefOr[Double], Unit]
    
    def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit
    @JSName("setRotationFromAxisAngle")
    var setRotationFromAxisAngle_Original: js.Function2[/* axis */ Vector3, /* angle */ Double, Unit]
    
    def setRotationFromEuler(euler: Euler): Unit
    @JSName("setRotationFromEuler")
    var setRotationFromEuler_Original: js.Function1[/* euler */ Euler, Unit]
    
    def setRotationFromMatrix(m: Matrix4): Unit
    @JSName("setRotationFromMatrix")
    var setRotationFromMatrix_Original: js.Function1[/* m */ Matrix4, Unit]
    
    def setRotationFromQuaternion(q: Quaternion): Unit
    @JSName("setRotationFromQuaternion")
    var setRotationFromQuaternion_Original: js.Function1[/* q */ Quaternion, Unit]
    
    def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit
    @JSName("setViewOffset")
    var setViewOffset_Original: js.Function6[
        /* fullWidth */ Double, 
        /* fullHeight */ Double, 
        /* x */ Double, 
        /* y */ Double, 
        /* width */ Double, 
        /* height */ Double, 
        Unit
      ]
    
    def toJSON(): Any
    def toJSON(meta: Any): Any
    @JSName("toJSON")
    var toJSON_Original: js.Function1[/* meta */ js.UndefOr[Any], Any]
    
    def translateOnAxis(axis: Vector3, distance: Double): this.type
    @JSName("translateOnAxis")
    var translateOnAxis_Original: js.Function2[/* axis */ Vector3, /* distance */ Double, this.type]
    
    def translateX(distance: Double): this.type
    @JSName("translateX")
    var translateX_Original: js.Function1[/* distance */ Double, this.type]
    
    def translateY(distance: Double): this.type
    @JSName("translateY")
    var translateY_Original: js.Function1[/* distance */ Double, this.type]
    
    def translateZ(distance: Double): this.type
    @JSName("translateZ")
    var translateZ_Original: js.Function1[/* distance */ Double, this.type]
    
    def traverse(callback: js.Function1[/* object */ Object3D[Event], Any]): Unit
    
    def traverseAncestors(callback: js.Function1[/* object */ Object3D[Event], Any]): Unit
    @JSName("traverseAncestors")
    var traverseAncestors_Original: js.Function1[/* callback */ js.Function1[/* object */ Object3D[Event], Any], Unit]
    
    def traverseVisible(callback: js.Function1[/* object */ Object3D[Event], Any]): Unit
    @JSName("traverseVisible")
    var traverseVisible_Original: js.Function1[/* callback */ js.Function1[/* object */ Object3D[Event], Any], Unit]
    
    @JSName("traverse")
    var traverse_Original: js.Function1[/* callback */ js.Function1[/* object */ Object3D[Event], Any], Unit]
    
    var `type`: typingsJapgolly.three.threeStrings.PerspectiveCamera
    
    var up: Vector3
    
    def updateMatrix(): Unit
    
    def updateMatrixWorld(): Unit
    def updateMatrixWorld(force: Boolean): Unit
    @JSName("updateMatrixWorld")
    var updateMatrixWorld_Original: js.Function1[/* force */ js.UndefOr[Boolean], Unit]
    
    @JSName("updateMatrix")
    var updateMatrix_Original: js.Function0[Unit]
    
    def updateProjectionMatrix(): Unit
    @JSName("updateProjectionMatrix")
    var updateProjectionMatrix_Original: js.Function0[Unit]
    
    def updateWorldMatrix(updateParents: Boolean, updateChildren: Boolean): Unit
    @JSName("updateWorldMatrix")
    var updateWorldMatrix_Original: js.Function2[/* updateParents */ Boolean, /* updateChildren */ Boolean, Unit]
    
    var userData: StringDictionary[Any]
    
    var uuid: String
    
    var view: js.UndefOr[Null | FullHeight] = js.undefined
    
    var visible: Boolean
    
    def worldToLocal(vector: Vector3): Vector3
    @JSName("worldToLocal")
    var worldToLocal_Original: js.Function1[/* vector */ Vector3, Vector3]
    
    var zoom: Double
  }
  object WebXRArrayCamera {
    
    inline def apply(
      add: /* repeated */ Object3D[Event] => WebXRArrayCamera,
      addEventListener: (/* type */ String, /* listener */ EventListener[Event, String, WebXRArrayCamera]) => Callback,
      animations: js.Array[AnimationClip],
      applyMatrix4: /* matrix */ Matrix4 => Callback,
      applyQuaternion: /* quaternion */ Quaternion => WebXRArrayCamera,
      aspect: Double,
      attach: /* object */ Object3D[Event] => WebXRArrayCamera,
      cameras: js.Tuple2[WebXRCamera, WebXRCamera],
      castShadow: Boolean,
      children: js.Array[Object3D[Event]],
      clear: CallbackTo[WebXRArrayCamera],
      clearViewOffset: Callback,
      clone_ : /* recursive */ js.UndefOr[Boolean] => WebXRArrayCamera,
      constructor: /* cameras */ js.UndefOr[js.Array[PerspectiveCamera]] => Any,
      copy: (WebXRArrayCamera, /* recursive */ js.UndefOr[Boolean]) => WebXRArrayCamera,
      customDepthMaterial: Material,
      customDistanceMaterial: Material,
      dispatchEvent: /* event */ Event => Callback,
      far: Double,
      filmGauge: Double,
      filmOffset: Double,
      focus: Double,
      fov: Double,
      frustumCulled: Boolean,
      getEffectiveFOV: CallbackTo[Double],
      getFilmHeight: CallbackTo[Double],
      getFilmWidth: CallbackTo[Double],
      getFocalLength: CallbackTo[Double],
      getObjectById: /* id */ Double => js.UndefOr[Object3D[Event]],
      getObjectByName: /* name */ String => js.UndefOr[Object3D[Event]],
      getObjectByProperty: (/* name */ String, /* value */ String) => js.UndefOr[Object3D[Event]],
      getWorldDirection: /* target */ Vector3 => Vector3,
      getWorldPosition: /* target */ Vector3 => Vector3,
      getWorldQuaternion: /* target */ Quaternion => Quaternion,
      getWorldScale: /* target */ Vector3 => Vector3,
      hasEventListener: (/* type */ String, /* listener */ EventListener[Event, String, WebXRArrayCamera]) => Boolean,
      id: Double,
      layers: Layers,
      localToWorld: /* vector */ Vector3 => Vector3,
      lookAt: /* vector */ Vector3 => Callback,
      matrix: Matrix4,
      matrixAutoUpdate: Boolean,
      matrixWorld: Matrix4,
      matrixWorldInverse: Matrix4,
      matrixWorldNeedsUpdate: Boolean,
      modelViewMatrix: Matrix4,
      name: String,
      near: Double,
      normalMatrix: Matrix3,
      onAfterRender: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Callback,
      onBeforeRender: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Callback,
      position: Vector3,
      projectionMatrix: Matrix4,
      projectionMatrixInverse: Matrix4,
      quaternion: Quaternion,
      raycast: (/* raycaster */ Raycaster, /* intersects */ js.Array[Intersection[Object3D[Event]]]) => Callback,
      receiveShadow: Boolean,
      remove: /* repeated */ Object3D[Event] => WebXRArrayCamera,
      removeEventListener: (/* type */ String, /* listener */ EventListener[Event, String, WebXRArrayCamera]) => Callback,
      removeFromParent: CallbackTo[WebXRArrayCamera],
      renderOrder: Double,
      rotateOnAxis: (/* axis */ Vector3, /* angle */ Double) => WebXRArrayCamera,
      rotateOnWorldAxis: (/* axis */ Vector3, /* angle */ Double) => WebXRArrayCamera,
      rotateX: /* angle */ Double => WebXRArrayCamera,
      rotateY: /* angle */ Double => WebXRArrayCamera,
      rotateZ: /* angle */ Double => WebXRArrayCamera,
      rotation: Euler,
      scale: Vector3,
      setFocalLength: /* focalLength */ Double => Callback,
      setLens: (/* focalLength */ Double, /* frameHeight */ js.UndefOr[Double]) => Callback,
      setRotationFromAxisAngle: (/* axis */ Vector3, /* angle */ Double) => Callback,
      setRotationFromEuler: /* euler */ Euler => Callback,
      setRotationFromMatrix: /* m */ Matrix4 => Callback,
      setRotationFromQuaternion: /* q */ Quaternion => Callback,
      setViewOffset: (/* fullWidth */ Double, /* fullHeight */ Double, /* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double) => Callback,
      toJSON: /* meta */ js.UndefOr[Any] => Any,
      translateOnAxis: (/* axis */ Vector3, /* distance */ Double) => WebXRArrayCamera,
      translateX: /* distance */ Double => WebXRArrayCamera,
      translateY: /* distance */ Double => WebXRArrayCamera,
      translateZ: /* distance */ Double => WebXRArrayCamera,
      traverse: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Callback,
      traverseAncestors: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Callback,
      traverseVisible: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Callback,
      up: Vector3,
      updateMatrix: Callback,
      updateMatrixWorld: /* force */ js.UndefOr[Boolean] => Callback,
      updateProjectionMatrix: Callback,
      updateWorldMatrix: (/* updateParents */ Boolean, /* updateChildren */ Boolean) => Callback,
      userData: StringDictionary[Any],
      uuid: String,
      visible: Boolean,
      worldToLocal: /* vector */ Vector3 => Vector3,
      zoom: Double
    ): WebXRArrayCamera = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addEventListener = js.Any.fromFunction2((t0: /* type */ String, t1: /* listener */ EventListener[Event, String, WebXRArrayCamera]) => (addEventListener(t0, t1)).runNow()), animations = animations.asInstanceOf[js.Any], applyMatrix4 = js.Any.fromFunction1((t0: /* matrix */ Matrix4) => applyMatrix4(t0).runNow()), applyQuaternion = js.Any.fromFunction1(applyQuaternion), aspect = aspect.asInstanceOf[js.Any], attach = js.Any.fromFunction1(attach), cameras = cameras.asInstanceOf[js.Any], castShadow = castShadow.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], clear = clear.toJsFn, clearViewOffset = clearViewOffset.toJsFn, constructor = js.Any.fromFunction1(constructor), copy = js.Any.fromFunction2(copy), customDepthMaterial = customDepthMaterial.asInstanceOf[js.Any], customDistanceMaterial = customDistanceMaterial.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1((t0: /* event */ Event) => dispatchEvent(t0).runNow()), far = far.asInstanceOf[js.Any], filmGauge = filmGauge.asInstanceOf[js.Any], filmOffset = filmOffset.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any], frustumCulled = frustumCulled.asInstanceOf[js.Any], getEffectiveFOV = getEffectiveFOV.toJsFn, getFilmHeight = getFilmHeight.toJsFn, getFilmWidth = getFilmWidth.toJsFn, getFocalLength = getFocalLength.toJsFn, getObjectById = js.Any.fromFunction1(getObjectById), getObjectByName = js.Any.fromFunction1(getObjectByName), getObjectByProperty = js.Any.fromFunction2(getObjectByProperty), getWorldDirection = js.Any.fromFunction1(getWorldDirection), getWorldPosition = js.Any.fromFunction1(getWorldPosition), getWorldQuaternion = js.Any.fromFunction1(getWorldQuaternion), getWorldScale = js.Any.fromFunction1(getWorldScale), hasEventListener = js.Any.fromFunction2(hasEventListener), id = id.asInstanceOf[js.Any], isArrayCamera = true, isCamera = true, isObject3D = true, isPerspectiveCamera = true, layers = layers.asInstanceOf[js.Any], localToWorld = js.Any.fromFunction1(localToWorld), lookAt = js.Any.fromFunction1((t0: /* vector */ Vector3) => lookAt(t0).runNow()), matrix = matrix.asInstanceOf[js.Any], matrixAutoUpdate = matrixAutoUpdate.asInstanceOf[js.Any], matrixWorld = matrixWorld.asInstanceOf[js.Any], matrixWorldInverse = matrixWorldInverse.asInstanceOf[js.Any], matrixWorldNeedsUpdate = matrixWorldNeedsUpdate.asInstanceOf[js.Any], modelViewMatrix = modelViewMatrix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], normalMatrix = normalMatrix.asInstanceOf[js.Any], onAfterRender = js.Any.fromFunction6((t0: /* renderer */ WebGLRenderer, t1: /* scene */ Scene, t2: /* camera */ Camera, t3: /* geometry */ BufferGeometry, t4: /* material */ Material, t5: /* group */ Group) => (onAfterRender(t0, t1, t2, t3, t4, t5)).runNow()), onBeforeRender = js.Any.fromFunction6((t0: /* renderer */ WebGLRenderer, t1: /* scene */ Scene, t2: /* camera */ Camera, t3: /* geometry */ BufferGeometry, t4: /* material */ Material, t5: /* group */ Group) => (onBeforeRender(t0, t1, t2, t3, t4, t5)).runNow()), position = position.asInstanceOf[js.Any], projectionMatrix = projectionMatrix.asInstanceOf[js.Any], projectionMatrixInverse = projectionMatrixInverse.asInstanceOf[js.Any], quaternion = quaternion.asInstanceOf[js.Any], raycast = js.Any.fromFunction2((t0: /* raycaster */ Raycaster, t1: /* intersects */ js.Array[Intersection[Object3D[Event]]]) => (raycast(t0, t1)).runNow()), receiveShadow = receiveShadow.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction2((t0: /* type */ String, t1: /* listener */ EventListener[Event, String, WebXRArrayCamera]) => (removeEventListener(t0, t1)).runNow()), removeFromParent = removeFromParent.toJsFn, renderOrder = renderOrder.asInstanceOf[js.Any], rotateOnAxis = js.Any.fromFunction2(rotateOnAxis), rotateOnWorldAxis = js.Any.fromFunction2(rotateOnWorldAxis), rotateX = js.Any.fromFunction1(rotateX), rotateY = js.Any.fromFunction1(rotateY), rotateZ = js.Any.fromFunction1(rotateZ), rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setFocalLength = js.Any.fromFunction1((t0: /* focalLength */ Double) => setFocalLength(t0).runNow()), setLens = js.Any.fromFunction2((t0: /* focalLength */ Double, t1: /* frameHeight */ js.UndefOr[Double]) => (setLens(t0, t1)).runNow()), setRotationFromAxisAngle = js.Any.fromFunction2((t0: /* axis */ Vector3, t1: /* angle */ Double) => (setRotationFromAxisAngle(t0, t1)).runNow()), setRotationFromEuler = js.Any.fromFunction1((t0: /* euler */ Euler) => setRotationFromEuler(t0).runNow()), setRotationFromMatrix = js.Any.fromFunction1((t0: /* m */ Matrix4) => setRotationFromMatrix(t0).runNow()), setRotationFromQuaternion = js.Any.fromFunction1((t0: /* q */ Quaternion) => setRotationFromQuaternion(t0).runNow()), setViewOffset = js.Any.fromFunction6((t0: /* fullWidth */ Double, t1: /* fullHeight */ Double, t2: /* x */ Double, t3: /* y */ Double, t4: /* width */ Double, t5: /* height */ Double) => (setViewOffset(t0, t1, t2, t3, t4, t5)).runNow()), toJSON = js.Any.fromFunction1(toJSON), translateOnAxis = js.Any.fromFunction2(translateOnAxis), translateX = js.Any.fromFunction1(translateX), translateY = js.Any.fromFunction1(translateY), translateZ = js.Any.fromFunction1(translateZ), traverse = js.Any.fromFunction1((t0: /* callback */ js.Function1[/* object */ Object3D[Event], Any]) => traverse(t0).runNow()), traverseAncestors = js.Any.fromFunction1((t0: /* callback */ js.Function1[/* object */ Object3D[Event], Any]) => traverseAncestors(t0).runNow()), traverseVisible = js.Any.fromFunction1((t0: /* callback */ js.Function1[/* object */ Object3D[Event], Any]) => traverseVisible(t0).runNow()), up = up.asInstanceOf[js.Any], updateMatrix = updateMatrix.toJsFn, updateMatrixWorld = js.Any.fromFunction1((t0: /* force */ js.UndefOr[Boolean]) => updateMatrixWorld(t0).runNow()), updateProjectionMatrix = updateProjectionMatrix.toJsFn, updateWorldMatrix = js.Any.fromFunction2((t0: /* updateParents */ Boolean, t1: /* updateChildren */ Boolean) => (updateWorldMatrix(t0, t1)).runNow()), userData = userData.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], worldToLocal = js.Any.fromFunction1(worldToLocal), zoom = zoom.asInstanceOf[js.Any])
      __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
      __obj.updateDynamic("type")("PerspectiveCamera")
      __obj.asInstanceOf[WebXRArrayCamera]
    }
    
    extension [Self <: WebXRArrayCamera](x: Self) {
      
      inline def setAdd(value: /* repeated */ Object3D[Event] => WebXRArrayCamera): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddEventListener(
        value: (/* type */ String, /* listener */ EventListener[Event, String, WebXRArrayCamera]) => Callback
      ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: /* type */ String, t1: /* listener */ EventListener[Event, String, WebXRArrayCamera]) => (value(t0, t1)).runNow()))
      
      inline def setAnimations(value: js.Array[AnimationClip]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsVarargs(value: AnimationClip*): Self = StObject.set(x, "animations", js.Array(value*))
      
      inline def setApplyMatrix4(value: /* matrix */ Matrix4 => Callback): Self = StObject.set(x, "applyMatrix4", js.Any.fromFunction1((t0: /* matrix */ Matrix4) => value(t0).runNow()))
      
      inline def setApplyQuaternion(value: /* quaternion */ Quaternion => WebXRArrayCamera): Self = StObject.set(x, "applyQuaternion", js.Any.fromFunction1(value))
      
      inline def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      inline def setAttach(value: /* object */ Object3D[Event] => WebXRArrayCamera): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
      
      inline def setCameras(value: js.Tuple2[WebXRCamera, WebXRCamera]): Self = StObject.set(x, "cameras", value.asInstanceOf[js.Any])
      
      inline def setCastShadow(value: Boolean): Self = StObject.set(x, "castShadow", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Object3D[Event]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Object3D[Event]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClear(value: CallbackTo[WebXRArrayCamera]): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setClearViewOffset(value: Callback): Self = StObject.set(x, "clearViewOffset", value.toJsFn)
      
      inline def setClone_(value: /* recursive */ js.UndefOr[Boolean] => WebXRArrayCamera): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
      
      inline def setConstructor(value: /* cameras */ js.UndefOr[js.Array[PerspectiveCamera]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      inline def setCopy(value: (WebXRArrayCamera, /* recursive */ js.UndefOr[Boolean]) => WebXRArrayCamera): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      inline def setCustomDepthMaterial(value: Material): Self = StObject.set(x, "customDepthMaterial", value.asInstanceOf[js.Any])
      
      inline def setCustomDistanceMaterial(value: Material): Self = StObject.set(x, "customDistanceMaterial", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatrixAutoUpdate(value: Any): Self = StObject.set(x, "DefaultMatrixAutoUpdate", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatrixAutoUpdateUndefined: Self = StObject.set(x, "DefaultMatrixAutoUpdate", js.undefined)
      
      inline def setDefaultUp(value: Any): Self = StObject.set(x, "DefaultUp", value.asInstanceOf[js.Any])
      
      inline def setDefaultUpUndefined: Self = StObject.set(x, "DefaultUp", js.undefined)
      
      inline def setDispatchEvent(value: /* event */ Event => Callback): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
      
      inline def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
      
      inline def setFilmGauge(value: Double): Self = StObject.set(x, "filmGauge", value.asInstanceOf[js.Any])
      
      inline def setFilmOffset(value: Double): Self = StObject.set(x, "filmOffset", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: Double): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
      
      inline def setFrustumCulled(value: Boolean): Self = StObject.set(x, "frustumCulled", value.asInstanceOf[js.Any])
      
      inline def setGetEffectiveFOV(value: CallbackTo[Double]): Self = StObject.set(x, "getEffectiveFOV", value.toJsFn)
      
      inline def setGetFilmHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getFilmHeight", value.toJsFn)
      
      inline def setGetFilmWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getFilmWidth", value.toJsFn)
      
      inline def setGetFocalLength(value: CallbackTo[Double]): Self = StObject.set(x, "getFocalLength", value.toJsFn)
      
      inline def setGetObjectById(value: /* id */ Double => js.UndefOr[Object3D[Event]]): Self = StObject.set(x, "getObjectById", js.Any.fromFunction1(value))
      
      inline def setGetObjectByName(value: /* name */ String => js.UndefOr[Object3D[Event]]): Self = StObject.set(x, "getObjectByName", js.Any.fromFunction1(value))
      
      inline def setGetObjectByProperty(value: (/* name */ String, /* value */ String) => js.UndefOr[Object3D[Event]]): Self = StObject.set(x, "getObjectByProperty", js.Any.fromFunction2(value))
      
      inline def setGetWorldDirection(value: /* target */ Vector3 => Vector3): Self = StObject.set(x, "getWorldDirection", js.Any.fromFunction1(value))
      
      inline def setGetWorldPosition(value: /* target */ Vector3 => Vector3): Self = StObject.set(x, "getWorldPosition", js.Any.fromFunction1(value))
      
      inline def setGetWorldQuaternion(value: /* target */ Quaternion => Quaternion): Self = StObject.set(x, "getWorldQuaternion", js.Any.fromFunction1(value))
      
      inline def setGetWorldScale(value: /* target */ Vector3 => Vector3): Self = StObject.set(x, "getWorldScale", js.Any.fromFunction1(value))
      
      inline def setHasEventListener(
        value: (/* type */ String, /* listener */ EventListener[Event, String, WebXRArrayCamera]) => Boolean
      ): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction2(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsArrayCamera(value: `true`): Self = StObject.set(x, "isArrayCamera", value.asInstanceOf[js.Any])
      
      inline def setIsCamera(value: `true`): Self = StObject.set(x, "isCamera", value.asInstanceOf[js.Any])
      
      inline def setIsObject3D(value: `true`): Self = StObject.set(x, "isObject3D", value.asInstanceOf[js.Any])
      
      inline def setIsPerspectiveCamera(value: `true`): Self = StObject.set(x, "isPerspectiveCamera", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLocalToWorld(value: /* vector */ Vector3 => Vector3): Self = StObject.set(x, "localToWorld", js.Any.fromFunction1(value))
      
      inline def setLookAt(value: /* vector */ Vector3 => Callback): Self = StObject.set(x, "lookAt", js.Any.fromFunction1((t0: /* vector */ Vector3) => value(t0).runNow()))
      
      inline def setMatrix(value: Matrix4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixAutoUpdate(value: Boolean): Self = StObject.set(x, "matrixAutoUpdate", value.asInstanceOf[js.Any])
      
      inline def setMatrixWorld(value: Matrix4): Self = StObject.set(x, "matrixWorld", value.asInstanceOf[js.Any])
      
      inline def setMatrixWorldInverse(value: Matrix4): Self = StObject.set(x, "matrixWorldInverse", value.asInstanceOf[js.Any])
      
      inline def setMatrixWorldNeedsUpdate(value: Boolean): Self = StObject.set(x, "matrixWorldNeedsUpdate", value.asInstanceOf[js.Any])
      
      inline def setModelViewMatrix(value: Matrix4): Self = StObject.set(x, "modelViewMatrix", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
      
      inline def setNormalMatrix(value: Matrix3): Self = StObject.set(x, "normalMatrix", value.asInstanceOf[js.Any])
      
      inline def setOnAfterRender(
        value: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Callback
      ): Self = StObject.set(x, "onAfterRender", js.Any.fromFunction6((t0: /* renderer */ WebGLRenderer, t1: /* scene */ Scene, t2: /* camera */ Camera, t3: /* geometry */ BufferGeometry, t4: /* material */ Material, t5: /* group */ Group) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setOnBeforeRender(
        value: (/* renderer */ WebGLRenderer, /* scene */ Scene, /* camera */ Camera, /* geometry */ BufferGeometry, /* material */ Material, /* group */ Group) => Callback
      ): Self = StObject.set(x, "onBeforeRender", js.Any.fromFunction6((t0: /* renderer */ WebGLRenderer, t1: /* scene */ Scene, t2: /* camera */ Camera, t3: /* geometry */ BufferGeometry, t4: /* material */ Material, t5: /* group */ Group) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setParent(value: Object3D[Event]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setProjectionMatrix(value: Matrix4): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
      
      inline def setProjectionMatrixInverse(value: Matrix4): Self = StObject.set(x, "projectionMatrixInverse", value.asInstanceOf[js.Any])
      
      inline def setQuaternion(value: Quaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
      
      inline def setRaycast(
        value: (/* raycaster */ Raycaster, /* intersects */ js.Array[Intersection[Object3D[Event]]]) => Callback
      ): Self = StObject.set(x, "raycast", js.Any.fromFunction2((t0: /* raycaster */ Raycaster, t1: /* intersects */ js.Array[Intersection[Object3D[Event]]]) => (value(t0, t1)).runNow()))
      
      inline def setReceiveShadow(value: Boolean): Self = StObject.set(x, "receiveShadow", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: /* repeated */ Object3D[Event] => WebXRArrayCamera): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveEventListener(
        value: (/* type */ String, /* listener */ EventListener[Event, String, WebXRArrayCamera]) => Callback
      ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: /* type */ String, t1: /* listener */ EventListener[Event, String, WebXRArrayCamera]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveFromParent(value: CallbackTo[WebXRArrayCamera]): Self = StObject.set(x, "removeFromParent", value.toJsFn)
      
      inline def setRenderOrder(value: Double): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      inline def setRotateOnAxis(value: (/* axis */ Vector3, /* angle */ Double) => WebXRArrayCamera): Self = StObject.set(x, "rotateOnAxis", js.Any.fromFunction2(value))
      
      inline def setRotateOnWorldAxis(value: (/* axis */ Vector3, /* angle */ Double) => WebXRArrayCamera): Self = StObject.set(x, "rotateOnWorldAxis", js.Any.fromFunction2(value))
      
      inline def setRotateX(value: /* angle */ Double => WebXRArrayCamera): Self = StObject.set(x, "rotateX", js.Any.fromFunction1(value))
      
      inline def setRotateY(value: /* angle */ Double => WebXRArrayCamera): Self = StObject.set(x, "rotateY", js.Any.fromFunction1(value))
      
      inline def setRotateZ(value: /* angle */ Double => WebXRArrayCamera): Self = StObject.set(x, "rotateZ", js.Any.fromFunction1(value))
      
      inline def setRotation(value: Euler): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Vector3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSetFocalLength(value: /* focalLength */ Double => Callback): Self = StObject.set(x, "setFocalLength", js.Any.fromFunction1((t0: /* focalLength */ Double) => value(t0).runNow()))
      
      inline def setSetLens(value: (/* focalLength */ Double, /* frameHeight */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "setLens", js.Any.fromFunction2((t0: /* focalLength */ Double, t1: /* frameHeight */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
      
      inline def setSetRotationFromAxisAngle(value: (/* axis */ Vector3, /* angle */ Double) => Callback): Self = StObject.set(x, "setRotationFromAxisAngle", js.Any.fromFunction2((t0: /* axis */ Vector3, t1: /* angle */ Double) => (value(t0, t1)).runNow()))
      
      inline def setSetRotationFromEuler(value: /* euler */ Euler => Callback): Self = StObject.set(x, "setRotationFromEuler", js.Any.fromFunction1((t0: /* euler */ Euler) => value(t0).runNow()))
      
      inline def setSetRotationFromMatrix(value: /* m */ Matrix4 => Callback): Self = StObject.set(x, "setRotationFromMatrix", js.Any.fromFunction1((t0: /* m */ Matrix4) => value(t0).runNow()))
      
      inline def setSetRotationFromQuaternion(value: /* q */ Quaternion => Callback): Self = StObject.set(x, "setRotationFromQuaternion", js.Any.fromFunction1((t0: /* q */ Quaternion) => value(t0).runNow()))
      
      inline def setSetViewOffset(
        value: (/* fullWidth */ Double, /* fullHeight */ Double, /* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double) => Callback
      ): Self = StObject.set(x, "setViewOffset", js.Any.fromFunction6((t0: /* fullWidth */ Double, t1: /* fullHeight */ Double, t2: /* x */ Double, t3: /* y */ Double, t4: /* width */ Double, t5: /* height */ Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setToJSON(value: /* meta */ js.UndefOr[Any] => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
      
      inline def setTranslateOnAxis(value: (/* axis */ Vector3, /* distance */ Double) => WebXRArrayCamera): Self = StObject.set(x, "translateOnAxis", js.Any.fromFunction2(value))
      
      inline def setTranslateX(value: /* distance */ Double => WebXRArrayCamera): Self = StObject.set(x, "translateX", js.Any.fromFunction1(value))
      
      inline def setTranslateY(value: /* distance */ Double => WebXRArrayCamera): Self = StObject.set(x, "translateY", js.Any.fromFunction1(value))
      
      inline def setTranslateZ(value: /* distance */ Double => WebXRArrayCamera): Self = StObject.set(x, "translateZ", js.Any.fromFunction1(value))
      
      inline def setTraverse(value: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Callback): Self = StObject.set(x, "traverse", js.Any.fromFunction1((t0: /* callback */ js.Function1[/* object */ Object3D[Event], Any]) => value(t0).runNow()))
      
      inline def setTraverseAncestors(value: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Callback): Self = StObject.set(x, "traverseAncestors", js.Any.fromFunction1((t0: /* callback */ js.Function1[/* object */ Object3D[Event], Any]) => value(t0).runNow()))
      
      inline def setTraverseVisible(value: /* callback */ js.Function1[/* object */ Object3D[Event], Any] => Callback): Self = StObject.set(x, "traverseVisible", js.Any.fromFunction1((t0: /* callback */ js.Function1[/* object */ Object3D[Event], Any]) => value(t0).runNow()))
      
      inline def setType(value: typingsJapgolly.three.threeStrings.PerspectiveCamera): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUp(value: Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpdateMatrix(value: Callback): Self = StObject.set(x, "updateMatrix", value.toJsFn)
      
      inline def setUpdateMatrixWorld(value: /* force */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "updateMatrixWorld", js.Any.fromFunction1((t0: /* force */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setUpdateProjectionMatrix(value: Callback): Self = StObject.set(x, "updateProjectionMatrix", value.toJsFn)
      
      inline def setUpdateWorldMatrix(value: (/* updateParents */ Boolean, /* updateChildren */ Boolean) => Callback): Self = StObject.set(x, "updateWorldMatrix", js.Any.fromFunction2((t0: /* updateParents */ Boolean, t1: /* updateChildren */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setUserData(value: StringDictionary[Any]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setView(value: FullHeight): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewNull: Self = StObject.set(x, "view", null)
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWorldToLocal(value: /* vector */ Vector3 => Vector3): Self = StObject.set(x, "worldToLocal", js.Any.fromFunction1(value))
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebXRCamera extends PerspectiveCamera {
    
    var viewport: Vector4 = js.native
  }
}
