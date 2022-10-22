package typingsJapgolly.domMediacaptureRecord

import org.scalajs.dom.Blob
import typingsJapgolly.std.DOMHighResTimeStamp
import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobEvent
  extends StObject
     with Event {
  
  val data: Blob = js.native
  
  val timecode: DOMHighResTimeStamp = js.native
}
