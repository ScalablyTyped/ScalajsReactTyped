package typingsJapgolly.tablesorter

import typingsJapgolly.tablesorter.filteringFilterEventHandlerMod.FilterEventHandler
import typingsJapgolly.tablesorter.pagingPagerConfigurationMod.PagerConfiguration
import typingsJapgolly.tablesorter.pagingPagerEventHandlerMod.PagerEventHandler
import typingsJapgolly.tablesorter.pagingPagerEventMapMod.PagerEventMap
import typingsJapgolly.tablesorter.sortingRelativeSortDefinitionMod.RelativeSortDefinition
import typingsJapgolly.tablesorter.sortingSortDefinitionMod.SortDefinition
import typingsJapgolly.tablesorter.systemCommonEventHandlerMod.CommonEventHandler
import typingsJapgolly.tablesorter.systemConfigEventHandlerMod.ConfigEventHandler
import typingsJapgolly.tablesorter.systemConfigEventMapMod.ConfigEventMap
import typingsJapgolly.tablesorter.systemEventMapMod.EventMap
import typingsJapgolly.tablesorter.systemParameterlessTriggerNameMapMod.ParameterlessTriggerNameMap
import typingsJapgolly.tablesorter.systemTablesorterConfigurationMod.TablesorterConfiguration
import typingsJapgolly.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typingsJapgolly.tablesorter.systemTablesorterEventHandlerMod.TablesorterEventHandler
import typingsJapgolly.tablesorter.systemTriggerCallbackHandlerMod.TriggerCallbackHandler
import typingsJapgolly.tablesorter.tablesorterMod.Tablesorter
import typingsJapgolly.tablesorter.tablesorterStrings.addRows
import typingsJapgolly.tablesorter.tablesorterStrings.applyWidgetId
import typingsJapgolly.tablesorter.tablesorterStrings.applyWidgets
import typingsJapgolly.tablesorter.tablesorterStrings.destroy
import typingsJapgolly.tablesorter.tablesorterStrings.filterStart
import typingsJapgolly.tablesorter.tablesorterStrings.pageAndSize
import typingsJapgolly.tablesorter.tablesorterStrings.pageSet
import typingsJapgolly.tablesorter.tablesorterStrings.pageSize
import typingsJapgolly.tablesorter.tablesorterStrings.pagerUpdate
import typingsJapgolly.tablesorter.tablesorterStrings.refreshWidgets
import typingsJapgolly.tablesorter.tablesorterStrings.removeWidget
import typingsJapgolly.tablesorter.tablesorterStrings.search
import typingsJapgolly.tablesorter.tablesorterStrings.sortReset
import typingsJapgolly.tablesorter.tablesorterStrings.sorton
import typingsJapgolly.tablesorter.tablesorterStrings.stickyHeadersInit
import typingsJapgolly.tablesorter.tablesorterStrings.update
import typingsJapgolly.tablesorter.tablesorterStrings.updateAll
import typingsJapgolly.tablesorter.tablesorterStrings.updateCache
import typingsJapgolly.tablesorter.tablesorterStrings.updateCell
import typingsJapgolly.tablesorter.tablesorterStrings.updateHeaders
import typingsJapgolly.tablesorter.tablesorterStrings.updateRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tablesorter", "Theme")
  @js.native
  open class Theme ()
    extends typingsJapgolly.tablesorter.designThemeMod.Theme
  
  object global {
    
    trait HTMLElement extends StObject {
      
      /**
        * The configuration of the tablesorter.
        */
      var config: TablesorterConfigurationStore[this.type]
      
      /**
        * A value indicating whether the tablesorter has initialized.
        */
      var hasInitialized: Boolean
    }
    object HTMLElement {
      
      inline def apply(config: TablesorterConfigurationStore[HTMLElement], hasInitialized: Boolean): HTMLElement = {
        val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hasInitialized = hasInitialized.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTMLElement]
      }
      
      extension [Self <: HTMLElement](x: Self) {
        
        inline def setConfig(value: TablesorterConfigurationStore[HTMLElement]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setHasInitialized(value: Boolean): Self = StObject.set(x, "hasInitialized", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait JQuery[TElement] extends StObject {
      
      def bind(name: PagerEventMap, callback: PagerEventHandler[TElement]): this.type = js.native
      def bind(name: ConfigEventMap, callback: ConfigEventHandler[TElement]): this.type = js.native
      def bind(name: EventMap, callback: TablesorterEventHandler[TElement]): this.type = js.native
      @JSName("bind")
      def bind_filterStart(name: filterStart, callback: FilterEventHandler[TElement]): this.type = js.native
      @JSName("bind")
      def bind_stickyHeadersInit(name: stickyHeadersInit, callback: CommonEventHandler[TElement]): this.type = js.native
      
      /**
        * Initializes a new `tablesorter`.
        *
        * @param options
        * The options for the tablesorter.
        */
      def tablesorter(): this.type = js.native
      def tablesorter(options: TablesorterConfiguration[TElement]): this.type = js.native
      
      /**
        * Initializes a pager for a tablesorter.
        */
      def tablesorterPager(): this.type = js.native
      def tablesorterPager(options: PagerConfiguration[TElement]): this.type = js.native
      
      def trigger(name: ParameterlessTriggerNameMap): this.type = js.native
      @JSName("trigger")
      def trigger_addRows(
        name: addRows,
        extraParameters: js.Tuple3[JQuery[HTMLElement] | String, Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]
      ): this.type = js.native
      @JSName("trigger")
      def trigger_applyWidgetId(name: applyWidgetId, extraParameters: String): this.type = js.native
      @JSName("trigger")
      def trigger_applyWidgets(name: applyWidgets, extraParameters: TriggerCallbackHandler[TElement]): this.type = js.native
      @JSName("trigger")
      def trigger_destroy(name: destroy, extraParameters: js.Tuple2[Boolean, js.UndefOr[TriggerCallbackHandler[TElement]]]): this.type = js.native
      @JSName("trigger")
      def trigger_pageAndSize(name: pageAndSize, extraParameters: js.Tuple2[Double, Double]): this.type = js.native
      @JSName("trigger")
      def trigger_pageSet(name: pageSet, extraParameters: Double): this.type = js.native
      @JSName("trigger")
      def trigger_pageSize(name: pageSize, extraParameters: Double): this.type = js.native
      @JSName("trigger")
      def trigger_pagerUpdate(name: pagerUpdate, extraParameters: Double): this.type = js.native
      @JSName("trigger")
      def trigger_refreshWidgets(name: refreshWidgets, extraParameters: js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Boolean]]): this.type = js.native
      @JSName("trigger")
      def trigger_removeWidget(name: removeWidget, extraParameters: String): this.type = js.native
      @JSName("trigger")
      def trigger_removeWidget(name: removeWidget, extraParameters: js.Array[String]): this.type = js.native
      @JSName("trigger")
      def trigger_removeWidget(name: removeWidget, extraParameters: Boolean): this.type = js.native
      @JSName("trigger")
      def trigger_search(name: search, extraParameters: js.Array[js.UndefOr[js.Array[String]]]): this.type = js.native
      @JSName("trigger")
      def trigger_search(name: search, extraParameters: Boolean): this.type = js.native
      @JSName("trigger")
      def trigger_sortReset(name: sortReset, extraParameters: js.Array[js.UndefOr[TriggerCallbackHandler[TElement]]]): this.type = js.native
      @JSName("trigger")
      def trigger_sorton(
        name: sorton,
        extraParameters: js.Tuple2[
              js.Array[SortDefinition | RelativeSortDefinition], 
              js.UndefOr[TriggerCallbackHandler[TElement]]
            ]
      ): this.type = js.native
      @JSName("trigger")
      def trigger_update(
        name: update,
        extraParameters: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]
      ): this.type = js.native
      @JSName("trigger")
      def trigger_updateAll(
        name: updateAll,
        extraParameters: js.Tuple2[
              js.UndefOr[Boolean | js.Array[SortDefinition]], 
              js.UndefOr[TriggerCallbackHandler[TElement]]
            ]
      ): this.type = js.native
      @JSName("trigger")
      def trigger_updateCache(
        name: updateCache,
        extraParameters: js.Tuple2[js.UndefOr[TriggerCallbackHandler[TElement]], js.UndefOr[JQuery[HTMLElement]]]
      ): this.type = js.native
      @JSName("trigger")
      def trigger_updateCell(
        name: updateCell,
        extraParameters: js.Tuple3[
              JQuery[HTMLElement], 
              js.UndefOr[Boolean | js.Array[SortDefinition]], 
              js.UndefOr[TriggerCallbackHandler[TElement]]
            ]
      ): this.type = js.native
      @JSName("trigger")
      def trigger_updateHeaders(name: updateHeaders, extraParameters: TriggerCallbackHandler[TElement]): this.type = js.native
      @JSName("trigger")
      def trigger_updateRows(
        name: updateRows,
        extraParameters: js.Tuple2[Boolean | js.Array[SortDefinition], js.UndefOr[TriggerCallbackHandler[TElement]]]
      ): this.type = js.native
    }
    
    trait JQueryStatic[TElement] extends StObject {
      
      /**
        * The tablesorter.
        */
      var tablesorter: Tablesorter[TElement]
    }
    object JQueryStatic {
      
      inline def apply[TElement](tablesorter: Tablesorter[TElement]): JQueryStatic[TElement] = {
        val __obj = js.Dynamic.literal(tablesorter = tablesorter.asInstanceOf[js.Any])
        __obj.asInstanceOf[JQueryStatic[TElement]]
      }
      
      extension [Self <: JQueryStatic[?], TElement](x: Self & JQueryStatic[TElement]) {
        
        inline def setTablesorter(value: Tablesorter[TElement]): Self = StObject.set(x, "tablesorter", value.asInstanceOf[js.Any])
      }
    }
  }
}
