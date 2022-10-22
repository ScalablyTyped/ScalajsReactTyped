package typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionLifecycleEventType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionLifecycleEventType")
@js.native
object ExtensionLifecycleEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionLifecycleEventType & Double] = js.native
  
  @js.native
  sealed trait Acquisition
    extends StObject
       with ExtensionLifecycleEventType
  /* 4 */ val Acquisition: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Acquisition & Double = js.native
  
  @js.native
  sealed trait Install
    extends StObject
       with ExtensionLifecycleEventType
  /* 2 */ val Install: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Install & Double = js.native
  
  @js.native
  sealed trait Other
    extends StObject
       with ExtensionLifecycleEventType
  /* 999 */ val Other: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Other & Double = js.native
  
  @js.native
  sealed trait Review
    extends StObject
       with ExtensionLifecycleEventType
  /* 3 */ val Review: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Review & Double = js.native
  
  @js.native
  sealed trait Sales
    extends StObject
       with ExtensionLifecycleEventType
  /* 5 */ val Sales: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Sales & Double = js.native
  
  @js.native
  sealed trait Uninstall
    extends StObject
       with ExtensionLifecycleEventType
  /* 1 */ val Uninstall: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Uninstall & Double = js.native
}
