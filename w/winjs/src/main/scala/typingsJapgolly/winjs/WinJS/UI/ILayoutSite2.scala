package typingsJapgolly.winjs.WinJS.UI

import typingsJapgolly.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rendering site for an ILayout2.
  **/
trait ILayoutSite2 extends js.Object {
  //#region Properties
  /**
    * Gets the number of groups in the site.
    **/
  var groupCount: Double
  /**
    * Gets the number of items in the site.
    **/
  var itemCount: Promise[Double]
  /**
    * Gets the pixel range of the realization area.
    **/
  var realizedRange: js.Any
  /**
    * Gets the tree for use by an object that implements the ILayout2 interface.
    **/
  var tree: js.Any
  /**
    * Gets the pixel range of visible items in the site.
    **/
  var visibleRange: js.Any
}

object ILayoutSite2 {
  @scala.inline
  def apply(
    groupCount: Double,
    itemCount: Promise[Double],
    realizedRange: js.Any,
    tree: js.Any,
    visibleRange: js.Any
  ): ILayoutSite2 = {
    val __obj = js.Dynamic.literal(groupCount = groupCount.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], realizedRange = realizedRange.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], visibleRange = visibleRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILayoutSite2]
  }
}

