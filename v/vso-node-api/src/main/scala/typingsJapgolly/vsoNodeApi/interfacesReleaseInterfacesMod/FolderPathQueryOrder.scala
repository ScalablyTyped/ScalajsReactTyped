package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FolderPathQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "FolderPathQueryOrder")
@js.native
object FolderPathQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderPathQueryOrder & Double] = js.native
  
  /**
    * Order by folder name and path ascending.
    */
  @js.native
  sealed trait Ascending
    extends StObject
       with FolderPathQueryOrder
  /* 1 */ val Ascending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.FolderPathQueryOrder.Ascending & Double = js.native
  
  /**
    * Order by folder name and path descending.
    */
  @js.native
  sealed trait Descending
    extends StObject
       with FolderPathQueryOrder
  /* 2 */ val Descending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.FolderPathQueryOrder.Descending & Double = js.native
  
  /**
    * No order
    */
  @js.native
  sealed trait None
    extends StObject
       with FolderPathQueryOrder
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.FolderPathQueryOrder.None & Double = js.native
}
