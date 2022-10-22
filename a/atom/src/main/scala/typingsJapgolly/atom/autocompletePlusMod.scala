package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import typingsJapgolly.atom.mod.Point
import typingsJapgolly.atom.mod.TextEditor
import typingsJapgolly.atom.srcScopeDescriptorMod.ScopeDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompletePlusMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atom.autocompletePlusMod.TextSuggestion
    - typingsJapgolly.atom.autocompletePlusMod.SnippetSuggestion
  */
  trait AnySuggestion extends StObject
  object AnySuggestion {
    
    inline def SnippetSuggestion(snippet: String): typingsJapgolly.atom.autocompletePlusMod.SnippetSuggestion = {
      val __obj = js.Dynamic.literal(snippet = snippet.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.atom.autocompletePlusMod.SnippetSuggestion]
    }
    
    inline def TextSuggestion(text: String): typingsJapgolly.atom.autocompletePlusMod.TextSuggestion = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.atom.autocompletePlusMod.TextSuggestion]
    }
  }
  
  trait AutocompleteProvider extends StObject {
    
    /**
      *  Defines the scope selector(s) (can be comma-separated) for which your provider
      *  should not be used.
      */
    var disableForSelector: js.UndefOr[String] = js.undefined
    
    /** Will be called if your provider is being destroyed by autocomplete+ */
    var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Will not use lower priority providers when this provider is used. */
    var excludeLowerPriority: js.UndefOr[Boolean] = js.undefined
    
    /** Let autocomplete+ filter and sort the suggestions you provide. */
    var filterSuggestions: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  (experimental) Is called when a suggestion is selected by the user for
      *  the purpose of loading more information about the suggestion. Return a
      *  Promise of the new suggestion to replace it with or return null if
      *  no change is needed.
      */
    var getSuggestionDetailsOnSelect: js.UndefOr[
        js.Function1[
          /* suggestion */ AnySuggestion, 
          (js.Promise[AnySuggestion | Null]) | AnySuggestion | Null
        ]
      ] = js.undefined
    
    /**
      *  Is called when a suggestion request has been dispatched by autocomplete+ to
      *  your provider. Return an array of suggestions (if any) in the order you would
      *  like them displayed to the user. Returning a Promise of an array of suggestions
      *  is also supported.
      */
    def getSuggestions(params: SuggestionsRequestedEvent): Suggestions | js.Promise[Suggestions]
    
    /**
      *  A number to indicate its priority to be included in a suggestions request.
      *  The default provider has an inclusion priority of 0. Higher priority providers
      *  can suppress lower priority providers with excludeLowerPriority.
      */
    var inclusionPriority: js.UndefOr[Double] = js.undefined
    
    /**
      *  Function that is called when a suggestion from your provider was inserted
      *  into the buffer.
      */
    var onDidInsertSuggestion: js.UndefOr[js.Function1[/* params */ SuggestionInsertedEvent, Unit]] = js.undefined
    
    /**
      *  Defines the scope selector(s) (can be comma-separated) for which your provider
      *  should receive suggestion requests.
      */
    var selector: String
    
    /**
      *  A number to determine the sort order of suggestions. The default provider has
      *  an suggestion priority of 1.
      */
    var suggestionPriority: js.UndefOr[Double] = js.undefined
  }
  object AutocompleteProvider {
    
    inline def apply(
      getSuggestions: SuggestionsRequestedEvent => Suggestions | js.Promise[Suggestions],
      selector: String
    ): AutocompleteProvider = {
      val __obj = js.Dynamic.literal(getSuggestions = js.Any.fromFunction1(getSuggestions), selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteProvider]
    }
    
    extension [Self <: AutocompleteProvider](x: Self) {
      
      inline def setDisableForSelector(value: String): Self = StObject.set(x, "disableForSelector", value.asInstanceOf[js.Any])
      
      inline def setDisableForSelectorUndefined: Self = StObject.set(x, "disableForSelector", js.undefined)
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      inline def setExcludeLowerPriority(value: Boolean): Self = StObject.set(x, "excludeLowerPriority", value.asInstanceOf[js.Any])
      
      inline def setExcludeLowerPriorityUndefined: Self = StObject.set(x, "excludeLowerPriority", js.undefined)
      
      inline def setFilterSuggestions(value: Boolean): Self = StObject.set(x, "filterSuggestions", value.asInstanceOf[js.Any])
      
      inline def setFilterSuggestionsUndefined: Self = StObject.set(x, "filterSuggestions", js.undefined)
      
      inline def setGetSuggestionDetailsOnSelect(value: /* suggestion */ AnySuggestion => (js.Promise[AnySuggestion | Null]) | AnySuggestion | Null): Self = StObject.set(x, "getSuggestionDetailsOnSelect", js.Any.fromFunction1(value))
      
      inline def setGetSuggestionDetailsOnSelectUndefined: Self = StObject.set(x, "getSuggestionDetailsOnSelect", js.undefined)
      
      inline def setGetSuggestions(value: SuggestionsRequestedEvent => Suggestions | js.Promise[Suggestions]): Self = StObject.set(x, "getSuggestions", js.Any.fromFunction1(value))
      
      inline def setInclusionPriority(value: Double): Self = StObject.set(x, "inclusionPriority", value.asInstanceOf[js.Any])
      
      inline def setInclusionPriorityUndefined: Self = StObject.set(x, "inclusionPriority", js.undefined)
      
      inline def setOnDidInsertSuggestion(value: /* params */ SuggestionInsertedEvent => Callback): Self = StObject.set(x, "onDidInsertSuggestion", js.Any.fromFunction1((t0: /* params */ SuggestionInsertedEvent) => value(t0).runNow()))
      
      inline def setOnDidInsertSuggestionUndefined: Self = StObject.set(x, "onDidInsertSuggestion", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSuggestionPriority(value: Double): Self = StObject.set(x, "suggestionPriority", value.asInstanceOf[js.Any])
      
      inline def setSuggestionPriorityUndefined: Self = StObject.set(x, "suggestionPriority", js.undefined)
    }
  }
  
  trait SnippetSuggestion
    extends StObject
       with SuggestionBase
       with AnySuggestion {
    
    /**
      *  A snippet string. This will allow users to tab through function arguments
      *  or other options.
      */
    var snippet: String
  }
  object SnippetSuggestion {
    
    inline def apply(snippet: String): SnippetSuggestion = {
      val __obj = js.Dynamic.literal(snippet = snippet.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnippetSuggestion]
    }
    
    extension [Self <: SnippetSuggestion](x: Self) {
      
      inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    }
  }
  
  type Suggestion = AnySuggestion
  
  trait SuggestionBase extends StObject {
    
    /**
      *  Class name for the suggestion in the suggestion list. Allows you to style your
      *  suggestion via CSS, if desired.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      *  A doc-string summary or short description of the suggestion. When specified, it
      *  will be displayed at the bottom of the suggestions list.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      *  (experimental) Description with Markdown formatting.
      *  Takes precedence over plaintext description.
      */
    var descriptionMarkdown: js.UndefOr[String] = js.undefined
    
    /**
      *  A url to the documentation or more information about this suggestion.
      *  When specified, a More.. link will be displayed in the description area.
      */
    var descriptionMoreURL: js.UndefOr[String] = js.undefined
    
    /**
      *  A string that will show in the UI for this suggestion.
      *  When not set, snippet || text is displayed.
      */
    var displayText: js.UndefOr[String] = js.undefined
    
    /**
      *  If you want complete control over the icon shown against the suggestion.
      *  e.g. iconHTML: <i class="icon-move-right"></i>
      */
    var iconHTML: js.UndefOr[String] = js.undefined
    
    /** This is shown before the suggestion. Useful for return values. */
    var leftLabel: js.UndefOr[String] = js.undefined
    
    /** Use this instead of leftLabel if you want to use html for the left label. */
    var leftLabelHTML: js.UndefOr[String] = js.undefined
    
    /**
      *  The text immediately preceding the cursor, which will be replaced by the text.
      *  If not provided, the prefix passed into getSuggestions will be used.
      */
    var replacementPrefix: js.UndefOr[String] = js.undefined
    
    /**
      *  An indicator (e.g. function, variable) denoting the "kind" of suggestion this
      *  represents.
      */
    var rightLabel: js.UndefOr[String] = js.undefined
    
    /** Use this instead of rightLabel if you want to use html for the right label. */
    var rightLabelHTML: js.UndefOr[String] = js.undefined
    
    /**
      *  The suggestion type. It will be converted into an icon shown against the
      *  suggestion.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SuggestionBase {
    
    inline def apply(): SuggestionBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuggestionBase]
    }
    
    extension [Self <: SuggestionBase](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionMarkdown(value: String): Self = StObject.set(x, "descriptionMarkdown", value.asInstanceOf[js.Any])
      
      inline def setDescriptionMarkdownUndefined: Self = StObject.set(x, "descriptionMarkdown", js.undefined)
      
      inline def setDescriptionMoreURL(value: String): Self = StObject.set(x, "descriptionMoreURL", value.asInstanceOf[js.Any])
      
      inline def setDescriptionMoreURLUndefined: Self = StObject.set(x, "descriptionMoreURL", js.undefined)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
      
      inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
      
      inline def setIconHTML(value: String): Self = StObject.set(x, "iconHTML", value.asInstanceOf[js.Any])
      
      inline def setIconHTMLUndefined: Self = StObject.set(x, "iconHTML", js.undefined)
      
      inline def setLeftLabel(value: String): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      inline def setLeftLabelHTML(value: String): Self = StObject.set(x, "leftLabelHTML", value.asInstanceOf[js.Any])
      
      inline def setLeftLabelHTMLUndefined: Self = StObject.set(x, "leftLabelHTML", js.undefined)
      
      inline def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      inline def setReplacementPrefix(value: String): Self = StObject.set(x, "replacementPrefix", value.asInstanceOf[js.Any])
      
      inline def setReplacementPrefixUndefined: Self = StObject.set(x, "replacementPrefix", js.undefined)
      
      inline def setRightLabel(value: String): Self = StObject.set(x, "rightLabel", value.asInstanceOf[js.Any])
      
      inline def setRightLabelHTML(value: String): Self = StObject.set(x, "rightLabelHTML", value.asInstanceOf[js.Any])
      
      inline def setRightLabelHTMLUndefined: Self = StObject.set(x, "rightLabelHTML", js.undefined)
      
      inline def setRightLabelUndefined: Self = StObject.set(x, "rightLabel", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SuggestionInsertedEvent extends StObject {
    
    var editor: TextEditor
    
    var suggestion: TextSuggestion | SnippetSuggestion
    
    var triggerPosition: Point
  }
  object SuggestionInsertedEvent {
    
    inline def apply(editor: TextEditor, suggestion: TextSuggestion | SnippetSuggestion, triggerPosition: Point): SuggestionInsertedEvent = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], triggerPosition = triggerPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestionInsertedEvent]
    }
    
    extension [Self <: SuggestionInsertedEvent](x: Self) {
      
      inline def setEditor(value: TextEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setSuggestion(value: TextSuggestion | SnippetSuggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      inline def setTriggerPosition(value: Point): Self = StObject.set(x, "triggerPosition", value.asInstanceOf[js.Any])
    }
  }
  
  type Suggestions = js.Array[AnySuggestion]
  
  trait SuggestionsRequestedEvent extends StObject {
    
    /** Whether the autocomplete request was initiated by the user. */
    var activatedManually: Boolean
    
    /** The position of the cursor. */
    var bufferPosition: Point
    
    /** The current TextEditor. */
    var editor: TextEditor
    
    /** The prefix for the word immediately preceding the current cursor position. */
    var prefix: String
    
    /** The scope descriptor for the current cursor position. */
    var scopeDescriptor: ScopeDescriptor
  }
  object SuggestionsRequestedEvent {
    
    inline def apply(
      activatedManually: Boolean,
      bufferPosition: Point,
      editor: TextEditor,
      prefix: String,
      scopeDescriptor: ScopeDescriptor
    ): SuggestionsRequestedEvent = {
      val __obj = js.Dynamic.literal(activatedManually = activatedManually.asInstanceOf[js.Any], bufferPosition = bufferPosition.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestionsRequestedEvent]
    }
    
    extension [Self <: SuggestionsRequestedEvent](x: Self) {
      
      inline def setActivatedManually(value: Boolean): Self = StObject.set(x, "activatedManually", value.asInstanceOf[js.Any])
      
      inline def setBufferPosition(value: Point): Self = StObject.set(x, "bufferPosition", value.asInstanceOf[js.Any])
      
      inline def setEditor(value: TextEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setScopeDescriptor(value: ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextSuggestion
    extends StObject
       with SuggestionBase
       with AnySuggestion {
    
    /** The text which will be inserted into the editor, in place of the prefix. */
    var text: String
  }
  object TextSuggestion {
    
    inline def apply(text: String): TextSuggestion = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextSuggestion]
    }
    
    extension [Self <: TextSuggestion](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
