package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.constructor
import typingsJapgolly.babelTypes.babelTypesStrings.get
import typingsJapgolly.babelTypes.babelTypesStrings.method_
import typingsJapgolly.babelTypes.babelTypesStrings.module
import typingsJapgolly.babelTypes.babelTypesStrings.script
import typingsJapgolly.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.BlockStatement_
  - typingsJapgolly.babelTypes.libMod.CatchClause_
  - typingsJapgolly.babelTypes.libMod.DoWhileStatement_
  - typingsJapgolly.babelTypes.libMod.ForInStatement_
  - typingsJapgolly.babelTypes.libMod.ForStatement_
  - typingsJapgolly.babelTypes.libMod.FunctionDeclaration_
  - typingsJapgolly.babelTypes.libMod.FunctionExpression_
  - typingsJapgolly.babelTypes.libMod.Program_
  - typingsJapgolly.babelTypes.libMod.ObjectMethod_
  - typingsJapgolly.babelTypes.libMod.SwitchStatement_
  - typingsJapgolly.babelTypes.libMod.WhileStatement_
  - typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_
  - typingsJapgolly.babelTypes.libMod.ForOfStatement_
  - typingsJapgolly.babelTypes.libMod.ClassMethod_
  - typingsJapgolly.babelTypes.libMod.ClassPrivateMethod_
  - typingsJapgolly.babelTypes.libMod.StaticBlock_
  - typingsJapgolly.babelTypes.libMod.TSModuleBlock__
*/
trait BlockParent extends StObject
object BlockParent {
  
  inline def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ArrowFunctionExpression_]
  }
  
  inline def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_]): typingsJapgolly.babelTypes.libMod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.BlockStatement_]
  }
  
  inline def CatchClause_(body: BlockStatement_): typingsJapgolly.babelTypes.libMod.CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.CatchClause_]
  }
  
  inline def ClassMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    kind: get | set | method_ | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__],
    static: Boolean
  ): typingsJapgolly.babelTypes.libMod.ClassMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassMethod_]
  }
  
  inline def ClassPrivateMethod_(
    body: BlockStatement_,
    key: PrivateName_,
    kind: get | set | method_,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__],
    static: Boolean
  ): typingsJapgolly.babelTypes.libMod.ClassPrivateMethod_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassPrivateMethod_]
  }
  
  inline def DoWhileStatement_(body: Statement, test: Expression): typingsJapgolly.babelTypes.libMod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DoWhileStatement_]
  }
  
  inline def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typingsJapgolly.babelTypes.libMod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ForInStatement_]
  }
  
  inline def ForOfStatement_(await: Boolean, body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typingsJapgolly.babelTypes.libMod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ForOfStatement_]
  }
  
  inline def ForStatement_(body: Statement): typingsJapgolly.babelTypes.libMod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ForStatement_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.FunctionDeclaration_]
  }
  
  inline def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.FunctionExpression_]
  }
  
  inline def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_,
    kind: method_ | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.libMod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectMethod_]
  }
  
  inline def Program_(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module
  ): typingsJapgolly.babelTypes.libMod.Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Program_]
  }
  
  inline def StaticBlock_(body: js.Array[Statement]): typingsJapgolly.babelTypes.libMod.StaticBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.StaticBlock_]
  }
  
  inline def SwitchStatement_(cases: js.Array[SwitchCase_], discriminant: Expression): typingsJapgolly.babelTypes.libMod.SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.SwitchStatement_]
  }
  
  inline def TSModuleBlock__(body: js.Array[Statement]): typingsJapgolly.babelTypes.libMod.TSModuleBlock__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSModuleBlock__]
  }
  
  inline def WhileStatement_(body: Statement, test: Expression): typingsJapgolly.babelTypes.libMod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.WhileStatement_]
  }
}
