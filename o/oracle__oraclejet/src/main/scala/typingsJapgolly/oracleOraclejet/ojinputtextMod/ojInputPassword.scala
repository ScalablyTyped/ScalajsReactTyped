package typingsJapgolly.oracleOraclejet.ojinputtextMod

import org.scalajs.dom.CustomEvent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojInputPassword
  extends StObject
     with inputBase[String | Null, ojInputPasswordSettableProperties, String | Null, String | Null] {
  
  def setProperties(properties: ojInputPasswordSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_rawValue(property: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rawValue): Unit = js.native
  @JSName("setProperty")
  def setProperty_value(property: value): Unit = js.native
}
object ojInputPassword {
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
