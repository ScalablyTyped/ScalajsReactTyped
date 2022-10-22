package typingsJapgolly.zinggrid.ZSoft.ZingGridAttributes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZGCaption extends StObject {
  
  /**
    * @description The alignment of content in the caption
    */
  var align: js.UndefOr[String] = js.undefined
  
  /**
    * @description Indicates where to position the caption
    */
  var position: js.UndefOr[String] = js.undefined
}
object ZGCaption {
  
  inline def apply(): ZGCaption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZGCaption]
  }
  
  extension [Self <: ZGCaption](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
