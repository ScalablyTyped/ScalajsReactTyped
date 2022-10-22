package typingsJapgolly.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.matrixAppserviceBridge.anon.Placeholder
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libThirdpartyMod {
  
  trait ProtocolInstance extends StObject {
    
    var desc: String
    
    var fields: js.UndefOr[Record[String, Any]] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var network_id: String
  }
  object ProtocolInstance {
    
    inline def apply(desc: String, network_id: String): ProtocolInstance = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtocolInstance]
    }
    
    extension [Self <: ProtocolInstance](x: Self) {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setNetwork_id(value: String): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThirdpartyLocationResponse extends StObject {
    
    var alias: String
    
    var fields: Record[String, Any]
    
    var protocol: String
  }
  object ThirdpartyLocationResponse {
    
    inline def apply(alias: String, fields: Record[String, Any], protocol: String): ThirdpartyLocationResponse = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdpartyLocationResponse]
    }
    
    extension [Self <: ThirdpartyLocationResponse](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThirdpartyProtocolResponse extends StObject {
    
    var field_types: StringDictionary[Placeholder]
    
    var icon: String
    
    var instances: js.Array[ProtocolInstance]
    
    var location_fields: js.Array[String]
    
    var user_fields: js.Array[String]
  }
  object ThirdpartyProtocolResponse {
    
    inline def apply(
      field_types: StringDictionary[Placeholder],
      icon: String,
      instances: js.Array[ProtocolInstance],
      location_fields: js.Array[String],
      user_fields: js.Array[String]
    ): ThirdpartyProtocolResponse = {
      val __obj = js.Dynamic.literal(field_types = field_types.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], location_fields = location_fields.asInstanceOf[js.Any], user_fields = user_fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdpartyProtocolResponse]
    }
    
    extension [Self <: ThirdpartyProtocolResponse](x: Self) {
      
      inline def setField_types(value: StringDictionary[Placeholder]): Self = StObject.set(x, "field_types", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInstances(value: js.Array[ProtocolInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesVarargs(value: ProtocolInstance*): Self = StObject.set(x, "instances", js.Array(value*))
      
      inline def setLocation_fields(value: js.Array[String]): Self = StObject.set(x, "location_fields", value.asInstanceOf[js.Any])
      
      inline def setLocation_fieldsVarargs(value: String*): Self = StObject.set(x, "location_fields", js.Array(value*))
      
      inline def setUser_fields(value: js.Array[String]): Self = StObject.set(x, "user_fields", value.asInstanceOf[js.Any])
      
      inline def setUser_fieldsVarargs(value: String*): Self = StObject.set(x, "user_fields", js.Array(value*))
    }
  }
  
  trait ThirdpartyUserResponse extends StObject {
    
    var fields: Record[String, Any]
    
    var protocol: String
    
    var userid: String
  }
  object ThirdpartyUserResponse {
    
    inline def apply(fields: Record[String, Any], protocol: String, userid: String): ThirdpartyUserResponse = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdpartyUserResponse]
    }
    
    extension [Self <: ThirdpartyUserResponse](x: Self) {
      
      inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
    }
  }
}
