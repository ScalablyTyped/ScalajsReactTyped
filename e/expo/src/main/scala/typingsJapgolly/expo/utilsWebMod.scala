package typingsJapgolly.expo

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/Utils.web", JSImport.Namespace)
@js.native
object utilsWebMod extends js.Object {
  def formatDataAsUrl(content: String, `type`: String): String = js.native
  def getBlobFromCanvasAsync(canvas: HTMLCanvasElement): js.Promise[Blob] = js.native
  def getBlobFromCanvasAsync(canvas: HTMLCanvasElement, quality: Double): js.Promise[Blob] = js.native
  def getEscapedString(string: String): String = js.native
  def getEscapedXHTMLString(input: String): String = js.native
  def getHeightForElement(element: Element): Double = js.native
  def getImageElementFromURIAsync(uri: String): js.Promise[HTMLImageElement] = js.native
  def getMimeTypeFromSource(url: String): String = js.native
  def getSourceAndEncodeAsync(url: String): js.Promise[String] = js.native
  def getSourceAndEncodeAsync(url: String, preventCaching: Boolean): js.Promise[String] = js.native
  def getSourceAndEncodeAsync(url: String, preventCaching: Boolean, missingImageSource: String): js.Promise[String] = js.native
  def getWidthForElement(element: Element): Double = js.native
  def isDataUrl(url: String): Boolean = js.native
  def resolveUrl(url: String, baseUrl: String): String = js.native
}

