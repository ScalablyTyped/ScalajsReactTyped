package typingsJapgolly.tslint

import typingsJapgolly.tslint.formatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/formatterLoader", JSImport.Namespace)
@js.native
object formatterLoaderMod extends js.Object {
  def findFormatter(name: String): js.UndefOr[FormatterConstructor] = js.native
  def findFormatter(name: String, formattersDirectory: String): js.UndefOr[FormatterConstructor] = js.native
  def findFormatter(name: FormatterConstructor): js.UndefOr[FormatterConstructor] = js.native
  def findFormatter(name: FormatterConstructor, formattersDirectory: String): js.UndefOr[FormatterConstructor] = js.native
}

