package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.AddTypeAttribute
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.AddTypeValue
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.CreateType
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.DropType
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.DropTypeAttribute
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.RenameType
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.RenameTypeAttribute
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.RenameTypeValue
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.SetTypeAttribute
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsTypesMod {
  
  @JSImport("node-pg-migrate/dist/operations/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTypeAttribute(mOptions: MigrationOptions): AddTypeAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("addTypeAttribute")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AddTypeAttribute]
  
  inline def addTypeValue(mOptions: MigrationOptions): AddTypeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("addTypeValue")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AddTypeValue]
  
  inline def createType(mOptions: MigrationOptions): CreateType = ^.asInstanceOf[js.Dynamic].applyDynamic("createType")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateType]
  
  inline def dropType(mOptions: MigrationOptions): DropType = ^.asInstanceOf[js.Dynamic].applyDynamic("dropType")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropType]
  
  inline def dropTypeAttribute(mOptions: MigrationOptions): DropTypeAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("dropTypeAttribute")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropTypeAttribute]
  
  inline def renameType(mOptions: MigrationOptions): RenameType = ^.asInstanceOf[js.Dynamic].applyDynamic("renameType")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameType]
  
  inline def renameTypeAttribute(mOptions: MigrationOptions): RenameTypeAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTypeAttribute")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameTypeAttribute]
  
  inline def renameTypeValue(mOptions: MigrationOptions): RenameTypeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTypeValue")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameTypeValue]
  
  inline def setTypeAttribute(mOptions: MigrationOptions): SetTypeAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("setTypeAttribute")(mOptions.asInstanceOf[js.Any]).asInstanceOf[SetTypeAttribute]
}
