package typingsJapgolly.alksNode

import typingsJapgolly.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("alks-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIamKey(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* key */ KeyData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createIamKey")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createIamRole(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    includeDefaultPolicies: Boolean,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* body */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createIamRole")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], roleName.asInstanceOf[js.Any], roleType.asInstanceOf[js.Any], includeDefaultPolicies.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createIamTrustRole(
    account: Account,
    auth: Auth,
    roleName: String,
    roleType: String,
    trustArn: String,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* body */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createIamTrustRole")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], roleName.asInstanceOf[js.Any], roleType.asInstanceOf[js.Any], trustArn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createKey(
    account: Account,
    auth: Auth,
    duration: Double,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* key */ KeyData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createKey")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* data */ LongTermKeyData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLongTermKey")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], iamUserName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteIamRole(
    account: Account,
    auth: Auth,
    roleName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* body */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteIamRole")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], roleName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteLongTermKey(
    account: Account,
    auth: Auth,
    iamUserName: String,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* body */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteLongTermKey")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], iamUserName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generateConsoleUrl(key: AwsKey, opts: js.Object, callback: js.Function2[/* err */ js.Error, /* url */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateConsoleUrl")(key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAccounts(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* accounts */ js.Array[AlksAccount], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccounts")(server.asInstanceOf[js.Any], userid.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDurations(
    account: Account,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* duration */ js.Array[Double], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDurations")(account.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getIamRoleTypes(
    server: String,
    userid: String,
    auth: Auth,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* body */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getIamRoleTypes")(server.asInstanceOf[js.Any], userid.asInstanceOf[js.Any], auth.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def refreshTokenToAccessToken(
    account: Account,
    token: String,
    opts: js.Object,
    callback: js.Function2[/* err */ js.Error, /* body */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshTokenToAccessToken")(account.asInstanceOf[js.Any], token.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Account extends StObject {
    
    var alksAccount: String
    
    var alksRole: String
    
    var server: String
    
    var userid: String
  }
  object Account {
    
    inline def apply(alksAccount: String, alksRole: String, server: String, userid: String): Account = {
      val __obj = js.Dynamic.literal(alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Account]
    }
    
    extension [Self <: Account](x: Self) {
      
      inline def setAlksAccount(value: String): Self = StObject.set(x, "alksAccount", value.asInstanceOf[js.Any])
      
      inline def setAlksRole(value: String): Self = StObject.set(x, "alksRole", value.asInstanceOf[js.Any])
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlksAccount extends StObject {
    
    var account: String
    
    var iam: js.UndefOr[Boolean] = js.undefined
    
    var role: String
  }
  object AlksAccount {
    
    inline def apply(account: String, role: String): AlksAccount = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlksAccount]
    }
    
    extension [Self <: AlksAccount](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setIam(value: Boolean): Self = StObject.set(x, "iam", value.asInstanceOf[js.Any])
      
      inline def setIamUndefined: Self = StObject.set(x, "iam", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait Auth extends StObject {
    
    var password: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object Auth {
    
    inline def apply(): Auth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Auth]
    }
    
    extension [Self <: Auth](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait AwsKey extends StObject {
    
    var accessKey: String
    
    var secretKey: String
    
    var sessionToken: String
  }
  object AwsKey {
    
    inline def apply(accessKey: String, secretKey: String, sessionToken: String): AwsKey = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsKey]
    }
    
    extension [Self <: AwsKey](x: Self) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyData extends StObject {
    
    var accessKey: String
    
    var alksAccount: String
    
    var alksRole: String
    
    var expires: Moment
    
    var secretKey: String
    
    var sessionTime: String
    
    var sessionToken: String
  }
  object KeyData {
    
    inline def apply(
      accessKey: String,
      alksAccount: String,
      alksRole: String,
      expires: Moment,
      secretKey: String,
      sessionTime: String,
      sessionToken: String
    ): KeyData = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any], sessionTime = sessionTime.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyData]
    }
    
    extension [Self <: KeyData](x: Self) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAlksAccount(value: String): Self = StObject.set(x, "alksAccount", value.asInstanceOf[js.Any])
      
      inline def setAlksRole(value: String): Self = StObject.set(x, "alksRole", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Moment): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSessionTime(value: String): Self = StObject.set(x, "sessionTime", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait LongTermKeyData extends StObject {
    
    var accessKey: String
    
    var alksAccount: String
    
    var alksRole: String
    
    var iamUserArn: String
    
    var iamUserName: String
    
    var secretKey: String
  }
  object LongTermKeyData {
    
    inline def apply(
      accessKey: String,
      alksAccount: String,
      alksRole: String,
      iamUserArn: String,
      iamUserName: String,
      secretKey: String
    ): LongTermKeyData = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], iamUserArn = iamUserArn.asInstanceOf[js.Any], iamUserName = iamUserName.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LongTermKeyData]
    }
    
    extension [Self <: LongTermKeyData](x: Self) {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAlksAccount(value: String): Self = StObject.set(x, "alksAccount", value.asInstanceOf[js.Any])
      
      inline def setAlksRole(value: String): Self = StObject.set(x, "alksRole", value.asInstanceOf[js.Any])
      
      inline def setIamUserArn(value: String): Self = StObject.set(x, "iamUserArn", value.asInstanceOf[js.Any])
      
      inline def setIamUserName(value: String): Self = StObject.set(x, "iamUserName", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
