package typingsJapgolly.guacamoleClient

import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0000`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0100`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0200`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0201`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0202`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0203`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0204`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0205`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0206`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0207`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0208`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0209`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x020a`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x020b`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0300`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0301`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0303`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0308`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x030d`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x030f`
import typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x031d`
import typingsJapgolly.guacamoleClient.libStatusMod.Status.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatusMod {
  
  @JSImport("guacamole-client/lib/Status", "Status")
  @js.native
  open class Status protected () extends StObject {
    /**
      * @param code The Guacamole status code, as defined by Guacamole.Status.Code.
      * @param [message] An optional human-readable message.
      */
    def this(code: Code) = this()
    def this(code: Code, message: String) = this()
    
    /**
      * The Guacamole status code.
      * @see Guacamole.Status.Code
      */
    var code: Code = js.native
    
    /**
      * Returns whether this status represents an error.
      * @returns true if this status represents an error, false otherwise.
      */
    def isError(): Boolean = js.native
    
    /**
      * An arbitrary human-readable message associated with this status, if any.
      * The human-readable message is not required, and is generally provided
      * for debugging purposes only. For user feedback, it is better to translate
      * the Guacamole status code into a message.
      */
    var message: js.UndefOr[String] = js.native
  }
  object Status {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x031d`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0200`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0301`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x020a`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0201`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0303`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x020b`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0207`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0206`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x030d`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0205`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0308`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0203`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0204`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0209`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0208`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0100`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x030f`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0300`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0000`
      - typingsJapgolly.guacamoleClient.guacamoleClientInts.`0x0202`
    */
    trait Code extends StObject
    /* Inlined guacamole-client.guacamole-client/lib/Status.Status.StatusCode & std.Readonly<{fromHTTPCode (status : number): guacamole-client.guacamole-client/lib/Status.Status.Code, fromWebSocketCode (code : number): guacamole-client.guacamole-client/lib/Status.Status.Code}> */
    object Code {
      
      @JSImport("guacamole-client/lib/Status", "Status.Code")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_BAD_REQUEST")
      @js.native
      val CLIENT_BAD_REQUEST: `0x0300` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_BAD_TYPE")
      @js.native
      val CLIENT_BAD_TYPE: `0x030f` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_FORBIDDEN")
      @js.native
      val CLIENT_FORBIDDEN: `0x0303` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_OVERRUN")
      @js.native
      val CLIENT_OVERRUN: `0x030d` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_TIMEOUT")
      @js.native
      val CLIENT_TIMEOUT: `0x0308` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_TOO_MANY")
      @js.native
      val CLIENT_TOO_MANY: `0x031d` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_UNAUTHORIZED")
      @js.native
      val CLIENT_UNAUTHORIZED: `0x0301` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.RESOURCE_CLOSED")
      @js.native
      val RESOURCE_CLOSED: `0x0206` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.RESOURCE_CONFLICT")
      @js.native
      val RESOURCE_CONFLICT: `0x0205` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.RESOURCE_NOT_FOUND")
      @js.native
      val RESOURCE_NOT_FOUND: `0x0204` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SERVER_BUSY")
      @js.native
      val SERVER_BUSY: `0x0201` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SERVER_ERROR")
      @js.native
      val SERVER_ERROR: `0x0200` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SESSION_CLOSED")
      @js.native
      val SESSION_CLOSED: `0x020b` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SESSION_CONFLICT")
      @js.native
      val SESSION_CONFLICT: `0x0209` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SESSION_TIMEOUT")
      @js.native
      val SESSION_TIMEOUT: `0x020a` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SUCCESS")
      @js.native
      val SUCCESS: `0x0000` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UNSUPPORTED")
      @js.native
      val UNSUPPORTED: `0x0100` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UPSTREAM_ERROR")
      @js.native
      val UPSTREAM_ERROR: `0x0203` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UPSTREAM_NOT_FOUND")
      @js.native
      val UPSTREAM_NOT_FOUND: `0x0207` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UPSTREAM_TIMEOUT")
      @js.native
      val UPSTREAM_TIMEOUT: `0x0202` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UPSTREAM_UNAVAILABLE")
      @js.native
      val UPSTREAM_UNAVAILABLE: `0x0208` = js.native
      
      inline def fromHTTPCode(status: Double): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTTPCode")(status.asInstanceOf[js.Any]).asInstanceOf[Code]
      
      inline def fromWebSocketCode(code: Double): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocketCode")(code.asInstanceOf[js.Any]).asInstanceOf[Code]
    }
    
    /* Inlined std.Readonly<{  SUCCESS :0x0000,   UNSUPPORTED :0x0100,   SERVER_ERROR :0x0200,   SERVER_BUSY :0x0201,   UPSTREAM_TIMEOUT :0x0202,   UPSTREAM_ERROR :0x0203,   RESOURCE_NOT_FOUND :0x0204,   RESOURCE_CONFLICT :0x0205,   RESOURCE_CLOSED :0x0206,   UPSTREAM_NOT_FOUND :0x0207,   UPSTREAM_UNAVAILABLE :0x0208,   SESSION_CONFLICT :0x0209,   SESSION_TIMEOUT :0x020a,   SESSION_CLOSED :0x020b,   CLIENT_BAD_REQUEST :0x0300,   CLIENT_UNAUTHORIZED :0x0301,   CLIENT_FORBIDDEN :0x0303,   CLIENT_TIMEOUT :0x0308,   CLIENT_OVERRUN :0x030d,   CLIENT_BAD_TYPE :0x030f,   CLIENT_TOO_MANY :0x031d}> */
    trait StatusCode extends StObject {
      
      val CLIENT_BAD_REQUEST: `0x0300`
      
      val CLIENT_BAD_TYPE: `0x030f`
      
      val CLIENT_FORBIDDEN: `0x0303`
      
      val CLIENT_OVERRUN: `0x030d`
      
      val CLIENT_TIMEOUT: `0x0308`
      
      val CLIENT_TOO_MANY: `0x031d`
      
      val CLIENT_UNAUTHORIZED: `0x0301`
      
      val RESOURCE_CLOSED: `0x0206`
      
      val RESOURCE_CONFLICT: `0x0205`
      
      val RESOURCE_NOT_FOUND: `0x0204`
      
      val SERVER_BUSY: `0x0201`
      
      val SERVER_ERROR: `0x0200`
      
      val SESSION_CLOSED: `0x020b`
      
      val SESSION_CONFLICT: `0x0209`
      
      val SESSION_TIMEOUT: `0x020a`
      
      val SUCCESS: `0x0000`
      
      val UNSUPPORTED: `0x0100`
      
      val UPSTREAM_ERROR: `0x0203`
      
      val UPSTREAM_NOT_FOUND: `0x0207`
      
      val UPSTREAM_TIMEOUT: `0x0202`
      
      val UPSTREAM_UNAVAILABLE: `0x0208`
    }
    object StatusCode {
      
      inline def apply(): StatusCode = {
        val __obj = js.Dynamic.literal(CLIENT_BAD_REQUEST = 0x0300, CLIENT_BAD_TYPE = 0x030f, CLIENT_FORBIDDEN = 0x0303, CLIENT_OVERRUN = 0x030d, CLIENT_TIMEOUT = 0x0308, CLIENT_TOO_MANY = 0x031d, CLIENT_UNAUTHORIZED = 0x0301, RESOURCE_CLOSED = 0x0206, RESOURCE_CONFLICT = 0x0205, RESOURCE_NOT_FOUND = 0x0204, SERVER_BUSY = 0x0201, SERVER_ERROR = 0x0200, SESSION_CLOSED = 0x020b, SESSION_CONFLICT = 0x0209, SESSION_TIMEOUT = 0x020a, SUCCESS = 0x0000, UNSUPPORTED = 0x0100, UPSTREAM_ERROR = 0x0203, UPSTREAM_NOT_FOUND = 0x0207, UPSTREAM_TIMEOUT = 0x0202, UPSTREAM_UNAVAILABLE = 0x0208)
        __obj.asInstanceOf[StatusCode]
      }
      
      extension [Self <: StatusCode](x: Self) {
        
        inline def setCLIENT_BAD_REQUEST(value: `0x0300`): Self = StObject.set(x, "CLIENT_BAD_REQUEST", value.asInstanceOf[js.Any])
        
        inline def setCLIENT_BAD_TYPE(value: `0x030f`): Self = StObject.set(x, "CLIENT_BAD_TYPE", value.asInstanceOf[js.Any])
        
        inline def setCLIENT_FORBIDDEN(value: `0x0303`): Self = StObject.set(x, "CLIENT_FORBIDDEN", value.asInstanceOf[js.Any])
        
        inline def setCLIENT_OVERRUN(value: `0x030d`): Self = StObject.set(x, "CLIENT_OVERRUN", value.asInstanceOf[js.Any])
        
        inline def setCLIENT_TIMEOUT(value: `0x0308`): Self = StObject.set(x, "CLIENT_TIMEOUT", value.asInstanceOf[js.Any])
        
        inline def setCLIENT_TOO_MANY(value: `0x031d`): Self = StObject.set(x, "CLIENT_TOO_MANY", value.asInstanceOf[js.Any])
        
        inline def setCLIENT_UNAUTHORIZED(value: `0x0301`): Self = StObject.set(x, "CLIENT_UNAUTHORIZED", value.asInstanceOf[js.Any])
        
        inline def setRESOURCE_CLOSED(value: `0x0206`): Self = StObject.set(x, "RESOURCE_CLOSED", value.asInstanceOf[js.Any])
        
        inline def setRESOURCE_CONFLICT(value: `0x0205`): Self = StObject.set(x, "RESOURCE_CONFLICT", value.asInstanceOf[js.Any])
        
        inline def setRESOURCE_NOT_FOUND(value: `0x0204`): Self = StObject.set(x, "RESOURCE_NOT_FOUND", value.asInstanceOf[js.Any])
        
        inline def setSERVER_BUSY(value: `0x0201`): Self = StObject.set(x, "SERVER_BUSY", value.asInstanceOf[js.Any])
        
        inline def setSERVER_ERROR(value: `0x0200`): Self = StObject.set(x, "SERVER_ERROR", value.asInstanceOf[js.Any])
        
        inline def setSESSION_CLOSED(value: `0x020b`): Self = StObject.set(x, "SESSION_CLOSED", value.asInstanceOf[js.Any])
        
        inline def setSESSION_CONFLICT(value: `0x0209`): Self = StObject.set(x, "SESSION_CONFLICT", value.asInstanceOf[js.Any])
        
        inline def setSESSION_TIMEOUT(value: `0x020a`): Self = StObject.set(x, "SESSION_TIMEOUT", value.asInstanceOf[js.Any])
        
        inline def setSUCCESS(value: `0x0000`): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
        
        inline def setUNSUPPORTED(value: `0x0100`): Self = StObject.set(x, "UNSUPPORTED", value.asInstanceOf[js.Any])
        
        inline def setUPSTREAM_ERROR(value: `0x0203`): Self = StObject.set(x, "UPSTREAM_ERROR", value.asInstanceOf[js.Any])
        
        inline def setUPSTREAM_NOT_FOUND(value: `0x0207`): Self = StObject.set(x, "UPSTREAM_NOT_FOUND", value.asInstanceOf[js.Any])
        
        inline def setUPSTREAM_TIMEOUT(value: `0x0202`): Self = StObject.set(x, "UPSTREAM_TIMEOUT", value.asInstanceOf[js.Any])
        
        inline def setUPSTREAM_UNAVAILABLE(value: `0x0208`): Self = StObject.set(x, "UPSTREAM_UNAVAILABLE", value.asInstanceOf[js.Any])
      }
    }
  }
}
