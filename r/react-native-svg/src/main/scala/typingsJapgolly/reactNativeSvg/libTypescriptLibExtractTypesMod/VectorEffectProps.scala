package typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod

import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.`non-scaling-stroke`
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.default
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.inherit
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.nonScalingStroke
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.none
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorEffectProps extends StObject {
  
  var vectorEffect: js.UndefOr[none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri] = js.undefined
}
object VectorEffectProps {
  
  inline def apply(): VectorEffectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorEffectProps]
  }
  
  extension [Self <: VectorEffectProps](x: Self) {
    
    inline def setVectorEffect(value: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
    
    inline def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
  }
}
