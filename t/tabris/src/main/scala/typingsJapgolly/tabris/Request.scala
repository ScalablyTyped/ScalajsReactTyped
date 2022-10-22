package typingsJapgolly.tabris

import typingsJapgolly.tabris.tabrisStrings.`force-cache`
import typingsJapgolly.tabris.tabrisStrings.`import`
import typingsJapgolly.tabris.tabrisStrings.`no-cache`
import typingsJapgolly.tabris.tabrisStrings.`no-cors`
import typingsJapgolly.tabris.tabrisStrings.`no-store`
import typingsJapgolly.tabris.tabrisStrings.`object`
import typingsJapgolly.tabris.tabrisStrings.`only-if-cached`
import typingsJapgolly.tabris.tabrisStrings.`same-origin`
import typingsJapgolly.tabris.tabrisStrings.audio
import typingsJapgolly.tabris.tabrisStrings.beacon
import typingsJapgolly.tabris.tabrisStrings.cors
import typingsJapgolly.tabris.tabrisStrings.cspreport
import typingsJapgolly.tabris.tabrisStrings.default
import typingsJapgolly.tabris.tabrisStrings.download
import typingsJapgolly.tabris.tabrisStrings.embed
import typingsJapgolly.tabris.tabrisStrings.eventsource
import typingsJapgolly.tabris.tabrisStrings.favicon
import typingsJapgolly.tabris.tabrisStrings.fetch
import typingsJapgolly.tabris.tabrisStrings.font
import typingsJapgolly.tabris.tabrisStrings.form
import typingsJapgolly.tabris.tabrisStrings.frame
import typingsJapgolly.tabris.tabrisStrings.hyperlink
import typingsJapgolly.tabris.tabrisStrings.iframe
import typingsJapgolly.tabris.tabrisStrings.image
import typingsJapgolly.tabris.tabrisStrings.imageset
import typingsJapgolly.tabris.tabrisStrings.include
import typingsJapgolly.tabris.tabrisStrings.internal
import typingsJapgolly.tabris.tabrisStrings.location
import typingsJapgolly.tabris.tabrisStrings.manifest
import typingsJapgolly.tabris.tabrisStrings.omit
import typingsJapgolly.tabris.tabrisStrings.ping
import typingsJapgolly.tabris.tabrisStrings.plugin
import typingsJapgolly.tabris.tabrisStrings.prefetch
import typingsJapgolly.tabris.tabrisStrings.reload
import typingsJapgolly.tabris.tabrisStrings.script
import typingsJapgolly.tabris.tabrisStrings.serviceworker
import typingsJapgolly.tabris.tabrisStrings.sharedworker
import typingsJapgolly.tabris.tabrisStrings.style
import typingsJapgolly.tabris.tabrisStrings.subresource
import typingsJapgolly.tabris.tabrisStrings.track
import typingsJapgolly.tabris.tabrisStrings.video
import typingsJapgolly.tabris.tabrisStrings.worker
import typingsJapgolly.tabris.tabrisStrings.xmlhttprequest
import typingsJapgolly.tabris.tabrisStrings.xslt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Request
/**
  * Represents an HTTP Request as used by `fetch()`.
  */
@js.native
trait Request extends StObject {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def blob(): js.Promise[Blob] = js.native
  
  val bodyUsed: Boolean = js.native
  
  val cache: default | `force-cache` | `no-cache` | `no-store` | `only-if-cached` | reload = js.native
  
  val context: audio | beacon | cspreport | download | embed | eventsource | favicon | fetch | font | form | frame | hyperlink | iframe | image | imageset | `import` | internal | location | manifest | `object` | ping | plugin | prefetch | script | serviceworker | sharedworker | style | subresource | track | video | worker | xmlhttprequest | xslt = js.native
  
  val credentials: include | omit | `same-origin` = js.native
  
  val headers: Headers = js.native
  
  def json(): js.Promise[Any] = js.native
  @JSName("json")
  def json_T[T](): js.Promise[T] = js.native
  
  val method: String = js.native
  
  val mode: cors | `no-cors` | `same-origin` = js.native
  
  val referrer: String = js.native
  
  def text(): js.Promise[String] = js.native
  
  val url: String = js.native
}
