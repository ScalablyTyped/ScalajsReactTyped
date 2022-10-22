package typingsJapgolly.esprima

import typingsJapgolly.esprima.esprimaStrings.ArrayExpression
import typingsJapgolly.esprima.esprimaStrings.ArrayPattern
import typingsJapgolly.esprima.esprimaStrings.ArrowFunctionExpression
import typingsJapgolly.esprima.esprimaStrings.AssignmentExpression
import typingsJapgolly.esprima.esprimaStrings.AssignmentPattern
import typingsJapgolly.esprima.esprimaStrings.AwaitExpression
import typingsJapgolly.esprima.esprimaStrings.BinaryExpression
import typingsJapgolly.esprima.esprimaStrings.BlockStatement
import typingsJapgolly.esprima.esprimaStrings.BreakStatement
import typingsJapgolly.esprima.esprimaStrings.CallExpression
import typingsJapgolly.esprima.esprimaStrings.CatchClause
import typingsJapgolly.esprima.esprimaStrings.ClassBody
import typingsJapgolly.esprima.esprimaStrings.ClassDeclaration
import typingsJapgolly.esprima.esprimaStrings.ClassExpression
import typingsJapgolly.esprima.esprimaStrings.ConditionalExpression
import typingsJapgolly.esprima.esprimaStrings.ContinueStatement
import typingsJapgolly.esprima.esprimaStrings.DebuggerStatement
import typingsJapgolly.esprima.esprimaStrings.DoWhileStatement
import typingsJapgolly.esprima.esprimaStrings.EmptyStatement
import typingsJapgolly.esprima.esprimaStrings.ExportAllDeclaration
import typingsJapgolly.esprima.esprimaStrings.ExportDefaultDeclaration
import typingsJapgolly.esprima.esprimaStrings.ExportNamedDeclaration
import typingsJapgolly.esprima.esprimaStrings.ExportSpecifier
import typingsJapgolly.esprima.esprimaStrings.ExpressionStatement
import typingsJapgolly.esprima.esprimaStrings.ForInStatement
import typingsJapgolly.esprima.esprimaStrings.ForOfStatement
import typingsJapgolly.esprima.esprimaStrings.ForStatement
import typingsJapgolly.esprima.esprimaStrings.FunctionDeclaration
import typingsJapgolly.esprima.esprimaStrings.FunctionExpression
import typingsJapgolly.esprima.esprimaStrings.Identifier
import typingsJapgolly.esprima.esprimaStrings.IfStatement
import typingsJapgolly.esprima.esprimaStrings.Import
import typingsJapgolly.esprima.esprimaStrings.ImportDeclaration
import typingsJapgolly.esprima.esprimaStrings.ImportDefaultSpecifier
import typingsJapgolly.esprima.esprimaStrings.ImportNamespaceSpecifier
import typingsJapgolly.esprima.esprimaStrings.ImportSpecifier
import typingsJapgolly.esprima.esprimaStrings.LabeledStatement
import typingsJapgolly.esprima.esprimaStrings.Literal
import typingsJapgolly.esprima.esprimaStrings.LogicalExpression
import typingsJapgolly.esprima.esprimaStrings.MemberExpression
import typingsJapgolly.esprima.esprimaStrings.MetaProperty
import typingsJapgolly.esprima.esprimaStrings.MethodDefinition
import typingsJapgolly.esprima.esprimaStrings.NewExpression
import typingsJapgolly.esprima.esprimaStrings.ObjectExpression
import typingsJapgolly.esprima.esprimaStrings.ObjectPattern
import typingsJapgolly.esprima.esprimaStrings.Property
import typingsJapgolly.esprima.esprimaStrings.RestElement
import typingsJapgolly.esprima.esprimaStrings.ReturnStatement
import typingsJapgolly.esprima.esprimaStrings.SequenceExpression
import typingsJapgolly.esprima.esprimaStrings.SpreadElement
import typingsJapgolly.esprima.esprimaStrings.Super
import typingsJapgolly.esprima.esprimaStrings.SwitchCase
import typingsJapgolly.esprima.esprimaStrings.SwitchStatement
import typingsJapgolly.esprima.esprimaStrings.TaggedTemplateExpression
import typingsJapgolly.esprima.esprimaStrings.TemplateElement
import typingsJapgolly.esprima.esprimaStrings.TemplateLiteral
import typingsJapgolly.esprima.esprimaStrings.ThisExpression
import typingsJapgolly.esprima.esprimaStrings.ThrowStatement
import typingsJapgolly.esprima.esprimaStrings.TryStatement
import typingsJapgolly.esprima.esprimaStrings.UnaryExpression
import typingsJapgolly.esprima.esprimaStrings.UpdateExpression
import typingsJapgolly.esprima.esprimaStrings.VariableDeclaration
import typingsJapgolly.esprima.esprimaStrings.VariableDeclarator
import typingsJapgolly.esprima.esprimaStrings.WhileStatement
import typingsJapgolly.esprima.esprimaStrings.WithStatement
import typingsJapgolly.esprima.esprimaStrings.YieldExpression
import typingsJapgolly.estree.estreeStrings.module
import typingsJapgolly.estree.estreeStrings.script
import typingsJapgolly.estree.mod.Directive
import typingsJapgolly.estree.mod.ModuleDeclaration
import typingsJapgolly.estree.mod.Node
import typingsJapgolly.estree.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esprima", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Syntax {
    
    @JSImport("esprima", "Syntax")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("esprima", "Syntax.ArrayExpression")
    @js.native
    def ArrayExpression: typingsJapgolly.esprima.esprimaStrings.ArrayExpression = js.native
    inline def ArrayExpression_=(x: ArrayExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ArrayPattern")
    @js.native
    def ArrayPattern: typingsJapgolly.esprima.esprimaStrings.ArrayPattern = js.native
    inline def ArrayPattern_=(x: ArrayPattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ArrowFunctionExpression")
    @js.native
    def ArrowFunctionExpression: typingsJapgolly.esprima.esprimaStrings.ArrowFunctionExpression = js.native
    inline def ArrowFunctionExpression_=(x: ArrowFunctionExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.AssignmentExpression")
    @js.native
    def AssignmentExpression: typingsJapgolly.esprima.esprimaStrings.AssignmentExpression = js.native
    inline def AssignmentExpression_=(x: AssignmentExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.AssignmentPattern")
    @js.native
    def AssignmentPattern: typingsJapgolly.esprima.esprimaStrings.AssignmentPattern = js.native
    inline def AssignmentPattern_=(x: AssignmentPattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.AwaitExpression")
    @js.native
    def AwaitExpression: typingsJapgolly.esprima.esprimaStrings.AwaitExpression = js.native
    inline def AwaitExpression_=(x: AwaitExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.BinaryExpression")
    @js.native
    def BinaryExpression: typingsJapgolly.esprima.esprimaStrings.BinaryExpression = js.native
    inline def BinaryExpression_=(x: BinaryExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.BlockStatement")
    @js.native
    def BlockStatement: typingsJapgolly.esprima.esprimaStrings.BlockStatement = js.native
    inline def BlockStatement_=(x: BlockStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.BreakStatement")
    @js.native
    def BreakStatement: typingsJapgolly.esprima.esprimaStrings.BreakStatement = js.native
    inline def BreakStatement_=(x: BreakStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.CallExpression")
    @js.native
    def CallExpression: typingsJapgolly.esprima.esprimaStrings.CallExpression = js.native
    inline def CallExpression_=(x: CallExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.CatchClause")
    @js.native
    def CatchClause: typingsJapgolly.esprima.esprimaStrings.CatchClause = js.native
    inline def CatchClause_=(x: CatchClause): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ClassBody")
    @js.native
    def ClassBody: typingsJapgolly.esprima.esprimaStrings.ClassBody = js.native
    inline def ClassBody_=(x: ClassBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ClassDeclaration")
    @js.native
    def ClassDeclaration: typingsJapgolly.esprima.esprimaStrings.ClassDeclaration = js.native
    inline def ClassDeclaration_=(x: ClassDeclaration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ClassExpression")
    @js.native
    def ClassExpression: typingsJapgolly.esprima.esprimaStrings.ClassExpression = js.native
    inline def ClassExpression_=(x: ClassExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ConditionalExpression")
    @js.native
    def ConditionalExpression: typingsJapgolly.esprima.esprimaStrings.ConditionalExpression = js.native
    inline def ConditionalExpression_=(x: ConditionalExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ContinueStatement")
    @js.native
    def ContinueStatement: typingsJapgolly.esprima.esprimaStrings.ContinueStatement = js.native
    inline def ContinueStatement_=(x: ContinueStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.DebuggerStatement")
    @js.native
    def DebuggerStatement: typingsJapgolly.esprima.esprimaStrings.DebuggerStatement = js.native
    inline def DebuggerStatement_=(x: DebuggerStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.DoWhileStatement")
    @js.native
    def DoWhileStatement: typingsJapgolly.esprima.esprimaStrings.DoWhileStatement = js.native
    inline def DoWhileStatement_=(x: DoWhileStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.EmptyStatement")
    @js.native
    def EmptyStatement: typingsJapgolly.esprima.esprimaStrings.EmptyStatement = js.native
    inline def EmptyStatement_=(x: EmptyStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ExportAllDeclaration")
    @js.native
    def ExportAllDeclaration: typingsJapgolly.esprima.esprimaStrings.ExportAllDeclaration = js.native
    inline def ExportAllDeclaration_=(x: ExportAllDeclaration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ExportDefaultDeclaration")
    @js.native
    def ExportDefaultDeclaration: typingsJapgolly.esprima.esprimaStrings.ExportDefaultDeclaration = js.native
    inline def ExportDefaultDeclaration_=(x: ExportDefaultDeclaration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ExportNamedDeclaration")
    @js.native
    def ExportNamedDeclaration: typingsJapgolly.esprima.esprimaStrings.ExportNamedDeclaration = js.native
    inline def ExportNamedDeclaration_=(x: ExportNamedDeclaration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ExportSpecifier")
    @js.native
    def ExportSpecifier: typingsJapgolly.esprima.esprimaStrings.ExportSpecifier = js.native
    inline def ExportSpecifier_=(x: ExportSpecifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ExpressionStatement")
    @js.native
    def ExpressionStatement: typingsJapgolly.esprima.esprimaStrings.ExpressionStatement = js.native
    inline def ExpressionStatement_=(x: ExpressionStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ForInStatement")
    @js.native
    def ForInStatement: typingsJapgolly.esprima.esprimaStrings.ForInStatement = js.native
    inline def ForInStatement_=(x: ForInStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ForOfStatement")
    @js.native
    def ForOfStatement: typingsJapgolly.esprima.esprimaStrings.ForOfStatement = js.native
    inline def ForOfStatement_=(x: ForOfStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ForStatement")
    @js.native
    def ForStatement: typingsJapgolly.esprima.esprimaStrings.ForStatement = js.native
    inline def ForStatement_=(x: ForStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.FunctionDeclaration")
    @js.native
    def FunctionDeclaration: typingsJapgolly.esprima.esprimaStrings.FunctionDeclaration = js.native
    inline def FunctionDeclaration_=(x: FunctionDeclaration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.FunctionExpression")
    @js.native
    def FunctionExpression: typingsJapgolly.esprima.esprimaStrings.FunctionExpression = js.native
    inline def FunctionExpression_=(x: FunctionExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.Identifier")
    @js.native
    def Identifier: typingsJapgolly.esprima.esprimaStrings.Identifier = js.native
    inline def Identifier_=(x: Identifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.IfStatement")
    @js.native
    def IfStatement: typingsJapgolly.esprima.esprimaStrings.IfStatement = js.native
    inline def IfStatement_=(x: IfStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.Import")
    @js.native
    def Import: typingsJapgolly.esprima.esprimaStrings.Import = js.native
    
    @JSImport("esprima", "Syntax.ImportDeclaration")
    @js.native
    def ImportDeclaration: typingsJapgolly.esprima.esprimaStrings.ImportDeclaration = js.native
    inline def ImportDeclaration_=(x: ImportDeclaration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ImportDefaultSpecifier")
    @js.native
    def ImportDefaultSpecifier: typingsJapgolly.esprima.esprimaStrings.ImportDefaultSpecifier = js.native
    inline def ImportDefaultSpecifier_=(x: ImportDefaultSpecifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ImportNamespaceSpecifier")
    @js.native
    def ImportNamespaceSpecifier: typingsJapgolly.esprima.esprimaStrings.ImportNamespaceSpecifier = js.native
    inline def ImportNamespaceSpecifier_=(x: ImportNamespaceSpecifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ImportSpecifier")
    @js.native
    def ImportSpecifier: typingsJapgolly.esprima.esprimaStrings.ImportSpecifier = js.native
    inline def ImportSpecifier_=(x: ImportSpecifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(x.asInstanceOf[js.Any])
    
    inline def Import_=(x: Import): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Import")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.LabeledStatement")
    @js.native
    def LabeledStatement: typingsJapgolly.esprima.esprimaStrings.LabeledStatement = js.native
    inline def LabeledStatement_=(x: LabeledStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.Literal")
    @js.native
    def Literal: typingsJapgolly.esprima.esprimaStrings.Literal = js.native
    inline def Literal_=(x: Literal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Literal")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.LogicalExpression")
    @js.native
    def LogicalExpression: typingsJapgolly.esprima.esprimaStrings.LogicalExpression = js.native
    inline def LogicalExpression_=(x: LogicalExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.MemberExpression")
    @js.native
    def MemberExpression: typingsJapgolly.esprima.esprimaStrings.MemberExpression = js.native
    inline def MemberExpression_=(x: MemberExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.MetaProperty")
    @js.native
    def MetaProperty: typingsJapgolly.esprima.esprimaStrings.MetaProperty = js.native
    inline def MetaProperty_=(x: MetaProperty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.MethodDefinition")
    @js.native
    def MethodDefinition: typingsJapgolly.esprima.esprimaStrings.MethodDefinition = js.native
    inline def MethodDefinition_=(x: MethodDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MethodDefinition")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.NewExpression")
    @js.native
    def NewExpression: typingsJapgolly.esprima.esprimaStrings.NewExpression = js.native
    inline def NewExpression_=(x: NewExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ObjectExpression")
    @js.native
    def ObjectExpression: typingsJapgolly.esprima.esprimaStrings.ObjectExpression = js.native
    inline def ObjectExpression_=(x: ObjectExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ObjectPattern")
    @js.native
    def ObjectPattern: typingsJapgolly.esprima.esprimaStrings.ObjectPattern = js.native
    inline def ObjectPattern_=(x: ObjectPattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.Program")
    @js.native
    def Program: typingsJapgolly.esprima.esprimaStrings.Program = js.native
    inline def Program_=(x: typingsJapgolly.esprima.esprimaStrings.Program): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Program")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.Property")
    @js.native
    def Property: typingsJapgolly.esprima.esprimaStrings.Property = js.native
    inline def Property_=(x: Property): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Property")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.RestElement")
    @js.native
    def RestElement: typingsJapgolly.esprima.esprimaStrings.RestElement = js.native
    inline def RestElement_=(x: RestElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ReturnStatement")
    @js.native
    def ReturnStatement: typingsJapgolly.esprima.esprimaStrings.ReturnStatement = js.native
    inline def ReturnStatement_=(x: ReturnStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.SequenceExpression")
    @js.native
    def SequenceExpression: typingsJapgolly.esprima.esprimaStrings.SequenceExpression = js.native
    inline def SequenceExpression_=(x: SequenceExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.SpreadElement")
    @js.native
    def SpreadElement: typingsJapgolly.esprima.esprimaStrings.SpreadElement = js.native
    inline def SpreadElement_=(x: SpreadElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.Super")
    @js.native
    def Super: typingsJapgolly.esprima.esprimaStrings.Super = js.native
    inline def Super_=(x: Super): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Super")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.SwitchCase")
    @js.native
    def SwitchCase: typingsJapgolly.esprima.esprimaStrings.SwitchCase = js.native
    inline def SwitchCase_=(x: SwitchCase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.SwitchStatement")
    @js.native
    def SwitchStatement: typingsJapgolly.esprima.esprimaStrings.SwitchStatement = js.native
    inline def SwitchStatement_=(x: SwitchStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.TaggedTemplateExpression")
    @js.native
    def TaggedTemplateExpression: typingsJapgolly.esprima.esprimaStrings.TaggedTemplateExpression = js.native
    inline def TaggedTemplateExpression_=(x: TaggedTemplateExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.TemplateElement")
    @js.native
    def TemplateElement: typingsJapgolly.esprima.esprimaStrings.TemplateElement = js.native
    inline def TemplateElement_=(x: TemplateElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.TemplateLiteral")
    @js.native
    def TemplateLiteral: typingsJapgolly.esprima.esprimaStrings.TemplateLiteral = js.native
    inline def TemplateLiteral_=(x: TemplateLiteral): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ThisExpression")
    @js.native
    def ThisExpression: typingsJapgolly.esprima.esprimaStrings.ThisExpression = js.native
    inline def ThisExpression_=(x: ThisExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.ThrowStatement")
    @js.native
    def ThrowStatement: typingsJapgolly.esprima.esprimaStrings.ThrowStatement = js.native
    inline def ThrowStatement_=(x: ThrowStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.TryStatement")
    @js.native
    def TryStatement: typingsJapgolly.esprima.esprimaStrings.TryStatement = js.native
    inline def TryStatement_=(x: TryStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.UnaryExpression")
    @js.native
    def UnaryExpression: typingsJapgolly.esprima.esprimaStrings.UnaryExpression = js.native
    inline def UnaryExpression_=(x: UnaryExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.UpdateExpression")
    @js.native
    def UpdateExpression: typingsJapgolly.esprima.esprimaStrings.UpdateExpression = js.native
    inline def UpdateExpression_=(x: UpdateExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.VariableDeclaration")
    @js.native
    def VariableDeclaration: typingsJapgolly.esprima.esprimaStrings.VariableDeclaration = js.native
    inline def VariableDeclaration_=(x: VariableDeclaration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.VariableDeclarator")
    @js.native
    def VariableDeclarator: typingsJapgolly.esprima.esprimaStrings.VariableDeclarator = js.native
    inline def VariableDeclarator_=(x: VariableDeclarator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.WhileStatement")
    @js.native
    def WhileStatement: typingsJapgolly.esprima.esprimaStrings.WhileStatement = js.native
    inline def WhileStatement_=(x: WhileStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WhileStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.WithStatement")
    @js.native
    def WithStatement: typingsJapgolly.esprima.esprimaStrings.WithStatement = js.native
    inline def WithStatement_=(x: WithStatement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WithStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("esprima", "Syntax.YieldExpression")
    @js.native
    def YieldExpression: typingsJapgolly.esprima.esprimaStrings.YieldExpression = js.native
    inline def YieldExpression_=(x: YieldExpression): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YieldExpression")(x.asInstanceOf[js.Any])
  }
  
  inline def parseModule(input: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("parseModule")(input.asInstanceOf[js.Any]).asInstanceOf[Program]
  inline def parseModule(input: String, config: Unit, delegate: js.Function2[/* node */ Node, /* meta */ Any, Unit]): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parseModule")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any], delegate.asInstanceOf[js.Any])).asInstanceOf[Program]
  inline def parseModule(input: String, config: ParseOptions): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parseModule")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Program]
  inline def parseModule(input: String, config: ParseOptions, delegate: js.Function2[/* node */ Node, /* meta */ Any, Unit]): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parseModule")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any], delegate.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  inline def parseScript(input: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScript")(input.asInstanceOf[js.Any]).asInstanceOf[Program]
  inline def parseScript(input: String, config: Unit, delegate: js.Function2[/* node */ Node, /* meta */ Any, Unit]): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parseScript")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any], delegate.asInstanceOf[js.Any])).asInstanceOf[Program]
  inline def parseScript(input: String, config: ParseOptions): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parseScript")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Program]
  inline def parseScript(input: String, config: ParseOptions, delegate: js.Function2[/* node */ Node, /* meta */ Any, Unit]): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parseScript")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any], delegate.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  inline def tokenize(input: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  inline def tokenize(input: String, config: TokenizeOptions): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  @JSImport("esprima", "version")
  @js.native
  val version: String = js.native
  
  trait ParseOptions extends StObject {
    
    var comment: js.UndefOr[Boolean] = js.undefined
    
    var jsx: js.UndefOr[Boolean] = js.undefined
    
    var loc: js.UndefOr[Boolean] = js.undefined
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var tokens: js.UndefOr[Boolean] = js.undefined
    
    var tolerant: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setLoc(value: Boolean): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      inline def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
    }
  }
  
  trait Program
    extends StObject
       with typingsJapgolly.estree.mod.Program {
    
    var tokens: js.UndefOr[js.Array[Token]] = js.undefined
  }
  object Program {
    
    inline def apply(body: js.Array[Directive | Statement | ModuleDeclaration], sourceType: script | module): Program = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Program")
      __obj.asInstanceOf[Program]
    }
    
    extension [Self <: Program](x: Self) {
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait Token extends StObject {
    
    var `type`: String
    
    var value: String
  }
  object Token {
    
    inline def apply(`type`: String, value: String): Token = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenizeOptions extends StObject {
    
    var comment: js.UndefOr[Boolean] = js.undefined
    
    var loc: js.UndefOr[Boolean] = js.undefined
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var tolerant: js.UndefOr[Boolean] = js.undefined
  }
  object TokenizeOptions {
    
    inline def apply(): TokenizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenizeOptions]
    }
    
    extension [Self <: TokenizeOptions](x: Self) {
      
      inline def setComment(value: Boolean): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setLoc(value: Boolean): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      inline def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
    }
  }
}
