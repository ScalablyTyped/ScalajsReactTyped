package typingsJapgolly.ibmCloudSdkCore

import org.scalajs.dom.File
import typingsJapgolly.ibmCloudSdkCore.esLibHelperMod.FileObject
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLibContentTypeMod {
  
  object default {
    
    @JSImport("ibm-cloud-sdk-core/es/lib/content-type", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromFilename(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: FileObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: ReadableStream): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fromHeader(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeader")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
