package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.ArrayType
import typingsJapgolly.angularCompiler.mod.BinaryOperatorExpr
import typingsJapgolly.angularCompiler.mod.BuiltinType
import typingsJapgolly.angularCompiler.mod.CommaExpr
import typingsJapgolly.angularCompiler.mod.ConditionalExpr
import typingsJapgolly.angularCompiler.mod.ExpressionType
import typingsJapgolly.angularCompiler.mod.ExpressionVisitor
import typingsJapgolly.angularCompiler.mod.ExternalExpr
import typingsJapgolly.angularCompiler.mod.FunctionExpr
import typingsJapgolly.angularCompiler.mod.InstantiateExpr
import typingsJapgolly.angularCompiler.mod.InvokeFunctionExpr
import typingsJapgolly.angularCompiler.mod.LiteralArrayExpr
import typingsJapgolly.angularCompiler.mod.LiteralExpr
import typingsJapgolly.angularCompiler.mod.LiteralMapExpr
import typingsJapgolly.angularCompiler.mod.LocalizedString
import typingsJapgolly.angularCompiler.mod.MapType
import typingsJapgolly.angularCompiler.mod.NotExpr
import typingsJapgolly.angularCompiler.mod.ReadKeyExpr
import typingsJapgolly.angularCompiler.mod.ReadPropExpr
import typingsJapgolly.angularCompiler.mod.ReadVarExpr
import typingsJapgolly.angularCompiler.mod.TaggedTemplateExpr
import typingsJapgolly.angularCompiler.mod.Type
import typingsJapgolly.angularCompiler.mod.TypeVisitor
import typingsJapgolly.angularCompiler.mod.TypeofExpr
import typingsJapgolly.angularCompiler.mod.UnaryOperatorExpr
import typingsJapgolly.angularCompiler.mod.WrappedNodeExpr
import typingsJapgolly.angularCompiler.mod.WriteKeyExpr
import typingsJapgolly.angularCompiler.mod.WritePropExpr
import typingsJapgolly.angularCompiler.mod.WriteVarExpr
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcContextMod.Context
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcImportManagerMod.ImportManager
import typingsJapgolly.typescript.mod.ArrayTypeNode
import typingsJapgolly.typescript.mod.EntityName
import typingsJapgolly.typescript.mod.KeywordTypeNode
import typingsJapgolly.typescript.mod.KeywordTypeSyntaxKind
import typingsJapgolly.typescript.mod.TupleTypeNode
import typingsJapgolly.typescript.mod.TypeLiteralNode
import typingsJapgolly.typescript.mod.TypeNode
import typingsJapgolly.typescript.mod.TypeQueryNode
import typingsJapgolly.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorSrcTypeTranslatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/type_translator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/type_translator", "TypeTranslatorVisitor")
  @js.native
  open class TypeTranslatorVisitor protected ()
    extends StObject
       with ExpressionVisitor
       with TypeVisitor {
    def this(imports: ImportManager) = this()
    
    /* private */ var imports: Any = js.native
    
    /* private */ var translateExpression: Any = js.native
    
    /* private */ var translateType: Any = js.native
    
    /* CompleteClass */
    override def visitArrayType(`type`: ArrayType, context: Any): Any = js.native
    def visitArrayType(`type`: ArrayType, context: Context): ArrayTypeNode = js.native
    
    /* CompleteClass */
    override def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: Any): Any = js.native
    def visitBinaryOperatorExpr(ast: BinaryOperatorExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitBuiltinType(`type`: BuiltinType, context: Any): Any = js.native
    def visitBuiltinType(`type`: BuiltinType, context: Context): KeywordTypeNode[KeywordTypeSyntaxKind] = js.native
    
    /* CompleteClass */
    override def visitCommaExpr(ast: CommaExpr, context: Any): Any = js.native
    def visitCommaExpr(ast: CommaExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitConditionalExpr(ast: ConditionalExpr, context: Any): Any = js.native
    def visitConditionalExpr(ast: ConditionalExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitExpressionType(`type`: ExpressionType, context: Any): Any = js.native
    def visitExpressionType(`type`: ExpressionType, context: Context): TypeNode = js.native
    
    /* CompleteClass */
    override def visitExternalExpr(ast: ExternalExpr, context: Any): Any = js.native
    def visitExternalExpr(ast: ExternalExpr, context: Context): EntityName | TypeReferenceNode = js.native
    
    /* CompleteClass */
    override def visitFunctionExpr(ast: FunctionExpr, context: Any): Any = js.native
    def visitFunctionExpr(ast: FunctionExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitInstantiateExpr(ast: InstantiateExpr, context: Any): Any = js.native
    def visitInstantiateExpr(ast: InstantiateExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: Any): Any = js.native
    def visitInvokeFunctionExpr(ast: InvokeFunctionExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: Any): Any = js.native
    def visitLiteralArrayExpr(ast: LiteralArrayExpr, context: Context): TupleTypeNode = js.native
    
    /* CompleteClass */
    override def visitLiteralExpr(ast: LiteralExpr, context: Any): Any = js.native
    def visitLiteralExpr(ast: LiteralExpr, context: Context): TypeNode = js.native
    
    /* CompleteClass */
    override def visitLiteralMapExpr(ast: LiteralMapExpr, context: Any): Any = js.native
    def visitLiteralMapExpr(ast: LiteralMapExpr, context: Context): TypeLiteralNode = js.native
    
    /* CompleteClass */
    override def visitLocalizedString(ast: LocalizedString, context: Any): Any = js.native
    def visitLocalizedString(ast: LocalizedString, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitMapType(`type`: MapType, context: Any): Any = js.native
    def visitMapType(`type`: MapType, context: Context): TypeLiteralNode = js.native
    
    /* CompleteClass */
    override def visitNotExpr(ast: NotExpr, context: Any): Any = js.native
    def visitNotExpr(ast: NotExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitReadKeyExpr(ast: ReadKeyExpr, context: Any): Any = js.native
    def visitReadKeyExpr(ast: ReadKeyExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitReadPropExpr(ast: ReadPropExpr, context: Any): Any = js.native
    def visitReadPropExpr(ast: ReadPropExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitReadVarExpr(ast: ReadVarExpr, context: Any): Any = js.native
    def visitReadVarExpr(ast: ReadVarExpr, context: Context): TypeQueryNode = js.native
    
    /* CompleteClass */
    override def visitTaggedTemplateExpr(ast: TaggedTemplateExpr, context: Any): Any = js.native
    def visitTaggedTemplateExpr(ast: TaggedTemplateExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitTypeofExpr(ast: TypeofExpr, context: Any): Any = js.native
    def visitTypeofExpr(ast: TypeofExpr, context: Context): TypeQueryNode = js.native
    
    /* CompleteClass */
    override def visitUnaryOperatorExpr(ast: UnaryOperatorExpr, context: Any): Any = js.native
    def visitUnaryOperatorExpr(ast: UnaryOperatorExpr, context: Context): Unit = js.native
    
    /* CompleteClass */
    override def visitWrappedNodeExpr(ast: WrappedNodeExpr[Any], context: Any): Any = js.native
    def visitWrappedNodeExpr(ast: WrappedNodeExpr[Any], context: Context): TypeNode = js.native
    
    /* CompleteClass */
    override def visitWriteKeyExpr(expr: WriteKeyExpr, context: Any): Any = js.native
    def visitWriteKeyExpr(expr: WriteKeyExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitWritePropExpr(expr: WritePropExpr, context: Any): Any = js.native
    def visitWritePropExpr(expr: WritePropExpr, context: Context): scala.Nothing = js.native
    
    /* CompleteClass */
    override def visitWriteVarExpr(expr: WriteVarExpr, context: Any): Any = js.native
    def visitWriteVarExpr(expr: WriteVarExpr, context: Context): scala.Nothing = js.native
  }
  
  inline def translateType(`type`: Type, imports: ImportManager): TypeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("translateType")(`type`.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[TypeNode]
}
