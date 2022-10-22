package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DataID
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentPointer extends StObject {
  
  var __fragmentOwner: RequestDescriptor
  
  var __fragments: StringDictionary[Variables]
  
  var __id: DataID
}
object FragmentPointer {
  
  inline def apply(__fragmentOwner: RequestDescriptor, __fragments: StringDictionary[Variables], __id: DataID): FragmentPointer = {
    val __obj = js.Dynamic.literal(__fragmentOwner = __fragmentOwner.asInstanceOf[js.Any], __fragments = __fragments.asInstanceOf[js.Any], __id = __id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentPointer]
  }
  
  extension [Self <: FragmentPointer](x: Self) {
    
    inline def set__fragmentOwner(value: RequestDescriptor): Self = StObject.set(x, "__fragmentOwner", value.asInstanceOf[js.Any])
    
    inline def set__fragments(value: StringDictionary[Variables]): Self = StObject.set(x, "__fragments", value.asInstanceOf[js.Any])
    
    inline def set__id(value: DataID): Self = StObject.set(x, "__id", value.asInstanceOf[js.Any])
  }
}
