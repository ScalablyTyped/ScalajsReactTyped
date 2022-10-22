package typingsJapgolly.awsCrt

import typingsJapgolly.node.anon.Fatal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativePolyfillsMod {
  
  @JSImport("aws-crt/dist/native/polyfills", "TextDecoder")
  @js.native
  open class TextDecoder ()
    extends typingsJapgolly.node.utilMod.TextDecoder {
    def this(encoding: String) = this()
    def this(encoding: String, options: Fatal) = this()
    def this(encoding: Unit, options: Fatal) = this()
  }
  
  @JSImport("aws-crt/dist/native/polyfills", "TextEncoder")
  @js.native
  open class TextEncoder ()
    extends typingsJapgolly.node.utilMod.TextEncoder
}
