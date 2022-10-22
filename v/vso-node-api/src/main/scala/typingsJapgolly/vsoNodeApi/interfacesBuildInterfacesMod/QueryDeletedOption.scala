package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryDeletedOption extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueryDeletedOption")
@js.native
object QueryDeletedOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryDeletedOption & Double] = js.native
  
  /**
    * Include only non-deleted builds.
    */
  @js.native
  sealed trait ExcludeDeleted
    extends StObject
       with QueryDeletedOption
  /* 0 */ val ExcludeDeleted: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.QueryDeletedOption.ExcludeDeleted & Double = js.native
  
  /**
    * Include deleted and non-deleted builds.
    */
  @js.native
  sealed trait IncludeDeleted
    extends StObject
       with QueryDeletedOption
  /* 1 */ val IncludeDeleted: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.QueryDeletedOption.IncludeDeleted & Double = js.native
  
  /**
    * Include only deleted builds.
    */
  @js.native
  sealed trait OnlyDeleted
    extends StObject
       with QueryDeletedOption
  /* 2 */ val OnlyDeleted: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.QueryDeletedOption.OnlyDeleted & Double = js.native
}
