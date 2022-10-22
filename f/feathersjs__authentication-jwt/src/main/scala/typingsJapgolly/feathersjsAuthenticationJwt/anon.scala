package typingsJapgolly.feathersjsAuthenticationJwt

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.feathersjsAuthenticationJwt.mod.JwtFromRequestFunction
import typingsJapgolly.feathersjsAuthenticationJwt.mod.Verifier
import typingsJapgolly.feathersjsFeathers.mod.Application
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BodyKey extends StObject {
    
    var bodyKey: String
    
    var name: String
  }
  object BodyKey {
    
    inline def apply(bodyKey: String, name: String): BodyKey = {
      val __obj = js.Dynamic.literal(bodyKey = bodyKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyKey]
    }
    
    extension [Self <: BodyKey](x: Self) {
      
      inline def setBodyKey(value: String): Self = StObject.set(x, "bodyKey", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromAuthHeader extends StObject {
    
    def fromAuthHeader(): JwtFromRequestFunction
    
    def fromAuthHeaderAsBearerToken(): JwtFromRequestFunction
    
    def fromAuthHeaderWithScheme(auth_scheme: String): JwtFromRequestFunction
    
    def fromBodyField(field_name: String): JwtFromRequestFunction
    
    def fromExtractors(extractors: js.Array[JwtFromRequestFunction]): JwtFromRequestFunction
    
    def fromHeader(header_name: String): JwtFromRequestFunction
    
    def fromUrlQueryParameter(param_name: String): JwtFromRequestFunction
  }
  object FromAuthHeader {
    
    inline def apply(
      fromAuthHeader: CallbackTo[JwtFromRequestFunction],
      fromAuthHeaderAsBearerToken: CallbackTo[JwtFromRequestFunction],
      fromAuthHeaderWithScheme: String => JwtFromRequestFunction,
      fromBodyField: String => JwtFromRequestFunction,
      fromExtractors: js.Array[JwtFromRequestFunction] => JwtFromRequestFunction,
      fromHeader: String => JwtFromRequestFunction,
      fromUrlQueryParameter: String => JwtFromRequestFunction
    ): FromAuthHeader = {
      val __obj = js.Dynamic.literal(fromAuthHeader = fromAuthHeader.toJsFn, fromAuthHeaderAsBearerToken = fromAuthHeaderAsBearerToken.toJsFn, fromAuthHeaderWithScheme = js.Any.fromFunction1(fromAuthHeaderWithScheme), fromBodyField = js.Any.fromFunction1(fromBodyField), fromExtractors = js.Any.fromFunction1(fromExtractors), fromHeader = js.Any.fromFunction1(fromHeader), fromUrlQueryParameter = js.Any.fromFunction1(fromUrlQueryParameter))
      __obj.asInstanceOf[FromAuthHeader]
    }
    
    extension [Self <: FromAuthHeader](x: Self) {
      
      inline def setFromAuthHeader(value: CallbackTo[JwtFromRequestFunction]): Self = StObject.set(x, "fromAuthHeader", value.toJsFn)
      
      inline def setFromAuthHeaderAsBearerToken(value: CallbackTo[JwtFromRequestFunction]): Self = StObject.set(x, "fromAuthHeaderAsBearerToken", value.toJsFn)
      
      inline def setFromAuthHeaderWithScheme(value: String => JwtFromRequestFunction): Self = StObject.set(x, "fromAuthHeaderWithScheme", js.Any.fromFunction1(value))
      
      inline def setFromBodyField(value: String => JwtFromRequestFunction): Self = StObject.set(x, "fromBodyField", js.Any.fromFunction1(value))
      
      inline def setFromExtractors(value: js.Array[JwtFromRequestFunction] => JwtFromRequestFunction): Self = StObject.set(x, "fromExtractors", js.Any.fromFunction1(value))
      
      inline def setFromHeader(value: String => JwtFromRequestFunction): Self = StObject.set(x, "fromHeader", js.Any.fromFunction1(value))
      
      inline def setFromUrlQueryParameter(value: String => JwtFromRequestFunction): Self = StObject.set(x, "fromUrlQueryParameter", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<@feathersjs/authentication-jwt.@feathersjs/authentication-jwt.FeathersAuthenticationJWTOptions> */
  trait PartialFeathersAuthentica extends StObject {
    
    var Verifier: js.UndefOr[
        Instantiable2[
          /* app */ Application[js.Object], 
          /* options */ Any, 
          typingsJapgolly.feathersjsAuthenticationJwt.mod.Verifier
        ]
      ] = js.undefined
    
    var entity: js.UndefOr[String] = js.undefined
    
    var jwtFromRequest: js.UndefOr[JwtFromRequestFunction] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var secretOrKey: js.UndefOr[String] = js.undefined
    
    var service: js.UndefOr[String] = js.undefined
    
    var session: js.UndefOr[Boolean] = js.undefined
  }
  object PartialFeathersAuthentica {
    
    inline def apply(): PartialFeathersAuthentica = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFeathersAuthentica]
    }
    
    extension [Self <: PartialFeathersAuthentica](x: Self) {
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setJwtFromRequest(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => String | Null
      ): Self = StObject.set(x, "jwtFromRequest", js.Any.fromFunction1(value))
      
      inline def setJwtFromRequestUndefined: Self = StObject.set(x, "jwtFromRequest", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setSecretOrKey(value: String): Self = StObject.set(x, "secretOrKey", value.asInstanceOf[js.Any])
      
      inline def setSecretOrKeyUndefined: Self = StObject.set(x, "secretOrKey", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setVerifier(value: Instantiable2[/* app */ Application[js.Object], /* options */ Any, Verifier]): Self = StObject.set(x, "Verifier", value.asInstanceOf[js.Any])
      
      inline def setVerifierUndefined: Self = StObject.set(x, "Verifier", js.undefined)
    }
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default(): js.Function0[Unit] = js.native
    def default(options: PartialFeathersAuthentica): js.Function0[Unit] = js.native
    
    val ExtractJwt: FromAuthHeader = js.native
    
    var Verifier: Instantiable2[
        /* app */ Application[js.Object], 
        /* options */ Any, 
        typingsJapgolly.feathersjsAuthenticationJwt.mod.Verifier
      ] = js.native
    
    val defaults: BodyKey = js.native
  }
}
