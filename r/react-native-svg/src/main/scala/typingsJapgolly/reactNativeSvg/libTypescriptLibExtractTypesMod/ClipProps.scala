package typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipProps extends StObject {
  
  var clipPath: js.UndefOr[String] = js.undefined
  
  var clipRule: js.UndefOr[FillRule] = js.undefined
}
object ClipProps {
  
  inline def apply(): ClipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipProps]
  }
  
  extension [Self <: ClipProps](x: Self) {
    
    inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    inline def setClipRule(value: FillRule): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
  }
}
