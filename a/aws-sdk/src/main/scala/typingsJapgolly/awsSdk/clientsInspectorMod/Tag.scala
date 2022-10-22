package typingsJapgolly.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * A tag key.
    */
  var key: TagKey
  
  /**
    * A value assigned to a tag key.
    */
  var value: js.UndefOr[TagValue] = js.undefined
}
object Tag {
  
  inline def apply(key: TagKey): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
