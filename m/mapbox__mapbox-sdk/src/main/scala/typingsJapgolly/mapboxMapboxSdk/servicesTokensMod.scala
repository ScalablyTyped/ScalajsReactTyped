package typingsJapgolly.mapboxMapboxSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapboxMapboxSdk.anon.TokenId
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiClientMod.SdkConfig
import typingsJapgolly.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesTokensMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): TokensService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[TokensService]
  inline def default(config: typingsJapgolly.mapboxMapboxSdk.libClassesMapiClientMod.default): TokensService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[TokensService]
  
  trait CreateTokenRequest extends StObject {
    
    var allowedUrls: js.UndefOr[js.Array[String]] = js.undefined
    
    var note: js.UndefOr[String] = js.undefined
    
    var resources: js.UndefOr[js.Array[String]] = js.undefined
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CreateTokenRequest {
    
    inline def apply(): CreateTokenRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTokenRequest]
    }
    
    extension [Self <: CreateTokenRequest](x: Self) {
      
      inline def setAllowedUrls(value: js.Array[String]): Self = StObject.set(x, "allowedUrls", value.asInstanceOf[js.Any])
      
      inline def setAllowedUrlsUndefined: Self = StObject.set(x, "allowedUrls", js.undefined)
      
      inline def setAllowedUrlsVarargs(value: String*): Self = StObject.set(x, "allowedUrls", js.Array(value*))
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  trait Scope extends StObject {
    
    var description: String
    
    var id: String
    
    var public: Boolean
  }
  object Scope {
    
    inline def apply(description: String, id: String, public: Boolean): Scope = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    extension [Self <: Scope](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemporaryTokenRequest extends StObject {
    
    var expires: String
    
    var scopes: js.Array[String]
  }
  object TemporaryTokenRequest {
    
    inline def apply(expires: String, scopes: js.Array[String]): TemporaryTokenRequest = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemporaryTokenRequest]
    }
    
    extension [Self <: TemporaryTokenRequest](x: Self) {
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  trait Token extends StObject {
    
    /**
      * if the token is a default token
      */
    var default: Boolean
    
    /**
      * the client for the token, always 'api'
      */
    var client: String
    
    /**
      * date and time the token was created
      */
    var created: String
    
    /**
      * the identifier for the token
      */
    var id: String
    
    /**
      * date and time the token was last modified
      */
    var modified: String
    
    /**
      * human friendly description of the token
      */
    var note: String
    
    /**
      * array of scopes granted to the token
      */
    var scopes: js.Array[String]
    
    /**
      * the token itself
      */
    var token: String
    
    /**
      * the type of token
      */
    var usage: String
  }
  object Token {
    
    inline def apply(
      client: String,
      created: String,
      default: Boolean,
      id: String,
      modified: String,
      note: String,
      scopes: js.Array[String],
      token: String,
      usage: String
    ): Token = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenDetail extends StObject {
    
    var code: String
    
    var token: Token
  }
  object TokenDetail {
    
    inline def apply(code: String, token: Token): TokenDetail = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenDetail]
    }
    
    extension [Self <: TokenDetail](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokensService extends StObject {
    
    /**
      * Create a new temporary access token.
      * @param request
      */
    def createTemporaryToken(request: TemporaryTokenRequest): MapiRequest[Any]
    
    /**
      * Create a new access token.
      * @param request
      */
    def createToken(request: CreateTokenRequest): MapiRequest[Any]
    
    /**
      * Delete an access token.
      * @param request
      */
    def deleteToken(request: TokenId): MapiRequest[Any]
    
    /**
      * Get data about the client's access token.
      */
    def getToken(): MapiRequest[Any]
    
    /**
      * List your available scopes. Each item is a metadata object about the scope, not just the string scope.
      */
    def listScopes(): MapiRequest[Any]
    
    /**
      * List your access tokens.
      */
    def listTokens(): MapiRequest[Any]
    
    /**
      * Update an access token.
      * @param request
      */
    def updateToken(request: UpdateTokenRequest): MapiRequest[Any]
  }
  object TokensService {
    
    inline def apply(
      createTemporaryToken: TemporaryTokenRequest => MapiRequest[Any],
      createToken: CreateTokenRequest => MapiRequest[Any],
      deleteToken: TokenId => MapiRequest[Any],
      getToken: CallbackTo[MapiRequest[Any]],
      listScopes: CallbackTo[MapiRequest[Any]],
      listTokens: CallbackTo[MapiRequest[Any]],
      updateToken: UpdateTokenRequest => MapiRequest[Any]
    ): TokensService = {
      val __obj = js.Dynamic.literal(createTemporaryToken = js.Any.fromFunction1(createTemporaryToken), createToken = js.Any.fromFunction1(createToken), deleteToken = js.Any.fromFunction1(deleteToken), getToken = getToken.toJsFn, listScopes = listScopes.toJsFn, listTokens = listTokens.toJsFn, updateToken = js.Any.fromFunction1(updateToken))
      __obj.asInstanceOf[TokensService]
    }
    
    extension [Self <: TokensService](x: Self) {
      
      inline def setCreateTemporaryToken(value: TemporaryTokenRequest => MapiRequest[Any]): Self = StObject.set(x, "createTemporaryToken", js.Any.fromFunction1(value))
      
      inline def setCreateToken(value: CreateTokenRequest => MapiRequest[Any]): Self = StObject.set(x, "createToken", js.Any.fromFunction1(value))
      
      inline def setDeleteToken(value: TokenId => MapiRequest[Any]): Self = StObject.set(x, "deleteToken", js.Any.fromFunction1(value))
      
      inline def setGetToken(value: CallbackTo[MapiRequest[Any]]): Self = StObject.set(x, "getToken", value.toJsFn)
      
      inline def setListScopes(value: CallbackTo[MapiRequest[Any]]): Self = StObject.set(x, "listScopes", value.toJsFn)
      
      inline def setListTokens(value: CallbackTo[MapiRequest[Any]]): Self = StObject.set(x, "listTokens", value.toJsFn)
      
      inline def setUpdateToken(value: UpdateTokenRequest => MapiRequest[Any]): Self = StObject.set(x, "updateToken", js.Any.fromFunction1(value))
    }
  }
  
  trait UpdateTokenRequest
    extends StObject
       with CreateTokenRequest {
    
    var tokenId: String
  }
  object UpdateTokenRequest {
    
    inline def apply(tokenId: String): UpdateTokenRequest = {
      val __obj = js.Dynamic.literal(tokenId = tokenId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTokenRequest]
    }
    
    extension [Self <: UpdateTokenRequest](x: Self) {
      
      inline def setTokenId(value: String): Self = StObject.set(x, "tokenId", value.asInstanceOf[js.Any])
    }
  }
}
