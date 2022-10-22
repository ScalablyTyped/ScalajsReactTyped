package typingsJapgolly.passportWindowsauth

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.passport.mod.Profile
import typingsJapgolly.passport.mod.Strategy
import typingsJapgolly.passportWindowsauth.anon.Base
import typingsJapgolly.passportWindowsauth.anon.OptionspassReqToCallbackt
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-windowsauth", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Strategy {
    def this(verify: Verify) = this()
    def this(options: OptionspassReqToCallbackt, verify: VerifyWithReq) = this()
    def this(options: Options, verify: Verify) = this()
  }
  
  trait Options extends StObject {
    
    var getUserNameFromHeader: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          String
        ]
      ] = js.undefined
    
    var integrated: js.UndefOr[Boolean] = js.undefined
    
    var ldap: js.UndefOr[Base] = js.undefined
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var passwordField: js.UndefOr[String] = js.undefined
    
    var usernameField: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGetUserNameFromHeader(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => String
      ): Self = StObject.set(x, "getUserNameFromHeader", js.Any.fromFunction1(value))
      
      inline def setGetUserNameFromHeaderUndefined: Self = StObject.set(x, "getUserNameFromHeader", js.undefined)
      
      inline def setIntegrated(value: Boolean): Self = StObject.set(x, "integrated", value.asInstanceOf[js.Any])
      
      inline def setIntegratedUndefined: Self = StObject.set(x, "integrated", js.undefined)
      
      inline def setLdap(value: Base): Self = StObject.set(x, "ldap", value.asInstanceOf[js.Any])
      
      inline def setLdapUndefined: Self = StObject.set(x, "ldap", js.undefined)
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setPasswordField(value: String): Self = StObject.set(x, "passwordField", value.asInstanceOf[js.Any])
      
      inline def setPasswordFieldUndefined: Self = StObject.set(x, "passwordField", js.undefined)
      
      inline def setUsernameField(value: String): Self = StObject.set(x, "usernameField", value.asInstanceOf[js.Any])
      
      inline def setUsernameFieldUndefined: Self = StObject.set(x, "usernameField", js.undefined)
    }
  }
  
  type Verified = js.Function3[
    /* err */ js.UndefOr[js.Error | Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type Verify = js.Function2[/* profile */ Profile, /* done */ Verified, Unit]
  
  type VerifyWithReq = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* profile */ Profile, 
    /* done */ Verified, 
    Unit
  ]
  
  type windowsauth = Strategy
}
