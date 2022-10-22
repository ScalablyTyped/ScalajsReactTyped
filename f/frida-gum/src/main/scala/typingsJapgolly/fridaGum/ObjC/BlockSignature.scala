package typingsJapgolly.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.ObjC.SimpleBlockSignature
  - typingsJapgolly.fridaGum.ObjC.DetailedBlockSignature
*/
trait BlockSignature extends StObject
object BlockSignature {
  
  inline def DetailedBlockSignature(types: String): typingsJapgolly.fridaGum.ObjC.DetailedBlockSignature = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ObjC.DetailedBlockSignature]
  }
  
  inline def SimpleBlockSignature(argTypes: js.Array[String], retType: String): typingsJapgolly.fridaGum.ObjC.SimpleBlockSignature = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.ObjC.SimpleBlockSignature]
  }
}
