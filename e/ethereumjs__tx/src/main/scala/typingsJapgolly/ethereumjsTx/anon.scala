package typingsJapgolly.ethereumjsTx

import typingsJapgolly.ethereumjsTx.distTypesMod.AccessListBuffer
import typingsJapgolly.ethereumjsTx.distTypesMod.AccessListBufferItem
import typingsJapgolly.ethereumjsTx.distTypesMod.AccessListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessList extends StObject {
    
    var AccessListJSON: typingsJapgolly.ethereumjsTx.distTypesMod.AccessList
    
    var accessList: AccessListBuffer
  }
  object AccessList {
    
    inline def apply(AccessListJSON: typingsJapgolly.ethereumjsTx.distTypesMod.AccessList, accessList: AccessListBuffer): AccessList = {
      val __obj = js.Dynamic.literal(AccessListJSON = AccessListJSON.asInstanceOf[js.Any], accessList = accessList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessList]
    }
    
    extension [Self <: AccessList](x: Self) {
      
      inline def setAccessList(value: AccessListBuffer): Self = StObject.set(x, "accessList", value.asInstanceOf[js.Any])
      
      inline def setAccessListJSON(value: typingsJapgolly.ethereumjsTx.distTypesMod.AccessList): Self = StObject.set(x, "AccessListJSON", value.asInstanceOf[js.Any])
      
      inline def setAccessListJSONVarargs(value: AccessListItem*): Self = StObject.set(x, "AccessListJSON", js.Array(value*))
      
      inline def setAccessListVarargs(value: AccessListBufferItem*): Self = StObject.set(x, "accessList", js.Array(value*))
    }
  }
  
  trait Hardfork extends StObject {
    
    var hardfork: String | typingsJapgolly.ethereumjsCommon.distEnumsMod.Hardfork
    
    var value: js.BigInt
  }
  object Hardfork {
    
    inline def apply(hardfork: String | typingsJapgolly.ethereumjsCommon.distEnumsMod.Hardfork, value: js.BigInt): Hardfork = {
      val __obj = js.Dynamic.literal(hardfork = hardfork.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hardfork]
    }
    
    extension [Self <: Hardfork](x: Self) {
      
      inline def setHardfork(value: String | typingsJapgolly.ethereumjsCommon.distEnumsMod.Hardfork): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.BigInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
