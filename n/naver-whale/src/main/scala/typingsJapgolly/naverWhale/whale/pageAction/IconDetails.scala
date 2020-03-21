package typingsJapgolly.naverWhale.whale.pageAction

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconDetails extends js.Object {
  /**
    * Optional.
    * @deprecated This argument is ignored.
    */
  var iconIndex: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * Either an ImageData object or a dictionary {size -> ImageData} representing icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.imageData = foo' is equivalent to 'details.imageData = {'19': foo}'
    */
  var imageData: js.UndefOr[ImageData | NumberDictionary[ImageData]] = js.undefined
  /**
    * Optional.
    * Either a relative image path or a dictionary {size -> relative image path} pointing to icon to be set. If the icon is specified as a dictionary, the actual image to be used is chosen depending on screen's pixel density. If the number of image pixels that fit into one screen space unit equals scale, then image with size scale * 19 will be selected. Initially only scales 1 and 2 will be supported. At least one image must be specified. Note that 'details.path = foo' is equivalent to 'details.imageData = {'19': foo}'
    */
  var path: js.UndefOr[js.Any] = js.undefined
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double
}

object IconDetails {
  @scala.inline
  def apply(
    tabId: Double,
    iconIndex: Int | Double = null,
    imageData: ImageData | NumberDictionary[ImageData] = null,
    path: js.Any = null
  ): IconDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    if (iconIndex != null) __obj.updateDynamic("iconIndex")(iconIndex.asInstanceOf[js.Any])
    if (imageData != null) __obj.updateDynamic("imageData")(imageData.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDetails]
  }
}

