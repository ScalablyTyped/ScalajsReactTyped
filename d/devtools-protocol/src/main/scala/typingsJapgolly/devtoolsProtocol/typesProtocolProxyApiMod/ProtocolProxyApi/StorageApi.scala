package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.cacheStorageContentUpdated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.cacheStorageListUpdated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.indexedDBContentUpdated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.indexedDBListUpdated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.interestGroupAccessed
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.CacheStorageContentUpdatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.CacheStorageListUpdatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearCookiesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearDataForOriginRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearDataForStorageKeyRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearTrustTokensRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.ClearTrustTokensResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetCookiesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetCookiesResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetInterestGroupDetailsRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetInterestGroupDetailsResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetStorageKeyForFrameRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetStorageKeyForFrameResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetTrustTokensResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.IndexedDBContentUpdatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.IndexedDBListUpdatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.InterestGroupAccessedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.OverrideQuotaForOriginRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.SetCookiesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.SetInterestGroupTrackingRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.TrackCacheStorageForOriginRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.TrackIndexedDBForOriginRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.TrackIndexedDBForStorageKeyRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.UntrackCacheStorageForOriginRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.UntrackIndexedDBForOriginRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.UntrackIndexedDBForStorageKeyRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageApi extends StObject {
  
  /**
    * Clears cookies.
    */
  def clearCookies(params: ClearCookiesRequest): js.Promise[Unit] = js.native
  
  /**
    * Clears storage for origin.
    */
  def clearDataForOrigin(params: ClearDataForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Clears storage for storage key.
    */
  def clearDataForStorageKey(params: ClearDataForStorageKeyRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes all Trust Tokens issued by the provided issuerOrigin.
    * Leaves other stored data, including the issuer's Redemption Records, intact.
    */
  def clearTrustTokens(params: ClearTrustTokensRequest): js.Promise[ClearTrustTokensResponse] = js.native
  
  /**
    * Returns all browser cookies.
    */
  def getCookies(params: GetCookiesRequest): js.Promise[GetCookiesResponse] = js.native
  
  /**
    * Gets details for a named interest group.
    */
  def getInterestGroupDetails(params: GetInterestGroupDetailsRequest): js.Promise[GetInterestGroupDetailsResponse] = js.native
  
  /**
    * Returns a storage key given a frame id.
    */
  def getStorageKeyForFrame(params: GetStorageKeyForFrameRequest): js.Promise[GetStorageKeyForFrameResponse] = js.native
  
  /**
    * Returns the number of stored Trust Tokens per issuer for the
    * current browsing context.
    */
  def getTrustTokens(): js.Promise[GetTrustTokensResponse] = js.native
  
  /**
    * Returns usage and quota in bytes.
    */
  def getUsageAndQuota(params: GetUsageAndQuotaRequest): js.Promise[GetUsageAndQuotaResponse] = js.native
  
  /**
    * A cache's contents have been modified.
    */
  @JSName("on")
  def on_cacheStorageContentUpdated(
    event: cacheStorageContentUpdated,
    listener: js.Function1[/* params */ CacheStorageContentUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * A cache has been added/deleted.
    */
  @JSName("on")
  def on_cacheStorageListUpdated(
    event: cacheStorageListUpdated,
    listener: js.Function1[/* params */ CacheStorageListUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * The origin's IndexedDB object store has been modified.
    */
  @JSName("on")
  def on_indexedDBContentUpdated(
    event: indexedDBContentUpdated,
    listener: js.Function1[/* params */ IndexedDBContentUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * The origin's IndexedDB database list has been modified.
    */
  @JSName("on")
  def on_indexedDBListUpdated(event: indexedDBListUpdated, listener: js.Function1[/* params */ IndexedDBListUpdatedEvent, Unit]): Unit = js.native
  /**
    * One of the interest groups was accessed by the associated page.
    */
  @JSName("on")
  def on_interestGroupAccessed(
    event: interestGroupAccessed,
    listener: js.Function1[/* params */ InterestGroupAccessedEvent, Unit]
  ): Unit = js.native
  
  /**
    * Override quota for the specified origin
    */
  def overrideQuotaForOrigin(params: OverrideQuotaForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets given cookies.
    */
  def setCookies(params: SetCookiesRequest): js.Promise[Unit] = js.native
  
  /**
    * Enables/Disables issuing of interestGroupAccessed events.
    */
  def setInterestGroupTracking(params: SetInterestGroupTrackingRequest): js.Promise[Unit] = js.native
  
  /**
    * Registers origin to be notified when an update occurs to its cache storage list.
    */
  def trackCacheStorageForOrigin(params: TrackCacheStorageForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Registers origin to be notified when an update occurs to its IndexedDB.
    */
  def trackIndexedDBForOrigin(params: TrackIndexedDBForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Registers storage key to be notified when an update occurs to its IndexedDB.
    */
  def trackIndexedDBForStorageKey(params: TrackIndexedDBForStorageKeyRequest): js.Promise[Unit] = js.native
  
  /**
    * Unregisters origin from receiving notifications for cache storage.
    */
  def untrackCacheStorageForOrigin(params: UntrackCacheStorageForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Unregisters origin from receiving notifications for IndexedDB.
    */
  def untrackIndexedDBForOrigin(params: UntrackIndexedDBForOriginRequest): js.Promise[Unit] = js.native
  
  /**
    * Unregisters storage key from receiving notifications for IndexedDB.
    */
  def untrackIndexedDBForStorageKey(params: UntrackIndexedDBForStorageKeyRequest): js.Promise[Unit] = js.native
}
