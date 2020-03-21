package typingsJapgolly.dygraphs.dygraphs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.dygraphs.Dygraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  /**	If true, attach annotations to the x-axis, rather than to actual points. */
  var attachAtBottom: js.UndefOr[Boolean] = js.undefined
  /** This function is called whenever the user clicks on this annotation. */
  var clickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.undefined
  /**	CSS class to use for styling the annotation. */
  var cssClass: js.UndefOr[String] = js.undefined
  /** this function is called whenever the user double-clicks on this annotation. */
  var dblClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.undefined
  var div: js.UndefOr[HTMLDivElement] = js.undefined
  /** Height (in pixels) of the annotation flag or icon. */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Specify in place of shortText to mark the annotation with an image rather than text.
    * If you specify this, you must specify width and height.
    */
  var icon: js.UndefOr[String] = js.undefined
  /** This function is called whenever the user mouses out of this annotation. */
  var mouseOutHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.undefined
  /** This function is called whenever the user mouses over this annotation. */
  var mouseOverHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ Dygraph, 
      /* event */ MouseEvent, 
      _
    ]
  ] = js.undefined
  /** The name of the series to which the annotated point belongs. */
  var series: String
  /**	Text that will appear on the annotation's flag. */
  var shortText: js.UndefOr[String] = js.undefined
  /** A longer description of the annotation which will appear when the user hovers over it. */
  var text: js.UndefOr[String] = js.undefined
  /**	Height of the tick mark (in pixels) connecting the point to its flag or icon. */
  var tickHeight: js.UndefOr[Double] = js.undefined
  /**	Width (in pixels) of the annotation flag or icon. */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * The x value of the point. This should be the same as the value
    * you specified in your CSV file, e.g. "2010-09-13".
    * You must set either x or xval.
    */
  var x: js.UndefOr[Double | String] = js.undefined
  /**
    * numeric value of the point, or millis since epoch.
    */
  var xval: js.UndefOr[Double] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(
    series: String,
    attachAtBottom: js.UndefOr[Boolean] = js.undefined,
    clickHandler: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => CallbackTo[js.Any] = null,
    cssClass: String = null,
    dblClickHandler: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => CallbackTo[js.Any] = null,
    div: HTMLDivElement = null,
    height: Int | Double = null,
    icon: String = null,
    mouseOutHandler: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => CallbackTo[js.Any] = null,
    mouseOverHandler: (/* annotation */ Annotation, /* point */ Point, /* dygraph */ Dygraph, /* event */ MouseEvent) => CallbackTo[js.Any] = null,
    shortText: String = null,
    text: String = null,
    tickHeight: Int | Double = null,
    width: Int | Double = null,
    x: Double | String = null,
    xval: Int | Double = null
  ): Annotation = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any])
    if (!js.isUndefined(attachAtBottom)) __obj.updateDynamic("attachAtBottom")(attachAtBottom.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction4((t0: /* annotation */ typingsJapgolly.dygraphs.dygraphs.Annotation, t1: /* point */ typingsJapgolly.dygraphs.dygraphs.Point, t2: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t3: /* event */ org.scalajs.dom.raw.MouseEvent) => clickHandler(t0, t1, t2, t3).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (dblClickHandler != null) __obj.updateDynamic("dblClickHandler")(js.Any.fromFunction4((t0: /* annotation */ typingsJapgolly.dygraphs.dygraphs.Annotation, t1: /* point */ typingsJapgolly.dygraphs.dygraphs.Point, t2: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t3: /* event */ org.scalajs.dom.raw.MouseEvent) => dblClickHandler(t0, t1, t2, t3).runNow()))
    if (div != null) __obj.updateDynamic("div")(div.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction4((t0: /* annotation */ typingsJapgolly.dygraphs.dygraphs.Annotation, t1: /* point */ typingsJapgolly.dygraphs.dygraphs.Point, t2: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t3: /* event */ org.scalajs.dom.raw.MouseEvent) => mouseOutHandler(t0, t1, t2, t3).runNow()))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction4((t0: /* annotation */ typingsJapgolly.dygraphs.dygraphs.Annotation, t1: /* point */ typingsJapgolly.dygraphs.dygraphs.Point, t2: /* dygraph */ typingsJapgolly.dygraphs.Dygraph, t3: /* event */ org.scalajs.dom.raw.MouseEvent) => mouseOverHandler(t0, t1, t2, t3).runNow()))
    if (shortText != null) __obj.updateDynamic("shortText")(shortText.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tickHeight != null) __obj.updateDynamic("tickHeight")(tickHeight.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xval != null) __obj.updateDynamic("xval")(xval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

