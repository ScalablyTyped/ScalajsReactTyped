package typingsJapgolly.apollographqlGraphqlPlaygroundHtml

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRenderPlaygroundPageMod {
  
  @JSImport("@apollographql/graphql-playground-html/dist/render-playground-page", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderPlaygroundPage(options: RenderPageOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPlaygroundPage")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.line
    - typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.block
    - typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.underline
  */
  trait CursorShape extends StObject
  object CursorShape {
    
    inline def block: typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.block = "block".asInstanceOf[typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.block]
    
    inline def line: typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.line = "line".asInstanceOf[typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.line]
    
    inline def underline: typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.underline = "underline".asInstanceOf[typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.underline]
  }
  
  trait EditorColours extends StObject {
    
    var atom: String
    
    var attribute: String
    
    var builtin: String
    
    var comment: String
    
    var cursorColor: String
    
    var `def`: String
    
    var editorBackground: String
    
    var keyword: String
    
    var leftDrawerBackground: String
    
    var meta: String
    
    var number: String
    
    var property: String
    
    var punctuation: String
    
    var qualifier: String
    
    var resultBackground: String
    
    var rightDrawerBackground: String
    
    var selection: String
    
    var string: String
    
    var string2: String
    
    var variable: String
    
    var ws: String
  }
  object EditorColours {
    
    inline def apply(
      atom: String,
      attribute: String,
      builtin: String,
      comment: String,
      cursorColor: String,
      `def`: String,
      editorBackground: String,
      keyword: String,
      leftDrawerBackground: String,
      meta: String,
      number: String,
      property: String,
      punctuation: String,
      qualifier: String,
      resultBackground: String,
      rightDrawerBackground: String,
      selection: String,
      string: String,
      string2: String,
      variable: String,
      ws: String
    ): EditorColours = {
      val __obj = js.Dynamic.literal(atom = atom.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], builtin = builtin.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], cursorColor = cursorColor.asInstanceOf[js.Any], editorBackground = editorBackground.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], leftDrawerBackground = leftDrawerBackground.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], punctuation = punctuation.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], resultBackground = resultBackground.asInstanceOf[js.Any], rightDrawerBackground = rightDrawerBackground.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], string2 = string2.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], ws = ws.asInstanceOf[js.Any])
      __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorColours]
    }
    
    extension [Self <: EditorColours](x: Self) {
      
      inline def setAtom(value: String): Self = StObject.set(x, "atom", value.asInstanceOf[js.Any])
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setBuiltin(value: String): Self = StObject.set(x, "builtin", value.asInstanceOf[js.Any])
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCursorColor(value: String): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
      
      inline def setDef(value: String): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
      
      inline def setEditorBackground(value: String): Self = StObject.set(x, "editorBackground", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setLeftDrawerBackground(value: String): Self = StObject.set(x, "leftDrawerBackground", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPunctuation(value: String): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
      
      inline def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      inline def setResultBackground(value: String): Self = StObject.set(x, "resultBackground", value.asInstanceOf[js.Any])
      
      inline def setRightDrawerBackground(value: String): Self = StObject.set(x, "rightDrawerBackground", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setString2(value: String): Self = StObject.set(x, "string2", value.asInstanceOf[js.Any])
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      
      inline def setWs(value: String): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISettings extends StObject {
    
    @JSName("editor.cursorShape")
    var editorDotcursorShape: js.UndefOr[CursorShape] = js.undefined
    
    @JSName("editor.fontFamily")
    var editorDotfontFamily: js.UndefOr[String] = js.undefined
    
    @JSName("editor.fontSize")
    var editorDotfontSize: js.UndefOr[Double] = js.undefined
    
    @JSName("editor.reuseHeaders")
    var editorDotreuseHeaders: js.UndefOr[Boolean] = js.undefined
    
    @JSName("editor.theme")
    var editorDottheme: js.UndefOr[Theme] = js.undefined
    
    @JSName("general.betaUpdates")
    var generalDotbetaUpdates: js.UndefOr[Boolean] = js.undefined
    
    @JSName("queryPlan.hideQueryPlanResponse")
    var queryPlanDothideQueryPlanResponse: js.UndefOr[Boolean] = js.undefined
    
    @JSName("request.credentials")
    var requestDotcredentials: js.UndefOr[String] = js.undefined
    
    @JSName("schema.polling.enable")
    var schemaDotpollingDotenable: js.UndefOr[Boolean] = js.undefined
    
    @JSName("schema.polling.endpointFilter")
    var schemaDotpollingDotendpointFilter: js.UndefOr[String] = js.undefined
    
    @JSName("schema.polling.interval")
    var schemaDotpollingDotinterval: js.UndefOr[Double] = js.undefined
    
    @JSName("tracing.hideTracingResponse")
    var tracingDothideTracingResponse: js.UndefOr[Boolean] = js.undefined
  }
  object ISettings {
    
    inline def apply(): ISettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISettings]
    }
    
    extension [Self <: ISettings](x: Self) {
      
      inline def setEditorDotcursorShape(value: CursorShape): Self = StObject.set(x, "editor.cursorShape", value.asInstanceOf[js.Any])
      
      inline def setEditorDotcursorShapeUndefined: Self = StObject.set(x, "editor.cursorShape", js.undefined)
      
      inline def setEditorDotfontFamily(value: String): Self = StObject.set(x, "editor.fontFamily", value.asInstanceOf[js.Any])
      
      inline def setEditorDotfontFamilyUndefined: Self = StObject.set(x, "editor.fontFamily", js.undefined)
      
      inline def setEditorDotfontSize(value: Double): Self = StObject.set(x, "editor.fontSize", value.asInstanceOf[js.Any])
      
      inline def setEditorDotfontSizeUndefined: Self = StObject.set(x, "editor.fontSize", js.undefined)
      
      inline def setEditorDotreuseHeaders(value: Boolean): Self = StObject.set(x, "editor.reuseHeaders", value.asInstanceOf[js.Any])
      
      inline def setEditorDotreuseHeadersUndefined: Self = StObject.set(x, "editor.reuseHeaders", js.undefined)
      
      inline def setEditorDottheme(value: Theme): Self = StObject.set(x, "editor.theme", value.asInstanceOf[js.Any])
      
      inline def setEditorDotthemeUndefined: Self = StObject.set(x, "editor.theme", js.undefined)
      
      inline def setGeneralDotbetaUpdates(value: Boolean): Self = StObject.set(x, "general.betaUpdates", value.asInstanceOf[js.Any])
      
      inline def setGeneralDotbetaUpdatesUndefined: Self = StObject.set(x, "general.betaUpdates", js.undefined)
      
      inline def setQueryPlanDothideQueryPlanResponse(value: Boolean): Self = StObject.set(x, "queryPlan.hideQueryPlanResponse", value.asInstanceOf[js.Any])
      
      inline def setQueryPlanDothideQueryPlanResponseUndefined: Self = StObject.set(x, "queryPlan.hideQueryPlanResponse", js.undefined)
      
      inline def setRequestDotcredentials(value: String): Self = StObject.set(x, "request.credentials", value.asInstanceOf[js.Any])
      
      inline def setRequestDotcredentialsUndefined: Self = StObject.set(x, "request.credentials", js.undefined)
      
      inline def setSchemaDotpollingDotenable(value: Boolean): Self = StObject.set(x, "schema.polling.enable", value.asInstanceOf[js.Any])
      
      inline def setSchemaDotpollingDotenableUndefined: Self = StObject.set(x, "schema.polling.enable", js.undefined)
      
      inline def setSchemaDotpollingDotendpointFilter(value: String): Self = StObject.set(x, "schema.polling.endpointFilter", value.asInstanceOf[js.Any])
      
      inline def setSchemaDotpollingDotendpointFilterUndefined: Self = StObject.set(x, "schema.polling.endpointFilter", js.undefined)
      
      inline def setSchemaDotpollingDotinterval(value: Double): Self = StObject.set(x, "schema.polling.interval", value.asInstanceOf[js.Any])
      
      inline def setSchemaDotpollingDotintervalUndefined: Self = StObject.set(x, "schema.polling.interval", js.undefined)
      
      inline def setTracingDothideTracingResponse(value: Boolean): Self = StObject.set(x, "tracing.hideTracingResponse", value.asInstanceOf[js.Any])
      
      inline def setTracingDothideTracingResponseUndefined: Self = StObject.set(x, "tracing.hideTracingResponse", js.undefined)
    }
  }
  
  trait IntrospectionResult extends StObject {
    
    var __schema: Any
  }
  object IntrospectionResult {
    
    inline def apply(__schema: Any): IntrospectionResult = {
      val __obj = js.Dynamic.literal(__schema = __schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntrospectionResult]
    }
    
    extension [Self <: IntrospectionResult](x: Self) {
      
      inline def set__schema(value: Any): Self = StObject.set(x, "__schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait MiddlewareOptions extends StObject {
    
    var codeTheme: js.UndefOr[EditorColours] = js.undefined
    
    var config: js.UndefOr[Any] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[Any] = js.undefined
    
    var schema: js.UndefOr[IntrospectionResult] = js.undefined
    
    var settings: js.UndefOr[ISettings] = js.undefined
    
    var subscriptionEndpoint: js.UndefOr[String] = js.undefined
    
    var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
    
    var workspaceName: js.UndefOr[String] = js.undefined
  }
  object MiddlewareOptions {
    
    inline def apply(): MiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    extension [Self <: MiddlewareOptions](x: Self) {
      
      inline def setCodeTheme(value: EditorColours): Self = StObject.set(x, "codeTheme", value.asInstanceOf[js.Any])
      
      inline def setCodeThemeUndefined: Self = StObject.set(x, "codeTheme", js.undefined)
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setSchema(value: IntrospectionResult): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSettings(value: ISettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setSubscriptionEndpoint(value: String): Self = StObject.set(x, "subscriptionEndpoint", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionEndpointUndefined: Self = StObject.set(x, "subscriptionEndpoint", js.undefined)
      
      inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value*))
      
      inline def setWorkspaceName(value: String): Self = StObject.set(x, "workspaceName", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceNameUndefined: Self = StObject.set(x, "workspaceName", js.undefined)
    }
  }
  
  trait RenderPageOptions
    extends StObject
       with MiddlewareOptions {
    
    var cdnUrl: js.UndefOr[String] = js.undefined
    
    var faviconUrl: js.UndefOr[String | Null] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object RenderPageOptions {
    
    inline def apply(): RenderPageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderPageOptions]
    }
    
    extension [Self <: RenderPageOptions](x: Self) {
      
      inline def setCdnUrl(value: String): Self = StObject.set(x, "cdnUrl", value.asInstanceOf[js.Any])
      
      inline def setCdnUrlUndefined: Self = StObject.set(x, "cdnUrl", js.undefined)
      
      inline def setFaviconUrl(value: String): Self = StObject.set(x, "faviconUrl", value.asInstanceOf[js.Any])
      
      inline def setFaviconUrlNull: Self = StObject.set(x, "faviconUrl", null)
      
      inline def setFaviconUrlUndefined: Self = StObject.set(x, "faviconUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Tab extends StObject {
    
    var endpoint: String
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var query: String
    
    var responses: js.UndefOr[js.Array[String]] = js.undefined
    
    var variables: js.UndefOr[String] = js.undefined
  }
  object Tab {
    
    inline def apply(endpoint: String, query: String): Tab = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tab]
    }
    
    extension [Self <: Tab](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResponses(value: js.Array[String]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
      
      inline def setResponsesVarargs(value: String*): Self = StObject.set(x, "responses", js.Array(value*))
      
      inline def setVariables(value: String): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.dark
    - typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.light
  */
  trait Theme extends StObject
  object Theme {
    
    inline def dark: typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.dark = "dark".asInstanceOf[typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.dark]
    
    inline def light: typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.light = "light".asInstanceOf[typingsJapgolly.apollographqlGraphqlPlaygroundHtml.apollographqlGraphqlPlaygroundHtmlStrings.light]
  }
}
