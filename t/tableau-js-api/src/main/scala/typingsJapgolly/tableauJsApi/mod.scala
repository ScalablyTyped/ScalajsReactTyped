package typingsJapgolly.tableauJsApi

import org.scalajs.dom.HTMLElement
import typingsJapgolly.tableauJsApi.vizMod.VizCreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tableau-js-api", "DashboardObjectType")
  @js.native
  object DashboardObjectType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType & String] = js.native
    
    /* "addIn" */ val ADDIN: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.ADDIN & String = js.native
    
    /* "blank" */ val BLANK: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.BLANK & String = js.native
    
    /* "image" */ val IMAGE: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.IMAGE & String = js.native
    
    /* "legend" */ val LEGEND: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.LEGEND & String = js.native
    
    /* "pageFilter" */ val PAGE_FILTER: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.PAGE_FILTER & String = js.native
    
    /* "parameterControl" */ val PARAMETER_CONTROL: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.PARAMETER_CONTROL & String = js.native
    
    /* "quickFilter" */ val QUICK_FILTER: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.QUICK_FILTER & String = js.native
    
    /* "text" */ val TEXT: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.TEXT & String = js.native
    
    /* "title" */ val TITLE: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.TITLE & String = js.native
    
    /* "webPage" */ val WEB_PAGE: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.WEB_PAGE & String = js.native
    
    /* "worksheet" */ val WORKSHEET: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.WORKSHEET & String = js.native
  }
  
  @JSImport("tableau-js-api", "DateRangeType")
  @js.native
  object DateRangeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.DateRangeType & String] = js.native
    
    /* "curr" */ val CURR: typingsJapgolly.tableauJsApi.enumsMod.DateRangeType.CURR & String = js.native
    
    /* "last" */ val LAST: typingsJapgolly.tableauJsApi.enumsMod.DateRangeType.LAST & String = js.native
    
    /* "lastn" */ val LASTN: typingsJapgolly.tableauJsApi.enumsMod.DateRangeType.LASTN & String = js.native
    
    /* "next" */ val NEXT: typingsJapgolly.tableauJsApi.enumsMod.DateRangeType.NEXT & String = js.native
    
    /* "nextn" */ val NEXTN: typingsJapgolly.tableauJsApi.enumsMod.DateRangeType.NEXTN & String = js.native
    
    /* "todate" */ val TODATE: typingsJapgolly.tableauJsApi.enumsMod.DateRangeType.TODATE & String = js.native
  }
  
  @JSImport("tableau-js-api", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.ErrorCode & String] = js.native
    
    /* "browserNotCapable" */ val BROWSER_NOT_CAPABLE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.BROWSER_NOT_CAPABLE & String = js.native
    
    /* "downloadWorkbookNotAllowed" */ val DOWNLOAD_WORKBOOK_NOT_ALLOWED: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.DOWNLOAD_WORKBOOK_NOT_ALLOWED & String = js.native
    
    /* "filterCannotBePerformed" */ val FILTER_CANNOT_BE_PERFORMED: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.FILTER_CANNOT_BE_PERFORMED & String = js.native
    
    /* "indexOutOfRange" */ val INDEX_OUT_OF_RANGE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INDEX_OUT_OF_RANGE & String = js.native
    
    /* "internalError" */ val INTERNAL_ERROR: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INTERNAL_ERROR & String = js.native
    
    /* "invalidAggregationFieldName" */ val INVALID_AGGREGATION_FIELD_NAME: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_AGGREGATION_FIELD_NAME & String = js.native
    
    /* "invalidCustomViewName" */ val INVALID_CUSTOM_VIEW_NAME: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_CUSTOM_VIEW_NAME & String = js.native
    
    /* "invalidDateParameter" */ val INVALID_DATE_PARAMETER: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_DATE_PARAMETER & String = js.native
    
    /* "invalidFilterFieldName" */ val INVALID_FILTER_FIELDNAME: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_FILTER_FIELDNAME & String = js.native
    
    /* "invalidFilterFieldNameOrValue" */ val INVALID_FILTER_FIELDNAME_OR_VALUE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_FILTER_FIELDNAME_OR_VALUE & String = js.native
    
    /* "invalidFilterFieldValue" */ val INVALID_FILTER_FIELDVALUE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_FILTER_FIELDVALUE & String = js.native
    
    /* "invalidParameter" */ val INVALID_PARAMETER: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_PARAMETER & String = js.native
    
    /* "invalidSelectionDate" */ val INVALID_SELECTION_DATE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_SELECTION_DATE & String = js.native
    
    /* "invalidSelectionFieldname" */ val INVALID_SELECTION_FIELDNAME: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_SELECTION_FIELDNAME & String = js.native
    
    /* "invalidSelectionValue" */ val INVALID_SELECTION_VALUE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_SELECTION_VALUE & String = js.native
    
    /* "invalidSize" */ val INVALID_SIZE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_SIZE & String = js.native
    
    /* "invalidSizeBehaviorOnWorksheet" */ val INVALID_SIZE_BEHAVIOR_ON_WORKSHEET: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_SIZE_BEHAVIOR_ON_WORKSHEET & String = js.native
    
    /* "invalidUrl" */ val INVALID_URL: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.INVALID_URL & String = js.native
    
    /* "missingMaxSize" */ val MISSING_MAX_SIZE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.MISSING_MAX_SIZE & String = js.native
    
    /* "missingMinMaxSize" */ val MISSING_MINMAX_SIZE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.MISSING_MINMAX_SIZE & String = js.native
    
    /* "missingMinSize" */ val MISSING_MIN_SIZE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.MISSING_MIN_SIZE & String = js.native
    
    /* "missingRangeNForRelativeDateFilters" */ val MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.MISSING_RANGEN_FOR_RELATIVE_DATE_FILTERS & String = js.native
    
    /* "notActiveSheet" */ val NOT_ACTIVE_SHEET: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.NOT_ACTIVE_SHEET & String = js.native
    
    /* "noUrlForHiddenWorksheet" */ val NO_URL_FOR_HIDDEN_WORKSHEET: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.NO_URL_FOR_HIDDEN_WORKSHEET & String = js.native
    
    /* "noUrlOrParentElementNotFound" */ val NO_URL_OR_PARENT_ELEMENT_NOT_FOUND: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.NO_URL_OR_PARENT_ELEMENT_NOT_FOUND & String = js.native
    
    /* "nullOrEmptyParameter" */ val NULL_OR_EMPTY_PARAMETER: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.NULL_OR_EMPTY_PARAMETER & String = js.native
    
    /* "serverError" */ val SERVER_ERROR: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.SERVER_ERROR & String = js.native
    
    /* "sheetNotInWorkbook" */ val SHEET_NOT_IN_WORKBOOK: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.SHEET_NOT_IN_WORKBOOK & String = js.native
    
    /* "staleDataReference" */ val STALE_DATA_REFERENCE: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.STALE_DATA_REFERENCE & String = js.native
    
    /* "unsupportedEventName" */ val UNSUPPORTED_EVENT_NAME: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.UNSUPPORTED_EVENT_NAME & String = js.native
    
    /* "vizAlreadyInManager" */ val VIZ_ALREADY_IN_MANAGER: typingsJapgolly.tableauJsApi.enumsMod.ErrorCode.VIZ_ALREADY_IN_MANAGER & String = js.native
  }
  
  @JSImport("tableau-js-api", "FieldAggregationType")
  @js.native
  object FieldAggregationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType & String] = js.native
    
    /* "ATTR" */ val ATTR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.ATTR & String = js.native
    
    /* "AVG" */ val AVG: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.AVG & String = js.native
    
    /* "COLLECT" */ val COLLECT: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.COLLECT & String = js.native
    
    /* "COUNT" */ val COUNT: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.COUNT & String = js.native
    
    /* "COUNTD" */ val COUNTD: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.COUNTD & String = js.native
    
    /* "DAY" */ val DAY: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.DAY & String = js.native
    
    /* "END" */ val END: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.END & String = js.native
    
    /* "HOUR" */ val HOUR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.HOUR & String = js.native
    
    /* "INOUT" */ val INOUT: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.INOUT & String = js.native
    
    /* "KURTOSIS" */ val KURTOSIS: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.KURTOSIS & String = js.native
    
    /* "MAX" */ val MAX: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.MAX & String = js.native
    
    /* "MDY" */ val MDY: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.MDY & String = js.native
    
    /* "MEDIAN" */ val MEDIAN: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.MEDIAN & String = js.native
    
    /* "MIN" */ val MIN: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.MIN & String = js.native
    
    /* "MINUTE" */ val MINUTE: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.MINUTE & String = js.native
    
    /* "MONTH" */ val MONTH: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.MONTH & String = js.native
    
    /* "MONTHYEAR" */ val MONTHYEAR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.MONTHYEAR & String = js.native
    
    /* "NONE" */ val NONE: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.NONE & String = js.native
    
    /* "PERCENTILE" */ val PERCENTILE: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.PERCENTILE & String = js.native
    
    /* "QTR" */ val QTR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.QTR & String = js.native
    
    /* "QUART1" */ val QUART1: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.QUART1 & String = js.native
    
    /* "QUART3" */ val QUART3: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.QUART3 & String = js.native
    
    /* "SECOND" */ val SECOND: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.SECOND & String = js.native
    
    /* "SKEWNESS" */ val SKEWNESS: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.SKEWNESS & String = js.native
    
    /* "STDEV" */ val STDEV: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.STDEV & String = js.native
    
    /* "STDEVP" */ val STDEVP: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.STDEVP & String = js.native
    
    /* "SUM" */ val SUM: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.SUM & String = js.native
    
    /* "SUM_XSQR" */ val SUM_XSQR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.SUM_XSQR & String = js.native
    
    /* "TRUNC_DAY" */ val TRUNC_DAY: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_DAY & String = js.native
    
    /* "TRUNC_HOUR" */ val TRUNC_HOUR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_HOUR & String = js.native
    
    /* "TRUNC_MINUTE" */ val TRUNC_MINUTE: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_MINUTE & String = js.native
    
    /* "TRUNC_MONTH" */ val TRUNC_MONTH: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_MONTH & String = js.native
    
    /* "TRUNC_QTR" */ val TRUNC_QTR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_QTR & String = js.native
    
    /* "TRUNC_SECOND" */ val TRUNC_SECOND: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_SECOND & String = js.native
    
    /* "TRUNC_WEEK" */ val TRUNC_WEEK: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_WEEK & String = js.native
    
    /* "TRUNC_YEAR" */ val TRUNC_YEAR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.TRUNC_YEAR & String = js.native
    
    /* "USER" */ val USER: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.USER & String = js.native
    
    /* "VAR" */ val VAR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.VAR & String = js.native
    
    /* "VARP" */ val VARP: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.VARP & String = js.native
    
    /* "WEEK" */ val WEEK: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.WEEK & String = js.native
    
    /* "WEEKDAY" */ val WEEKDAY: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.WEEKDAY & String = js.native
    
    /* "YEAR" */ val YEAR: typingsJapgolly.tableauJsApi.enumsMod.FieldAggregationType.YEAR & String = js.native
  }
  
  @JSImport("tableau-js-api", "FieldRoleType")
  @js.native
  object FieldRoleType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.FieldRoleType & String] = js.native
    
    /* "dimension" */ val DIMENSION: typingsJapgolly.tableauJsApi.enumsMod.FieldRoleType.DIMENSION & String = js.native
    
    /* "measure" */ val MEASURE: typingsJapgolly.tableauJsApi.enumsMod.FieldRoleType.MEASURE & String = js.native
    
    /* "unknown" */ val UNKNOWN: typingsJapgolly.tableauJsApi.enumsMod.FieldRoleType.UNKNOWN & String = js.native
  }
  
  @JSImport("tableau-js-api", "FilterType")
  @js.native
  object FilterType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.FilterType & String] = js.native
    
    /* "categorical" */ val CATEGORICAL: typingsJapgolly.tableauJsApi.enumsMod.FilterType.CATEGORICAL & String = js.native
    
    /* "hierarchical" */ val HIERARCHICAL: typingsJapgolly.tableauJsApi.enumsMod.FilterType.HIERARCHICAL & String = js.native
    
    /* "quantitative" */ val QUANTITATIVE: typingsJapgolly.tableauJsApi.enumsMod.FilterType.QUANTITATIVE & String = js.native
    
    /* "relativedate" */ val RELATIVEDATE: typingsJapgolly.tableauJsApi.enumsMod.FilterType.RELATIVEDATE & String = js.native
  }
  
  @JSImport("tableau-js-api", "FilterUpdateType")
  @js.native
  object FilterUpdateType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.FilterUpdateType & String] = js.native
    
    /* "add" */ val ADD: typingsJapgolly.tableauJsApi.enumsMod.FilterUpdateType.ADD & String = js.native
    
    /* "all" */ val ALL: typingsJapgolly.tableauJsApi.enumsMod.FilterUpdateType.ALL & String = js.native
    
    /* "remove" */ val REMOVE: typingsJapgolly.tableauJsApi.enumsMod.FilterUpdateType.REMOVE & String = js.native
    
    /* "replace" */ val REPLACE: typingsJapgolly.tableauJsApi.enumsMod.FilterUpdateType.REPLACE & String = js.native
  }
  
  @JSImport("tableau-js-api", "NullOption")
  @js.native
  object NullOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.NullOption & String] = js.native
    
    /* "allValues" */ val ALL_VALUES: typingsJapgolly.tableauJsApi.enumsMod.NullOption.ALL_VALUES & String = js.native
    
    /* "nonNullValues" */ val NON_NULL_VALUES: typingsJapgolly.tableauJsApi.enumsMod.NullOption.NON_NULL_VALUES & String = js.native
    
    /* "nullValues" */ val NULL_VALUES: typingsJapgolly.tableauJsApi.enumsMod.NullOption.NULL_VALUES & String = js.native
  }
  
  @JSImport("tableau-js-api", "ParameterAllowableValuesType")
  @js.native
  object ParameterAllowableValuesType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.ParameterAllowableValuesType & String] = js.native
    
    /* "all" */ val ALL: typingsJapgolly.tableauJsApi.enumsMod.ParameterAllowableValuesType.ALL & String = js.native
    
    /* "list" */ val LIST: typingsJapgolly.tableauJsApi.enumsMod.ParameterAllowableValuesType.LIST & String = js.native
    
    /* "range" */ val RANGE: typingsJapgolly.tableauJsApi.enumsMod.ParameterAllowableValuesType.RANGE & String = js.native
  }
  
  @JSImport("tableau-js-api", "ParameterDataType")
  @js.native
  object ParameterDataType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.ParameterDataType & String] = js.native
    
    /* "boolean" */ val BOOLEAN: typingsJapgolly.tableauJsApi.enumsMod.ParameterDataType.BOOLEAN & String = js.native
    
    /* "date" */ val DATE: typingsJapgolly.tableauJsApi.enumsMod.ParameterDataType.DATE & String = js.native
    
    /* "datetime" */ val DATETIME: typingsJapgolly.tableauJsApi.enumsMod.ParameterDataType.DATETIME & String = js.native
    
    /* "float" */ val FLOAT: typingsJapgolly.tableauJsApi.enumsMod.ParameterDataType.FLOAT & String = js.native
    
    /* "integer" */ val INTEGER: typingsJapgolly.tableauJsApi.enumsMod.ParameterDataType.INTEGER & String = js.native
    
    /* "string" */ val STRING: typingsJapgolly.tableauJsApi.enumsMod.ParameterDataType.STRING & String = js.native
  }
  
  @JSImport("tableau-js-api", "PeriodType")
  @js.native
  object PeriodType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.PeriodType & String] = js.native
    
    /* "day" */ val DAY: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.DAY & String = js.native
    
    /* "hour" */ val HOUR: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.HOUR & String = js.native
    
    /* "minute" */ val MINUTE: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.MINUTE & String = js.native
    
    /* "month" */ val MONTH: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.MONTH & String = js.native
    
    /* "quarter" */ val QUARTER: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.QUARTER & String = js.native
    
    /* "second" */ val SECOND: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.SECOND & String = js.native
    
    /* "week" */ val WEEK: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.WEEK & String = js.native
    
    /* "year" */ val YEAR: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.YEAR & String = js.native
  }
  
  @JSImport("tableau-js-api", "SelectionUpdateType")
  @js.native
  object SelectionUpdateType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.SelectionUpdateType & String] = js.native
    
    /* "add" */ val ADD: typingsJapgolly.tableauJsApi.enumsMod.SelectionUpdateType.ADD & String = js.native
    
    /* "remove" */ val REMOVE: typingsJapgolly.tableauJsApi.enumsMod.SelectionUpdateType.REMOVE & String = js.native
    
    /* "replace" */ val REPLACE: typingsJapgolly.tableauJsApi.enumsMod.SelectionUpdateType.REPLACE & String = js.native
  }
  
  @JSImport("tableau-js-api", "SheetSizeBehavior")
  @js.native
  object SheetSizeBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior & String] = js.native
    
    /* "atleast" */ val ATLEAST: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.ATLEAST & String = js.native
    
    /* "atmost" */ val ATMOST: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.ATMOST & String = js.native
    
    /* "automatic" */ val AUTOMATIC: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.AUTOMATIC & String = js.native
    
    /* "exactly" */ val EXACTLY: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.EXACTLY & String = js.native
    
    /* "range" */ val RANGE: typingsJapgolly.tableauJsApi.enumsMod.SheetSizeBehavior.RANGE & String = js.native
  }
  
  @JSImport("tableau-js-api", "SheetType")
  @js.native
  object SheetType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.SheetType & String] = js.native
    
    /* "dashboard" */ val DASHBOARD: typingsJapgolly.tableauJsApi.enumsMod.SheetType.DASHBOARD & String = js.native
    
    /* "story" */ val STORY: typingsJapgolly.tableauJsApi.enumsMod.SheetType.STORY & String = js.native
    
    /* "worksheet" */ val WORKSHEET: typingsJapgolly.tableauJsApi.enumsMod.SheetType.WORKSHEET & String = js.native
  }
  
  @JSImport("tableau-js-api", "TableauEventName")
  @js.native
  object TableauEventName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.TableauEventName & String] = js.native
    
    /* "customviewload" */ val CUSTOM_VIEW_LOAD: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_LOAD & String = js.native
    
    /* "customviewremove" */ val CUSTOM_VIEW_REMOVE: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_REMOVE & String = js.native
    
    /* "customviewsave" */ val CUSTOM_VIEW_SAVE: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_SAVE & String = js.native
    
    /* "customviewsetdefault" */ val CUSTOM_VIEW_SET_DEFAULT: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_SET_DEFAULT & String = js.native
    
    /* "filterchange" */ val FILTER_CHANGE: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.FILTER_CHANGE & String = js.native
    
    /* "firstinteractive" */ val FIRST_INTERACTIVE: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.FIRST_INTERACTIVE & String = js.native
    
    /* "firstvizsizeknown" */ val FIRST_VIZ_SIZE_KNOWN: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.FIRST_VIZ_SIZE_KNOWN & String = js.native
    
    /* "markshighlight" */ val MARKS_HIGHLIGHT: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.MARKS_HIGHLIGHT & String = js.native
    
    /* "marksselection" */ val MARKS_SELECTION: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.MARKS_SELECTION & String = js.native
    
    /* "parametervaluechange" */ val PARAMETER_VALUE_CHANGE: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.PARAMETER_VALUE_CHANGE & String = js.native
    
    /* "storypointswitch" */ val STORY_POINT_SWITCH: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.STORY_POINT_SWITCH & String = js.native
    
    /* "tabswitch" */ val TAB_SWITCH: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.TAB_SWITCH & String = js.native
    
    /* "toolbarstatechange" */ val TOOLBAR_STATE_CHANGE: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.TOOLBAR_STATE_CHANGE & String = js.native
    
    /* "urlaction" */ val URL_ACTION: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.URL_ACTION & String = js.native
    
    /* "vizresize" */ val VIZ_RESIZE: typingsJapgolly.tableauJsApi.enumsMod.TableauEventName.VIZ_RESIZE & String = js.native
  }
  
  @JSImport("tableau-js-api", "ToolbarButtonName")
  @js.native
  object ToolbarButtonName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.ToolbarButtonName & String] = js.native
    
    /* "redo" */ val REDO: typingsJapgolly.tableauJsApi.enumsMod.ToolbarButtonName.REDO & String = js.native
    
    /* "undo" */ val UNDO: typingsJapgolly.tableauJsApi.enumsMod.ToolbarButtonName.UNDO & String = js.native
  }
  
  @JSImport("tableau-js-api", "ToolbarPosition")
  @js.native
  object ToolbarPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.tableauJsApi.enumsMod.ToolbarPosition & String] = js.native
    
    /* "bottom" */ val BOTTOM: typingsJapgolly.tableauJsApi.enumsMod.ToolbarPosition.BOTTOM & String = js.native
    
    /* "top" */ val TOP: typingsJapgolly.tableauJsApi.enumsMod.ToolbarPosition.TOP & String = js.native
  }
  
  @JSImport("tableau-js-api", "ToolbarState")
  @js.native
  open class ToolbarState ()
    extends typingsJapgolly.tableauJsApi.vizMod.ToolbarState
  
  @JSImport("tableau-js-api", "Viz")
  @js.native
  open class Viz protected ()
    extends typingsJapgolly.tableauJsApi.vizMod.Viz {
    def this(parentElement: HTMLElement, url: String, options: VizCreateOptions) = this()
  }
  
  @JSImport("tableau-js-api", "VizManager")
  @js.native
  open class VizManager ()
    extends typingsJapgolly.tableauJsApi.vizMod.VizManager
}
