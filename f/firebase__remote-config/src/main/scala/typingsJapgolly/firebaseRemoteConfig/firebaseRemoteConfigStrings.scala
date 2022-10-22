package typingsJapgolly.firebaseRemoteConfig

import typingsJapgolly.firebaseRemoteConfig.distEsmSrcErrorsMod.ErrorCode
import typingsJapgolly.firebaseRemoteConfig.distSrcPublicTypesMod.FetchStatus
import typingsJapgolly.firebaseRemoteConfig.distSrcPublicTypesMod.LogLevel
import typingsJapgolly.firebaseRemoteConfig.distSrcPublicTypesMod.ValueSource
import typingsJapgolly.firebaseRemoteConfig.distSrcStorageStorageMod.ProjectNamespaceKeyFieldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseRemoteConfigStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ValueSource
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.ValueSource
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.ValueSource
       with typingsJapgolly.firebaseRemoteConfig.mod.ValueSource
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait active_config
    extends StObject
       with ProjectNamespaceKeyFieldValue
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcStorageStorageMod.ProjectNamespaceKeyFieldValue
  inline def active_config: active_config = "active_config".asInstanceOf[active_config]
  
  @js.native
  sealed trait active_config_etag
    extends StObject
       with ProjectNamespaceKeyFieldValue
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcStorageStorageMod.ProjectNamespaceKeyFieldValue
  inline def active_config_etag: active_config_etag = "active_config_etag".asInstanceOf[active_config_etag]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.LogLevel
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.LogLevel
       with typingsJapgolly.firebaseRemoteConfig.mod.LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.LogLevel
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.LogLevel
       with typingsJapgolly.firebaseRemoteConfig.mod.LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait failure
    extends StObject
       with FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.mod.FetchStatus
  inline def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait `fetch-client-network`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `fetch-client-network`: `fetch-client-network` = "fetch-client-network".asInstanceOf[`fetch-client-network`]
  
  @js.native
  sealed trait `fetch-client-parse`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `fetch-client-parse`: `fetch-client-parse` = "fetch-client-parse".asInstanceOf[`fetch-client-parse`]
  
  @js.native
  sealed trait `fetch-status`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `fetch-status`: `fetch-status` = "fetch-status".asInstanceOf[`fetch-status`]
  
  @js.native
  sealed trait `fetch-throttle`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `fetch-throttle`: `fetch-throttle` = "fetch-throttle".asInstanceOf[`fetch-throttle`]
  
  @js.native
  sealed trait `fetch-timeout`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `fetch-timeout`: `fetch-timeout` = "fetch-timeout".asInstanceOf[`fetch-timeout`]
  
  @js.native
  sealed trait `indexed-db-unavailable`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `indexed-db-unavailable`: `indexed-db-unavailable` = "indexed-db-unavailable".asInstanceOf[`indexed-db-unavailable`]
  
  @js.native
  sealed trait last_fetch_status
    extends StObject
       with ProjectNamespaceKeyFieldValue
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcStorageStorageMod.ProjectNamespaceKeyFieldValue
  inline def last_fetch_status: last_fetch_status = "last_fetch_status".asInstanceOf[last_fetch_status]
  
  @js.native
  sealed trait last_successful_fetch_response
    extends StObject
       with ProjectNamespaceKeyFieldValue
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcStorageStorageMod.ProjectNamespaceKeyFieldValue
  inline def last_successful_fetch_response: last_successful_fetch_response = "last_successful_fetch_response".asInstanceOf[last_successful_fetch_response]
  
  @js.native
  sealed trait last_successful_fetch_timestamp_millis
    extends StObject
       with ProjectNamespaceKeyFieldValue
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcStorageStorageMod.ProjectNamespaceKeyFieldValue
  inline def last_successful_fetch_timestamp_millis: last_successful_fetch_timestamp_millis = "last_successful_fetch_timestamp_millis".asInstanceOf[last_successful_fetch_timestamp_millis]
  
  @js.native
  sealed trait `no-fetch-yet`
    extends StObject
       with FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.mod.FetchStatus
  inline def `no-fetch-yet`: `no-fetch-yet` = "no-fetch-yet".asInstanceOf[`no-fetch-yet`]
  
  @js.native
  sealed trait `registration-api-key`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `registration-api-key`: `registration-api-key` = "registration-api-key".asInstanceOf[`registration-api-key`]
  
  @js.native
  sealed trait `registration-app-id`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `registration-app-id`: `registration-app-id` = "registration-app-id".asInstanceOf[`registration-app-id`]
  
  @js.native
  sealed trait `registration-project-id`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `registration-project-id`: `registration-project-id` = "registration-project-id".asInstanceOf[`registration-project-id`]
  
  @js.native
  sealed trait `registration-window`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `registration-window`: `registration-window` = "registration-window".asInstanceOf[`registration-window`]
  
  @js.native
  sealed trait remote
    extends StObject
       with ValueSource
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.ValueSource
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.ValueSource
       with typingsJapgolly.firebaseRemoteConfig.mod.ValueSource
  inline def remote: remote = "remote".asInstanceOf[remote]
  
  @js.native
  sealed trait settings
    extends StObject
       with ProjectNamespaceKeyFieldValue
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcStorageStorageMod.ProjectNamespaceKeyFieldValue
  inline def settings: settings = "settings".asInstanceOf[settings]
  
  @js.native
  sealed trait silent
    extends StObject
       with LogLevel
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.LogLevel
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.LogLevel
       with typingsJapgolly.firebaseRemoteConfig.mod.LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait static
    extends StObject
       with ValueSource
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.ValueSource
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.ValueSource
       with typingsJapgolly.firebaseRemoteConfig.mod.ValueSource
  inline def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait `storage-delete`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `storage-delete`: `storage-delete` = "storage-delete".asInstanceOf[`storage-delete`]
  
  @js.native
  sealed trait `storage-get`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `storage-get`: `storage-get` = "storage-get".asInstanceOf[`storage-get`]
  
  @js.native
  sealed trait `storage-open`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `storage-open`: `storage-open` = "storage-open".asInstanceOf[`storage-open`]
  
  @js.native
  sealed trait `storage-set`
    extends StObject
       with ErrorCode
       with typingsJapgolly.firebaseRemoteConfig.distSrcErrorsMod.ErrorCode
  inline def `storage-set`: `storage-set` = "storage-set".asInstanceOf[`storage-set`]
  
  @js.native
  sealed trait success
    extends StObject
       with FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.mod.FetchStatus
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait throttle
    extends StObject
       with FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcPublicTypesMod.FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.distRemoteConfigMod.FetchStatus
       with typingsJapgolly.firebaseRemoteConfig.mod.FetchStatus
  inline def throttle: throttle = "throttle".asInstanceOf[throttle]
  
  @js.native
  sealed trait throttle_metadata
    extends StObject
       with ProjectNamespaceKeyFieldValue
       with typingsJapgolly.firebaseRemoteConfig.distEsmSrcStorageStorageMod.ProjectNamespaceKeyFieldValue
  inline def throttle_metadata: throttle_metadata = "throttle_metadata".asInstanceOf[throttle_metadata]
}
