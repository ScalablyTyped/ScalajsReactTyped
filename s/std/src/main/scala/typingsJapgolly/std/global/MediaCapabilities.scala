package typingsJapgolly.std.global

import typingsJapgolly.std.MediaCapabilitiesDecodingInfo
import typingsJapgolly.std.MediaCapabilitiesEncodingInfo
import typingsJapgolly.std.MediaDecodingConfiguration
import typingsJapgolly.std.MediaEncodingConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaCapabilities")
@js.native
/* standard dom */
open class MediaCapabilities ()
  extends StObject
     with typingsJapgolly.std.MediaCapabilities {
  
  /* standard dom */
  /* CompleteClass */
  override def decodingInfo(configuration: MediaDecodingConfiguration): js.Promise[MediaCapabilitiesDecodingInfo] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def encodingInfo(configuration: MediaEncodingConfiguration): js.Promise[MediaCapabilitiesEncodingInfo] = js.native
}
