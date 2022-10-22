package typingsJapgolly.blobStream

import org.scalajs.dom.Blob
import typingsJapgolly.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): IBlobStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[IBlobStream]
  
  @JSImport("blob-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait IBlobStream
    extends StObject
       with WritableStream {
    
    def toBlob(): Blob = js.native
    def toBlob(`type`: String): Blob = js.native
    
    def toBlobURL(): String = js.native
    def toBlobURL(`type`: String): String = js.native
  }
}
