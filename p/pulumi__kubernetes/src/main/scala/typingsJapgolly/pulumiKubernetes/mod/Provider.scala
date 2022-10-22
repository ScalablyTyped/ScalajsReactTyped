package typingsJapgolly.pulumiKubernetes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@pulumi/kubernetes", "Provider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true if the given object is an instance of Provider.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/provider.Provider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/provider.Provider */ Boolean]
}
