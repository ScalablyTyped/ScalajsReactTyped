package typingsJapgolly.matrixAppserviceBridge

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.matrixAppserviceBridge.libProvisioningApiMod.ProvisioningApiOpts
import typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode
import typingsJapgolly.matrixAppserviceBridge.libProvisioningStoreMod.ProvisioningStore
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.provisioner
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.widget
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProvisioningMod {
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "ApiError")
  @js.native
  open class ApiError protected ()
    extends typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ApiError {
    def this(error: String) = this()
    def this(error: String, errcode: ErrCode) = this()
    def this(error: String, errcode: Unit, statusCode: Double) = this()
    def this(error: String, errcode: ErrCode, statusCode: Double) = this()
    def this(error: String, errcode: Unit, statusCode: Double, additionalContent: Record[String, Any]) = this()
    def this(error: String, errcode: Unit, statusCode: Unit, additionalContent: Record[String, Any]) = this()
    def this(error: String, errcode: ErrCode, statusCode: Double, additionalContent: Record[String, Any]) = this()
    def this(error: String, errcode: ErrCode, statusCode: Unit, additionalContent: Record[String, Any]) = this()
  }
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "DefaultDisallowedIpRanges")
  @js.native
  val DefaultDisallowedIpRanges: js.Array[String] = js.native
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "ErrCode")
  @js.native
  object ErrCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode & String] = js.native
    
    /* "M_AS_BAD_OPENID" */ val BadOpenID: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.BadOpenID & String = js.native
    
    /* "M_AS_BAD_TOKEN" */ val BadToken: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.BadToken & String = js.native
    
    /* "M_AS_BAD_VALUE" */ val BadValue: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.BadValue & String = js.native
    
    /* "M_AS_DISABLED_FEATURE" */ val DisabledFeature: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.DisabledFeature & String = js.native
    
    /* "M_AS_LIMIT_EXCEEDED" */ val Ratelimited: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.Ratelimited & String = js.native
    
    /* "M_AS_UNKNOWN" */ val Unknown: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.Unknown & String = js.native
    
    /* "M_AS_UNSUPPORTED_OPERATION" */ val UnsupportedOperation: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.UnsupportedOperation & String = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "MemoryProvisioningStore")
  @js.native
  open class MemoryProvisioningStore ()
    extends typingsJapgolly.matrixAppserviceBridge.libProvisioningStoreMod.MemoryProvisioningStore
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "ProvisioningApi")
  @js.native
  open class ProvisioningApi protected ()
    extends typingsJapgolly.matrixAppserviceBridge.libProvisioningApiMod.ProvisioningApi {
    def this(store: ProvisioningStore) = this()
    def this(store: ProvisioningStore, opts: ProvisioningApiOpts) = this()
  }
  
  @JSImport("matrix-appservice-bridge/lib/provisioning", "ProvisioningRequest")
  @js.native
  open class ProvisioningRequest[Params, ResBody, ReqBody, ReqQuery] protected ()
    extends typingsJapgolly.matrixAppserviceBridge.libProvisioningRequestMod.ProvisioningRequest[Params, ResBody, ReqBody, ReqQuery] {
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner,
      widgetToken: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner,
      widgetToken: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner,
      widgetToken: String,
      fnName: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner,
      widgetToken: Unit,
      fnName: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner,
      widgetToken: String,
      fnName: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner,
      widgetToken: Unit,
      fnName: String
    ) = this()
  }
}
