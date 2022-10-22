package typingsJapgolly.unzip

import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.PassThrough
import typingsJapgolly.unzip.anon.Path
import typingsJapgolly.unzip.unzipStrings.Directory
import typingsJapgolly.unzip.unzipStrings.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unzip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Extract(options: Path): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Extract")(options.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  
  inline def Parse(): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")().asInstanceOf[WritableStream]
  
  @js.native
  trait Entry extends PassThrough {
    
    def autodrain(): Unit = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    var `type`: Directory | File = js.native
  }
}
