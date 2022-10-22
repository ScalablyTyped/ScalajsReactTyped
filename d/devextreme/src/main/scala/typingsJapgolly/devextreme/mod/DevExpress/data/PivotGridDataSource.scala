package typingsJapgolly.devextreme.mod.DevExpress.data

import typingsJapgolly.devextreme.anon.ColumnPath
import typingsJapgolly.devextreme.anon.keyinEventNameFunctionFieldsPrepared
import typingsJapgolly.devextreme.devextremeStrings.string_
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.data.PivotGridDataSource.EventName
import typingsJapgolly.devextreme.mod.DevExpress.data.PivotGridDataSource.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridDataSource extends StObject {
  
  def collapseAll(id: String): Unit = js.native
  /**
    * Collapses all header items of a field with the specified identifier.
    */
  def collapseAll(id: Double): Unit = js.native
  
  /**
    * Collapses a specific header item.
    */
  def collapseHeaderItem(area: String, path: js.Array[String | Double | js.Date]): Unit = js.native
  
  /**
    * Provides access to the facts that were used to calculate a specific summary value.
    */
  def createDrillDownDataSource(options: ColumnPath): DataSource[Any, Any] = js.native
  
  /**
    * Disposes of all the resources allocated to the PivotGridDataSource instance.
    */
  def dispose(): Unit = js.native
  
  def expandAll(id: String): Unit = js.native
  /**
    * Expands all the header items of a field with the specified identifier.
    */
  def expandAll(id: Double): Unit = js.native
  
  /**
    * Expands a specific header item.
    */
  def expandHeaderItem(area: String, path: js.Array[Any]): Unit = js.native
  
  def field(id: String): Any = js.native
  def field(id: String, options: Any): Unit = js.native
  /**
    * Gets all the properties of a field with the specified identifier.
    */
  def field(id: Double): Any = js.native
  /**
    * Updates field options&apos; values.
    */
  def field(id: Double, options: Any): Unit = js.native
  
  /**
    * Gets all the fields including those generated automatically.
    */
  def fields(): js.Array[Field] = js.native
  /**
    * Specifies a new fields collection.
    */
  def fields(fields: js.Array[Field]): Unit = js.native
  
  /**
    * Gets the filter property&apos;s value. Does not affect an XmlaStore.
    */
  def filter(): Any = js.native
  /**
    * Sets the filter property&apos;s value. Does not affect an XmlaStore.
    */
  def filter(filterExpr: Any): Unit = js.native
  
  /**
    * Gets all the fields within an area.
    */
  def getAreaFields(area: String, collectGroups: Boolean): js.Array[Field] = js.native
  
  /**
    * Gets the loaded data. Another data portion is loaded every time a header item is expanded.
    */
  def getData(): Any = js.native
  
  /**
    * Checks whether the PivotGridDataSource is loading data.
    */
  def isLoading(): Boolean = js.native
  
  /**
    * Starts loading data.
    */
  def load(): DxPromise[Any] = js.native
  
  /**
    * Detaches all event handlers from a single event.
    */
  def off(eventName: EventName): this.type = js.native
  /**
    * Detaches a particular event handler from a single event.
    */
  def off(eventName: EventName, eventHandler: js.Function): this.type = js.native
  
  /**
    * Subscribes to an event.
    */
  def on(eventName: EventName, eventHandler: js.Function): this.type = js.native
  /**
    * Subscribes to events.
    */
  def on(events: keyinEventNameFunctionFieldsPrepared): this.type = js.native
  
  /**
    * Clears the loaded PivotGridDataSource data and calls the load() method.
    */
  def reload(): DxPromise[Any] = js.native
  
  /**
    * Gets the current PivotGridDataSource state. Part of the PivotGrid UI component&apos;s state storing feature.
    */
  def state(): Any = js.native
  /**
    * Sets the PivotGridDataSource state. Part of the PivotGrid UI component&apos;s state storing feature.
    */
  def state(state: Any): Unit = js.native
}
object PivotGridDataSource {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.changed
    - typingsJapgolly.devextreme.devextremeStrings.fieldsPrepared
    - typingsJapgolly.devextreme.devextremeStrings.loadError
    - typingsJapgolly.devextreme.devextremeStrings.loadingChanged
  */
  trait EventName extends StObject
  object EventName {
    
    inline def changed: typingsJapgolly.devextreme.devextremeStrings.changed = "changed".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.changed]
    
