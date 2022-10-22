package typingsJapgolly.antvGLite.distUtilsGradientMod

import typingsJapgolly.antvGLite.antvGLiteStrings.`bottom left`
import typingsJapgolly.antvGLite.antvGLiteStrings.`bottom right`
import typingsJapgolly.antvGLite.antvGLiteStrings.`left bottom`
import typingsJapgolly.antvGLite.antvGLiteStrings.`left top`
import typingsJapgolly.antvGLite.antvGLiteStrings.`right bottom`
import typingsJapgolly.antvGLite.antvGLiteStrings.`right top`
import typingsJapgolly.antvGLite.antvGLiteStrings.`top left`
import typingsJapgolly.antvGLite.antvGLiteStrings.`top right`
import typingsJapgolly.antvGLite.antvGLiteStrings.bottom
import typingsJapgolly.antvGLite.antvGLiteStrings.directional
import typingsJapgolly.antvGLite.antvGLiteStrings.left
import typingsJapgolly.antvGLite.antvGLiteStrings.right
import typingsJapgolly.antvGLite.antvGLiteStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionalNode extends StObject {
  
  var `type`: directional
  
  var value: left | top | bottom | right | (`left top`) | (`top left`) | (`left bottom`) | (`bottom left`) | (`right top`) | (`top right`) | (`right bottom`) | (`bottom right`)
}
object DirectionalNode {
  
  inline def apply(
    value: left | top | bottom | right | (`left top`) | (`top left`) | (`left bottom`) | (`bottom left`) | (`right top`) | (`top right`) | (`right bottom`) | (`bottom right`)
  ): DirectionalNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("directional")
    __obj.asInstanceOf[DirectionalNode]
  }
  
  extension [Self <: DirectionalNode](x: Self) {
    
    inline def setType(value: directional): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: left | top | bottom | right | (`left top`) | (`top left`) | (`left bottom`) | (`bottom left`) | (`right top`) | (`top right`) | (`right bottom`) | (`bottom right`)
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
