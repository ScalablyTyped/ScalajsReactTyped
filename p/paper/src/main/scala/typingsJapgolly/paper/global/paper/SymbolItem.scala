package typingsJapgolly.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A symbol item represents an instance of a symbol which has been
  * placed in a Paper.js project.
  */
@JSGlobal("paper.SymbolItem")
@js.native
open class SymbolItem protected ()
  extends StObject
     with typingsJapgolly.paper.paper.SymbolItem {
  def this(definition: typingsJapgolly.paper.paper.Item) = this()
  /** 
    * Creates a new symbol item.
    * 
    * @param definition - the definition to place or an
    *     item to place as a symbol
    * @param point - the center point of the placed symbol
    */
  def this(definition: typingsJapgolly.paper.paper.SymbolDefinition) = this()
  def this(definition: typingsJapgolly.paper.paper.Item, point: typingsJapgolly.paper.paper.Point) = this()
  def this(definition: typingsJapgolly.paper.paper.SymbolDefinition, point: typingsJapgolly.paper.paper.Point) = this()
}
