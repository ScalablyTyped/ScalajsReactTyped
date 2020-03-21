package typingsJapgolly.reactImageGallery.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactImageGallery.AnonCurrentIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactImageGalleryItem extends js.Object {
  var bulletClass: js.UndefOr[String] = js.undefined
  var bulletOnClick: js.UndefOr[js.Function1[/* hasItemItemIndexCurrentIndex */ AnonCurrentIndex, Unit]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var original: js.UndefOr[String] = js.undefined
  var originalAlt: js.UndefOr[String] = js.undefined
  var originalClass: js.UndefOr[String] = js.undefined
  var originalTitle: js.UndefOr[String] = js.undefined
  var renderItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], Node]] = js.undefined
  var renderThumbInner: js.UndefOr[js.Function1[/* item */ js.UndefOr[this.type], Node]] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var srcSet: js.UndefOr[String] = js.undefined
  var thumbnail: js.UndefOr[String] = js.undefined
  var thumbnailAlt: js.UndefOr[String] = js.undefined
  var thumbnailClass: js.UndefOr[String] = js.undefined
  var thumbnailLabel: js.UndefOr[String] = js.undefined
  var thumbnailTitle: js.UndefOr[String] = js.undefined
}

object ReactImageGalleryItem {
  @scala.inline
  def apply(
    bulletClass: String = null,
    bulletOnClick: /* hasItemItemIndexCurrentIndex */ AnonCurrentIndex => Callback = null,
    description: String = null,
    original: String = null,
    originalAlt: String = null,
    originalClass: String = null,
    originalTitle: String = null,
    renderItem: /* item */ js.UndefOr[ReactImageGalleryItem] => CallbackTo[Node] = null,
    renderThumbInner: /* item */ js.UndefOr[ReactImageGalleryItem] => CallbackTo[Node] = null,
    sizes: String = null,
    srcSet: String = null,
    thumbnail: String = null,
    thumbnailAlt: String = null,
    thumbnailClass: String = null,
    thumbnailLabel: String = null,
    thumbnailTitle: String = null
  ): ReactImageGalleryItem = {
    val __obj = js.Dynamic.literal()
    if (bulletClass != null) __obj.updateDynamic("bulletClass")(bulletClass.asInstanceOf[js.Any])
    if (bulletOnClick != null) __obj.updateDynamic("bulletOnClick")(js.Any.fromFunction1((t0: /* hasItemItemIndexCurrentIndex */ typingsJapgolly.reactImageGallery.AnonCurrentIndex) => bulletOnClick(t0).runNow()))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    if (originalAlt != null) __obj.updateDynamic("originalAlt")(originalAlt.asInstanceOf[js.Any])
    if (originalClass != null) __obj.updateDynamic("originalClass")(originalClass.asInstanceOf[js.Any])
    if (originalTitle != null) __obj.updateDynamic("originalTitle")(originalTitle.asInstanceOf[js.Any])
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[typingsJapgolly.reactImageGallery.mod.ReactImageGalleryItem]) => renderItem(t0).runNow()))
    if (renderThumbInner != null) __obj.updateDynamic("renderThumbInner")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[typingsJapgolly.reactImageGallery.mod.ReactImageGalleryItem]) => renderThumbInner(t0).runNow()))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (thumbnailAlt != null) __obj.updateDynamic("thumbnailAlt")(thumbnailAlt.asInstanceOf[js.Any])
    if (thumbnailClass != null) __obj.updateDynamic("thumbnailClass")(thumbnailClass.asInstanceOf[js.Any])
    if (thumbnailLabel != null) __obj.updateDynamic("thumbnailLabel")(thumbnailLabel.asInstanceOf[js.Any])
    if (thumbnailTitle != null) __obj.updateDynamic("thumbnailTitle")(thumbnailTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactImageGalleryItem]
  }
}

