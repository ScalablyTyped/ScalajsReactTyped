package typingsJapgolly.matrixAppserviceBridge

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.matrixAppserviceBridge.anon.Errcode
import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProvisioningErrorsMod {
  
  @JSImport("matrix-appservice-bridge/lib/provisioning/errors", "ApiError")
  @js.native
  open class ApiError protected ()
    extends StObject
       with Error
       with IApiError {
    def this(error: String) = this()
    def this(error: String, errcode: ErrCode) = this()
    def this(error: String, errcode: Unit, statusCode: Double) = this()
    def this(error: String, errcode: ErrCode, statusCode: Double) = this()
    def this(error: String, errcode: Unit, statusCode: Double, additionalContent: Record[String, Any]) = this()
    def this(error: String, errcode: Unit, statusCode: Unit, additionalContent: Record[String, Any]) = this()
    def this(error: String, errcode: ErrCode, statusCode: Double, additionalContent: Record[String, Any]) = this()
    def this(error: String, errcode: ErrCode, statusCode: Unit, additionalContent: Record[String, Any]) = this()
    
    val additionalContent: Record[String, Any] = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(response: Response_[Any, Record[String, Any]]): Unit = js.native
    
    /* CompleteClass */
    override val errcode: String = js.native
    @JSName("errcode")
    val errcode_ApiError: ErrCode = js.native
    
    /* CompleteClass */
    override val error: String = js.native
    
    def jsonBody: Errcode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override val statusCode: Double = js.native
  }
  
  @js.native
  sealed trait ErrCode extends StObject
  @JSImport("matrix-appservice-bridge/lib/provisioning/errors", "ErrCode")
  @js.native
  object ErrCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrCode & String] = js.native
    
    /**
      * Couldn't complete the openId process.
      */
    @js.native
    sealed trait BadOpenID
      extends StObject
         with ErrCode
    /* "M_AS_BAD_OPENID" */ val BadOpenID: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.BadOpenID & String = js.native
    
    /**
      * The secret token provided to the API was invalid or not given.
      */
    @js.native
    sealed trait BadToken
      extends StObject
         with ErrCode
    /* "M_AS_BAD_TOKEN" */ val BadToken: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.BadToken & String = js.native
    
    /**
      * A bad value was given to the API.
      */
    @js.native
    sealed trait BadValue
      extends StObject
         with ErrCode
    /* "M_AS_BAD_VALUE" */ val BadValue: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.BadValue & String = js.native
    
    /**
      * The requested feature is not enabled in the bridge.
      */
    @js.native
    sealed trait DisabledFeature
      extends StObject
         with ErrCode
    /* "M_AS_DISABLED_FEATURE" */ val DisabledFeature: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.DisabledFeature & String = js.native
    
    @js.native
    sealed trait Ratelimited
      extends StObject
         with ErrCode
    /* "M_AS_LIMIT_EXCEEDED" */ val Ratelimited: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.Ratelimited & String = js.native
    
    /**
      * Generic failure, unknown reason
      */
    @js.native
    sealed trait Unknown
      extends StObject
         with ErrCode
    /* "M_AS_UNKNOWN" */ val Unknown: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.Unknown & String = js.native
    
    /**
      * The operation was not supported by this connection
      */
    @js.native
    sealed trait UnsupportedOperation
      extends StObject
         with ErrCode
    /* "M_AS_UNSUPPORTED_OPERATION" */ val UnsupportedOperation: typingsJapgolly.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode.UnsupportedOperation & String = js.native
  }
  
  trait IApiError extends StObject {
    
    @JSName("apply")
    def apply(response: Response_[Any, Record[String, Any]]): Unit
    
    val errcode: String
    
    val error: String
    
    val statusCode: Double
  }
  object IApiError {
    
    inline def apply(
      apply: Response_[Any, Record[String, Any]] => Callback,
      errcode: String,
      error: String,
      statusCode: Double
    ): IApiError = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Response_[Any, Record[String, Any]]) => apply(t0).runNow()), errcode = errcode.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IApiError]
    }
    
    extension [Self <: IApiError](x: Self) {
      
      inline def setApply(value: Response_[Any, Record[String, Any]] => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Response_[Any, Record[String, Any]]) => value(t0).runNow()))
      
      inline def setErrcode(value: String): Self = StObject.set(x, "errcode", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
