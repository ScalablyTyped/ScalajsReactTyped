package typingsJapgolly.nodePgMigrate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.ColumnDefinitions
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
import typingsJapgolly.nodePgMigrate.distTypesMod.DB
import typingsJapgolly.nodePgMigrate.distTypesMod.Logger
import typingsJapgolly.nodePgMigrate.distTypesMod.MigrationBuilder
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMigrationBuilderMod {
  
  @JSImport("node-pg-migrate/dist/migration-builder", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MigrationBuilderImpl {
    def this(db: DB, typeShorthands: Unit, shouldDecamelize: Boolean, logger: Logger) = this()
    def this(db: DB, typeShorthands: ColumnDefinitions, shouldDecamelize: Boolean, logger: Logger) = this()
    
    /* private */ /* CompleteClass */
    var _REVERSE_MODE: Any = js.native
    
    /* private */ /* CompleteClass */
    var _steps: Any = js.native
    
    /* private */ /* CompleteClass */
    var _useTransaction: Any = js.native
    
    /* CompleteClass */
    override def addColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addColumns(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AddColumns> is not an array type */ args: Parameters[AddColumns]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addConstraint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addExtension(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addIndex(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addToOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.AddToOperatorFamily> is not an array type */ args: Parameters[AddToOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addType(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addTypeAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeAttribute> is not an array type */ args: Parameters[AddTypeAttribute]
    ): Unit = js.native
    
    /* CompleteClass */
    override def addTypeValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.AddTypeValue> is not an array type */ args: Parameters[AddTypeValue]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterColumn> is not an array type */ args: Parameters[AlterColumn]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterDomain(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.AlterDomain> is not an array type */ args: Parameters[AlterDomain]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.AlterMaterializedView> is not an array type */ args: Parameters[AlterMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterPolicy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.AlterPolicy> is not an array type */ args: Parameters[AlterPolicy]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.AlterRole> is not an array type */ args: Parameters[AlterRole]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterSequence(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.AlterSequence> is not an array type */ args: Parameters[AlterSequence]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterTable(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.AlterTable> is not an array type */ args: Parameters[AlterTable]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterView> is not an array type */ args: Parameters[AlterView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def alterViewColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.AlterViewColumn> is not an array type */ args: Parameters[AlterViewColumn]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createConstraint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateConstraint> is not an array type */ args: Parameters[CreateConstraint]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createDomain(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.CreateDomain> is not an array type */ args: Parameters[CreateDomain]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createExtension(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.CreateExtension> is not an array type */ args: Parameters[CreateExtension]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createFunction(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.CreateFunction> is not an array type */ args: Parameters[CreateFunction]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createIndex(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.CreateIndex> is not an array type */ args: Parameters[CreateIndex]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.CreateMaterializedView> is not an array type */ args: Parameters[CreateMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createOperator(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperator> is not an array type */ args: Parameters[CreateOperator]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createOperatorClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorClass> is not an array type */ args: Parameters[CreateOperatorClass]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.CreateOperatorFamily> is not an array type */ args: Parameters[CreateOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createPolicy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.CreatePolicy> is not an array type */ args: Parameters[CreatePolicy]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.CreateRole> is not an array type */ args: Parameters[CreateRole]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createSchema(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.CreateSchema> is not an array type */ args: Parameters[CreateSchema]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createSequence(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.CreateSequence> is not an array type */ args: Parameters[CreateSequence]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createTable(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.CreateTable> is not an array type */ args: Parameters[CreateTable]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createTrigger(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.CreateTrigger> is not an array type */ args: Parameters[CreateTrigger]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createType(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.CreateType> is not an array type */ args: Parameters[CreateType]
    ): Unit = js.native
    
    /* CompleteClass */
    override def createView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.CreateView> is not an array type */ args: Parameters[CreateView]
    ): Unit = js.native
    
    /* CompleteClass */
    var db: DB = js.native
    
    /* CompleteClass */
    override def dropColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropColumns(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropColumns> is not an array type */ args: Parameters[DropColumns]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropConstraint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropConstraint> is not an array type */ args: Parameters[DropConstraint]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropDomain(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.DropDomain> is not an array type */ args: Parameters[DropDomain]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropExtension(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<extensions.DropExtension> is not an array type */ args: Parameters[DropExtension]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropFunction(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.DropFunction> is not an array type */ args: Parameters[DropFunction]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropIndex(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<indexes.DropIndex> is not an array type */ args: Parameters[DropIndex]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.DropMaterializedView> is not an array type */ args: Parameters[DropMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropOperator(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperator> is not an array type */ args: Parameters[DropOperator]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropOperatorClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorClass> is not an array type */ args: Parameters[DropOperatorClass]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.DropOperatorFamily> is not an array type */ args: Parameters[DropOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropPolicy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.DropPolicy> is not an array type */ args: Parameters[DropPolicy]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.DropRole> is not an array type */ args: Parameters[DropRole]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropSchema(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.DropSchema> is not an array type */ args: Parameters[DropSchema]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropSequence(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.DropSequence> is not an array type */ args: Parameters[DropSequence]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropTable(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.DropTable> is not an array type */ args: Parameters[DropTable]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropTrigger(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.DropTrigger> is not an array type */ args: Parameters[DropTrigger]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropType(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropType> is not an array type */ args: Parameters[DropType]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropTypeAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.DropTypeAttribute> is not an array type */ args: Parameters[DropTypeAttribute]
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.DropView> is not an array type */ args: Parameters[DropView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def enableReverseMode(): this.type = js.native
    
    /* CompleteClass */
    override def func(sql: String): typingsJapgolly.nodePgMigrate.distOperationsPgLiteralMod.default = js.native
    
    /* CompleteClass */
    override def getSql(): String = js.native
    
    /* CompleteClass */
    override def getSqlSteps(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def isUsingTransaction(): Boolean = js.native
    
    /* CompleteClass */
    override def noTransaction(): Unit = js.native
    
    /* CompleteClass */
    override def refreshMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RefreshMaterializedView> is not an array type */ args: Parameters[RefreshMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def removeFromOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RemoveFromOperatorFamily> is not an array type */ args: Parameters[RemoveFromOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameColumn> is not an array type */ args: Parameters[RenameColumn]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameConstraint(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameConstraint> is not an array type */ args: Parameters[RenameConstraint]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameDomain(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<domains.RenameDomain> is not an array type */ args: Parameters[RenameDomain]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameFunction(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<functions.RenameFunction> is not an array type */ args: Parameters[RenameFunction]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameMaterializedView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedView> is not an array type */ args: Parameters[RenameMaterializedView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameMaterializedViewColumn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<mViews.RenameMaterializedViewColumn> is not an array type */ args: Parameters[RenameMaterializedViewColumn]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameOperatorClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorClass> is not an array type */ args: Parameters[RenameOperatorClass]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameOperatorFamily(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<operators.RenameOperatorFamily> is not an array type */ args: Parameters[RenameOperatorFamily]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renamePolicy(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<policies.RenamePolicy> is not an array type */ args: Parameters[RenamePolicy]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameRole(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<roles.RenameRole> is not an array type */ args: Parameters[RenameRole]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameSchema(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<schemas.RenameSchema> is not an array type */ args: Parameters[RenameSchema]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameSequence(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<sequences.RenameSequence> is not an array type */ args: Parameters[RenameSequence]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameTable(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<tables.RenameTable> is not an array type */ args: Parameters[RenameTable]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameTrigger(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<triggers.RenameTrigger> is not an array type */ args: Parameters[RenameTrigger]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameType(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameType> is not an array type */ args: Parameters[RenameType]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameTypeAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeAttribute> is not an array type */ args: Parameters[RenameTypeAttribute]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameTypeValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.RenameTypeValue> is not an array type */ args: Parameters[RenameTypeValue]
    ): Unit = js.native
    
    /* CompleteClass */
    override def renameView(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<views.RenameView> is not an array type */ args: Parameters[RenameView]
    ): Unit = js.native
    
    /* CompleteClass */
    override def setTypeAttribute(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<types.SetTypeAttribute> is not an array type */ args: Parameters[SetTypeAttribute]
    ): Unit = js.native
    
    /* CompleteClass */
    override def sql(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<other.Sql> is not an array type */ args: Parameters[Sql]
    ): Unit = js.native
  }
  
  trait MigrationBuilderImpl
    extends StObject
       with MigrationBuilder {
    
    /* private */ var _REVERSE_MODE: Any
    
    /* private */ var _steps: Any
    
    /* private */ var _useTransaction: Any
    
    def enableReverseMode(): this.type
    
    def getSql(): String
    
    def getSqlSteps(): js.Array[String]
    
    def isUsingTransaction(): Boolean
  }
  object MigrationBuilderImpl {
    
    inline def apply(
      _REVERSE_MODE: Any,
      _steps: Any,
      _useTransaction: Any,
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
      enableReverseMode: CallbackTo[MigrationBuilderImpl],
      func: String => typingsJapgolly.nodePgMigrate.distOperationsPgLiteralMod.default,
      getSql: CallbackTo[String],
      getSqlSteps: CallbackTo[js.Array[String]],
      isUsingTransaction: CallbackTo[Boolean],
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
    ): MigrationBuilderImpl = {
      val __obj = js.Dynamic.literal(_REVERSE_MODE = _REVERSE_MODE.asInstanceOf[js.Any], _steps = _steps.asInstanceOf[js.Any], _useTransaction = _useTransaction.asInstanceOf[js.Any], addColumn = js.Any.fromFunction1((t0: Parameters[AddColumns]) => addColumn(t0).runNow()), addColumns = js.Any.fromFunction1((t0: Parameters[AddColumns]) => addColumns(t0).runNow()), addConstraint = js.Any.fromFunction1((t0: Parameters[CreateConstraint]) => addConstraint(t0).runNow()), addExtension = js.Any.fromFunction1((t0: Parameters[CreateExtension]) => addExtension(t0).runNow()), addIndex = js.Any.fromFunction1((t0: Parameters[CreateIndex]) => addIndex(t0).runNow()), addToOperatorFamily = js.Any.fromFunction1((t0: Parameters[AddToOperatorFamily]) => addToOperatorFamily(t0).runNow()), addType = js.Any.fromFunction1((t0: Parameters[CreateType]) => addType(t0).runNow()), addTypeAttribute = js.Any.fromFunction1((t0: Parameters[AddTypeAttribute]) => addTypeAttribute(t0).runNow()), addTypeValue = js.Any.fromFunction1((t0: Parameters[AddTypeValue]) => addTypeValue(t0).runNow()), alterColumn = js.Any.fromFunction1((t0: Parameters[AlterColumn]) => alterColumn(t0).runNow()), alterDomain = js.Any.fromFunction1((t0: Parameters[AlterDomain]) => alterDomain(t0).runNow()), alterMaterializedView = js.Any.fromFunction1((t0: Parameters[AlterMaterializedView]) => alterMaterializedView(t0).runNow()), alterPolicy = js.Any.fromFunction1((t0: Parameters[AlterPolicy]) => alterPolicy(t0).runNow()), alterRole = js.Any.fromFunction1((t0: Parameters[AlterRole]) => alterRole(t0).runNow()), alterSequence = js.Any.fromFunction1((t0: Parameters[AlterSequence]) => alterSequence(t0).runNow()), alterTable = js.Any.fromFunction1((t0: Parameters[AlterTable]) => alterTable(t0).runNow()), alterView = js.Any.fromFunction1((t0: Parameters[AlterView]) => alterView(t0).runNow()), alterViewColumn = js.Any.fromFunction1((t0: Parameters[AlterViewColumn]) => alterViewColumn(t0).runNow()), createConstraint = js.Any.fromFunction1((t0: Parameters[CreateConstraint]) => createConstraint(t0).runNow()), createDomain = js.Any.fromFunction1((t0: Parameters[CreateDomain]) => createDomain(t0).runNow()), createExtension = js.Any.fromFunction1((t0: Parameters[CreateExtension]) => createExtension(t0).runNow()), createFunction = js.Any.fromFunction1((t0: Parameters[CreateFunction]) => createFunction(t0).runNow()), createIndex = js.Any.fromFunction1((t0: Parameters[CreateIndex]) => createIndex(t0).runNow()), createMaterializedView = js.Any.fromFunction1((t0: Parameters[CreateMaterializedView]) => createMaterializedView(t0).runNow()), createOperator = js.Any.fromFunction1((t0: Parameters[CreateOperator]) => createOperator(t0).runNow()), createOperatorClass = js.Any.fromFunction1((t0: Parameters[CreateOperatorClass]) => createOperatorClass(t0).runNow()), createOperatorFamily = js.Any.fromFunction1((t0: Parameters[CreateOperatorFamily]) => createOperatorFamily(t0).runNow()), createPolicy = js.Any.fromFunction1((t0: Parameters[CreatePolicy]) => createPolicy(t0).runNow()), createRole = js.Any.fromFunction1((t0: Parameters[CreateRole]) => createRole(t0).runNow()), createSchema = js.Any.fromFunction1((t0: Parameters[CreateSchema]) => createSchema(t0).runNow()), createSequence = js.Any.fromFunction1((t0: Parameters[CreateSequence]) => createSequence(t0).runNow()), createTable = js.Any.fromFunction1((t0: Parameters[CreateTable]) => createTable(t0).runNow()), createTrigger = js.Any.fromFunction1((t0: Parameters[CreateTrigger]) => createTrigger(t0).runNow()), createType = js.Any.fromFunction1((t0: Parameters[CreateType]) => createType(t0).runNow()), createView = js.Any.fromFunction1((t0: Parameters[CreateView]) => createView(t0).runNow()), db = db.asInstanceOf[js.Any], dropColumn = js.Any.fromFunction1((t0: Parameters[DropColumns]) => dropColumn(t0).runNow()), dropColumns = js.Any.fromFunction1((t0: Parameters[DropColumns]) => dropColumns(t0).runNow()), dropConstraint = js.Any.fromFunction1((t0: Parameters[DropConstraint]) => dropConstraint(t0).runNow()), dropDomain = js.Any.fromFunction1((t0: Parameters[DropDomain]) => dropDomain(t0).runNow()), dropExtension = js.Any.fromFunction1((t0: Parameters[DropExtension]) => dropExtension(t0).runNow()), dropFunction = js.Any.fromFunction1((t0: Parameters[DropFunction]) => dropFunction(t0).runNow()), dropIndex = js.Any.fromFunction1((t0: Parameters[DropIndex]) => dropIndex(t0).runNow()), dropMaterializedView = js.Any.fromFunction1((t0: Parameters[DropMaterializedView]) => dropMaterializedView(t0).runNow()), dropOperator = js.Any.fromFunction1((t0: Parameters[DropOperator]) => dropOperator(t0).runNow()), dropOperatorClass = js.Any.fromFunction1((t0: Parameters[DropOperatorClass]) => dropOperatorClass(t0).runNow()), dropOperatorFamily = js.Any.fromFunction1((t0: Parameters[DropOperatorFamily]) => dropOperatorFamily(t0).runNow()), dropPolicy = js.Any.fromFunction1((t0: Parameters[DropPolicy]) => dropPolicy(t0).runNow()), dropRole = js.Any.fromFunction1((t0: Parameters[DropRole]) => dropRole(t0).runNow()), dropSchema = js.Any.fromFunction1((t0: Parameters[DropSchema]) => dropSchema(t0).runNow()), dropSequence = js.Any.fromFunction1((t0: Parameters[DropSequence]) => dropSequence(t0).runNow()), dropTable = js.Any.fromFunction1((t0: Parameters[DropTable]) => dropTable(t0).runNow()), dropTrigger = js.Any.fromFunction1((t0: Parameters[DropTrigger]) => dropTrigger(t0).runNow()), dropType = js.Any.fromFunction1((t0: Parameters[DropType]) => dropType(t0).runNow()), dropTypeAttribute = js.Any.fromFunction1((t0: Parameters[DropTypeAttribute]) => dropTypeAttribute(t0).runNow()), dropView = js.Any.fromFunction1((t0: Parameters[DropView]) => dropView(t0).runNow()), enableReverseMode = enableReverseMode.toJsFn, func = js.Any.fromFunction1(func), getSql = getSql.toJsFn, getSqlSteps = getSqlSteps.toJsFn, isUsingTransaction = isUsingTransaction.toJsFn, noTransaction = noTransaction.toJsFn, refreshMaterializedView = js.Any.fromFunction1((t0: Parameters[RefreshMaterializedView]) => refreshMaterializedView(t0).runNow()), removeFromOperatorFamily = js.Any.fromFunction1((t0: Parameters[RemoveFromOperatorFamily]) => removeFromOperatorFamily(t0).runNow()), renameColumn = js.Any.fromFunction1((t0: Parameters[RenameColumn]) => renameColumn(t0).runNow()), renameConstraint = js.Any.fromFunction1((t0: Parameters[RenameConstraint]) => renameConstraint(t0).runNow()), renameDomain = js.Any.fromFunction1((t0: Parameters[RenameDomain]) => renameDomain(t0).runNow()), renameFunction = js.Any.fromFunction1((t0: Parameters[RenameFunction]) => renameFunction(t0).runNow()), renameMaterializedView = js.Any.fromFunction1((t0: Parameters[RenameMaterializedView]) => renameMaterializedView(t0).runNow()), renameMaterializedViewColumn = js.Any.fromFunction1((t0: Parameters[RenameMaterializedViewColumn]) => renameMaterializedViewColumn(t0).runNow()), renameOperatorClass = js.Any.fromFunction1((t0: Parameters[RenameOperatorClass]) => renameOperatorClass(t0).runNow()), renameOperatorFamily = js.Any.fromFunction1((t0: Parameters[RenameOperatorFamily]) => renameOperatorFamily(t0).runNow()), renamePolicy = js.Any.fromFunction1((t0: Parameters[RenamePolicy]) => renamePolicy(t0).runNow()), renameRole = js.Any.fromFunction1((t0: Parameters[RenameRole]) => renameRole(t0).runNow()), renameSchema = js.Any.fromFunction1((t0: Parameters[RenameSchema]) => renameSchema(t0).runNow()), renameSequence = js.Any.fromFunction1((t0: Parameters[RenameSequence]) => renameSequence(t0).runNow()), renameTable = js.Any.fromFunction1((t0: Parameters[RenameTable]) => renameTable(t0).runNow()), renameTrigger = js.Any.fromFunction1((t0: Parameters[RenameTrigger]) => renameTrigger(t0).runNow()), renameType = js.Any.fromFunction1((t0: Parameters[RenameType]) => renameType(t0).runNow()), renameTypeAttribute = js.Any.fromFunction1((t0: Parameters[RenameTypeAttribute]) => renameTypeAttribute(t0).runNow()), renameTypeValue = js.Any.fromFunction1((t0: Parameters[RenameTypeValue]) => renameTypeValue(t0).runNow()), renameView = js.Any.fromFunction1((t0: Parameters[RenameView]) => renameView(t0).runNow()), setTypeAttribute = js.Any.fromFunction1((t0: Parameters[SetTypeAttribute]) => setTypeAttribute(t0).runNow()), sql = js.Any.fromFunction1((t0: Parameters[Sql]) => sql(t0).runNow()))
      __obj.asInstanceOf[MigrationBuilderImpl]
    }
    
    extension [Self <: MigrationBuilderImpl](x: Self) {
      
      inline def setEnableReverseMode(value: CallbackTo[MigrationBuilderImpl]): Self = StObject.set(x, "enableReverseMode", value.toJsFn)
      
      inline def setGetSql(value: CallbackTo[String]): Self = StObject.set(x, "getSql", value.toJsFn)
      
      inline def setGetSqlSteps(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getSqlSteps", value.toJsFn)
      
      inline def setIsUsingTransaction(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUsingTransaction", value.toJsFn)
      
      inline def set_REVERSE_MODE(value: Any): Self = StObject.set(x, "_REVERSE_MODE", value.asInstanceOf[js.Any])
      
      inline def set_steps(value: Any): Self = StObject.set(x, "_steps", value.asInstanceOf[js.Any])
      
      inline def set_useTransaction(value: Any): Self = StObject.set(x, "_useTransaction", value.asInstanceOf[js.Any])
    }
  }
}
