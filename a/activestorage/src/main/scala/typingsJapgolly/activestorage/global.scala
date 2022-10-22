package typingsJapgolly.activestorage

import org.scalajs.dom.File
import typingsJapgolly.activestorage.mod.DirectUploadDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ActiveStorage {
    
    @JSGlobal("ActiveStorage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ActiveStorage.DirectUpload")
    @js.native
    open class DirectUpload protected ()
      extends typingsJapgolly.activestorage.mod.DirectUpload {
      def this(file: File, url: String) = this()
      def this(file: File, url: String, delegate: DirectUploadDelegate) = this()
    }
    
    inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
  }
}
