package typingsJapgolly.vueRouter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.MouseEvent
import typingsJapgolly.std.FlatArray
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.ReturnType
import typingsJapgolly.vueReactivity.mod.ComputedRef
import typingsJapgolly.vueReactivity.mod.UnwrapRef
import typingsJapgolly.vueRouter.mod.LocationQuery
import typingsJapgolly.vueRouter.mod.NavigationFailure
import typingsJapgolly.vueRouter.mod.RouteLocation
import typingsJapgolly.vueRouter.mod.RouteLocationNormalizedLoaded
import typingsJapgolly.vueRouter.mod.RouteMeta
import typingsJapgolly.vueRouter.mod.RouteParams
import typingsJapgolly.vueRouter.mod.RouteRecord
import typingsJapgolly.vueRouter.mod.RouteRecordName
import typingsJapgolly.vueRouter.mod.RouteRecordRaw
import typingsJapgolly.vueRouter.mod.RouterLinkProps
import typingsJapgolly.vueRouter.mod.RouterViewProps
import typingsJapgolly.vueRouter.mod.UseLinkOptions
import typingsJapgolly.vueRuntimeCore.mod.AllowedComponentProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentCustomProps
import typingsJapgolly.vueRuntimeCore.mod.RendererElement
import typingsJapgolly.vueRuntimeCore.mod.RendererNode
import typingsJapgolly.vueRuntimeCore.mod.VNode
import typingsJapgolly.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def default(arg: UnwrapRef[ReturnType[js.Function1[/* props */ UseLinkOptions, IsActive]]]): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
  }
  object `0` {
    
    inline def apply(
      default: UnwrapRef[ReturnType[js.Function1[/* props */ UseLinkOptions, IsActive]]] => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
    ): `0` = {
      val __obj = js.Dynamic.literal(default = js.Any.fromFunction1(default))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setDefault(
        value: UnwrapRef[ReturnType[js.Function1[/* props */ UseLinkOptions, IsActive]]] => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
      ): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    }
  }
  
  trait Component extends StObject {
    
    var Component: VNode[RendererNode, RendererElement, StringDictionary[Any]]
    
    var route: RouteLocationNormalizedLoaded
  }
  object Component {
    
    inline def apply(
      Component: VNode[RendererNode, RendererElement, StringDictionary[Any]],
      route: RouteLocationNormalizedLoaded
    ): Component = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    extension [Self <: Component](x: Self) {
      
      inline def setComponent(value: VNode[RendererNode, RendererElement, StringDictionary[Any]]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: RouteLocationNormalizedLoaded): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait Default extends StObject {
    
    def default(arg: Component): js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]
  }
  object Default {
    
    inline def apply(default: Component => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): Default = {
      val __obj = js.Dynamic.literal(default = js.Any.fromFunction1(default))
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: Component => js.Array[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    }
  }
  
  trait Href extends StObject {
    
    var href: String
  }
  object Href {
    
    inline def apply(href: String): Href = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[Href]
    }
    
    extension [Self <: Href](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IsActive extends StObject {
    
    var href: ComputedRef[String] = js.native
    
    var isActive: ComputedRef[Boolean] = js.native
    
    var isExactActive: ComputedRef[Boolean] = js.native
    
    def navigate(): js.Promise[Unit | NavigationFailure] = js.native
    def navigate(e: MouseEvent): js.Promise[Unit | NavigationFailure] = js.native
    
    var route: ComputedRef[RouteLocation & Href] = js.native
  }
  
  @js.native
  trait IsExactActive extends StObject {
    
    var href: ComputedRef[String] = js.native
    
    var isActive: ComputedRef[Boolean] = js.native
    
    var isExactActive: ComputedRef[Boolean] = js.native
    
    def navigate(): js.Promise[Unit | NavigationFailure] = js.native
    def navigate(e: MouseEvent): js.Promise[Unit | NavigationFailure] = js.native
    
    var route: ComputedRef[RouteLocationhrefstring] = js.native
  }
  
  trait Props extends StObject {
    
    @JSName("$props")
    var $props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterViewProps
    
    @JSName("$slots")
    var $slots: Default
  }
  object Props {
    
    inline def apply(
      $props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterViewProps,
      $slots: Default
    ): Props = {
      val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def set$props(value: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterViewProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
      
      inline def set$slots(value: Default): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<std.Array<vue-router.vue-router.RouteRecordRaw>> */
  trait ReadonlyArrayRouteRecordR extends StObject {
    
    def at(index: Double): js.UndefOr[RouteRecordRaw]
    
    def concat(items: js.Array[RouteRecordRaw]*): js.Array[RouteRecordRaw]
    
    def copyWithin(target: Double, start: Double): this.type
    
    def entries(): IterableIterator[js.Tuple2[Double, RouteRecordRaw]]
    
    def every[S /* <: RouteRecordRaw */](
      predicate: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean
    
    def fill(value: RouteRecordRaw): this.type
    
    def filter[S /* <: RouteRecordRaw */](
      predicate: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          /* is S */ Boolean
        ]
    ): js.Array[S]
    
    def find[S /* <: RouteRecordRaw */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* obj */ js.Array[RouteRecordRaw], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S]
    
    def findIndex(
      predicate: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* obj */ js.Array[RouteRecordRaw], 
          Any
        ]
    ): Double
    
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]]
    
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          U | js.Array[U]
        ]
    ): js.Array[U]
    
    def forEach(
      callbackfn: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Unit
        ]
    ): Unit
    
    def includes(searchElement: RouteRecordRaw): Boolean
    
    def indexOf(searchElement: RouteRecordRaw): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(searchElement: RouteRecordRaw): Double
    
    val length: Double
    
    def map[U](
      callbackfn: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          U
        ]
    ): js.Array[U]
    
    def pop(): js.UndefOr[RouteRecordRaw]
    
    def push(items: RouteRecordRaw*): Double
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ RouteRecordRaw, 
          /* currentValue */ RouteRecordRaw, 
          /* currentIndex */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          RouteRecordRaw
        ]
    ): RouteRecordRaw
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ RouteRecordRaw, 
          /* currentValue */ RouteRecordRaw, 
          /* currentIndex */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          RouteRecordRaw
        ]
    ): RouteRecordRaw
    
    def reverse(): js.Array[RouteRecordRaw]
    
    def shift(): js.UndefOr[RouteRecordRaw]
    
    def slice(): js.Array[RouteRecordRaw]
    
    def some(
      predicate: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Any
        ]
    ): Boolean
    
    def sort(): this.type
    
    def splice(start: Double): js.Array[RouteRecordRaw]
    
    def unshift(items: RouteRecordRaw*): Double
    
    def values(): IterableIterator[RouteRecordRaw]
  }
  object ReadonlyArrayRouteRecordR {
    
    inline def apply(
      at: Double => js.UndefOr[RouteRecordRaw],
      concat: /* repeated */ js.Array[RouteRecordRaw] => js.Array[RouteRecordRaw],
      copyWithin: (Double, Double) => ReadonlyArrayRouteRecordR,
      entries: CallbackTo[IterableIterator[js.Tuple2[Double, RouteRecordRaw]]],
      every: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          /* is S */ Boolean
        ] => /* is std.Array<S> */ Boolean,
      fill: RouteRecordRaw => ReadonlyArrayRouteRecordR,
      filter: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          /* is S */ Boolean
        ] => js.Array[Any],
      find: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* obj */ js.Array[RouteRecordRaw], 
          /* is S */ Boolean
        ] => js.UndefOr[Any],
      findIndex: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* obj */ js.Array[RouteRecordRaw], 
          Any
        ] => Double,
      flat: CallbackTo[js.Array[FlatArray[Any, Any]]],
      flatMap: js.ThisFunction3[
          Any, 
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Any | js.Array[Any]
        ] => js.Array[Any],
      forEach: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Unit
        ] => Callback,
      includes: RouteRecordRaw => Boolean,
      indexOf: RouteRecordRaw => Double,
      join: CallbackTo[String],
      keys: CallbackTo[IterableIterator[Double]],
      lastIndexOf: RouteRecordRaw => Double,
      length: Double,
      map: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Any
        ] => js.Array[Any],
      pop: CallbackTo[js.UndefOr[RouteRecordRaw]],
      push: /* repeated */ RouteRecordRaw => Double,
      reduce: js.Function4[
          /* previousValue */ RouteRecordRaw, 
          /* currentValue */ RouteRecordRaw, 
          /* currentIndex */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          RouteRecordRaw
        ] => RouteRecordRaw,
      reduceRight: js.Function4[
          /* previousValue */ RouteRecordRaw, 
          /* currentValue */ RouteRecordRaw, 
          /* currentIndex */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          RouteRecordRaw
        ] => RouteRecordRaw,
      reverse: CallbackTo[js.Array[RouteRecordRaw]],
      shift: CallbackTo[js.UndefOr[RouteRecordRaw]],
      slice: CallbackTo[js.Array[RouteRecordRaw]],
      some: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Any
        ] => Boolean,
      sort: CallbackTo[ReadonlyArrayRouteRecordR],
      splice: Double => js.Array[RouteRecordRaw],
      unshift: /* repeated */ RouteRecordRaw => Double,
      values: CallbackTo[IterableIterator[RouteRecordRaw]]
    ): ReadonlyArrayRouteRecordR = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = entries.toJsFn, every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.toJsFn, flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1((t0: js.Function3[
          /* value */ RouteRecordRaw, 
          /* index */ Double, 
          /* array */ js.Array[RouteRecordRaw], 
          Unit
        ]) => forEach(t0).runNow()), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = join.toJsFn, keys = keys.toJsFn, lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = pop.toJsFn, push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = reverse.toJsFn, shift = shift.toJsFn, slice = slice.toJsFn, some = js.Any.fromFunction1(some), sort = sort.toJsFn, splice = js.Any.fromFunction1(splice), unshift = js.Any.fromFunction1(unshift), values = values.toJsFn)
      __obj.asInstanceOf[ReadonlyArrayRouteRecordR]
    }
    
    extension [Self <: ReadonlyArrayRouteRecordR](x: Self) {
      
      inline def setAt(value: Double => js.UndefOr[RouteRecordRaw]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setConcat(value: /* repeated */ js.Array[RouteRecordRaw] => js.Array[RouteRecordRaw]): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setCopyWithin(value: (Double, Double) => ReadonlyArrayRouteRecordR): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      inline def setEntries(value: CallbackTo[IterableIterator[js.Tuple2[Double, RouteRecordRaw]]]): Self = StObject.set(x, "entries", value.toJsFn)
      
      inline def setEvery(
        value: js.Function3[
              /* value */ RouteRecordRaw, 
              /* index */ Double, 
              /* array */ js.Array[RouteRecordRaw], 
              /* is S */ Boolean
            ] => /* is std.Array<S> */ Boolean
      ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      inline def setFill(value: RouteRecordRaw => ReadonlyArrayRouteRecordR): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      inline def setFilter(
        value: js.Function3[
              /* value */ RouteRecordRaw, 
              /* index */ Double, 
              /* array */ js.Array[RouteRecordRaw], 
              /* is S */ Boolean
            ] => js.Array[Any]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* value */ RouteRecordRaw, 
              /* index */ Double, 
              /* obj */ js.Array[RouteRecordRaw], 
              /* is S */ Boolean
            ] => js.UndefOr[Any]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFindIndex(
        value: js.Function3[
              /* value */ RouteRecordRaw, 
              /* index */ Double, 
              /* obj */ js.Array[RouteRecordRaw], 
              Any
            ] => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      inline def setFlat(value: CallbackTo[js.Array[FlatArray[Any, Any]]]): Self = StObject.set(x, "flat", value.toJsFn)
      
      inline def setFlatMap(
        value: js.ThisFunction3[
              Any, 
              /* value */ RouteRecordRaw, 
              /* index */ Double, 
              /* array */ js.Array[RouteRecordRaw], 
              Any | js.Array[Any]
            ] => js.Array[Any]
      ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setForEach(
        value: js.Function3[
              /* value */ RouteRecordRaw, 
              /* index */ Double, 
              /* array */ js.Array[RouteRecordRaw], 
              Unit
            ] => Callback
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[
              /* value */ RouteRecordRaw, 
              /* index */ Double, 
              /* array */ js.Array[RouteRecordRaw], 
              Unit
            ]) => value(t0).runNow()))
      
      inline def setIncludes(value: RouteRecordRaw => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      inline def setIndexOf(value: RouteRecordRaw => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setJoin(value: CallbackTo[String]): Self = StObject.set(x, "join", value.toJsFn)
      
      inline def setKeys(value: CallbackTo[IterableIterator[Double]]): Self = StObject.set(x, "keys", value.toJsFn)
      
      inline def setLastIndexOf(value: RouteRecordRaw => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Function3[
              /* value */ RouteRecordRaw, 
              /* index */ Double, 
              /* array */ js.Array[RouteRecordRaw], 
              Any
            ] => js.Array[Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setPop(value: CallbackTo[js.UndefOr[RouteRecordRaw]]): Self = StObject.set(x, "pop", value.toJsFn)
      
      inline def setPush(value: /* repeated */ RouteRecordRaw => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setReduce(
        value: js.Function4[
              /* previousValue */ RouteRecordRaw, 
              /* currentValue */ RouteRecordRaw, 
              /* currentIndex */ Double, 
              /* array */ js.Array[RouteRecordRaw], 
              RouteRecordRaw
            ] => RouteRecordRaw
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      inline def setReduceRight(
        value: js.Function4[
              /* previousValue */ RouteRecordRaw, 
              /* currentValue */ RouteRecordRaw, 
              /* currentIndex */ Double, 
              /* array */ js.Array[RouteRecordRaw], 
              RouteRecordRaw
            ] => RouteRecordRaw
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      inline def setReverse(value: CallbackTo[js.Array[RouteRecordRaw]]): Self = StObject.set(x, "reverse", value.toJsFn)
      
      inline def setShift(value: CallbackTo[js.UndefOr[RouteRecordRaw]]): Self = StObject.set(x, "shift", value.toJsFn)
      
      inline def setSlice(value: CallbackTo[js.Array[RouteRecordRaw]]): Self = StObject.set(x, "slice", value.toJsFn)
      
      inline def setSome(
        value: js.Function3[
              /* value */ RouteRecordRaw, 
              /* index */ Double, 
              /* array */ js.Array[RouteRecordRaw], 
              Any
            ] => Boolean
      ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      inline def setSort(value: CallbackTo[ReadonlyArrayRouteRecordR]): Self = StObject.set(x, "sort", value.toJsFn)
      
      inline def setSplice(value: Double => js.Array[RouteRecordRaw]): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
      
      inline def setUnshift(value: /* repeated */ RouteRecordRaw => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setValues(value: CallbackTo[IterableIterator[RouteRecordRaw]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
  
  /* Inlined vue-router.vue-router.RouteLocation & {  href :string} */
  trait RouteLocationhrefstring extends StObject {
    
    /**
      * The whole location including the `search` and `hash`. This string is
      * percentage encoded.
      */
    var fullPath: String
    
    /**
      * Hash of the current location. If present, starts with a `#`.
      */
    var hash: String
    
    var href: String
    
    /**
      * Array of {@link RouteRecord} containing components as they were
      * passed when adding records. It can also contain redirect records. This
      * can't be used directly
      */
    var matched: js.Array[RouteRecord]
    
    var meta: RouteMeta
    
    var name: js.UndefOr[RouteRecordName | Null] = js.undefined
    
    var params: RouteParams
    
    var path: String
    
    /**
      * Object representation of the `search` property of the current location.
      */
    var query: LocationQuery
    
    /**
      * Contains the location we were initially trying to access before ending up
      * on the current location.
      */
    var redirectedFrom: js.UndefOr[RouteLocation] = js.undefined
  }
  object RouteLocationhrefstring {
    
    inline def apply(
      fullPath: String,
      hash: String,
      href: String,
      matched: js.Array[RouteRecord],
      meta: RouteMeta,
      params: RouteParams,
      path: String,
      query: LocationQuery
    ): RouteLocationhrefstring = {
      val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteLocationhrefstring]
    }
    
    extension [Self <: RouteLocationhrefstring](x: Self) {
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setMatched(value: js.Array[RouteRecord]): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
      
      inline def setMatchedVarargs(value: RouteRecord*): Self = StObject.set(x, "matched", js.Array(value*))
      
      inline def setMeta(value: RouteMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: RouteRecordName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParams(value: RouteParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: LocationQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRedirectedFrom(value: RouteLocation): Self = StObject.set(x, "redirectedFrom", value.asInstanceOf[js.Any])
      
      inline def setRedirectedFromUndefined: Self = StObject.set(x, "redirectedFrom", js.undefined)
    }
  }
  
  trait Slots extends StObject {
    
    @JSName("$props")
    var $props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterLinkProps
    
    @JSName("$slots")
    var $slots: `0`
  }
  object Slots {
    
    inline def apply($props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterLinkProps, $slots: `0`): Slots = {
      val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any], $slots = $slots.asInstanceOf[js.Any])
      __obj.asInstanceOf[Slots]
    }
    
    extension [Self <: Slots](x: Self) {
      
      inline def set$props(value: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterLinkProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
      
      inline def set$slots(value: `0`): Self = StObject.set(x, "$slots", value.asInstanceOf[js.Any])
    }
  }
}
