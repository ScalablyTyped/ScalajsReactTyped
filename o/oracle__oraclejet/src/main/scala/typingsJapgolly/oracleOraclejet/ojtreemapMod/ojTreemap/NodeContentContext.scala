package typingsJapgolly.oracleOraclejet.ojtreemapMod.ojTreemap

import org.scalajs.dom.raw.Element
import typingsJapgolly.oracleOraclejet.AnonWidthX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContentContext[K, D] extends js.Object {
  var bounds: AnonWidthX
  var componentElement: Element
  var data: js.Object
  var id: K
  var itemData: D
}

object NodeContentContext {
  @scala.inline
  def apply[K, D](bounds: AnonWidthX, componentElement: Element, data: js.Object, id: K, itemData: D): NodeContentContext[K, D] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeContentContext[K, D]]
  }
}

