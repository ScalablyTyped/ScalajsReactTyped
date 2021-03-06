package typingsJapgolly.paper.paperCoreMod

import typingsJapgolly.paper.paper.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", "SymbolItem")
@js.native
class SymbolItem protected ()
  extends typingsJapgolly.paper.paper.SymbolItem {
  def this(definition: typingsJapgolly.paper.paper.Item) = this()
  /** 
    * Creates a new symbol item.
    * 
    * @param definition - the definition to place or an
    *     item to place as a symbol
    * @param point - the center point of the placed symbol
    */
  def this(definition: typingsJapgolly.paper.paper.SymbolDefinition) = this()
  def this(definition: typingsJapgolly.paper.paper.Item, point: Point) = this()
  def this(definition: typingsJapgolly.paper.paper.SymbolDefinition, point: Point) = this()
}

