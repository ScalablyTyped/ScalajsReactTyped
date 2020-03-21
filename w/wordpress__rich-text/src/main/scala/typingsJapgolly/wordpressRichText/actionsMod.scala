package typingsJapgolly.wordpressRichText

import typingsJapgolly.wordpressRichText.mod.NamedFormatConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/rich-text/store/actions", JSImport.Namespace)
@js.native
object actionsMod extends js.Object {
  def addFormatTypes(configs: js.Array[NamedFormatConfiguration]): Unit = js.native
  def addFormatTypes(configs: NamedFormatConfiguration): Unit = js.native
  def removeFormatTypes(names: String): Unit = js.native
  def removeFormatTypes(names: js.Array[String]): Unit = js.native
}

