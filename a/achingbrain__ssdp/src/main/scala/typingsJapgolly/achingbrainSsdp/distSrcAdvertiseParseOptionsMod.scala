package typingsJapgolly.achingbrainSsdp

import typingsJapgolly.achingbrainSsdp.distSrcAdvertiseMod.Advert
import typingsJapgolly.achingbrainSsdp.mod.Advertisment
import typingsJapgolly.achingbrainSsdp.mod.SSDP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAdvertiseParseOptionsMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/advertise/parse-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseAdvertOptions(ssdp: SSDP, options: Advertisment): Advert = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAdvertOptions")(ssdp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Advert]
}
