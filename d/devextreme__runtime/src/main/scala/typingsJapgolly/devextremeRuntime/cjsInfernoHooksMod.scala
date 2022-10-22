package typingsJapgolly.devextremeRuntime

import typingsJapgolly.devextremeRuntime.anon.ComponentDidMount
import typingsJapgolly.devextremeRuntime.anon.Context
import typingsJapgolly.devextremeRuntime.anon.DefaultValue
import typingsJapgolly.devextremeRuntime.anon.DefaultValueId
import typingsJapgolly.devextremeRuntime.anon.ForwardRefanyanydefaultPr
import typingsJapgolly.devextremeRuntime.anon.FunctiondefaultPropsunkno
import typingsJapgolly.devextremeRuntime.anon.IComponentanyanydefaultPr
import typingsJapgolly.devextremeRuntime.anon.RenderFn
import typingsJapgolly.devextremeRuntime.cjsInfernoHooksContainerMod.RefObject
import typingsJapgolly.devextremeRuntime.cjsInfernoHooksHooksMod.Dispatch
import typingsJapgolly.devextremeRuntime.cjsInfernoHooksHooksMod.SetStateAction
import typingsJapgolly.devextremeRuntime.cjsInfernoHooksPortalMod.PortalProps
import typingsJapgolly.inferno.distCoreTypesMod.ForwardRef
import typingsJapgolly.inferno.distCoreTypesMod.IComponent
import typingsJapgolly.inferno.distCoreTypesMod.Props
import typingsJapgolly.inferno.distCoreTypesMod.VNode
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsInfernoHooksMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@devextreme/runtime/cjs/inferno-hooks", "HookContainer")
  @js.native
  open class HookContainer ()
    extends typingsJapgolly.devextremeRuntime.cjsInfernoHooksContainerMod.HookContainer {
    def this(props: RenderFn) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: RenderFn, context: Any) = this()
  }
  
  @JSImport("@devextreme/runtime/cjs/inferno-hooks", "InfernoWrapperComponent")
  @js.native
  open class InfernoWrapperComponent ()
    extends typingsJapgolly.devextremeRuntime.cjsInfernoHooksBaseHooksComponentMod.InfernoWrapperComponent {
    def this(props: RenderFn) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: RenderFn, context: Any) = this()
  }
  
  inline def Portal(hasContainerChildren: PortalProps): VNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(hasContainerChildren.asInstanceOf[js.Any]).asInstanceOf[VNode | Null]
  
  inline def collectChildren(): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__collectChildren")().asInstanceOf[Record[String, Any]]
  
  inline def createContext[T](defaultValue: T): DefaultValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[DefaultValue]
  
  inline def createRecorder(component: typingsJapgolly.devextremeRuntime.cjsInfernoHooksContainerMod.HookContainer): ComponentDidMount = ^.asInstanceOf[js.Dynamic].applyDynamic("createRecorder")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentDidMount]
  
  object currentComponent {
    
    @JSImport("@devextreme/runtime/cjs/inferno-hooks", "currentComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devextreme/runtime/cjs/inferno-hooks", "currentComponent.current")
    @js.native
    def current: Context = js.native
    inline def current_=(x: Context): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  }
  
  inline def equalByValue(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")().asInstanceOf[Boolean]
  
  inline def forwardRef[T, P](
    render: js.Function2[
      /* props */ T, 
      /* ref */ RefObject[P], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InfernoElement<T> */ Any
    ]
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFC<T> */ Any) & (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFC<T> */ Any) & (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ])]
  
  inline def getTemplate(TemplateProp: ForwardRefanyanydefaultPr): js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(TemplateProp.asInstanceOf[js.Any]).asInstanceOf[js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode])]
  inline def getTemplate(TemplateProp: FunctiondefaultPropsunkno): js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(TemplateProp.asInstanceOf[js.Any]).asInstanceOf[js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode])]
  inline def getTemplate(TemplateProp: IComponentanyanydefaultPr): js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(TemplateProp.asInstanceOf[js.Any]).asInstanceOf[js.Function | (ForwardRef[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]) | (IComponent[Any, Any]) | (js.Function1[/* props */ js.UndefOr[Props[Any] | Null], VNode])]
  
  inline def renderChild(
    component: typingsJapgolly.devextremeRuntime.cjsInfernoHooksContainerMod.HookContainer,
    hasRenderFnRenderPropsRenderRef: Any,
    context: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderChild")(component.asInstanceOf[js.Any], hasRenderFnRenderPropsRenderRef.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useCallback[T /* <: js.Function1[/* repeated */ scala.Nothing, Any] */](fn: T, dependencies: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(fn.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useContext(consumer: DefaultValueId): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(consumer.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useEffect(fn: js.Function0[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def useEffect(fn: js.Function0[Any], dependencies: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(fn.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useImperativeHandle(ref: Any, init: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def useImperativeHandle(ref: Any, init: js.Function0[Any], dependencies: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useMemo[T](fn: js.Function0[T], dependencies: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(fn.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useReRenderEffect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useReRenderEffect")().asInstanceOf[Unit]
  
  inline def useRef[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[Any]
  inline def useRef[T](initialValue: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
}
