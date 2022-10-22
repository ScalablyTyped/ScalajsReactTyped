package typingsJapgolly.base64Stream

import typingsJapgolly.base64Stream.anon.TransformOptionsoutputEnc
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64-stream", "Base64Decode")
  @js.native
  open class Base64Decode () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("base64-stream", "Base64Encode")
  @js.native
  open class Base64Encode () extends Transform {
    def this(options: TransformOptionsoutputEnc) = this()
  }
}
