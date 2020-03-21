package typingsJapgolly.xhrMock

import typingsJapgolly.xhrMock.mockXMLHttpRequestEventTargetMod.MockXMLHttpRequestEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockXMLHttpRequestUpload", JSImport.Namespace)
@js.native
object mockXMLHttpRequestUploadMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.std.EventTarget because Already inherited
  - typingsJapgolly.std.XMLHttpRequestEventTarget because Already inherited
  - typingsJapgolly.std.XMLHttpRequestUpload because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined  */ @js.native
  trait MockXMLHttpRequestUpload extends MockXMLHttpRequestEventTarget
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.std.EventTarget because Already inherited
  - typingsJapgolly.std.XMLHttpRequestEventTarget because Already inherited
  - typingsJapgolly.std.XMLHttpRequestUpload because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined  */ @js.native
  class default () extends MockXMLHttpRequestEventTarget
  
}

