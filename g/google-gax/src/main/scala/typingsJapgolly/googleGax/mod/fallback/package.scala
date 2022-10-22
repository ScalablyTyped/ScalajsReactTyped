package typingsJapgolly.googleGax.mod.fallback

import typingsJapgolly.googleGax.buildSrcApitypesMod.GRPCCall
import typingsJapgolly.googleGax.buildSrcApitypesMod.GaxCall
import typingsJapgolly.googleGax.buildSrcDescriptorMod.Descriptor
import typingsJapgolly.googleGax.buildSrcGaxMod.BackoffSettings
import typingsJapgolly.googleGax.buildSrcGaxMod.CallOptions
import typingsJapgolly.googleGax.buildSrcGaxMod.ClientConfig
import typingsJapgolly.googleGax.buildSrcGrpcMod.GrpcClientOptions
import typingsJapgolly.googleGax.buildSrcLongRunningCallsLongRunningDescriptorMod.LongRunningDescriptor
import typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.LROOperation
import typingsJapgolly.googleGax.buildSrcOperationsClientMod.OperationsClientBuilder
import typingsJapgolly.googleGax.googleGaxStrings.proto
import typingsJapgolly.googleGax.googleGaxStrings.rest
import typingsJapgolly.googleGax.mod.fallback.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def constructSettings(
  serviceName: String,
  clientConfig: ClientConfig,
  configOverrides: ClientConfig,
  retryNames: js.Object
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def constructSettings(
  serviceName: String,
  clientConfig: ClientConfig,
  configOverrides: ClientConfig,
  retryNames: js.Object,
  otherArgs: js.Object
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("constructSettings")(serviceName.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any], configOverrides.asInstanceOf[js.Any], retryNames.asInstanceOf[js.Any], otherArgs.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def createApiCall(func: js.Promise[GRPCCall], settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: js.Promise[GRPCCall],
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(func: GRPCCall, settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Unit,
  fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  fallback: proto | rest
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
inline def createApiCall(
  func: GRPCCall,
  settings: typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings,
  descriptor: Descriptor,
  fallback: Boolean
): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]

inline def createDefaultBackoffSettings(): BackoffSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultBackoffSettings")().asInstanceOf[BackoffSettings]

inline def fallback: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("fallback").asInstanceOf[Any]

inline def lro(options: GrpcClientOptions): OperationsClientBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("lro")(options.asInstanceOf[js.Any]).asInstanceOf[OperationsClientBuilder]

inline def operation(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_]
inline def operation(
  op: LROOperation,
  longrunningDescriptor: LongRunningDescriptor,
  backoffSettings: BackoffSettings,
  callOptions: CallOptions
): typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("operation")(op.asInstanceOf[js.Any], longrunningDescriptor.asInstanceOf[js.Any], backoffSettings.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleGax.buildSrcLongRunningCallsLongrunningMod.Operation_]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def warn(code: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def warn(code: String, message: String, warnType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], warnType.asInstanceOf[js.Any])).asInstanceOf[Unit]
