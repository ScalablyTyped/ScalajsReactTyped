package typingsJapgolly.awsSdk

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/cloudfront", JSImport.Namespace)
@js.native
object servicesCloudfrontMod extends js.Object {
  @js.native
  class CloudFrontCustomizations () extends Service
  
  /* static members */
  @js.native
  object CloudFrontCustomizations extends js.Object {
    var Signer: Instantiable2[
        /* keyPairId */ String, 
        /* privateKey */ String, 
        typingsJapgolly.awsSdk.cloudfrontSignerMod.Signer
      ] = js.native
  }
  
}

