package typingsJapgolly.awsSdk

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.awsSdk.libPollyPresignerMod.Presigner
import typingsJapgolly.awsSdk.libPollyPresignerMod.Presigner.PresignerOptions
import typingsJapgolly.awsSdk.libServiceMod.Service
import typingsJapgolly.awsSdk.libServiceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesPollyMod {
  
  @JSImport("aws-sdk/lib/services/polly", "PollyCustomizations")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  open class PollyCustomizations () extends Service {
    def this(config: ServiceConfigurationOptions) = this()
  }
  /* static members */
  object PollyCustomizations {
    
    @JSImport("aws-sdk/lib/services/polly", "PollyCustomizations")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("aws-sdk/lib/services/polly", "PollyCustomizations.Presigner")
    @js.native
    def Presigner: Instantiable1[
        /* options */ js.UndefOr[PresignerOptions], 
        typingsJapgolly.awsSdk.libPollyPresignerMod.Presigner
      ] = js.native
    inline def Presigner_=(x: Instantiable1[/* options */ js.UndefOr[PresignerOptions], Presigner]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Presigner")(x.asInstanceOf[js.Any])
  }
}
