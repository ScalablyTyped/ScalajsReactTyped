package typingsJapgolly.sicList

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sic-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getCode(description: String): js.UndefOr[String] = js.native
  def getCodeList(): StringDictionary[String] = js.native
  def getCodes(): js.Array[String] = js.native
  def getData(): js.Array[AnonCode] = js.native
  def getDescription(code: String): js.UndefOr[String] = js.native
  def getDescriptionList(): StringDictionary[String] = js.native
  def getDescriptions(): js.Array[String] = js.native
  def overwrite(sics: js.Array[AnonCode]): Unit = js.native
}

