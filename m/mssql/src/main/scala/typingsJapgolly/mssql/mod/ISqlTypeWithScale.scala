package typingsJapgolly.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeWithScale extends ISqlType {
  var scale: Double = js.native
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithScale = js.native
  @JSName("type")
  def type_MISqlTypeWithScale(): ISqlTypeWithScale = js.native
  @JSName("type")
  def type_MISqlTypeWithScale(scale: Double): ISqlTypeWithScale = js.native
}

