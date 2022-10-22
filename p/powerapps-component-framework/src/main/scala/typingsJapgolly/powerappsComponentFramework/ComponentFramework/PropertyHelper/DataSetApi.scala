package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.EntityReference
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.LookupValue
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.ConditionOperator
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.FilterOperator
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataSetApi {
  
  /**
    * Metadata about a column in a dataset
    */
  trait Column extends StObject {
    
    /**
      * The alias of this column.
      */
    var alias: String
    
    /**
      * The manifest type of this column's values.
      */
    var dataType: String
    
    /**
      * Prevents the UI from making the column sortable.
      */
    var disableSorting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Localized display name for the column
      */
    var displayName: String
    
    /**
      * The column visibility state.
      */
    var isHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is specific column the primary attrribute of the view's entity
      */
    var isPrimary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the column, unique in this dataset
      */
    var name: String
    
    /**
      * The column order for the layout
      */
    var order: Double
    
    /**
      * Customized column width ratios
      */
    var visualSizeFactor: Double
  }
  object Column {
    
    inline def apply(
      alias: String,
      dataType: String,
      displayName: String,
      name: String,
      order: Double,
      visualSizeFactor: Double
    ): Column = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], visualSizeFactor = visualSizeFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDisableSorting(value: Boolean): Self = StObject.set(x, "disableSorting", value.asInstanceOf[js.Any])
      
      inline def setDisableSortingUndefined: Self = StObject.set(x, "disableSorting", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setVisualSizeFactor(value: Double): Self = StObject.set(x, "visualSizeFactor", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An expression used to represent a filter condition.
    */
  trait ConditionExpression extends StObject {
    
    /**
      * The name of the data-set column to apply the filter on.
      */
    var attributeName: String
    
    /**
      * The value evaluated by the condition
      */
    var conditionOperator: ConditionOperator
    
    /**
      * Entity alias name so filtering can be used on linked entities.
      */
    var entityAliasName: js.UndefOr[String] = js.undefined
    
    /**
      * The value evaluated by the condition.
      */
    var value: String | js.Array[String]
  }
  object ConditionExpression {
    
    inline def apply(attributeName: String, conditionOperator: ConditionOperator, value: String | js.Array[String]): ConditionExpression = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], conditionOperator = conditionOperator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionExpression]
    }
    
    extension [Self <: ConditionExpression](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setConditionOperator(value: ConditionOperator): Self = StObject.set(x, "conditionOperator", value.asInstanceOf[js.Any])
      
      inline def setEntityAliasName(value: String): Self = StObject.set(x, "entityAliasName", value.asInstanceOf[js.Any])
      
      inline def setEntityAliasNameUndefined: Self = StObject.set(x, "entityAliasName", js.undefined)
      
      inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /**
    * Base interface for dataset record result. Supports value retrival by column name.
    */
  trait EntityRecord extends StObject {
    
    /**
      * Get the current formatted value of this record column.
      * @param columnName Column name of the record
      */
    def getFormattedValue(columnName: String): String
    
    /**
      * Get the object that encapsulates an Entity Reference as a plain object
      */
    def getNamedReference(): EntityReference
    
    /**
      * Get the record ID
      */
    def getRecordId(): String
    
    /**
      * Get the raw value of the record's column
      * @param columnName Column name of the record
      */
    def getValue(columnName: String): String | js.Date | Double | (js.Array[Double | EntityReference | LookupValue]) | Boolean | EntityReference | LookupValue
  }
  object EntityRecord {
    
    inline def apply(
      getFormattedValue: String => String,
      getNamedReference: CallbackTo[EntityReference],
      getRecordId: CallbackTo[String],
      getValue: String => String | js.Date | Double | (js.Array[Double | EntityReference | LookupValue]) | Boolean | EntityReference | LookupValue
    ): EntityRecord = {
      val __obj = js.Dynamic.literal(getFormattedValue = js.Any.fromFunction1(getFormattedValue), getNamedReference = getNamedReference.toJsFn, getRecordId = getRecordId.toJsFn, getValue = js.Any.fromFunction1(getValue))
      __obj.asInstanceOf[EntityRecord]
    }
    
    extension [Self <: EntityRecord](x: Self) {
      
      inline def setGetFormattedValue(value: String => String): Self = StObject.set(x, "getFormattedValue", js.Any.fromFunction1(value))
      
      inline def setGetNamedReference(value: CallbackTo[EntityReference]): Self = StObject.set(x, "getNamedReference", value.toJsFn)
      
      inline def setGetRecordId(value: CallbackTo[String]): Self = StObject.set(x, "getRecordId", value.toJsFn)
      
      inline def setGetValue(
        value: String => String | js.Date | Double | (js.Array[Double | EntityReference | LookupValue]) | Boolean | EntityReference | LookupValue
      ): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An expression used to represent a filter.
    */
  trait FilterExpression extends StObject {
    
    /**
      * The set of conditions associated with this filter.
      */
    var conditions: js.Array[ConditionExpression]
    
    /**
      * The operator used to combine conditions in this filter.
      */
    var filterOperator: FilterOperator
    
    /**
      * Any child filters that should be evaluated after evaluating this filter.
      */
    var filters: js.UndefOr[js.Array[FilterExpression]] = js.undefined
  }
  object FilterExpression {
    
    inline def apply(conditions: js.Array[ConditionExpression], filterOperator: FilterOperator): FilterExpression = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], filterOperator = filterOperator.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterExpression]
    }
    
    extension [Self <: FilterExpression](x: Self) {
      
      inline def setConditions(value: js.Array[ConditionExpression]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: ConditionExpression*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setFilterOperator(value: FilterOperator): Self = StObject.set(x, "filterOperator", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: js.Array[FilterExpression]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: FilterExpression*): Self = StObject.set(x, "filters", js.Array(value*))
    }
  }
  
  /**
    * Filter state for a dataset.
    */
  trait Filtering extends StObject {
    
    /**
      * Clears the filter associated with the data-set.
      */
    def clearFilter(): Unit
    
    /**
      * Returns the top-most filter associated with the data-set
      */
    def getFilter(): FilterExpression
    
    /**
      * Sets the top-most filter associated with the data-set
      * @param expression filter expression to be set
      */
    def setFilter(expression: FilterExpression): Unit
  }
  object Filtering {
    
    inline def apply(
      clearFilter: Callback,
      getFilter: CallbackTo[FilterExpression],
      setFilter: FilterExpression => Callback
    ): Filtering = {
      val __obj = js.Dynamic.literal(clearFilter = clearFilter.toJsFn, getFilter = getFilter.toJsFn, setFilter = js.Any.fromFunction1((t0: FilterExpression) => setFilter(t0).runNow()))
      __obj.asInstanceOf[Filtering]
    }
    
    extension [Self <: Filtering](x: Self) {
      
      inline def setClearFilter(value: Callback): Self = StObject.set(x, "clearFilter", value.toJsFn)
      
      inline def setGetFilter(value: CallbackTo[FilterExpression]): Self = StObject.set(x, "getFilter", value.toJsFn)
      
      inline def setSetFilter(value: FilterExpression => Callback): Self = StObject.set(x, "setFilter", js.Any.fromFunction1((t0: FilterExpression) => value(t0).runNow()))
    }
  }
  
  /**
    * Entity linking expression
    */
  trait LinkEntityExposedExpression extends StObject {
    
    /**
      * The 'alias' for the link-entity relationship
      */
    var alias: String
    
    /**
      * The 'from' attribute in the link-entity relationship
      */
    var from: String
    
    /**
      * The 'type' of the link, referred by the link-entity attribute
      */
    var linkType: String
    
    /**
      * The 'name' of the entity to link to
      */
    var name: String
    
    /**
      * The 'to' attribute in the link-entity relationship
      */
    var to: String
  }
  object LinkEntityExposedExpression {
    
    inline def apply(alias: String, from: String, linkType: String, name: String, to: String): LinkEntityExposedExpression = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkEntityExposedExpression]
    }
    
    extension [Self <: LinkEntityExposedExpression](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Dataset entity linking.
    */
  trait Linking extends StObject {
    
    /**
      * Add a new linked entity relationship with the existed query primary entity
      * @param expression The new linked entity to add
      */
    def addLinkedEntity(expression: LinkEntityExposedExpression): Unit
    
    /**
      * Returns all the linked entities information
      */
    def getLinkedEntities(): js.Array[LinkEntityExposedExpression]
  }
  object Linking {
    
    inline def apply(
      addLinkedEntity: LinkEntityExposedExpression => Callback,
      getLinkedEntities: CallbackTo[js.Array[LinkEntityExposedExpression]]
    ): Linking = {
      val __obj = js.Dynamic.literal(addLinkedEntity = js.Any.fromFunction1((t0: LinkEntityExposedExpression) => addLinkedEntity(t0).runNow()), getLinkedEntities = getLinkedEntities.toJsFn)
      __obj.asInstanceOf[Linking]
    }
    
    extension [Self <: Linking](x: Self) {
      
      inline def setAddLinkedEntity(value: LinkEntityExposedExpression => Callback): Self = StObject.set(x, "addLinkedEntity", js.Any.fromFunction1((t0: LinkEntityExposedExpression) => value(t0).runNow()))
      
      inline def setGetLinkedEntities(value: CallbackTo[js.Array[LinkEntityExposedExpression]]): Self = StObject.set(x, "getLinkedEntities", value.toJsFn)
    }
  }
  
  /**
    * Paging state for a dataset
    */
  @js.native
  trait Paging extends StObject {
    
    /**
      * The number of the first page to retrieve
      */
    var firstPageNumber: Double = js.native
    
    /**
      * Whether the result set can be paged forwards.
      */
    var hasNextPage: Boolean = js.native
    
    /**
      * Whether the result set can be paged backwards.
      */
    var hasPreviousPage: Boolean = js.native
    
    /**
      * The number of the last page to retrieve
      */
    var lastPageNumber: Double = js.native
    
    /**
      * Request the exact page of results to be loaded.
      * @param pageNumber exact page to be loaded.
      */
    def loadExactPage(pageNumber: Double): Unit = js.native
    
    /**
      * Request the next page of results to be loaded. Returns results for the whole page range.
      * New data will be pushed to control in another 'updateView' cycle.
      * @param loadOnlyNewPage Limits return value to only newly loaded page.
      */
    def loadNextPage(): Unit = js.native
    def loadNextPage(loadOnlyNewPage: Boolean): Unit = js.native
    
    /**
      * Request the previous page of results to be loaded. Returns results for the whole page range.
      * New data will be pushed to control in another 'updateView' cycle.
      * @param loadOnlyNewPage Limits return value to only newly loaded page.
      */
    def loadPreviousPage(): Unit = js.native
    def loadPreviousPage(loadOnlyNewPage: Boolean): Unit = js.native
    
    /**
      * The pagesize for each page retrieved
      */
    var pageSize: Double = js.native
    
    /**
      * Reload the results from the server, and reset to page 1.
      */
    def reset(): Unit = js.native
    
    /**
      * Sets the number of results to return per page on the next data refresh.
      * @param pageSize pageSize to be set.
      */
    def setPageSize(pageSize: Double): Unit = js.native
    
    /**
      * Total number of results on the server for the currently applied query.
      */
    var totalResultCount: Double = js.native
  }
  
  /**
    * Current sort status of a dataset column
    */
  trait SortStatus extends StObject {
    
    /**
      * The name of the column
      */
    var name: String
    
    /**
      * The current sort direction for the column.
      */
    var sortDirection: SortDirection
  }
  object SortStatus {
    
    inline def apply(name: String, sortDirection: SortDirection): SortStatus = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortStatus]
    }
    
    extension [Self <: SortStatus](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSortDirection(value: SortDirection): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    }
  }
  
  object Types {
    
    /**
      * Supported Condition Operator for filtering expression condition
      * This is subset of full condition operators list defined in https://docs.microsoft.com/en-us/dotnet/api/microsoft.xrm.sdk.query.conditionoperator
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`2`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`3`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`4`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`5`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`6`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`8`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`12`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`14`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`15`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`16`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`17`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`18`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`19`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`20`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`22`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`23`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`25`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`26`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`27`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`28`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`29`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`33`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`34`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`37`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`38`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`49`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`70`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`75`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`76`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`77`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`78`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`79`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`87`
    */
    trait ConditionOperator extends StObject
    object ConditionOperator {
      
      inline def `-1`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1` = -1.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1`]
      
      inline def `0`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0` = 0.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`]
      
      inline def `1`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1` = 1.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`]
      
      inline def `12`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`12` = 12.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`12`]
      
      inline def `14`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`14` = 14.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`14`]
      
      inline def `15`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`15` = 15.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`15`]
      
      inline def `16`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`16` = 16.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`16`]
      
      inline def `17`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`17` = 17.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`17`]
      
      inline def `18`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`18` = 18.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`18`]
      
      inline def `19`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`19` = 19.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`19`]
      
      inline def `2`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`2` = 2.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`2`]
      
      inline def `20`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`20` = 20.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`20`]
      
      inline def `22`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`22` = 22.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`22`]
      
      inline def `23`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`23` = 23.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`23`]
      
      inline def `25`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`25` = 25.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`25`]
      
      inline def `26`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`26` = 26.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`26`]
      
      inline def `27`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`27` = 27.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`27`]
      
      inline def `28`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`28` = 28.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`28`]
      
      inline def `29`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`29` = 29.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`29`]
      
      inline def `3`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`3` = 3.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`3`]
      
      inline def `33`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`33` = 33.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`33`]
      
      inline def `34`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`34` = 34.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`34`]
      
      inline def `37`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`37` = 37.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`37`]
      
      inline def `38`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`38` = 38.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`38`]
      
      inline def `4`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`4` = 4.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`4`]
      
      inline def `49`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`49` = 49.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`49`]
      
      inline def `5`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`5` = 5.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`5`]
      
      inline def `6`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`6` = 6.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`6`]
      
      inline def `70`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`70` = 70.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`70`]
      
      inline def `75`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`75` = 75.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`75`]
      
      inline def `76`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`76` = 76.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`76`]
      
      inline def `77`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`77` = 77.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`77`]
      
      inline def `78`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`78` = 78.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`78`]
      
      inline def `79`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`79` = 79.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`79`]
      
      inline def `8`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`8` = 8.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`8`]
      
      inline def `87`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`87` = 87.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`87`]
    }
    
    /**
      * Supported Filter Operator for filtering expression linkage
      * 0 - And,
      * 1 - Or
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`
    */
    trait FilterOperator extends StObject
    object FilterOperator {
      
      inline def `0`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0` = 0.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`]
      
      inline def `1`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1` = 1.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`]
    }
    
    /**
      * Column Sort Direction
      * -1 - None,
      * 0 - Ascending,
      * 1 - Descending
      */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`
      - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`
    */
    trait SortDirection extends StObject
    object SortDirection {
      
      inline def `-1`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1` = -1.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1`]
      
      inline def `0`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0` = 0.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`]
      
      inline def `1`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1` = 1.asInstanceOf[typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`]
    }
  }
}
