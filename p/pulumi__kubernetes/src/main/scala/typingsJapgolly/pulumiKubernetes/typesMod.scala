package typingsJapgolly.pulumiKubernetes

import typingsJapgolly.pulumiKubernetes.typesInputMod.HelmReleaseSettings
import typingsJapgolly.pulumiKubernetes.typesInputMod.KubeClientSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  object input {
    
    @JSImport("@pulumi/kubernetes/types", "input")
    @js.native
    val ^ : js.Any = js.native
    
    inline def helmReleaseSettingsProvideDefaults(`val`: HelmReleaseSettings): HelmReleaseSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("helmReleaseSettingsProvideDefaults")(`val`.asInstanceOf[js.Any]).asInstanceOf[HelmReleaseSettings]
    
    inline def kubeClientSettingsProvideDefaults(`val`: KubeClientSettings): KubeClientSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("kubeClientSettingsProvideDefaults")(`val`.asInstanceOf[js.Any]).asInstanceOf[KubeClientSettings]
  }
}
