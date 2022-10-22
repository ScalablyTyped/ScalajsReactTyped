package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.B
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.N
import typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.S
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAttributeDefinitionMod {
  
  trait AttributeDefinition extends StObject {
    
    /**
      * <p>A name for the attribute.</p>
      */
    var AttributeName: String
    
    /**
      * <p>The data type for the attribute, where:</p> <ul> <li> <p> <code>S</code> - the attribute is of type String</p> </li> <li> <p> <code>N</code> - the attribute is of type Number</p> </li> <li> <p> <code>B</code> - the attribute is of type Binary</p> </li> </ul>
      */
    var AttributeType: S | N | B | String
  }
  object AttributeDefinition {
    
    inline def apply(AttributeName: String, AttributeType: S | N | B | String): AttributeDefinition = {
      val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDefinition]
    }
    
    extension [Self <: AttributeDefinition](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeType(value: S | N | B | String): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledAttributeDefinition = AttributeDefinition
}
