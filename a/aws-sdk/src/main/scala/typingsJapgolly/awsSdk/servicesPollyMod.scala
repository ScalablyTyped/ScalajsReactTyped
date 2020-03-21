package typingsJapgolly.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.awsSdk.presignerMod.Presigner.PresignerOptions
import typingsJapgolly.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/services/polly", JSImport.Namespace)
@js.native
object servicesPollyMod extends js.Object {
  @js.native
  class PollyCustomizations () extends Service
  
  /* static members */
  @js.native
  object PollyCustomizations extends js.Object {
    var Presigner: Instantiable1[
        js.UndefOr[/* options */ PresignerOptions], 
        typingsJapgolly.awsSdk.presignerMod.Presigner
      ] = js.native
  }
  
}

