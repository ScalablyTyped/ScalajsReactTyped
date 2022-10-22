package typingsJapgolly.estraverse

import typingsJapgolly.estraverse.estraverseStrings.iteration
import typingsJapgolly.estree.mod.Comment
import typingsJapgolly.estree.mod.Node
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estraverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("estraverse", "Controller")
  @js.native
  open class Controller () extends StObject {
    
    /**
      * Break the traversals.
      */
    def break(): Unit = js.native
    
    /**
      * The current node.
      */
    def current(): Node = js.native
    
    /**
      * Notify the controller to break the traversals, skip the child nodes of current node or remove the
      * current node.
      */
    def notify(flag: VisitorOption): Unit = js.native
    
    /**
      * An array of parent elements.
      */
    def parents(): js.Array[Node] = js.native
    
    /**
      * Obtain the property paths array from root to the current node.
      */
    def path(): (js.Array[String | Double]) | Null = js.native
    
    /**
      * Remove the current node.
      */
    def remove(): Unit = js.native
    
    /**
      * Traverse and replace the AST.
      */
    def replace(root: Node, visitor: Visitor): Node = js.native
    
    /**
      * Skip the child nodes of current node.
      */
    def skip(): Unit = js.native
    
    /**
      * Traverse the AST.
      */
    def traverse(root: Node, visitor: Visitor): Unit = js.native
    
    /**
      * The type of current node.
      */
    def `type`(): String = js.native
  }
  
  /* Inlined parent std.Record<estraverse.estraverse.NodeType, estraverse.estraverse.NodeType> */
  trait Syntax extends StObject {
    
    var ArrayExpression: NodeType
    
    var ArrayPattern: NodeType
    
    var ArrowFunctionExpression: NodeType
    
    var AssignmentExpression: NodeType
    
    var AssignmentPattern: NodeType
    
    var AwaitExpression: NodeType
    
    var BinaryExpression: NodeType
    
    var BlockStatement: NodeType
    
    var BreakStatement: NodeType
    
    var CallExpression: NodeType
    
    var CatchClause: NodeType
    
    var ClassBody: NodeType
    
    var ClassDeclaration: NodeType
    
    var ClassExpression: NodeType
    
    var ComprehensionBlock: NodeType
    
    var ComprehensionExpression: NodeType
    
    var ConditionalExpression: NodeType
    
    var ContinueStatement: NodeType
    
    var DebuggerStatement: NodeType
    
    var DirectiveStatement: NodeType
    
    var DoWhileStatement: NodeType
    
    var EmptyStatement: NodeType
    
    var ExportAllDeclaration: NodeType
    
    var ExportDefaultDeclaration: NodeType
    
    var ExportNamedDeclaration: NodeType
    
    var ExportSpecifier: NodeType
    
    var ExpressionStatement: NodeType
    
    var ForInStatement: NodeType
    
    var ForOfStatement: NodeType
    
    var ForStatement: NodeType
    
    var FunctionDeclaration: NodeType
    
    var FunctionExpression: NodeType
    
    var GeneratorExpression: NodeType
    
    var Identifier: NodeType
    
    var IfStatement: NodeType
    
    var ImportDeclaration: NodeType
    
    var ImportDefaultSpecifier: NodeType
    
    var ImportExpression: NodeType
    
    var ImportNamespaceSpecifier: NodeType
    
    var ImportSpecifier: NodeType
    
    var LabeledStatement: NodeType
    
    var Literal: NodeType
    
    var LogicalExpression: NodeType
    
    var MemberExpression: NodeType
    
    var MetaProperty: NodeType
    
    var MethodDefinition: NodeType
    
    var ModuleSpecifier: NodeType
    
    var NewExpression: NodeType
    
    var ObjectExpression: NodeType
    
    var ObjectPattern: NodeType
    
    var Program: NodeType
    
    var Property: NodeType
    
    var RestElement: NodeType
    
    var ReturnStatement: NodeType
    
    var SequenceExpression: NodeType
    
    var SpreadElement: NodeType
    
    var Super: NodeType
    
    var SwitchCase: NodeType
    
    var SwitchStatement: NodeType
    
    var TaggedTemplateExpression: NodeType
    
    var TemplateElement: NodeType
    
    var TemplateLiteral: NodeType
    
    var ThisExpression: NodeType
    
    var ThrowStatement: NodeType
    
    var TryStatement: NodeType
    
    var UnaryExpression: NodeType
    
    var UpdateExpression: NodeType
    
    var VariableDeclaration: NodeType
    
    var VariableDeclarator: NodeType
    
    var WhileStatement: NodeType
    
    var WithStatement: NodeType
    
    var YieldExpression: NodeType
  }
  object Syntax {
    
    @JSImport("estraverse", "Syntax")
    @js.native
    val ^ : Syntax = js.native
    
    extension [Self <: Syntax](x: Self) {
      
      inline def setArrayExpression(value: NodeType): Self = StObject.set(x, "ArrayExpression", value.asInstanceOf[js.Any])
      
      inline def setArrayPattern(value: NodeType): Self = StObject.set(x, "ArrayPattern", value.asInstanceOf[js.Any])
      
      inline def setArrowFunctionExpression(value: NodeType): Self = StObject.set(x, "ArrowFunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setAssignmentExpression(value: NodeType): Self = StObject.set(x, "AssignmentExpression", value.asInstanceOf[js.Any])
      
      inline def setAssignmentPattern(value: NodeType): Self = StObject.set(x, "AssignmentPattern", value.asInstanceOf[js.Any])
      
      inline def setAwaitExpression(value: NodeType): Self = StObject.set(x, "AwaitExpression", value.asInstanceOf[js.Any])
      
      inline def setBinaryExpression(value: NodeType): Self = StObject.set(x, "BinaryExpression", value.asInstanceOf[js.Any])
      
      inline def setBlockStatement(value: NodeType): Self = StObject.set(x, "BlockStatement", value.asInstanceOf[js.Any])
      
      inline def setBreakStatement(value: NodeType): Self = StObject.set(x, "BreakStatement", value.asInstanceOf[js.Any])
      
      inline def setCallExpression(value: NodeType): Self = StObject.set(x, "CallExpression", value.asInstanceOf[js.Any])
      
      inline def setCatchClause(value: NodeType): Self = StObject.set(x, "CatchClause", value.asInstanceOf[js.Any])
      
      inline def setClassBody(value: NodeType): Self = StObject.set(x, "ClassBody", value.asInstanceOf[js.Any])
      
      inline def setClassDeclaration(value: NodeType): Self = StObject.set(x, "ClassDeclaration", value.asInstanceOf[js.Any])
      
      inline def setClassExpression(value: NodeType): Self = StObject.set(x, "ClassExpression", value.asInstanceOf[js.Any])
      
      inline def setComprehensionBlock(value: NodeType): Self = StObject.set(x, "ComprehensionBlock", value.asInstanceOf[js.Any])
      
      inline def setComprehensionExpression(value: NodeType): Self = StObject.set(x, "ComprehensionExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionalExpression(value: NodeType): Self = StObject.set(x, "ConditionalExpression", value.asInstanceOf[js.Any])
      
      inline def setContinueStatement(value: NodeType): Self = StObject.set(x, "ContinueStatement", value.asInstanceOf[js.Any])
      
      inline def setDebuggerStatement(value: NodeType): Self = StObject.set(x, "DebuggerStatement", value.asInstanceOf[js.Any])
      
      inline def setDirectiveStatement(value: NodeType): Self = StObject.set(x, "DirectiveStatement", value.asInstanceOf[js.Any])
      
      inline def setDoWhileStatement(value: NodeType): Self = StObject.set(x, "DoWhileStatement", value.asInstanceOf[js.Any])
      
      inline def setEmptyStatement(value: NodeType): Self = StObject.set(x, "EmptyStatement", value.asInstanceOf[js.Any])
      
      inline def setExportAllDeclaration(value: NodeType): Self = StObject.set(x, "ExportAllDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportDefaultDeclaration(value: NodeType): Self = StObject.set(x, "ExportDefaultDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportNamedDeclaration(value: NodeType): Self = StObject.set(x, "ExportNamedDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportSpecifier(value: NodeType): Self = StObject.set(x, "ExportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setExpressionStatement(value: NodeType): Self = StObject.set(x, "ExpressionStatement", value.asInstanceOf[js.Any])
      
      inline def setForInStatement(value: NodeType): Self = StObject.set(x, "ForInStatement", value.asInstanceOf[js.Any])
      
      inline def setForOfStatement(value: NodeType): Self = StObject.set(x, "ForOfStatement", value.asInstanceOf[js.Any])
      
      inline def setForStatement(value: NodeType): Self = StObject.set(x, "ForStatement", value.asInstanceOf[js.Any])
      
      inline def setFunctionDeclaration(value: NodeType): Self = StObject.set(x, "FunctionDeclaration", value.asInstanceOf[js.Any])
      
      inline def setFunctionExpression(value: NodeType): Self = StObject.set(x, "FunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setGeneratorExpression(value: NodeType): Self = StObject.set(x, "GeneratorExpression", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: NodeType): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      inline def setIfStatement(value: NodeType): Self = StObject.set(x, "IfStatement", value.asInstanceOf[js.Any])
      
      inline def setImportDeclaration(value: NodeType): Self = StObject.set(x, "ImportDeclaration", value.asInstanceOf[js.Any])
      
      inline def setImportDefaultSpecifier(value: NodeType): Self = StObject.set(x, "ImportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportExpression(value: NodeType): Self = StObject.set(x, "ImportExpression", value.asInstanceOf[js.Any])
      
      inline def setImportNamespaceSpecifier(value: NodeType): Self = StObject.set(x, "ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportSpecifier(value: NodeType): Self = StObject.set(x, "ImportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setLabeledStatement(value: NodeType): Self = StObject.set(x, "LabeledStatement", value.asInstanceOf[js.Any])
      
      inline def setLiteral(value: NodeType): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
      
      inline def setLogicalExpression(value: NodeType): Self = StObject.set(x, "LogicalExpression", value.asInstanceOf[js.Any])
      
      inline def setMemberExpression(value: NodeType): Self = StObject.set(x, "MemberExpression", value.asInstanceOf[js.Any])
      
      inline def setMetaProperty(value: NodeType): Self = StObject.set(x, "MetaProperty", value.asInstanceOf[js.Any])
      
      inline def setMethodDefinition(value: NodeType): Self = StObject.set(x, "MethodDefinition", value.asInstanceOf[js.Any])
      
      inline def setModuleSpecifier(value: NodeType): Self = StObject.set(x, "ModuleSpecifier", value.asInstanceOf[js.Any])
      
      inline def setNewExpression(value: NodeType): Self = StObject.set(x, "NewExpression", value.asInstanceOf[js.Any])
      
      inline def setObjectExpression(value: NodeType): Self = StObject.set(x, "ObjectExpression", value.asInstanceOf[js.Any])
      
      inline def setObjectPattern(value: NodeType): Self = StObject.set(x, "ObjectPattern", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: NodeType): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: NodeType): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
      
      inline def setRestElement(value: NodeType): Self = StObject.set(x, "RestElement", value.asInstanceOf[js.Any])
      
      inline def setReturnStatement(value: NodeType): Self = StObject.set(x, "ReturnStatement", value.asInstanceOf[js.Any])
      
      inline def setSequenceExpression(value: NodeType): Self = StObject.set(x, "SequenceExpression", value.asInstanceOf[js.Any])
      
      inline def setSpreadElement(value: NodeType): Self = StObject.set(x, "SpreadElement", value.asInstanceOf[js.Any])
      
      inline def setSuper(value: NodeType): Self = StObject.set(x, "Super", value.asInstanceOf[js.Any])
      
      inline def setSwitchCase(value: NodeType): Self = StObject.set(x, "SwitchCase", value.asInstanceOf[js.Any])
      
      inline def setSwitchStatement(value: NodeType): Self = StObject.set(x, "SwitchStatement", value.asInstanceOf[js.Any])
      
      inline def setTaggedTemplateExpression(value: NodeType): Self = StObject.set(x, "TaggedTemplateExpression", value.asInstanceOf[js.Any])
      
      inline def setTemplateElement(value: NodeType): Self = StObject.set(x, "TemplateElement", value.asInstanceOf[js.Any])
      
      inline def setTemplateLiteral(value: NodeType): Self = StObject.set(x, "TemplateLiteral", value.asInstanceOf[js.Any])
      
      inline def setThisExpression(value: NodeType): Self = StObject.set(x, "ThisExpression", value.asInstanceOf[js.Any])
      
      inline def setThrowStatement(value: NodeType): Self = StObject.set(x, "ThrowStatement", value.asInstanceOf[js.Any])
      
      inline def setTryStatement(value: NodeType): Self = StObject.set(x, "TryStatement", value.asInstanceOf[js.Any])
      
      inline def setUnaryExpression(value: NodeType): Self = StObject.set(x, "UnaryExpression", value.asInstanceOf[js.Any])
      
      inline def setUpdateExpression(value: NodeType): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
      
      inline def setVariableDeclaration(value: NodeType): Self = StObject.set(x, "VariableDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVariableDeclarator(value: NodeType): Self = StObject.set(x, "VariableDeclarator", value.asInstanceOf[js.Any])
      
      inline def setWhileStatement(value: NodeType): Self = StObject.set(x, "WhileStatement", value.asInstanceOf[js.Any])
      
      inline def setWithStatement(value: NodeType): Self = StObject.set(x, "WithStatement", value.asInstanceOf[js.Any])
      
      inline def setYieldExpression(value: NodeType): Self = StObject.set(x, "YieldExpression", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Record<estraverse.estraverse.NodeType, std.Array<string>> */
  trait VisitorKeys extends StObject {
    
    var ArrayExpression: js.Array[String]
    
    var ArrayPattern: js.Array[String]
    
    var ArrowFunctionExpression: js.Array[String]
    
    var AssignmentExpression: js.Array[String]
    
    var AssignmentPattern: js.Array[String]
    
    var AwaitExpression: js.Array[String]
    
    var BinaryExpression: js.Array[String]
    
    var BlockStatement: js.Array[String]
    
    var BreakStatement: js.Array[String]
    
    var CallExpression: js.Array[String]
    
    var CatchClause: js.Array[String]
    
    var ClassBody: js.Array[String]
    
    var ClassDeclaration: js.Array[String]
    
    var ClassExpression: js.Array[String]
    
    var ComprehensionBlock: js.Array[String]
    
    var ComprehensionExpression: js.Array[String]
    
    var ConditionalExpression: js.Array[String]
    
    var ContinueStatement: js.Array[String]
    
    var DebuggerStatement: js.Array[String]
    
    var DirectiveStatement: js.Array[String]
    
    var DoWhileStatement: js.Array[String]
    
    var EmptyStatement: js.Array[String]
    
    var ExportAllDeclaration: js.Array[String]
    
    var ExportDefaultDeclaration: js.Array[String]
    
    var ExportNamedDeclaration: js.Array[String]
    
    var ExportSpecifier: js.Array[String]
    
    var ExpressionStatement: js.Array[String]
    
    var ForInStatement: js.Array[String]
    
    var ForOfStatement: js.Array[String]
    
    var ForStatement: js.Array[String]
    
    var FunctionDeclaration: js.Array[String]
    
    var FunctionExpression: js.Array[String]
    
    var GeneratorExpression: js.Array[String]
    
    var Identifier: js.Array[String]
    
    var IfStatement: js.Array[String]
    
    var ImportDeclaration: js.Array[String]
    
    var ImportDefaultSpecifier: js.Array[String]
    
    var ImportExpression: js.Array[String]
    
    var ImportNamespaceSpecifier: js.Array[String]
    
    var ImportSpecifier: js.Array[String]
    
    var LabeledStatement: js.Array[String]
    
    var Literal: js.Array[String]
    
    var LogicalExpression: js.Array[String]
    
    var MemberExpression: js.Array[String]
    
    var MetaProperty: js.Array[String]
    
    var MethodDefinition: js.Array[String]
    
    var ModuleSpecifier: js.Array[String]
    
    var NewExpression: js.Array[String]
    
    var ObjectExpression: js.Array[String]
    
    var ObjectPattern: js.Array[String]
    
    var Program: js.Array[String]
    
    var Property: js.Array[String]
    
    var RestElement: js.Array[String]
    
    var ReturnStatement: js.Array[String]
    
    var SequenceExpression: js.Array[String]
    
    var SpreadElement: js.Array[String]
    
    var Super: js.Array[String]
    
    var SwitchCase: js.Array[String]
    
    var SwitchStatement: js.Array[String]
    
    var TaggedTemplateExpression: js.Array[String]
    
    var TemplateElement: js.Array[String]
    
    var TemplateLiteral: js.Array[String]
    
    var ThisExpression: js.Array[String]
    
    var ThrowStatement: js.Array[String]
    
    var TryStatement: js.Array[String]
    
    var UnaryExpression: js.Array[String]
    
    var UpdateExpression: js.Array[String]
    
    var VariableDeclaration: js.Array[String]
    
    var VariableDeclarator: js.Array[String]
    
    var WhileStatement: js.Array[String]
    
    var WithStatement: js.Array[String]
    
    var YieldExpression: js.Array[String]
  }
  object VisitorKeys {
    
    @JSImport("estraverse", "VisitorKeys")
    @js.native
    val ^ : VisitorKeys = js.native
    
    extension [Self <: VisitorKeys](x: Self) {
      
      inline def setArrayExpression(value: js.Array[String]): Self = StObject.set(x, "ArrayExpression", value.asInstanceOf[js.Any])
      
      inline def setArrayExpressionVarargs(value: String*): Self = StObject.set(x, "ArrayExpression", js.Array(value*))
      
      inline def setArrayPattern(value: js.Array[String]): Self = StObject.set(x, "ArrayPattern", value.asInstanceOf[js.Any])
      
      inline def setArrayPatternVarargs(value: String*): Self = StObject.set(x, "ArrayPattern", js.Array(value*))
      
      inline def setArrowFunctionExpression(value: js.Array[String]): Self = StObject.set(x, "ArrowFunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setArrowFunctionExpressionVarargs(value: String*): Self = StObject.set(x, "ArrowFunctionExpression", js.Array(value*))
      
      inline def setAssignmentExpression(value: js.Array[String]): Self = StObject.set(x, "AssignmentExpression", value.asInstanceOf[js.Any])
      
      inline def setAssignmentExpressionVarargs(value: String*): Self = StObject.set(x, "AssignmentExpression", js.Array(value*))
      
      inline def setAssignmentPattern(value: js.Array[String]): Self = StObject.set(x, "AssignmentPattern", value.asInstanceOf[js.Any])
      
      inline def setAssignmentPatternVarargs(value: String*): Self = StObject.set(x, "AssignmentPattern", js.Array(value*))
      
      inline def setAwaitExpression(value: js.Array[String]): Self = StObject.set(x, "AwaitExpression", value.asInstanceOf[js.Any])
      
      inline def setAwaitExpressionVarargs(value: String*): Self = StObject.set(x, "AwaitExpression", js.Array(value*))
      
      inline def setBinaryExpression(value: js.Array[String]): Self = StObject.set(x, "BinaryExpression", value.asInstanceOf[js.Any])
      
      inline def setBinaryExpressionVarargs(value: String*): Self = StObject.set(x, "BinaryExpression", js.Array(value*))
      
      inline def setBlockStatement(value: js.Array[String]): Self = StObject.set(x, "BlockStatement", value.asInstanceOf[js.Any])
      
      inline def setBlockStatementVarargs(value: String*): Self = StObject.set(x, "BlockStatement", js.Array(value*))
      
      inline def setBreakStatement(value: js.Array[String]): Self = StObject.set(x, "BreakStatement", value.asInstanceOf[js.Any])
      
      inline def setBreakStatementVarargs(value: String*): Self = StObject.set(x, "BreakStatement", js.Array(value*))
      
      inline def setCallExpression(value: js.Array[String]): Self = StObject.set(x, "CallExpression", value.asInstanceOf[js.Any])
      
      inline def setCallExpressionVarargs(value: String*): Self = StObject.set(x, "CallExpression", js.Array(value*))
      
      inline def setCatchClause(value: js.Array[String]): Self = StObject.set(x, "CatchClause", value.asInstanceOf[js.Any])
      
      inline def setCatchClauseVarargs(value: String*): Self = StObject.set(x, "CatchClause", js.Array(value*))
      
      inline def setClassBody(value: js.Array[String]): Self = StObject.set(x, "ClassBody", value.asInstanceOf[js.Any])
      
      inline def setClassBodyVarargs(value: String*): Self = StObject.set(x, "ClassBody", js.Array(value*))
      
      inline def setClassDeclaration(value: js.Array[String]): Self = StObject.set(x, "ClassDeclaration", value.asInstanceOf[js.Any])
      
      inline def setClassDeclarationVarargs(value: String*): Self = StObject.set(x, "ClassDeclaration", js.Array(value*))
      
      inline def setClassExpression(value: js.Array[String]): Self = StObject.set(x, "ClassExpression", value.asInstanceOf[js.Any])
      
      inline def setClassExpressionVarargs(value: String*): Self = StObject.set(x, "ClassExpression", js.Array(value*))
      
      inline def setComprehensionBlock(value: js.Array[String]): Self = StObject.set(x, "ComprehensionBlock", value.asInstanceOf[js.Any])
      
      inline def setComprehensionBlockVarargs(value: String*): Self = StObject.set(x, "ComprehensionBlock", js.Array(value*))
      
      inline def setComprehensionExpression(value: js.Array[String]): Self = StObject.set(x, "ComprehensionExpression", value.asInstanceOf[js.Any])
      
      inline def setComprehensionExpressionVarargs(value: String*): Self = StObject.set(x, "ComprehensionExpression", js.Array(value*))
      
      inline def setConditionalExpression(value: js.Array[String]): Self = StObject.set(x, "ConditionalExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionalExpressionVarargs(value: String*): Self = StObject.set(x, "ConditionalExpression", js.Array(value*))
      
      inline def setContinueStatement(value: js.Array[String]): Self = StObject.set(x, "ContinueStatement", value.asInstanceOf[js.Any])
      
      inline def setContinueStatementVarargs(value: String*): Self = StObject.set(x, "ContinueStatement", js.Array(value*))
      
      inline def setDebuggerStatement(value: js.Array[String]): Self = StObject.set(x, "DebuggerStatement", value.asInstanceOf[js.Any])
      
      inline def setDebuggerStatementVarargs(value: String*): Self = StObject.set(x, "DebuggerStatement", js.Array(value*))
      
      inline def setDirectiveStatement(value: js.Array[String]): Self = StObject.set(x, "DirectiveStatement", value.asInstanceOf[js.Any])
      
      inline def setDirectiveStatementVarargs(value: String*): Self = StObject.set(x, "DirectiveStatement", js.Array(value*))
      
      inline def setDoWhileStatement(value: js.Array[String]): Self = StObject.set(x, "DoWhileStatement", value.asInstanceOf[js.Any])
      
      inline def setDoWhileStatementVarargs(value: String*): Self = StObject.set(x, "DoWhileStatement", js.Array(value*))
      
      inline def setEmptyStatement(value: js.Array[String]): Self = StObject.set(x, "EmptyStatement", value.asInstanceOf[js.Any])
      
      inline def setEmptyStatementVarargs(value: String*): Self = StObject.set(x, "EmptyStatement", js.Array(value*))
      
      inline def setExportAllDeclaration(value: js.Array[String]): Self = StObject.set(x, "ExportAllDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportAllDeclarationVarargs(value: String*): Self = StObject.set(x, "ExportAllDeclaration", js.Array(value*))
      
      inline def setExportDefaultDeclaration(value: js.Array[String]): Self = StObject.set(x, "ExportDefaultDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportDefaultDeclarationVarargs(value: String*): Self = StObject.set(x, "ExportDefaultDeclaration", js.Array(value*))
      
      inline def setExportNamedDeclaration(value: js.Array[String]): Self = StObject.set(x, "ExportNamedDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportNamedDeclarationVarargs(value: String*): Self = StObject.set(x, "ExportNamedDeclaration", js.Array(value*))
      
      inline def setExportSpecifier(value: js.Array[String]): Self = StObject.set(x, "ExportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setExportSpecifierVarargs(value: String*): Self = StObject.set(x, "ExportSpecifier", js.Array(value*))
      
      inline def setExpressionStatement(value: js.Array[String]): Self = StObject.set(x, "ExpressionStatement", value.asInstanceOf[js.Any])
      
      inline def setExpressionStatementVarargs(value: String*): Self = StObject.set(x, "ExpressionStatement", js.Array(value*))
      
      inline def setForInStatement(value: js.Array[String]): Self = StObject.set(x, "ForInStatement", value.asInstanceOf[js.Any])
      
      inline def setForInStatementVarargs(value: String*): Self = StObject.set(x, "ForInStatement", js.Array(value*))
      
      inline def setForOfStatement(value: js.Array[String]): Self = StObject.set(x, "ForOfStatement", value.asInstanceOf[js.Any])
      
      inline def setForOfStatementVarargs(value: String*): Self = StObject.set(x, "ForOfStatement", js.Array(value*))
      
      inline def setForStatement(value: js.Array[String]): Self = StObject.set(x, "ForStatement", value.asInstanceOf[js.Any])
      
      inline def setForStatementVarargs(value: String*): Self = StObject.set(x, "ForStatement", js.Array(value*))
      
      inline def setFunctionDeclaration(value: js.Array[String]): Self = StObject.set(x, "FunctionDeclaration", value.asInstanceOf[js.Any])
      
      inline def setFunctionDeclarationVarargs(value: String*): Self = StObject.set(x, "FunctionDeclaration", js.Array(value*))
      
      inline def setFunctionExpression(value: js.Array[String]): Self = StObject.set(x, "FunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setFunctionExpressionVarargs(value: String*): Self = StObject.set(x, "FunctionExpression", js.Array(value*))
      
      inline def setGeneratorExpression(value: js.Array[String]): Self = StObject.set(x, "GeneratorExpression", value.asInstanceOf[js.Any])
      
      inline def setGeneratorExpressionVarargs(value: String*): Self = StObject.set(x, "GeneratorExpression", js.Array(value*))
      
      inline def setIdentifier(value: js.Array[String]): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierVarargs(value: String*): Self = StObject.set(x, "Identifier", js.Array(value*))
      
      inline def setIfStatement(value: js.Array[String]): Self = StObject.set(x, "IfStatement", value.asInstanceOf[js.Any])
      
      inline def setIfStatementVarargs(value: String*): Self = StObject.set(x, "IfStatement", js.Array(value*))
      
      inline def setImportDeclaration(value: js.Array[String]): Self = StObject.set(x, "ImportDeclaration", value.asInstanceOf[js.Any])
      
      inline def setImportDeclarationVarargs(value: String*): Self = StObject.set(x, "ImportDeclaration", js.Array(value*))
      
      inline def setImportDefaultSpecifier(value: js.Array[String]): Self = StObject.set(x, "ImportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportDefaultSpecifierVarargs(value: String*): Self = StObject.set(x, "ImportDefaultSpecifier", js.Array(value*))
      
      inline def setImportExpression(value: js.Array[String]): Self = StObject.set(x, "ImportExpression", value.asInstanceOf[js.Any])
      
      inline def setImportExpressionVarargs(value: String*): Self = StObject.set(x, "ImportExpression", js.Array(value*))
      
      inline def setImportNamespaceSpecifier(value: js.Array[String]): Self = StObject.set(x, "ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportNamespaceSpecifierVarargs(value: String*): Self = StObject.set(x, "ImportNamespaceSpecifier", js.Array(value*))
      
      inline def setImportSpecifier(value: js.Array[String]): Self = StObject.set(x, "ImportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportSpecifierVarargs(value: String*): Self = StObject.set(x, "ImportSpecifier", js.Array(value*))
      
      inline def setLabeledStatement(value: js.Array[String]): Self = StObject.set(x, "LabeledStatement", value.asInstanceOf[js.Any])
      
      inline def setLabeledStatementVarargs(value: String*): Self = StObject.set(x, "LabeledStatement", js.Array(value*))
      
      inline def setLiteral(value: js.Array[String]): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
      
      inline def setLiteralVarargs(value: String*): Self = StObject.set(x, "Literal", js.Array(value*))
      
      inline def setLogicalExpression(value: js.Array[String]): Self = StObject.set(x, "LogicalExpression", value.asInstanceOf[js.Any])
      
      inline def setLogicalExpressionVarargs(value: String*): Self = StObject.set(x, "LogicalExpression", js.Array(value*))
      
      inline def setMemberExpression(value: js.Array[String]): Self = StObject.set(x, "MemberExpression", value.asInstanceOf[js.Any])
      
      inline def setMemberExpressionVarargs(value: String*): Self = StObject.set(x, "MemberExpression", js.Array(value*))
      
      inline def setMetaProperty(value: js.Array[String]): Self = StObject.set(x, "MetaProperty", value.asInstanceOf[js.Any])
      
      inline def setMetaPropertyVarargs(value: String*): Self = StObject.set(x, "MetaProperty", js.Array(value*))
      
      inline def setMethodDefinition(value: js.Array[String]): Self = StObject.set(x, "MethodDefinition", value.asInstanceOf[js.Any])
      
      inline def setMethodDefinitionVarargs(value: String*): Self = StObject.set(x, "MethodDefinition", js.Array(value*))
      
      inline def setModuleSpecifier(value: js.Array[String]): Self = StObject.set(x, "ModuleSpecifier", value.asInstanceOf[js.Any])
      
      inline def setModuleSpecifierVarargs(value: String*): Self = StObject.set(x, "ModuleSpecifier", js.Array(value*))
      
      inline def setNewExpression(value: js.Array[String]): Self = StObject.set(x, "NewExpression", value.asInstanceOf[js.Any])
      
      inline def setNewExpressionVarargs(value: String*): Self = StObject.set(x, "NewExpression", js.Array(value*))
      
      inline def setObjectExpression(value: js.Array[String]): Self = StObject.set(x, "ObjectExpression", value.asInstanceOf[js.Any])
      
      inline def setObjectExpressionVarargs(value: String*): Self = StObject.set(x, "ObjectExpression", js.Array(value*))
      
      inline def setObjectPattern(value: js.Array[String]): Self = StObject.set(x, "ObjectPattern", value.asInstanceOf[js.Any])
      
      inline def setObjectPatternVarargs(value: String*): Self = StObject.set(x, "ObjectPattern", js.Array(value*))
      
      inline def setProgram(value: js.Array[String]): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
      
      inline def setProgramVarargs(value: String*): Self = StObject.set(x, "Program", js.Array(value*))
      
      inline def setProperty(value: js.Array[String]): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
      
      inline def setPropertyVarargs(value: String*): Self = StObject.set(x, "Property", js.Array(value*))
      
      inline def setRestElement(value: js.Array[String]): Self = StObject.set(x, "RestElement", value.asInstanceOf[js.Any])
      
      inline def setRestElementVarargs(value: String*): Self = StObject.set(x, "RestElement", js.Array(value*))
      
      inline def setReturnStatement(value: js.Array[String]): Self = StObject.set(x, "ReturnStatement", value.asInstanceOf[js.Any])
      
      inline def setReturnStatementVarargs(value: String*): Self = StObject.set(x, "ReturnStatement", js.Array(value*))
      
      inline def setSequenceExpression(value: js.Array[String]): Self = StObject.set(x, "SequenceExpression", value.asInstanceOf[js.Any])
      
      inline def setSequenceExpressionVarargs(value: String*): Self = StObject.set(x, "SequenceExpression", js.Array(value*))
      
      inline def setSpreadElement(value: js.Array[String]): Self = StObject.set(x, "SpreadElement", value.asInstanceOf[js.Any])
      
      inline def setSpreadElementVarargs(value: String*): Self = StObject.set(x, "SpreadElement", js.Array(value*))
      
      inline def setSuper(value: js.Array[String]): Self = StObject.set(x, "Super", value.asInstanceOf[js.Any])
      
      inline def setSuperVarargs(value: String*): Self = StObject.set(x, "Super", js.Array(value*))
      
      inline def setSwitchCase(value: js.Array[String]): Self = StObject.set(x, "SwitchCase", value.asInstanceOf[js.Any])
      
      inline def setSwitchCaseVarargs(value: String*): Self = StObject.set(x, "SwitchCase", js.Array(value*))
      
      inline def setSwitchStatement(value: js.Array[String]): Self = StObject.set(x, "SwitchStatement", value.asInstanceOf[js.Any])
      
      inline def setSwitchStatementVarargs(value: String*): Self = StObject.set(x, "SwitchStatement", js.Array(value*))
      
      inline def setTaggedTemplateExpression(value: js.Array[String]): Self = StObject.set(x, "TaggedTemplateExpression", value.asInstanceOf[js.Any])
      
      inline def setTaggedTemplateExpressionVarargs(value: String*): Self = StObject.set(x, "TaggedTemplateExpression", js.Array(value*))
      
      inline def setTemplateElement(value: js.Array[String]): Self = StObject.set(x, "TemplateElement", value.asInstanceOf[js.Any])
      
      inline def setTemplateElementVarargs(value: String*): Self = StObject.set(x, "TemplateElement", js.Array(value*))
      
      inline def setTemplateLiteral(value: js.Array[String]): Self = StObject.set(x, "TemplateLiteral", value.asInstanceOf[js.Any])
      
      inline def setTemplateLiteralVarargs(value: String*): Self = StObject.set(x, "TemplateLiteral", js.Array(value*))
      
      inline def setThisExpression(value: js.Array[String]): Self = StObject.set(x, "ThisExpression", value.asInstanceOf[js.Any])
      
      inline def setThisExpressionVarargs(value: String*): Self = StObject.set(x, "ThisExpression", js.Array(value*))
      
      inline def setThrowStatement(value: js.Array[String]): Self = StObject.set(x, "ThrowStatement", value.asInstanceOf[js.Any])
      
      inline def setThrowStatementVarargs(value: String*): Self = StObject.set(x, "ThrowStatement", js.Array(value*))
      
      inline def setTryStatement(value: js.Array[String]): Self = StObject.set(x, "TryStatement", value.asInstanceOf[js.Any])
      
      inline def setTryStatementVarargs(value: String*): Self = StObject.set(x, "TryStatement", js.Array(value*))
      
      inline def setUnaryExpression(value: js.Array[String]): Self = StObject.set(x, "UnaryExpression", value.asInstanceOf[js.Any])
      
      inline def setUnaryExpressionVarargs(value: String*): Self = StObject.set(x, "UnaryExpression", js.Array(value*))
      
      inline def setUpdateExpression(value: js.Array[String]): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
      
      inline def setUpdateExpressionVarargs(value: String*): Self = StObject.set(x, "UpdateExpression", js.Array(value*))
      
      inline def setVariableDeclaration(value: js.Array[String]): Self = StObject.set(x, "VariableDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVariableDeclarationVarargs(value: String*): Self = StObject.set(x, "VariableDeclaration", js.Array(value*))
      
      inline def setVariableDeclarator(value: js.Array[String]): Self = StObject.set(x, "VariableDeclarator", value.asInstanceOf[js.Any])
      
      inline def setVariableDeclaratorVarargs(value: String*): Self = StObject.set(x, "VariableDeclarator", js.Array(value*))
      
      inline def setWhileStatement(value: js.Array[String]): Self = StObject.set(x, "WhileStatement", value.asInstanceOf[js.Any])
      
      inline def setWhileStatementVarargs(value: String*): Self = StObject.set(x, "WhileStatement", js.Array(value*))
      
      inline def setWithStatement(value: js.Array[String]): Self = StObject.set(x, "WithStatement", value.asInstanceOf[js.Any])
      
      inline def setWithStatementVarargs(value: String*): Self = StObject.set(x, "WithStatement", js.Array(value*))
      
      inline def setYieldExpression(value: js.Array[String]): Self = StObject.set(x, "YieldExpression", value.asInstanceOf[js.Any])
      
      inline def setYieldExpressionVarargs(value: String*): Self = StObject.set(x, "YieldExpression", js.Array(value*))
    }
  }
  
  @js.native
  sealed trait VisitorOption extends StObject
  @JSImport("estraverse", "VisitorOption")
  @js.native
  object VisitorOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VisitorOption & Double] = js.native
    
    @js.native
    sealed trait Break
      extends StObject
         with VisitorOption
    /* 0 */ val Break: typingsJapgolly.estraverse.mod.VisitorOption.Break & Double = js.native
    
    @js.native
    sealed trait Remove
      extends StObject
         with VisitorOption
    /* 2 */ val Remove: typingsJapgolly.estraverse.mod.VisitorOption.Remove & Double = js.native
    
    @js.native
    sealed trait Skip
      extends StObject
         with VisitorOption
    /* 1 */ val Skip: typingsJapgolly.estraverse.mod.VisitorOption.Skip & Double = js.native
  }
  
  inline def attachComments(tree: Node, providedComments: js.Array[Comment], tokens: js.Array[Node]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("attachComments")(tree.asInstanceOf[js.Any], providedComments.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def cloneEnvironment(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneEnvironment")().asInstanceOf[Any]
  
  inline def replace(root: Node, visitor: Visitor): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(root.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def traverse(root: Node, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(root.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.estraverse.estraverseStrings.AssignmentExpression
    - typingsJapgolly.estraverse.estraverseStrings.AssignmentPattern
    - typingsJapgolly.estraverse.estraverseStrings.ArrayExpression
    - typingsJapgolly.estraverse.estraverseStrings.ArrayPattern
    - typingsJapgolly.estraverse.estraverseStrings.ArrowFunctionExpression
    - typingsJapgolly.estraverse.estraverseStrings.AwaitExpression
    - typingsJapgolly.estraverse.estraverseStrings.BlockStatement
    - typingsJapgolly.estraverse.estraverseStrings.BinaryExpression
    - typingsJapgolly.estraverse.estraverseStrings.BreakStatement
    - typingsJapgolly.estraverse.estraverseStrings.CallExpression
    - typingsJapgolly.estraverse.estraverseStrings.CatchClause
    - typingsJapgolly.estraverse.estraverseStrings.ClassBody
    - typingsJapgolly.estraverse.estraverseStrings.ClassDeclaration
    - typingsJapgolly.estraverse.estraverseStrings.ClassExpression
    - typingsJapgolly.estraverse.estraverseStrings.ComprehensionBlock
    - typingsJapgolly.estraverse.estraverseStrings.ComprehensionExpression
    - typingsJapgolly.estraverse.estraverseStrings.ConditionalExpression
    - typingsJapgolly.estraverse.estraverseStrings.ContinueStatement
    - typingsJapgolly.estraverse.estraverseStrings.DebuggerStatement
    - typingsJapgolly.estraverse.estraverseStrings.DirectiveStatement
    - typingsJapgolly.estraverse.estraverseStrings.DoWhileStatement
    - typingsJapgolly.estraverse.estraverseStrings.EmptyStatement
    - typingsJapgolly.estraverse.estraverseStrings.ExportAllDeclaration
    - typingsJapgolly.estraverse.estraverseStrings.ExportDefaultDeclaration
    - typingsJapgolly.estraverse.estraverseStrings.ExportNamedDeclaration
    - typingsJapgolly.estraverse.estraverseStrings.ExportSpecifier
    - typingsJapgolly.estraverse.estraverseStrings.ExpressionStatement
    - typingsJapgolly.estraverse.estraverseStrings.ForStatement
    - typingsJapgolly.estraverse.estraverseStrings.ForInStatement
    - typingsJapgolly.estraverse.estraverseStrings.ForOfStatement
    - typingsJapgolly.estraverse.estraverseStrings.FunctionDeclaration
    - typingsJapgolly.estraverse.estraverseStrings.FunctionExpression
    - typingsJapgolly.estraverse.estraverseStrings.GeneratorExpression
    - typingsJapgolly.estraverse.estraverseStrings.Identifier
    - typingsJapgolly.estraverse.estraverseStrings.IfStatement
    - typingsJapgolly.estraverse.estraverseStrings.ImportExpression
    - typingsJapgolly.estraverse.estraverseStrings.ImportDeclaration
    - typingsJapgolly.estraverse.estraverseStrings.ImportDefaultSpecifier
    - typingsJapgolly.estraverse.estraverseStrings.ImportNamespaceSpecifier
    - typingsJapgolly.estraverse.estraverseStrings.ImportSpecifier
    - typingsJapgolly.estraverse.estraverseStrings.Literal
    - typingsJapgolly.estraverse.estraverseStrings.LabeledStatement
    - typingsJapgolly.estraverse.estraverseStrings.LogicalExpression
    - typingsJapgolly.estraverse.estraverseStrings.MemberExpression
    - typingsJapgolly.estraverse.estraverseStrings.MetaProperty
    - typingsJapgolly.estraverse.estraverseStrings.MethodDefinition
    - typingsJapgolly.estraverse.estraverseStrings.ModuleSpecifier
    - typingsJapgolly.estraverse.estraverseStrings.NewExpression
    - typingsJapgolly.estraverse.estraverseStrings.ObjectExpression
    - typingsJapgolly.estraverse.estraverseStrings.ObjectPattern
    - typingsJapgolly.estraverse.estraverseStrings.Program
    - typingsJapgolly.estraverse.estraverseStrings.Property
    - typingsJapgolly.estraverse.estraverseStrings.RestElement
    - typingsJapgolly.estraverse.estraverseStrings.ReturnStatement
    - typingsJapgolly.estraverse.estraverseStrings.SequenceExpression
    - typingsJapgolly.estraverse.estraverseStrings.SpreadElement
    - typingsJapgolly.estraverse.estraverseStrings.Super
    - typingsJapgolly.estraverse.estraverseStrings.SwitchStatement
    - typingsJapgolly.estraverse.estraverseStrings.SwitchCase
    - typingsJapgolly.estraverse.estraverseStrings.TaggedTemplateExpression
    - typingsJapgolly.estraverse.estraverseStrings.TemplateElement
    - typingsJapgolly.estraverse.estraverseStrings.TemplateLiteral
    - typingsJapgolly.estraverse.estraverseStrings.ThisExpression
    - typingsJapgolly.estraverse.estraverseStrings.ThrowStatement
    - typingsJapgolly.estraverse.estraverseStrings.TryStatement
    - typingsJapgolly.estraverse.estraverseStrings.UnaryExpression
    - typingsJapgolly.estraverse.estraverseStrings.UpdateExpression
    - typingsJapgolly.estraverse.estraverseStrings.VariableDeclaration
    - typingsJapgolly.estraverse.estraverseStrings.VariableDeclarator
    - typingsJapgolly.estraverse.estraverseStrings.WhileStatement
    - typingsJapgolly.estraverse.estraverseStrings.WithStatement
    - typingsJapgolly.estraverse.estraverseStrings.YieldExpression
  */
  trait NodeType extends StObject
  object NodeType {
    
    inline def ArrayExpression: typingsJapgolly.estraverse.estraverseStrings.ArrayExpression = "ArrayExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ArrayExpression]
    
    inline def ArrayPattern: typingsJapgolly.estraverse.estraverseStrings.ArrayPattern = "ArrayPattern".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ArrayPattern]
    
    inline def ArrowFunctionExpression: typingsJapgolly.estraverse.estraverseStrings.ArrowFunctionExpression = "ArrowFunctionExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ArrowFunctionExpression]
    
    inline def AssignmentExpression: typingsJapgolly.estraverse.estraverseStrings.AssignmentExpression = "AssignmentExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.AssignmentExpression]
    
    inline def AssignmentPattern: typingsJapgolly.estraverse.estraverseStrings.AssignmentPattern = "AssignmentPattern".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.AssignmentPattern]
    
    inline def AwaitExpression: typingsJapgolly.estraverse.estraverseStrings.AwaitExpression = "AwaitExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.AwaitExpression]
    
    inline def BinaryExpression: typingsJapgolly.estraverse.estraverseStrings.BinaryExpression = "BinaryExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.BinaryExpression]
    
    inline def BlockStatement: typingsJapgolly.estraverse.estraverseStrings.BlockStatement = "BlockStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.BlockStatement]
    
    inline def BreakStatement: typingsJapgolly.estraverse.estraverseStrings.BreakStatement = "BreakStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.BreakStatement]
    
    inline def CallExpression: typingsJapgolly.estraverse.estraverseStrings.CallExpression = "CallExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.CallExpression]
    
    inline def CatchClause: typingsJapgolly.estraverse.estraverseStrings.CatchClause = "CatchClause".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.CatchClause]
    
    inline def ClassBody: typingsJapgolly.estraverse.estraverseStrings.ClassBody = "ClassBody".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ClassBody]
    
    inline def ClassDeclaration: typingsJapgolly.estraverse.estraverseStrings.ClassDeclaration = "ClassDeclaration".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ClassDeclaration]
    
    inline def ClassExpression: typingsJapgolly.estraverse.estraverseStrings.ClassExpression = "ClassExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ClassExpression]
    
    inline def ComprehensionBlock: typingsJapgolly.estraverse.estraverseStrings.ComprehensionBlock = "ComprehensionBlock".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ComprehensionBlock]
    
    inline def ComprehensionExpression: typingsJapgolly.estraverse.estraverseStrings.ComprehensionExpression = "ComprehensionExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ComprehensionExpression]
    
    inline def ConditionalExpression: typingsJapgolly.estraverse.estraverseStrings.ConditionalExpression = "ConditionalExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ConditionalExpression]
    
    inline def ContinueStatement: typingsJapgolly.estraverse.estraverseStrings.ContinueStatement = "ContinueStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ContinueStatement]
    
    inline def DebuggerStatement: typingsJapgolly.estraverse.estraverseStrings.DebuggerStatement = "DebuggerStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.DebuggerStatement]
    
    inline def DirectiveStatement: typingsJapgolly.estraverse.estraverseStrings.DirectiveStatement = "DirectiveStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.DirectiveStatement]
    
    inline def DoWhileStatement: typingsJapgolly.estraverse.estraverseStrings.DoWhileStatement = "DoWhileStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.DoWhileStatement]
    
    inline def EmptyStatement: typingsJapgolly.estraverse.estraverseStrings.EmptyStatement = "EmptyStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.EmptyStatement]
    
    inline def ExportAllDeclaration: typingsJapgolly.estraverse.estraverseStrings.ExportAllDeclaration = "ExportAllDeclaration".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ExportAllDeclaration]
    
    inline def ExportDefaultDeclaration: typingsJapgolly.estraverse.estraverseStrings.ExportDefaultDeclaration = "ExportDefaultDeclaration".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ExportDefaultDeclaration]
    
    inline def ExportNamedDeclaration: typingsJapgolly.estraverse.estraverseStrings.ExportNamedDeclaration = "ExportNamedDeclaration".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ExportNamedDeclaration]
    
    inline def ExportSpecifier: typingsJapgolly.estraverse.estraverseStrings.ExportSpecifier = "ExportSpecifier".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ExportSpecifier]
    
    inline def ExpressionStatement: typingsJapgolly.estraverse.estraverseStrings.ExpressionStatement = "ExpressionStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ExpressionStatement]
    
    inline def ForInStatement: typingsJapgolly.estraverse.estraverseStrings.ForInStatement = "ForInStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ForInStatement]
    
    inline def ForOfStatement: typingsJapgolly.estraverse.estraverseStrings.ForOfStatement = "ForOfStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ForOfStatement]
    
    inline def ForStatement: typingsJapgolly.estraverse.estraverseStrings.ForStatement = "ForStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ForStatement]
    
    inline def FunctionDeclaration: typingsJapgolly.estraverse.estraverseStrings.FunctionDeclaration = "FunctionDeclaration".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.FunctionDeclaration]
    
    inline def FunctionExpression: typingsJapgolly.estraverse.estraverseStrings.FunctionExpression = "FunctionExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.FunctionExpression]
    
    inline def GeneratorExpression: typingsJapgolly.estraverse.estraverseStrings.GeneratorExpression = "GeneratorExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.GeneratorExpression]
    
    inline def Identifier: typingsJapgolly.estraverse.estraverseStrings.Identifier = "Identifier".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.Identifier]
    
    inline def IfStatement: typingsJapgolly.estraverse.estraverseStrings.IfStatement = "IfStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.IfStatement]
    
    inline def ImportDeclaration: typingsJapgolly.estraverse.estraverseStrings.ImportDeclaration = "ImportDeclaration".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ImportDeclaration]
    
    inline def ImportDefaultSpecifier: typingsJapgolly.estraverse.estraverseStrings.ImportDefaultSpecifier = "ImportDefaultSpecifier".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ImportDefaultSpecifier]
    
    inline def ImportExpression: typingsJapgolly.estraverse.estraverseStrings.ImportExpression = "ImportExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ImportExpression]
    
    inline def ImportNamespaceSpecifier: typingsJapgolly.estraverse.estraverseStrings.ImportNamespaceSpecifier = "ImportNamespaceSpecifier".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ImportNamespaceSpecifier]
    
    inline def ImportSpecifier: typingsJapgolly.estraverse.estraverseStrings.ImportSpecifier = "ImportSpecifier".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ImportSpecifier]
    
    inline def LabeledStatement: typingsJapgolly.estraverse.estraverseStrings.LabeledStatement = "LabeledStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.LabeledStatement]
    
    inline def Literal: typingsJapgolly.estraverse.estraverseStrings.Literal = "Literal".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.Literal]
    
    inline def LogicalExpression: typingsJapgolly.estraverse.estraverseStrings.LogicalExpression = "LogicalExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.LogicalExpression]
    
    inline def MemberExpression: typingsJapgolly.estraverse.estraverseStrings.MemberExpression = "MemberExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.MemberExpression]
    
    inline def MetaProperty: typingsJapgolly.estraverse.estraverseStrings.MetaProperty = "MetaProperty".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.MetaProperty]
    
    inline def MethodDefinition: typingsJapgolly.estraverse.estraverseStrings.MethodDefinition = "MethodDefinition".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.MethodDefinition]
    
    inline def ModuleSpecifier: typingsJapgolly.estraverse.estraverseStrings.ModuleSpecifier = "ModuleSpecifier".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ModuleSpecifier]
    
    inline def NewExpression: typingsJapgolly.estraverse.estraverseStrings.NewExpression = "NewExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.NewExpression]
    
    inline def ObjectExpression: typingsJapgolly.estraverse.estraverseStrings.ObjectExpression = "ObjectExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ObjectExpression]
    
    inline def ObjectPattern: typingsJapgolly.estraverse.estraverseStrings.ObjectPattern = "ObjectPattern".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ObjectPattern]
    
    inline def Program: typingsJapgolly.estraverse.estraverseStrings.Program = "Program".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.Program]
    
    inline def Property: typingsJapgolly.estraverse.estraverseStrings.Property = "Property".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.Property]
    
    inline def RestElement: typingsJapgolly.estraverse.estraverseStrings.RestElement = "RestElement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.RestElement]
    
    inline def ReturnStatement: typingsJapgolly.estraverse.estraverseStrings.ReturnStatement = "ReturnStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ReturnStatement]
    
    inline def SequenceExpression: typingsJapgolly.estraverse.estraverseStrings.SequenceExpression = "SequenceExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.SequenceExpression]
    
    inline def SpreadElement: typingsJapgolly.estraverse.estraverseStrings.SpreadElement = "SpreadElement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.SpreadElement]
    
    inline def Super: typingsJapgolly.estraverse.estraverseStrings.Super = "Super".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.Super]
    
    inline def SwitchCase: typingsJapgolly.estraverse.estraverseStrings.SwitchCase = "SwitchCase".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.SwitchCase]
    
    inline def SwitchStatement: typingsJapgolly.estraverse.estraverseStrings.SwitchStatement = "SwitchStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.SwitchStatement]
    
    inline def TaggedTemplateExpression: typingsJapgolly.estraverse.estraverseStrings.TaggedTemplateExpression = "TaggedTemplateExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.TaggedTemplateExpression]
    
    inline def TemplateElement: typingsJapgolly.estraverse.estraverseStrings.TemplateElement = "TemplateElement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.TemplateElement]
    
    inline def TemplateLiteral: typingsJapgolly.estraverse.estraverseStrings.TemplateLiteral = "TemplateLiteral".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.TemplateLiteral]
    
    inline def ThisExpression: typingsJapgolly.estraverse.estraverseStrings.ThisExpression = "ThisExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ThisExpression]
    
    inline def ThrowStatement: typingsJapgolly.estraverse.estraverseStrings.ThrowStatement = "ThrowStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.ThrowStatement]
    
    inline def TryStatement: typingsJapgolly.estraverse.estraverseStrings.TryStatement = "TryStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.TryStatement]
    
    inline def UnaryExpression: typingsJapgolly.estraverse.estraverseStrings.UnaryExpression = "UnaryExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.UnaryExpression]
    
    inline def UpdateExpression: typingsJapgolly.estraverse.estraverseStrings.UpdateExpression = "UpdateExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.UpdateExpression]
    
    inline def VariableDeclaration: typingsJapgolly.estraverse.estraverseStrings.VariableDeclaration = "VariableDeclaration".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.VariableDeclaration]
    
    inline def VariableDeclarator: typingsJapgolly.estraverse.estraverseStrings.VariableDeclarator = "VariableDeclarator".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.VariableDeclarator]
    
    inline def WhileStatement: typingsJapgolly.estraverse.estraverseStrings.WhileStatement = "WhileStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.WhileStatement]
    
    inline def WithStatement: typingsJapgolly.estraverse.estraverseStrings.WithStatement = "WithStatement".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.WithStatement]
    
    inline def YieldExpression: typingsJapgolly.estraverse.estraverseStrings.YieldExpression = "YieldExpression".asInstanceOf[typingsJapgolly.estraverse.estraverseStrings.YieldExpression]
  }
  
  trait Visitor extends StObject {
    
    var enter: js.UndefOr[
        js.ThisFunction2[
          /* this */ Controller, 
          /* node */ Node, 
          /* parent */ Node | Null, 
          VisitorOption | Node | Unit
        ]
      ] = js.undefined
    
    var fallback: js.UndefOr[
        iteration | (js.ThisFunction1[/* this */ Controller, /* node */ Node, js.Array[String]])
      ] = js.undefined
    
    var keys: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    var leave: js.UndefOr[
        js.ThisFunction2[
          /* this */ Controller, 
          /* node */ Node, 
          /* parent */ Node | Null, 
          VisitorOption | Node | Unit
        ]
      ] = js.undefined
  }
  object Visitor {
    
    inline def apply(): Visitor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Visitor]
    }
    
    extension [Self <: Visitor](x: Self) {
      
      inline def setEnter(
        value: js.ThisFunction2[
              /* this */ Controller, 
              /* node */ Node, 
              /* parent */ Node | Null, 
              VisitorOption | Node | Unit
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setFallback(value: iteration | (js.ThisFunction1[/* this */ Controller, /* node */ Node, js.Array[String]])): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setKeys(value: Record[String, js.Array[String]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLeave(
        value: js.ThisFunction2[
              /* this */ Controller, 
              /* node */ Node, 
              /* parent */ Node | Null, 
              VisitorOption | Node | Unit
            ]
      ): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
}
