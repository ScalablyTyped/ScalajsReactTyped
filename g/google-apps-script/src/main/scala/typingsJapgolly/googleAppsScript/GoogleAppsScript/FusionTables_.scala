package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Collection.ColumnCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Collection.QueryCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Collection.StyleCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Collection.TableCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Collection.TaskCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Collection.TemplateCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Bucket
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Column
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.ColumnBaseColumn
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.LineStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.PointStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.PolygonStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleFunction
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleFunctionGradient
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleFunctionGradientColors
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.StyleSetting
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Table
import typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTables_ extends js.Object {
  var Column: js.UndefOr[ColumnCollection] = js.undefined
  var Query: js.UndefOr[QueryCollection] = js.undefined
  var Style: js.UndefOr[StyleCollection] = js.undefined
  var Table: js.UndefOr[TableCollection] = js.undefined
  var Task: js.UndefOr[TaskCollection] = js.undefined
  var Template: js.UndefOr[TemplateCollection] = js.undefined
  // Create a new instance of Bucket
  def newBucket(): Bucket
  // Create a new instance of Column
  def newColumn(): Column
  // Create a new instance of ColumnBaseColumn
  def newColumnBaseColumn(): ColumnBaseColumn
  // Create a new instance of LineStyle
  def newLineStyle(): LineStyle
  // Create a new instance of PointStyle
  def newPointStyle(): PointStyle
  // Create a new instance of PolygonStyle
  def newPolygonStyle(): PolygonStyle
  // Create a new instance of StyleFunction
  def newStyleFunction(): StyleFunction
  // Create a new instance of StyleFunctionGradient
  def newStyleFunctionGradient(): StyleFunctionGradient
  // Create a new instance of StyleFunctionGradientColors
  def newStyleFunctionGradientColors(): StyleFunctionGradientColors
  // Create a new instance of StyleSetting
  def newStyleSetting(): StyleSetting
  // Create a new instance of Table
  def newTable(): Table
  // Create a new instance of Template
  def newTemplate(): Template
}

object FusionTables_ {
  @scala.inline
  def apply(
    newBucket: CallbackTo[Bucket],
    newColumn: CallbackTo[Column],
    newColumnBaseColumn: CallbackTo[ColumnBaseColumn],
    newLineStyle: CallbackTo[LineStyle],
    newPointStyle: CallbackTo[PointStyle],
    newPolygonStyle: CallbackTo[PolygonStyle],
    newStyleFunction: CallbackTo[StyleFunction],
    newStyleFunctionGradient: CallbackTo[StyleFunctionGradient],
    newStyleFunctionGradientColors: CallbackTo[StyleFunctionGradientColors],
    newStyleSetting: CallbackTo[StyleSetting],
    newTable: CallbackTo[Table],
    newTemplate: CallbackTo[Template],
    Column: ColumnCollection = null,
    Query: QueryCollection = null,
    Style: StyleCollection = null,
    Table: TableCollection = null,
    Task: TaskCollection = null,
    Template: TemplateCollection = null
  ): FusionTables_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newBucket")(newBucket.toJsFn)
    __obj.updateDynamic("newColumn")(newColumn.toJsFn)
    __obj.updateDynamic("newColumnBaseColumn")(newColumnBaseColumn.toJsFn)
    __obj.updateDynamic("newLineStyle")(newLineStyle.toJsFn)
    __obj.updateDynamic("newPointStyle")(newPointStyle.toJsFn)
    __obj.updateDynamic("newPolygonStyle")(newPolygonStyle.toJsFn)
    __obj.updateDynamic("newStyleFunction")(newStyleFunction.toJsFn)
    __obj.updateDynamic("newStyleFunctionGradient")(newStyleFunctionGradient.toJsFn)
    __obj.updateDynamic("newStyleFunctionGradientColors")(newStyleFunctionGradientColors.toJsFn)
    __obj.updateDynamic("newStyleSetting")(newStyleSetting.toJsFn)
    __obj.updateDynamic("newTable")(newTable.toJsFn)
    __obj.updateDynamic("newTemplate")(newTemplate.toJsFn)
    if (Column != null) __obj.updateDynamic("Column")(Column.asInstanceOf[js.Any])
    if (Query != null) __obj.updateDynamic("Query")(Query.asInstanceOf[js.Any])
    if (Style != null) __obj.updateDynamic("Style")(Style.asInstanceOf[js.Any])
    if (Table != null) __obj.updateDynamic("Table")(Table.asInstanceOf[js.Any])
    if (Task != null) __obj.updateDynamic("Task")(Task.asInstanceOf[js.Any])
    if (Template != null) __obj.updateDynamic("Template")(Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusionTables_]
  }
}

