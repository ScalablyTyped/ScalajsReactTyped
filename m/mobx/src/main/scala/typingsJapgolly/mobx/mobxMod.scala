package typingsJapgolly.mobx

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mobx.libApiActionMod.IActionFactory
import typingsJapgolly.mobx.libApiAutorunMod.IAutorunOptions
import typingsJapgolly.mobx.libApiAutorunMod.IReactionOptions
import typingsJapgolly.mobx.libApiComputedMod.IComputed
import typingsJapgolly.mobx.libApiExtrasMod.IDependencyTree
import typingsJapgolly.mobx.libApiExtrasMod.IObserverTree
import typingsJapgolly.mobx.libApiFlowMod.CancellablePromise
import typingsJapgolly.mobx.libApiInterceptDashReadMod.ReadInterceptor
import typingsJapgolly.mobx.libApiObservableMod.CreateObservableOptions
import typingsJapgolly.mobx.libApiObservableMod.IObservableFactories
import typingsJapgolly.mobx.libApiObservableMod.IObservableFactory
import typingsJapgolly.mobx.libApiTojsMod.ToJSOptions
import typingsJapgolly.mobx.libApiWhenMod.IWhenOptions
import typingsJapgolly.mobx.libCoreActionMod.IActionRunInfo
import typingsJapgolly.mobx.libCoreAtomMod.IAtom
import typingsJapgolly.mobx.libCoreComputedvalueMod.IComputedValue
import typingsJapgolly.mobx.libCoreDerivationMod.IDerivation
import typingsJapgolly.mobx.libCoreObservableMod.IDepTreeNode
import typingsJapgolly.mobx.libCoreObservableMod.IObservable
import typingsJapgolly.mobx.libCoreReactionMod.IReactionDisposer
import typingsJapgolly.mobx.libCoreReactionMod.IReactionPublic
import typingsJapgolly.mobx.libTypesInterceptDashUtilsMod.IInterceptor
import typingsJapgolly.mobx.libTypesModifiersMod.IEnhancer
import typingsJapgolly.mobx.libTypesObservablearrayMod.IArrayChange
import typingsJapgolly.mobx.libTypesObservablearrayMod.IArraySplice
import typingsJapgolly.mobx.libTypesObservablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.libTypesObservablearrayMod.IArrayWillSplice
import typingsJapgolly.mobx.libTypesObservablearrayMod.IObservableArray
import typingsJapgolly.mobx.libTypesObservablemapMod.IMapDidChange
import typingsJapgolly.mobx.libTypesObservablemapMod.IMapWillChange
import typingsJapgolly.mobx.libTypesObservablemapMod.IObservableMapInitialValues
import typingsJapgolly.mobx.libTypesObservableobjectMod.IObjectDidChange
import typingsJapgolly.mobx.libTypesObservableobjectMod.IObjectWillChange
import typingsJapgolly.mobx.libTypesObservablesetMod.IObservableSetInitialValues
import typingsJapgolly.mobx.libTypesObservablesetMod.ISetDidChange
import typingsJapgolly.mobx.libTypesObservablesetMod.ISetWillChange
import typingsJapgolly.mobx.libTypesObservablevalueMod.IObservableValue
import typingsJapgolly.mobx.libTypesObservablevalueMod.IValueDidChange
import typingsJapgolly.mobx.libTypesObservablevalueMod.IValueWillChange
import typingsJapgolly.mobx.libUtilsUtilsMod.Lambda
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.Generator
import typingsJapgolly.std.IArguments
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", JSImport.Namespace)
@js.native
object mobxMod extends js.Object {
  @js.native
  class FlowCancellationError ()
    extends typingsJapgolly.mobx.libInternalMod.FlowCancellationError
  
