package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.AddToOperatorFamily
import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.CreateOperator
import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.CreateOperatorClass
import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.CreateOperatorFamily
import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.DropOperator
import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.DropOperatorClass
import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.DropOperatorFamily
import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.RemoveFromOperatorFamily
import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.RenameOperatorClass
import typingsJapgolly.nodePgMigrate.distOperationsOperatorsTypesMod.RenameOperatorFamily
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsOperatorsMod {
  
  @JSImport("node-pg-migrate/dist/operations/operators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addToOperatorFamily(mOptions: MigrationOptions): AddToOperatorFamily = ^.asInstanceOf[js.Dynamic].applyDynamic("addToOperatorFamily")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AddToOperatorFamily]
  
  inline def createOperator(mOptions: MigrationOptions): CreateOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperator")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateOperator]
  
  inline def createOperatorClass(mOptions: MigrationOptions): CreateOperatorClass = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorClass")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateOperatorClass]
  
  inline def createOperatorFamily(mOptions: MigrationOptions): CreateOperatorFamily = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorFamily")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateOperatorFamily]
  
  inline def dropOperator(mOptions: MigrationOptions): DropOperator = ^.asInstanceOf[js.Dynamic].applyDynamic("dropOperator")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropOperator]
  
  inline def dropOperatorClass(mOptions: MigrationOptions): DropOperatorClass = ^.asInstanceOf[js.Dynamic].applyDynamic("dropOperatorClass")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropOperatorClass]
  
  inline def dropOperatorFamily(mOptions: MigrationOptions): DropOperatorFamily = ^.asInstanceOf[js.Dynamic].applyDynamic("dropOperatorFamily")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropOperatorFamily]
  
  inline def removeFromOperatorFamily(mOptions: MigrationOptions): RemoveFromOperatorFamily = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFromOperatorFamily")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RemoveFromOperatorFamily]
  
  inline def renameOperatorClass(mOptions: MigrationOptions): RenameOperatorClass = ^.asInstanceOf[js.Dynamic].applyDynamic("renameOperatorClass")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameOperatorClass]
  
  inline def renameOperatorFamily(mOptions: MigrationOptions): RenameOperatorFamily = ^.asInstanceOf[js.Dynamic].applyDynamic("renameOperatorFamily")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameOperatorFamily]
}
