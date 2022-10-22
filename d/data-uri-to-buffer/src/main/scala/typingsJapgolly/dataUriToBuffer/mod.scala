package typingsJapgolly.dataUriToBuffer

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("data-uri-to-buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(uri: String): MimeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any]).asInstanceOf[MimeBuffer]
  
  inline def dataUriToBuffer(uri: String): MimeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("dataUriToBuffer")(uri.asInstanceOf[js.Any]).asInstanceOf[MimeBuffer]
  
  @js.native
  trait MimeBuffer
    extends StObject
       with Buffer {
    
    var charset: String = js.native
    
    var `type`: String = js.native
    
    var typeFull: String = js.native
  }
}
