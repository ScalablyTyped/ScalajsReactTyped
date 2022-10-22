package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.mapMarkerTypesMod.AnchorPositions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anchor extends StObject {
  
  @JSName("$anchor")
  var $anchor: AnchorPositions
  
  @JSName("$anchorSize")
  var $anchorSize: Double
}
object Anchor {
  
  inline def apply($anchor: AnchorPositions, $anchorSize: Double): Anchor = {
    val __obj = js.Dynamic.literal($anchor = $anchor.asInstanceOf[js.Any], $anchorSize = $anchorSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  extension [Self <: Anchor](x: Self) {
    
    inline def set$anchor(value: AnchorPositions): Self = StObject.set(x, "$anchor", value.asInstanceOf[js.Any])
    
    inline def set$anchorSize(value: Double): Self = StObject.set(x, "$anchorSize", value.asInstanceOf[js.Any])
  }
}
