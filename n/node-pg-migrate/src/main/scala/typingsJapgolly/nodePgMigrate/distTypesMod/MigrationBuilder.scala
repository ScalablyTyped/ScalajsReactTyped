package typingsJapgolly.nodePgMigrate.distTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodePgMigrate.distOperationsDomainsTypesMod.AlterDomain
import typingsJapgolly.nodePgMigrate.distOperationsDomainsTypesMod.CreateDomain
import typingsJapgolly.nodePgMigrate.distOperationsDomainsTypesMod.DropDomain
import typingsJapgolly.nodePgMigrate.distOperationsDomainsTypesMod.RenameDomain
import typingsJapgolly.nodePgMigrate.distOperationsExtensionsTypesMod.CreateExtension
import typingsJapgolly.nodePgMigrate.distOperationsExtensionsTypesMod.DropExtension
import typingsJapgolly.nodePgMigrate.distOperationsFunctionsTypesMod.CreateFunction
import typingsJapgolly.nodePgMigrate.distOperationsFunctionsTypesMod.DropFunction
import typingsJapgolly.nodePgMigrate.distOperationsFunctionsTypesMod.RenameFunction
import typingsJapgolly.nodePgMigrate.distOperationsIndexesTypesMod.CreateIndex
import typingsJapgolly.nodePgMigrate.distOperationsIndexesTypesMod.DropIndex
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
import typingsJapgolly.nodePgMigrate.distOperationsOthersTypesMod.Sql
import typingsJapgolly.nodePgMigrate.distOperationsPgLiteralMod.default
import typingsJapgolly.nodePgMigrate.distOperationsPoliciesTypesMod.AlterPolicy
import typingsJapgolly.nodePgMigrate.distOperationsPoliciesTypesMod.CreatePolicy
import typingsJapgolly.nodePgMigrate.distOperationsPoliciesTypesMod.DropPolicy
import typingsJapgolly.nodePgMigrate.distOperationsPoliciesTypesMod.RenamePolicy
import typingsJapgolly.nodePgMigrate.distOperationsRolesTypesMod.AlterRole
import typingsJapgolly.nodePgMigrate.distOperationsRolesTypesMod.CreateRole
import typingsJapgolly.nodePgMigrate.distOperationsRolesTypesMod.DropRole
import typingsJapgolly.nodePgMigrate.distOperationsRolesTypesMod.RenameRole
import typingsJapgolly.nodePgMigrate.distOperationsSchemasTypesMod.CreateSchema
import typingsJapgolly.nodePgMigrate.distOperationsSchemasTypesMod.DropSchema
import typingsJapgolly.nodePgMigrate.distOperationsSchemasTypesMod.RenameSchema
import typingsJapgolly.nodePgMigrate.distOperationsSequencesTypesMod.AlterSequence
import typingsJapgolly.nodePgMigrate.distOperationsSequencesTypesMod.CreateSequence
import typingsJapgolly.nodePgMigrate.distOperationsSequencesTypesMod.DropSequence
import typingsJapgolly.nodePgMigrate.distOperationsSequencesTypesMod.RenameSequence
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
import typingsJapgolly.nodePgMigrate.distOperationsTriggersTypesMod.CreateTrigger
import typingsJapgolly.nodePgMigrate.distOperationsTriggersTypesMod.DropTrigger
import typingsJapgolly.nodePgMigrate.distOperationsTriggersTypesMod.RenameTrigger
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.AddTypeAttribute
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.AddTypeValue
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.CreateType
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.DropType
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.DropTypeAttribute
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.RenameType
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.RenameTypeAttribute
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.RenameTypeValue
import typingsJapgolly.nodePgMigrate.distOperationsTypesTypesMod.SetTypeAttribute
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.AlterMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.CreateMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.DropMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RefreshMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RenameMaterializedView
import typingsJapgolly.nodePgMigrate.distOperationsViewsMaterializedTypesMod.RenameMaterializedViewColumn
import typingsJapgolly.nodePgMigrate.distOperationsViewsTypesMod.AlterView
import typingsJapgolly.nodePgMigrate.distOperationsViewsTypesMod.AlterViewColumn
import typingsJapgolly.nodePgMigrate.distOperationsViewsTypesMod.CreateView
import typingsJapgolly.nodePgMigrate.distOperationsViewsTypesMod.DropView
import typingsJapgolly.nodePgMigrate.distOperationsViewsTypesMod.RenameView
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationBuilder extends StObject {
  
  def addColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
  ): Unit
  
  def addColumns(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
  ): Unit
  
  def addConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
  ): Unit
  
  def addExtension(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
  ): Unit
  
  def addIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
  ): Unit
  
  def addToOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.AddToOperatorFamily> is not an array type */ args: Parameters[AddToOperatorFamily]
  ): Unit
  
  def addType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
  ): Unit
  
  def addTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeAttribute> is not an array type */ args: Parameters[AddTypeAttribute]
  ): Unit
  
  def addTypeValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeValue> is not an array type */ args: Parameters[AddTypeValue]
  ): Unit
  
  def alterColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterColumn> is not an array type */ args: Parameters[AlterColumn]
  ): Unit
  
  def alterDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.AlterDomain> is not an array type */ args: Parameters[AlterDomain]
  ): Unit
  
  def alterMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.AlterMaterializedView> is not an array type */ args: Parameters[AlterMaterializedView]
  ): Unit
  
  def alterPolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.AlterPolicy> is not an array type */ args: Parameters[AlterPolicy]
  ): Unit
  
  def alterRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.AlterRole> is not an array type */ args: Parameters[AlterRole]
  ): Unit
  
  def alterSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.AlterSequence> is not an array type */ args: Parameters[AlterSequence]
  ): Unit
  
  def alterTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterTable> is not an array type */ args: Parameters[AlterTable]
  ): Unit
  
  def alterView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterView> is not an array type */ args: Parameters[AlterView]
  ): Unit
  
  def alterViewColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterViewColumn> is not an array type */ args: Parameters[AlterViewColumn]
  ): Unit
  
  def createConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
  ): Unit
  
  def createDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.CreateDomain> is not an array type */ args: Parameters[CreateDomain]
  ): Unit
  
  def createExtension(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
  ): Unit
  
  def createFunction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.CreateFunction> is not an array type */ args: Parameters[CreateFunction]
  ): Unit
  
  def createIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
  ): Unit
  
  def createMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.CreateMaterializedView> is not an array type */ args: Parameters[CreateMaterializedView]
  ): Unit
  
  def createOperator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperator> is not an array type */ args: Parameters[CreateOperator]
  ): Unit
  
  def createOperatorClass(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorClass> is not an array type */ args: Parameters[CreateOperatorClass]
  ): Unit
  
  def createOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorFamily> is not an array type */ args: Parameters[CreateOperatorFamily]
  ): Unit
  
  def createPolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.CreatePolicy> is not an array type */ args: Parameters[CreatePolicy]
  ): Unit
  
  def createRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.CreateRole> is not an array type */ args: Parameters[CreateRole]
  ): Unit
  
  def createSchema(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.CreateSchema> is not an array type */ args: Parameters[CreateSchema]
  ): Unit
  
  def createSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.CreateSequence> is not an array type */ args: Parameters[CreateSequence]
  ): Unit
  
  def createTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateTable> is not an array type */ args: Parameters[CreateTable]
  ): Unit
  
  def createTrigger(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.CreateTrigger> is not an array type */ args: Parameters[CreateTrigger]
  ): Unit
  
  def createType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
  ): Unit
  
  def createView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.CreateView> is not an array type */ args: Parameters[CreateView]
  ): Unit
  
  var db: DB
  
  def dropColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
  ): Unit
  
  def dropColumns(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
  ): Unit
  
  def dropConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropConstraint> is not an array type */ args: Parameters[DropConstraint]
  ): Unit
  
  def dropDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.DropDomain> is not an array type */ args: Parameters[DropDomain]
  ): Unit
  
  def dropExtension(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.DropExtension> is not an array type */ args: Parameters[DropExtension]
  ): Unit
  
  def dropFunction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.DropFunction> is not an array type */ args: Parameters[DropFunction]
  ): Unit
  
  def dropIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.DropIndex> is not an array type */ args: Parameters[DropIndex]
  ): Unit
  
  def dropMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.DropMaterializedView> is not an array type */ args: Parameters[DropMaterializedView]
  ): Unit
  
  def dropOperator(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperator> is not an array type */ args: Parameters[DropOperator]
  ): Unit
  
  def dropOperatorClass(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorClass> is not an array type */ args: Parameters[DropOperatorClass]
  ): Unit
  
  def dropOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorFamily> is not an array type */ args: Parameters[DropOperatorFamily]
  ): Unit
  
  def dropPolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.DropPolicy> is not an array type */ args: Parameters[DropPolicy]
  ): Unit
  
  def dropRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.DropRole> is not an array type */ args: Parameters[DropRole]
  ): Unit
  
  def dropSchema(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.DropSchema> is not an array type */ args: Parameters[DropSchema]
  ): Unit
  
  def dropSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.DropSequence> is not an array type */ args: Parameters[DropSequence]
  ): Unit
  
  def dropTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropTable> is not an array type */ args: Parameters[DropTable]
  ): Unit
  
  def dropTrigger(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.DropTrigger> is not an array type */ args: Parameters[DropTrigger]
  ): Unit
  
  def dropType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropType> is not an array type */ args: Parameters[DropType]
  ): Unit
  
  def dropTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropTypeAttribute> is not an array type */ args: Parameters[DropTypeAttribute]
  ): Unit
  
  def dropView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.DropView> is not an array type */ args: Parameters[DropView]
  ): Unit
  
  def func(sql: String): default
  
  def noTransaction(): Unit
  
  def refreshMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RefreshMaterializedView> is not an array type */ args: Parameters[RefreshMaterializedView]
  ): Unit
  
  def removeFromOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RemoveFromOperatorFamily> is not an array type */ args: Parameters[RemoveFromOperatorFamily]
  ): Unit
  
  def renameColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameColumn> is not an array type */ args: Parameters[RenameColumn]
  ): Unit
  
  def renameConstraint(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameConstraint> is not an array type */ args: Parameters[RenameConstraint]
  ): Unit
  
  def renameDomain(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.RenameDomain> is not an array type */ args: Parameters[RenameDomain]
  ): Unit
  
  def renameFunction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.RenameFunction> is not an array type */ args: Parameters[RenameFunction]
  ): Unit
  
  def renameMaterializedView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedView> is not an array type */ args: Parameters[RenameMaterializedView]
  ): Unit
  
  def renameMaterializedViewColumn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedViewColumn> is not an array type */ args: Parameters[RenameMaterializedViewColumn]
  ): Unit
  
  def renameOperatorClass(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorClass> is not an array type */ args: Parameters[RenameOperatorClass]
  ): Unit
  
  def renameOperatorFamily(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorFamily> is not an array type */ args: Parameters[RenameOperatorFamily]
  ): Unit
  
  def renamePolicy(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.RenamePolicy> is not an array type */ args: Parameters[RenamePolicy]
  ): Unit
  
  def renameRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.RenameRole> is not an array type */ args: Parameters[RenameRole]
  ): Unit
  
  def renameSchema(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.RenameSchema> is not an array type */ args: Parameters[RenameSchema]
  ): Unit
  
  def renameSequence(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.RenameSequence> is not an array type */ args: Parameters[RenameSequence]
  ): Unit
  
  def renameTable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameTable> is not an array type */ args: Parameters[RenameTable]
  ): Unit
  
  def renameTrigger(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.RenameTrigger> is not an array type */ args: Parameters[RenameTrigger]
  ): Unit
  
  def renameType(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameType> is not an array type */ args: Parameters[RenameType]
  ): Unit
  
  def renameTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeAttribute> is not an array type */ args: Parameters[RenameTypeAttribute]
  ): Unit
  
  def renameTypeValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeValue> is not an array type */ args: Parameters[RenameTypeValue]
  ): Unit
  
  def renameView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.RenameView> is not an array type */ args: Parameters[RenameView]
  ): Unit
  
  def setTypeAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.SetTypeAttribute> is not an array type */ args: Parameters[SetTypeAttribute]
  ): Unit
  
  def sql(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<other.Sql> is not an array type */ args: Parameters[Sql]
  ): Unit
}
object MigrationBuilder {
  
