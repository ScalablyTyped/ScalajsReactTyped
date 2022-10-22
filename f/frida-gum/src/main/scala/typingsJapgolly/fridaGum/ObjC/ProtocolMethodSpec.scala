package typingsJapgolly.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.ObjC.SimpleProtocolMethodSpec
  - typingsJapgolly.fridaGum.ObjC.DetailedProtocolMethodSpec
*/
trait ProtocolMethodSpec extends StObject
object ProtocolMethodSpec {
  
  inline def DetailedProtocolMethodSpec(types: String): typingsJapgolly.fridaGum.ObjC.DetailedProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ObjC.DetailedProtocolMethodSpec]
  }
  
  inline def SimpleProtocolMethodSpec(argTypes: js.Array[String], retType: String): typingsJapgolly.fridaGum.ObjC.SimpleProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ObjC.SimpleProtocolMethodSpec]
  }
}
