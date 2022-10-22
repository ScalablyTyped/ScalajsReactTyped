package typingsJapgolly.traverson

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.traverson.mod.Traverson.TraversonMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("traverson", JSImport.Namespace)
  @js.native
  val ^ : TraversonMethods = js.native
  
  object Traverson {
    
    trait Builder extends StObject {
      
      def addRequestOptions(options: Any): Builder
      
      def convertResponseToObject(): Builder
      
      def convertsResponseToObject(): Boolean
      
      def del(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def delete(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def disableAutoHeaders(): Builder
      
      def doesContentNegotiation(): Boolean
      
      def doesPreferEmbeddedResources(): Boolean
      
      def doesResolveRelative(): Boolean
      
      def enableAutoHeaders(): Builder
      
      def follow(first_pattern: String, rest_patterns: String*): Builder
      
      def followLocationHeader(): Builder
      
      def from(url: String): Builder
      
      def get(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def getFrom(): String
      
      def getJsonParser(): Any
      
      def getLinkType(): String
      
      def getMediaType(): String
      
      def getRequestLibrary(): Any
      
      def getRequestOptions(): Any
      
      def getResource(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def getTemplateParameters(): Any
      
      def getUri(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def getUrl(
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def json(): Builder
      
      def jsonHal(): Builder
      
      // Alias for delete()
      def linkHeader(): Builder
      
      def newRequest(): Builder
      
      def parseResponseBodiesWith(parser: Any): Builder
      
      def patch(
        data: Any,
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      // Alias for getUrl()
      def post(
        data: Any,
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def preferEmbeddedResources(flag: Any): Builder
      
      def put(
        data: Any,
        callback: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]
      ): InAction
      
      def resolveRelative(flag: Any): Builder
      
      def sendRawPayload(flag: Any): Builder
      
      def sendsRawPayload(): Boolean
      
      def setMediaType(type_name: String): Builder
      
      def setsAutoHeaders(): Boolean
      
      def useAutoHeaders(flag: Any): Builder
      
      def useContentNegotiation(): Builder
      
      def walk(first_pattern: String, rest_patterns: String*): Builder
      
      def withRequestLibrary(request: Any): Builder
      
      def withRequestOptions(options: Any): Builder
      
      // Alias for follow()
      def withTemplateParameters(parameters: Any): Builder
    }
    object Builder {
      
      inline def apply(
        addRequestOptions: Any => Builder,
        convertResponseToObject: CallbackTo[Builder],
        convertsResponseToObject: CallbackTo[Boolean],
        del: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        delete: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        disableAutoHeaders: CallbackTo[Builder],
        doesContentNegotiation: CallbackTo[Boolean],
        doesPreferEmbeddedResources: CallbackTo[Boolean],
        doesResolveRelative: CallbackTo[Boolean],
        enableAutoHeaders: CallbackTo[Builder],
        follow: (String, /* repeated */ String) => Builder,
        followLocationHeader: CallbackTo[Builder],
        from: String => Builder,
        get: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        getFrom: CallbackTo[String],
        getJsonParser: CallbackTo[Any],
        getLinkType: CallbackTo[String],
        getMediaType: CallbackTo[String],
        getRequestLibrary: CallbackTo[Any],
        getRequestOptions: CallbackTo[Any],
        getResource: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        getTemplateParameters: CallbackTo[Any],
        getUri: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        getUrl: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction,
        json: CallbackTo[Builder],
        jsonHal: CallbackTo[Builder],
        linkHeader: CallbackTo[Builder],
        newRequest: CallbackTo[Builder],
        parseResponseBodiesWith: Any => Builder,
        patch: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
        post: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
        preferEmbeddedResources: Any => Builder,
        put: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction,
        resolveRelative: Any => Builder,
        sendRawPayload: Any => Builder,
        sendsRawPayload: CallbackTo[Boolean],
        setMediaType: String => Builder,
        setsAutoHeaders: CallbackTo[Boolean],
        useAutoHeaders: Any => Builder,
        useContentNegotiation: CallbackTo[Builder],
        walk: (String, /* repeated */ String) => Builder,
        withRequestLibrary: Any => Builder,
        withRequestOptions: Any => Builder,
        withTemplateParameters: Any => Builder
      ): Builder = {
        val __obj = js.Dynamic.literal(addRequestOptions = js.Any.fromFunction1(addRequestOptions), convertResponseToObject = convertResponseToObject.toJsFn, convertsResponseToObject = convertsResponseToObject.toJsFn, del = js.Any.fromFunction1(del), delete = js.Any.fromFunction1(delete), disableAutoHeaders = disableAutoHeaders.toJsFn, doesContentNegotiation = doesContentNegotiation.toJsFn, doesPreferEmbeddedResources = doesPreferEmbeddedResources.toJsFn, doesResolveRelative = doesResolveRelative.toJsFn, enableAutoHeaders = enableAutoHeaders.toJsFn, follow = js.Any.fromFunction2(follow), followLocationHeader = followLocationHeader.toJsFn, from = js.Any.fromFunction1(from), get = js.Any.fromFunction1(get), getFrom = getFrom.toJsFn, getJsonParser = getJsonParser.toJsFn, getLinkType = getLinkType.toJsFn, getMediaType = getMediaType.toJsFn, getRequestLibrary = getRequestLibrary.toJsFn, getRequestOptions = getRequestOptions.toJsFn, getResource = js.Any.fromFunction1(getResource), getTemplateParameters = getTemplateParameters.toJsFn, getUri = js.Any.fromFunction1(getUri), getUrl = js.Any.fromFunction1(getUrl), json = json.toJsFn, jsonHal = jsonHal.toJsFn, linkHeader = linkHeader.toJsFn, newRequest = newRequest.toJsFn, parseResponseBodiesWith = js.Any.fromFunction1(parseResponseBodiesWith), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), preferEmbeddedResources = js.Any.fromFunction1(preferEmbeddedResources), put = js.Any.fromFunction2(put), resolveRelative = js.Any.fromFunction1(resolveRelative), sendRawPayload = js.Any.fromFunction1(sendRawPayload), sendsRawPayload = sendsRawPayload.toJsFn, setMediaType = js.Any.fromFunction1(setMediaType), setsAutoHeaders = setsAutoHeaders.toJsFn, useAutoHeaders = js.Any.fromFunction1(useAutoHeaders), useContentNegotiation = useContentNegotiation.toJsFn, walk = js.Any.fromFunction2(walk), withRequestLibrary = js.Any.fromFunction1(withRequestLibrary), withRequestOptions = js.Any.fromFunction1(withRequestOptions), withTemplateParameters = js.Any.fromFunction1(withTemplateParameters))
        __obj.asInstanceOf[Builder]
      }
      
      extension [Self <: Builder](x: Self) {
        
        inline def setAddRequestOptions(value: Any => Builder): Self = StObject.set(x, "addRequestOptions", js.Any.fromFunction1(value))
        
        inline def setConvertResponseToObject(value: CallbackTo[Builder]): Self = StObject.set(x, "convertResponseToObject", value.toJsFn)
        
        inline def setConvertsResponseToObject(value: CallbackTo[Boolean]): Self = StObject.set(x, "convertsResponseToObject", value.toJsFn)
        
        inline def setDel(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
        
        inline def setDelete(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
        
        inline def setDisableAutoHeaders(value: CallbackTo[Builder]): Self = StObject.set(x, "disableAutoHeaders", value.toJsFn)
        
        inline def setDoesContentNegotiation(value: CallbackTo[Boolean]): Self = StObject.set(x, "doesContentNegotiation", value.toJsFn)
        
        inline def setDoesPreferEmbeddedResources(value: CallbackTo[Boolean]): Self = StObject.set(x, "doesPreferEmbeddedResources", value.toJsFn)
        
        inline def setDoesResolveRelative(value: CallbackTo[Boolean]): Self = StObject.set(x, "doesResolveRelative", value.toJsFn)
        
        inline def setEnableAutoHeaders(value: CallbackTo[Builder]): Self = StObject.set(x, "enableAutoHeaders", value.toJsFn)
        
        inline def setFollow(value: (String, /* repeated */ String) => Builder): Self = StObject.set(x, "follow", js.Any.fromFunction2(value))
        
        inline def setFollowLocationHeader(value: CallbackTo[Builder]): Self = StObject.set(x, "followLocationHeader", value.toJsFn)
        
        inline def setFrom(value: String => Builder): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
        
        inline def setGet(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setGetFrom(value: CallbackTo[String]): Self = StObject.set(x, "getFrom", value.toJsFn)
        
        inline def setGetJsonParser(value: CallbackTo[Any]): Self = StObject.set(x, "getJsonParser", value.toJsFn)
        
        inline def setGetLinkType(value: CallbackTo[String]): Self = StObject.set(x, "getLinkType", value.toJsFn)
        
        inline def setGetMediaType(value: CallbackTo[String]): Self = StObject.set(x, "getMediaType", value.toJsFn)
        
        inline def setGetRequestLibrary(value: CallbackTo[Any]): Self = StObject.set(x, "getRequestLibrary", value.toJsFn)
        
        inline def setGetRequestOptions(value: CallbackTo[Any]): Self = StObject.set(x, "getRequestOptions", value.toJsFn)
        
        inline def setGetResource(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "getResource", js.Any.fromFunction1(value))
        
        inline def setGetTemplateParameters(value: CallbackTo[Any]): Self = StObject.set(x, "getTemplateParameters", value.toJsFn)
        
        inline def setGetUri(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "getUri", js.Any.fromFunction1(value))
        
        inline def setGetUrl(
          value: js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit] => InAction
        ): Self = StObject.set(x, "getUrl", js.Any.fromFunction1(value))
        
        inline def setJson(value: CallbackTo[Builder]): Self = StObject.set(x, "json", value.toJsFn)
        
        inline def setJsonHal(value: CallbackTo[Builder]): Self = StObject.set(x, "jsonHal", value.toJsFn)
        
        inline def setLinkHeader(value: CallbackTo[Builder]): Self = StObject.set(x, "linkHeader", value.toJsFn)
        
        inline def setNewRequest(value: CallbackTo[Builder]): Self = StObject.set(x, "newRequest", value.toJsFn)
        
        inline def setParseResponseBodiesWith(value: Any => Builder): Self = StObject.set(x, "parseResponseBodiesWith", js.Any.fromFunction1(value))
        
        inline def setPatch(
          value: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
        ): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
        
        inline def setPost(
          value: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
        ): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
        
        inline def setPreferEmbeddedResources(value: Any => Builder): Self = StObject.set(x, "preferEmbeddedResources", js.Any.fromFunction1(value))
        
        inline def setPut(
          value: (Any, js.Function3[/* err */ Any, /* document */ Any, /* traversal */ js.UndefOr[Traversal], Unit]) => InAction
        ): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
        
        inline def setResolveRelative(value: Any => Builder): Self = StObject.set(x, "resolveRelative", js.Any.fromFunction1(value))
        
        inline def setSendRawPayload(value: Any => Builder): Self = StObject.set(x, "sendRawPayload", js.Any.fromFunction1(value))
        
        inline def setSendsRawPayload(value: CallbackTo[Boolean]): Self = StObject.set(x, "sendsRawPayload", value.toJsFn)
        
        inline def setSetMediaType(value: String => Builder): Self = StObject.set(x, "setMediaType", js.Any.fromFunction1(value))
        
        inline def setSetsAutoHeaders(value: CallbackTo[Boolean]): Self = StObject.set(x, "setsAutoHeaders", value.toJsFn)
        
        inline def setUseAutoHeaders(value: Any => Builder): Self = StObject.set(x, "useAutoHeaders", js.Any.fromFunction1(value))
        
        inline def setUseContentNegotiation(value: CallbackTo[Builder]): Self = StObject.set(x, "useContentNegotiation", value.toJsFn)
        
        inline def setWalk(value: (String, /* repeated */ String) => Builder): Self = StObject.set(x, "walk", js.Any.fromFunction2(value))
        
        inline def setWithRequestLibrary(value: Any => Builder): Self = StObject.set(x, "withRequestLibrary", js.Any.fromFunction1(value))
        
        inline def setWithRequestOptions(value: Any => Builder): Self = StObject.set(x, "withRequestOptions", js.Any.fromFunction1(value))
        
        inline def setWithTemplateParameters(value: Any => Builder): Self = StObject.set(x, "withTemplateParameters", js.Any.fromFunction1(value))
      }
    }
    
    trait InAction extends StObject {
      
      def abort(): Unit
    }
    object InAction {
      
      inline def apply(abort: Callback): InAction = {
        val __obj = js.Dynamic.literal(abort = abort.toJsFn)
        __obj.asInstanceOf[InAction]
      }
      
      extension [Self <: InAction](x: Self) {
        
        inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      }
    }
    
    trait Json extends StObject {
      
      def parseJson(): Any
    }
    object Json {
      
      inline def apply(parseJson: CallbackTo[Any]): Json = {
        val __obj = js.Dynamic.literal(parseJson = parseJson.toJsFn)
        __obj.asInstanceOf[Json]
      }
      
      extension [Self <: Json](x: Self) {
        
        inline def setParseJson(value: CallbackTo[Any]): Self = StObject.set(x, "parseJson", value.toJsFn)
      }
    }
    
    trait Traversal extends StObject {
      
      def continue(): Builder
    }
    object Traversal {
      
      inline def apply(continue: CallbackTo[Builder]): Traversal = {
        val __obj = js.Dynamic.literal(continue = continue.toJsFn)
        __obj.asInstanceOf[Traversal]
      }
      
      extension [Self <: Traversal](x: Self) {
        
        inline def setContinue(value: CallbackTo[Builder]): Self = StObject.set(x, "continue", value.toJsFn)
      }
    }
    
    trait TraversonMethods extends StObject {
      
      def errors(): TraversonMethods
      
      def from(uri: String): Builder
      
      def json(): Builder
      
      def jsonHal(): Builder
      
      def mediaTypes(): TraversonMethods
      
      def newRequest(): Builder
      
      def registerMediaType(name: String, handler: Any): TraversonMethods
    }
    object TraversonMethods {
      
      inline def apply(
        errors: CallbackTo[TraversonMethods],
        from: String => Builder,
        json: CallbackTo[Builder],
        jsonHal: CallbackTo[Builder],
        mediaTypes: CallbackTo[TraversonMethods],
        newRequest: CallbackTo[Builder],
        registerMediaType: (String, Any) => TraversonMethods
      ): TraversonMethods = {
        val __obj = js.Dynamic.literal(errors = errors.toJsFn, from = js.Any.fromFunction1(from), json = json.toJsFn, jsonHal = jsonHal.toJsFn, mediaTypes = mediaTypes.toJsFn, newRequest = newRequest.toJsFn, registerMediaType = js.Any.fromFunction2(registerMediaType))
        __obj.asInstanceOf[TraversonMethods]
      }
      
      extension [Self <: TraversonMethods](x: Self) {
        
        inline def setErrors(value: CallbackTo[TraversonMethods]): Self = StObject.set(x, "errors", value.toJsFn)
        
        inline def setFrom(value: String => Builder): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
        
        inline def setJson(value: CallbackTo[Builder]): Self = StObject.set(x, "json", value.toJsFn)
        
        inline def setJsonHal(value: CallbackTo[Builder]): Self = StObject.set(x, "jsonHal", value.toJsFn)
        
        inline def setMediaTypes(value: CallbackTo[TraversonMethods]): Self = StObject.set(x, "mediaTypes", value.toJsFn)
        
        inline def setNewRequest(value: CallbackTo[Builder]): Self = StObject.set(x, "newRequest", value.toJsFn)
        
        inline def setRegisterMediaType(value: (String, Any) => TraversonMethods): Self = StObject.set(x, "registerMediaType", js.Any.fromFunction2(value))
      }
    }
  }
  
  type _To = TraversonMethods
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TraversonMethods = ^
}
