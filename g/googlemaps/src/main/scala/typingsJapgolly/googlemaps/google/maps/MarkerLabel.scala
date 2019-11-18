package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These options specify the appearance of a marker label. A marker label is a
  * single character of text which will appear inside the marker. If you are
  * using it with a custom marker, you can reposition it with the
  * {@link Icon#labelOrigin labelOrigin} property in the {@link Icon} class.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel Maps JavaScript API}
  */
trait MarkerLabel extends js.Object {
  /**
    * The color of the label text.
    * @default 'black'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.color Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#color}
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * The font family of the label text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontFamily Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontFamily}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * The font size of the label text.
    * @default '14px'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontSize Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontSize}
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /**
    * The font weight of the label text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontWeight Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontWeight}
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
    * The text to be displayed in the label.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.text Maps JavaScript API}
    */
  var text: String
}

object MarkerLabel {
  @scala.inline
  def apply(
    text: String,
    color: String = null,
    fontFamily: String = null,
    fontSize: String = null,
    fontWeight: String = null
  ): MarkerLabel = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLabel]
  }
}

