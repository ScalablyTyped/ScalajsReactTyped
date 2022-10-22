package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.VssJsonCollectionWrapperV
import typingsJapgolly.vsoNodeApi.interfacesProfileInterfacesMod.Avatar
import typingsJapgolly.vsoNodeApi.interfacesProfileInterfacesMod.CreateProfileContext
import typingsJapgolly.vsoNodeApi.interfacesProfileInterfacesMod.GeoRegion
import typingsJapgolly.vsoNodeApi.interfacesProfileInterfacesMod.Profile
import typingsJapgolly.vsoNodeApi.interfacesProfileInterfacesMod.ProfileAttribute
import typingsJapgolly.vsoNodeApi.interfacesProfileInterfacesMod.ProfileAttributeBase
import typingsJapgolly.vsoNodeApi.interfacesProfileInterfacesMod.ProfileRegions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileApiMod {
  
  @JSImport("vso-node-api/ProfileApi", "ProfileApi")
  @js.native
  open class ProfileApi protected () extends IProfileApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IProfileApi extends ClientApiBase {
    
    def createProfile(createProfileContext: CreateProfileContext): js.Promise[Profile] = js.native
    def createProfile(createProfileContext: CreateProfileContext, autoCreate: Boolean): js.Promise[Profile] = js.native
    
    def deleteProfileAttribute(id: String, descriptor: String): js.Promise[Unit] = js.native
    
    def getAvatar(id: String): js.Promise[Avatar] = js.native
    def getAvatar(id: String, size: String): js.Promise[Avatar] = js.native
    def getAvatar(id: String, size: String, format: String): js.Promise[Avatar] = js.native
    def getAvatar(id: String, size: Unit, format: String): js.Promise[Avatar] = js.native
    
    def getAvatarPreview(container: Any, id: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: Any, id: String, size: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: Any, id: String, size: String, format: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: Any, id: String, size: String, format: String, displayName: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: Any, id: String, size: String, format: Unit, displayName: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: Any, id: String, size: Unit, format: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: Any, id: String, size: Unit, format: String, displayName: String): js.Promise[Avatar] = js.native
    def getAvatarPreview(container: Any, id: String, size: Unit, format: Unit, displayName: String): js.Promise[Avatar] = js.native
    
    def getGeoRegion(ipaddress: String): js.Promise[GeoRegion] = js.native
    
    def getProfile(id: String): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean, partition: String): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean, partition: String, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: String,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: String,
      coreAttributes: Unit,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Boolean, partition: Unit, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: Unit,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Boolean,
      partition: Unit,
      coreAttributes: Unit,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Unit, partition: String): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Unit, partition: String, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Unit,
      partition: String,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Unit,
      partition: String,
      coreAttributes: Unit,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Boolean, withAttributes: Unit, partition: Unit, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Unit,
      partition: Unit,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Boolean,
      withAttributes: Unit,
      partition: Unit,
      coreAttributes: Unit,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Unit, withAttributes: Boolean): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Unit, withAttributes: Boolean, partition: String): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Unit, withAttributes: Boolean, partition: String, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Unit,
      withAttributes: Boolean,
      partition: String,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Unit,
      withAttributes: Boolean,
      partition: String,
      coreAttributes: Unit,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Unit, withAttributes: Boolean, partition: Unit, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Unit,
      withAttributes: Boolean,
      partition: Unit,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Unit,
      withAttributes: Boolean,
      partition: Unit,
      coreAttributes: Unit,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Unit, withAttributes: Unit, partition: String): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Unit, withAttributes: Unit, partition: String, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Unit,
      withAttributes: Unit,
      partition: String,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Unit,
      withAttributes: Unit,
      partition: String,
      coreAttributes: Unit,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(id: String, details: Unit, withAttributes: Unit, partition: Unit, coreAttributes: String): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Unit,
      withAttributes: Unit,
      partition: Unit,
      coreAttributes: String,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    def getProfile(
      id: String,
      details: Unit,
      withAttributes: Unit,
      partition: Unit,
      coreAttributes: Unit,
      forceRefresh: Boolean
    ): js.Promise[Profile] = js.native
    
    def getProfileAttribute(id: String, descriptor: String): js.Promise[ProfileAttribute] = js.native
    
    def getProfileAttributes(id: String, partition: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(id: String, partition: String, modifiedSince: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(id: String, partition: String, modifiedSince: String, modifiedAfterRevision: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: String,
      withCoreAttributes: Unit,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: Unit,
      withCoreAttributes: Boolean
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: Unit,
      withCoreAttributes: Boolean,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: String,
      modifiedAfterRevision: Unit,
      withCoreAttributes: Unit,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(id: String, partition: String, modifiedSince: Unit, modifiedAfterRevision: String): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: Unit,
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: Unit,
      modifiedAfterRevision: String,
      withCoreAttributes: Boolean,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: Unit,
      modifiedAfterRevision: String,
      withCoreAttributes: Unit,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: Unit,
      modifiedAfterRevision: Unit,
      withCoreAttributes: Boolean
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: Unit,
      modifiedAfterRevision: Unit,
      withCoreAttributes: Boolean,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    def getProfileAttributes(
      id: String,
      partition: String,
      modifiedSince: Unit,
      modifiedAfterRevision: Unit,
      withCoreAttributes: Unit,
      coreAttributes: String
    ): js.Promise[js.Array[ProfileAttribute]] = js.native
    
    def getRegions(): js.Promise[ProfileRegions] = js.native
    
    def getSupportedLcids(): js.Promise[js.Array[String]] = js.native
    
    def getUserDefaults(): js.Promise[Profile] = js.native
    def getUserDefaults(includeAvatar: Boolean): js.Promise[Profile] = js.native
    
    def refreshUserDefaults(id: String): js.Promise[Profile] = js.native
    
    def resetAvatar(id: String): js.Promise[Unit] = js.native
    
    def setAvatar(container: Any, id: String): js.Promise[Unit] = js.native
    
    def setProfileAttribute(container: Any, id: String, descriptor: String): js.Promise[Unit] = js.native
    
    def setProfileAttributes(attributesCollection: VssJsonCollectionWrapperV[js.Array[ProfileAttributeBase[Any]]], id: String): js.Promise[Unit] = js.native
    
    def updateProfile(profile: Profile, id: String): js.Promise[Unit] = js.native
  }
}
