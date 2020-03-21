package typingsJapgolly.relayCompiler

import typingsJapgolly.graphql.astMod.ASTNode
import typingsJapgolly.graphql.astMod.DefinitionNode
import typingsJapgolly.graphql.definitionMod.GraphQLType
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.relayCompiler.compilerContextMod.CompilerContextDocument
import typingsJapgolly.relayCompiler.compilerContextMod.IRTransform
import typingsJapgolly.relayCompiler.iRMod.Fragment
import typingsJapgolly.relayCompiler.iRMod.Location
import typingsJapgolly.relayCompiler.iRMod.Root
import typingsJapgolly.relayCompiler.irvisitorMod.NodeVisitor
import typingsJapgolly.relayCompiler.irvisitorMod.VisitNode
import typingsJapgolly.relayCompiler.relayCompilerErrorMod.UserError
import typingsJapgolly.relayCompiler.relayCompilerMainMod.Config
import typingsJapgolly.relayCompiler.schemaMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CompilerContext protected ()
    extends typingsJapgolly.relayCompiler.compilerContextMod.CompilerContext {
    def this(schema: Schema) = this()
  }
  
  @js.native
  class ConsoleReporter ()
    extends typingsJapgolly.relayCompiler.consoleReporterMod.ConsoleReporter {
    /* CompleteClass */
    override def reportError(caughtLocation: String, error: js.Error): Unit = js.native
    /* CompleteClass */
    override def reportMessage(message: String): Unit = js.native
    /* CompleteClass */
    override def reportTime(name: String, ms: Double): Unit = js.native
  }
  
  @js.native
  class MultiReporter ()
    extends typingsJapgolly.relayCompiler.multiReporterMod.MultiReporter {
    /* CompleteClass */
    override def reportError(caughtLocation: String, error: js.Error): Unit = js.native
    /* CompleteClass */
    override def reportMessage(message: String): Unit = js.native
    /* CompleteClass */
    override def reportTime(name: String, ms: Double): Unit = js.native
  }
  
  var transformASTSchema: js.Function2[/* schema */ GraphQLSchema, /* schemaExtensions */ js.Array[String], GraphQLSchema] = js.native
  def createUserError(message: String): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location]): UserError = js.native
  def createUserError(message: String, locations: js.Array[Location], nodes: js.Array[ASTNode]): UserError = js.native
  def relayCompiler(config: Config): js.Promise[Unit] = js.native
  @js.native
  object ASTConvert extends js.Object {
    def transformASTSchema(schema: GraphQLSchema, schemaExtensions: js.Array[String]): GraphQLSchema = js.native
  }
  
  @js.native
  object IRTransforms extends js.Object {
    val codegenTransforms: js.Array[IRTransform] = js.native
    val commonTransforms: js.Array[IRTransform] = js.native
    val fragmentTransforms: js.Array[IRTransform] = js.native
    val printTransforms: js.Array[IRTransform] = js.native
    val queryTransforms: js.Array[IRTransform] = js.native
    val schemaExtensions: js.Array[String] = js.native
  }
  
  @js.native
  object IRVisitor extends js.Object {
    def visit(root: VisitNode, visitor: NodeVisitor): js.Any = js.native
  }
  
  @js.native
  object Parser extends js.Object {
    def parse(schema: Schema, text: String): js.Array[Root | Fragment] = js.native
    def parse(schema: Schema, text: String, filename: String): js.Array[Root | Fragment] = js.native
    def transform(schema: Schema, documents: js.Array[DefinitionNode]): js.Array[Root | Fragment] = js.native
  }
  
  @js.native
  object Printer extends js.Object {
    def print(node: CompilerContextDocument): String = js.native
  }
  
  @js.native
  object SchemaUtils extends js.Object {
    def isAbstractType(`type`: GraphQLType): Boolean = js.native
  }
  
}

