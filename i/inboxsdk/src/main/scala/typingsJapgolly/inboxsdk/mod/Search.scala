package typingsJapgolly.inboxsdk.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.inboxsdk.mod.Search.AutocompleteSearchResultText
    - typingsJapgolly.inboxsdk.mod.Search.AutocompleteSearchResultHtml
  */
  trait AutocompleteSearchResult extends StObject
  object AutocompleteSearchResult {
    
    inline def AutocompleteSearchResultHtml(descriptionHTML: String, nameHTML: String): typingsJapgolly.inboxsdk.mod.Search.AutocompleteSearchResultHtml = {
      val __obj = js.Dynamic.literal(descriptionHTML = descriptionHTML.asInstanceOf[js.Any], nameHTML = nameHTML.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.Search.AutocompleteSearchResultHtml]
    }
    
    inline def AutocompleteSearchResultText(description: String, name: String): typingsJapgolly.inboxsdk.mod.Search.AutocompleteSearchResultText = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.Search.AutocompleteSearchResultText]
    }
  }
  
  trait AutocompleteSearchResultBase extends StObject {
    
    var externalURL: js.UndefOr[String] = js.undefined
    
    var iconHTML: js.UndefOr[String] = js.undefined
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var routeName: js.UndefOr[String] = js.undefined
    
    var routeParams: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AutocompleteSearchResultBase {
    
    inline def apply(): AutocompleteSearchResultBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutocompleteSearchResultBase]
    }
    
    extension [Self <: AutocompleteSearchResultBase](x: Self) {
      
      inline def setExternalURL(value: String): Self = StObject.set(x, "externalURL", value.asInstanceOf[js.Any])
      
      inline def setExternalURLUndefined: Self = StObject.set(x, "externalURL", js.undefined)
      
      inline def setIconHTML(value: String): Self = StObject.set(x, "iconHTML", value.asInstanceOf[js.Any])
      
      inline def setIconHTMLUndefined: Self = StObject.set(x, "iconHTML", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
      
      inline def setRouteNameUndefined: Self = StObject.set(x, "routeName", js.undefined)
      
      inline def setRouteParams(value: js.Array[String]): Self = StObject.set(x, "routeParams", value.asInstanceOf[js.Any])
      
      inline def setRouteParamsUndefined: Self = StObject.set(x, "routeParams", js.undefined)
      
      inline def setRouteParamsVarargs(value: String*): Self = StObject.set(x, "routeParams", js.Array(value*))
    }
  }
  
  trait AutocompleteSearchResultHtml
    extends StObject
       with AutocompleteSearchResultBase
       with AutocompleteSearchResult {
    
    var descriptionHTML: String
    
    var nameHTML: String
  }
  object AutocompleteSearchResultHtml {
    
    inline def apply(descriptionHTML: String, nameHTML: String): AutocompleteSearchResultHtml = {
      val __obj = js.Dynamic.literal(descriptionHTML = descriptionHTML.asInstanceOf[js.Any], nameHTML = nameHTML.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteSearchResultHtml]
    }
    
    extension [Self <: AutocompleteSearchResultHtml](x: Self) {
      
      inline def setDescriptionHTML(value: String): Self = StObject.set(x, "descriptionHTML", value.asInstanceOf[js.Any])
      
      inline def setNameHTML(value: String): Self = StObject.set(x, "nameHTML", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutocompleteSearchResultText
    extends StObject
       with AutocompleteSearchResultBase
       with AutocompleteSearchResult {
    
    var description: String
    
    var name: String
  }
  object AutocompleteSearchResultText {
    
    inline def apply(description: String, name: String): AutocompleteSearchResultText = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteSearchResultText]
    }
    
    extension [Self <: AutocompleteSearchResultText](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchInstance extends StObject {
    
    def registerSearchQueryRewriter(rewriter: SearchQueryRewriter): Unit
    
    def registerSearchSuggestionsProvider(
      handler: js.Function1[
          /* query */ String, 
          js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
        ]
    ): Unit
  }
  object SearchInstance {
    
    inline def apply(
      registerSearchQueryRewriter: SearchQueryRewriter => Callback,
      registerSearchSuggestionsProvider: js.Function1[
          /* query */ String, 
          js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
        ] => Callback
    ): SearchInstance = {
      val __obj = js.Dynamic.literal(registerSearchQueryRewriter = js.Any.fromFunction1((t0: SearchQueryRewriter) => registerSearchQueryRewriter(t0).runNow()), registerSearchSuggestionsProvider = js.Any.fromFunction1((t0: js.Function1[
          /* query */ String, 
          js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
        ]) => registerSearchSuggestionsProvider(t0).runNow()))
      __obj.asInstanceOf[SearchInstance]
    }
    
    extension [Self <: SearchInstance](x: Self) {
      
      inline def setRegisterSearchQueryRewriter(value: SearchQueryRewriter => Callback): Self = StObject.set(x, "registerSearchQueryRewriter", js.Any.fromFunction1((t0: SearchQueryRewriter) => value(t0).runNow()))
      
      inline def setRegisterSearchSuggestionsProvider(
        value: js.Function1[
              /* query */ String, 
              js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
            ] => Callback
      ): Self = StObject.set(x, "registerSearchSuggestionsProvider", js.Any.fromFunction1((t0: js.Function1[
              /* query */ String, 
              js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
            ]) => value(t0).runNow()))
    }
  }
  
  trait SearchQueryRewriter extends StObject {
    
    var term: String
    
    def termReplacer(): String | js.Promise[String]
  }
  object SearchQueryRewriter {
    
    inline def apply(term: String, termReplacer: CallbackTo[String | js.Promise[String]]): SearchQueryRewriter = {
      val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any], termReplacer = termReplacer.toJsFn)
      __obj.asInstanceOf[SearchQueryRewriter]
    }
    
    extension [Self <: SearchQueryRewriter](x: Self) {
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setTermReplacer(value: CallbackTo[String | js.Promise[String]]): Self = StObject.set(x, "termReplacer", value.toJsFn)
    }
  }
}
