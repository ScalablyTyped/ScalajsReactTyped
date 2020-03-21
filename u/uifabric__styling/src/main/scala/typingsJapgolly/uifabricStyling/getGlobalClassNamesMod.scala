package typingsJapgolly.uifabricStyling

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles/getGlobalClassNames", JSImport.Namespace)
@js.native
object getGlobalClassNamesMod extends js.Object {
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): Partial[GlobalClassNames[T]] = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): Partial[GlobalClassNames[T]] = js.native
  type GlobalClassNames[IStyles] = Record[String, String]
}

