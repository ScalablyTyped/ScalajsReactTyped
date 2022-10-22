package typingsJapgolly.fullcalendarCommon.mod

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.body
import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.footer
import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollGridSectionConfig
  extends StObject
     with SectionConfig {
  
  var chunks: js.UndefOr[js.Array[ScrollGridChunkConfig]] = js.undefined
  
  var key: String
}
object ScrollGridSectionConfig {
  
  inline def apply(key: String, `type`: body | header | footer): ScrollGridSectionConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollGridSectionConfig]
  }
  
  extension [Self <: ScrollGridSectionConfig](x: Self) {
    
    inline def setChunks(value: js.Array[ScrollGridChunkConfig]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setChunksVarargs(value: ScrollGridChunkConfig*): Self = StObject.set(x, "chunks", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
