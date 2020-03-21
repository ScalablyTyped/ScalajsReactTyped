package typingsJapgolly.oracleOraclejet.ojlistviewMod.ojListView

import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.after
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.before
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.inside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemsDropContext extends js.Object {
  var item: Element
  var position: before | after | inside
  var reorder: Boolean
}

object ItemsDropContext {
  @scala.inline
  def apply(item: Element, position: before | after | inside, reorder: Boolean): ItemsDropContext = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemsDropContext]
  }
}

