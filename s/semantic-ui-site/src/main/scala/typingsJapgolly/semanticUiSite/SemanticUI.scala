package typingsJapgolly.semanticUiSite

import typingsJapgolly.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import typingsJapgolly.semanticUiSite.SemanticUI.Site.NamespaceStubSettings.Param
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.destroy
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Site extends StObject {
    
    def apply(): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    def apply(behavior: setting, value: SiteSettings): JQuery = js.native
    def apply(settings: SiteSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-site.SemanticUI.SiteSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-site.SemanticUI.SiteSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any = js.native
    
    var settings: SiteSettings = js.native
  }
  object Site {
    
    object NamespaceStubSettings {
      
      trait Impl extends StObject {
        
        var cache: Any
        
        var config: Any
        
        var section: Any
        
        var sections: Any
        
        var utilities: Any
      }
      object Impl {
        
        inline def apply(cache: Any, config: Any, section: Any, sections: Any, utilities: Any): Impl = {
          val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], utilities = utilities.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
          
          inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
          
          inline def setSection(value: Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
          
          inline def setSections(value: Any): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
          
          inline def setUtilities(value: Any): Self = StObject.set(x, "utilities", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiSite.anon.PickImplcachePartialPickI
        - typingsJapgolly.semanticUiSite.anon.PickImplconfigPartialPick
        - typingsJapgolly.semanticUiSite.anon.PickImplsectionsPartialPi
        - typingsJapgolly.semanticUiSite.anon.PickImplsectionPartialPic
        - typingsJapgolly.semanticUiSite.anon.PickImplutilitiesPartialP
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplcachePartialPickI(cache: Any & js.UndefOr[Any]): typingsJapgolly.semanticUiSite.anon.PickImplcachePartialPickI = {
          val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplcachePartialPickI]
        }
        
        inline def PickImplconfigPartialPick(config: Any & js.UndefOr[Any]): typingsJapgolly.semanticUiSite.anon.PickImplconfigPartialPick = {
          val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplconfigPartialPick]
        }
        
        inline def PickImplsectionPartialPic(section: Any & js.UndefOr[Any]): typingsJapgolly.semanticUiSite.anon.PickImplsectionPartialPic = {
          val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplsectionPartialPic]
        }
        
        inline def PickImplsectionsPartialPi(sections: Any & js.UndefOr[Any]): typingsJapgolly.semanticUiSite.anon.PickImplsectionsPartialPi = {
          val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplsectionsPartialPi]
        }
        
        inline def PickImplutilitiesPartialP(utilities: Any & js.UndefOr[Any]): typingsJapgolly.semanticUiSite.anon.PickImplutilitiesPartialP = {
          val __obj = js.Dynamic.literal(utilities = utilities.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplutilitiesPartialP]
        }
      }
    }
    type NamespaceStubSettings = Param
  }
  
  object SiteSettings {
    
    trait Impl extends StObject {
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      var modules: js.Array[String]
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String
      
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String
      
      var namespaceStub: NamespaceStubSettings
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      var siteNamespace: String
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        debug: Boolean,
        modules: js.Array[String],
        name: String,
        namespace: String,
        namespaceStub: NamespaceStubSettings,
        performance: Boolean,
        silent: Boolean,
        siteNamespace: String,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], namespaceStub = namespaceStub.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], siteNamespace = siteNamespace.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
        
        inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setNamespaceStub(value: NamespaceStubSettings): Self = StObject.set(x, "namespaceStub", value.asInstanceOf[js.Any])
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setSiteNamespace(value: String): Self = StObject.set(x, "siteNamespace", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiSite.anon.PickImplmodulesPartialPic
      - typingsJapgolly.semanticUiSite.anon.PickImplsiteNamespacePart
      - typingsJapgolly.semanticUiSite.anon.PickImplnamespaceStubPart
      - typingsJapgolly.semanticUiSite.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiSite.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiSite.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiSite.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiSite.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiSite.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSite.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImplmodulesPartialPic(modules: js.Array[String] & js.UndefOr[js.Array[String]]): typingsJapgolly.semanticUiSite.anon.PickImplmodulesPartialPic = {
        val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplmodulesPartialPic]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiSite.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiSite.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplnamespaceStubPart(namespaceStub: NamespaceStubSettings & js.UndefOr[NamespaceStubSettings]): typingsJapgolly.semanticUiSite.anon.PickImplnamespaceStubPart = {
        val __obj = js.Dynamic.literal(namespaceStub = namespaceStub.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplnamespaceStubPart]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSite.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplperformancePartia]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSite.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplsiteNamespacePart(siteNamespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiSite.anon.PickImplsiteNamespacePart = {
        val __obj = js.Dynamic.literal(siteNamespace = siteNamespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplsiteNamespacePart]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSite.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiSite.anon.PickImplverbosePartialPic]
      }
    }
  }
  type SiteSettings = typingsJapgolly.semanticUiSite.SemanticUI.SiteSettings.Param
}
