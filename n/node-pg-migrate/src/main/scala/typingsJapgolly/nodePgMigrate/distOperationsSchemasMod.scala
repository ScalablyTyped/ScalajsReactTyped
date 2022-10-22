package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsSchemasTypesMod.CreateSchema
import typingsJapgolly.nodePgMigrate.distOperationsSchemasTypesMod.DropSchema
import typingsJapgolly.nodePgMigrate.distOperationsSchemasTypesMod.RenameSchema
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsSchemasMod {
  
  @JSImport("node-pg-migrate/dist/operations/schemas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSchema(mOptions: MigrationOptions): CreateSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("createSchema")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateSchema]
  
  inline def dropSchema(mOptions: MigrationOptions): DropSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("dropSchema")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropSchema]
  
  inline def renameSchema(mOptions: MigrationOptions): RenameSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("renameSchema")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameSchema]
}
