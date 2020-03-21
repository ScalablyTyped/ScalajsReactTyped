package typingsJapgolly.cloudflareApps.CloudflareApps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudflareAppsMethods extends js.Object {
  def createElement[T /* <: Element */](options: ElementLocation): T = js.native
  def createElement[T /* <: Element */](options: ElementLocation, previousElement: T): T = js.native
  def matchPage(patterns: js.Array[String]): Boolean = js.native
  def querySelector(selectors: String): Element | Null = js.native
  def querySelector[K /* <: String */](selectors: K): (/* import warning: importer.ImportType#apply Failed type conversion: cloudflare-apps.ElementTagNameMap[K] */ js.Any) | Null = js.native
}

