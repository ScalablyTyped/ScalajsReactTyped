package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsFunctionsTypesMod.CreateFunction
import typingsJapgolly.nodePgMigrate.distOperationsFunctionsTypesMod.DropFunction
import typingsJapgolly.nodePgMigrate.distOperationsFunctionsTypesMod.RenameFunction
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsFunctionsMod {
  
  @JSImport("node-pg-migrate/dist/operations/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFunction(mOptions: MigrationOptions): CreateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createFunction")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateFunction]
  
  inline def dropFunction(mOptions: MigrationOptions): DropFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("dropFunction")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropFunction]
  
  inline def renameFunction(mOptions: MigrationOptions): RenameFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("renameFunction")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameFunction]
}
