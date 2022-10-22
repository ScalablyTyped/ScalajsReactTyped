package typingsJapgolly.webpack.anon

import org.scalajs.dom.Comment
import typingsJapgolly.estree.mod.ArrayExpression
import typingsJapgolly.estree.mod.ArrowFunctionExpression
import typingsJapgolly.estree.mod.AssignmentExpression
import typingsJapgolly.estree.mod.AwaitExpression
import typingsJapgolly.estree.mod.BigIntLiteral
import typingsJapgolly.estree.mod.BinaryExpression
import typingsJapgolly.estree.mod.BlockStatement
import typingsJapgolly.estree.mod.BreakStatement
import typingsJapgolly.estree.mod.ChainExpression
import typingsJapgolly.estree.mod.ClassDeclaration
import typingsJapgolly.estree.mod.ClassExpression
import typingsJapgolly.estree.mod.ConditionalExpression
import typingsJapgolly.estree.mod.ContinueStatement
import typingsJapgolly.estree.mod.DebuggerStatement
import typingsJapgolly.estree.mod.DoWhileStatement
import typingsJapgolly.estree.mod.EmptyStatement
import typingsJapgolly.estree.mod.ExportAllDeclaration
import typingsJapgolly.estree.mod.ExportDefaultDeclaration
import typingsJapgolly.estree.mod.ExportNamedDeclaration
import typingsJapgolly.estree.mod.ExpressionStatement
import typingsJapgolly.estree.mod.ForInStatement
import typingsJapgolly.estree.mod.ForOfStatement
import typingsJapgolly.estree.mod.ForStatement
import typingsJapgolly.estree.mod.FunctionDeclaration
import typingsJapgolly.estree.mod.FunctionExpression
import typingsJapgolly.estree.mod.Identifier
import typingsJapgolly.estree.mod.IfStatement
import typingsJapgolly.estree.mod.ImportDeclaration
import typingsJapgolly.estree.mod.ImportExpression
import typingsJapgolly.estree.mod.LabeledStatement
import typingsJapgolly.estree.mod.LogicalExpression
import typingsJapgolly.estree.mod.MemberExpression
import typingsJapgolly.estree.mod.MetaProperty
import typingsJapgolly.estree.mod.MethodDefinition
import typingsJapgolly.estree.mod.NewExpression
import typingsJapgolly.estree.mod.ObjectExpression
import typingsJapgolly.estree.mod.PrivateIdentifier
import typingsJapgolly.estree.mod.Program
import typingsJapgolly.estree.mod.PropertyDefinition
import typingsJapgolly.estree.mod.RegExpLiteral
import typingsJapgolly.estree.mod.ReturnStatement
import typingsJapgolly.estree.mod.SequenceExpression
import typingsJapgolly.estree.mod.SimpleCallExpression
import typingsJapgolly.estree.mod.SimpleLiteral
import typingsJapgolly.estree.mod.StaticBlock
import typingsJapgolly.estree.mod.SwitchStatement
import typingsJapgolly.estree.mod.TaggedTemplateExpression
import typingsJapgolly.estree.mod.TemplateLiteral
import typingsJapgolly.estree.mod.ThisExpression
import typingsJapgolly.estree.mod.ThrowStatement
import typingsJapgolly.estree.mod.TryStatement
import typingsJapgolly.estree.mod.UnaryExpression
import typingsJapgolly.estree.mod.UpdateExpression
import typingsJapgolly.estree.mod.VariableDeclaration
import typingsJapgolly.estree.mod.VariableDeclarator
import typingsJapgolly.estree.mod.WhileStatement
import typingsJapgolly.estree.mod.WithStatement
import typingsJapgolly.estree.mod.YieldExpression
import typingsJapgolly.tapable.mod.HookMap
import typingsJapgolly.tapable.mod.SyncBailHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import typingsJapgolly.webpack.mod.BasicEvaluatedExpression
import typingsJapgolly.webpack.mod.CallExpression
import typingsJapgolly.webpack.mod.Declaration
import typingsJapgolly.webpack.mod.Expression
import typingsJapgolly.webpack.mod.ImportSource
import typingsJapgolly.webpack.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  evaluateTypeof :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.UnaryExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluate :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateIdentifier :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.ThisExpression | estree.estree.MemberExpression | estree.estree.MetaProperty | estree.estree.Identifier], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateDefinedIdentifier :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.ThisExpression | estree.estree.MemberExpression | estree.estree.Identifier], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateNewExpression :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.NewExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateCallExpression :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.CallExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   evaluateCallExpressionMember :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.CallExpression, undefined | webpack.webpack.BasicEvaluatedExpression], undefined | null | webpack.webpack.BasicEvaluatedExpression, tapable.tapable.UnsetAdditionalOptions>>,   isPure :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.UnaryExpression | estree.estree.ThisExpression | estree.estree.ArrayExpression | estree.estree.ObjectExpression | estree.estree.FunctionExpression | estree.estree.ArrowFunctionExpression | estree.estree.YieldExpression | estree.estree.SimpleLiteral | estree.estree.RegExpLiteral | estree.estree.BigIntLiteral | estree.estree.UpdateExpression | estree.estree.BinaryExpression | estree.estree.AssignmentExpression | estree.estree.LogicalExpression | estree.estree.MemberExpression | estree.estree.ConditionalExpression | estree.estree.SimpleCallExpression | estree.estree.NewExpression | estree.estree.SequenceExpression | estree.estree.TemplateLiteral | estree.estree.TaggedTemplateExpression | estree.estree.ClassExpression | estree.estree.MetaProperty | estree.estree.Identifier | estree.estree.AwaitExpression | estree.estree.ImportExpression | estree.estree.ChainExpression | estree.estree.FunctionDeclaration | estree.estree.VariableDeclaration | estree.estree.ClassDeclaration | estree.estree.PrivateIdentifier, number], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   preStatement :tapable.tapable.SyncBailHook<[estree.estree.FunctionDeclaration | estree.estree.VariableDeclaration | estree.estree.ClassDeclaration | estree.estree.ExpressionStatement | estree.estree.BlockStatement | estree.estree.StaticBlock | estree.estree.EmptyStatement | estree.estree.DebuggerStatement | estree.estree.WithStatement | estree.estree.ReturnStatement | estree.estree.LabeledStatement | estree.estree.BreakStatement | estree.estree.ContinueStatement | estree.estree.IfStatement | estree.estree.SwitchStatement | estree.estree.ThrowStatement | estree.estree.TryStatement | estree.estree.WhileStatement | estree.estree.DoWhileStatement | estree.estree.ForStatement | estree.estree.ForInStatement | estree.estree.ForOfStatement | estree.estree.ImportDeclaration | estree.estree.ExportNamedDeclaration | estree.estree.ExportDefaultDeclaration | estree.estree.ExportAllDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   blockPreStatement :tapable.tapable.SyncBailHook<[estree.estree.FunctionDeclaration | estree.estree.VariableDeclaration | estree.estree.ClassDeclaration | estree.estree.ExpressionStatement | estree.estree.BlockStatement | estree.estree.StaticBlock | estree.estree.EmptyStatement | estree.estree.DebuggerStatement | estree.estree.WithStatement | estree.estree.ReturnStatement | estree.estree.LabeledStatement | estree.estree.BreakStatement | estree.estree.ContinueStatement | estree.estree.IfStatement | estree.estree.SwitchStatement | estree.estree.ThrowStatement | estree.estree.TryStatement | estree.estree.WhileStatement | estree.estree.DoWhileStatement | estree.estree.ForStatement | estree.estree.ForInStatement | estree.estree.ForOfStatement | estree.estree.ImportDeclaration | estree.estree.ExportNamedDeclaration | estree.estree.ExportDefaultDeclaration | estree.estree.ExportAllDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   statement :tapable.tapable.SyncBailHook<[estree.estree.FunctionDeclaration | estree.estree.VariableDeclaration | estree.estree.ClassDeclaration | estree.estree.ExpressionStatement | estree.estree.BlockStatement | estree.estree.StaticBlock | estree.estree.EmptyStatement | estree.estree.DebuggerStatement | estree.estree.WithStatement | estree.estree.ReturnStatement | estree.estree.LabeledStatement | estree.estree.BreakStatement | estree.estree.ContinueStatement | estree.estree.IfStatement | estree.estree.SwitchStatement | estree.estree.ThrowStatement | estree.estree.TryStatement | estree.estree.WhileStatement | estree.estree.DoWhileStatement | estree.estree.ForStatement | estree.estree.ForInStatement | estree.estree.ForOfStatement | estree.estree.ImportDeclaration | estree.estree.ExportNamedDeclaration | estree.estree.ExportDefaultDeclaration | estree.estree.ExportAllDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   statementIf :tapable.tapable.SyncBailHook<[estree.estree.IfStatement], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   classExtendsExpression :tapable.tapable.SyncBailHook<[webpack.webpack.Expression, estree.estree.ClassExpression | estree.estree.ClassDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   classBodyElement :tapable.tapable.SyncBailHook<[estree.estree.MethodDefinition | estree.estree.PropertyDefinition, estree.estree.ClassExpression | estree.estree.ClassDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   classBodyValue :tapable.tapable.SyncBailHook<[webpack.webpack.Expression, estree.estree.MethodDefinition | estree.estree.PropertyDefinition, estree.estree.ClassExpression | estree.estree.ClassDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   label :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.LabeledStatement], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   import :tapable.tapable.SyncBailHook<[estree.estree.ImportDeclaration, webpack.webpack.ImportSource], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   importSpecifier :tapable.tapable.SyncBailHook<[estree.estree.ImportDeclaration, webpack.webpack.ImportSource, string, string], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   export :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportImport :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration, webpack.webpack.ImportSource], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportDeclaration :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration, webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportExpression :tapable.tapable.SyncBailHook<[estree.estree.ExportDefaultDeclaration, webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportSpecifier :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration, string, string, undefined | number], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   exportImportSpecifier :tapable.tapable.SyncBailHook<[estree.estree.ExportNamedDeclaration | estree.estree.ExportAllDeclaration, webpack.webpack.ImportSource, string, string, undefined | number], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   preDeclarator :tapable.tapable.SyncBailHook<[estree.estree.VariableDeclarator, webpack.webpack.Statement], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   declarator :tapable.tapable.SyncBailHook<[estree.estree.VariableDeclarator, webpack.webpack.Statement], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   varDeclaration :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   varDeclarationLet :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   varDeclarationConst :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   varDeclarationVar :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Declaration], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   pattern :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.Identifier], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   canRename :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   rename :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   assign :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.AssignmentExpression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   assignMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.AssignmentExpression, std.Array<string>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   typeof :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   importCall :tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   topLevelAwait :tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   call :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   callMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.CallExpression, std.Array<string>, std.Array<boolean>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   memberChainOfCallMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression, std.Array<string>, webpack.webpack.CallExpression, std.Array<string>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   callMemberChainOfCallMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression, std.Array<string>, webpack.webpack.CallExpression, std.Array<string>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   optionalChaining :tapable.tapable.SyncBailHook<[estree.estree.ChainExpression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   new :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[estree.estree.NewExpression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   binaryExpression :tapable.tapable.SyncBailHook<[estree.estree.BinaryExpression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   expression :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   expressionMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression, std.Array<string>, std.Array<boolean>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   unhandledExpressionMemberChain :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[webpack.webpack.Expression, std.Array<string>], boolean | void, tapable.tapable.UnsetAdditionalOptions>>,   expressionConditionalOperator :tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   expressionLogicalOperator :tapable.tapable.SyncBailHook<[webpack.webpack.Expression], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   program :tapable.tapable.SyncBailHook<[estree.estree.Program, std.Array<std.Comment>], boolean | void, tapable.tapable.UnsetAdditionalOptions>,   finish :tapable.tapable.SyncBailHook<[estree.estree.Program, std.Array<std.Comment>], boolean | void, tapable.tapable.UnsetAdditionalOptions>}> */
trait ReadonlyevaluateTypeofHoo extends StObject {
  
  val assign: HookMap[
    SyncBailHook[js.Array[AssignmentExpression], Boolean | Unit, UnsetAdditionalOptions]
  ]
  
  val assignMemberChain: HookMap[
    SyncBailHook[
      js.Tuple2[AssignmentExpression, js.Array[String]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val binaryExpression: SyncBailHook[js.Array[BinaryExpression], Boolean | Unit, UnsetAdditionalOptions]
  
  val blockPreStatement: SyncBailHook[
    js.Array[
      FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val call: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val callMemberChain: HookMap[
    SyncBailHook[
      js.Tuple3[CallExpression, js.Array[String], js.Array[Boolean]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val callMemberChainOfCallMemberChain: HookMap[
    SyncBailHook[
      js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val canRename: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val classBodyElement: SyncBailHook[
    js.Tuple2[MethodDefinition | PropertyDefinition, ClassExpression | ClassDeclaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val classBodyValue: SyncBailHook[
    js.Tuple3[
      Expression, 
      MethodDefinition | PropertyDefinition, 
      ClassExpression | ClassDeclaration
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val classExtendsExpression: SyncBailHook[
    js.Tuple2[Expression, ClassExpression | ClassDeclaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val declarator: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions]
  
  val evaluate: HookMap[
    SyncBailHook[
      js.Array[Expression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateCallExpression: HookMap[
    SyncBailHook[
      js.Array[CallExpression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateCallExpressionMember: HookMap[
    SyncBailHook[
      js.Tuple2[CallExpression, js.UndefOr[BasicEvaluatedExpression]], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateDefinedIdentifier: HookMap[
    SyncBailHook[
      js.Array[ThisExpression | MemberExpression | Identifier], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateIdentifier: HookMap[
    SyncBailHook[
      js.Array[ThisExpression | MemberExpression | MetaProperty | Identifier], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateNewExpression: HookMap[
    SyncBailHook[
      js.Array[NewExpression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val evaluateTypeof: HookMap[
    SyncBailHook[
      js.Array[UnaryExpression], 
      js.UndefOr[Null | BasicEvaluatedExpression], 
      UnsetAdditionalOptions
    ]
  ]
  
  val `export`: SyncBailHook[
    js.Array[ExportNamedDeclaration | ExportAllDeclaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportDeclaration: SyncBailHook[
    js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, Declaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportExpression: SyncBailHook[
    js.Tuple2[ExportDefaultDeclaration, Declaration], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportImport: SyncBailHook[
    js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, ImportSource], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportImportSpecifier: SyncBailHook[
    js.Tuple5[
      ExportNamedDeclaration | ExportAllDeclaration, 
      ImportSource, 
      String, 
      String, 
      js.UndefOr[Double]
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val exportSpecifier: SyncBailHook[
    js.Tuple4[ExportNamedDeclaration | ExportAllDeclaration, String, String, js.UndefOr[Double]], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val expression: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val expressionConditionalOperator: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]
  
  val expressionLogicalOperator: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]
  
  val expressionMemberChain: HookMap[
    SyncBailHook[
      js.Tuple3[Expression, js.Array[String], js.Array[Boolean]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val finish: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions]
  
  val `import`: SyncBailHook[js.Tuple2[ImportDeclaration, ImportSource], Boolean | Unit, UnsetAdditionalOptions]
  
  val importCall: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]
  
  val importSpecifier: SyncBailHook[
    js.Tuple4[ImportDeclaration, ImportSource, String, String], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val isPure: HookMap[
    SyncBailHook[
      js.Tuple2[
        UnaryExpression | ThisExpression | ArrayExpression | ObjectExpression | FunctionExpression | ArrowFunctionExpression | YieldExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | UpdateExpression | BinaryExpression | AssignmentExpression | LogicalExpression | MemberExpression | ConditionalExpression | SimpleCallExpression | NewExpression | SequenceExpression | TemplateLiteral | TaggedTemplateExpression | ClassExpression | MetaProperty | Identifier | AwaitExpression | ImportExpression | ChainExpression | FunctionDeclaration | VariableDeclaration | ClassDeclaration | PrivateIdentifier, 
        Double
      ], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val label: HookMap[SyncBailHook[js.Array[LabeledStatement], Boolean | Unit, UnsetAdditionalOptions]]
  
  val memberChainOfCallMemberChain: HookMap[
    SyncBailHook[
      js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
      Boolean | Unit, 
      UnsetAdditionalOptions
    ]
  ]
  
  val `new`: HookMap[SyncBailHook[js.Array[NewExpression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val optionalChaining: SyncBailHook[js.Array[ChainExpression], Boolean | Unit, UnsetAdditionalOptions]
  
  val pattern: HookMap[SyncBailHook[js.Array[Identifier], Boolean | Unit, UnsetAdditionalOptions]]
  
  val preDeclarator: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions]
  
  val preStatement: SyncBailHook[
    js.Array[
      FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val program: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions]
  
  val rename: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val statement: SyncBailHook[
    js.Array[
      FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
    ], 
    Boolean | Unit, 
    UnsetAdditionalOptions
  ]
  
  val statementIf: SyncBailHook[js.Array[IfStatement], Boolean | Unit, UnsetAdditionalOptions]
  
  val topLevelAwait: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]
  
  val typeof: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]
  
  val unhandledExpressionMemberChain: HookMap[
    SyncBailHook[js.Tuple2[Expression, js.Array[String]], Boolean | Unit, UnsetAdditionalOptions]
  ]
  
  val varDeclaration: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]
  
  val varDeclarationConst: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]
  
  val varDeclarationLet: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]
  
  val varDeclarationVar: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]
}
object ReadonlyevaluateTypeofHoo {
  
  extension [Self <: ReadonlyevaluateTypeofHoo](x: Self) {
    
    inline def setAssign(
      value: HookMap[
          SyncBailHook[js.Array[AssignmentExpression], Boolean | Unit, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
    
    inline def setAssignMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple2[AssignmentExpression, js.Array[String]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "assignMemberChain", value.asInstanceOf[js.Any])
    
    inline def setBinaryExpression(value: SyncBailHook[js.Array[BinaryExpression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "binaryExpression", value.asInstanceOf[js.Any])
    
    inline def setBlockPreStatement(
      value: SyncBailHook[
          js.Array[
            FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "blockPreStatement", value.asInstanceOf[js.Any])
    
    inline def setCall(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setCallMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple3[CallExpression, js.Array[String], js.Array[Boolean]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "callMemberChain", value.asInstanceOf[js.Any])
    
    inline def setCallMemberChainOfCallMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "callMemberChainOfCallMemberChain", value.asInstanceOf[js.Any])
    
    inline def setCanRename(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    inline def setClassBodyElement(
      value: SyncBailHook[
          js.Tuple2[MethodDefinition | PropertyDefinition, ClassExpression | ClassDeclaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "classBodyElement", value.asInstanceOf[js.Any])
    
    inline def setClassBodyValue(
      value: SyncBailHook[
          js.Tuple3[
            Expression, 
            MethodDefinition | PropertyDefinition, 
            ClassExpression | ClassDeclaration
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "classBodyValue", value.asInstanceOf[js.Any])
    
    inline def setClassExtendsExpression(
      value: SyncBailHook[
          js.Tuple2[Expression, ClassExpression | ClassDeclaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "classExtendsExpression", value.asInstanceOf[js.Any])
    
    inline def setDeclarator(
      value: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "declarator", value.asInstanceOf[js.Any])
    
    inline def setEvaluate(
      value: HookMap[
          SyncBailHook[
            js.Array[Expression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
    
    inline def setEvaluateCallExpression(
      value: HookMap[
          SyncBailHook[
            js.Array[CallExpression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateCallExpression", value.asInstanceOf[js.Any])
    
    inline def setEvaluateCallExpressionMember(
      value: HookMap[
          SyncBailHook[
            js.Tuple2[CallExpression, js.UndefOr[BasicEvaluatedExpression]], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateCallExpressionMember", value.asInstanceOf[js.Any])
    
    inline def setEvaluateDefinedIdentifier(
      value: HookMap[
          SyncBailHook[
            js.Array[ThisExpression | MemberExpression | Identifier], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateDefinedIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEvaluateIdentifier(
      value: HookMap[
          SyncBailHook[
            js.Array[ThisExpression | MemberExpression | MetaProperty | Identifier], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEvaluateNewExpression(
      value: HookMap[
          SyncBailHook[
            js.Array[NewExpression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateNewExpression", value.asInstanceOf[js.Any])
    
    inline def setEvaluateTypeof(
      value: HookMap[
          SyncBailHook[
            js.Array[UnaryExpression], 
            js.UndefOr[Null | BasicEvaluatedExpression], 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "evaluateTypeof", value.asInstanceOf[js.Any])
    
    inline def setExport(
      value: SyncBailHook[
          js.Array[ExportNamedDeclaration | ExportAllDeclaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportDeclaration(
      value: SyncBailHook[
          js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, Declaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportDeclaration", value.asInstanceOf[js.Any])
    
    inline def setExportExpression(
      value: SyncBailHook[
          js.Tuple2[ExportDefaultDeclaration, Declaration], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportExpression", value.asInstanceOf[js.Any])
    
    inline def setExportImport(
      value: SyncBailHook[
          js.Tuple2[ExportNamedDeclaration | ExportAllDeclaration, ImportSource], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportImport", value.asInstanceOf[js.Any])
    
    inline def setExportImportSpecifier(
      value: SyncBailHook[
          js.Tuple5[
            ExportNamedDeclaration | ExportAllDeclaration, 
            ImportSource, 
            String, 
            String, 
            js.UndefOr[Double]
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportImportSpecifier", value.asInstanceOf[js.Any])
    
    inline def setExportSpecifier(
      value: SyncBailHook[
          js.Tuple4[ExportNamedDeclaration | ExportAllDeclaration, String, String, js.UndefOr[Double]], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "exportSpecifier", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionConditionalOperator(value: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "expressionConditionalOperator", value.asInstanceOf[js.Any])
    
    inline def setExpressionLogicalOperator(value: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "expressionLogicalOperator", value.asInstanceOf[js.Any])
    
    inline def setExpressionMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple3[Expression, js.Array[String], js.Array[Boolean]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "expressionMemberChain", value.asInstanceOf[js.Any])
    
    inline def setFinish(value: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
    
    inline def setImport(
      value: SyncBailHook[js.Tuple2[ImportDeclaration, ImportSource], Boolean | Unit, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportCall(value: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "importCall", value.asInstanceOf[js.Any])
    
    inline def setImportSpecifier(
      value: SyncBailHook[
          js.Tuple4[ImportDeclaration, ImportSource, String, String], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "importSpecifier", value.asInstanceOf[js.Any])
    
    inline def setIsPure(
      value: HookMap[
          SyncBailHook[
            js.Tuple2[
              UnaryExpression | ThisExpression | ArrayExpression | ObjectExpression | FunctionExpression | ArrowFunctionExpression | YieldExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | UpdateExpression | BinaryExpression | AssignmentExpression | LogicalExpression | MemberExpression | ConditionalExpression | SimpleCallExpression | NewExpression | SequenceExpression | TemplateLiteral | TaggedTemplateExpression | ClassExpression | MetaProperty | Identifier | AwaitExpression | ImportExpression | ChainExpression | FunctionDeclaration | VariableDeclaration | ClassDeclaration | PrivateIdentifier, 
              Double
            ], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "isPure", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: HookMap[SyncBailHook[js.Array[LabeledStatement], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMemberChainOfCallMemberChain(
      value: HookMap[
          SyncBailHook[
            js.Tuple4[Expression, js.Array[String], CallExpression, js.Array[String]], 
            Boolean | Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "memberChainOfCallMemberChain", value.asInstanceOf[js.Any])
    
    inline def setNew(value: HookMap[SyncBailHook[js.Array[NewExpression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setOptionalChaining(value: SyncBailHook[js.Array[ChainExpression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "optionalChaining", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: HookMap[SyncBailHook[js.Array[Identifier], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPreDeclarator(
      value: SyncBailHook[js.Tuple2[VariableDeclarator, Statement], Boolean | Unit, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "preDeclarator", value.asInstanceOf[js.Any])
    
    inline def setPreStatement(
      value: SyncBailHook[
          js.Array[
            FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "preStatement", value.asInstanceOf[js.Any])
    
    inline def setProgram(value: SyncBailHook[js.Tuple2[Program, js.Array[Comment]], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setRename(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setStatement(
      value: SyncBailHook[
          js.Array[
            FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExpressionStatement | BlockStatement | StaticBlock | EmptyStatement | DebuggerStatement | WithStatement | ReturnStatement | LabeledStatement | BreakStatement | ContinueStatement | IfStatement | SwitchStatement | ThrowStatement | TryStatement | WhileStatement | DoWhileStatement | ForStatement | ForInStatement | ForOfStatement | ImportDeclaration | ExportNamedDeclaration | ExportDefaultDeclaration | ExportAllDeclaration
          ], 
          Boolean | Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    inline def setStatementIf(value: SyncBailHook[js.Array[IfStatement], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "statementIf", value.asInstanceOf[js.Any])
    
    inline def setTopLevelAwait(value: SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "topLevelAwait", value.asInstanceOf[js.Any])
    
    inline def setTypeof(value: HookMap[SyncBailHook[js.Array[Expression], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
    
    inline def setUnhandledExpressionMemberChain(
      value: HookMap[
          SyncBailHook[js.Tuple2[Expression, js.Array[String]], Boolean | Unit, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "unhandledExpressionMemberChain", value.asInstanceOf[js.Any])
    
    inline def setVarDeclaration(value: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "varDeclaration", value.asInstanceOf[js.Any])
    
    inline def setVarDeclarationConst(value: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "varDeclarationConst", value.asInstanceOf[js.Any])
    
    inline def setVarDeclarationLet(value: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "varDeclarationLet", value.asInstanceOf[js.Any])
    
    inline def setVarDeclarationVar(value: HookMap[SyncBailHook[js.Array[Declaration], Boolean | Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "varDeclarationVar", value.asInstanceOf[js.Any])
  }
}
