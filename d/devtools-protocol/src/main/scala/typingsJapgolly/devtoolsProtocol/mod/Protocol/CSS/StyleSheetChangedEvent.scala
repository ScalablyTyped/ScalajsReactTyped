package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheetChangedEvent extends StObject {
  
  var styleSheetId: StyleSheetId
}
object StyleSheetChangedEvent {
  
  inline def apply(styleSheetId: StyleSheetId): StyleSheetChangedEvent = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetChangedEvent]
  }
  
  extension [Self <: StyleSheetChangedEvent](x: Self) {
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
