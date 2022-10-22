package typingsJapgolly.victoryCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.victoryCore.anon.Index
import typingsJapgolly.victoryCore.anon.Instantiable
import typingsJapgolly.victoryCore.esTypesPropTypesMod.CategoryPropType
import typingsJapgolly.victoryCore.esTypesPropTypesMod.DataGetterPropType
import typingsJapgolly.victoryCore.esTypesPropTypesMod.DomainPropType
import typingsJapgolly.victoryCore.esTypesPropTypesMod.SortOrderPropType
import typingsJapgolly.victoryCore.esTypesPropTypesMod.VictoryLabelableProps
import typingsJapgolly.victoryCore.esVictoryUtilCommonPropsMod.VictoryCommonProps
import typingsJapgolly.victoryCore.esVictoryUtilEventsMod.ComponentEvent
import typingsJapgolly.victoryCore.esVictoryUtilEventsMod.ComponentEventKey
import typingsJapgolly.victoryCore.esVictoryUtilEventsMod.ComponentWithEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilAddEventsMod {
  
  @JSImport("victory-core/es/victory-util/add-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEvents[TBase /* <: WrappedComponentClass[TProps] */, TProps /* <: EventMixinCommonProps */](WrappedComponent: TBase): Instantiable[TProps] & TBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable[TProps] & TBase]
  inline def addEvents[TBase /* <: WrappedComponentClass[TProps] */, TProps /* <: EventMixinCommonProps */](WrappedComponent: TBase, options: MixinOptions): Instantiable[TProps] & TBase = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvents")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instantiable[TProps] & TBase]
  
  trait EventMixinCalculatedValues extends StObject {
    
    var baseProps: Record[String, js.Object]
    
    var componentEvents: js.Array[ComponentEvent]
    
    var dataKeys: js.Array[String]
    
    var events: Any
    
    def getSharedEventState(key: String, value: String): Any
    
    var hasEvents: Any
  }
  object EventMixinCalculatedValues {
    
    inline def apply(
      baseProps: Record[String, js.Object],
      componentEvents: js.Array[ComponentEvent],
      dataKeys: js.Array[String],
      events: Any,
      getSharedEventState: (String, String) => Any,
      hasEvents: Any
    ): EventMixinCalculatedValues = {
      val __obj = js.Dynamic.literal(baseProps = baseProps.asInstanceOf[js.Any], componentEvents = componentEvents.asInstanceOf[js.Any], dataKeys = dataKeys.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], getSharedEventState = js.Any.fromFunction2(getSharedEventState), hasEvents = hasEvents.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMixinCalculatedValues]
    }
    
    extension [Self <: EventMixinCalculatedValues](x: Self) {
      
      inline def setBaseProps(value: Record[String, js.Object]): Self = StObject.set(x, "baseProps", value.asInstanceOf[js.Any])
      
      inline def setComponentEvents(value: js.Array[ComponentEvent]): Self = StObject.set(x, "componentEvents", value.asInstanceOf[js.Any])
      
      inline def setComponentEventsVarargs(value: ComponentEvent*): Self = StObject.set(x, "componentEvents", js.Array(value*))
      
      inline def setDataKeys(value: js.Array[String]): Self = StObject.set(x, "dataKeys", value.asInstanceOf[js.Any])
      
      inline def setDataKeysVarargs(value: String*): Self = StObject.set(x, "dataKeys", js.Array(value*))
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setGetSharedEventState(value: (String, String) => Any): Self = StObject.set(x, "getSharedEventState", js.Any.fromFunction2(value))
      
      inline def setHasEvents(value: Any): Self = StObject.set(x, "hasEvents", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.victoryCore.esVictoryUtilCommonPropsMod.VictoryDatableProps because var conflicts: domainPadding. Inlined categories, data, dataComponent, domain, samples, sortKey, sortOrder, x, y, y0 */ trait EventMixinCommonProps
    extends StObject
       with VictoryCommonProps
       with VictoryLabelableProps {
    
    var categories: js.UndefOr[CategoryPropType] = js.undefined
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var dataComponent: js.UndefOr[Element] = js.undefined
    
    var domain: js.UndefOr[DomainPropType] = js.undefined
    
    var samples: js.UndefOr[Double] = js.undefined
    
    var sortKey: js.UndefOr[DataGetterPropType] = js.undefined
    
    var sortOrder: js.UndefOr[SortOrderPropType] = js.undefined
    
    var x: js.UndefOr[DataGetterPropType] = js.undefined
    
    var y: js.UndefOr[DataGetterPropType] = js.undefined
    
    var y0: js.UndefOr[DataGetterPropType] = js.undefined
  }
  object EventMixinCommonProps {
    
    inline def apply(): EventMixinCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventMixinCommonProps]
    }
    
    extension [Self <: EventMixinCommonProps](x: Self) {
      
      inline def setCategories(value: CategoryPropType): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataComponent(value: VdomElement): Self = StObject.set(x, "dataComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataComponentUndefined: Self = StObject.set(x, "dataComponent", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDomain(value: DomainPropType): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
      
      inline def setSortKey(value: DataGetterPropType): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
      
      inline def setSortKeyFunction1(value: Any => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "sortKey", js.Any.fromFunction1(value))
      
      inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
      
      inline def setSortKeyVarargs(value: (Double | String)*): Self = StObject.set(x, "sortKey", js.Array(value*))
      
      inline def setSortOrder(value: SortOrderPropType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setX(value: DataGetterPropType): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXFunction1(value: Any => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "x", js.Any.fromFunction1(value))
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXVarargs(value: (Double | String)*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: DataGetterPropType): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY0(value: DataGetterPropType): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY0Function1(value: Any => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "y0", js.Any.fromFunction1(value))
      
      inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      inline def setY0Varargs(value: (Double | String)*): Self = StObject.set(x, "y0", js.Array(value*))
      
      inline def setYFunction1(value: Any => String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYVarargs(value: (Double | String)*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  @js.native
  trait EventsMixinClass[TProps] extends StObject {
    
    def animateComponent(props: TProps, defaultAnimationWhitelist: js.Array[String]): Element = js.native
    
    def cacheValues[TThis](obj: Partial[TThis]): Unit = js.native
    
    var dataKeys: js.Array[String] = js.native
    
    def getComponentProps(component: Element, `type`: String, index: Double): TProps = js.native
    
    var getEventState: js.ThisFunction3[
        /* this */ ComponentWithEvents, 
        /* eventKey */ ComponentEventKey, 
        /* namespace */ String, 
        /* childType */ js.UndefOr[String], 
        Any
      ] = js.native
    
    def renderContainer(component: Element, children: Element): Element = js.native
    def renderContainer(component: Element, children: js.Array[Element]): Element = js.native
    
    def renderContinuousData(props: TProps): Any = js.native
    
    def renderData(props: TProps): Any = js.native
  }
  
  trait MixinOptions extends StObject {
    
    var components: js.UndefOr[js.Array[Index]] = js.undefined
  }
  object MixinOptions {
    
    inline def apply(): MixinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MixinOptions]
    }
    
    extension [Self <: MixinOptions](x: Self) {
      
      inline def setComponents(value: js.Array[Index]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComponentsVarargs(value: Index*): Self = StObject.set(x, "components", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCore.victoryCoreStrings.container
    - typingsJapgolly.victoryCore.victoryCoreStrings.group
    - typingsJapgolly.victoryCore.victoryCoreStrings.histogram
    - typingsJapgolly.victoryCore.victoryCoreStrings.label
    - typingsJapgolly.victoryCore.victoryCoreStrings.line
    - typingsJapgolly.victoryCore.victoryCoreStrings.portal
    - typingsJapgolly.victoryCore.victoryCoreStrings.stack
    - typingsJapgolly.victoryCore.victoryCoreStrings.tooltip
    - typingsJapgolly.victoryCore.victoryCoreStrings.voronoi
  */
  trait VictoryComponentCommonRole extends StObject
  object VictoryComponentCommonRole {
    
    inline def container: typingsJapgolly.victoryCore.victoryCoreStrings.container = "container".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.container]
    
    inline def group: typingsJapgolly.victoryCore.victoryCoreStrings.group = "group".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.group]
    
    inline def histogram: typingsJapgolly.victoryCore.victoryCoreStrings.histogram = "histogram".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.histogram]
    
    inline def label: typingsJapgolly.victoryCore.victoryCoreStrings.label = "label".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.label]
    
    inline def line: typingsJapgolly.victoryCore.victoryCoreStrings.line = "line".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.line]
    
    inline def portal: typingsJapgolly.victoryCore.victoryCoreStrings.portal = "portal".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.portal]
    
    inline def stack: typingsJapgolly.victoryCore.victoryCoreStrings.stack = "stack".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.stack]
    
    inline def tooltip: typingsJapgolly.victoryCore.victoryCoreStrings.tooltip = "tooltip".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.tooltip]
    
    inline def voronoi: typingsJapgolly.victoryCore.victoryCoreStrings.voronoi = "voronoi".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.voronoi]
  }
  
  trait VictoryComponentConfiguration[TProps] extends StObject {
    
    var animationWhitelist: js.UndefOr[js.Array[/* keyof TProps */ String]] = js.undefined
    
    var expectedComponents: js.UndefOr[js.Array[/* keyof TProps */ String]] = js.undefined
    
    var getBaseProps: js.UndefOr[js.Function1[/* props */ TProps, Record[String, js.Object]]] = js.undefined
    
    var getChildren: js.UndefOr[
        js.Function3[
          /* props */ TProps, 
          /* childComponents */ js.UndefOr[js.Array[Node]], 
          /* calculatedProps */ js.UndefOr[TProps], 
          Unit
        ]
      ] = js.undefined
    
    var role: js.UndefOr[VictoryComponentRole] = js.undefined
  }
  object VictoryComponentConfiguration {
    
    inline def apply[TProps](): VictoryComponentConfiguration[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryComponentConfiguration[TProps]]
    }
    
    extension [Self <: VictoryComponentConfiguration[?], TProps](x: Self & VictoryComponentConfiguration[TProps]) {
      
      inline def setAnimationWhitelist(value: js.Array[/* keyof TProps */ String]): Self = StObject.set(x, "animationWhitelist", value.asInstanceOf[js.Any])
      
      inline def setAnimationWhitelistUndefined: Self = StObject.set(x, "animationWhitelist", js.undefined)
      
      inline def setAnimationWhitelistVarargs(value: (/* keyof TProps */ String)*): Self = StObject.set(x, "animationWhitelist", js.Array(value*))
      
      inline def setExpectedComponents(value: js.Array[/* keyof TProps */ String]): Self = StObject.set(x, "expectedComponents", value.asInstanceOf[js.Any])
      
      inline def setExpectedComponentsUndefined: Self = StObject.set(x, "expectedComponents", js.undefined)
      
      inline def setExpectedComponentsVarargs(value: (/* keyof TProps */ String)*): Self = StObject.set(x, "expectedComponents", js.Array(value*))
      
      inline def setGetBaseProps(value: /* props */ TProps => Record[String, js.Object]): Self = StObject.set(x, "getBaseProps", js.Any.fromFunction1(value))
      
      inline def setGetBasePropsUndefined: Self = StObject.set(x, "getBaseProps", js.undefined)
      
      inline def setGetChildren(
        value: (/* props */ TProps, /* childComponents */ js.UndefOr[js.Array[Node]], /* calculatedProps */ js.UndefOr[TProps]) => Callback
      ): Self = StObject.set(x, "getChildren", js.Any.fromFunction3((t0: /* props */ TProps, t1: /* childComponents */ js.UndefOr[js.Array[Node]], t2: /* calculatedProps */ js.UndefOr[TProps]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetChildrenUndefined: Self = StObject.set(x, "getChildren", js.undefined)
      
      inline def setRole(value: VictoryComponentRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  type VictoryComponentRole = VictoryComponentCommonRole | String
  
  @js.native
  trait WrappedComponentClass[TProps]
    extends StObject
       with VictoryComponentConfiguration[TProps]
       with Instantiable1[/* props */ TProps, Component[TProps & js.Object, js.Object]]
}
