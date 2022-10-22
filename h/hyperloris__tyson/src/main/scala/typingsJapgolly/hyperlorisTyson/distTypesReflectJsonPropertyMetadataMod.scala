package typingsJapgolly.hyperlorisTyson

import typingsJapgolly.hyperlorisTyson.distTypesAnnotationsJsonPropertyMod.Access
import typingsJapgolly.hyperlorisTyson.distTypesReflectTypeTokenMod.ClassType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesReflectJsonPropertyMetadataMod {
  
  @JSImport("@hyperloris/tyson/dist/types/reflect/jsonPropertyMetadata", "JsonPropertyMetadata")
  @js.native
  open class JsonPropertyMetadata protected () extends StObject {
    def this(name: String, `type`: js.Array[Any], access: Access, required: Boolean, ignoreType: Boolean) = this()
    def this(name: String, `type`: ClassType[Any], access: Access, required: Boolean, ignoreType: Boolean) = this()
    
    var access: Access = js.native
    
    var ignoreType: Boolean = js.native
    
    var name: String = js.native
    
    var required: Boolean = js.native
    
    var `type`: ClassType[Any] | js.Array[Any] = js.native
  }
}
