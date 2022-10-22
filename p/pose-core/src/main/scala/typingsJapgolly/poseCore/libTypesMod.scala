package typingsJapgolly.poseCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.poseCore.poseCoreBooleans.`false`
import typingsJapgolly.poseCore.poseCoreInts.`-1`
import typingsJapgolly.poseCore.poseCoreInts.`1`
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type ActiveActions[A] = Map[String, A]
  
  type ActivePoses = Map[String, js.Array[String]]
  
  type AddTransitionDelay[A] = js.Function2[/* delay */ Double, /* transition */ A, A]
  
  trait AncestorValue[V] extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var values: ValueMap[V]
  }
  object AncestorValue {
    
    inline def apply[V](values: ValueMap[V]): AncestorValue[V] = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[AncestorValue[V]]
    }
    
    extension [Self <: AncestorValue[?], V](x: Self & AncestorValue[V]) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValues(value: ValueMap[V]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type AncestorValueList[V] = js.Array[AncestorValue[V]]
  
  type ApplyMap = StringDictionary[ApplyResolve | String | Double]
  
  type ApplyResolve = js.Function1[/* props */ Props, String | Double]
  
  type BooleanPropFactory = js.Function1[/* props */ Props, Boolean]
  
  type ChildPosers[V, A, C, P] = Set[Poser[V, A, C, P]]
  
  type ConvertTransitionDefinition[V, A, TD] = js.Function3[/* value */ V, /* transitionDef */ TD | A, /* props */ Props, A]
  
  type ConvertValue[V] = js.Function3[/* value */ Any, /* key */ String, /* props */ Props, V]
  
  type CreateValue[V] = js.Function4[
    /* init */ Any, 
    /* key */ String, 
    /* props */ Props, 
    /* createValueProps */ js.UndefOr[CreateValueProps], 
    V
  ]
  
  type CreateValueProps = Any
  
  type ExtendAPI[V, A, C, P] = js.Function3[
    /* api */ Poser[V, A, C, P], 
    /* state */ PoserState[V, A, C, P], 
    /* config */ PoserConfig[V], 
    Poser[V, A, C, P]
  ]
  
  type GetInstantTransition[V, A] = js.Function2[/* value */ V, /* props */ Props, A]
  
  type GetTransitionProps[V] = js.Function3[/* value */ V, /* target */ Double, /* props */ Props, Props]
  
  type NumberPropFactory = js.Function1[/* props */ Props, Double]
  
  type OnChangeCallbacks = StringDictionary[js.Function1[/* v */ Any, Any]]
  
  type PassiveValueMap = StringDictionary[js.Tuple3[String, Any, Boolean | String | Unit]]
  
  trait Pose[A, TD]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var afterChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.undefined
    
    var applyAtEnd: js.UndefOr[ApplyMap] = js.undefined
    
    var applyAtStart: js.UndefOr[ApplyMap] = js.undefined
    
    var beforeChildren: js.UndefOr[Boolean | BooleanPropFactory] = js.undefined
    
    var delay: js.UndefOr[Double | NumberPropFactory] = js.undefined
    
    var delayChildren: js.UndefOr[Double | NumberPropFactory] = js.undefined
    
    var preTransform: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var preTransition: js.UndefOr[js.Function1[/* props */ Props, Any]] = js.undefined
    
    var staggerChildren: js.UndefOr[Double | NumberPropFactory] = js.undefined
    
    var staggerDirection: js.UndefOr[`1` | `-1` | StaggerDirectionPropFactory] = js.undefined
    
    var transition: js.UndefOr[(TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])] = js.undefined
  }
  object Pose {
    
    inline def apply[A, TD](): Pose[A, TD] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pose[A, TD]]
    }
    
    extension [Self <: Pose[?, ?], A, TD](x: Self & (Pose[A, TD])) {
      
      inline def setAfterChildren(value: Boolean | BooleanPropFactory): Self = StObject.set(x, "afterChildren", value.asInstanceOf[js.Any])
      
      inline def setAfterChildrenFunction1(value: /* props */ Props => Boolean): Self = StObject.set(x, "afterChildren", js.Any.fromFunction1(value))
      
      inline def setAfterChildrenUndefined: Self = StObject.set(x, "afterChildren", js.undefined)
      
      inline def setApplyAtEnd(value: ApplyMap): Self = StObject.set(x, "applyAtEnd", value.asInstanceOf[js.Any])
      
      inline def setApplyAtEndUndefined: Self = StObject.set(x, "applyAtEnd", js.undefined)
      
      inline def setApplyAtStart(value: ApplyMap): Self = StObject.set(x, "applyAtStart", value.asInstanceOf[js.Any])
      
      inline def setApplyAtStartUndefined: Self = StObject.set(x, "applyAtStart", js.undefined)
      
      inline def setBeforeChildren(value: Boolean | BooleanPropFactory): Self = StObject.set(x, "beforeChildren", value.asInstanceOf[js.Any])
      
      inline def setBeforeChildrenFunction1(value: /* props */ Props => Boolean): Self = StObject.set(x, "beforeChildren", js.Any.fromFunction1(value))
      
      inline def setBeforeChildrenUndefined: Self = StObject.set(x, "beforeChildren", js.undefined)
      
      inline def setDelay(value: Double | NumberPropFactory): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayChildren(value: Double | NumberPropFactory): Self = StObject.set(x, "delayChildren", value.asInstanceOf[js.Any])
      
      inline def setDelayChildrenFunction1(value: /* props */ Props => Double): Self = StObject.set(x, "delayChildren", js.Any.fromFunction1(value))
      
      inline def setDelayChildrenUndefined: Self = StObject.set(x, "delayChildren", js.undefined)
      
      inline def setDelayFunction1(value: /* props */ Props => Double): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setPreTransform(value: CallbackTo[Any]): Self = StObject.set(x, "preTransform", value.toJsFn)
      
      inline def setPreTransformUndefined: Self = StObject.set(x, "preTransform", js.undefined)
      
      inline def setPreTransition(value: /* props */ Props => Any): Self = StObject.set(x, "preTransition", js.Any.fromFunction1(value))
      
      inline def setPreTransitionUndefined: Self = StObject.set(x, "preTransition", js.undefined)
      
      inline def setStaggerChildren(value: Double | NumberPropFactory): Self = StObject.set(x, "staggerChildren", value.asInstanceOf[js.Any])
      
      inline def setStaggerChildrenFunction1(value: /* props */ Props => Double): Self = StObject.set(x, "staggerChildren", js.Any.fromFunction1(value))
      
      inline def setStaggerChildrenUndefined: Self = StObject.set(x, "staggerChildren", js.undefined)
      
      inline def setStaggerDirection(value: `1` | `-1` | StaggerDirectionPropFactory): Self = StObject.set(x, "staggerDirection", value.asInstanceOf[js.Any])
      
      inline def setStaggerDirectionFunction1(value: /* props */ Props => `1` | `-1`): Self = StObject.set(x, "staggerDirection", js.Any.fromFunction1(value))
      
      inline def setStaggerDirectionUndefined: Self = StObject.set(x, "staggerDirection", js.undefined)
      
      inline def setTransition(value: (TransitionMap[A, TD]) | (TransitionMapFactory[A, TD])): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionFunction1(value: /* props */ Props => TransitionMap[A, TD]): Self = StObject.set(x, "transition", js.Any.fromFunction1(value))
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait PoseFactoryConfig[V, A, C, P, TD] extends StObject {
    
    def addActionDelay(delay: Double, transition: A): A
    @JSName("addActionDelay")
    var addActionDelay_Original: AddTransitionDelay[A]
    
    def bindOnChange(values: ValueMap[V], onChange: OnChangeCallbacks): js.Function1[/* key */ String, Any]
    
    def convertTransitionDefinition(value: V, transitionDef: A | TD, props: Props): A
    @JSName("convertTransitionDefinition")
    var convertTransitionDefinition_Original: ConvertTransitionDefinition[V, A, TD]
    
    def convertValue(value: Any, key: String, props: Props): V
    @JSName("convertValue")
    var convertValue_Original: ConvertValue[V]
    
    def createValue(init: Any, key: String, props: Props): V
    def createValue(init: Any, key: String, props: Props, createValueProps: CreateValueProps): V
    @JSName("createValue")
    var createValue_Original: CreateValue[V]
    
    var defaultTransitions: js.UndefOr[Map[String, TransitionMap[A, TD]]] = js.undefined
    
    def extendAPI(api: Poser[V, A, C, P], state: PoserState[V, A, C, P], config: PoserConfig[V]): Poser[V, A, C, P]
    @JSName("extendAPI")
    var extendAPI_Original: ExtendAPI[V, A, C, P]
    
    var forceRender: js.UndefOr[js.Function1[/* props */ Props, Any]] = js.undefined
    
    var getDefaultProps: js.UndefOr[js.Function1[/* config */ PoserConfig[V], Props]] = js.undefined
    
    def getInstantTransition(value: V, props: Props): A
    @JSName("getInstantTransition")
    var getInstantTransition_Original: GetInstantTransition[V, A]
    
    def getTransitionProps(value: V, target: Double, props: Props): Props
    @JSName("getTransitionProps")
    var getTransitionProps_Original: GetTransitionProps[V]
    
    var posePriority: js.UndefOr[js.Array[String]] = js.undefined
    
    def readValue(value: V): Any
    
    var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.undefined
    
    @JSName("readValue")
    var readValue_Original: ReadValue[V]
    
    def resolveTarget(value: V, target: Any): Any
    @JSName("resolveTarget")
    var resolveTarget_Original: ResolveTarget[V]
    
    def selectValueToRead(value: V): Any
    @JSName("selectValueToRead")
    var selectValueToRead_Original: SelectValueToRead[V]
    
    def setValue(v: V, value: Any): Unit
    
    def setValueNative(key: String, value: Any, props: Props): Unit
    @JSName("setValueNative")
    var setValueNative_Original: SetValueNative
    
    @JSName("setValue")
    var setValue_Original: SetValue[V]
    
    def startAction(value: V, action: A, complete: js.Function0[Any]): C
    @JSName("startAction")
    var startAction_Original: StartAction[V, A, C]
    
    def stopAction(controls: C): Any
    @JSName("stopAction")
    var stopAction_Original: StopAction[C]
    
    var transformPose: js.UndefOr[TransformPose[V, A, C, P, TD]] = js.undefined
  }
  object PoseFactoryConfig {
    
    inline def apply[V, A, C, P, TD](
      addActionDelay: (/* delay */ Double, A) => A,
      bindOnChange: (ValueMap[V], OnChangeCallbacks) => js.Function1[/* key */ String, Any],
      convertTransitionDefinition: (V, /* transitionDef */ TD | A, /* props */ Props) => A,
      convertValue: (/* value */ Any, /* key */ String, /* props */ Props) => V,
      createValue: (/* init */ Any, /* key */ String, /* props */ Props, /* createValueProps */ js.UndefOr[CreateValueProps]) => V,
      extendAPI: (/* api */ Poser[V, A, C, P], /* state */ PoserState[V, A, C, P], /* config */ PoserConfig[V]) => Poser[V, A, C, P],
      getInstantTransition: (V, /* props */ Props) => A,
      getTransitionProps: (V, /* target */ Double, /* props */ Props) => Props,
      readValue: V => Any,
      resolveTarget: (V, /* target */ Any) => Any,
      selectValueToRead: V => Any,
      setValue: (V, /* value */ Any) => Callback,
      setValueNative: (/* key */ String, /* value */ Any, /* props */ Props) => Callback,
      startAction: (V, A, /* complete */ js.Function0[Any]) => C,
      stopAction: C => Any
    ): PoseFactoryConfig[V, A, C, P, TD] = {
      val __obj = js.Dynamic.literal(addActionDelay = js.Any.fromFunction2(addActionDelay), bindOnChange = js.Any.fromFunction2(bindOnChange), convertTransitionDefinition = js.Any.fromFunction3(convertTransitionDefinition), convertValue = js.Any.fromFunction3(convertValue), createValue = js.Any.fromFunction4(createValue), extendAPI = js.Any.fromFunction3(extendAPI), getInstantTransition = js.Any.fromFunction2(getInstantTransition), getTransitionProps = js.Any.fromFunction3(getTransitionProps), readValue = js.Any.fromFunction1(readValue), resolveTarget = js.Any.fromFunction2(resolveTarget), selectValueToRead = js.Any.fromFunction1(selectValueToRead), setValue = js.Any.fromFunction2((t0: V, t1: /* value */ Any) => (setValue(t0, t1)).runNow()), setValueNative = js.Any.fromFunction3((t0: /* key */ String, t1: /* value */ Any, t2: /* props */ Props) => (setValueNative(t0, t1, t2)).runNow()), startAction = js.Any.fromFunction3(startAction), stopAction = js.Any.fromFunction1(stopAction))
      __obj.asInstanceOf[PoseFactoryConfig[V, A, C, P, TD]]
    }
    
    extension [Self <: PoseFactoryConfig[?, ?, ?, ?, ?], V, A, C, P, TD](x: Self & (PoseFactoryConfig[V, A, C, P, TD])) {
      
      inline def setAddActionDelay(value: (/* delay */ Double, A) => A): Self = StObject.set(x, "addActionDelay", js.Any.fromFunction2(value))
      
      inline def setBindOnChange(value: (ValueMap[V], OnChangeCallbacks) => js.Function1[/* key */ String, Any]): Self = StObject.set(x, "bindOnChange", js.Any.fromFunction2(value))
      
      inline def setConvertTransitionDefinition(value: (V, /* transitionDef */ TD | A, /* props */ Props) => A): Self = StObject.set(x, "convertTransitionDefinition", js.Any.fromFunction3(value))
      
      inline def setConvertValue(value: (/* value */ Any, /* key */ String, /* props */ Props) => V): Self = StObject.set(x, "convertValue", js.Any.fromFunction3(value))
      
      inline def setCreateValue(
        value: (/* init */ Any, /* key */ String, /* props */ Props, /* createValueProps */ js.UndefOr[CreateValueProps]) => V
      ): Self = StObject.set(x, "createValue", js.Any.fromFunction4(value))
      
      inline def setDefaultTransitions(value: Map[String, TransitionMap[A, TD]]): Self = StObject.set(x, "defaultTransitions", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransitionsUndefined: Self = StObject.set(x, "defaultTransitions", js.undefined)
      
      inline def setExtendAPI(
        value: (/* api */ Poser[V, A, C, P], /* state */ PoserState[V, A, C, P], /* config */ PoserConfig[V]) => Poser[V, A, C, P]
      ): Self = StObject.set(x, "extendAPI", js.Any.fromFunction3(value))
      
      inline def setForceRender(value: /* props */ Props => Any): Self = StObject.set(x, "forceRender", js.Any.fromFunction1(value))
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetDefaultProps(value: /* config */ PoserConfig[V] => Props): Self = StObject.set(x, "getDefaultProps", js.Any.fromFunction1(value))
      
      inline def setGetDefaultPropsUndefined: Self = StObject.set(x, "getDefaultProps", js.undefined)
      
      inline def setGetInstantTransition(value: (V, /* props */ Props) => A): Self = StObject.set(x, "getInstantTransition", js.Any.fromFunction2(value))
      
      inline def setGetTransitionProps(value: (V, /* target */ Double, /* props */ Props) => Props): Self = StObject.set(x, "getTransitionProps", js.Any.fromFunction3(value))
      
      inline def setPosePriority(value: js.Array[String]): Self = StObject.set(x, "posePriority", value.asInstanceOf[js.Any])
      
      inline def setPosePriorityUndefined: Self = StObject.set(x, "posePriority", js.undefined)
      
      inline def setPosePriorityVarargs(value: String*): Self = StObject.set(x, "posePriority", js.Array(value*))
      
      inline def setReadValue(value: V => Any): Self = StObject.set(x, "readValue", js.Any.fromFunction1(value))
      
      inline def setReadValueFromSource(value: (/* key */ String, /* props */ Props) => Any): Self = StObject.set(x, "readValueFromSource", js.Any.fromFunction2(value))
      
      inline def setReadValueFromSourceUndefined: Self = StObject.set(x, "readValueFromSource", js.undefined)
      
      inline def setResolveTarget(value: (V, /* target */ Any) => Any): Self = StObject.set(x, "resolveTarget", js.Any.fromFunction2(value))
      
      inline def setSelectValueToRead(value: V => Any): Self = StObject.set(x, "selectValueToRead", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: (V, /* value */ Any) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: V, t1: /* value */ Any) => (value(t0, t1)).runNow()))
      
      inline def setSetValueNative(value: (/* key */ String, /* value */ Any, /* props */ Props) => Callback): Self = StObject.set(x, "setValueNative", js.Any.fromFunction3((t0: /* key */ String, t1: /* value */ Any, t2: /* props */ Props) => (value(t0, t1, t2)).runNow()))
      
      inline def setStartAction(value: (V, A, /* complete */ js.Function0[Any]) => C): Self = StObject.set(x, "startAction", js.Any.fromFunction3(value))
      
      inline def setStopAction(value: C => Any): Self = StObject.set(x, "stopAction", js.Any.fromFunction1(value))
      
      inline def setTransformPose(
        value: (/* pose */ Pose[A, TD], /* key */ String, /* state */ PoserState[V, A, C, P]) => Pose[A, TD]
      ): Self = StObject.set(x, "transformPose", js.Any.fromFunction3(value))
      
      inline def setTransformPoseUndefined: Self = StObject.set(x, "transformPose", js.undefined)
    }
  }
  
  type PoseMap[A, TD] = StringDictionary[Pose[A, TD]]
  
  @js.native
  trait Poser[V, A, C, P] extends StObject {
    
    def _addChild(config: PoserConfig[V], factory: PoserFactory[V, A, C, P]): Poser[V, A, C, P] = js.native
    
    def clearChildren(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def get(): Any = js.native
    def get(key: String): Any = js.native
    
    def has(key: String): Boolean = js.native
    
    def removeChild(child: Poser[V, A, C, P]): Unit = js.native
    
    def set(next: String): js.Promise[Any] = js.native
    def set(next: String, props: Props): js.Promise[Any] = js.native
    
    def setProps(props: Props): Unit = js.native
    
    def unset(toUnset: String): js.Promise[Any] = js.native
    def unset(toUnset: String, props: Props): js.Promise[Any] = js.native
  }
  
  trait PoserConfig[V]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var ancestorValues: js.UndefOr[AncestorValueList[V]] = js.undefined
    
    var initialPose: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[OnChangeCallbacks] = js.undefined
    
    var parentValues: js.UndefOr[ValueMap[V]] = js.undefined
    
    var passive: js.UndefOr[PassiveValueMap] = js.undefined
    
    var props: js.UndefOr[Props] = js.undefined
    
    var values: js.UndefOr[StringDictionary[V]] = js.undefined
  }
  object PoserConfig {
    
    inline def apply[V](): PoserConfig[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoserConfig[V]]
    }
    
    extension [Self <: PoserConfig[?], V](x: Self & PoserConfig[V]) {
      
      inline def setAncestorValues(value: AncestorValueList[V]): Self = StObject.set(x, "ancestorValues", value.asInstanceOf[js.Any])
      
      inline def setAncestorValuesUndefined: Self = StObject.set(x, "ancestorValues", js.undefined)
      
      inline def setAncestorValuesVarargs(value: AncestorValue[V]*): Self = StObject.set(x, "ancestorValues", js.Array(value*))
      
      inline def setInitialPose(value: String | js.Array[String]): Self = StObject.set(x, "initialPose", value.asInstanceOf[js.Any])
      
      inline def setInitialPoseUndefined: Self = StObject.set(x, "initialPose", js.undefined)
      
      inline def setInitialPoseVarargs(value: String*): Self = StObject.set(x, "initialPose", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(value: OnChangeCallbacks): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setParentValues(value: ValueMap[V]): Self = StObject.set(x, "parentValues", value.asInstanceOf[js.Any])
      
      inline def setParentValuesUndefined: Self = StObject.set(x, "parentValues", js.undefined)
      
      inline def setPassive(value: PassiveValueMap): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setValues(value: StringDictionary[V]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type PoserFactory[V, A, C, P] = js.Function1[/* config */ PoserConfig[V], Poser[V, A, C, P]]
  
  trait PoserState[V, A, C, P] extends StObject {
    
    var activeActions: ActiveActions[C]
    
    var activePoses: ActivePoses
    
    var children: ChildPosers[V, A, C, P]
    
    var props: Props
    
    var values: ValueMap[V]
  }
  object PoserState {
    
    inline def apply[V, A, C, P](
      activeActions: ActiveActions[C],
      activePoses: ActivePoses,
      children: ChildPosers[V, A, C, P],
      props: Props,
      values: ValueMap[V]
    ): PoserState[V, A, C, P] = {
      val __obj = js.Dynamic.literal(activeActions = activeActions.asInstanceOf[js.Any], activePoses = activePoses.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoserState[V, A, C, P]]
    }
    
    extension [Self <: PoserState[?, ?, ?, ?], V, A, C, P](x: Self & (PoserState[V, A, C, P])) {
      
      inline def setActiveActions(value: ActiveActions[C]): Self = StObject.set(x, "activeActions", value.asInstanceOf[js.Any])
      
      inline def setActivePoses(value: ActivePoses): Self = StObject.set(x, "activePoses", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ChildPosers[V, A, C, P]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setValues(value: ValueMap[V]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type Props = StringDictionary[Any]
  
  type ReadValue[V] = js.Function1[/* value */ V, Any]
  
  type ReadValueFromSource = js.Function2[/* key */ String, /* props */ Props, Any]
  
  type ResolveTarget[V] = js.Function2[/* value */ V, /* target */ Any, Any]
  
  type SelectValueToRead[V] = js.Function1[/* value */ V, Any]
  
  type SetValue[V] = js.Function2[/* v */ V, /* value */ Any, Unit]
  
  type SetValueNative = js.Function3[/* key */ String, /* value */ Any, /* props */ Props, Unit]
  
  type StaggerDirectionPropFactory = js.Function1[/* props */ Props, `1` | `-1`]
  
  type StartAction[V, A, C] = js.Function3[/* value */ V, /* action */ A, /* complete */ js.Function0[Any], C]
  
  type StopAction[C] = js.Function1[/* controls */ C, Any]
  
  type TransformPose[V, A, C, P, TD] = js.Function3[
    /* pose */ Pose[A, TD], 
    /* key */ String, 
    /* state */ PoserState[V, A, C, P], 
    Pose[A, TD]
  ]
  
  type Transformer = js.Function1[/* v */ Any, Any]
  
  type TransitionFactory[A, TD] = js.Function1[/* props */ Props, TD | A | `false`]
  
  type TransitionMap[A, TD] = StringDictionary[TD | A | `false` | (TransitionFactory[A, TD])]
  
  type TransitionMapFactory[A, TD] = js.Function1[/* props */ Props, TransitionMap[A, TD]]
  
  type ValueMap[V] = Map[String, V]
}
