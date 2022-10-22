package typingsJapgolly.semanticUiSite.anon

import typingsJapgolly.semanticUiSite.SemanticUI.Site.NamespaceStubSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, 'config'> & std.Partial<std.Pick<semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl, keyof semantic-ui-site.SemanticUI.Site.NamespaceStubSettings._Impl>> */
trait PickImplconfigPartialPick
  extends StObject
     with Param {
  
  var cache: js.UndefOr[Any] = js.undefined
  
  var config: Any & js.UndefOr[Any]
  
  var section: js.UndefOr[Any] = js.undefined
  
  var sections: js.UndefOr[Any] = js.undefined
  
  var utilities: js.UndefOr[Any] = js.undefined
}
object PickImplconfigPartialPick {
  
  inline def apply(config: Any & js.UndefOr[Any]): PickImplconfigPartialPick = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplconfigPartialPick]
  }
  
  extension [Self <: PickImplconfigPartialPick](x: Self) {
    
    inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setConfig(value: Any & js.UndefOr[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSection(value: Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setSections(value: Any): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setUtilities(value: Any): Self = StObject.set(x, "utilities", value.asInstanceOf[js.Any])
    
    inline def setUtilitiesUndefined: Self = StObject.set(x, "utilities", js.undefined)
  }
}
