package typingsJapgolly.expressJwt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressJwt.anon.FnCall
import typingsJapgolly.expressJwt.anon.Message
import typingsJapgolly.expressJwt.expressJwtStrings.credentials_bad_format
import typingsJapgolly.expressJwt.expressJwtStrings.credentials_bad_scheme
import typingsJapgolly.expressJwt.expressJwtStrings.credentials_required
import typingsJapgolly.expressJwt.expressJwtStrings.invalid_token
import typingsJapgolly.expressJwt.expressJwtStrings.revoked_token
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): RequestHandler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @JSImport("express-jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("express-jwt", "UnauthorizedError")
  @js.native
  open class UnauthorizedError protected ()
    extends StObject
       with Error {
    def this(code: ErrorCode, error: Message) = this()
    
    var code: ErrorCode = js.native
    
    var inner: Message = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_UnauthorizedError: typingsJapgolly.expressJwt.expressJwtStrings.UnauthorizedError = js.native
    
    var status: Double = js.native
  }
  
  type ErrorCode = LiteralUnion[
    revoked_token | invalid_token | credentials_bad_scheme | credentials_bad_format | credentials_required, 
    String
  ]
  
  type GetTokenCallback = js.Function1[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    Any
  ]
  
  type IsRevokedCallback = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* payload */ Any, 
    /* done */ js.Function2[/* err */ Any, /* revoked */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  
  type LiteralUnion[T /* <: U */, U] = T | (U & (Record[scala.Nothing, scala.Nothing]))
  
  trait Options
    extends StObject
       with /* property */ StringDictionary[Any] {
    
    /**
      * The algorithms parameter is required to prevent potential downgrade attacks when providing third party libraries as secrets.
      * {@link https://github.com/auth0/express-jwt/blob/5fb8c88067b9448d746d04ab60ad3b1996c7e310/README.md#required-parameters}
      */
    var algorithms: js.Array[String]
    
    var credentialsRequired: js.UndefOr[Boolean] = js.undefined
    
    var getToken: js.UndefOr[GetTokenCallback] = js.undefined
    
    var isRevoked: js.UndefOr[IsRevokedCallback] = js.undefined
    
    var requestProperty: js.UndefOr[String] = js.undefined
    
    var secret: secretType | SecretCallback | SecretCallbackLong
    
    var userProperty: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(algorithms: js.Array[String], secret: secretType | SecretCallback | SecretCallbackLong): Options = {
      val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
      
      inline def setCredentialsRequired(value: Boolean): Self = StObject.set(x, "credentialsRequired", value.asInstanceOf[js.Any])
      
      inline def setCredentialsRequiredUndefined: Self = StObject.set(x, "credentialsRequired", js.undefined)
      
      inline def setGetToken(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => Any
      ): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
      
      inline def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      inline def setIsRevoked(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* payload */ Any, /* done */ js.Function2[/* err */ Any, /* revoked */ js.UndefOr[Boolean], Unit]) => Callback
      ): Self = StObject.set(x, "isRevoked", js.Any.fromFunction3((t0: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: /* payload */ Any, t2: /* done */ js.Function2[/* err */ Any, /* revoked */ js.UndefOr[Boolean], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setIsRevokedUndefined: Self = StObject.set(x, "isRevoked", js.undefined)
      
      inline def setRequestProperty(value: String): Self = StObject.set(x, "requestProperty", value.asInstanceOf[js.Any])
      
      inline def setRequestPropertyUndefined: Self = StObject.set(x, "requestProperty", js.undefined)
      
      inline def setSecret(value: secretType | SecretCallback | SecretCallbackLong): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSecretFunction3(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* payload */ Any, /* done */ js.Function2[/* err */ Any, /* secret */ js.UndefOr[secretType], Unit]) => Callback
      ): Self = StObject.set(x, "secret", js.Any.fromFunction3((t0: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: /* payload */ Any, t2: /* done */ js.Function2[/* err */ Any, /* secret */ js.UndefOr[secretType], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSecretFunction4(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* header */ Any, /* payload */ Any, /* done */ js.Function2[/* err */ Any, /* secret */ js.UndefOr[secretType], Unit]) => Callback
      ): Self = StObject.set(x, "secret", js.Any.fromFunction4((t0: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], t1: /* header */ Any, t2: /* payload */ Any, t3: /* done */ js.Function2[/* err */ Any, /* secret */ js.UndefOr[secretType], Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
      
      inline def setUserPropertyUndefined: Self = StObject.set(x, "userProperty", js.undefined)
    }
  }
  
  @js.native
  trait RequestHandler
    extends typingsJapgolly.expressServeStaticCore.mod.RequestHandler {
    
    def unless(): typingsJapgolly.express.mod.RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def unless(
      middleware: typingsJapgolly.express.mod.RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: typingsJapgolly.expressUnless.mod.Options
    ): typingsJapgolly.express.mod.RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def unless(
      options: js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          Boolean
        ]
    ): typingsJapgolly.express.mod.RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def unless(options: typingsJapgolly.expressUnless.mod.Options): typingsJapgolly.express.mod.RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    @JSName("unless")
    var unless_Original: FnCall = js.native
  }
  
  type SecretCallback = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* payload */ Any, 
    /* done */ js.Function2[/* err */ Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  
  type SecretCallbackLong = js.Function4[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* header */ Any, 
    /* payload */ Any, 
    /* done */ js.Function2[/* err */ Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var user: js.UndefOr[User] = js.undefined
      }
      object Request {
        
        inline def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
          
          inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      trait User extends StObject
    }
  }
  
  type secretType = String | Buffer
}
