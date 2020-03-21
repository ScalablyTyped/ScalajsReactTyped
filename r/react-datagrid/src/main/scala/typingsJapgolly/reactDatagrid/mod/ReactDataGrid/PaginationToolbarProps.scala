package typingsJapgolly.reactDatagrid.mod.ReactDataGrid

import typingsJapgolly.reactDatagrid.AnonDisabledStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationToolbarProps extends js.Object {
  var iconProps: AnonDisabledStyle
  var iconSize: Double
  /**
    * Available page sizes.
    */
  var pageSizes: js.Array[Double]
  /**
    * Hide/show page sizes.
    */
  var showPageSize: Boolean
  /**
    * Customize icons.
    */
  var showRefreshIcon: Boolean
}

object PaginationToolbarProps {
  @scala.inline
  def apply(
    iconProps: AnonDisabledStyle,
    iconSize: Double,
    pageSizes: js.Array[Double],
    showPageSize: Boolean,
    showRefreshIcon: Boolean
  ): PaginationToolbarProps = {
    val __obj = js.Dynamic.literal(iconProps = iconProps.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], pageSizes = pageSizes.asInstanceOf[js.Any], showPageSize = showPageSize.asInstanceOf[js.Any], showRefreshIcon = showRefreshIcon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaginationToolbarProps]
  }
}

