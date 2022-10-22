package typingsJapgolly.googleGax

import typingsJapgolly.googleGax.buildSrcApitypesMod.GRPCCall
import typingsJapgolly.googleGax.buildSrcApitypesMod.GaxCall
import typingsJapgolly.googleGax.buildSrcDescriptorMod.Descriptor
import typingsJapgolly.googleGax.buildSrcGaxMod.CallSettings
import typingsJapgolly.googleGax.googleGaxStrings.proto
import typingsJapgolly.googleGax.googleGaxStrings.rest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCreateApiCallMod {
  
  @JSImport("google-gax/build/src/createApiCall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, _fallback: proto | rest): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Unit, _fallback: Boolean): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(
    func: js.Promise[GRPCCall],
    settings: CallSettings,
    descriptor: Descriptor,
    _fallback: proto | rest
  ): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: js.Promise[GRPCCall], settings: CallSettings, descriptor: Descriptor, _fallback: Boolean): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, _fallback: proto | rest): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Unit, _fallback: Boolean): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, _fallback: proto | rest): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
  inline def createApiCall(func: GRPCCall, settings: CallSettings, descriptor: Descriptor, _fallback: Boolean): GaxCall = (^.asInstanceOf[js.Dynamic].applyDynamic("createApiCall")(func.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], _fallback.asInstanceOf[js.Any])).asInstanceOf[GaxCall]
}
