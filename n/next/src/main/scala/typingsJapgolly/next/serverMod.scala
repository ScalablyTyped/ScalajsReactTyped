package typingsJapgolly.next

import org.scalajs.dom.URL
import typingsJapgolly.next.`distCompiled@edgeRuntimePrimitivesUrlMod`.URLPatternInput
import typingsJapgolly.next.anon.HeadersHeaders
import typingsJapgolly.next.anon.Request
import typingsJapgolly.next.distServerWebNextUrlMod.NextURL
import typingsJapgolly.next.distServerWebSpecExtensionRequestMod.RequestInit
import typingsJapgolly.next.distServerWebSpecExtensionResponseMod.ResponseInit
import typingsJapgolly.next.distServerWebSpecExtensionUserAgentMod.UserAgent_
import typingsJapgolly.std.BodyInit
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("next/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/server", "NextFetchEvent")
  @js.native
  open class NextFetchEvent protected ()
    extends typingsJapgolly.next.distServerWebSpecExtensionFetchEventMod.NextFetchEvent {
    def this(params: Request) = this()
  }
  
  @JSImport("next/server", "NextRequest")
  @js.native
  open class NextRequest protected ()
    extends typingsJapgolly.next.distServerWebSpecExtensionRequestMod.NextRequest {
    def this(input: URL) = this()
    def this(input: RequestInfo) = this()
    def this(input: URL, init: RequestInit) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @JSImport("next/server", "NextResponse")
  @js.native
  open class NextResponse ()
    extends typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse {
    def this(body: BodyInit) = this()
    def this(body: Null, init: ResponseInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  /* static members */
  object NextResponse {
    
    @JSImport("next/server", "NextResponse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def json(body: Any): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(body.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def json(body: Any, init: ResponseInit): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(body.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    
    inline def next(): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def next(init: ResponseInit): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(init.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    
    inline def redirect(url: String): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: String, init: Double): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: String, init: ResponseInit): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: URL): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: URL, init: Double): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: URL, init: ResponseInit): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: NextURL): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: NextURL, init: Double): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def redirect(url: NextURL, init: ResponseInit): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    
    inline def rewrite(destination: String): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: String, init: ResponseInit): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: URL): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: URL, init: ResponseInit): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: NextURL): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
    inline def rewrite(destination: NextURL, init: ResponseInit): typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("rewrite")(destination.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.next.distServerWebSpecExtensionResponseMod.NextResponse]
  }
  
  @JSImport("next/server", "URLPattern")
  @js.native
  open class URLPattern () extends StObject {
    def this(init: URLPatternInput) = this()
    def this(init: Unit, baseURL: String) = this()
    def this(init: URLPatternInput, baseURL: String) = this()
  }
  
  inline def userAgent(hasHeaders: HeadersHeaders): UserAgent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgent")(hasHeaders.asInstanceOf[js.Any]).asInstanceOf[UserAgent_]
  
  inline def userAgentFromString(): UserAgent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentFromString")().asInstanceOf[UserAgent_]
  inline def userAgentFromString(input: String): UserAgent_ = ^.asInstanceOf[js.Dynamic].applyDynamic("userAgentFromString")(input.asInstanceOf[js.Any]).asInstanceOf[UserAgent_]
}
