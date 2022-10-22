package typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionDeploymentTechnology extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionDeploymentTechnology")
@js.native
object ExtensionDeploymentTechnology extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionDeploymentTechnology & Double] = js.native
  
  @js.native
  sealed trait Exe
    extends StObject
       with ExtensionDeploymentTechnology
  /* 1 */ val Exe: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology.Exe & Double = js.native
  
  @js.native
  sealed trait Msi
    extends StObject
       with ExtensionDeploymentTechnology
  /* 2 */ val Msi: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology.Msi & Double = js.native
  
  @js.native
  sealed trait ReferralLink
    extends StObject
       with ExtensionDeploymentTechnology
  /* 4 */ val ReferralLink: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology.ReferralLink & Double = js.native
  
  @js.native
  sealed trait Vsix
    extends StObject
       with ExtensionDeploymentTechnology
  /* 3 */ val Vsix: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology.Vsix & Double = js.native
}
