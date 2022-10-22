package typingsJapgolly.xhrMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockXMLHttpRequestUploadMod {
  
  @JSImport("xhr-mock/lib/MockXMLHttpRequestUpload", JSImport.Default)
  @js.native
  open class default () extends MockXMLHttpRequestUpload
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.std.EventTarget because Already inherited
  - typingsJapgolly.std.XMLHttpRequestEventTarget because Already inherited
  - typingsJapgolly.std.XMLHttpRequestUpload because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined  */ @js.native
  trait MockXMLHttpRequestUpload
    extends typingsJapgolly.xhrMock.libMockXMLHttpRequestEventTargetMod.default
}
