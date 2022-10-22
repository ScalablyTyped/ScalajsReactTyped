package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQueryOrder")
@js.native
object DefinitionQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQueryOrder & Double] = js.native
  
  /**
    * Order by definition name ascending.
    */
  @js.native
  sealed trait DefinitionNameAscending
    extends StObject
       with DefinitionQueryOrder
  /* 3 */ val DefinitionNameAscending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.DefinitionNameAscending & Double = js.native
  
  /**
    * Order by definition name descending.
    */
  @js.native
  sealed trait DefinitionNameDescending
    extends StObject
       with DefinitionQueryOrder
  /* 4 */ val DefinitionNameDescending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.DefinitionNameDescending & Double = js.native
  
  /**
    * Order by created on/last modified time ascending.
    */
  @js.native
  sealed trait LastModifiedAscending
    extends StObject
       with DefinitionQueryOrder
  /* 1 */ val LastModifiedAscending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.LastModifiedAscending & Double = js.native
  
  /**
    * Order by created on/last modified time descending.
    */
  @js.native
  sealed trait LastModifiedDescending
    extends StObject
       with DefinitionQueryOrder
  /* 2 */ val LastModifiedDescending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.LastModifiedDescending & Double = js.native
  
  /**
    * No order
    */
  @js.native
  sealed trait None
    extends StObject
       with DefinitionQueryOrder
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.DefinitionQueryOrder.None & Double = js.native
}
