package typingsJapgolly.pg.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.pg.anon.FnCall
import typingsJapgolly.pg.pgStrings.binary
import typingsJapgolly.pg.pgStrings.text
import typingsJapgolly.pgTypes.mod.TypeId
import typingsJapgolly.pgTypes.mod.TypeParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTypesConfig extends StObject {
  
  def getTypeParser[T](oid: Double): TypeParser[String, T | String]
  def getTypeParser[T](oid: TypeId): TypeParser[String, T | String]
  @JSName("getTypeParser")
  var getTypeParser_Original: FnCall
  @JSName("getTypeParser")
  def getTypeParser_binary[T](oid: Double, format: binary): TypeParser[Buffer, T | String]
  @JSName("getTypeParser")
  def getTypeParser_binary[T](oid: TypeId, format: binary): TypeParser[Buffer, T | String]
  @JSName("getTypeParser")
  def getTypeParser_text[T](oid: Double, format: text): TypeParser[String, T | String]
  @JSName("getTypeParser")
  def getTypeParser_text[T](oid: TypeId, format: text): TypeParser[String, T | String]
}
object CustomTypesConfig {
  
  inline def apply(getTypeParser: FnCall): CustomTypesConfig = {
    val __obj = js.Dynamic.literal(getTypeParser = getTypeParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTypesConfig]
  }
  
  extension [Self <: CustomTypesConfig](x: Self) {
    
    inline def setGetTypeParser(value: FnCall): Self = StObject.set(x, "getTypeParser", value.asInstanceOf[js.Any])
  }
}