    inline def fieldsPrepared: typingsJapgolly.devextreme.devextremeStrings.fieldsPrepared = "fieldsPrepared".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.fieldsPrepared]
    
    inline def loadError: typingsJapgolly.devextreme.devextremeStrings.loadError = "loadError".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.loadError]
    
    inline def loadingChanged: typingsJapgolly.devextreme.devextremeStrings.loadingChanged = "loadingChanged".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.loadingChanged]
  }
  
  type Field = PivotGridDataSourceField
  
  type Options = PivotGridDataSourceOptions
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.column
    - typingsJapgolly.devextreme.devextremeStrings.data
    - typingsJapgolly.devextreme.devextremeStrings.filter
    - typingsJapgolly.devextreme.devextremeStrings.row
  */
  trait PivotGridArea extends StObject
  object PivotGridArea {
    
    inline def column: typingsJapgolly.devextreme.devextremeStrings.column = "column".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.column]
    
    inline def data: typingsJapgolly.devextreme.devextremeStrings.data = "data".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.data]
    
    inline def filter: typingsJapgolly.devextreme.devextremeStrings.filter = "filter".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.filter]
    
    inline def row: typingsJapgolly.devextreme.devextremeStrings.row = "row".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.row]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.date
    - typingsJapgolly.devextreme.devextremeStrings.number
    - typingsJapgolly.devextreme.devextremeStrings.string_
  */
  trait PivotGridDataType extends StObject
  object PivotGridDataType {
    
    inline def date: typingsJapgolly.devextreme.devextremeStrings.date = "date".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.date]
    
    inline def number: typingsJapgolly.devextreme.devextremeStrings.number = "number".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.number]
    
    inline def string: string_ = "string".asInstanceOf[string_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.day
    - typingsJapgolly.devextreme.devextremeStrings.dayOfWeek
    - typingsJapgolly.devextreme.devextremeStrings.month
    - typingsJapgolly.devextreme.devextremeStrings.quarter
    - typingsJapgolly.devextreme.devextremeStrings.year
  */
  trait PivotGridGroupInterval extends StObject
  object PivotGridGroupInterval {
    
    inline def day: typingsJapgolly.devextreme.devextremeStrings.day = "day".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.day]
    
    inline def dayOfWeek: typingsJapgolly.devextreme.devextremeStrings.dayOfWeek = "dayOfWeek".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.dayOfWeek]
    
    inline def month: typingsJapgolly.devextreme.devextremeStrings.month = "month".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.month]
    
    inline def quarter: typingsJapgolly.devextreme.devextremeStrings.quarter = "quarter".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.quarter]
    
    inline def year: typingsJapgolly.devextreme.devextremeStrings.year = "year".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.column
    - typingsJapgolly.devextreme.devextremeStrings.row
  */
  trait PivotGridRunningTotalMode extends StObject
  object PivotGridRunningTotalMode {
    
    inline def column: typingsJapgolly.devextreme.devextremeStrings.column = "column".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.column]
    
    inline def row: typingsJapgolly.devextreme.devextremeStrings.row = "row".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.row]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.displayText
    - typingsJapgolly.devextreme.devextremeStrings.value
    - typingsJapgolly.devextreme.devextremeStrings.none
  */
  trait PivotGridSortBy extends StObject
  object PivotGridSortBy {
    
    inline def displayText: typingsJapgolly.devextreme.devextremeStrings.displayText = "displayText".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.displayText]
    
    inline def none: typingsJapgolly.devextreme.devextremeStrings.none = "none".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.none]
    
    inline def value: typingsJapgolly.devextreme.devextremeStrings.value = "value".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.value]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.array
    - typingsJapgolly.devextreme.devextremeStrings.local
    - typingsJapgolly.devextreme.devextremeStrings.odata
    - typingsJapgolly.devextreme.devextremeStrings.xmla
  */
  trait PivotGridStoreType extends StObject
  object PivotGridStoreType {
    
    inline def array: typingsJapgolly.devextreme.devextremeStrings.array = "array".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.array]
    
    inline def local: typingsJapgolly.devextreme.devextremeStrings.local = "local".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.local]
    
    inline def odata: typingsJapgolly.devextreme.devextremeStrings.odata = "odata".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.odata]
    
    inline def xmla: typingsJapgolly.devextreme.devextremeStrings.xmla = "xmla".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.xmla]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.absoluteVariation
    - typingsJapgolly.devextreme.devextremeStrings.percentOfColumnGrandTotal
    - typingsJapgolly.devextreme.devextremeStrings.percentOfColumnTotal
    - typingsJapgolly.devextreme.devextremeStrings.percentOfGrandTotal
    - typingsJapgolly.devextreme.devextremeStrings.percentOfRowGrandTotal
    - typingsJapgolly.devextreme.devextremeStrings.percentOfRowTotal
    - typingsJapgolly.devextreme.devextremeStrings.percentVariation
  */
  trait PivotGridSummaryDisplayMode extends StObject
  object PivotGridSummaryDisplayMode {
    
    inline def absoluteVariation: typingsJapgolly.devextreme.devextremeStrings.absoluteVariation = "absoluteVariation".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.absoluteVariation]
    
    inline def percentOfColumnGrandTotal: typingsJapgolly.devextreme.devextremeStrings.percentOfColumnGrandTotal = "percentOfColumnGrandTotal".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.percentOfColumnGrandTotal]
    
    inline def percentOfColumnTotal: typingsJapgolly.devextreme.devextremeStrings.percentOfColumnTotal = "percentOfColumnTotal".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.percentOfColumnTotal]
    
    inline def percentOfGrandTotal: typingsJapgolly.devextreme.devextremeStrings.percentOfGrandTotal = "percentOfGrandTotal".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.percentOfGrandTotal]
    
    inline def percentOfRowGrandTotal: typingsJapgolly.devextreme.devextremeStrings.percentOfRowGrandTotal = "percentOfRowGrandTotal".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.percentOfRowGrandTotal]
    
    inline def percentOfRowTotal: typingsJapgolly.devextreme.devextremeStrings.percentOfRowTotal = "percentOfRowTotal".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.percentOfRowTotal]
    
    inline def percentVariation: typingsJapgolly.devextreme.devextremeStrings.percentVariation = "percentVariation".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.percentVariation]
  }
}
