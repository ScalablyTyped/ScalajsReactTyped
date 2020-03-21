package typingsJapgolly.cytoscape.mod.Css

import typingsJapgolly.cytoscape.cytoscapeStrings.`no-repeat`
import typingsJapgolly.cytoscape.cytoscapeStrings.`repeat-x`
import typingsJapgolly.cytoscape.cytoscapeStrings.`repeat-y`
import typingsJapgolly.cytoscape.cytoscapeStrings.clipped
import typingsJapgolly.cytoscape.cytoscapeStrings.contain
import typingsJapgolly.cytoscape.cytoscapeStrings.cover
import typingsJapgolly.cytoscape.cytoscapeStrings.none
import typingsJapgolly.cytoscape.cytoscapeStrings.repeat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// export interface ElementCss extends CSSStyleDeclaration { }
/**
  * A background image may be applied to a node’s body:
  *
  * http://js.cytoscape.org/#style/background-image
  */
trait BackgroundImage extends js.Object {
  /**
    * How background image clipping is handled;
    * may be node for clipped to node shape or none for no clipping.
    */
  var `background-clip`: js.UndefOr[PropertyValueNode[clipped | none]] = js.undefined
  /**
    * How the background image is fit to the node;
    * may be none for original size,
    * contain to fit inside node,
    * or cover to cover the node.
    */
  var `background-fit`: js.UndefOr[PropertyValueNode[none | contain | cover]] = js.undefined
  /**
    * Specifies the height of the image.
    * A percent value (e.g. 50%) may be used to set the image
    * height relative to the node height.
    * If used in combination with background- fit,
    * then this value overrides the height of the image in calculating
    * the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the height of the image.
    */
  var `background-height`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  /**
    * The URL that points to the image that should be used as the node’s background.
    * PNG, JPG, and SVG are supported formats.
    * You may use a data URI to use embedded images,
    * thereby saving a HTTP request.
    */
  var `background-image`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  /**
    * The opacity of the background image. [0 1]
    */
  var `background-image-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  /**
    * The x position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-x`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  /**
    * The y position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-y`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  /**
    * Whether to repeat the background image;
    * may be no-repeat, repeat-x, repeat-y, or repeat.
    */
  var `background-repeat`: js.UndefOr[PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]] = js.undefined
  /**
    * Specifies the width of the image.
    * A percent value (e.g. 50%) may be used to set
    * the image width relative to the node width.
    * If used in combination with background- fit,
    * then this value overrides the width of the image
    * in calculating the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the width of the image.
    */
  var `background-width`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
}

object BackgroundImage {
  @scala.inline
  def apply(
    `background-clip`: PropertyValueNode[clipped | none] = null,
    `background-fit`: PropertyValueNode[none | contain | cover] = null,
    `background-height`: PropertyValueNode[Double | String] = null,
    `background-image`: PropertyValueNode[String] = null,
    `background-image-opacity`: PropertyValueNode[Double] = null,
    `background-position-x`: PropertyValueNode[Double | String] = null,
    `background-position-y`: PropertyValueNode[Double | String] = null,
    `background-repeat`: PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat] = null,
    `background-width`: PropertyValueNode[Double | String] = null
  ): BackgroundImage = {
    val __obj = js.Dynamic.literal()
    if (`background-clip` != null) __obj.updateDynamic("background-clip")(`background-clip`.asInstanceOf[js.Any])
    if (`background-fit` != null) __obj.updateDynamic("background-fit")(`background-fit`.asInstanceOf[js.Any])
    if (`background-height` != null) __obj.updateDynamic("background-height")(`background-height`.asInstanceOf[js.Any])
    if (`background-image` != null) __obj.updateDynamic("background-image")(`background-image`.asInstanceOf[js.Any])
    if (`background-image-opacity` != null) __obj.updateDynamic("background-image-opacity")(`background-image-opacity`.asInstanceOf[js.Any])
    if (`background-position-x` != null) __obj.updateDynamic("background-position-x")(`background-position-x`.asInstanceOf[js.Any])
    if (`background-position-y` != null) __obj.updateDynamic("background-position-y")(`background-position-y`.asInstanceOf[js.Any])
    if (`background-repeat` != null) __obj.updateDynamic("background-repeat")(`background-repeat`.asInstanceOf[js.Any])
    if (`background-width` != null) __obj.updateDynamic("background-width")(`background-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImage]
  }
}

