package typingsJapgolly.uirouterAngularjs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uirouterAngularjs.libInterfaceMod.Ng1ViewDeclaration
import typingsJapgolly.uirouterAngularjs.mod.^
import typingsJapgolly.uirouterAngularjs.uirouterAngularjsStrings.uiDotrouter
import typingsJapgolly.uirouterCore.anon.Configuration
import typingsJapgolly.uirouterCore.anon.Hash
import typingsJapgolly.uirouterCore.anon.Instantiable
import typingsJapgolly.uirouterCore.anon.InstantiableLocationConfig
import typingsJapgolly.uirouterCore.libCommonCommonMod.IInjectable
import typingsJapgolly.uirouterCore.libCommonCommonMod.Mapper
import typingsJapgolly.uirouterCore.libCommonCommonMod.Obj
import typingsJapgolly.uirouterCore.libCommonCommonMod.Predicate
import typingsJapgolly.uirouterCore.libCommonCommonMod.TypedMap
import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.CoreServices
import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.InjectorLike
import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.LocationServices
import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.QLike
import typingsJapgolly.uirouterCore.libResolveInterfaceMod.ResolvePolicy
import typingsJapgolly.uirouterCore.libTransitionInterfaceMod.HookMatchCriterion
import typingsJapgolly.uirouterCore.libTransitionInterfaceMod.IHookRegistry
import typingsJapgolly.uirouterCore.libTransitionInterfaceMod.TransitionOptions
import typingsJapgolly.uirouterCore.libVanillaInterfaceMod.LocationPlugin
import typingsJapgolly.uirouterCore.libVanillaInterfaceMod.ServicesPlugin
import typingsJapgolly.uirouterCore.libViewViewMod.ViewConfigFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: uiDotrouter = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[uiDotrouter]

inline def NATIVE_INJECTOR_TOKEN: String = ^.asInstanceOf[js.Dynamic].selectDynamic("NATIVE_INJECTOR_TOKEN").asInstanceOf[String]

