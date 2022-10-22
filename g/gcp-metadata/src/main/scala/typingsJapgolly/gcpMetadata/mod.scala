package typingsJapgolly.gcpMetadata

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gcpMetadata.gcpMetadataStrings.Google
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gcp-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gcp-metadata", "BASE_PATH")
  @js.native
  val BASE_PATH: /* "/computeMetadata/v1" */ String = js.native
  
  /* Inlined std.Readonly<{  Metadata-Flavor :'Google'}> */
  object HEADERS {
    
    @JSImport("gcp-metadata", "HEADERS.Metadata-Flavor")
    @js.native
    val MetadataFlavor: Google = js.native
  }
  
  @JSImport("gcp-metadata", "HEADER_NAME")
  @js.native
  val HEADER_NAME: /* "Metadata-Flavor" */ String = js.native
  
  @JSImport("gcp-metadata", "HEADER_VALUE")
  @js.native
  val HEADER_VALUE: /* "Google" */ String = js.native
  
  @JSImport("gcp-metadata", "HOST_ADDRESS")
  @js.native
  val HOST_ADDRESS: /* "http://169.254.169.254" */ String = js.native
  
  @JSImport("gcp-metadata", "SECONDARY_HOST_ADDRESS")
  @js.native
  val SECONDARY_HOST_ADDRESS: /* "http://metadata.google.internal." */ String = js.native
  
  inline def instance[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[js.Promise[T]]
  inline def instance[T](options: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def instance[T](options: Options): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def isAvailable(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[js.Promise[Boolean]]
  
  inline def project[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("project")().asInstanceOf[js.Promise[T]]
  inline def project[T](options: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("project")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def project[T](options: Options): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("project")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def requestTimeout(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("requestTimeout")().asInstanceOf[Double]
  
  inline def resetIsAvailableCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIsAvailableCache")().asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var params: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    }
  }
}
