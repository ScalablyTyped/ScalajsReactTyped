package typingsJapgolly.passportHttp

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.passport.mod.Strategy
import typingsJapgolly.passportHttp.passportHttpBooleans.`false`
import typingsJapgolly.passportHttp.passportHttpBooleans.`true`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-http", "BasicStrategy")
  @js.native
  open class BasicStrategy protected ()
    extends StObject
       with Strategy {
    def this(verify: BasicVerifyFunction) = this()
    def this(options: BasicStrategyOptions[`false`], verify: BasicVerifyFunction) = this()
    def this(options: BasicStrategyOptions[`true`], verify: BasicVerifyFunctionWithRequest) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: js.Object
    ): Unit = js.native
    
    @JSName("name")
    var name_BasicStrategy: String = js.native
  }
  
  @JSImport("passport-http", "DigestStrategy")
  @js.native
  open class DigestStrategy protected ()
    extends StObject
       with Strategy {
    def this(secret: DigestSecretFunction) = this()
    def this(options: DigestStrategyOptions, secret: DigestSecretFunction) = this()
    def this(secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
    def this(options: DigestStrategyOptions, secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
    
    def authenticate(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: js.Object
    ): Unit = js.native
    
    @JSName("name")
    var name_DigestStrategy: String = js.native
  }
  
  trait BasicStrategyOptions[req /* <: Boolean */] extends StObject {
    
    var passReqToCallback: js.UndefOr[req] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
  }
  object BasicStrategyOptions {
    
    inline def apply[req /* <: Boolean */](): BasicStrategyOptions[req] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicStrategyOptions[req]]
    }
    
    extension [Self <: BasicStrategyOptions[?], req /* <: Boolean */](x: Self & BasicStrategyOptions[req]) {
      
      inline def setPassReqToCallback(value: req): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    }
  }
  
  type BasicVerifyFunction = js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function2[/* error */ Any, /* user */ js.UndefOr[Any], Unit], 
    Any
  ]
  
  type BasicVerifyFunctionWithRequest = js.Function4[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* username */ String, 
    /* password */ String, 
    /* done */ js.Function2[/* error */ Any, /* user */ js.UndefOr[Any], Unit], 
    Any
  ]
  
  type DigestSecretFunction = js.Function2[
    /* username */ String, 
    /* done */ js.Function3[/* error */ Any, /* user */ js.UndefOr[Any], /* password */ js.UndefOr[Any], Unit], 
    Any
  ]
  
  trait DigestStrategyOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var opaque: js.UndefOr[String] = js.undefined
    
    var qop: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
  }
  object DigestStrategyOptions {
    
    inline def apply(): DigestStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DigestStrategyOptions]
    }
    
    extension [Self <: DigestStrategyOptions](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setDomain(value: String | js.Array[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomainVarargs(value: String*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setOpaque(value: String): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setQop(value: String | js.Array[String]): Self = StObject.set(x, "qop", value.asInstanceOf[js.Any])
      
      inline def setQopUndefined: Self = StObject.set(x, "qop", js.undefined)
      
      inline def setQopVarargs(value: String*): Self = StObject.set(x, "qop", js.Array(value*))
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    }
  }
  
  type DigestValidateFunction = js.Function2[
    /* params */ DigestValidateOptions, 
    /* done */ js.Function2[/* error */ Any, /* valid */ Boolean, Unit], 
    Any
  ]
  
  trait DigestValidateOptions extends StObject {
    
    var cnonce: String
    
    var nc: Double
    
    var nonce: String
    
    var opaque: String
  }
  object DigestValidateOptions {
    
    inline def apply(cnonce: String, nc: Double, nonce: String, opaque: String): DigestValidateOptions = {
      val __obj = js.Dynamic.literal(cnonce = cnonce.asInstanceOf[js.Any], nc = nc.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any])
      __obj.asInstanceOf[DigestValidateOptions]
    }
    
    extension [Self <: DigestValidateOptions](x: Self) {
      
      inline def setCnonce(value: String): Self = StObject.set(x, "cnonce", value.asInstanceOf[js.Any])
      
      inline def setNc(value: Double): Self = StObject.set(x, "nc", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: String): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    }
  }
}
