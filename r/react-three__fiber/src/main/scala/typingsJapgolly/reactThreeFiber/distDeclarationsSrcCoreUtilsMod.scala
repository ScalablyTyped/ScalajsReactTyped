package typingsJapgolly.reactThreeFiber

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.EffectCallback
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactThreeFiber.anon.Children
import typingsJapgolly.reactThreeFiber.anon.Dictkey
import typingsJapgolly.reactThreeFiber.anon.Error
import typingsJapgolly.reactThreeFiber.anon.Manual
import typingsJapgolly.reactThreeFiber.anon.OmitUnblockPropschildren
import typingsJapgolly.reactThreeFiber.anon.PartialLocalState
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreRendererMod.AttachType
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreRendererMod.Instance
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreRendererMod.InstanceProps
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.Dpr
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.Size
import typingsJapgolly.reactThreeFiber.reactThreeFiberBooleans.`false`
import typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.reference
import typingsJapgolly.reactThreeFiber.reactThreeFiberStrings.shallow
import typingsJapgolly.three.mod.Material
import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.mod.OrthographicCamera
import typingsJapgolly.three.mod.PerspectiveCamera
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCoreUtilsMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Block(hasSet: OmitUnblockPropschildren): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Block")(hasSet.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/utils", "DEFAULT")
  @js.native
  val DEFAULT: /* "__default" */ String = js.native
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/utils", "ErrorBoundary")
  @js.native
  open class ErrorBoundary protected () extends Component[Children, Error, Any] {
    def this(props: Children) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Children, context: Any) = this()
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(err: js.Error): Unit = js.native
  }
  /* static members */
  object ErrorBoundary {
    
    @JSImport("@react-three/fiber/dist/declarations/src/core/utils", "ErrorBoundary")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")().asInstanceOf[Error]
  }
  
  inline def applyProps(instance: Instance, data: InstanceProps): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def applyProps(instance: Instance, data: DiffSet): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProps")(instance.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  inline def attach(parent: Instance, child: Instance, `type`: AttachType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def buildGraph(`object`: Object3D[Event]): ObjectMap = ^.asInstanceOf[js.Dynamic].applyDynamic("buildGraph")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectMap]
  
  inline def calculateDpr(dpr: Dpr): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDpr")(dpr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def detach(parent: Instance, child: Instance, `type`: AttachType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def diffProps(instance: Instance, hasCNKNRNProps: InstanceProps): DiffSet = (^.asInstanceOf[js.Dynamic].applyDynamic("diffProps")(instance.asInstanceOf[js.Any], hasCNKNRNProps.asInstanceOf[js.Any])).asInstanceOf[DiffSet]
  inline def diffProps(instance: Instance, hasCNKNRNProps: InstanceProps, hasCPKPRPPrevious: Unit, remove: Boolean): DiffSet = (^.asInstanceOf[js.Dynamic].applyDynamic("diffProps")(instance.asInstanceOf[js.Any], hasCNKNRNProps.asInstanceOf[js.Any], hasCPKPRPPrevious.asInstanceOf[js.Any], remove.asInstanceOf[js.Any])).asInstanceOf[DiffSet]
  inline def diffProps(instance: Instance, hasCNKNRNProps: InstanceProps, hasCPKPRPPrevious: InstanceProps): DiffSet = (^.asInstanceOf[js.Dynamic].applyDynamic("diffProps")(instance.asInstanceOf[js.Any], hasCNKNRNProps.asInstanceOf[js.Any], hasCPKPRPPrevious.asInstanceOf[js.Any])).asInstanceOf[DiffSet]
  inline def diffProps(
    instance: Instance,
    hasCNKNRNProps: InstanceProps,
    hasCPKPRPPrevious: InstanceProps,
    remove: Boolean
  ): DiffSet = (^.asInstanceOf[js.Dynamic].applyDynamic("diffProps")(instance.asInstanceOf[js.Any], hasCNKNRNProps.asInstanceOf[js.Any], hasCPKPRPPrevious.asInstanceOf[js.Any], remove.asInstanceOf[js.Any])).asInstanceOf[DiffSet]
  
  inline def dispose[TObj /* <: Dictkey */](obj: TObj): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getRootState(obj: Object3D[Event]): js.UndefOr[RootState] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootState")(obj.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RootState]]
  
  inline def invalidateInstance(instance: Instance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object is {
    
    @JSImport("@react-three/fiber/dist/declarations/src/core/utils", "is")
    @js.native
    val ^ : js.Any = js.native
    
    inline def arr(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arr")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def boo(a: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boo")(a.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    inline def equ(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equ")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equ(a: Any, b: Any, hasArraysObjectsStrict: EquConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equ")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], hasArraysObjectsStrict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fun(a: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fun")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    inline def num(a: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("num")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def obj(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def str(a: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def und(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("und")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def isDiffSet(`def`: Any): /* is @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.DiffSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiffSet")(`def`.asInstanceOf[js.Any]).asInstanceOf[/* is @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.DiffSet */ Boolean]
  
  inline def isOrthographicCamera(`def`: Camera): /* is three.three.OrthographicCamera */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOrthographicCamera")(`def`.asInstanceOf[js.Any]).asInstanceOf[/* is three.three.OrthographicCamera */ Boolean]
  
  inline def isRef(obj: Any): /* is react.react.MutableRefObject<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.MutableRefObject<unknown> */ Boolean]
  
  inline def prepare[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def prepare[T](`object`: T, state: PartialLocalState): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(`object`.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def setDeep(obj: Any, value: Any, keys: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setDeep")(obj.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def updateCamera(camera: Camera & Manual, size: Size): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCamera")(camera.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateInstance(instance: Instance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useMutableCallback[T](fn: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutableCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
  
  type Camera = OrthographicCamera | PerspectiveCamera
  
  @js.native
  trait ClassConstructor
    extends StObject
       with Instantiable0[Unit]
  
  trait DiffSet extends StObject {
    
    var changes: js.Array[
        js.Tuple4[/* key */ String, /* value */ Any, /* isEvent */ Boolean, /* keys */ js.Array[String]]
      ]
    
    var memoized: StringDictionary[Any]
  }
  object DiffSet {
    
    inline def apply(
      changes: js.Array[
          js.Tuple4[/* key */ String, /* value */ Any, /* isEvent */ Boolean, /* keys */ js.Array[String]]
        ],
      memoized: StringDictionary[Any]
    ): DiffSet = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], memoized = memoized.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiffSet]
    }
    
    extension [Self <: DiffSet](x: Self) {
      
      inline def setChanges(
        value: js.Array[
              js.Tuple4[/* key */ String, /* value */ Any, /* isEvent */ Boolean, /* keys */ js.Array[String]]
            ]
      ): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(
        value: (js.Tuple4[/* key */ String, /* value */ Any, /* isEvent */ Boolean, /* keys */ js.Array[String]])*
      ): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setMemoized(value: StringDictionary[Any]): Self = StObject.set(x, "memoized", value.asInstanceOf[js.Any])
    }
  }
  
  trait EquConfig extends StObject {
    
    var arrays: js.UndefOr[reference | shallow] = js.undefined
    
    var objects: js.UndefOr[reference | shallow] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object EquConfig {
    
    inline def apply(): EquConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EquConfig]
    }
    
    extension [Self <: EquConfig](x: Self) {
      
      inline def setArrays(value: reference | shallow): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      inline def setObjects(value: reference | shallow): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait ObjectMap extends StObject {
    
    var materials: StringDictionary[Material]
    
    var nodes: StringDictionary[Object3D[Event]]
  }
  object ObjectMap {
    
    inline def apply(materials: StringDictionary[Material], nodes: StringDictionary[Object3D[Event]]): ObjectMap = {
      val __obj = js.Dynamic.literal(materials = materials.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectMap]
    }
    
    extension [Self <: ObjectMap](x: Self) {
      
      inline def setMaterials(value: StringDictionary[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: StringDictionary[Object3D[Event]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    }
  }
  
  type SetBlock = `false` | js.Promise[Null] | Null
  
  trait UnblockProps extends StObject {
    
    var children: Node
    
    var set: Dispatch[SetStateAction[SetBlock]]
  }
  object UnblockProps {
    
    inline def apply(set: SetStateAction[SetBlock] => Callback): UnblockProps = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction1((t0: SetStateAction[SetBlock]) => set(t0).runNow()), children = null)
      __obj.asInstanceOf[UnblockProps]
    }
    
    extension [Self <: UnblockProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSet(value: SetStateAction[SetBlock] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: SetStateAction[SetBlock]) => value(t0).runNow()))
    }
  }
}
