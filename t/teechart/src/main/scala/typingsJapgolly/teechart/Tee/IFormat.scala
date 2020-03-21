package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormat extends js.Object {
  var fill: String
  var font: IFont
  var gradient: IGradient
  var image: IImage
  var round: IPoint
  var shadow: IShadow
  var stroke: IStroke
  var transparency: Double
  def drawText(bounds: IRectangle, text: String): js.Any
  def ellipse(x: Double, y: Double, width: Double, height: Double): js.Any
  def poligon(points: js.Array[IPoint]): js.Any
  def rectangle(x: Double, y: Double, width: Double, height: Double): js.Any
  def textHeight(text: String): Double
  def textWidth(text: String): Double
}

object IFormat {
  @scala.inline
  def apply(
    drawText: (IRectangle, String) => CallbackTo[js.Any],
    ellipse: (Double, Double, Double, Double) => CallbackTo[js.Any],
    fill: String,
    font: IFont,
    gradient: IGradient,
    image: IImage,
    poligon: js.Array[IPoint] => CallbackTo[js.Any],
    rectangle: (Double, Double, Double, Double) => CallbackTo[js.Any],
    round: IPoint,
    shadow: IShadow,
    stroke: IStroke,
    textHeight: String => CallbackTo[Double],
    textWidth: String => CallbackTo[Double],
    transparency: Double
  ): IFormat = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
    __obj.updateDynamic("drawText")(js.Any.fromFunction2((t0: typingsJapgolly.teechart.Tee.IRectangle, t1: java.lang.String) => drawText(t0, t1).runNow()))
    __obj.updateDynamic("ellipse")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => ellipse(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("poligon")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.teechart.Tee.IPoint]) => poligon(t0).runNow()))
    __obj.updateDynamic("rectangle")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => rectangle(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("textHeight")(js.Any.fromFunction1((t0: java.lang.String) => textHeight(t0).runNow()))
    __obj.updateDynamic("textWidth")(js.Any.fromFunction1((t0: java.lang.String) => textWidth(t0).runNow()))
    __obj.asInstanceOf[IFormat]
  }
}

