package typingsJapgolly.poseCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.poseCore.libTypesMod.AddTransitionDelay
import typingsJapgolly.poseCore.libTypesMod.ConvertTransitionDefinition
import typingsJapgolly.poseCore.libTypesMod.GetInstantTransition
import typingsJapgolly.poseCore.libTypesMod.GetTransitionProps
import typingsJapgolly.poseCore.libTypesMod.Pose
import typingsJapgolly.poseCore.libTypesMod.PoseMap
import typingsJapgolly.poseCore.libTypesMod.PoserState
import typingsJapgolly.poseCore.libTypesMod.Props
import typingsJapgolly.poseCore.libTypesMod.ResolveTarget
import typingsJapgolly.poseCore.libTypesMod.SetValue
import typingsJapgolly.poseCore.libTypesMod.SetValueNative
import typingsJapgolly.poseCore.libTypesMod.StartAction
import typingsJapgolly.poseCore.libTypesMod.StopAction
import typingsJapgolly.poseCore.libTypesMod.TransformPose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoriesSetterMod {
  
  @JSImport("pose-core/lib/factories/setter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V, A, C, P, TD](setterProps: SetterFactoryProps[V, A, C, P, TD]): js.Function3[
    /* next */ String, 
    /* nextProps */ js.UndefOr[Props], 
    /* propagate */ js.UndefOr[Boolean], 
    js.Promise[js.Array[Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(setterProps.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* next */ String, 
    /* nextProps */ js.UndefOr[Props], 
    /* propagate */ js.UndefOr[Boolean], 
    js.Promise[js.Array[Any]]
  ]]
  
  inline def resolveProp(target: Any, props: Props): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProp")(target.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait SetterFactoryProps[V, A, C, P, TD] extends StObject {
    
    def addActionDelay(delay: Double, transition: A): A
    @JSName("addActionDelay")
    var addActionDelay_Original: AddTransitionDelay[A]
    
    def convertTransitionDefinition(value: V, transitionDef: A | TD, props: Props): A
    @JSName("convertTransitionDefinition")
    var convertTransitionDefinition_Original: ConvertTransitionDefinition[V, A, TD]
    
    var forceRender: js.UndefOr[js.Function1[/* props */ Props, Any]] = js.undefined
    
    def getInstantTransition(value: V, props: Props): A
    @JSName("getInstantTransition")
    var getInstantTransition_Original: GetInstantTransition[V, A]
    
    def getTransitionProps(value: V, target: Double, props: Props): Props
    @JSName("getTransitionProps")
    var getTransitionProps_Original: GetTransitionProps[V]
    
    var posePriority: js.UndefOr[js.Array[String]] = js.undefined
    
    var poses: PoseMap[A, TD]
    
    def resolveTarget(value: V, target: Any): Any
    @JSName("resolveTarget")
    var resolveTarget_Original: ResolveTarget[V]
    
    def setValue(v: V, value: Any): Unit
    
    def setValueNative(key: String, value: Any, props: Props): Unit
    @JSName("setValueNative")
    var setValueNative_Original: SetValueNative
    
    @JSName("setValue")
    var setValue_Original: SetValue[V]
    
    def startAction(value: V, action: A, complete: js.Function0[Any]): C
    @JSName("startAction")
    var startAction_Original: StartAction[V, A, C]
    
    var state: PoserState[V, A, C, P]
    
    def stopAction(controls: C): Any
    @JSName("stopAction")
    var stopAction_Original: StopAction[C]
    
    var transformPose: js.UndefOr[TransformPose[V, A, C, P, TD]] = js.undefined
  }
  object SetterFactoryProps {
    
    inline def apply[V, A, C, P, TD](
      addActionDelay: (/* delay */ Double, A) => A,
      convertTransitionDefinition: (V, /* transitionDef */ TD | A, /* props */ Props) => A,
      getInstantTransition: (V, /* props */ Props) => A,
      getTransitionProps: (V, /* target */ Double, /* props */ Props) => Props,
      poses: PoseMap[A, TD],
      resolveTarget: (V, /* target */ Any) => Any,
      setValue: (V, /* value */ Any) => Callback,
      setValueNative: (/* key */ String, /* value */ Any, /* props */ Props) => Callback,
      startAction: (V, A, /* complete */ js.Function0[Any]) => C,
      state: PoserState[V, A, C, P],
      stopAction: C => Any
    ): SetterFactoryProps[V, A, C, P, TD] = {
      val __obj = js.Dynamic.literal(addActionDelay = js.Any.fromFunction2(addActionDelay), convertTransitionDefinition = js.Any.fromFunction3(convertTransitionDefinition), getInstantTransition = js.Any.fromFunction2(getInstantTransition), getTransitionProps = js.Any.fromFunction3(getTransitionProps), poses = poses.asInstanceOf[js.Any], resolveTarget = js.Any.fromFunction2(resolveTarget), setValue = js.Any.fromFunction2((t0: V, t1: /* value */ Any) => (setValue(t0, t1)).runNow()), setValueNative = js.Any.fromFunction3((t0: /* key */ String, t1: /* value */ Any, t2: /* props */ Props) => (setValueNative(t0, t1, t2)).runNow()), startAction = js.Any.fromFunction3(startAction), state = state.asInstanceOf[js.Any], stopAction = js.Any.fromFunction1(stopAction))
      __obj.asInstanceOf[SetterFactoryProps[V, A, C, P, TD]]
    }
    
    extension [Self <: SetterFactoryProps[?, ?, ?, ?, ?], V, A, C, P, TD](x: Self & (SetterFactoryProps[V, A, C, P, TD])) {
      
      inline def setAddActionDelay(value: (/* delay */ Double, A) => A): Self = StObject.set(x, "addActionDelay", js.Any.fromFunction2(value))
      
      inline def setConvertTransitionDefinition(value: (V, /* transitionDef */ TD | A, /* props */ Props) => A): Self = StObject.set(x, "convertTransitionDefinition", js.Any.fromFunction3(value))
      
      inline def setForceRender(value: /* props */ Props => Any): Self = StObject.set(x, "forceRender", js.Any.fromFunction1(value))
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetInstantTransition(value: (V, /* props */ Props) => A): Self = StObject.set(x, "getInstantTransition", js.Any.fromFunction2(value))
      
      inline def setGetTransitionProps(value: (V, /* target */ Double, /* props */ Props) => Props): Self = StObject.set(x, "getTransitionProps", js.Any.fromFunction3(value))
      
      inline def setPosePriority(value: js.Array[String]): Self = StObject.set(x, "posePriority", value.asInstanceOf[js.Any])
      
      inline def setPosePriorityUndefined: Self = StObject.set(x, "posePriority", js.undefined)
      
      inline def setPosePriorityVarargs(value: String*): Self = StObject.set(x, "posePriority", js.Array(value*))
      
      inline def setPoses(value: PoseMap[A, TD]): Self = StObject.set(x, "poses", value.asInstanceOf[js.Any])
      
      inline def setResolveTarget(value: (V, /* target */ Any) => Any): Self = StObject.set(x, "resolveTarget", js.Any.fromFunction2(value))
      
      inline def setSetValue(value: (V, /* value */ Any) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: V, t1: /* value */ Any) => (value(t0, t1)).runNow()))
      
      inline def setSetValueNative(value: (/* key */ String, /* value */ Any, /* props */ Props) => Callback): Self = StObject.set(x, "setValueNative", js.Any.fromFunction3((t0: /* key */ String, t1: /* value */ Any, t2: /* props */ Props) => (value(t0, t1, t2)).runNow()))
      
      inline def setStartAction(value: (V, A, /* complete */ js.Function0[Any]) => C): Self = StObject.set(x, "startAction", js.Any.fromFunction3(value))
      
      inline def setState(value: PoserState[V, A, C, P]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStopAction(value: C => Any): Self = StObject.set(x, "stopAction", js.Any.fromFunction1(value))
      
      inline def setTransformPose(
        value: (/* pose */ Pose[A, TD], /* key */ String, /* state */ PoserState[V, A, C, P]) => Pose[A, TD]
      ): Self = StObject.set(x, "transformPose", js.Any.fromFunction3(value))
      
      inline def setTransformPoseUndefined: Self = StObject.set(x, "transformPose", js.undefined)
    }
  }
}
