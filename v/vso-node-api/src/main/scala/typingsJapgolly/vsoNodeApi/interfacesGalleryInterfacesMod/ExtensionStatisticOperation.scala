package typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionStatisticOperation extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatisticOperation")
@js.native
object ExtensionStatisticOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatisticOperation & Double] = js.native
  
  @js.native
  sealed trait Decrement
    extends StObject
       with ExtensionStatisticOperation
  /* 3 */ val Decrement: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.Decrement & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with ExtensionStatisticOperation
  /* 4 */ val Delete: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.Delete & Double = js.native
  
  @js.native
  sealed trait Increment
    extends StObject
       with ExtensionStatisticOperation
  /* 2 */ val Increment: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.Increment & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ExtensionStatisticOperation
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.None & Double = js.native
  
  @js.native
  sealed trait Set
    extends StObject
       with ExtensionStatisticOperation
  /* 1 */ val Set: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.Set & Double = js.native
}
