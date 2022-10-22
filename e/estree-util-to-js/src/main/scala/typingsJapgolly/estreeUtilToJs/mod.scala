package typingsJapgolly.estreeUtilToJs

import org.scalajs.dom.Node
import typingsJapgolly.estreeUtilToJs.libMod.OptionsWithSourceMapGenerator
import typingsJapgolly.estreeUtilToJs.libMod.OptionsWithoutSourceMapGenerator
import typingsJapgolly.estreeUtilToJs.libMod.Program
import typingsJapgolly.estreeUtilToJs.libMod.ResultWithSourceMapGenerator
import typingsJapgolly.estreeUtilToJs.libMod.ResultWithoutSourceMapGenerator
import typingsJapgolly.sourceMap.mod.Mapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-util-to-js", "toJs")
  @js.native
  val toJs: (js.Function2[
    /* value */ Program, 
    /* options */ OptionsWithSourceMapGenerator, 
    ResultWithSourceMapGenerator
  ]) & (js.Function2[
    /* value */ Program, 
    /* options */ js.UndefOr[OptionsWithoutSourceMapGenerator], 
    ResultWithoutSourceMapGenerator
  ]) = js.native
  
  type Handler = typingsJapgolly.estreeUtilToJs.libTypesMod.Handler
  
  /* Inlined estree-util-to-js.estree-util-to-js/lib/types.Handlers */
  trait Handlers extends StObject {
    
    var ArrayExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ArrayPattern: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ArrowFunctionExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var AssignmentExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var AssignmentPattern: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var AwaitExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var BinaryExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var BlockStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var BreakStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var CallExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var CatchClause: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ChainExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ClassBody: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ClassDeclaration: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ClassExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ConditionalExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ContinueStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var DebuggerStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var DoWhileStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var EmptyStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ExportAllDeclaration: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ExportDefaultDeclaration: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ExportNamedDeclaration: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ExportSpecifier: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ExpressionStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ForInStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ForOfStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ForStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var FunctionDeclaration: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var FunctionExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var Identifier: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var IfStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ImportDeclaration: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ImportDefaultSpecifier: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ImportExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ImportNamespaceSpecifier: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ImportSpecifier: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXAttribute: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXClosingElement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXClosingFragment: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXElement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXEmptyExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXExpressionContainer: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXFragment: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXIdentifier: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXMemberExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXNamespacedName: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXOpeningElement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXOpeningFragment: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXSpreadAttribute: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var JSXText: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var LabeledStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var Literal: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var LogicalExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var MemberExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var MetaProperty: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var MethodDefinition: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var NewExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ObjectExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ObjectPattern: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var PrivateIdentifier: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var Program: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var Property: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var PropertyDefinition: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var RestElement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ReturnStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var SequenceExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var SpreadElement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var StaticBlock: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var Super: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var SwitchCase: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var SwitchStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var TaggedTemplateExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var TemplateElement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var TemplateLiteral: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ThisExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var ThrowStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var TryStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var UnaryExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var UpdateExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var VariableDeclaration: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var VariableDeclarator: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var WhileStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var WithStatement: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
    
    var YieldExpression: js.UndefOr[typingsJapgolly.estreeUtilToJs.libTypesMod.Handler] = js.undefined
  }
  object Handlers {
    
    inline def apply(): Handlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handlers]
    }
    
    extension [Self <: Handlers](x: Self) {
      
      inline def setArrayExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ArrayExpression", value.asInstanceOf[js.Any])
      
      inline def setArrayExpressionUndefined: Self = StObject.set(x, "ArrayExpression", js.undefined)
      
      inline def setArrayPattern(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ArrayPattern", value.asInstanceOf[js.Any])
      
      inline def setArrayPatternUndefined: Self = StObject.set(x, "ArrayPattern", js.undefined)
      
      inline def setArrowFunctionExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ArrowFunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setArrowFunctionExpressionUndefined: Self = StObject.set(x, "ArrowFunctionExpression", js.undefined)
      
      inline def setAssignmentExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "AssignmentExpression", value.asInstanceOf[js.Any])
      
      inline def setAssignmentExpressionUndefined: Self = StObject.set(x, "AssignmentExpression", js.undefined)
      
      inline def setAssignmentPattern(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "AssignmentPattern", value.asInstanceOf[js.Any])
      
      inline def setAssignmentPatternUndefined: Self = StObject.set(x, "AssignmentPattern", js.undefined)
      
      inline def setAwaitExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "AwaitExpression", value.asInstanceOf[js.Any])
      
      inline def setAwaitExpressionUndefined: Self = StObject.set(x, "AwaitExpression", js.undefined)
      
      inline def setBinaryExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "BinaryExpression", value.asInstanceOf[js.Any])
      
      inline def setBinaryExpressionUndefined: Self = StObject.set(x, "BinaryExpression", js.undefined)
      
      inline def setBlockStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "BlockStatement", value.asInstanceOf[js.Any])
      
      inline def setBlockStatementUndefined: Self = StObject.set(x, "BlockStatement", js.undefined)
      
      inline def setBreakStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "BreakStatement", value.asInstanceOf[js.Any])
      
      inline def setBreakStatementUndefined: Self = StObject.set(x, "BreakStatement", js.undefined)
      
      inline def setCallExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "CallExpression", value.asInstanceOf[js.Any])
      
      inline def setCallExpressionUndefined: Self = StObject.set(x, "CallExpression", js.undefined)
      
      inline def setCatchClause(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "CatchClause", value.asInstanceOf[js.Any])
      
      inline def setCatchClauseUndefined: Self = StObject.set(x, "CatchClause", js.undefined)
      
      inline def setChainExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ChainExpression", value.asInstanceOf[js.Any])
      
      inline def setChainExpressionUndefined: Self = StObject.set(x, "ChainExpression", js.undefined)
      
      inline def setClassBody(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ClassBody", value.asInstanceOf[js.Any])
      
      inline def setClassBodyUndefined: Self = StObject.set(x, "ClassBody", js.undefined)
      
      inline def setClassDeclaration(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ClassDeclaration", value.asInstanceOf[js.Any])
      
      inline def setClassDeclarationUndefined: Self = StObject.set(x, "ClassDeclaration", js.undefined)
      
      inline def setClassExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ClassExpression", value.asInstanceOf[js.Any])
      
      inline def setClassExpressionUndefined: Self = StObject.set(x, "ClassExpression", js.undefined)
      
      inline def setConditionalExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ConditionalExpression", value.asInstanceOf[js.Any])
      
      inline def setConditionalExpressionUndefined: Self = StObject.set(x, "ConditionalExpression", js.undefined)
      
      inline def setContinueStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ContinueStatement", value.asInstanceOf[js.Any])
      
      inline def setContinueStatementUndefined: Self = StObject.set(x, "ContinueStatement", js.undefined)
      
      inline def setDebuggerStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "DebuggerStatement", value.asInstanceOf[js.Any])
      
      inline def setDebuggerStatementUndefined: Self = StObject.set(x, "DebuggerStatement", js.undefined)
      
      inline def setDoWhileStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "DoWhileStatement", value.asInstanceOf[js.Any])
      
      inline def setDoWhileStatementUndefined: Self = StObject.set(x, "DoWhileStatement", js.undefined)
      
      inline def setEmptyStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "EmptyStatement", value.asInstanceOf[js.Any])
      
      inline def setEmptyStatementUndefined: Self = StObject.set(x, "EmptyStatement", js.undefined)
      
      inline def setExportAllDeclaration(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ExportAllDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportAllDeclarationUndefined: Self = StObject.set(x, "ExportAllDeclaration", js.undefined)
      
      inline def setExportDefaultDeclaration(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ExportDefaultDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportDefaultDeclarationUndefined: Self = StObject.set(x, "ExportDefaultDeclaration", js.undefined)
      
      inline def setExportNamedDeclaration(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ExportNamedDeclaration", value.asInstanceOf[js.Any])
      
      inline def setExportNamedDeclarationUndefined: Self = StObject.set(x, "ExportNamedDeclaration", js.undefined)
      
      inline def setExportSpecifier(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ExportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setExportSpecifierUndefined: Self = StObject.set(x, "ExportSpecifier", js.undefined)
      
      inline def setExpressionStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ExpressionStatement", value.asInstanceOf[js.Any])
      
      inline def setExpressionStatementUndefined: Self = StObject.set(x, "ExpressionStatement", js.undefined)
      
      inline def setForInStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ForInStatement", value.asInstanceOf[js.Any])
      
      inline def setForInStatementUndefined: Self = StObject.set(x, "ForInStatement", js.undefined)
      
      inline def setForOfStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ForOfStatement", value.asInstanceOf[js.Any])
      
      inline def setForOfStatementUndefined: Self = StObject.set(x, "ForOfStatement", js.undefined)
      
      inline def setForStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ForStatement", value.asInstanceOf[js.Any])
      
      inline def setForStatementUndefined: Self = StObject.set(x, "ForStatement", js.undefined)
      
      inline def setFunctionDeclaration(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "FunctionDeclaration", value.asInstanceOf[js.Any])
      
      inline def setFunctionDeclarationUndefined: Self = StObject.set(x, "FunctionDeclaration", js.undefined)
      
      inline def setFunctionExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "FunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setFunctionExpressionUndefined: Self = StObject.set(x, "FunctionExpression", js.undefined)
      
      inline def setIdentifier(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
      
      inline def setIfStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "IfStatement", value.asInstanceOf[js.Any])
      
      inline def setIfStatementUndefined: Self = StObject.set(x, "IfStatement", js.undefined)
      
      inline def setImportDeclaration(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ImportDeclaration", value.asInstanceOf[js.Any])
      
      inline def setImportDeclarationUndefined: Self = StObject.set(x, "ImportDeclaration", js.undefined)
      
      inline def setImportDefaultSpecifier(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ImportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportDefaultSpecifierUndefined: Self = StObject.set(x, "ImportDefaultSpecifier", js.undefined)
      
      inline def setImportExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ImportExpression", value.asInstanceOf[js.Any])
      
      inline def setImportExpressionUndefined: Self = StObject.set(x, "ImportExpression", js.undefined)
      
      inline def setImportNamespaceSpecifier(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportNamespaceSpecifierUndefined: Self = StObject.set(x, "ImportNamespaceSpecifier", js.undefined)
      
      inline def setImportSpecifier(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ImportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setImportSpecifierUndefined: Self = StObject.set(x, "ImportSpecifier", js.undefined)
      
      inline def setJSXAttribute(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXAttribute", value.asInstanceOf[js.Any])
      
      inline def setJSXAttributeUndefined: Self = StObject.set(x, "JSXAttribute", js.undefined)
      
      inline def setJSXClosingElement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXClosingElement", value.asInstanceOf[js.Any])
      
      inline def setJSXClosingElementUndefined: Self = StObject.set(x, "JSXClosingElement", js.undefined)
      
      inline def setJSXClosingFragment(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXClosingFragment", value.asInstanceOf[js.Any])
      
      inline def setJSXClosingFragmentUndefined: Self = StObject.set(x, "JSXClosingFragment", js.undefined)
      
      inline def setJSXElement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXElement", value.asInstanceOf[js.Any])
      
      inline def setJSXElementUndefined: Self = StObject.set(x, "JSXElement", js.undefined)
      
      inline def setJSXEmptyExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXEmptyExpression", value.asInstanceOf[js.Any])
      
      inline def setJSXEmptyExpressionUndefined: Self = StObject.set(x, "JSXEmptyExpression", js.undefined)
      
      inline def setJSXExpressionContainer(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXExpressionContainer", value.asInstanceOf[js.Any])
      
      inline def setJSXExpressionContainerUndefined: Self = StObject.set(x, "JSXExpressionContainer", js.undefined)
      
      inline def setJSXFragment(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXFragment", value.asInstanceOf[js.Any])
      
      inline def setJSXFragmentUndefined: Self = StObject.set(x, "JSXFragment", js.undefined)
      
      inline def setJSXIdentifier(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXIdentifier", value.asInstanceOf[js.Any])
      
      inline def setJSXIdentifierUndefined: Self = StObject.set(x, "JSXIdentifier", js.undefined)
      
      inline def setJSXMemberExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXMemberExpression", value.asInstanceOf[js.Any])
      
      inline def setJSXMemberExpressionUndefined: Self = StObject.set(x, "JSXMemberExpression", js.undefined)
      
      inline def setJSXNamespacedName(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXNamespacedName", value.asInstanceOf[js.Any])
      
      inline def setJSXNamespacedNameUndefined: Self = StObject.set(x, "JSXNamespacedName", js.undefined)
      
      inline def setJSXOpeningElement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXOpeningElement", value.asInstanceOf[js.Any])
      
      inline def setJSXOpeningElementUndefined: Self = StObject.set(x, "JSXOpeningElement", js.undefined)
      
      inline def setJSXOpeningFragment(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXOpeningFragment", value.asInstanceOf[js.Any])
      
      inline def setJSXOpeningFragmentUndefined: Self = StObject.set(x, "JSXOpeningFragment", js.undefined)
      
      inline def setJSXSpreadAttribute(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXSpreadAttribute", value.asInstanceOf[js.Any])
      
      inline def setJSXSpreadAttributeUndefined: Self = StObject.set(x, "JSXSpreadAttribute", js.undefined)
      
      inline def setJSXText(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "JSXText", value.asInstanceOf[js.Any])
      
      inline def setJSXTextUndefined: Self = StObject.set(x, "JSXText", js.undefined)
      
      inline def setLabeledStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "LabeledStatement", value.asInstanceOf[js.Any])
      
      inline def setLabeledStatementUndefined: Self = StObject.set(x, "LabeledStatement", js.undefined)
      
      inline def setLiteral(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
      
      inline def setLiteralUndefined: Self = StObject.set(x, "Literal", js.undefined)
      
      inline def setLogicalExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "LogicalExpression", value.asInstanceOf[js.Any])
      
      inline def setLogicalExpressionUndefined: Self = StObject.set(x, "LogicalExpression", js.undefined)
      
      inline def setMemberExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "MemberExpression", value.asInstanceOf[js.Any])
      
      inline def setMemberExpressionUndefined: Self = StObject.set(x, "MemberExpression", js.undefined)
      
      inline def setMetaProperty(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "MetaProperty", value.asInstanceOf[js.Any])
      
      inline def setMetaPropertyUndefined: Self = StObject.set(x, "MetaProperty", js.undefined)
      
      inline def setMethodDefinition(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "MethodDefinition", value.asInstanceOf[js.Any])
      
      inline def setMethodDefinitionUndefined: Self = StObject.set(x, "MethodDefinition", js.undefined)
      
      inline def setNewExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "NewExpression", value.asInstanceOf[js.Any])
      
      inline def setNewExpressionUndefined: Self = StObject.set(x, "NewExpression", js.undefined)
      
      inline def setObjectExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ObjectExpression", value.asInstanceOf[js.Any])
      
      inline def setObjectExpressionUndefined: Self = StObject.set(x, "ObjectExpression", js.undefined)
      
      inline def setObjectPattern(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ObjectPattern", value.asInstanceOf[js.Any])
      
      inline def setObjectPatternUndefined: Self = StObject.set(x, "ObjectPattern", js.undefined)
      
      inline def setPrivateIdentifier(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "PrivateIdentifier", value.asInstanceOf[js.Any])
      
      inline def setPrivateIdentifierUndefined: Self = StObject.set(x, "PrivateIdentifier", js.undefined)
      
      inline def setProgram(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
      
      inline def setProgramUndefined: Self = StObject.set(x, "Program", js.undefined)
      
      inline def setProperty(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
      
      inline def setPropertyDefinition(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "PropertyDefinition", value.asInstanceOf[js.Any])
      
      inline def setPropertyDefinitionUndefined: Self = StObject.set(x, "PropertyDefinition", js.undefined)
      
      inline def setPropertyUndefined: Self = StObject.set(x, "Property", js.undefined)
      
      inline def setRestElement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "RestElement", value.asInstanceOf[js.Any])
      
      inline def setRestElementUndefined: Self = StObject.set(x, "RestElement", js.undefined)
      
      inline def setReturnStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ReturnStatement", value.asInstanceOf[js.Any])
      
      inline def setReturnStatementUndefined: Self = StObject.set(x, "ReturnStatement", js.undefined)
      
      inline def setSequenceExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "SequenceExpression", value.asInstanceOf[js.Any])
      
      inline def setSequenceExpressionUndefined: Self = StObject.set(x, "SequenceExpression", js.undefined)
      
      inline def setSpreadElement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "SpreadElement", value.asInstanceOf[js.Any])
      
      inline def setSpreadElementUndefined: Self = StObject.set(x, "SpreadElement", js.undefined)
      
      inline def setStaticBlock(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "StaticBlock", value.asInstanceOf[js.Any])
      
      inline def setStaticBlockUndefined: Self = StObject.set(x, "StaticBlock", js.undefined)
      
      inline def setSuper(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "Super", value.asInstanceOf[js.Any])
      
      inline def setSuperUndefined: Self = StObject.set(x, "Super", js.undefined)
      
      inline def setSwitchCase(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "SwitchCase", value.asInstanceOf[js.Any])
      
      inline def setSwitchCaseUndefined: Self = StObject.set(x, "SwitchCase", js.undefined)
      
      inline def setSwitchStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "SwitchStatement", value.asInstanceOf[js.Any])
      
      inline def setSwitchStatementUndefined: Self = StObject.set(x, "SwitchStatement", js.undefined)
      
      inline def setTaggedTemplateExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "TaggedTemplateExpression", value.asInstanceOf[js.Any])
      
      inline def setTaggedTemplateExpressionUndefined: Self = StObject.set(x, "TaggedTemplateExpression", js.undefined)
      
      inline def setTemplateElement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "TemplateElement", value.asInstanceOf[js.Any])
      
      inline def setTemplateElementUndefined: Self = StObject.set(x, "TemplateElement", js.undefined)
      
      inline def setTemplateLiteral(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "TemplateLiteral", value.asInstanceOf[js.Any])
      
      inline def setTemplateLiteralUndefined: Self = StObject.set(x, "TemplateLiteral", js.undefined)
      
      inline def setThisExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ThisExpression", value.asInstanceOf[js.Any])
      
      inline def setThisExpressionUndefined: Self = StObject.set(x, "ThisExpression", js.undefined)
      
      inline def setThrowStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "ThrowStatement", value.asInstanceOf[js.Any])
      
      inline def setThrowStatementUndefined: Self = StObject.set(x, "ThrowStatement", js.undefined)
      
      inline def setTryStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "TryStatement", value.asInstanceOf[js.Any])
      
      inline def setTryStatementUndefined: Self = StObject.set(x, "TryStatement", js.undefined)
      
      inline def setUnaryExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "UnaryExpression", value.asInstanceOf[js.Any])
      
      inline def setUnaryExpressionUndefined: Self = StObject.set(x, "UnaryExpression", js.undefined)
      
      inline def setUpdateExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
      
      inline def setUpdateExpressionUndefined: Self = StObject.set(x, "UpdateExpression", js.undefined)
      
      inline def setVariableDeclaration(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "VariableDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVariableDeclarationUndefined: Self = StObject.set(x, "VariableDeclaration", js.undefined)
      
      inline def setVariableDeclarator(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "VariableDeclarator", value.asInstanceOf[js.Any])
      
      inline def setVariableDeclaratorUndefined: Self = StObject.set(x, "VariableDeclarator", js.undefined)
      
      inline def setWhileStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "WhileStatement", value.asInstanceOf[js.Any])
      
      inline def setWhileStatementUndefined: Self = StObject.set(x, "WhileStatement", js.undefined)
      
      inline def setWithStatement(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "WithStatement", value.asInstanceOf[js.Any])
      
      inline def setWithStatementUndefined: Self = StObject.set(x, "WithStatement", js.undefined)
      
      inline def setYieldExpression(value: typingsJapgolly.estreeUtilToJs.libTypesMod.Handler): Self = StObject.set(x, "YieldExpression", value.asInstanceOf[js.Any])
      
      inline def setYieldExpressionUndefined: Self = StObject.set(x, "YieldExpression", js.undefined)
    }
  }
  
  type Options = typingsJapgolly.estreeUtilToJs.libMod.Options
  
  /* Inlined estree-util-to-js.estree-util-to-js/lib/types.State */
  @js.native
  trait State extends StObject {
    
    var column: js.UndefOr[Double] = js.native
    
    var indent: String = js.native
    
    var indentLevel: Double = js.native
    
    var line: js.UndefOr[Double] = js.native
    
    var lineEnd: String = js.native
    
    var lineEndSize: js.UndefOr[Double] = js.native
    
    var mapping: js.UndefOr[Mapping] = js.native
    
    var output: String = js.native
    
    def write(code: String): Unit = js.native
    def write(code: String, node: Node): Unit = js.native
    
    var writeComments: Boolean = js.native
  }
}
