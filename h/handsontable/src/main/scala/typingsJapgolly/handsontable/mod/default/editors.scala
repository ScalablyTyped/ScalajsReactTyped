package typingsJapgolly.handsontable.mod.default

import org.scalajs.dom.raw.HTMLTableCellElement
import typingsJapgolly.handsontable.mod.Handsontable.CellProperties
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The "_editor" namespace is named to avoid circular reference conflict with "Handsontable.editors" namespace.
  * The other namespaces (renderers, validators, etc) don't need this because they don't expose values (classes), just types (interfaces).
  * Note that TS will think it can use the values defined here, ex `new Handsontable._editors.Base()` compiles, but this is wrong.
  * TODO: This would be better solved by moving all types outside the exported namespaces. (Separate type definition from type publication.)
  */
@JSImport("handsontable", "_editors")
@js.native
object editors extends js.Object {
  @js.native
  class Autocomplete ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Autocomplete
  
  @js.native
  abstract class Base protected ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Base {
    def this(
      hotInstance: Core,
      row: Double,
      col: Double,
      prop: String,
      TD: HTMLTableCellElement,
      cellProperties: CellProperties
    ) = this()
    def this(
      hotInstance: Core,
      row: Double,
      col: Double,
      prop: Double,
      TD: HTMLTableCellElement,
      cellProperties: CellProperties
    ) = this()
  }
  
  @js.native
  class Checkbox ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Checkbox
  
  @js.native
  class Date ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Date
  
  @js.native
  class Dropdown ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Autocomplete
  
  @js.native
  class Handsontable ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Handsontable
  
  @js.native
  class Mobile ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Mobile
  
  @js.native
  class Numeric ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Text
  
  @js.native
  class Password ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Text
  
  @js.native
  class Select ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Select
  
  @js.native
  class Text ()
    extends typingsJapgolly.handsontable.mod.Handsontable._editors.Text
  
}

