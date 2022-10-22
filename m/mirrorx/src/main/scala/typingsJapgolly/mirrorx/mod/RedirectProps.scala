package typingsJapgolly.mirrorx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectProps extends StObject {
  
  var exact: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var push: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
}
object RedirectProps {
  
  inline def apply(
    to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
  ): RedirectProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectProps]
  }
  
  extension [Self <: RedirectProps](x: Self) {
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTo(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.LocationDescriptor */ Any
    ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
