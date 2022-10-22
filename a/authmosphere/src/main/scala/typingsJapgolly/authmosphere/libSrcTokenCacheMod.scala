package typingsJapgolly.authmosphere

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.authmosphere.libSrcTypesOauthconfigMod.TokenCacheOAuthConfig
import typingsJapgolly.authmosphere.libSrcTypesTokenCacheConfigMod.CacheConfig
import typingsJapgolly.authmosphere.libSrcTypesTokenCacheConfigMod.TokenCacheOptions
import typingsJapgolly.authmosphere.libSrcTypesTokenMod.Token
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTokenCacheMod {
  
  /**
    * Class to request and cache tokens on client-side.
    *
    * Usage:
    *  const tokenCache = new TokenCache({
    *    'nucleus': ['write.all', 'read.all']
    *  }, oAuthConfig, options);
    *
    *  tokenCache.get('nucleus')
    *  .then((token) => {
    *    console.log(token.access_token);
    *  });
    *
    */
  @JSImport("authmosphere/lib/src/token-cache", "TokenCache")
  @js.native
  open class TokenCache protected () extends StObject {
    /**
      * @param tokenConfig
      * @param oauthConfig
      */
    def this(tokenConfig: StringDictionary[js.Array[String]], oauthConfig: TokenCacheOAuthConfig) = this()
    def this(
      tokenConfig: StringDictionary[js.Array[String]],
      oauthConfig: TokenCacheOAuthConfig,
      options: TokenCacheOptions
    ) = this()
    
    /* private */ var cacheConfig: Any = js.native
    
    /**
      * Resolves with either a cached token for the given name or with a newly requested one (which is then cached).
      * Rejects if there is no token present and is not able to request a new one.
      *
      * @param tokenName
      * @returns {Promise<Token>}
      */
    def get(tokenName: String): js.Promise[Token[Record[String | Double | js.Symbol, Any]]] = js.native
    
    /**
      * Checks whether a valid token for the given name is present.
      * Resolves with that token if that is the case.
      * Rejects otherwise.
      *
      * @param tokenName
      * @returns {Promise<Token>}
      */
    /* private */ var getCachedToken: Any = js.native
    
    /* private */ var isTokenConfigured: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var oauthConfig: Any = js.native
    
    /**
      * Forces the cache to delete present tokens and request new ones.
      * Will resolve with an hashmap of the newly requested tokens if the request was successful.
      * Otherwise, rejects.
      *
      * @returns {Promise<Token>}
      */
    def refreshAllTokens(): js.Promise[TokenMap] = js.native
    
    /**
      * Forces the cache to delete present token for the given name.
      * Will resolve the newly requested token if the request was successful.
      * Otherwise, rejects.
      *
      * @param tokenName
      * @returns {Promise<Token>}
      */
    def refreshToken(tokenName: String): js.Promise[Token[Record[String | Double | js.Symbol, Any]]] = js.native
    
    /**
      * The resolveAccessTokenFactory function, creates a function,
      * which resolves a specific access_token.
      *
      * @param {string} The key configured on the tokenCache instance
      * @return {Promise<string>} the resolved access_token
      */
    def resolveAccessTokenFactory(key: String): js.Function0[js.Promise[String]] = js.native
    
    /* private */ var tokenConfig: Any = js.native
    
    /* private */ var tokenMap: Any = js.native
  }
  
  @JSImport("authmosphere/lib/src/token-cache", "defaultCacheConfig")
  @js.native
  val defaultCacheConfig: CacheConfig = js.native
  
  type TokenMap = StringDictionary[js.UndefOr[Token[Record[String | Double | js.Symbol, Any]]]]
}
