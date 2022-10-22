package typingsJapgolly.winrt.global.Windows.ApplicationModel

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  @JSGlobal("Windows.ApplicationModel.Search.LocalContentSuggestionSettings")
  @js.native
  open class LocalContentSuggestionSettings ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.LocalContentSuggestionSettings {
    
    /* CompleteClass */
    var aqsFilter: String = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    var locations: IVector[StorageFolder] = js.native
    
    /* CompleteClass */
    var propertiesToMatch: IVector[String] = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPane")
  @js.native
  open class SearchPane ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPane
  /* static members */
  object SearchPane {
    
    @JSGlobal("Windows.ApplicationModel.Search.SearchPane")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPane = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPane]
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs")
  @js.native
  open class SearchPaneQueryChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs {
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var linguisticDetails: typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
    
    /* CompleteClass */
    var queryText: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails")
  @js.native
  open class SearchPaneQueryLinguisticDetails ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails {
    
    /* CompleteClass */
    var queryTextAlternatives: IVectorView[String] = js.native
    
    /* CompleteClass */
    var queryTextCompositionLength: Double = js.native
    
    /* CompleteClass */
    var queryTextCompositionStart: Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs")
  @js.native
  open class SearchPaneQuerySubmittedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs {
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var queryText: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs")
  @js.native
  open class SearchPaneResultSuggestionChosenEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs {
    
    /* CompleteClass */
    var tag: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest")
  @js.native
  open class SearchPaneSuggestionsRequest ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest {
    
    /* CompleteClass */
    override def getDeferral(): typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral = js.native
    
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /* CompleteClass */
    var searchSuggestionCollection: typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchSuggestionCollection = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral")
  @js.native
  open class SearchPaneSuggestionsRequestDeferral ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs")
  @js.native
  open class SearchPaneSuggestionsRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs {
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var linguisticDetails: typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
    
    /* CompleteClass */
    var queryText: String = js.native
    
    /* CompleteClass */
    var request: typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs")
  @js.native
  open class SearchPaneVisibilityChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs {
    
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionCollection")
  @js.native
  open class SearchSuggestionCollection ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Search.SearchSuggestionCollection {
    
    /* CompleteClass */
    override def appendQuerySuggestion(text: String): Unit = js.native
    
    /* CompleteClass */
    override def appendQuerySuggestions(suggestions: IIterable[String]): Unit = js.native
    
    /* CompleteClass */
    override def appendResultSuggestion(
      text: String,
      detailText: String,
      tag: String,
      image: IRandomAccessStreamReference,
      imageAlternateText: String
    ): Unit = js.native
    
    /* CompleteClass */
    override def appendSearchSeparator(label: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
}