  inline def apply(
    addColumn: Parameters[AddColumns] => Callback,
    addColumns: Parameters[AddColumns] => Callback,
    addConstraint: Parameters[CreateConstraint] => Callback,
    addExtension: Parameters[CreateExtension] => Callback,
    addIndex: Parameters[CreateIndex] => Callback,
    addToOperatorFamily: Parameters[AddToOperatorFamily] => Callback,
    addType: Parameters[CreateType] => Callback,
    addTypeAttribute: Parameters[AddTypeAttribute] => Callback,
    addTypeValue: Parameters[AddTypeValue] => Callback,
    alterColumn: Parameters[AlterColumn] => Callback,
    alterDomain: Parameters[AlterDomain] => Callback,
    alterMaterializedView: Parameters[AlterMaterializedView] => Callback,
    alterPolicy: Parameters[AlterPolicy] => Callback,
    alterRole: Parameters[AlterRole] => Callback,
    alterSequence: Parameters[AlterSequence] => Callback,
    alterTable: Parameters[AlterTable] => Callback,
    alterView: Parameters[AlterView] => Callback,
    alterViewColumn: Parameters[AlterViewColumn] => Callback,
    createConstraint: Parameters[CreateConstraint] => Callback,
    createDomain: Parameters[CreateDomain] => Callback,
    createExtension: Parameters[CreateExtension] => Callback,
    createFunction: Parameters[CreateFunction] => Callback,
    createIndex: Parameters[CreateIndex] => Callback,
    createMaterializedView: Parameters[CreateMaterializedView] => Callback,
    createOperator: Parameters[CreateOperator] => Callback,
    createOperatorClass: Parameters[CreateOperatorClass] => Callback,
    createOperatorFamily: Parameters[CreateOperatorFamily] => Callback,
    createPolicy: Parameters[CreatePolicy] => Callback,
    createRole: Parameters[CreateRole] => Callback,
    createSchema: Parameters[CreateSchema] => Callback,
    createSequence: Parameters[CreateSequence] => Callback,
    createTable: Parameters[CreateTable] => Callback,
    createTrigger: Parameters[CreateTrigger] => Callback,
    createType: Parameters[CreateType] => Callback,
    createView: Parameters[CreateView] => Callback,
    db: DB,
    dropColumn: Parameters[DropColumns] => Callback,
    dropColumns: Parameters[DropColumns] => Callback,
    dropConstraint: Parameters[DropConstraint] => Callback,
    dropDomain: Parameters[DropDomain] => Callback,
    dropExtension: Parameters[DropExtension] => Callback,
    dropFunction: Parameters[DropFunction] => Callback,
    dropIndex: Parameters[DropIndex] => Callback,
    dropMaterializedView: Parameters[DropMaterializedView] => Callback,
    dropOperator: Parameters[DropOperator] => Callback,
    dropOperatorClass: Parameters[DropOperatorClass] => Callback,
    dropOperatorFamily: Parameters[DropOperatorFamily] => Callback,
    dropPolicy: Parameters[DropPolicy] => Callback,
    dropRole: Parameters[DropRole] => Callback,
    dropSchema: Parameters[DropSchema] => Callback,
    dropSequence: Parameters[DropSequence] => Callback,
    dropTable: Parameters[DropTable] => Callback,
    dropTrigger: Parameters[DropTrigger] => Callback,
    dropType: Parameters[DropType] => Callback,
    dropTypeAttribute: Parameters[DropTypeAttribute] => Callback,
    dropView: Parameters[DropView] => Callback,
    func: String => default,
    noTransaction: Callback,
    refreshMaterializedView: Parameters[RefreshMaterializedView] => Callback,
    removeFromOperatorFamily: Parameters[RemoveFromOperatorFamily] => Callback,
    renameColumn: Parameters[RenameColumn] => Callback,
    renameConstraint: Parameters[RenameConstraint] => Callback,
    renameDomain: Parameters[RenameDomain] => Callback,
    renameFunction: Parameters[RenameFunction] => Callback,
    renameMaterializedView: Parameters[RenameMaterializedView] => Callback,
    renameMaterializedViewColumn: Parameters[RenameMaterializedViewColumn] => Callback,
    renameOperatorClass: Parameters[RenameOperatorClass] => Callback,
    renameOperatorFamily: Parameters[RenameOperatorFamily] => Callback,
    renamePolicy: Parameters[RenamePolicy] => Callback,
    renameRole: Parameters[RenameRole] => Callback,
    renameSchema: Parameters[RenameSchema] => Callback,
    renameSequence: Parameters[RenameSequence] => Callback,
    renameTable: Parameters[RenameTable] => Callback,
    renameTrigger: Parameters[RenameTrigger] => Callback,
    renameType: Parameters[RenameType] => Callback,
    renameTypeAttribute: Parameters[RenameTypeAttribute] => Callback,
    renameTypeValue: Parameters[RenameTypeValue] => Callback,
    renameView: Parameters[RenameView] => Callback,
    setTypeAttribute: Parameters[SetTypeAttribute] => Callback,
    sql: Parameters[Sql] => Callback
  ): MigrationBuilder = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction1((t0: Parameters[AddColumns]) => addColumn(t0).runNow()), addColumns = js.Any.fromFunction1((t0: Parameters[AddColumns]) => addColumns(t0).runNow()), addConstraint = js.Any.fromFunction1((t0: Parameters[CreateConstraint]) => addConstraint(t0).runNow()), addExtension = js.Any.fromFunction1((t0: Parameters[CreateExtension]) => addExtension(t0).runNow()), addIndex = js.Any.fromFunction1((t0: Parameters[CreateIndex]) => addIndex(t0).runNow()), addToOperatorFamily = js.Any.fromFunction1((t0: Parameters[AddToOperatorFamily]) => addToOperatorFamily(t0).runNow()), addType = js.Any.fromFunction1((t0: Parameters[CreateType]) => addType(t0).runNow()), addTypeAttribute = js.Any.fromFunction1((t0: Parameters[AddTypeAttribute]) => addTypeAttribute(t0).runNow()), addTypeValue = js.Any.fromFunction1((t0: Parameters[AddTypeValue]) => addTypeValue(t0).runNow()), alterColumn = js.Any.fromFunction1((t0: Parameters[AlterColumn]) => alterColumn(t0).runNow()), alterDomain = js.Any.fromFunction1((t0: Parameters[AlterDomain]) => alterDomain(t0).runNow()), alterMaterializedView = js.Any.fromFunction1((t0: Parameters[AlterMaterializedView]) => alterMaterializedView(t0).runNow()), alterPolicy = js.Any.fromFunction1((t0: Parameters[AlterPolicy]) => alterPolicy(t0).runNow()), alterRole = js.Any.fromFunction1((t0: Parameters[AlterRole]) => alterRole(t0).runNow()), alterSequence = js.Any.fromFunction1((t0: Parameters[AlterSequence]) => alterSequence(t0).runNow()), alterTable = js.Any.fromFunction1((t0: Parameters[AlterTable]) => alterTable(t0).runNow()), alterView = js.Any.fromFunction1((t0: Parameters[AlterView]) => alterView(t0).runNow()), alterViewColumn = js.Any.fromFunction1((t0: Parameters[AlterViewColumn]) => alterViewColumn(t0).runNow()), createConstraint = js.Any.fromFunction1((t0: Parameters[CreateConstraint]) => createConstraint(t0).runNow()), createDomain = js.Any.fromFunction1((t0: Parameters[CreateDomain]) => createDomain(t0).runNow()), createExtension = js.Any.fromFunction1((t0: Parameters[CreateExtension]) => createExtension(t0).runNow()), createFunction = js.Any.fromFunction1((t0: Parameters[CreateFunction]) => createFunction(t0).runNow()), createIndex = js.Any.fromFunction1((t0: Parameters[CreateIndex]) => createIndex(t0).runNow()), createMaterializedView = js.Any.fromFunction1((t0: Parameters[CreateMaterializedView]) => createMaterializedView(t0).runNow()), createOperator = js.Any.fromFunction1((t0: Parameters[CreateOperator]) => createOperator(t0).runNow()), createOperatorClass = js.Any.fromFunction1((t0: Parameters[CreateOperatorClass]) => createOperatorClass(t0).runNow()), createOperatorFamily = js.Any.fromFunction1((t0: Parameters[CreateOperatorFamily]) => createOperatorFamily(t0).runNow()), createPolicy = js.Any.fromFunction1((t0: Parameters[CreatePolicy]) => createPolicy(t0).runNow()), createRole = js.Any.fromFunction1((t0: Parameters[CreateRole]) => createRole(t0).runNow()), createSchema = js.Any.fromFunction1((t0: Parameters[CreateSchema]) => createSchema(t0).runNow()), createSequence = js.Any.fromFunction1((t0: Parameters[CreateSequence]) => createSequence(t0).runNow()), createTable = js.Any.fromFunction1((t0: Parameters[CreateTable]) => createTable(t0).runNow()), createTrigger = js.Any.fromFunction1((t0: Parameters[CreateTrigger]) => createTrigger(t0).runNow()), createType = js.Any.fromFunction1((t0: Parameters[CreateType]) => createType(t0).runNow()), createView = js.Any.fromFunction1((t0: Parameters[CreateView]) => createView(t0).runNow()), db = db.asInstanceOf[js.Any], dropColumn = js.Any.fromFunction1((t0: Parameters[DropColumns]) => dropColumn(t0).runNow()), dropColumns = js.Any.fromFunction1((t0: Parameters[DropColumns]) => dropColumns(t0).runNow()), dropConstraint = js.Any.fromFunction1((t0: Parameters[DropConstraint]) => dropConstraint(t0).runNow()), dropDomain = js.Any.fromFunction1((t0: Parameters[DropDomain]) => dropDomain(t0).runNow()), dropExtension = js.Any.fromFunction1((t0: Parameters[DropExtension]) => dropExtension(t0).runNow()), dropFunction = js.Any.fromFunction1((t0: Parameters[DropFunction]) => dropFunction(t0).runNow()), dropIndex = js.Any.fromFunction1((t0: Parameters[DropIndex]) => dropIndex(t0).runNow()), dropMaterializedView = js.Any.fromFunction1((t0: Parameters[DropMaterializedView]) => dropMaterializedView(t0).runNow()), dropOperator = js.Any.fromFunction1((t0: Parameters[DropOperator]) => dropOperator(t0).runNow()), dropOperatorClass = js.Any.fromFunction1((t0: Parameters[DropOperatorClass]) => dropOperatorClass(t0).runNow()), dropOperatorFamily = js.Any.fromFunction1((t0: Parameters[DropOperatorFamily]) => dropOperatorFamily(t0).runNow()), dropPolicy = js.Any.fromFunction1((t0: Parameters[DropPolicy]) => dropPolicy(t0).runNow()), dropRole = js.Any.fromFunction1((t0: Parameters[DropRole]) => dropRole(t0).runNow()), dropSchema = js.Any.fromFunction1((t0: Parameters[DropSchema]) => dropSchema(t0).runNow()), dropSequence = js.Any.fromFunction1((t0: Parameters[DropSequence]) => dropSequence(t0).runNow()), dropTable = js.Any.fromFunction1((t0: Parameters[DropTable]) => dropTable(t0).runNow()), dropTrigger = js.Any.fromFunction1((t0: Parameters[DropTrigger]) => dropTrigger(t0).runNow()), dropType = js.Any.fromFunction1((t0: Parameters[DropType]) => dropType(t0).runNow()), dropTypeAttribute = js.Any.fromFunction1((t0: Parameters[DropTypeAttribute]) => dropTypeAttribute(t0).runNow()), dropView = js.Any.fromFunction1((t0: Parameters[DropView]) => dropView(t0).runNow()), func = js.Any.fromFunction1(func), noTransaction = noTransaction.toJsFn, refreshMaterializedView = js.Any.fromFunction1((t0: Parameters[RefreshMaterializedView]) => refreshMaterializedView(t0).runNow()), removeFromOperatorFamily = js.Any.fromFunction1((t0: Parameters[RemoveFromOperatorFamily]) => removeFromOperatorFamily(t0).runNow()), renameColumn = js.Any.fromFunction1((t0: Parameters[RenameColumn]) => renameColumn(t0).runNow()), renameConstraint = js.Any.fromFunction1((t0: Parameters[RenameConstraint]) => renameConstraint(t0).runNow()), renameDomain = js.Any.fromFunction1((t0: Parameters[RenameDomain]) => renameDomain(t0).runNow()), renameFunction = js.Any.fromFunction1((t0: Parameters[RenameFunction]) => renameFunction(t0).runNow()), renameMaterializedView = js.Any.fromFunction1((t0: Parameters[RenameMaterializedView]) => renameMaterializedView(t0).runNow()), renameMaterializedViewColumn = js.Any.fromFunction1((t0: Parameters[RenameMaterializedViewColumn]) => renameMaterializedViewColumn(t0).runNow()), renameOperatorClass = js.Any.fromFunction1((t0: Parameters[RenameOperatorClass]) => renameOperatorClass(t0).runNow()), renameOperatorFamily = js.Any.fromFunction1((t0: Parameters[RenameOperatorFamily]) => renameOperatorFamily(t0).runNow()), renamePolicy = js.Any.fromFunction1((t0: Parameters[RenamePolicy]) => renamePolicy(t0).runNow()), renameRole = js.Any.fromFunction1((t0: Parameters[RenameRole]) => renameRole(t0).runNow()), renameSchema = js.Any.fromFunction1((t0: Parameters[RenameSchema]) => renameSchema(t0).runNow()), renameSequence = js.Any.fromFunction1((t0: Parameters[RenameSequence]) => renameSequence(t0).runNow()), renameTable = js.Any.fromFunction1((t0: Parameters[RenameTable]) => renameTable(t0).runNow()), renameTrigger = js.Any.fromFunction1((t0: Parameters[RenameTrigger]) => renameTrigger(t0).runNow()), renameType = js.Any.fromFunction1((t0: Parameters[RenameType]) => renameType(t0).runNow()), renameTypeAttribute = js.Any.fromFunction1((t0: Parameters[RenameTypeAttribute]) => renameTypeAttribute(t0).runNow()), renameTypeValue = js.Any.fromFunction1((t0: Parameters[RenameTypeValue]) => renameTypeValue(t0).runNow()), renameView = js.Any.fromFunction1((t0: Parameters[RenameView]) => renameView(t0).runNow()), setTypeAttribute = js.Any.fromFunction1((t0: Parameters[SetTypeAttribute]) => setTypeAttribute(t0).runNow()), sql = js.Any.fromFunction1((t0: Parameters[Sql]) => sql(t0).runNow()))
    __obj.asInstanceOf[MigrationBuilder]
  }
  
  extension [Self <: MigrationBuilder](x: Self) {
    
    inline def setAddColumn(value: Parameters[AddColumns] => Callback): Self = StObject.set(x, "addColumn", js.Any.fromFunction1((t0: Parameters[AddColumns]) => value(t0).runNow()))
    
    inline def setAddColumns(value: Parameters[AddColumns] => Callback): Self = StObject.set(x, "addColumns", js.Any.fromFunction1((t0: Parameters[AddColumns]) => value(t0).runNow()))
    
    inline def setAddConstraint(value: Parameters[CreateConstraint] => Callback): Self = StObject.set(x, "addConstraint", js.Any.fromFunction1((t0: Parameters[CreateConstraint]) => value(t0).runNow()))
    
    inline def setAddExtension(value: Parameters[CreateExtension] => Callback): Self = StObject.set(x, "addExtension", js.Any.fromFunction1((t0: Parameters[CreateExtension]) => value(t0).runNow()))
    
    inline def setAddIndex(value: Parameters[CreateIndex] => Callback): Self = StObject.set(x, "addIndex", js.Any.fromFunction1((t0: Parameters[CreateIndex]) => value(t0).runNow()))
    
    inline def setAddToOperatorFamily(value: Parameters[AddToOperatorFamily] => Callback): Self = StObject.set(x, "addToOperatorFamily", js.Any.fromFunction1((t0: Parameters[AddToOperatorFamily]) => value(t0).runNow()))
    
    inline def setAddType(value: Parameters[CreateType] => Callback): Self = StObject.set(x, "addType", js.Any.fromFunction1((t0: Parameters[CreateType]) => value(t0).runNow()))
    
    inline def setAddTypeAttribute(value: Parameters[AddTypeAttribute] => Callback): Self = StObject.set(x, "addTypeAttribute", js.Any.fromFunction1((t0: Parameters[AddTypeAttribute]) => value(t0).runNow()))
    
    inline def setAddTypeValue(value: Parameters[AddTypeValue] => Callback): Self = StObject.set(x, "addTypeValue", js.Any.fromFunction1((t0: Parameters[AddTypeValue]) => value(t0).runNow()))
    
    inline def setAlterColumn(value: Parameters[AlterColumn] => Callback): Self = StObject.set(x, "alterColumn", js.Any.fromFunction1((t0: Parameters[AlterColumn]) => value(t0).runNow()))
    
    inline def setAlterDomain(value: Parameters[AlterDomain] => Callback): Self = StObject.set(x, "alterDomain", js.Any.fromFunction1((t0: Parameters[AlterDomain]) => value(t0).runNow()))
    
    inline def setAlterMaterializedView(value: Parameters[AlterMaterializedView] => Callback): Self = StObject.set(x, "alterMaterializedView", js.Any.fromFunction1((t0: Parameters[AlterMaterializedView]) => value(t0).runNow()))
    
    inline def setAlterPolicy(value: Parameters[AlterPolicy] => Callback): Self = StObject.set(x, "alterPolicy", js.Any.fromFunction1((t0: Parameters[AlterPolicy]) => value(t0).runNow()))
    
    inline def setAlterRole(value: Parameters[AlterRole] => Callback): Self = StObject.set(x, "alterRole", js.Any.fromFunction1((t0: Parameters[AlterRole]) => value(t0).runNow()))
    
    inline def setAlterSequence(value: Parameters[AlterSequence] => Callback): Self = StObject.set(x, "alterSequence", js.Any.fromFunction1((t0: Parameters[AlterSequence]) => value(t0).runNow()))
    
    inline def setAlterTable(value: Parameters[AlterTable] => Callback): Self = StObject.set(x, "alterTable", js.Any.fromFunction1((t0: Parameters[AlterTable]) => value(t0).runNow()))
    
    inline def setAlterView(value: Parameters[AlterView] => Callback): Self = StObject.set(x, "alterView", js.Any.fromFunction1((t0: Parameters[AlterView]) => value(t0).runNow()))
    
    inline def setAlterViewColumn(value: Parameters[AlterViewColumn] => Callback): Self = StObject.set(x, "alterViewColumn", js.Any.fromFunction1((t0: Parameters[AlterViewColumn]) => value(t0).runNow()))
    
    inline def setCreateConstraint(value: Parameters[CreateConstraint] => Callback): Self = StObject.set(x, "createConstraint", js.Any.fromFunction1((t0: Parameters[CreateConstraint]) => value(t0).runNow()))
    
    inline def setCreateDomain(value: Parameters[CreateDomain] => Callback): Self = StObject.set(x, "createDomain", js.Any.fromFunction1((t0: Parameters[CreateDomain]) => value(t0).runNow()))
    
    inline def setCreateExtension(value: Parameters[CreateExtension] => Callback): Self = StObject.set(x, "createExtension", js.Any.fromFunction1((t0: Parameters[CreateExtension]) => value(t0).runNow()))
    
    inline def setCreateFunction(value: Parameters[CreateFunction] => Callback): Self = StObject.set(x, "createFunction", js.Any.fromFunction1((t0: Parameters[CreateFunction]) => value(t0).runNow()))
    
    inline def setCreateIndex(value: Parameters[CreateIndex] => Callback): Self = StObject.set(x, "createIndex", js.Any.fromFunction1((t0: Parameters[CreateIndex]) => value(t0).runNow()))
    
    inline def setCreateMaterializedView(value: Parameters[CreateMaterializedView] => Callback): Self = StObject.set(x, "createMaterializedView", js.Any.fromFunction1((t0: Parameters[CreateMaterializedView]) => value(t0).runNow()))
    
    inline def setCreateOperator(value: Parameters[CreateOperator] => Callback): Self = StObject.set(x, "createOperator", js.Any.fromFunction1((t0: Parameters[CreateOperator]) => value(t0).runNow()))
    
    inline def setCreateOperatorClass(value: Parameters[CreateOperatorClass] => Callback): Self = StObject.set(x, "createOperatorClass", js.Any.fromFunction1((t0: Parameters[CreateOperatorClass]) => value(t0).runNow()))
    
    inline def setCreateOperatorFamily(value: Parameters[CreateOperatorFamily] => Callback): Self = StObject.set(x, "createOperatorFamily", js.Any.fromFunction1((t0: Parameters[CreateOperatorFamily]) => value(t0).runNow()))
    
    inline def setCreatePolicy(value: Parameters[CreatePolicy] => Callback): Self = StObject.set(x, "createPolicy", js.Any.fromFunction1((t0: Parameters[CreatePolicy]) => value(t0).runNow()))
    
    inline def setCreateRole(value: Parameters[CreateRole] => Callback): Self = StObject.set(x, "createRole", js.Any.fromFunction1((t0: Parameters[CreateRole]) => value(t0).runNow()))
    
    inline def setCreateSchema(value: Parameters[CreateSchema] => Callback): Self = StObject.set(x, "createSchema", js.Any.fromFunction1((t0: Parameters[CreateSchema]) => value(t0).runNow()))
    
    inline def setCreateSequence(value: Parameters[CreateSequence] => Callback): Self = StObject.set(x, "createSequence", js.Any.fromFunction1((t0: Parameters[CreateSequence]) => value(t0).runNow()))
    
    inline def setCreateTable(value: Parameters[CreateTable] => Callback): Self = StObject.set(x, "createTable", js.Any.fromFunction1((t0: Parameters[CreateTable]) => value(t0).runNow()))
    
    inline def setCreateTrigger(value: Parameters[CreateTrigger] => Callback): Self = StObject.set(x, "createTrigger", js.Any.fromFunction1((t0: Parameters[CreateTrigger]) => value(t0).runNow()))
    
    inline def setCreateType(value: Parameters[CreateType] => Callback): Self = StObject.set(x, "createType", js.Any.fromFunction1((t0: Parameters[CreateType]) => value(t0).runNow()))
    
    inline def setCreateView(value: Parameters[CreateView] => Callback): Self = StObject.set(x, "createView", js.Any.fromFunction1((t0: Parameters[CreateView]) => value(t0).runNow()))
    
    inline def setDb(value: DB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDropColumn(value: Parameters[DropColumns] => Callback): Self = StObject.set(x, "dropColumn", js.Any.fromFunction1((t0: Parameters[DropColumns]) => value(t0).runNow()))
    
    inline def setDropColumns(value: Parameters[DropColumns] => Callback): Self = StObject.set(x, "dropColumns", js.Any.fromFunction1((t0: Parameters[DropColumns]) => value(t0).runNow()))
    
    inline def setDropConstraint(value: Parameters[DropConstraint] => Callback): Self = StObject.set(x, "dropConstraint", js.Any.fromFunction1((t0: Parameters[DropConstraint]) => value(t0).runNow()))
    
    inline def setDropDomain(value: Parameters[DropDomain] => Callback): Self = StObject.set(x, "dropDomain", js.Any.fromFunction1((t0: Parameters[DropDomain]) => value(t0).runNow()))
    
    inline def setDropExtension(value: Parameters[DropExtension] => Callback): Self = StObject.set(x, "dropExtension", js.Any.fromFunction1((t0: Parameters[DropExtension]) => value(t0).runNow()))
    
    inline def setDropFunction(value: Parameters[DropFunction] => Callback): Self = StObject.set(x, "dropFunction", js.Any.fromFunction1((t0: Parameters[DropFunction]) => value(t0).runNow()))
    
    inline def setDropIndex(value: Parameters[DropIndex] => Callback): Self = StObject.set(x, "dropIndex", js.Any.fromFunction1((t0: Parameters[DropIndex]) => value(t0).runNow()))
    
    inline def setDropMaterializedView(value: Parameters[DropMaterializedView] => Callback): Self = StObject.set(x, "dropMaterializedView", js.Any.fromFunction1((t0: Parameters[DropMaterializedView]) => value(t0).runNow()))
    
    inline def setDropOperator(value: Parameters[DropOperator] => Callback): Self = StObject.set(x, "dropOperator", js.Any.fromFunction1((t0: Parameters[DropOperator]) => value(t0).runNow()))
    
    inline def setDropOperatorClass(value: Parameters[DropOperatorClass] => Callback): Self = StObject.set(x, "dropOperatorClass", js.Any.fromFunction1((t0: Parameters[DropOperatorClass]) => value(t0).runNow()))
    
    inline def setDropOperatorFamily(value: Parameters[DropOperatorFamily] => Callback): Self = StObject.set(x, "dropOperatorFamily", js.Any.fromFunction1((t0: Parameters[DropOperatorFamily]) => value(t0).runNow()))
    
    inline def setDropPolicy(value: Parameters[DropPolicy] => Callback): Self = StObject.set(x, "dropPolicy", js.Any.fromFunction1((t0: Parameters[DropPolicy]) => value(t0).runNow()))
    
    inline def setDropRole(value: Parameters[DropRole] => Callback): Self = StObject.set(x, "dropRole", js.Any.fromFunction1((t0: Parameters[DropRole]) => value(t0).runNow()))
    
    inline def setDropSchema(value: Parameters[DropSchema] => Callback): Self = StObject.set(x, "dropSchema", js.Any.fromFunction1((t0: Parameters[DropSchema]) => value(t0).runNow()))
    
    inline def setDropSequence(value: Parameters[DropSequence] => Callback): Self = StObject.set(x, "dropSequence", js.Any.fromFunction1((t0: Parameters[DropSequence]) => value(t0).runNow()))
    
    inline def setDropTable(value: Parameters[DropTable] => Callback): Self = StObject.set(x, "dropTable", js.Any.fromFunction1((t0: Parameters[DropTable]) => value(t0).runNow()))
    
    inline def setDropTrigger(value: Parameters[DropTrigger] => Callback): Self = StObject.set(x, "dropTrigger", js.Any.fromFunction1((t0: Parameters[DropTrigger]) => value(t0).runNow()))
    
    inline def setDropType(value: Parameters[DropType] => Callback): Self = StObject.set(x, "dropType", js.Any.fromFunction1((t0: Parameters[DropType]) => value(t0).runNow()))
    
    inline def setDropTypeAttribute(value: Parameters[DropTypeAttribute] => Callback): Self = StObject.set(x, "dropTypeAttribute", js.Any.fromFunction1((t0: Parameters[DropTypeAttribute]) => value(t0).runNow()))
    
    inline def setDropView(value: Parameters[DropView] => Callback): Self = StObject.set(x, "dropView", js.Any.fromFunction1((t0: Parameters[DropView]) => value(t0).runNow()))
    
    inline def setFunc(value: String => default): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
    
    inline def setNoTransaction(value: Callback): Self = StObject.set(x, "noTransaction", value.toJsFn)
    
    inline def setRefreshMaterializedView(value: Parameters[RefreshMaterializedView] => Callback): Self = StObject.set(x, "refreshMaterializedView", js.Any.fromFunction1((t0: Parameters[RefreshMaterializedView]) => value(t0).runNow()))
    
    inline def setRemoveFromOperatorFamily(value: Parameters[RemoveFromOperatorFamily] => Callback): Self = StObject.set(x, "removeFromOperatorFamily", js.Any.fromFunction1((t0: Parameters[RemoveFromOperatorFamily]) => value(t0).runNow()))
    
    inline def setRenameColumn(value: Parameters[RenameColumn] => Callback): Self = StObject.set(x, "renameColumn", js.Any.fromFunction1((t0: Parameters[RenameColumn]) => value(t0).runNow()))
    
    inline def setRenameConstraint(value: Parameters[RenameConstraint] => Callback): Self = StObject.set(x, "renameConstraint", js.Any.fromFunction1((t0: Parameters[RenameConstraint]) => value(t0).runNow()))
    
    inline def setRenameDomain(value: Parameters[RenameDomain] => Callback): Self = StObject.set(x, "renameDomain", js.Any.fromFunction1((t0: Parameters[RenameDomain]) => value(t0).runNow()))
    
    inline def setRenameFunction(value: Parameters[RenameFunction] => Callback): Self = StObject.set(x, "renameFunction", js.Any.fromFunction1((t0: Parameters[RenameFunction]) => value(t0).runNow()))
    
    inline def setRenameMaterializedView(value: Parameters[RenameMaterializedView] => Callback): Self = StObject.set(x, "renameMaterializedView", js.Any.fromFunction1((t0: Parameters[RenameMaterializedView]) => value(t0).runNow()))
    
    inline def setRenameMaterializedViewColumn(value: Parameters[RenameMaterializedViewColumn] => Callback): Self = StObject.set(x, "renameMaterializedViewColumn", js.Any.fromFunction1((t0: Parameters[RenameMaterializedViewColumn]) => value(t0).runNow()))
    
    inline def setRenameOperatorClass(value: Parameters[RenameOperatorClass] => Callback): Self = StObject.set(x, "renameOperatorClass", js.Any.fromFunction1((t0: Parameters[RenameOperatorClass]) => value(t0).runNow()))
    
    inline def setRenameOperatorFamily(value: Parameters[RenameOperatorFamily] => Callback): Self = StObject.set(x, "renameOperatorFamily", js.Any.fromFunction1((t0: Parameters[RenameOperatorFamily]) => value(t0).runNow()))
    
    inline def setRenamePolicy(value: Parameters[RenamePolicy] => Callback): Self = StObject.set(x, "renamePolicy", js.Any.fromFunction1((t0: Parameters[RenamePolicy]) => value(t0).runNow()))
    
    inline def setRenameRole(value: Parameters[RenameRole] => Callback): Self = StObject.set(x, "renameRole", js.Any.fromFunction1((t0: Parameters[RenameRole]) => value(t0).runNow()))
    
    inline def setRenameSchema(value: Parameters[RenameSchema] => Callback): Self = StObject.set(x, "renameSchema", js.Any.fromFunction1((t0: Parameters[RenameSchema]) => value(t0).runNow()))
    
    inline def setRenameSequence(value: Parameters[RenameSequence] => Callback): Self = StObject.set(x, "renameSequence", js.Any.fromFunction1((t0: Parameters[RenameSequence]) => value(t0).runNow()))
    
    inline def setRenameTable(value: Parameters[RenameTable] => Callback): Self = StObject.set(x, "renameTable", js.Any.fromFunction1((t0: Parameters[RenameTable]) => value(t0).runNow()))
    
    inline def setRenameTrigger(value: Parameters[RenameTrigger] => Callback): Self = StObject.set(x, "renameTrigger", js.Any.fromFunction1((t0: Parameters[RenameTrigger]) => value(t0).runNow()))
    
    inline def setRenameType(value: Parameters[RenameType] => Callback): Self = StObject.set(x, "renameType", js.Any.fromFunction1((t0: Parameters[RenameType]) => value(t0).runNow()))
    
    inline def setRenameTypeAttribute(value: Parameters[RenameTypeAttribute] => Callback): Self = StObject.set(x, "renameTypeAttribute", js.Any.fromFunction1((t0: Parameters[RenameTypeAttribute]) => value(t0).runNow()))
    
    inline def setRenameTypeValue(value: Parameters[RenameTypeValue] => Callback): Self = StObject.set(x, "renameTypeValue", js.Any.fromFunction1((t0: Parameters[RenameTypeValue]) => value(t0).runNow()))
    
    inline def setRenameView(value: Parameters[RenameView] => Callback): Self = StObject.set(x, "renameView", js.Any.fromFunction1((t0: Parameters[RenameView]) => value(t0).runNow()))
    
    inline def setSetTypeAttribute(value: Parameters[SetTypeAttribute] => Callback): Self = StObject.set(x, "setTypeAttribute", js.Any.fromFunction1((t0: Parameters[SetTypeAttribute]) => value(t0).runNow()))
    
    inline def setSql(value: Parameters[Sql] => Callback): Self = StObject.set(x, "sql", js.Any.fromFunction1((t0: Parameters[Sql]) => value(t0).runNow()))
  }
}
