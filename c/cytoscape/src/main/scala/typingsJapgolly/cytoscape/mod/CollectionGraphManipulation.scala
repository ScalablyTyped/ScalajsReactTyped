package typingsJapgolly.cytoscape.mod

import typingsJapgolly.cytoscape.AnonParent
import typingsJapgolly.cytoscape.AnonSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/graph-manipulation
  */
@js.native
trait CollectionGraphManipulation extends js.Object {
  /**
    * Get a new collection containing clones (i.e. copies) of the elements in the calling collection.
    * http://js.cytoscape.org/#eles.clone
    */
  def copy(): CollectionReturnValue = js.native
  /**
    * Effectively move nodes to different parent node. The modified (actually new) elements are returned.
    * http://js.cytoscape.org/#eles.move
    */
  def move(location: AnonParent): NodeCollection = js.native
  /**
    * Effectively move edges to different nodes. The modified (actually new) elements are returned.
    * http://js.cytoscape.org/#eles.move
    */
  def move(location: AnonSource): EdgeCollection = js.native
  /**
    * Remove the elements from the graph.
    * http://js.cytoscape.org/#eles.remove
    */
  def remove(): CollectionReturnValue = js.native
  /**
    * Put removed elements back into the graph.
    * http://js.cytoscape.org/#eles.restore
    */
  def restore(): CollectionReturnValue = js.native
}

