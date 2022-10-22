package typingsJapgolly.wordpressComponents.anon

import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom left`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`bottom right`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top left`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`top right`
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.bottom
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origin extends StObject {
  
  var origin: js.UndefOr[top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)] = js.undefined
}
object Origin {
  
  inline def apply(): Origin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origin]
  }
  
  extension [Self <: Origin](x: Self) {
    
    inline def setOrigin(value: top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
