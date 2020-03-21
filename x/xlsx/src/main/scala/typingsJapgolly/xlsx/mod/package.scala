package typingsJapgolly.xlsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NumberFormat = java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.xlsx.mod.Range
    - typingsJapgolly.xlsx.mod.CellAddress
  */
  type RangeSpec = typingsJapgolly.xlsx.mod._RangeSpec | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.xlsx.mod.MarginInfo
    - typingsJapgolly.xlsx.mod.SheetType
  */
  type SheetKeys = typingsJapgolly.xlsx.mod._SheetKeys | java.lang.String
  type StrictWS = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.xlsx.mod.CellObject]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xlsx.mod.SheetKeys
    - js.Array[
  typingsJapgolly.xlsx.mod.ColInfo | typingsJapgolly.xlsx.mod.Range | typingsJapgolly.xlsx.mod.RowInfo]
    - typingsJapgolly.xlsx.mod.ProtectInfo
    - typingsJapgolly.xlsx.mod.AutoFilterInfo
  */
  type WSKeys = typingsJapgolly.xlsx.mod._WSKeys | (js.Array[
    typingsJapgolly.xlsx.mod.ColInfo | typingsJapgolly.xlsx.mod.Range | typingsJapgolly.xlsx.mod.RowInfo
  ]) | java.lang.String
  type WSSpec = java.lang.String | scala.Double | typingsJapgolly.xlsx.mod.WorkSheet
}
