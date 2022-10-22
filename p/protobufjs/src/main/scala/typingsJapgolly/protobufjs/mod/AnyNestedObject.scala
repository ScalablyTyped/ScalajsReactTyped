package typingsJapgolly.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.protobufjs.mod.IEnum
  - typingsJapgolly.protobufjs.mod.IType
  - typingsJapgolly.protobufjs.mod.IService
  - typingsJapgolly.protobufjs.mod.AnyExtensionField
  - typingsJapgolly.protobufjs.mod.INamespace
  - typingsJapgolly.protobufjs.mod.IOneOf
*/
trait AnyNestedObject extends StObject
object AnyNestedObject {
  
  inline def IEnum(values: StringDictionary[Double]): typingsJapgolly.protobufjs.mod.IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.protobufjs.mod.IEnum]
  }
  
  inline def IExtensionField(extend: String, id: Double, `type`: String): typingsJapgolly.protobufjs.mod.IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.protobufjs.mod.IExtensionField]
  }
  
  inline def IExtensionMapField(extend: String, id: Double, keyType: String, `type`: String): typingsJapgolly.protobufjs.mod.IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.protobufjs.mod.IExtensionMapField]
  }
  
  inline def INamespace(): typingsJapgolly.protobufjs.mod.INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.protobufjs.mod.INamespace]
  }
  
  inline def IOneOf(oneof: js.Array[String]): typingsJapgolly.protobufjs.mod.IOneOf = {
    val __obj = js.Dynamic.literal(oneof = oneof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.protobufjs.mod.IOneOf]
  }
  
  inline def IService(methods: StringDictionary[IMethod]): typingsJapgolly.protobufjs.mod.IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.protobufjs.mod.IService]
  }
  
  inline def IType(fields: StringDictionary[IField]): typingsJapgolly.protobufjs.mod.IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.protobufjs.mod.IType]
  }
}
