package typingsJapgolly.domHelpers

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.domHelpers.typesMod.CamelProperty
import typingsJapgolly.domHelpers.typesMod.HyphenProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/css", JSImport.Namespace)
@js.native
object cssMod extends js.Object {
  def default(node: HTMLElement, property: PartialRecordPropertystri): Unit = js.native
  def default[T /* <: HyphenProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.PropertiesHyphen<string | 0>[T] */ js.Any = js.native
  @JSName("default")
  def default_T_CamelProperty[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string | 0>[T] */ js.Any = js.native
}

