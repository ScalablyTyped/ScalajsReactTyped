package typingsJapgolly.firefoxWebextBrowser.browser

import typingsJapgolly.firefoxWebextBrowser.browser.extensionTypes.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.history` API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
  *
  * Permissions: `history`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object history {
  
  trait AddUrlDetails extends StObject {
    
    /** The title of the page. */
    var title: js.UndefOr[String] = js.undefined
    
    /** The transition type for this visit from its referrer. */
    var transition: js.UndefOr[TransitionType] = js.undefined
    
    /** The URL to add. Must be a valid URL that can be added to history. */
    var url: String
    
    /** The date when this visit occurred. */
    var visitTime: js.UndefOr[Date] = js.undefined
  }
  object AddUrlDetails {
    
    inline def apply(url: String): AddUrlDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddUrlDetails]
    }
    
    extension [Self <: AddUrlDetails](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVisitTime(value: Date): Self = StObject.set(x, "visitTime", value.asInstanceOf[js.Any])
      
      inline def setVisitTimeUndefined: Self = StObject.set(x, "visitTime", js.undefined)
    }
  }
  
  trait DeleteRangeRange extends StObject {
    
    /** Items added to history before this date. */
    var endTime: Date
    
    /** Items added to history after this date. */
    var startTime: Date
  }
  object DeleteRangeRange {
    
    inline def apply(endTime: Date, startTime: Date): DeleteRangeRange = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteRangeRange]
    }
    
    extension [Self <: DeleteRangeRange](x: Self) {
      
      inline def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteUrlDetails extends StObject {
    
    /** The URL to remove. */
    var url: String
  }
  object DeleteUrlDetails {
    
    inline def apply(url: String): DeleteUrlDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteUrlDetails]
    }
    
    extension [Self <: DeleteUrlDetails](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetVisitsDetails extends StObject {
    
    /**
      * The URL for which to retrieve visit information. It must be in the format as returned from a call to history.search.
      */
    var url: String
  }
  object GetVisitsDetails {
    
    inline def apply(url: String): GetVisitsDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVisitsDetails]
    }
    
    extension [Self <: GetVisitsDetails](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /** An object encapsulating one result of a history query. */
  trait HistoryItem extends StObject {
    
    /** The unique identifier for the item. */
    var id: String
    
    /** When this page was last loaded, represented in milliseconds since the epoch. */
    var lastVisitTime: js.UndefOr[Double] = js.undefined
    
    /** The title of the page when it was last loaded. */
    var title: js.UndefOr[String] = js.undefined
    
    /** The number of times the user has navigated to this page by typing in the address. */
    var typedCount: js.UndefOr[Double] = js.undefined
    
    /** The URL navigated to by a user. */
    var url: js.UndefOr[String] = js.undefined
    
    /** The number of times the user has navigated to this page. */
    var visitCount: js.UndefOr[Double] = js.undefined
  }
  object HistoryItem {
    
    inline def apply(id: String): HistoryItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryItem]
    }
    
    extension [Self <: HistoryItem](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastVisitTime(value: Double): Self = StObject.set(x, "lastVisitTime", value.asInstanceOf[js.Any])
      
      inline def setLastVisitTimeUndefined: Self = StObject.set(x, "lastVisitTime", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTypedCount(value: Double): Self = StObject.set(x, "typedCount", value.asInstanceOf[js.Any])
      
      inline def setTypedCountUndefined: Self = StObject.set(x, "typedCount", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVisitCount(value: Double): Self = StObject.set(x, "visitCount", value.asInstanceOf[js.Any])
      
      inline def setVisitCountUndefined: Self = StObject.set(x, "visitCount", js.undefined)
    }
  }
  
  trait OnTitleChangedChanged extends StObject {
    
    /** The new title for the URL. */
    var title: String
    
    /** The URL for which the title has changed */
    var url: String
  }
  object OnTitleChangedChanged {
    
    inline def apply(title: String, url: String): OnTitleChangedChanged = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnTitleChangedChanged]
    }
    
    extension [Self <: OnTitleChangedChanged](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnVisitRemovedRemoved extends StObject {
    
    /** True if all history was removed. If true, then urls will be empty. */
    var allHistory: Boolean
    
    var urls: js.Array[String]
  }
  object OnVisitRemovedRemoved {
    
    inline def apply(allHistory: Boolean, urls: js.Array[String]): OnVisitRemovedRemoved = {
      val __obj = js.Dynamic.literal(allHistory = allHistory.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnVisitRemovedRemoved]
    }
    
    extension [Self <: OnVisitRemovedRemoved](x: Self) {
      
      inline def setAllHistory(value: Boolean): Self = StObject.set(x, "allHistory", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  trait SearchQuery extends StObject {
    
    /** Limit results to those visited before this date. */
    var endTime: js.UndefOr[Date] = js.undefined
    
    /** The maximum number of results to retrieve. Defaults to 100. */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /**
      * Limit results to those visited after this date. If not specified, this defaults to 24 hours in the past.
      */
    var startTime: js.UndefOr[Date] = js.undefined
    
    /** A free-text query to the history service. Leave empty to retrieve all pages. */
    var text: String
  }
  object SearchQuery {
    
    inline def apply(text: String): SearchQuery = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchQuery]
    }
    
    extension [Self <: SearchQuery](x: Self) {
      
      inline def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* history types */
  /** The transition type for this visit from its referrer. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.link
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_toplevel
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword
    - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated
  */
  trait TransitionType extends StObject
  object TransitionType {
    
    inline def auto_bookmark: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark = "auto_bookmark".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark]
    
    inline def auto_subframe: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe = "auto_subframe".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe]
    
    inline def auto_toplevel: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_toplevel = "auto_toplevel".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_toplevel]
    
    inline def form_submit: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit = "form_submit".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit]
    
    inline def generated: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated = "generated".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated]
    
    inline def keyword: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword = "keyword".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword]
    
    inline def keyword_generated: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated = "keyword_generated".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated]
    
    inline def link: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.link = "link".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.link]
    
    inline def manual_subframe: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe = "manual_subframe".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe]
    
    inline def reload: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload = "reload".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload]
    
    inline def typed: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed = "typed".asInstanceOf[typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed]
  }
  
  /** An object encapsulating one visit to a URL. */
  trait VisitItem extends StObject {
    
    /** The unique identifier for the item. */
    var id: String
    
    /** The visit ID of the referrer. */
    var referringVisitId: String
    
    /** The transition type for this visit from its referrer. */
    var transition: TransitionType
    
    /** The unique identifier for this visit. */
    var visitId: String
    
    /** When this visit occurred, represented in milliseconds since the epoch. */
    var visitTime: js.UndefOr[Double] = js.undefined
  }
  object VisitItem {
    
    inline def apply(id: String, referringVisitId: String, transition: TransitionType, visitId: String): VisitItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referringVisitId = referringVisitId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visitId = visitId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisitItem]
    }
    
    extension [Self <: VisitItem](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setReferringVisitId(value: String): Self = StObject.set(x, "referringVisitId", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setVisitId(value: String): Self = StObject.set(x, "visitId", value.asInstanceOf[js.Any])
      
      inline def setVisitTime(value: Double): Self = StObject.set(x, "visitTime", value.asInstanceOf[js.Any])
      
      inline def setVisitTimeUndefined: Self = StObject.set(x, "visitTime", js.undefined)
    }
  }
}
