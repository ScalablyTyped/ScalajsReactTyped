package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.contain
import typingsJapgolly.gestalt.gestaltStrings.cover
import typingsJapgolly.gestalt.gestaltStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var alt: String
  var children: js.UndefOr[Node] = js.undefined
  var color: String
  var fit: js.UndefOr[cover | contain | none] = js.undefined
  var naturalHeight: Double
  var naturalWidth: Double
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var src: String
  var srcSet: js.UndefOr[String] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    alt: String,
    color: String,
    naturalHeight: Double,
    naturalWidth: Double,
    src: String,
    children: VdomNode = null,
    fit: cover | contain | none = null,
    onError: js.UndefOr[Callback] = js.undefined,
    onLoad: js.UndefOr[Callback] = js.undefined,
    size: String = null,
    srcSet: String = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

