package typingsJapgolly.ionicCore.virtualScrollInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionicCore.ionicCoreStrings.item
  - typingsJapgolly.ionicCore.ionicCoreStrings.header
  - typingsJapgolly.ionicCore.ionicCoreStrings.footer
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def footer: typingsJapgolly.ionicCore.ionicCoreStrings.footer = this.cast("footer")
  @scala.inline
  def header: typingsJapgolly.ionicCore.ionicCoreStrings.header = this.cast("header")
  @scala.inline
  def item: typingsJapgolly.ionicCore.ionicCoreStrings.item = this.cast("item")
}

