package typingsJapgolly.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any extension field descriptor. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloProtobufjs.mod.IExtensionField
  - typingsJapgolly.apolloProtobufjs.mod.IExtensionMapField
*/
trait AnyExtensionField
  extends StObject
     with AnyNestedObject
object AnyExtensionField {
  
  inline def IExtensionField(extend: String, id: Double, `type`: String): typingsJapgolly.apolloProtobufjs.mod.IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.IExtensionField]
  }
  
  inline def IExtensionMapField(extend: String, id: Double, keyType: String, `type`: String): typingsJapgolly.apolloProtobufjs.mod.IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.IExtensionMapField]
  }
}
