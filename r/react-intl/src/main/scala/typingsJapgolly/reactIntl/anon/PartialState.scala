package typingsJapgolly.reactIntl.anon

import typingsJapgolly.reactIntl.srcTypesMod.IntlConfig
import typingsJapgolly.reactIntl.srcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-intl.react-intl/src/components/provider.State> */
trait PartialState extends StObject {
  
  var cache: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlCache */ Any
  ] = js.undefined
  
  var intl: js.UndefOr[IntlShape] = js.undefined
  
  var prevConfig: js.UndefOr[IntlConfig] = js.undefined
}
object PartialState {
  
  inline def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  
  extension [Self <: PartialState](x: Self) {
    
    inline def setCache(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlCache */ Any
    ): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
    
    inline def setIntlUndefined: Self = StObject.set(x, "intl", js.undefined)
    
    inline def setPrevConfig(value: IntlConfig): Self = StObject.set(x, "prevConfig", value.asInstanceOf[js.Any])
    
    inline def setPrevConfigUndefined: Self = StObject.set(x, "prevConfig", js.undefined)
  }
}
