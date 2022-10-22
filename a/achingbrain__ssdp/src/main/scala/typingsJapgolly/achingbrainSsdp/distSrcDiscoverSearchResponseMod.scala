package typingsJapgolly.achingbrainSsdp

import typingsJapgolly.achingbrainSsdp.mod.SSDP
import typingsJapgolly.achingbrainSsdp.mod.SearchMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDiscoverSearchResponseMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/discover/search-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def searchResponse(ssdp: SSDP, message: SearchMessage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("searchResponse")(ssdp.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
