package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseInstallations.firebaseInstallationsInts.`0`
import typingsJapgolly.firebaseInstallations.firebaseInstallationsInts.`1`
import typingsJapgolly.firebaseInstallations.firebaseInstallationsInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcInterfacesInstallationEntryMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.NotStartedAuthToken
    - typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.InProgressAuthToken
    - typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.CompletedAuthToken
  */
  trait AuthToken extends StObject
  object AuthToken {
    
    inline def CompletedAuthToken(creationTime: Double, expiresIn: Double, token: String): typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.CompletedAuthToken = {
      val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], requestStatus = 2, token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.CompletedAuthToken]
    }
    
    inline def InProgressAuthToken(requestTime: Double): typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.InProgressAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = 1, requestTime = requestTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.InProgressAuthToken]
    }
    
    inline def NotStartedAuthToken(): typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.NotStartedAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = 0)
      __obj.asInstanceOf[typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.NotStartedAuthToken]
    }
  }
  
  trait CompletedAuthToken
    extends StObject
       with AuthToken {
    
    /**
      * Unix timestamp when Authentication Token was created.
      * Only exists if requestStatus is COMPLETED.
      */
    val creationTime: Double
    
    /**
      * Authentication Token time to live duration in milliseconds.
      * Only exists if requestStatus is COMPLETED.
      */
    val expiresIn: Double
    
    val requestStatus: `2`
    
    /**
      * Firebase Installations Authentication Token.
      * Only exists if requestStatus is COMPLETED.
      */
    val token: String
  }
  object CompletedAuthToken {
    
    inline def apply(creationTime: Double, expiresIn: Double, token: String): CompletedAuthToken = {
      val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], requestStatus = 2, token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletedAuthToken]
    }
    
    extension [Self <: CompletedAuthToken](x: Self) {
      
      inline def setCreationTime(value: Double): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setRequestStatus(value: `2`): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait InProgressAuthToken
    extends StObject
       with AuthToken {
    
    val requestStatus: `1`
    
    /**
      * Unix timestamp when the current generateAuthRequest was initiated.
      * Used for figuring out how long the request status has been IN_PROGRESS.
      */
    val requestTime: Double
  }
  object InProgressAuthToken {
    
    inline def apply(requestTime: Double): InProgressAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = 1, requestTime = requestTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[InProgressAuthToken]
    }
    
    extension [Self <: InProgressAuthToken](x: Self) {
      
      inline def setRequestStatus(value: `1`): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
      
      inline def setRequestTime(value: Double): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait InProgressInstallationEntry
    extends StObject
       with InstallationEntry {
    
    /** Firebase Installation ID */
    val fid: String
    
    /** Status of the Firebase Installation registration on the server. */
    val registrationStatus: `1`
    
    /**
      * Unix timestamp that shows the time when the current createInstallation
      * request was initiated.
      * Used for figuring out how long the registration status has been PENDING.
      */
    val registrationTime: Double
  }
  object InProgressInstallationEntry {
    
    inline def apply(fid: String, registrationTime: Double): InProgressInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = 1, registrationTime = registrationTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[InProgressInstallationEntry]
    }
    
    extension [Self <: InProgressInstallationEntry](x: Self) {
      
      inline def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      inline def setRegistrationStatus(value: `1`): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
      
      inline def setRegistrationTime(value: Double): Self = StObject.set(x, "registrationTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.UnregisteredInstallationEntry
    - typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.InProgressInstallationEntry
    - typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry
  */
  trait InstallationEntry extends StObject
  object InstallationEntry {
    
    inline def InProgressInstallationEntry(fid: String, registrationTime: Double): typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.InProgressInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = 1, registrationTime = registrationTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.InProgressInstallationEntry]
    }
    
    inline def RegisteredInstallationEntry(authToken: AuthToken, fid: String, refreshToken: String): typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = 2)
      __obj.asInstanceOf[typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.RegisteredInstallationEntry]
    }
    
    inline def UnregisteredInstallationEntry(fid: String): typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.UnregisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = 0)
      __obj.asInstanceOf[typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationEntryMod.UnregisteredInstallationEntry]
    }
  }
  
  trait NotStartedAuthToken
    extends StObject
       with AuthToken {
    
    val requestStatus: `0`
  }
  object NotStartedAuthToken {
    
    inline def apply(): NotStartedAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = 0)
      __obj.asInstanceOf[NotStartedAuthToken]
    }
    
    extension [Self <: NotStartedAuthToken](x: Self) {
      
      inline def setRequestStatus(value: `0`): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegisteredInstallationEntry
    extends StObject
       with InstallationEntry {
    
    /** Firebase Installation Authentication Token. */
    val authToken: AuthToken
    
    /** Firebase Installation ID */
    val fid: String
    
    /**
      * Refresh Token returned from the server.
      * Used for authenticating generateAuthToken requests.
      */
    val refreshToken: String
    
    /** Status of the Firebase Installation registration on the server. */
    val registrationStatus: `2`
  }
  object RegisteredInstallationEntry {
    
    inline def apply(authToken: AuthToken, fid: String, refreshToken: String): RegisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = 2)
      __obj.asInstanceOf[RegisteredInstallationEntry]
    }
    
    extension [Self <: RegisteredInstallationEntry](x: Self) {
      
      inline def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRegistrationStatus(value: `2`): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseInstallations.firebaseInstallationsInts.`0`
    - typingsJapgolly.firebaseInstallations.firebaseInstallationsInts.`1`
    - typingsJapgolly.firebaseInstallations.firebaseInstallationsInts.`2`
  */
  trait RequestStatus extends StObject
  object RequestStatus {
    
    inline def COMPLETED: `2` = 2.asInstanceOf[`2`]
    
    inline def IN_PROGRESS: `1` = 1.asInstanceOf[`1`]
    
    inline def NOT_STARTED: `0` = 0.asInstanceOf[`0`]
  }
  
  trait UnregisteredInstallationEntry
    extends StObject
       with InstallationEntry {
    
    /** Firebase Installation ID */
    val fid: String
    
    /** Status of the Firebase Installation registration on the server. */
    val registrationStatus: `0`
  }
  object UnregisteredInstallationEntry {
    
    inline def apply(fid: String): UnregisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = 0)
      __obj.asInstanceOf[UnregisteredInstallationEntry]
    }
    
    extension [Self <: UnregisteredInstallationEntry](x: Self) {
      
      inline def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      inline def setRegistrationStatus(value: `0`): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    }
  }
}
