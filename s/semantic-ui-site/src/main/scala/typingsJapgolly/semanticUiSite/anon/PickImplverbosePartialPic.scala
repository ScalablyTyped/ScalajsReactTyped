package typingsJapgolly.semanticUiSite.anon

import typingsJapgolly.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import typingsJapgolly.semanticUiSite.SemanticUI.SiteSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, 'verbose'> & std.Partial<std.Pick<semantic-ui-site.SemanticUI.SiteSettings._Impl, keyof semantic-ui-site.SemanticUI.SiteSettings._Impl>> */
trait PickImplverbosePartialPic
  extends StObject
     with Param {
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var modules: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var namespaceStub: js.UndefOr[NamespaceStubSettings] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var siteNamespace: js.UndefOr[String] = js.undefined
  
  var verbose: Boolean & js.UndefOr[Boolean]
}
object PickImplverbosePartialPic {
  
  inline def apply(verbose: Boolean & js.UndefOr[Boolean]): PickImplverbosePartialPic = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplverbosePartialPic]
  }
  
  extension [Self <: PickImplverbosePartialPic](x: Self) {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceStub(value: NamespaceStubSettings): Self = StObject.set(x, "namespaceStub", value.asInstanceOf[js.Any])
    
    inline def setNamespaceStubUndefined: Self = StObject.set(x, "namespaceStub", js.undefined)
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSiteNamespace(value: String): Self = StObject.set(x, "siteNamespace", value.asInstanceOf[js.Any])
    
    inline def setSiteNamespaceUndefined: Self = StObject.set(x, "siteNamespace", js.undefined)
    
    inline def setVerbose(value: Boolean & js.UndefOr[Boolean]): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
