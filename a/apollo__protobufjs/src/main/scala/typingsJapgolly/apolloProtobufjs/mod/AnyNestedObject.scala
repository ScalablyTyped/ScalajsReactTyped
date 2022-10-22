package typingsJapgolly.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloProtobufjs.mod.IEnum
  - typingsJapgolly.apolloProtobufjs.mod.IType
  - typingsJapgolly.apolloProtobufjs.mod.IService
  - typingsJapgolly.apolloProtobufjs.mod.AnyExtensionField
  - typingsJapgolly.apolloProtobufjs.mod.INamespace
*/
trait AnyNestedObject extends StObject
object AnyNestedObject {
  
  inline def IEnum(values: StringDictionary[Double]): typingsJapgolly.apolloProtobufjs.mod.IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.IEnum]
  }
  
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
  
  inline def INamespace(): typingsJapgolly.apolloProtobufjs.mod.INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.INamespace]
  }
  
  inline def IService(methods: StringDictionary[IMethod]): typingsJapgolly.apolloProtobufjs.mod.IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.IService]
  }
  
  inline def IType(fields: StringDictionary[IField]): typingsJapgolly.apolloProtobufjs.mod.IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.IType]
  }
}
