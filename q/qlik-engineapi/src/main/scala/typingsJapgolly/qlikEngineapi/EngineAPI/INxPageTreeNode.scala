package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxPageTreeNode extends js.Object {
  /**
    * When set to true, generated nodes (based on current selection) will be inserted into the returned tree even when
    * there is no actual value. For example, suppose you are looking for hybrid car sales at all car dealerships.
    * Normally, only dealerships where hybrid cars are sold would be part of the returned tree but with qAllValues set to true,
    * all available dealerships will be included regardless if they sold any hybrid cars or not.
    */
  var qAllValues: Boolean
  /**
    * The area of the tree to be fetched. If no area is defined on a dimension, all existing nodes are included.
    */
  var qArea: IRect
}

object INxPageTreeNode {
  @scala.inline
  def apply(qAllValues: Boolean, qArea: IRect): INxPageTreeNode = {
    val __obj = js.Dynamic.literal(qAllValues = qAllValues.asInstanceOf[js.Any], qArea = qArea.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxPageTreeNode]
  }
}

