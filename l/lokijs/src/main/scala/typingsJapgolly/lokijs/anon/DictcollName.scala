package typingsJapgolly.lokijs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lokijs.lokijsStrings.destructured
import typingsJapgolly.lokijs.lokijsStrings.normal
import typingsJapgolly.lokijs.lokijsStrings.pretty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictcollName
  extends StObject
     with /* collName */ StringDictionary[Any | Inflate] {
  
  var retainDirtyFlags: js.UndefOr[Boolean] = js.undefined
  
  var serializationMethod: js.UndefOr[normal | pretty | destructured | Null] = js.undefined
  
  var throttledSaves: js.UndefOr[Boolean] = js.undefined
}
object DictcollName {
  
  inline def apply(): DictcollName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictcollName]
  }
  
  extension [Self <: DictcollName](x: Self) {
    
    inline def setRetainDirtyFlags(value: Boolean): Self = StObject.set(x, "retainDirtyFlags", value.asInstanceOf[js.Any])
    
    inline def setRetainDirtyFlagsUndefined: Self = StObject.set(x, "retainDirtyFlags", js.undefined)
    
    inline def setSerializationMethod(value: normal | pretty | destructured): Self = StObject.set(x, "serializationMethod", value.asInstanceOf[js.Any])
    
    inline def setSerializationMethodNull: Self = StObject.set(x, "serializationMethod", null)
    
    inline def setSerializationMethodUndefined: Self = StObject.set(x, "serializationMethod", js.undefined)
    
    inline def setThrottledSaves(value: Boolean): Self = StObject.set(x, "throttledSaves", value.asInstanceOf[js.Any])
    
    inline def setThrottledSavesUndefined: Self = StObject.set(x, "throttledSaves", js.undefined)
  }
}
