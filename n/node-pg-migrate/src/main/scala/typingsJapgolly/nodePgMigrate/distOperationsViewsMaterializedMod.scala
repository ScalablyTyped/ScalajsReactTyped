package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.AlterMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.CreateMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.DropMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RefreshMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RenameMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RenameMaterializedViewColumn
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsViewsMaterializedMod {
  
  @JSImport("node-pg-migrate/dist/operations/viewsMaterialized", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterMaterializedView(mOptions: MigrationOptions): AlterMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("alterMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterMaterializedView]
  
  inline def createMaterializedView(mOptions: MigrationOptions): CreateMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("createMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateMaterializedView]
  
  inline def dropMaterializedView(mOptions: MigrationOptions): DropMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("dropMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropMaterializedView]
  
  inline def refreshMaterializedView(mOptions: MigrationOptions): RefreshMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RefreshMaterializedView]
  
  inline def renameMaterializedView(mOptions: MigrationOptions): RenameMaterializedView = ^.asInstanceOf[js.Dynamic].applyDynamic("renameMaterializedView")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameMaterializedView]
  
  inline def renameMaterializedViewColumn(mOptions: MigrationOptions): RenameMaterializedViewColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("renameMaterializedViewColumn")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameMaterializedViewColumn]
}
