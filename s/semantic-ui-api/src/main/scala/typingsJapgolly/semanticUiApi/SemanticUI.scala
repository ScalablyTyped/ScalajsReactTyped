package typingsJapgolly.semanticUiApi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jquery.JQuery.Deferred
import typingsJapgolly.jquery.JQuery.jqXHR
import typingsJapgolly.jquery.JQueryDeferred
import typingsJapgolly.semanticUiApi.SemanticUI.Api.ClassNameSettings
import typingsJapgolly.semanticUiApi.SemanticUI.Api.ClassNameSettings.Param
import typingsJapgolly.semanticUiApi.SemanticUI.Api.ErrorSettings
import typingsJapgolly.semanticUiApi.SemanticUI.Api.MetadataSettings
import typingsJapgolly.semanticUiApi.SemanticUI.Api.RegExpSettings
import typingsJapgolly.semanticUiApi.SemanticUI.Api.SelectorSettings
import typingsJapgolly.semanticUiApi.semanticUiApiBooleans.`false`
import typingsJapgolly.semanticUiApi.semanticUiApiBooleans.`true`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`add url data`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`create cache`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`get event`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`get request`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`get url encoded value`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`is disabled`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`is loading`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`is mocked`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`read cached response`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`remove error`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`remove loading`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`set error`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`set loading`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`was cancelled`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`was complete`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`was failure`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`was successful`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.`write cached response`
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.abort
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.auto
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.delete
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.destroy
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.get
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.head
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.html
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.json
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.jsonp
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.local
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.options
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.patch
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.post
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.put
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.query
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.reset
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.script
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.setting
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.text
import typingsJapgolly.semanticUiApi.semanticUiApiStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Api extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Adds data to existing templated url and returns full url string
      */
    def apply(behavior: `add url data`, url: String, data: Any): String = js.native
    /**
      * Creates new cache, removing all locally cached URLs
      */
    def apply(behavior: `create cache`): JQuery = js.native
    /**
      * Gets event that API request will occur on
      */
    def apply(behavior: `get event`): String = js.native
    /**
      * Gets promise for current API request
      */
    def apply(behavior: `get request`): JQueryDeferred[Any] | `false` = js.native
    /**
      * Returns encodeURIComponent value only if value passed is not already encoded
      */
    def apply(behavior: `get url encoded value`, value: Any): String = js.native
    /**
      * Returns whether element is disabled
      */
    def apply(behavior: `is disabled`): Boolean = js.native
    /**
      * Returns whether element is loading
      */
    def apply(behavior: `is loading`): Boolean = js.native
    /**
      * Returns whether element response is mocked
      */
    def apply(behavior: `is mocked`): Boolean = js.native
    /**
      * Reads a locally cached response for a URL
      */
    def apply(behavior: `read cached response`, url: String): Any = js.native
    /**
      * Removes error state to element
      */
    def apply(behavior: `remove error`): JQuery = js.native
    /**
      * Removes loading state to element
      */
    def apply(behavior: `remove loading`): JQuery = js.native
    /**
      * Sets error state to element
      */
    def apply(behavior: `set error`): JQuery = js.native
    /**
      * Sets loading state to element
      */
    def apply(behavior: `set loading`): JQuery = js.native
    /**
      * Returns whether last request was cancelled
      */
    def apply(behavior: `was cancelled`): Boolean = js.native
    /**
      * Returns whether last request was completed
      */
    def apply(behavior: `was complete`): Boolean = js.native
    /**
      * Returns whether last request was failure
      */
    def apply(behavior: `was failure`): Boolean = js.native
    /**
      * Returns whether last request was successful
      */
    def apply(behavior: `was successful`): Boolean = js.native
    /**
      * Writes a cached response for a URL
      */
    def apply(behavior: `write cached response`, url: String, response: Any): JQuery = js.native
    /**
      * Aborts current API request
      */
    def apply(behavior: abort): JQuery = js.native
    /**
      * Removes API settings from the page and all events
      */
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Execute query using existing API settings
      */
    def apply(behavior: query): JQuery = js.native
    /**
      * Removes loading and error state from element
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, value: ApiSettings): JQuery = js.native
    def apply(settings: ApiSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-api.SemanticUI.ApiSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-api.SemanticUI.ApiSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any = js.native
    
    var settings: ApiSettings = js.native
  }
  object Api {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'error'
          */
        var error: String
        
        /**
          * @default 'loading'
          */
        var loading: String
      }
      object Impl {
        
        inline def apply(error: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiApi.anon.PickImplloadingPartialPic
        - typingsJapgolly.semanticUiApi.anon.PickImplerrorPartialPickIError
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplerrorPartialPickIError(error: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplerrorPartialPickIError = {
          val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplerrorPartialPickIError]
        }
        
        inline def PickImplloadingPartialPic(loading: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplloadingPartialPic = {
          val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplloadingPartialPic]
        }
      }
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'JSON could not be parsed during error handling'
          */
        var JSONParse: String
        
        /**
          * @default 'The before send function has aborted the request'
          */
        var beforeSend: String
        
        /**
          * @default 'There was an error with your request'
          */
        var error: String
        
        /**
          * @default 'API Request Aborted. Exit conditions met'
          */
        var exitConditions: String
        
        /**
          * @default 'You are using legacy API success callback names'
          */
        var legacyParameters: String
        
        /**
          * @default 'API action used but no url was defined'
          */
        var missingAction: String
        
        /**
          * @default 'Required dependency jquery-serialize-object missing, using basic serialize'
          */
        var missingSerialize: String
        
        /**
          * @default 'No URL specified for API event'
          */
        var missingURL: String
        
        /**
          * @default 'The beforeSend callback must return a settings object, beforeSend ignored.'
          */
        var noReturnedValue: String
        
        /**
          * @default 'There was an error parsing your request'
          */
        var parseError: String
        
        /**
          * @default 'Missing a required URL parameter: '
          */
        var requiredParameter: String
        
        /**
          * @default 'Server gave an error: '
          */
        var statusMessage: String
        
        /**
          * @default 'Your request timed out'
          */
        var timeout: String
      }
      object Impl {
        
        inline def apply(
          JSONParse: String,
          beforeSend: String,
          error: String,
          exitConditions: String,
          legacyParameters: String,
          missingAction: String,
          missingSerialize: String,
          missingURL: String,
          noReturnedValue: String,
          parseError: String,
          requiredParameter: String,
          statusMessage: String,
          timeout: String
        ): Impl = {
          val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any], beforeSend = beforeSend.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exitConditions = exitConditions.asInstanceOf[js.Any], legacyParameters = legacyParameters.asInstanceOf[js.Any], missingAction = missingAction.asInstanceOf[js.Any], missingSerialize = missingSerialize.asInstanceOf[js.Any], missingURL = missingURL.asInstanceOf[js.Any], noReturnedValue = noReturnedValue.asInstanceOf[js.Any], parseError = parseError.asInstanceOf[js.Any], requiredParameter = requiredParameter.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setBeforeSend(value: String): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
          
          inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          inline def setExitConditions(value: String): Self = StObject.set(x, "exitConditions", value.asInstanceOf[js.Any])
          
          inline def setJSONParse(value: String): Self = StObject.set(x, "JSONParse", value.asInstanceOf[js.Any])
          
          inline def setLegacyParameters(value: String): Self = StObject.set(x, "legacyParameters", value.asInstanceOf[js.Any])
          
          inline def setMissingAction(value: String): Self = StObject.set(x, "missingAction", value.asInstanceOf[js.Any])
          
          inline def setMissingSerialize(value: String): Self = StObject.set(x, "missingSerialize", value.asInstanceOf[js.Any])
          
          inline def setMissingURL(value: String): Self = StObject.set(x, "missingURL", value.asInstanceOf[js.Any])
          
          inline def setNoReturnedValue(value: String): Self = StObject.set(x, "noReturnedValue", value.asInstanceOf[js.Any])
          
          inline def setParseError(value: String): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
          
          inline def setRequiredParameter(value: String): Self = StObject.set(x, "requiredParameter", value.asInstanceOf[js.Any])
          
          inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
          
          inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiApi.anon.PickImplbeforeSendPartialBeforeSend
        - typingsJapgolly.semanticUiApi.anon.PickImplerrorPartialPickIBeforeSend
        - typingsJapgolly.semanticUiApi.anon.PickImplexitConditionsPar
        - typingsJapgolly.semanticUiApi.anon.PickImplJSONParsePartialP
        - typingsJapgolly.semanticUiApi.anon.PickImpllegacyParametersP
        - typingsJapgolly.semanticUiApi.anon.PickImplmissingActionPart
        - typingsJapgolly.semanticUiApi.anon.PickImplmissingSerializeP
        - typingsJapgolly.semanticUiApi.anon.PickImplmissingURLPartial
        - typingsJapgolly.semanticUiApi.anon.PickImplnoReturnedValuePa
        - typingsJapgolly.semanticUiApi.anon.PickImplparseErrorPartial
        - typingsJapgolly.semanticUiApi.anon.PickImplrequiredParameter
        - typingsJapgolly.semanticUiApi.anon.PickImplstatusMessagePart
        - typingsJapgolly.semanticUiApi.anon.PickImpltimeoutPartialPic
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplJSONParsePartialP(JSONParse: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplJSONParsePartialP = {
          val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplJSONParsePartialP]
        }
        
        inline def PickImplbeforeSendPartialBeforeSend(beforeSend: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplbeforeSendPartialBeforeSend = {
          val __obj = js.Dynamic.literal(beforeSend = beforeSend.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplbeforeSendPartialBeforeSend]
        }
        
        inline def PickImplerrorPartialPickIBeforeSend(error: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplerrorPartialPickIBeforeSend = {
          val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplerrorPartialPickIBeforeSend]
        }
        
        inline def PickImplexitConditionsPar(exitConditions: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplexitConditionsPar = {
          val __obj = js.Dynamic.literal(exitConditions = exitConditions.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplexitConditionsPar]
        }
        
        inline def PickImpllegacyParametersP(legacyParameters: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImpllegacyParametersP = {
          val __obj = js.Dynamic.literal(legacyParameters = legacyParameters.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImpllegacyParametersP]
        }
        
        inline def PickImplmissingActionPart(missingAction: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplmissingActionPart = {
          val __obj = js.Dynamic.literal(missingAction = missingAction.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplmissingActionPart]
        }
        
        inline def PickImplmissingSerializeP(missingSerialize: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplmissingSerializeP = {
          val __obj = js.Dynamic.literal(missingSerialize = missingSerialize.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplmissingSerializeP]
        }
        
        inline def PickImplmissingURLPartial(missingURL: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplmissingURLPartial = {
          val __obj = js.Dynamic.literal(missingURL = missingURL.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplmissingURLPartial]
        }
        
        inline def PickImplnoReturnedValuePa(noReturnedValue: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplnoReturnedValuePa = {
          val __obj = js.Dynamic.literal(noReturnedValue = noReturnedValue.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplnoReturnedValuePa]
        }
        
        inline def PickImplparseErrorPartial(parseError: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplparseErrorPartial = {
          val __obj = js.Dynamic.literal(parseError = parseError.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplparseErrorPartial]
        }
        
        inline def PickImplrequiredParameter(requiredParameter: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplrequiredParameter = {
          val __obj = js.Dynamic.literal(requiredParameter = requiredParameter.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplrequiredParameter]
        }
        
        inline def PickImplstatusMessagePart(statusMessage: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplstatusMessagePart = {
          val __obj = js.Dynamic.literal(statusMessage = statusMessage.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplstatusMessagePart]
        }
        
        inline def PickImpltimeoutPartialPic(timeout: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImpltimeoutPartialPic = {
          val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImpltimeoutPartialPic]
        }
      }
    }
    type ErrorSettings = typingsJapgolly.semanticUiApi.SemanticUI.Api.ErrorSettings.Param
    
    object MetadataSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'action'
          */
        var action: String
        
        /**
          * @default 'url'
          */
        var url: String
      }
      object Impl {
        
        inline def apply(action: String, url: String): Impl = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiApi.anon.PickImplactionPartialPickAction
        - typingsJapgolly.semanticUiApi.anon.PickImplurlPartialPickImpAction
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplactionPartialPickAction(action: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplactionPartialPickAction = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplactionPartialPickAction]
        }
        
        inline def PickImplurlPartialPickImpAction(url: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplurlPartialPickImpAction = {
          val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplurlPartialPickImpAction]
        }
      }
    }
    type MetadataSettings = typingsJapgolly.semanticUiApi.SemanticUI.Api.MetadataSettings.Param
    
    object RegExpSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default /\{\/\$*[A-z0-9]+\}/g
          */
        var optional: js.RegExp
        
        /**
          * @default /\{\$*[A-z0-9]+\}/g
          */
        var required: js.RegExp
      }
      object Impl {
        
        inline def apply(optional: js.RegExp, required: js.RegExp): Impl = {
          val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setOptional(value: js.RegExp): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
          
          inline def setRequired(value: js.RegExp): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiApi.anon.PickImplrequiredPartialPi
        - typingsJapgolly.semanticUiApi.anon.PickImploptionalPartialPi
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImploptionalPartialPi(optional: js.RegExp & js.UndefOr[js.RegExp]): typingsJapgolly.semanticUiApi.anon.PickImploptionalPartialPi = {
          val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImploptionalPartialPi]
        }
        
        inline def PickImplrequiredPartialPi(required: js.RegExp & js.UndefOr[js.RegExp]): typingsJapgolly.semanticUiApi.anon.PickImplrequiredPartialPi = {
          val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplrequiredPartialPi]
        }
      }
    }
    type RegExpSettings = typingsJapgolly.semanticUiApi.SemanticUI.Api.RegExpSettings.Param
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default '.disabled'
          */
        var disabled: String
        
        /**
          * @default 'form'
          */
        var form: String
      }
      object Impl {
        
        inline def apply(disabled: String, form: String): Impl = {
          val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiApi.anon.PickImpldisabledPartialPi
        - typingsJapgolly.semanticUiApi.anon.PickImplformPartialPickIm
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImpldisabledPartialPi(disabled: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImpldisabledPartialPi = {
          val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImpldisabledPartialPi]
        }
        
        inline def PickImplformPartialPickIm(form: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplformPartialPickIm = {
          val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplformPartialPickIm]
        }
      }
    }
    type SelectorSettings = typingsJapgolly.semanticUiApi.SemanticUI.Api.SelectorSettings.Param
  }
  
  object ApiSettings {
    
    trait Impl extends StObject {
      
      // endregion
      // region Request Settings
      /**
        * Named API action for query, originally specified in $.fn.settings.api
        */
      var action: String | `false`
      
      var api: StringDictionary[String]
      
      // endregion
      // region Callbacks
      /**
        * Allows modifying settings before request, or cancelling request
        */
      def beforeSend(settings: ApiSettings): Any
      
      /**
        * Allows modifying XHR object for request
        */
      def beforeXHR(xhrObject: jqXHR[Any]): Any
      
      /**
        * Can be set to 'local' to cache successful returned AJAX responses when using a JSON API.
        * This helps avoid server round trips when API endpoints will return the same results when accessed repeatedly.
        * Setting to false, will add cache busting parameters to the URL.
        *
        * @default true
        */
      var cache: local | Boolean
      
      /**
        * Class names used to determine element state
        */
      var className: ClassNameSettings
      
      /**
        * POST/GET Data to Send with Request
        */
      var data: Any
      
      /**
        * Expected data type of response
        */
      var dataType: xml | json | jsonp | script | html | text
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      /**
        * Whether to automatically include default data like {value} and {text}
        *
        * @default true
        */
      var defaultData: Boolean
      
      /**
        * Whether to encode parameters with encodeURIComponent before adding into url string
        *
        * @default true
        */
      var encodeParameters: Boolean
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Setting to true, will not remove error.
        * Setting to a duration in milliseconds to show error state after request error.
        *
        * @default 2000
        */
      var errorDuration: `true` | Double
      
      /**
        * The default auto will automatically remove error state after error duration, unless the element is a form
        *
        * @default 'auto'
        */
      var hideError: auto | Boolean
      
      /**
        * Whether an API request can occur while another request is still pending
        *
        * @default false
        */
      var interruptRequests: Boolean
      
      /**
        * Minimum duration to show loading indication
        *
        * @default 0
        */
      var loadingDuration: Double
      
      /**
        * Metadata used to store XHR and response promise
        */
      var metadata: MetadataSettings
      
      /**
        * Method for transmitting request to server
        */
      var method: post | get | put | delete | head | options | patch
      
      /**
        * @see response
        */
      var mockResponse: Any | `false`
      
      /**
        * @see responseAsync
        */
      var mockResponseAsync: (js.Function2[
            /* settings */ ApiSettings, 
            /* callback */ js.Function1[/* response */ Any, Unit], 
            Unit
          ]) | `false`
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String
      
      // region Behavior
      /**
        * When API event should occur
        *
        * @default 'auto'
        */
      var on: String
      
      /**
        * Callback on abort caused by user clicking a link or manually cancelling request.
        */
      def onAbort(errorMessage: String, element: JQuery, xhr: jqXHR[Any]): Unit
      
      /**
        * Callback on request complete regardless of conditions
        */
      def onComplete(response: Any, element: JQuery, xhr: jqXHR[Any]): Unit
      
      /**
        * Callback on server error from returned status code, or XHR failure.
        */
      def onError(errorMessage: String, element: JQuery, xhr: jqXHR[Any]): Unit
      
      /**
        * Callback on failed response, or JSON response that fails successTest
        */
      def onFailure(response: Any, element: JQuery): Unit
      
      /**
        * Callback that occurs when request is made. Receives both the API success promise and the XHR request promise.
        */
      def onRequest(promise: Deferred[Any, Any, Any], xhr: jqXHR[Any]): Unit
      
      /**
        * Allows modifying the server's response before parsed by other callbacks to determine API event success
        */
      def onResponse(response: Any): Unit
      
      /**
        * Callback after successful response, JSON response must pass successTest
        */
      def onSuccess(response: Any, element: JQuery, xhr: jqXHR[Any]): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // endregion
      // region DOM Settings
      /**
        * Regular expressions used for template matching
        */
      var regExp: RegExpSettings
      
      /**
        * Can be set to a Javascript object which will be returned automatically instead of requesting JSON from server
        */
      var response: Any | `false`
      
      /**
        * When specified, this function can be used to retrieve content from a server and return it asynchronously instead of a standard AJAX call.
        * The callback function should return the server response.
        *
        * @default false
        */
      var responseAsync: (js.Function2[
            /* settings */ ApiSettings, 
            /* callback */ js.Function1[/* response */ Any, Unit], 
            Unit
          ]) | `false`
      
      /**
        * Selectors used to find parts of a module
        */
      var selector: SelectorSettings
      
      /**
        * Whether to serialize closest form and include in request
        *
        * @default false
        */
      var serializeForm: Boolean
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * UI state will be applied to this element, defaults to triggering element.
        */
      var stateContext: String | JQuery
      
      /**
        * Determines whether completed JSON response should be treated as successful
        *
        * @see {@link http://semantic-ui.com/behaviors/api.html#determining-json-success}
        */
      def successTest(response: Any): Boolean
      
      /**
        * How long to wait when a request is made before triggering request, useful for rate limiting oninput
        *
        * @default 0
        */
      var throttle: Double
      
      /**
        * When set to false will not delay the first request made, when no others are queued
        *
        * @default true
        */
      var throttleFirstRequest: Boolean
      
      /**
        * Templated URL for query, will override specified action
        */
      var url: String | `false`
      
      /**
        * Variables to use for replacement
        */
      var urlData: Any | `false`
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        action: String | `false`,
        api: StringDictionary[String],
        beforeSend: ApiSettings => Any,
        beforeXHR: jqXHR[Any] => Any,
        cache: local | Boolean,
        className: ClassNameSettings,
        data: Any,
        dataType: xml | json | jsonp | script | html | text,
        debug: Boolean,
        defaultData: Boolean,
        encodeParameters: Boolean,
        error: ErrorSettings,
        errorDuration: `true` | Double,
        hideError: auto | Boolean,
        interruptRequests: Boolean,
        loadingDuration: Double,
        metadata: MetadataSettings,
        method: post | get | put | delete | head | options | patch,
        mockResponse: Any | `false`,
        mockResponseAsync: (js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ Any, Unit], 
              Unit
            ]) | `false`,
        name: String,
        namespace: String,
        on: String,
        onAbort: (String, JQuery, jqXHR[Any]) => Callback,
        onComplete: (Any, JQuery, jqXHR[Any]) => Callback,
        onError: (String, JQuery, jqXHR[Any]) => Callback,
        onFailure: (Any, JQuery) => Callback,
        onRequest: (Deferred[Any, Any, Any], jqXHR[Any]) => Callback,
        onResponse: Any => Callback,
        onSuccess: (Any, JQuery, jqXHR[Any]) => Callback,
        performance: Boolean,
        regExp: RegExpSettings,
        response: Any | `false`,
        responseAsync: (js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ Any, Unit], 
              Unit
            ]) | `false`,
        selector: SelectorSettings,
        serializeForm: Boolean,
        silent: Boolean,
        stateContext: String | JQuery,
        successTest: Any => Boolean,
        throttle: Double,
        throttleFirstRequest: Boolean,
        url: String | `false`,
        urlData: Any | `false`,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], beforeSend = js.Any.fromFunction1(beforeSend), beforeXHR = js.Any.fromFunction1(beforeXHR), cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultData = defaultData.asInstanceOf[js.Any], encodeParameters = encodeParameters.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorDuration = errorDuration.asInstanceOf[js.Any], hideError = hideError.asInstanceOf[js.Any], interruptRequests = interruptRequests.asInstanceOf[js.Any], loadingDuration = loadingDuration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mockResponse = mockResponse.asInstanceOf[js.Any], mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onAbort = js.Any.fromFunction3((t0: String, t1: JQuery, t2: jqXHR[Any]) => (onAbort(t0, t1, t2)).runNow()), onComplete = js.Any.fromFunction3((t0: Any, t1: JQuery, t2: jqXHR[Any]) => (onComplete(t0, t1, t2)).runNow()), onError = js.Any.fromFunction3((t0: String, t1: JQuery, t2: jqXHR[Any]) => (onError(t0, t1, t2)).runNow()), onFailure = js.Any.fromFunction2((t0: Any, t1: JQuery) => (onFailure(t0, t1)).runNow()), onRequest = js.Any.fromFunction2((t0: Deferred[Any, Any, Any], t1: jqXHR[Any]) => (onRequest(t0, t1)).runNow()), onResponse = js.Any.fromFunction1((t0: Any) => onResponse(t0).runNow()), onSuccess = js.Any.fromFunction3((t0: Any, t1: JQuery, t2: jqXHR[Any]) => (onSuccess(t0, t1, t2)).runNow()), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseAsync = responseAsync.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], serializeForm = serializeForm.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], stateContext = stateContext.asInstanceOf[js.Any], successTest = js.Any.fromFunction1(successTest), throttle = throttle.asInstanceOf[js.Any], throttleFirstRequest = throttleFirstRequest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlData = urlData.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setAction(value: String | `false`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setApi(value: StringDictionary[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
        
        inline def setBeforeSend(value: ApiSettings => Any): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
        
        inline def setBeforeXHR(value: jqXHR[Any] => Any): Self = StObject.set(x, "beforeXHR", js.Any.fromFunction1(value))
        
        inline def setCache(value: local | Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataType(value: xml | json | jsonp | script | html | text): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDefaultData(value: Boolean): Self = StObject.set(x, "defaultData", value.asInstanceOf[js.Any])
        
        inline def setEncodeParameters(value: Boolean): Self = StObject.set(x, "encodeParameters", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorDuration(value: `true` | Double): Self = StObject.set(x, "errorDuration", value.asInstanceOf[js.Any])
        
        inline def setHideError(value: auto | Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
        
        inline def setInterruptRequests(value: Boolean): Self = StObject.set(x, "interruptRequests", value.asInstanceOf[js.Any])
        
        inline def setLoadingDuration(value: Double): Self = StObject.set(x, "loadingDuration", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: post | get | put | delete | head | options | patch): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMockResponse(value: Any | `false`): Self = StObject.set(x, "mockResponse", value.asInstanceOf[js.Any])
        
        inline def setMockResponseAsync(
          value: (js.Function2[
                  /* settings */ ApiSettings, 
                  /* callback */ js.Function1[/* response */ Any, Unit], 
                  Unit
                ]) | `false`
        ): Self = StObject.set(x, "mockResponseAsync", value.asInstanceOf[js.Any])
        
        inline def setMockResponseAsyncFunction2(
          value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ Any, Unit]) => Callback
        ): Self = StObject.set(x, "mockResponseAsync", js.Any.fromFunction2((t0: /* settings */ ApiSettings, t1: /* callback */ js.Function1[/* response */ Any, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
        
        inline def setOnAbort(value: (String, JQuery, jqXHR[Any]) => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction3((t0: String, t1: JQuery, t2: jqXHR[Any]) => (value(t0, t1, t2)).runNow()))
        
        inline def setOnComplete(value: (Any, JQuery, jqXHR[Any]) => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction3((t0: Any, t1: JQuery, t2: jqXHR[Any]) => (value(t0, t1, t2)).runNow()))
        
        inline def setOnError(value: (String, JQuery, jqXHR[Any]) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction3((t0: String, t1: JQuery, t2: jqXHR[Any]) => (value(t0, t1, t2)).runNow()))
        
        inline def setOnFailure(value: (Any, JQuery) => Callback): Self = StObject.set(x, "onFailure", js.Any.fromFunction2((t0: Any, t1: JQuery) => (value(t0, t1)).runNow()))
        
        inline def setOnRequest(value: (Deferred[Any, Any, Any], jqXHR[Any]) => Callback): Self = StObject.set(x, "onRequest", js.Any.fromFunction2((t0: Deferred[Any, Any, Any], t1: jqXHR[Any]) => (value(t0, t1)).runNow()))
        
        inline def setOnResponse(value: Any => Callback): Self = StObject.set(x, "onResponse", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
        
        inline def setOnSuccess(value: (Any, JQuery, jqXHR[Any]) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3((t0: Any, t1: JQuery, t2: jqXHR[Any]) => (value(t0, t1, t2)).runNow()))
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
        inline def setResponse(value: Any | `false`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
        
        inline def setResponseAsync(
          value: (js.Function2[
                  /* settings */ ApiSettings, 
                  /* callback */ js.Function1[/* response */ Any, Unit], 
                  Unit
                ]) | `false`
        ): Self = StObject.set(x, "responseAsync", value.asInstanceOf[js.Any])
        
        inline def setResponseAsyncFunction2(
          value: (/* settings */ ApiSettings, /* callback */ js.Function1[/* response */ Any, Unit]) => Callback
        ): Self = StObject.set(x, "responseAsync", js.Any.fromFunction2((t0: /* settings */ ApiSettings, t1: /* callback */ js.Function1[/* response */ Any, Unit]) => (value(t0, t1)).runNow()))
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSerializeForm(value: Boolean): Self = StObject.set(x, "serializeForm", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setStateContext(value: String | JQuery): Self = StObject.set(x, "stateContext", value.asInstanceOf[js.Any])
        
        inline def setSuccessTest(value: Any => Boolean): Self = StObject.set(x, "successTest", js.Any.fromFunction1(value))
        
        inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
        
        inline def setThrottleFirstRequest(value: Boolean): Self = StObject.set(x, "throttleFirstRequest", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String | `false`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlData(value: Any | `false`): Self = StObject.set(x, "urlData", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiApi.anon.PickImplapiPartialPickImp
      - typingsJapgolly.semanticUiApi.anon.PickImplonPartialPickImpl
      - typingsJapgolly.semanticUiApi.anon.PickImplcachePartialPickI
      - typingsJapgolly.semanticUiApi.anon.PickImplstateContextParti
      - typingsJapgolly.semanticUiApi.anon.PickImplencodeParametersP
      - typingsJapgolly.semanticUiApi.anon.PickImpldefaultDataPartia
      - typingsJapgolly.semanticUiApi.anon.PickImplserializeFormPart
      - typingsJapgolly.semanticUiApi.anon.PickImplthrottlePartialPi
      - typingsJapgolly.semanticUiApi.anon.PickImplthrottleFirstRequ
      - typingsJapgolly.semanticUiApi.anon.PickImplinterruptRequests
      - typingsJapgolly.semanticUiApi.anon.PickImplloadingDurationPa
      - typingsJapgolly.semanticUiApi.anon.PickImplhideErrorPartialP
      - typingsJapgolly.semanticUiApi.anon.PickImplerrorDurationPart
      - typingsJapgolly.semanticUiApi.anon.PickImplactionPartialPick
      - typingsJapgolly.semanticUiApi.anon.PickImplurlPartialPickImp
      - typingsJapgolly.semanticUiApi.anon.PickImplurlDataPartialPic
      - typingsJapgolly.semanticUiApi.anon.PickImplresponsePartialPi
      - typingsJapgolly.semanticUiApi.anon.PickImplresponseAsyncPart
      - typingsJapgolly.semanticUiApi.anon.PickImplmockResponseParti
      - typingsJapgolly.semanticUiApi.anon.PickImplmockResponseAsync
      - typingsJapgolly.semanticUiApi.anon.PickImplmethodPartialPick
      - typingsJapgolly.semanticUiApi.anon.PickImpldataTypePartialPi
      - typingsJapgolly.semanticUiApi.anon.PickImpldataPartialPickIm
      - typingsJapgolly.semanticUiApi.anon.PickImplbeforeSendPartial
      - typingsJapgolly.semanticUiApi.anon.PickImplbeforeXHRPartialP
      - typingsJapgolly.semanticUiApi.anon.PickImplonRequestPartialP
      - typingsJapgolly.semanticUiApi.anon.PickImplonResponsePartial
      - typingsJapgolly.semanticUiApi.anon.PickImplsuccessTestPartia
      - typingsJapgolly.semanticUiApi.anon.PickImplonSuccessPartialP
      - typingsJapgolly.semanticUiApi.anon.PickImplonCompletePartial
      - typingsJapgolly.semanticUiApi.anon.PickImplonFailurePartialP
      - typingsJapgolly.semanticUiApi.anon.PickImplonErrorPartialPic
      - typingsJapgolly.semanticUiApi.anon.PickImplonAbortPartialPic
      - typingsJapgolly.semanticUiApi.anon.PickImplregExpPartialPick
      - typingsJapgolly.semanticUiApi.anon.PickImplselectorPartialPi
      - typingsJapgolly.semanticUiApi.anon.PickImplclassNamePartialP
      - typingsJapgolly.semanticUiApi.anon.PickImplmetadataPartialPi
      - typingsJapgolly.semanticUiApi.anon.PickImplerrorPartialPickI
      - typingsJapgolly.semanticUiApi.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiApi.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiApi.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiApi.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiApi.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiApi.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactionPartialPick(action: (String | `false`) & (js.UndefOr[String | `false`])): typingsJapgolly.semanticUiApi.anon.PickImplactionPartialPick = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplactionPartialPick]
      }
      
      inline def PickImplapiPartialPickImp(api: StringDictionary[String] & js.UndefOr[StringDictionary[String]]): typingsJapgolly.semanticUiApi.anon.PickImplapiPartialPickImp = {
        val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplapiPartialPickImp]
      }
      
      inline def PickImplbeforeSendPartial(
        beforeSend: (js.Function1[/* settings */ ApiSettings, Any]) & (js.UndefOr[js.Function1[/* settings */ ApiSettings, Any]])
      ): typingsJapgolly.semanticUiApi.anon.PickImplbeforeSendPartial = {
        val __obj = js.Dynamic.literal(beforeSend = beforeSend.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplbeforeSendPartial]
      }
      
      inline def PickImplbeforeXHRPartialP(
        beforeXHR: (js.Function1[/* xhrObject */ jqXHR[Any], Any]) & (js.UndefOr[js.Function1[/* xhrObject */ jqXHR[Any], Any]])
      ): typingsJapgolly.semanticUiApi.anon.PickImplbeforeXHRPartialP = {
        val __obj = js.Dynamic.literal(beforeXHR = beforeXHR.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplbeforeXHRPartialP]
      }
      
      inline def PickImplcachePartialPickI(cache: (local | Boolean) & (js.UndefOr[local | Boolean])): typingsJapgolly.semanticUiApi.anon.PickImplcachePartialPickI = {
        val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplcachePartialPickI]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiApi.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImpldataPartialPickIm(data: Any & js.UndefOr[Any]): typingsJapgolly.semanticUiApi.anon.PickImpldataPartialPickIm = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImpldataPartialPickIm]
      }
      
      inline def PickImpldataTypePartialPi(
        dataType: (xml | json | jsonp | script | html | text) & (js.UndefOr[xml | json | jsonp | script | html | text])
      ): typingsJapgolly.semanticUiApi.anon.PickImpldataTypePartialPi = {
        val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImpldataTypePartialPi]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiApi.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImpldefaultDataPartia(defaultData: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiApi.anon.PickImpldefaultDataPartia = {
        val __obj = js.Dynamic.literal(defaultData = defaultData.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImpldefaultDataPartia]
      }
      
      inline def PickImplencodeParametersP(encodeParameters: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiApi.anon.PickImplencodeParametersP = {
        val __obj = js.Dynamic.literal(encodeParameters = encodeParameters.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplencodeParametersP]
      }
      
      inline def PickImplerrorDurationPart(errorDuration: (`true` | Double) & (js.UndefOr[`true` | Double])): typingsJapgolly.semanticUiApi.anon.PickImplerrorDurationPart = {
        val __obj = js.Dynamic.literal(errorDuration = errorDuration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplerrorDurationPart]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiApi.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplhideErrorPartialP(hideError: (auto | Boolean) & (js.UndefOr[auto | Boolean])): typingsJapgolly.semanticUiApi.anon.PickImplhideErrorPartialP = {
        val __obj = js.Dynamic.literal(hideError = hideError.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplhideErrorPartialP]
      }
      
      inline def PickImplinterruptRequests(interruptRequests: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiApi.anon.PickImplinterruptRequests = {
        val __obj = js.Dynamic.literal(interruptRequests = interruptRequests.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplinterruptRequests]
      }
      
      inline def PickImplloadingDurationPa(loadingDuration: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiApi.anon.PickImplloadingDurationPa = {
        val __obj = js.Dynamic.literal(loadingDuration = loadingDuration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplloadingDurationPa]
      }
      
      inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typingsJapgolly.semanticUiApi.anon.PickImplmetadataPartialPi = {
        val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplmetadataPartialPi]
      }
      
      inline def PickImplmethodPartialPick(
        method: (post | get | put | delete | head | options | patch) & (js.UndefOr[post | get | put | delete | head | options | patch])
      ): typingsJapgolly.semanticUiApi.anon.PickImplmethodPartialPick = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplmethodPartialPick]
      }
      
      inline def PickImplmockResponseAsync(
        mockResponseAsync: ((js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ Any, Unit], 
              Unit
            ]) | `false`) & (js.UndefOr[
              (js.Function2[
                /* settings */ ApiSettings, 
                /* callback */ js.Function1[/* response */ Any, Unit], 
                Unit
              ]) | `false`
            ])
      ): typingsJapgolly.semanticUiApi.anon.PickImplmockResponseAsync = {
        val __obj = js.Dynamic.literal(mockResponseAsync = mockResponseAsync.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplmockResponseAsync]
      }
      
      inline def PickImplmockResponseParti(mockResponse: (Any | `false`) & (js.UndefOr[Any | `false`])): typingsJapgolly.semanticUiApi.anon.PickImplmockResponseParti = {
        val __obj = js.Dynamic.literal(mockResponse = mockResponse.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplmockResponseParti]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonAbortPartialPic(
        onAbort: (js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]) & (js.UndefOr[
              js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
            ])
      ): typingsJapgolly.semanticUiApi.anon.PickImplonAbortPartialPic = {
        val __obj = js.Dynamic.literal(onAbort = onAbort.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplonAbortPartialPic]
      }
      
      inline def PickImplonCompletePartial(
        onComplete: (js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]) & (js.UndefOr[
              js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
            ])
      ): typingsJapgolly.semanticUiApi.anon.PickImplonCompletePartial = {
        val __obj = js.Dynamic.literal(onComplete = onComplete.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplonCompletePartial]
      }
      
      inline def PickImplonErrorPartialPic(
        onError: (js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]) & (js.UndefOr[
              js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
            ])
      ): typingsJapgolly.semanticUiApi.anon.PickImplonErrorPartialPic = {
        val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplonErrorPartialPic]
      }
      
      inline def PickImplonFailurePartialP(
        onFailure: (js.Function2[/* response */ Any, /* element */ JQuery, Unit]) & (js.UndefOr[js.Function2[/* response */ Any, /* element */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiApi.anon.PickImplonFailurePartialP = {
        val __obj = js.Dynamic.literal(onFailure = onFailure.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplonFailurePartialP]
      }
      
      inline def PickImplonPartialPickImpl(on: String & js.UndefOr[String]): typingsJapgolly.semanticUiApi.anon.PickImplonPartialPickImpl = {
        val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplonPartialPickImpl]
      }
      
      inline def PickImplonRequestPartialP(
        onRequest: (js.Function2[/* promise */ Deferred[Any, Any, Any], /* xhr */ jqXHR[Any], Unit]) & (js.UndefOr[js.Function2[/* promise */ Deferred[Any, Any, Any], /* xhr */ jqXHR[Any], Unit]])
      ): typingsJapgolly.semanticUiApi.anon.PickImplonRequestPartialP = {
        val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplonRequestPartialP]
      }
      
      inline def PickImplonResponsePartial(
        onResponse: (js.Function1[/* response */ Any, Unit]) & (js.UndefOr[js.Function1[/* response */ Any, Unit]])
      ): typingsJapgolly.semanticUiApi.anon.PickImplonResponsePartial = {
        val __obj = js.Dynamic.literal(onResponse = onResponse.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplonResponsePartial]
      }
      
      inline def PickImplonSuccessPartialP(
        onSuccess: (js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]) & (js.UndefOr[
              js.Function3[/* response */ Any, /* element */ JQuery, /* xhr */ jqXHR[Any], Unit]
            ])
      ): typingsJapgolly.semanticUiApi.anon.PickImplonSuccessPartialP = {
        val __obj = js.Dynamic.literal(onSuccess = onSuccess.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplonSuccessPartialP]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiApi.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplperformancePartia]
      }
      
      inline def PickImplregExpPartialPick(regExp: RegExpSettings & js.UndefOr[RegExpSettings]): typingsJapgolly.semanticUiApi.anon.PickImplregExpPartialPick = {
        val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplregExpPartialPick]
      }
      
      inline def PickImplresponseAsyncPart(
        responseAsync: ((js.Function2[
              /* settings */ ApiSettings, 
              /* callback */ js.Function1[/* response */ Any, Unit], 
              Unit
            ]) | `false`) & (js.UndefOr[
              (js.Function2[
                /* settings */ ApiSettings, 
                /* callback */ js.Function1[/* response */ Any, Unit], 
                Unit
              ]) | `false`
            ])
      ): typingsJapgolly.semanticUiApi.anon.PickImplresponseAsyncPart = {
        val __obj = js.Dynamic.literal(responseAsync = responseAsync.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplresponseAsyncPart]
      }
      
      inline def PickImplresponsePartialPi(response: (Any | `false`) & (js.UndefOr[Any | `false`])): typingsJapgolly.semanticUiApi.anon.PickImplresponsePartialPi = {
        val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplresponsePartialPi]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiApi.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplserializeFormPart(serializeForm: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiApi.anon.PickImplserializeFormPart = {
        val __obj = js.Dynamic.literal(serializeForm = serializeForm.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplserializeFormPart]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiApi.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplstateContextParti(stateContext: (String | JQuery) & (js.UndefOr[String | JQuery])): typingsJapgolly.semanticUiApi.anon.PickImplstateContextParti = {
        val __obj = js.Dynamic.literal(stateContext = stateContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplstateContextParti]
      }
      
      inline def PickImplsuccessTestPartia(
        successTest: (js.Function1[/* response */ Any, Boolean]) & (js.UndefOr[js.Function1[/* response */ Any, Boolean]])
      ): typingsJapgolly.semanticUiApi.anon.PickImplsuccessTestPartia = {
        val __obj = js.Dynamic.literal(successTest = successTest.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplsuccessTestPartia]
      }
      
      inline def PickImplthrottleFirstRequ(throttleFirstRequest: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiApi.anon.PickImplthrottleFirstRequ = {
        val __obj = js.Dynamic.literal(throttleFirstRequest = throttleFirstRequest.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplthrottleFirstRequ]
      }
      
      inline def PickImplthrottlePartialPi(throttle: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiApi.anon.PickImplthrottlePartialPi = {
        val __obj = js.Dynamic.literal(throttle = throttle.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplthrottlePartialPi]
      }
      
      inline def PickImplurlDataPartialPic(urlData: (Any | `false`) & (js.UndefOr[Any | `false`])): typingsJapgolly.semanticUiApi.anon.PickImplurlDataPartialPic = {
        val __obj = js.Dynamic.literal(urlData = urlData.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplurlDataPartialPic]
      }
      
      inline def PickImplurlPartialPickImp(url: (String | `false`) & (js.UndefOr[String | `false`])): typingsJapgolly.semanticUiApi.anon.PickImplurlPartialPickImp = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplurlPartialPickImp]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiApi.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiApi.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/behaviors/api.html#/settings}
    */
  type ApiSettings = typingsJapgolly.semanticUiApi.SemanticUI.ApiSettings.Param
}
