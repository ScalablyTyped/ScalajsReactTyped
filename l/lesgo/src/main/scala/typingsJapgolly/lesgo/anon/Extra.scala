package typingsJapgolly.lesgo.anon

import typingsJapgolly.lesgo.servicesLoggerServiceMod.LoggerMeta
import typingsJapgolly.lesgo.servicesLoggerServiceMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extra extends StObject {
  
  var extra: js.UndefOr[LoggerMeta & Tags] = js.undefined
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object Extra {
  
  inline def apply(): Extra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extra]
  }
  
  extension [Self <: Extra](x: Self) {
    
    inline def setExtra(value: LoggerMeta & Tags): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
