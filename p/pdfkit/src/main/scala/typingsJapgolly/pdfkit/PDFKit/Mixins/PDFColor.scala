package typingsJapgolly.pdfkit.PDFKit.Mixins

import typingsJapgolly.pdfkit.PDFKit.PDFLinearGradient
import typingsJapgolly.pdfkit.PDFKit.PDFRadialGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFColor extends js.Object {
  def fillColor(color: ColorValue): this.type = js.native
  def fillColor(color: ColorValue, opacity: Double): this.type = js.native
  def fillOpacity(opacity: Double): this.type = js.native
  def linearGradient(x1: Double, y1: Double, x2: Double, y2: Double): PDFLinearGradient = js.native
  def opacity(opacity: Double): this.type = js.native
  def radialGradient(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): PDFRadialGradient = js.native
  def strokeColor(color: ColorValue): this.type = js.native
  def strokeColor(color: ColorValue, opacity: Double): this.type = js.native
  def strokeOpacity(opacity: Double): this.type = js.native
}