  @js.native
  class ObservableMap[K, V] ()
    extends typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V] {
    def this(initialData: IObservableMapInitialValues[K, V]) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V]) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V], name: String) = this()
  }
  
  @js.native
  class ObservableSet[T] ()
    extends typingsJapgolly.mobx.libInternalMod.ObservableSet[T] {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name: String) = this()
  }
  
  @js.native
  class Reaction protected ()
    extends typingsJapgolly.mobx.libInternalMod.Reaction {
    def this(name: String, onInvalidate: js.Function0[Unit]) = this()
    def this(
      name: String,
      onInvalidate: js.Function0[Unit],
      errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]
    ) = this()
    def this(
      name: String,
      onInvalidate: js.Function0[Unit],
      errorHandler: js.UndefOr[scala.Nothing],
      requiresObservable: Boolean
    ) = this()
    def this(
      name: String,
      onInvalidate: js.Function0[Unit],
      errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit],
      requiresObservable: Boolean
    ) = this()
  }
  
  @JSName("$mobx")
  val $mobx: js.Symbol = js.native
  val action: IActionFactory = js.native
  val computed: IComputed = js.native
  val observable: IObservableFactory with IObservableFactories with Anon_Enhancer = js.native
  def _allowStateChanges[T](allowStateChanges: Boolean, func: js.Function0[T]): T = js.native
  def _allowStateChangesInsideComputed[T](func: js.Function0[T]): T = js.native
  def _endAction(runInfo: IActionRunInfo): Unit = js.native
  def _getAdministration(thing: js.Any): js.Any = js.native
  def _getAdministration(thing: js.Any, property: String): js.Any = js.native
  def _getGlobalState(): js.Any = js.native
  def _interceptReads(`object`: js.Object, property: String, handler: ReadInterceptor[_]): Lambda = js.native
  def _interceptReads[T](observableArray: IObservableArray[T], handler: ReadInterceptor[T]): Lambda = js.native
  def _interceptReads[V](observableSet: typingsJapgolly.mobx.libInternalMod.ObservableSet[V], handler: ReadInterceptor[V]): Lambda = js.native
  def _interceptReads[T](value: IObservableValue[T], handler: ReadInterceptor[T]): Lambda = js.native
  def _interceptReads[K, V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V],
    handler: ReadInterceptor[V]
  ): Lambda = js.native
  def _isComputingDerivation(): Boolean = js.native
  def _resetGlobalState(): Unit = js.native
  def _startAction(actionName: String, scope: js.Any): IActionRunInfo = js.native
  def _startAction(actionName: String, scope: js.Any, args: IArguments): IActionRunInfo = js.native
  def autorun(view: js.Function1[/* r */ IReactionPublic, _]): IReactionDisposer = js.native
  def autorun(view: js.Function1[/* r */ IReactionPublic, _], opts: IAutorunOptions): IReactionDisposer = js.native
  def configure(options: Anon_Always): Unit = js.native
  def createAtom(name: String): IAtom = js.native
  def createAtom(name: String, onBecomeObservedHandler: js.Function0[Unit]): IAtom = js.native
  def createAtom(
    name: String,
    onBecomeObservedHandler: js.Function0[Unit],
    onBecomeUnobservedHandler: js.Function0[Unit]
  ): IAtom = js.native
  def decorate[T](
    clazz: Instantiable1[/* args (repeated) */ js.Any, T],
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typingsJapgolly.mobx.mobxStrings.decorate with js.Any
  ): Unit = js.native
  def decorate[T](
    `object`: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? std.MethodDecorator | std.PropertyDecorator | std.Array<std.MethodDecorator> | std.Array<std.PropertyDecorator>}
    */ typingsJapgolly.mobx.mobxStrings.decorate with js.Any
  ): T = js.native
  def entries[T](ar: IObservableArray[T]): js.Array[js.Tuple2[Double, T]] = js.native
  def entries[T](obj: T): js.Array[
    js.Tuple2[
      String, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def entries[T](set: typingsJapgolly.mobx.libInternalMod.ObservableSet[T]): js.Array[js.Tuple2[T, T]] = js.native
  def entries[K, T](map: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, T]): js.Array[js.Tuple2[K, T]] = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typingsJapgolly.mobx.mobxStrings.extendObservable with js.Any
  ): A with B = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](
    target: A,
    properties: B,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof B ]:? std.Function}
    */ typingsJapgolly.mobx.mobxStrings.extendObservable with js.Any,
    options: CreateObservableOptions
  ): A with B = js.native
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, (Generator[_, R, _]) | (AsyncGenerator[_, R, _])]): js.Function1[/* args */ Args, CancellablePromise[R]] = js.native
  def get[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def get[T](obj: IObservableArray[T], index: Double): js.UndefOr[T] = js.native
  def get[K, V](obj: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V], key: K): js.UndefOr[V] = js.native
  def getAtom(thing: js.Any): IDepTreeNode = js.native
  def getAtom(thing: js.Any, property: String): IDepTreeNode = js.native
  def getDebugName(thing: js.Any): String = js.native
  def getDebugName(thing: js.Any, property: String): String = js.native
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  def has[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  def has[K](obj: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, _], key: K): Boolean = js.native
  def has[T](obj: typingsJapgolly.mobx.libInternalMod.ObservableSet[T], key: T): Boolean = js.native
  def has[T](obj: IObservableArray[T], index: Double): Boolean = js.native
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  def intercept[V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableSet[V],
    handler: IInterceptor[ISetWillChange[V]]
  ): Lambda = js.native
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def intercept[T /* <: js.Object */, K /* <: String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  def intercept[K, V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V],
    handler: IInterceptor[IMapWillChange[K, V]]
  ): Lambda = js.native
  def intercept[K, V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V],
    property: K,
    handler: IInterceptor[IValueWillChange[V]]
  ): Lambda = js.native
  def isAction(thing: js.Any): Boolean = js.native
  def isArrayLike(x: js.Any): Boolean = js.native
  def isBoxedObservable(x: js.Any): /* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean = js.native
  def isComputed(value: js.Any): Boolean = js.native
  def isComputedProp(value: js.Any, propName: String): Boolean = js.native
  def isFlowCancellationError(error: js.Error): Boolean = js.native
  def isObservable(value: js.Any): Boolean = js.native
  def isObservableArray(thing: js.Any): /* is mobx.mobx/lib/types/observablearray.IObservableArray<any> */ Boolean = js.native
  def isObservableMap(thing: js.Any): /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean = js.native
  def isObservableObject(thing: js.Any): /* is mobx.mobx/lib/types/observableobject.IObservableObject */ Boolean = js.native
  def isObservableProp(value: js.Any, propName: String): Boolean = js.native
  def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = js.native
  def keys[T](ar: IObservableArray[T]): js.Array[Double] = js.native
  def keys[K](map: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, _]): js.Array[K] = js.native
  def keys[T /* <: js.Object */](obj: T): js.Array[PropertyKey] = js.native
  def keys[T](set: typingsJapgolly.mobx.libInternalMod.ObservableSet[T]): js.Array[T] = js.native
  def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange, Unit]): Lambda = js.native
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange, Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit]
  ): Lambda = js.native
  def observe[V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def observe[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def observe[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[T, K /* <: String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Lambda = js.native
  def observe[T, K /* <: String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[K, V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]
  ): Lambda = js.native
  def observe[K, V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def observe[K, V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = js.native
  def observe[K, V](
    observableMap: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def onBecomeObserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: typingsJapgolly.mobx.libInternalMod.ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: typingsJapgolly.mobx.libInternalMod.ObservableSet[_], listener: Lambda): Lambda = js.native
  def onBecomeObserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def onBecomeObserved[K, V](value: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: typingsJapgolly.mobx.libInternalMod.ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: typingsJapgolly.mobx.libInternalMod.ObservableSet[_], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def onBecomeUnobserved[K, V](value: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  def onReactionError(handler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]): Lambda = js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = js.native
  def reaction[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = js.native
  def remove[T /* <: js.Object */](obj: T, key: String): js.Any = js.native
  def remove[T](obj: typingsJapgolly.mobx.libInternalMod.ObservableSet[T], key: T): js.Any = js.native
  def remove[T](obj: IObservableArray[T], index: Double): js.Any = js.native
  def remove[K, V](obj: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V], key: K): js.Any = js.native
  def runInAction[T](block: js.Function0[T]): T = js.native
  def runInAction[T](name: String, block: js.Function0[T]): T = js.native
  def set[T /* <: js.Object */](obj: T, key: PropertyKey, value: js.Any): js.Any = js.native
  def set[T /* <: js.Object */](obj: T, values: StringDictionary[js.Any]): js.Any = js.native
  def set[V](
    obj: typingsJapgolly.mobx.libInternalMod.ObservableMap[PropertyKey, V],
    values: StringDictionary[V]
  ): js.Any = js.native
  def set[T](obj: typingsJapgolly.mobx.libInternalMod.ObservableSet[T], value: T): js.Any = js.native
  def set[T](obj: IObservableArray[T], index: Double, value: T): js.Any = js.native
  def set[K, V](obj: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, V], key: K, value: V): js.Any = js.native
  def spy(listener: js.Function1[/* change */ js.Any, Unit]): Lambda = js.native
  def toJS(source: js.Any): js.Any = js.native
  def toJS(source: js.Any, options: ToJSOptions): js.Any = js.native
  def toJS[T](source: T): T = js.native
  def toJS[T](source: T, options: ToJSOptions): T = js.native
  def trace(): Unit = js.native
  def trace(enterBreakPoint: Boolean): Unit = js.native
  def trace(thing: js.Any): Unit = js.native
  def trace(thing: js.Any, enterBreakPoint: Boolean): Unit = js.native
  def trace(thing: js.Any, prop: String): Unit = js.native
  def trace(thing: js.Any, prop: String, enterBreakPoint: Boolean): Unit = js.native
  def transaction[T](action: js.Function0[T]): T = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  def values[T](ar: IObservableArray[T]): js.Array[T] = js.native
  def values[T](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def values[T](set: typingsJapgolly.mobx.libInternalMod.ObservableSet[T]): js.Array[T] = js.native
  def values[K, T](map: typingsJapgolly.mobx.libInternalMod.ObservableMap[K, T]): js.Array[T] = js.native
  def when(predicate: js.Function0[Boolean]): js.Promise[Unit] with Anon_Cancel = js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  def when(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  def when(predicate: js.Function0[Boolean], opts: IWhenOptions): js.Promise[Unit] with Anon_Cancel = js.native
  @js.native
  object IDerivationState extends js.Object {
    /* -1 */ val NOT_TRACKING: typingsJapgolly.mobx.libCoreDerivationMod.IDerivationState.NOT_TRACKING with Double = js.native
    /* 1 */ val POSSIBLY_STALE: typingsJapgolly.mobx.libCoreDerivationMod.IDerivationState.POSSIBLY_STALE with Double = js.native
    /* 2 */ val STALE: typingsJapgolly.mobx.libCoreDerivationMod.IDerivationState.STALE with Double = js.native
    /* 0 */ val UP_TO_DATE: typingsJapgolly.mobx.libCoreDerivationMod.IDerivationState.UP_TO_DATE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.mobx.libCoreDerivationMod.IDerivationState with Double] = js.native
  }
  
  @js.native
  object comparer extends js.Object {
    @JSName("default")
    var default_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSName("identity")
    var identity_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSName("shallow")
    var shallow_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @JSName("structural")
    var structural_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    def default(a: js.Any, b: js.Any): Boolean = js.native
    def identity(a: js.Any, b: js.Any): Boolean = js.native
    def shallow(a: js.Any, b: js.Any): Boolean = js.native
    def structural(a: js.Any, b: js.Any): Boolean = js.native
  }
  
}

