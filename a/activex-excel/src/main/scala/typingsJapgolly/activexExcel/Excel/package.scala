package typingsJapgolly.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Excel {
  type AddIns2 = typingsJapgolly.activexExcel.Excel.AddIns
  type InternationalResult[T] = scala.Boolean | scala.Double | java.lang.String
  type PivotFieldsResult = typingsJapgolly.activexExcel.Excel.PivotFields with (js.Function1[
    /* Index */ scala.Double | java.lang.String, 
    typingsJapgolly.activexExcel.Excel.PivotField
  ]) with (js.Function1[
    /* Indexes */ typingsJapgolly.std.SafeArray[scala.Double | java.lang.String], 
    typingsJapgolly.activexExcel.Excel.PivotFields
  ])
  type PivotItemsResult = typingsJapgolly.activexExcel.Excel.PivotItems with (js.Function1[
    /* Index */ scala.Double | java.lang.String, 
    typingsJapgolly.activexExcel.Excel.PivotItem
  ]) with (js.Function1[
    /* Indexes */ typingsJapgolly.std.SafeArray[scala.Double | java.lang.String], 
    typingsJapgolly.activexExcel.Excel.PivotItems
  ])
  type PivotTableWizardAutoPage[TSourceType] = js.UndefOr[scala.Boolean]
  type PivotTableWizardSourceData[TSourceType] = js.UndefOr[
    typingsJapgolly.activexExcel.Excel.Range | (typingsJapgolly.std.SafeArray[typingsJapgolly.activexExcel.Excel.Range | java.lang.String]) | java.lang.String
  ]
  type PrintToFileName[T] = js.UndefOr[java.lang.String]
  type XlCreator = typingsJapgolly.activexExcel.activexExcelNumbers.`1480803660`
  type XlDataLabelSeparator = typingsJapgolly.activexExcel.activexExcelNumbers.`1`
}
