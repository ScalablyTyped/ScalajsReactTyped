package typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PermissionGroupDatabaseTypes extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "PermissionGroupDatabaseTypes")
@js.native
object PermissionGroupDatabaseTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PermissionGroupDatabaseTypes & Double] = js.native
  
  /** global query group (used for ServerQuery clients) */
  @js.native
  sealed trait Query
    extends StObject
       with PermissionGroupDatabaseTypes
  /* 2 */ val Query: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Query & Double = js.native
  
  /** regular group (used for regular clients) */
  @js.native
  sealed trait Regular
    extends StObject
       with PermissionGroupDatabaseTypes
  /* 1 */ val Regular: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Regular & Double = js.native
  
  /** template group (used for new virtual servers) */
  @js.native
  sealed trait Template
    extends StObject
       with PermissionGroupDatabaseTypes
  /* 0 */ val Template: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.PermissionGroupDatabaseTypes.Template & Double = js.native
}
