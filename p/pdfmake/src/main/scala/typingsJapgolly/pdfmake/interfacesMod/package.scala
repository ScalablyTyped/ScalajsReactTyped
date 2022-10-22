package typingsJapgolly.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pdfmake.pdfmakeStrings.auto
import typingsJapgolly.pdfmake.pdfmakeStrings.canvas
import typingsJapgolly.pdfmake.pdfmakeStrings.columns
import typingsJapgolly.pdfmake.pdfmakeStrings.image
import typingsJapgolly.pdfmake.pdfmakeStrings.ol
import typingsJapgolly.pdfmake.pdfmakeStrings.pageReference
import typingsJapgolly.pdfmake.pdfmakeStrings.qr
import typingsJapgolly.pdfmake.pdfmakeStrings.stack
import typingsJapgolly.pdfmake.pdfmakeStrings.svg
import typingsJapgolly.pdfmake.pdfmakeStrings.table
import typingsJapgolly.pdfmake.pdfmakeStrings.text
import typingsJapgolly.pdfmake.pdfmakeStrings.textReference
import typingsJapgolly.pdfmake.pdfmakeStrings.toc
import typingsJapgolly.pdfmake.pdfmakeStrings.ul
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Column = Content & ColumnProperties

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[scala.Any]
  - typingsJapgolly.pdfmake.interfacesMod.ContentText
  - typingsJapgolly.pdfmake.interfacesMod.ContentColumns
  - typingsJapgolly.pdfmake.interfacesMod.ContentStack
  - typingsJapgolly.pdfmake.interfacesMod.ContentUnorderedList
  - typingsJapgolly.pdfmake.interfacesMod.ContentOrderedList
  - typingsJapgolly.pdfmake.interfacesMod.ContentTable
  - typingsJapgolly.pdfmake.interfacesMod.ContentAnchor
  - typingsJapgolly.pdfmake.interfacesMod.ContentPageReference
  - typingsJapgolly.pdfmake.interfacesMod.ContentTextReference
  - typingsJapgolly.pdfmake.interfacesMod.ContentToc
  - typingsJapgolly.pdfmake.interfacesMod.ContentTocItem
  - typingsJapgolly.pdfmake.interfacesMod.ContentImage
  - typingsJapgolly.pdfmake.interfacesMod.ContentSvg
  - typingsJapgolly.pdfmake.interfacesMod.ContentQr
  - typingsJapgolly.pdfmake.interfacesMod.ContentCanvas
*/
type Content = _Content | js.Array[Any] | String

type DynamicCellLayout[T] = js.Function3[/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double, T | Null]

type DynamicLayout[T] = js.Function2[/* rowIndex */ Double, /* node */ ContentTable, T | Null]

type DynamicRowSize = js.Function1[/* rowIndex */ Double, Double | auto]

/**
  * Internal helper type to prevent TypeScript from allowing element definitions
  * that contain multiple element types at once.
  *
  * Advantages:
  * - Does not allow setting multiple element properties together (e.g. `ol` + `ul`)
  * - Does not allow using optional properties from other element types
  *
  * Disadvantages:
  * - `property in content` does not narrow the type any longer
  * - Autocompletion does not sort the primary element properties at the top
  * - Error messages are not very good
  */
type ForbidOtherElementProperties[TProperty /* <: text | columns | stack | ul | ol | table | pageReference | textReference | toc | image | svg | qr | canvas */] = Omit[ForbiddenElementProperties, TProperty]

type Margins = Double | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])

type PatternFill = js.Tuple2[String, String]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsJapgolly.pdfmake.pdfmakeStrings.auto
  - typingsJapgolly.pdfmake.pdfmakeStrings.Asterisk
  - java.lang.String
*/
type Size = _Size | Double | String

type StyleDictionary = StringDictionary[Style]

type StyleReference = String | Style | (js.Array[String | Style])

type TFontDictionary = StringDictionary[TFontFamilyTypes]

type TableCell = js.Object | (Any & TableCellProperties)

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsJapgolly.pdfmake.interfacesMod.PredefinedTableLayout
  - typingsJapgolly.pdfmake.interfacesMod.CustomTableLayout
*/
type TableLayout = _TableLayout | String

type VerticalDynamicCellLayout[T] = js.Function3[/* columnIndex */ Double, /* node */ ContentTable, /* rowIndex */ Double, T | Null]

type VerticalDynamicLayout[T] = js.Function2[/* columnIndex */ Double, /* node */ ContentTable, T | Null]
