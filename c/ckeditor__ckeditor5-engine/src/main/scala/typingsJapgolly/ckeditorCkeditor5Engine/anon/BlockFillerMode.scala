package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.data
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.editing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockFillerMode extends StObject {
  
  var blockFillerMode: js.UndefOr[typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.BlockFillerMode] = js.undefined
  
  var renderingMode: js.UndefOr[data | editing] = js.undefined
}
object BlockFillerMode {
  
  inline def apply(): BlockFillerMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockFillerMode]
  }
  
  extension [Self <: BlockFillerMode](x: Self) {
    
    inline def setBlockFillerMode(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.BlockFillerMode): Self = StObject.set(x, "blockFillerMode", value.asInstanceOf[js.Any])
    
    inline def setBlockFillerModeUndefined: Self = StObject.set(x, "blockFillerMode", js.undefined)
    
    inline def setRenderingMode(value: data | editing): Self = StObject.set(x, "renderingMode", value.asInstanceOf[js.Any])
    
    inline def setRenderingModeUndefined: Self = StObject.set(x, "renderingMode", js.undefined)
  }
}