inline def _extend(toObj: Obj, fromObjs: Obj*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_extend")(scala.List(toObj.asInstanceOf[js.Any]).`++`(fromObjs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]

inline def _inArray(array: js.Array[Any]): js.Function1[/* obj */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, Boolean]]
inline def _inArray(array: js.Array[Any], obj: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
inline def _pushTo[T](arr: js.Array[T], `val`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]

inline def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
inline def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

inline def all(fn1: Predicate[Any]): js.Function1[/* arr */ js.Array[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[Any], Boolean]]

inline def allTrueR(memo: Boolean, elem: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("allTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ancestors(
  first: typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject,
  second: typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject
): js.Array[typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestors")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject]]

inline def and(fn1: Predicate[Any], fn2: Predicate[Any]): Predicate[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[Any]]

inline def any(fn1: Predicate[Any]): js.Function1[/* arr */ js.Array[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[Any], Boolean]]

inline def anyTrueR(memo: Boolean, elem: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("anyTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def applyPairs(memo: TypedMap[Any], keyValTuple: js.Array[Any]): TypedMap[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPairs")(memo.asInstanceOf[js.Any], keyValTuple.asInstanceOf[js.Any])).asInstanceOf[TypedMap[Any]]

inline def arrayTuples(args: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayTuples")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]

inline def assertFn(predicateOrMap: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def assertFn(predicateOrMap: js.Function, errMsg: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def assertFn(predicateOrMap: js.Function, errMsg: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: String): js.Function1[/* t */ T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMap")(mapFn.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ T, U]]
inline def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMap")(mapFn.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ T, U]]

inline def assertPredicate[T](predicate: Predicate[T], errMsg: String): Predicate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPredicate")(predicate.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Predicate[T]]
inline def assertPredicate[T](predicate: Predicate[T], errMsg: js.Function): Predicate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPredicate")(predicate.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Predicate[T]]

inline def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeAfterSubstr")(char.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]

inline def buildUrl(loc: LocationServices): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildUrl")(loc.asInstanceOf[js.Any]).asInstanceOf[String]

inline def compose(): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[js.Function0[Any]]

inline def copy(src: Obj): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def copy(src: Obj, dest: Obj): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any])).asInstanceOf[Obj]
inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String], latebind: Boolean): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[Obj]
inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: Unit, latebind: Boolean): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[Obj]

inline def curry(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]

inline def defaultResolvePolicy: ResolvePolicy = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultResolvePolicy").asInstanceOf[ResolvePolicy]
inline def defaultResolvePolicy_=(x: ResolvePolicy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolvePolicy")(x.asInstanceOf[js.Any])

inline def defaultTransOpts: TransitionOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTransOpts").asInstanceOf[TransitionOptions]
inline def defaultTransOpts_=(x: TransitionOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTransOpts")(x.asInstanceOf[js.Any])

inline def defaults(opts: Any, defaultsList: Obj*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(scala.List(opts.asInstanceOf[js.Any]).`++`(defaultsList.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]

inline def deregAll(functions: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregAll")(functions.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def eq_(comp: Any): Predicate[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("eq")(comp.asInstanceOf[js.Any]).asInstanceOf[Predicate[Any]]

inline def equals_ : Any = ^.asInstanceOf[js.Dynamic].selectDynamic("equals").asInstanceOf[Any]

inline def extend: js.Function2[/* toObj */ Obj, /* repeated */ Obj, Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("extend").asInstanceOf[js.Function2[/* toObj */ Obj, /* repeated */ Obj, Any]]

inline def filter[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
inline def filter[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedMap[T]]

inline def find[T](collection: js.Array[T], callback: Predicate[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
inline def find[T](collection: TypedMap[T], callback: Predicate[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]

inline def flatten(arr: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def flattenR(memo: js.Array[Any], elem: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def fnToString(fn: IInjectable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fnToString")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def forEach: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("forEach").asInstanceOf[Any]

inline def fromJson: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("fromJson").asInstanceOf[Any]

inline def functionToString(fn: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("functionToString")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def getLocals(ctx: typingsJapgolly.uirouterCore.mod.ResolveContext): TypedMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocals")(ctx.asInstanceOf[js.Any]).asInstanceOf[TypedMap[Any]]

inline def getNg1ViewConfigFactory(): ViewConfigFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("getNg1ViewConfigFactory")().asInstanceOf[ViewConfigFactory]

inline def getParams(queryString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getParams")(queryString.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def hashLocationPlugin(router: typingsJapgolly.uirouterCore.libRouterMod.UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("hashLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]

inline def hostRegex: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("hostRegex").asInstanceOf[js.RegExp]

inline def identity(x: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def inArray(array: js.Array[Any]): js.Function1[/* obj */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, Boolean]]
inline def inArray(array: js.Array[Any], obj: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def inherit(parent: Obj): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def inherit(parent: Obj, extra: Obj): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def injector: InjectorLike = ^.asInstanceOf[js.Dynamic].selectDynamic("$injector").asInstanceOf[InjectorLike]

inline def invoke(fnName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
inline def invoke(fnName: String, args: js.Array[Any]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function]

inline def is[T](ctor: Instantiable1[/* args (repeated) */ Any, T]): js.Function1[/* obj */ Any, /* is T */ Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(ctor.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, /* is T */ Boolean]]

inline def isArray(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]

inline def isDate(x: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]

inline def isDefined: Predicate[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("isDefined").asInstanceOf[Predicate[Any]]

inline def isFunction(x: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]

inline def isInjectable(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectable")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNull(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNullOrUndefined: Predicate[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("isNullOrUndefined").asInstanceOf[Predicate[Any]]

inline def isNumber(x: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(x.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]

inline def isObject(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isPromise(x: Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]

inline def isRegExp(x: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]

inline def isString(x: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(x.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]

inline def isUndefined(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def joinNeighborsR(acc: js.Array[Any], x: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinNeighborsR")(acc.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def kebobString(camelCase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebobString")(camelCase.asInstanceOf[js.Any]).asInstanceOf[String]

inline def keyValsToObjectR(accum: Any, hasKeyVal: js.Tuple2[Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("keyValsToObjectR")(accum.asInstanceOf[js.Any], hasKeyVal.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def locationPluginFactory(
  name: String,
  isHtml5: Boolean,
  serviceClass: Instantiable,
  configurationClass: InstantiableLocationConfig
): js.Function1[/* uiRouter */ typingsJapgolly.uirouterCore.libRouterMod.UIRouter, Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("locationPluginFactory")(name.asInstanceOf[js.Any], isHtml5.asInstanceOf[js.Any], serviceClass.asInstanceOf[js.Any], configurationClass.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* uiRouter */ typingsJapgolly.uirouterCore.libRouterMod.UIRouter, Configuration]]

inline def makeEvent(
  registry: IHookRegistry,
  transitionService: typingsJapgolly.uirouterCore.libTransitionTransitionServiceMod.TransitionService,
  eventType: typingsJapgolly.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
): js.Function3[/* matchObject */ Any, /* callback */ Any, /* options */ js.UndefOr[js.Object], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEvent")(registry.asInstanceOf[js.Any], transitionService.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* matchObject */ Any, /* callback */ Any, /* options */ js.UndefOr[js.Object], Any]]

inline def makeStub[T](service: String, methods: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStub")(service.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[T]

inline def map[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
inline def map[T, U](
  collection: js.Array[T],
  callback: Mapper[T, U],
  target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ Any
): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
inline def map[T, U](collection: StringDictionary[T], callback: Mapper[T, U]): StringDictionary[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[U]]
inline def map[T, U](
  collection: StringDictionary[T],
  callback: Mapper[T, U],
  target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ Any
): StringDictionary[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[U]]

inline def mapObj: js.Function3[
/* collection */ StringDictionary[Any], 
/* callback */ Mapper[Any, Any], 
/* target */ js.UndefOr[
  /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ Any
], 
StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("mapObj").asInstanceOf[js.Function3[
/* collection */ StringDictionary[Any], 
/* callback */ Mapper[Any, Any], 
/* target */ js.UndefOr[
  /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ Any
], 
StringDictionary[Any]]]
inline def mapObj_=(
  x: js.Function3[
  /* collection */ StringDictionary[Any], 
  /* callback */ Mapper[Any, Any], 
  /* target */ js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ Any
  ], 
  StringDictionary[Any]
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapObj")(x.asInstanceOf[js.Any])

inline def matchState(
  state: typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject,
  criterion: HookMatchCriterion,
  transition: typingsJapgolly.uirouterCore.libTransitionTransitionMod.Transition
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], criterion.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def maxLength(max: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(max.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]

inline def memoryLocationPlugin(router: typingsJapgolly.uirouterCore.libRouterMod.UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]

inline def mergeR(memo: Obj, item: Obj): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeR")(memo.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ng1ViewsBuilder(state: typingsJapgolly.uirouterCore.mod.StateObject): StringDictionary[Ng1ViewDeclaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("ng1ViewsBuilder")(state.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Ng1ViewDeclaration]]

inline def noop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Any]

inline def not(fn: Predicate[Any]): Predicate[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(fn.asInstanceOf[js.Any]).asInstanceOf[Predicate[Any]]

inline def omit(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]

inline def or(fn1: Predicate[Any], fn2: Predicate[Any]): Predicate[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[Any]]

inline def padString(length: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padString")(length.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]

inline def pairs(obj: Obj): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]

inline def parse(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(name.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def parseUrl(url: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Hash]

inline def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(struct.asInstanceOf[js.Any]).asInstanceOf[js.Function]

inline def pick(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]

inline def pipe(funcs: js.Function*): js.Function1[/* obj */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* obj */ Any, Any]]

inline def pluck(collection: StringDictionary[Any], propName: String): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
inline def pluck[T](collection: js.Array[Obj], propName: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

inline def prop(name: String): js.Function1[/* obj */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, Any]]

inline def propEq: js.Function = ^.asInstanceOf[js.Dynamic].selectDynamic("propEq").asInstanceOf[js.Function]

inline def pushR(arr: js.Array[Any], obj: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushR")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def pushStateLocationPlugin(router: typingsJapgolly.uirouterCore.libRouterMod.UIRouter): LocationPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("pushStateLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[LocationPlugin]

inline def pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
inline def pushTo[T](arr: js.Array[T], `val`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]

inline def q: QLike = ^.asInstanceOf[js.Dynamic].selectDynamic("$q").asInstanceOf[QLike]

inline def removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
inline def removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

inline def resolvablesBuilder(state: typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject): js.Array[typingsJapgolly.uirouterCore.libResolveResolvableMod.Resolvable] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvablesBuilder")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libResolveResolvableMod.Resolvable]]

inline def root: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("root").asInstanceOf[Any]

inline def services: CoreServices = ^.asInstanceOf[js.Dynamic].selectDynamic("services").asInstanceOf[CoreServices]

inline def servicesPlugin(router: typingsJapgolly.uirouterCore.libRouterMod.UIRouter): ServicesPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("servicesPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[ServicesPlugin]

inline def silenceUncaughtInPromise(promise: js.Promise[Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silenceUncaughtInPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]

inline def silentRejection(error: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silentRejection")(error.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]

inline def splitEqual(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitEqual")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def splitHash(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitHash")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitOnDelim")(delim.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]

inline def splitQuery(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitQuery")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def stringify(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(o.asInstanceOf[js.Any]).asInstanceOf[String]

inline def stripLastPathElement(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripLastPathElement")(str.asInstanceOf[js.Any]).asInstanceOf[String]

inline def tail[T](arr: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(arr.asInstanceOf[js.Any]).asInstanceOf[T]

inline def toJson: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("toJson").asInstanceOf[Any]

/**
  * The [[Trace]] singleton
  *
  * #### Example:
  * ```js
  * import {trace} from "@uirouter/core";
  * trace.enable(1, 5);
  * ```
  */
inline def trace: typingsJapgolly.uirouterCore.libCommonTraceMod.Trace_ = ^.asInstanceOf[js.Dynamic].selectDynamic("trace").asInstanceOf[typingsJapgolly.uirouterCore.libCommonTraceMod.Trace_]

inline def trimHashVal(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimHashVal")(str.asInstanceOf[js.Any]).asInstanceOf[String]

inline def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqR")(acc.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

inline def unnest(arr: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unnest")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def unnestR(memo: js.Array[Any], elem: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unnestR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def `val`[T](v: T): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("val")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]

inline def values[T](obj: TypedMap[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
