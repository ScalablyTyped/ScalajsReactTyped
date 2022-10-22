package typingsJapgolly.nodePgMigrate

import typingsJapgolly.nodePgMigrate.distOperationsSequencesTypesMod.AlterSequence
import typingsJapgolly.nodePgMigrate.distOperationsSequencesTypesMod.CreateSequence
import typingsJapgolly.nodePgMigrate.distOperationsSequencesTypesMod.DropSequence
import typingsJapgolly.nodePgMigrate.distOperationsSequencesTypesMod.RenameSequence
import typingsJapgolly.nodePgMigrate.distOperationsSequencesTypesMod.SequenceOptions
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.ColumnDefinitions
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsSequencesMod {
  
  @JSImport("node-pg-migrate/dist/operations/sequences", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterSequence(mOptions: MigrationOptions): AlterSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("alterSequence")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterSequence]
  
  inline def createSequence(mOptions: MigrationOptions): CreateSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("createSequence")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateSequence]
  
  inline def dropSequence(mOptions: MigrationOptions): DropSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("dropSequence")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropSequence]
  
  inline def parseSequenceOptions(typeShorthands: Unit, options: SequenceOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSequenceOptions")(typeShorthands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def parseSequenceOptions(typeShorthands: ColumnDefinitions, options: SequenceOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSequenceOptions")(typeShorthands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def renameSequence(mOptions: MigrationOptions): RenameSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("renameSequence")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameSequence]
}
