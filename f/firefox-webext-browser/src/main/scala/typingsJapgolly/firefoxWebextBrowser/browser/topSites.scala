package typingsJapgolly.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the browser.topSites API to access the top sites that are displayed on the new tab page.
  *
  * Permissions: `topSites`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object topSites {
  
  trait GetOptions extends StObject {
    
    /** Include sites that the user has blocked from appearing on the Firefox new tab. */
    var includeBlocked: js.UndefOr[Boolean] = js.undefined
    
    /** Include sites favicon if available. */
    var includeFavicon: js.UndefOr[Boolean] = js.undefined
    
    /** Include sites that the user has pinned on the Firefox new tab. */
    var includePinned: js.UndefOr[Boolean] = js.undefined
    
    /** Include search shortcuts appearing on the Firefox new tab. */
    var includeSearchShortcuts: js.UndefOr[Boolean] = js.undefined
    
    /** The number of top sites to return, defaults to the value used by Firefox */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Return the sites that exactly appear on the user's new-tab page. When true, all other options are ignored except limit and includeFavicon. If the user disabled newtab Top Sites, the newtab parameter will be ignored.
      */
    var newtab: js.UndefOr[Boolean] = js.undefined
    
    /** Limit the result to a single top site link per domain */
    var onePerDomain: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Please use the other options to tune the results received from topSites. */
    var providers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GetOptions {
    
    inline def apply(): GetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions]
    }
    
    extension [Self <: GetOptions](x: Self) {
      
      inline def setIncludeBlocked(value: Boolean): Self = StObject.set(x, "includeBlocked", value.asInstanceOf[js.Any])
      
      inline def setIncludeBlockedUndefined: Self = StObject.set(x, "includeBlocked", js.undefined)
      
      inline def setIncludeFavicon(value: Boolean): Self = StObject.set(x, "includeFavicon", value.asInstanceOf[js.Any])
      
      inline def setIncludeFaviconUndefined: Self = StObject.set(x, "includeFavicon", js.undefined)
      
      inline def setIncludePinned(value: Boolean): Self = StObject.set(x, "includePinned", value.asInstanceOf[js.Any])
      
      inline def setIncludePinnedUndefined: Self = StObject.set(x, "includePinned", js.undefined)
      
      inline def setIncludeSearchShortcuts(value: Boolean): Self = StObject.set(x, "includeSearchShortcuts", value.asInstanceOf[js.Any])
      
      inline def setIncludeSearchShortcutsUndefined: Self = StObject.set(x, "includeSearchShortcuts", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setNewtab(value: Boolean): Self = StObject.set(x, "newtab", value.asInstanceOf[js.Any])
      
      inline def setNewtabUndefined: Self = StObject.set(x, "newtab", js.undefined)
      
      inline def setOnePerDomain(value: Boolean): Self = StObject.set(x, "onePerDomain", value.asInstanceOf[js.Any])
      
      inline def setOnePerDomainUndefined: Self = StObject.set(x, "onePerDomain", js.undefined)
      
      inline def setProviders(value: js.Array[String]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
      
      inline def setProvidersVarargs(value: String*): Self = StObject.set(x, "providers", js.Array(value*))
    }
  }
  
  /* topSites types */
  /** An object encapsulating a most visited URL, such as the URLs on the new tab page. */
  trait MostVisitedURL extends StObject {
    
    /** Data URL for the favicon, if available. */
    var favicon: js.UndefOr[String] = js.undefined
    
    /** The title of the page. */
    var title: js.UndefOr[String] = js.undefined
    
    /** The entry type, either `url` for a normal page link, or `search` for a search shortcut. */
    var `type`: js.UndefOr[MostVisitedURLType] = js.undefined
    
    /** The most visited URL. */
    var url: String
  }
  object MostVisitedURL {
    
    inline def apply(url: String): MostVisitedURL = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MostVisitedURL]
    }
    
    extension [Self <: MostVisitedURL](x: Self) {
      
      inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: MostVisitedURLType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /** The entry type, either `url` for a normal page link, or `search` for a search shortcut. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
  */
  trait MostVisitedURLType extends StObject
  object MostVisitedURLType {
    
    inline def search: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = "search".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.search]
    
    inline def url: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = "url".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.url]
  }
}
