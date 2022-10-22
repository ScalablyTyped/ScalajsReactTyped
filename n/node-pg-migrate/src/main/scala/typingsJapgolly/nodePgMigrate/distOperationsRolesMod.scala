package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsRolesTypesMod.AlterRole
import typingsJapgolly.nodePgMigrate.distOperationsRolesTypesMod.CreateRole
import typingsJapgolly.nodePgMigrate.distOperationsRolesTypesMod.DropRole
import typingsJapgolly.nodePgMigrate.distOperationsRolesTypesMod.RenameRole
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsRolesMod {
  
  @JSImport("node-pg-migrate/dist/operations/roles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterRole(mOptions: MigrationOptions): AlterRole = ^.asInstanceOf[js.Dynamic].applyDynamic("alterRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterRole]
  
  inline def createRole(mOptions: MigrationOptions): CreateRole = ^.asInstanceOf[js.Dynamic].applyDynamic("createRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateRole]
  
  inline def dropRole(mOptions: MigrationOptions): DropRole = ^.asInstanceOf[js.Dynamic].applyDynamic("dropRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropRole]
  
  inline def renameRole(mOptions: MigrationOptions): RenameRole = ^.asInstanceOf[js.Dynamic].applyDynamic("renameRole")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameRole]
}
