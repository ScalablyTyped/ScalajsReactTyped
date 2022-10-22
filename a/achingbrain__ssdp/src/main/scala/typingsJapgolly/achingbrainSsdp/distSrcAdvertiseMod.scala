package typingsJapgolly.achingbrainSsdp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.achingbrainSsdp.distSrcAdvertsMod.CachedAdvert
import typingsJapgolly.achingbrainSsdp.mod.Advertisment
import typingsJapgolly.achingbrainSsdp.mod.SSDP
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAdvertiseMod {
  
  @JSImport("@achingbrain/ssdp/dist/src/advertise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def advertise(ssdp: SSDP, options: Advertisment): js.Promise[CachedAdvert] = (^.asInstanceOf[js.Dynamic].applyDynamic("advertise")(ssdp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CachedAdvert]]
  
  trait Advert extends StObject {
    
    def details(): js.Promise[Any]
    
    var interval: Double
    
    var ipv4: Boolean
    
    var ipv6: Boolean
    
    var location: Record[String, String]
    
    var ttl: Double
    
    var usn: String
  }
  object Advert {
    
    inline def apply(
      details: CallbackTo[js.Promise[Any]],
      interval: Double,
      ipv4: Boolean,
      ipv6: Boolean,
      location: Record[String, String],
      ttl: Double,
      usn: String
    ): Advert = {
      val __obj = js.Dynamic.literal(details = details.toJsFn, interval = interval.asInstanceOf[js.Any], ipv4 = ipv4.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], usn = usn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Advert]
    }
    
    extension [Self <: Advert](x: Self) {
      
      inline def setDetails(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "details", value.toJsFn)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIpv4(value: Boolean): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      inline def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Record[String, String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setUsn(value: String): Self = StObject.set(x, "usn", value.asInstanceOf[js.Any])
    }
  }
}
