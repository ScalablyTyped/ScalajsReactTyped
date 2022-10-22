package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.AddColumns
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.AlterColumn
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.AlterTable
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.CreateConstraint
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.CreateTable
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.DropColumns
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.DropConstraint
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.DropTable
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.RenameColumn
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.RenameConstraint
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.RenameTable
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsTablesMod {
  
  @JSImport("node-pg-migrate/dist/operations/tables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addColumns(mOptions: MigrationOptions): AddColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("addColumns")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AddColumns]
  
  inline def addConstraint(mOptions: MigrationOptions): CreateConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("addConstraint")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateConstraint]
  
  inline def alterColumn(mOptions: MigrationOptions): AlterColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("alterColumn")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterColumn]
  
  inline def alterTable(mOptions: MigrationOptions): AlterTable = ^.asInstanceOf[js.Dynamic].applyDynamic("alterTable")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterTable]
  
  inline def createTable(mOptions: MigrationOptions): CreateTable = ^.asInstanceOf[js.Dynamic].applyDynamic("createTable")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateTable]
  
  inline def dropColumns(mOptions: MigrationOptions): DropColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("dropColumns")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropColumns]
  
  inline def dropConstraint(mOptions: MigrationOptions): DropConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("dropConstraint")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropConstraint]
  
  inline def dropTable(mOptions: MigrationOptions): DropTable = ^.asInstanceOf[js.Dynamic].applyDynamic("dropTable")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropTable]
  
  inline def renameColumn(mOptions: MigrationOptions): RenameColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("renameColumn")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameColumn]
  
  inline def renameConstraint(mOptions: MigrationOptions): RenameConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("renameConstraint")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameConstraint]
  
  inline def renameTable(mOptions: MigrationOptions): RenameTable = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTable")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameTable]
}
