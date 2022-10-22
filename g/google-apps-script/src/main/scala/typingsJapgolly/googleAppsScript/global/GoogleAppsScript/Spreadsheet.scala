package typingsJapgolly.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spreadsheet {
  
  /**
    * An enumeration of the types of series used to calculate auto-filled values. The manner in which
    * these series affect calculated values differs depending on the type and amount of source data.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.AutoFillSeries")
  @js.native
  object AutoFillSeries extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.AutoFillSeries & Double
      ] = js.native
    
    /* 1 */ val ALTERNATE_SERIES: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.AutoFillSeries.ALTERNATE_SERIES & Double = js.native
    
    /* 0 */ val DEFAULT_SERIES: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.AutoFillSeries.DEFAULT_SERIES & Double = js.native
  }
  
  /**
    * An enumeration of banding themes. Each theme consists of several complementary colors that are
    * applied to different cells based on the banding settings.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.BandingTheme")
  @js.native
  object BandingTheme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme & Double
      ] = js.native
    
    /* 5 */ val BLUE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.BLUE & Double = js.native
    
    /* 8 */ val BROWN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.BROWN & Double = js.native
    
    /* 1 */ val CYAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.CYAN & Double = js.native
    
    /* 2 */ val GREEN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.GREEN & Double = js.native
    
    /* 7 */ val GREY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.GREY & Double = js.native
    
    /* 10 */ val INDIGO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.INDIGO & Double = js.native
    
    /* 9 */ val LIGHT_GREEN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.LIGHT_GREEN & Double = js.native
    
    /* 0 */ val LIGHT_GREY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.LIGHT_GREY & Double = js.native
    
    /* 4 */ val ORANGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.ORANGE & Double = js.native
    
    /* 11 */ val PINK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.PINK & Double = js.native
    
    /* 6 */ val TEAL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.TEAL & Double = js.native
    
    /* 3 */ val YELLOW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BandingTheme.YELLOW & Double = js.native
  }
  
  /**
    * An enumeration representing the boolean criteria that can be used in conditional format or
    * filter.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.BooleanCriteria")
  @js.native
  object BooleanCriteria extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria & Double
      ] = js.native
    
    /* 0 */ val CELL_EMPTY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.CELL_EMPTY & Double = js.native
    
    /* 1 */ val CELL_NOT_EMPTY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.CELL_NOT_EMPTY & Double = js.native
    
    /* 21 */ val CUSTOM_FORMULA: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.CUSTOM_FORMULA & Double = js.native
    
    /* 2 */ val DATE_AFTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_AFTER & Double = js.native
    
    /* 5 */ val DATE_AFTER_RELATIVE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_AFTER_RELATIVE & Double = js.native
    
    /* 3 */ val DATE_BEFORE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_BEFORE & Double = js.native
    
    /* 6 */ val DATE_BEFORE_RELATIVE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_BEFORE_RELATIVE & Double = js.native
    
    /* 4 */ val DATE_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_EQUAL_TO & Double = js.native
    
    /* 7 */ val DATE_EQUAL_TO_RELATIVE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.DATE_EQUAL_TO_RELATIVE & Double = js.native
    
    /* 8 */ val NUMBER_BETWEEN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_BETWEEN & Double = js.native
    
    /* 9 */ val NUMBER_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_EQUAL_TO & Double = js.native
    
    /* 10 */ val NUMBER_GREATER_THAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_GREATER_THAN & Double = js.native
    
    /* 11 */ val NUMBER_GREATER_THAN_OR_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_GREATER_THAN_OR_EQUAL_TO & Double = js.native
    
    /* 12 */ val NUMBER_LESS_THAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_LESS_THAN & Double = js.native
    
    /* 13 */ val NUMBER_LESS_THAN_OR_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_LESS_THAN_OR_EQUAL_TO & Double = js.native
    
    /* 14 */ val NUMBER_NOT_BETWEEN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_NOT_BETWEEN & Double = js.native
    
    /* 15 */ val NUMBER_NOT_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.NUMBER_NOT_EQUAL_TO & Double = js.native
    
    /* 16 */ val TEXT_CONTAINS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_CONTAINS & Double = js.native
    
    /* 17 */ val TEXT_DOES_NOT_CONTAIN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_DOES_NOT_CONTAIN & Double = js.native
    
    /* 20 */ val TEXT_ENDS_WITH: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_ENDS_WITH & Double = js.native
    
    /* 18 */ val TEXT_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_EQUAL_TO & Double = js.native
    
    /* 19 */ val TEXT_STARTS_WITH: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BooleanCriteria.TEXT_STARTS_WITH & Double = js.native
  }
  
  /**
    * Styles that can be set on a range using Range.setBorder(top, left, bottom, right, vertical, horizontal, color, style).
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.BorderStyle")
  @js.native
  object BorderStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle & Double
      ] = js.native
    
    /* 1 */ val DASHED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.DASHED & Double = js.native
    
    /* 0 */ val DOTTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.DOTTED & Double = js.native
    
    /* 5 */ val DOUBLE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.DOUBLE & Double = js.native
    
    /* 2 */ val SOLID: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.SOLID & Double = js.native
    
    /* 3 */ val SOLID_MEDIUM: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.SOLID_MEDIUM & Double = js.native
    
    /* 4 */ val SOLID_THICK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.BorderStyle.SOLID_THICK & Double = js.native
  }
  
  /**
    * An enumeration of possible special paste types.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.CopyPasteType")
  @js.native
  object CopyPasteType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType & Double
      ] = js.native
    
    /* 7 */ val PASTE_COLUMN_WIDTHS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_COLUMN_WIDTHS & Double = js.native
    
    /* 6 */ val PASTE_CONDITIONAL_FORMATTING: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_CONDITIONAL_FORMATTING & Double = js.native
    
    /* 4 */ val PASTE_DATA_VALIDATION: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_DATA_VALIDATION & Double = js.native
    
    /* 2 */ val PASTE_FORMAT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_FORMAT & Double = js.native
    
    /* 3 */ val PASTE_FORMULA: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_FORMULA & Double = js.native
    
    /* 0 */ val PASTE_NORMAL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_NORMAL & Double = js.native
    
    /* 1 */ val PASTE_NO_BORDERS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_NO_BORDERS & Double = js.native
    
    /* 5 */ val PASTE_VALUES: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.CopyPasteType.PASTE_VALUES & Double = js.native
  }
  
  /**
    * An enumeration of data execution error codes.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionErrorCode")
  @js.native
  object DataExecutionErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode & Double
      ] = js.native
    
    /* 0 */ val DATA_EXECUTION_ERROR_CODE_UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.DATA_EXECUTION_ERROR_CODE_UNSUPPORTED & Double = js.native
    
    /* 8 */ val DUPLICATE_COLUMN_NAMES: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.DUPLICATE_COLUMN_NAMES & Double = js.native
    
    /* 5 */ val ENGINE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.ENGINE & Double = js.native
    
    /* 9 */ val INTERRUPTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.INTERRUPTED & Double = js.native
    
    /* 1 */ val NONE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.NONE & Double = js.native
    
    /* 10 */ val OTHER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.OTHER & Double = js.native
    
    /* 6 */ val PARAMETER_INVALID: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.PARAMETER_INVALID & Double = js.native
    
    /* 2 */ val TIME_OUT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TIME_OUT & Double = js.native
    
    /* 4 */ val TOO_MANY_CELLS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TOO_MANY_CELLS & Double = js.native
    
    /* 11 */ val TOO_MANY_CHARS_PER_CELL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TOO_MANY_CHARS_PER_CELL & Double = js.native
    
    /* 3 */ val TOO_MANY_ROWS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.TOO_MANY_ROWS & Double = js.native
    
    /* 7 */ val UNSUPPORTED_DATA_TYPE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionErrorCode.UNSUPPORTED_DATA_TYPE & Double = js.native
  }
  
  /**
    * An enumeration of data execution states.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionState")
  @js.native
  object DataExecutionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState & Double
      ] = js.native
    
    /* 0 */ val DATA_EXECUTION_STATE_UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.DATA_EXECUTION_STATE_UNSUPPORTED & Double = js.native
    
    /* 3 */ val ERROR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.ERROR & Double = js.native
    
    /* 4 */ val NOT_STARTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.NOT_STARTED & Double = js.native
    
    /* 1 */ val RUNNING: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.RUNNING & Double = js.native
    
    /* 2 */ val SUCCESS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataExecutionState.SUCCESS & Double = js.native
  }
  
  /**
    * An enumeration of data source parameter types.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceParameterType")
  @js.native
  object DataSourceParameterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceParameterType & Double
      ] = js.native
    
    /* 1 */ val CELL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceParameterType.CELL & Double = js.native
    
    /* 0 */ val DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceParameterType.DATA_SOURCE_PARAMETER_TYPE_UNSUPPORTED & Double = js.native
  }
  
  /**
    * An enumeration of data source types.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DataSourceType")
  @js.native
  object DataSourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceType & Double
      ] = js.native
    
    /* 1 */ val BIGQUERY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceType.BIGQUERY & Double = js.native
    
    /* 0 */ val DATA_SOURCE_TYPE_UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataSourceType.DATA_SOURCE_TYPE_UNSUPPORTED & Double = js.native
  }
  
  /**
    * An enumeration representing the data validation criteria that can be set on a range.
    *
    *     // Change existing data-validation rules that require a date in 2013 to require a date in 2014.
    *     var oldDates = [new Date('1/1/2013'), new Date('12/31/2013')];
    *     var newDates = [new Date('1/1/2014'), new Date('12/31/2014')];
    *     var sheet = SpreadsheetApp.getActiveSheet();
    *     var range = sheet.getRange(1, 1, sheet.getMaxRows(), sheet.getMaxColumns());
    *     var rules = range.getDataValidations();
    *
    *     for (var i = 0; i < rules.length; i++) {
    *       for (var j = 0; j < rules[i].length; j++) {
    *         var rule = rules[i][j];
    *
    *         if (rule != null) {
    *           var criteria = rule.getCriteriaType();
    *           var args = rule.getCriteriaValues();
    *
    *           if (criteria == SpreadsheetApp.DataValidationCriteria.DATE_BETWEEN
    *               && args[0].getTime() == oldDates[0].getTime()
    *               && args[1].getTime() == oldDates[1].getTime()) {
    *             // Create a builder from the existing rule, then change the dates.
    *             rules[i][j] = rule.copy().withCriteria(criteria, newDates).build();
    *           }
    *         }
    *       }
    *     }
    *     range.setDataValidations(rules);
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DataValidationCriteria")
  @js.native
  object DataValidationCriteria extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria & Double
      ] = js.native
    
    /* 24 */ val CHECKBOX: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.CHECKBOX & Double = js.native
    
    /* 23 */ val CUSTOM_FORMULA: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.CUSTOM_FORMULA & Double = js.native
    
    /* 0 */ val DATE_AFTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_AFTER & Double = js.native
    
    /* 1 */ val DATE_BEFORE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_BEFORE & Double = js.native
    
    /* 2 */ val DATE_BETWEEN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_BETWEEN & Double = js.native
    
    /* 3 */ val DATE_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_EQUAL_TO & Double = js.native
    
    /* 4 */ val DATE_IS_VALID_DATE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_IS_VALID_DATE & Double = js.native
    
    /* 5 */ val DATE_NOT_BETWEEN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_NOT_BETWEEN & Double = js.native
    
    /* 6 */ val DATE_ON_OR_AFTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_ON_OR_AFTER & Double = js.native
    
    /* 7 */ val DATE_ON_OR_BEFORE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.DATE_ON_OR_BEFORE & Double = js.native
    
    /* 8 */ val NUMBER_BETWEEN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_BETWEEN & Double = js.native
    
    /* 9 */ val NUMBER_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_EQUAL_TO & Double = js.native
    
    /* 10 */ val NUMBER_GREATER_THAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_GREATER_THAN & Double = js.native
    
    /* 11 */ val NUMBER_GREATER_THAN_OR_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_GREATER_THAN_OR_EQUAL_TO & Double = js.native
    
    /* 12 */ val NUMBER_LESS_THAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_LESS_THAN & Double = js.native
    
    /* 13 */ val NUMBER_LESS_THAN_OR_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_LESS_THAN_OR_EQUAL_TO & Double = js.native
    
    /* 14 */ val NUMBER_NOT_BETWEEN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_NOT_BETWEEN & Double = js.native
    
    /* 15 */ val NUMBER_NOT_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.NUMBER_NOT_EQUAL_TO & Double = js.native
    
    /* 16 */ val TEXT_CONTAINS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_CONTAINS & Double = js.native
    
    /* 17 */ val TEXT_DOES_NOT_CONTAIN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_DOES_NOT_CONTAIN & Double = js.native
    
    /* 18 */ val TEXT_EQUAL_TO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_EQUAL_TO & Double = js.native
    
    /* 19 */ val TEXT_IS_VALID_EMAIL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_IS_VALID_EMAIL & Double = js.native
    
    /* 20 */ val TEXT_IS_VALID_URL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.TEXT_IS_VALID_URL & Double = js.native
    
    /* 21 */ val VALUE_IN_LIST: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.VALUE_IN_LIST & Double = js.native
    
    /* 22 */ val VALUE_IN_RANGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DataValidationCriteria.VALUE_IN_RANGE & Double = js.native
  }
  
  /**
    * An enumeration of the types of developer metadata location types.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType")
  @js.native
  object DeveloperMetadataLocationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType & Double
      ] = js.native
    
    /* 3 */ val COLUMN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.COLUMN & Double = js.native
    
    /* 2 */ val ROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.ROW & Double = js.native
    
    /* 1 */ val SHEET: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.SHEET & Double = js.native
    
    /* 0 */ val SPREADSHEET: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataLocationType.SPREADSHEET & Double = js.native
  }
  
  /**
    * An enumeration of the types of developer metadata visibility.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility")
  @js.native
  object DeveloperMetadataVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility & Double
      ] = js.native
    
    /* 0 */ val DOCUMENT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility.DOCUMENT & Double = js.native
    
    /* 1 */ val PROJECT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.DeveloperMetadataVisibility.PROJECT & Double = js.native
  }
  
  /**
    * An enumeration of possible directions along which data can be stored in a spreadsheet.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.Dimension")
  @js.native
  object Dimension extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Dimension & Double] = js.native
    
    /* 0 */ val COLUMNS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Dimension.COLUMNS & Double = js.native
    
    /* 1 */ val ROWS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Dimension.ROWS & Double = js.native
  }
  
  /**
    * An enumeration representing the possible directions that one can move within a spreadsheet using
    * the arrow keys.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction & Double] = js.native
    
    /* 1 */ val DOWN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction.DOWN & Double = js.native
    
    /* 3 */ val NEXT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction.NEXT & Double = js.native
    
    /* 2 */ val PREVIOUS: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction.PREVIOUS & Double = js.native
    
    /* 0 */ val UP: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Direction.UP & Double = js.native
  }
  
  /**
    * An enumeration representing the possible positions that a group control toggle can have.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.GroupControlTogglePosition")
  @js.native
  object GroupControlTogglePosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.GroupControlTogglePosition & Double
      ] = js.native
    
    /* 1 */ val AFTER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.GroupControlTogglePosition.AFTER & Double = js.native
    
    /* 0 */ val BEFORE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.GroupControlTogglePosition.BEFORE & Double = js.native
  }
  
  /**
    * An enumeration representing the interpolation options for calculating a value to be used in a
    * GradientCondition in a ConditionalFormatRule.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.InterpolationType")
  @js.native
  object InterpolationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType & Double
      ] = js.native
    
    /* 4 */ val MAX: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.MAX & Double = js.native
    
    /* 3 */ val MIN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.MIN & Double = js.native
    
    /* 0 */ val NUMBER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.NUMBER & Double = js.native
    
    /* 1 */ val PERCENT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.PERCENT & Double = js.native
    
    /* 2 */ val PERCENTILE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.InterpolationType.PERCENTILE & Double = js.native
  }
  
  /**
    * An enumeration of functions that summarize pivot table data.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction")
  @js.native
  object PivotTableSummarizeFunction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction & Double
      ] = js.native
    
    /* 5 */ val AVERAGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.AVERAGE & Double = js.native
    
    /* 3 */ val COUNT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.COUNT & Double = js.native
    
    /* 2 */ val COUNTA: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.COUNTA & Double = js.native
    
    /* 4 */ val COUNTUNIQUE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.COUNTUNIQUE & Double = js.native
    
    /* 0 */ val CUSTOM: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.CUSTOM & Double = js.native
    
    /* 6 */ val MAX: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.MAX & Double = js.native
    
    /* 8 */ val MEDIAN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.MEDIAN & Double = js.native
    
    /* 7 */ val MIN: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.MIN & Double = js.native
    
    /* 9 */ val PRODUCT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.PRODUCT & Double = js.native
    
    /* 10 */ val STDEV: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.STDEV & Double = js.native
    
    /* 11 */ val STDEVP: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.STDEVP & Double = js.native
    
    /* 1 */ val SUM: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.SUM & Double = js.native
    
    /* 12 */ val VAR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.VAR & Double = js.native
    
    /* 13 */ val VARP: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotTableSummarizeFunction.VARP & Double = js.native
  }
  
  /**
    * An enumeration of ways to display a pivot value as a function of another value.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.PivotValueDisplayType")
  @js.native
  object PivotValueDisplayType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType & Double
      ] = js.native
    
    /* 0 */ val DEFAULT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.DEFAULT & Double = js.native
    
    /* 2 */ val PERCENT_OF_COLUMN_TOTAL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.PERCENT_OF_COLUMN_TOTAL & Double = js.native
    
    /* 3 */ val PERCENT_OF_GRAND_TOTAL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.PERCENT_OF_GRAND_TOTAL & Double = js.native
    
    /* 1 */ val PERCENT_OF_ROW_TOTAL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.PivotValueDisplayType.PERCENT_OF_ROW_TOTAL & Double = js.native
  }
  
  /**
    * An enumeration representing the parts of a spreadsheet that can be protected from edits.
    *
    *     // Remove all range protections in the spreadsheet that the user has permission to edit.
    *     var ss = SpreadsheetApp.getActive();
    *     var protections = ss.getProtections(SpreadsheetApp.ProtectionType.RANGE);
    *     for (var i = 0; i < protections.length; i++) {
    *       var protection = protections[i];
    *       if (protection.canEdit()) {
    *         protection.remove();
    *       }
    *     }
    *
    *     // Removes sheet protection from the active sheet, if the user has permission to edit it.
    *     var sheet = SpreadsheetApp.getActiveSheet();
    *     var protection = sheet.getProtections(SpreadsheetApp.ProtectionType.SHEET)[0];
    *     if (protection && protection.canEdit()) {
    *       protection.remove();
    *     }
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.ProtectionType")
  @js.native
  object ProtectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ProtectionType & Double
      ] = js.native
    
    /* 0 */ val RANGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ProtectionType.RANGE & Double = js.native
    
    /* 1 */ val SHEET: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ProtectionType.SHEET & Double = js.native
  }
  
  /**
    * An enumeration representing the possible intervals used in spreadsheet recalculation.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.RecalculationInterval")
  @js.native
  object RecalculationInterval extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RecalculationInterval & Double
      ] = js.native
    
    /* 2 */ val HOUR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RecalculationInterval.HOUR & Double = js.native
    
    /* 1 */ val MINUTE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RecalculationInterval.MINUTE & Double = js.native
    
    /* 0 */ val ON_CHANGE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RecalculationInterval.ON_CHANGE & Double = js.native
  }
  
  /**
    * An enumeration representing the relative date options for calculating a value to be used in
    * date-based BooleanCriteria.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.RelativeDate")
  @js.native
  object RelativeDate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate & Double
      ] = js.native
    
    /* 4 */ val PAST_MONTH: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_MONTH & Double = js.native
    
    /* 3 */ val PAST_WEEK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_WEEK & Double = js.native
    
    /* 5 */ val PAST_YEAR: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.PAST_YEAR & Double = js.native
    
    /* 0 */ val TODAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.TODAY & Double = js.native
    
    /* 1 */ val TOMORROW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.TOMORROW & Double = js.native
    
    /* 2 */ val YESTERDAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.RelativeDate.YESTERDAY & Double = js.native
  }
  
  /**
    * The different types of sheets that can exist in a spreadsheet.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.SheetType")
  @js.native
  object SheetType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.SheetType & Double] = js.native
    
    /* 0 */ val GRID: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.SheetType.GRID & Double = js.native
    
    /* 1 */ val OBJECT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.SheetType.OBJECT & Double = js.native
  }
  
  /**
    * An enumerations of text directions.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.TextDirection")
  @js.native
  object TextDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.TextDirection & Double
      ] = js.native
    
    /* 0 */ val LEFT_TO_RIGHT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.TextDirection.LEFT_TO_RIGHT & Double = js.native
    
    /* 1 */ val RIGHT_TO_LEFT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.TextDirection.RIGHT_TO_LEFT & Double = js.native
  }
  
  /**
    * An enumeration of the types of preset delimiters that can split a column of text into multiple
    * columns.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter")
  @js.native
  object TextToColumnsDelimiter extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter & Double
      ] = js.native
    
    /* 0 */ val COMMA: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter.COMMA & Double = js.native
    
    /* 2 */ val PERIOD: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter.PERIOD & Double = js.native
    
    /* 1 */ val SEMICOLON: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter.SEMICOLON & Double = js.native
    
    /* 3 */ val SPACE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter.SPACE & Double = js.native
  }
  
  /**
    * An enum which describes various color entries supported in themes.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.ThemeColorType")
  @js.native
  object ThemeColorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType & Double
      ] = js.native
    
    /* 3 */ val ACCENT1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT1 & Double = js.native
    
    /* 4 */ val ACCENT2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT2 & Double = js.native
    
    /* 5 */ val ACCENT3: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT3 & Double = js.native
    
    /* 6 */ val ACCENT4: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT4 & Double = js.native
    
    /* 7 */ val ACCENT5: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT5 & Double = js.native
    
    /* 8 */ val ACCENT6: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.ACCENT6 & Double = js.native
    
    /* 2 */ val BACKGROUND: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.BACKGROUND & Double = js.native
    
    /* 9 */ val HYPERLINK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.HYPERLINK & Double = js.native
    
    /* 1 */ val TEXT: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.TEXT & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.ThemeColorType.UNSUPPORTED & Double = js.native
  }
  
  /**
    * An enumeration of the strategies used to handle cell text wrapping.
    */
  @JSGlobal("GoogleAppsScript.Spreadsheet.WrapStrategy")
  @js.native
  object WrapStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.WrapStrategy & Double
      ] = js.native
    
    /* 2 */ val CLIP: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.WrapStrategy.CLIP & Double = js.native
    
    /* 1 */ val OVERFLOW: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.WrapStrategy.OVERFLOW & Double = js.native
    
    /* 0 */ val WRAP: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.WrapStrategy.WRAP & Double = js.native
  }
}
