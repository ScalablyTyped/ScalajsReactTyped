package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.libLanguageFormatterFormatterMod.FormatterConstructor
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IDisabledInterval
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRule
import typingsJapgolly.tslint.libLanguageRuleRuleMod.RuleConstructor
import typingsJapgolly.tslint.libLanguageUtilsMod.EqualsKind
import typingsJapgolly.tslint.libLanguageUtilsMod.FilterCallback
import typingsJapgolly.tslint.libLanguageUtilsMod.ForEachCommentCallback
import typingsJapgolly.tslint.libLanguageUtilsMod.ForEachTokenCallback
import typingsJapgolly.tslint.mod.^
import typingsJapgolly.typescript.mod.BinaryOperatorToken
import typingsJapgolly.typescript.mod.BindingElement
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.ModifierFlags
import typingsJapgolly.typescript.mod.ModifiersArray
import typingsJapgolly.typescript.mod.ModuleDeclaration
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeFlags
import typingsJapgolly.typescript.mod.ObjectFlags
import typingsJapgolly.typescript.mod.ObjectType
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.SymbolFlags
import typingsJapgolly.typescript.mod.SyntaxKind
import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeFlags
import typingsJapgolly.typescript.mod.VariableDeclaration
import typingsJapgolly.typescript.mod.VariableStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ENABLE_DISABLE_REGEX: js.RegExp = ^.asInstanceOf[js.Dynamic].selectDynamic("ENABLE_DISABLE_REGEX").asInstanceOf[js.RegExp]

inline def ancestorWhere[T /* <: Node */](node: Node, predicate: js.Function1[/* n */ Node, /* is T */ Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestorWhere")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

inline def childOfKind(node: Node, kind: SyntaxKind): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("childOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]

inline def doesIntersect(
  failure: typingsJapgolly.tslint.libLanguageRuleRuleMod.RuleFailure,
  disabledIntervals: js.Array[IDisabledInterval]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doesIntersect")(failure.asInstanceOf[js.Any], disabledIntervals.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def findFormatter(name: String): js.UndefOr[FormatterConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FormatterConstructor]]
inline def findFormatter(name: String, formattersDirectory: String): js.UndefOr[FormatterConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FormatterConstructor]]
inline def findFormatter(name: FormatterConstructor): js.UndefOr[FormatterConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FormatterConstructor]]
inline def findFormatter(name: FormatterConstructor, formattersDirectory: String): js.UndefOr[FormatterConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FormatterConstructor]]

inline def findRule(name: String): js.UndefOr[RuleConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RuleConstructor]]
inline def findRule(name: String, rulesDirectories: String): js.UndefOr[RuleConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RuleConstructor]]
inline def findRule(name: String, rulesDirectories: js.Array[String]): js.UndefOr[RuleConstructor] = (^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[RuleConstructor]]

inline def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def forEachToken(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def forEachToken(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback, filter: FilterCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def getBindingElementVariableDeclaration(node: BindingElement): VariableDeclaration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBindingElementVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[VariableDeclaration | Null]

inline def getEqualsKind(node: BinaryOperatorToken): js.UndefOr[EqualsKind] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEqualsKind")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[EqualsKind]]

inline def getSourceFile(fileName: String, source: String): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFile")(fileName.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[SourceFile]

inline def hasCommentAfterPosition(text: String, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasCommentAfterPosition")(text.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def hasModifier(modifiers: Unit, modifierKinds: SyntaxKind*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(scala.List(modifiers.asInstanceOf[js.Any]).`++`(modifierKinds.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
inline def hasModifier(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(scala.List(modifiers.asInstanceOf[js.Any]).`++`(modifierKinds.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]

inline def isAssignment(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isBlockScopeBoundary(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isBlockScopedBindingElement(node: BindingElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isBlockScopedVariable(node: VariableDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariable")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isBlockScopedVariable(node: VariableStatement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariable")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isCombinedModifierFlagSet(node: Declaration, flagToCheck: ModifierFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCombinedModifierFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isCombinedNodeFlagSet(node: Node, flagToCheck: NodeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCombinedNodeFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isLoop(node: Node): /* is typescript.typescript.IterationStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoop")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IterationStatement */ Boolean]

inline def isNegativeNumberLiteral(node: Node): /* is tslint.anon.PrefixUnaryExpressionoper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativeNumberLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is tslint.anon.PrefixUnaryExpressionoper */ Boolean]

inline def isNestedModuleDeclaration(decl: ModuleDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNestedModuleDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNodeFlagSet(node: Node, flagToCheck: NodeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isNumeric(node: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isObjectFlagSet(objectType: ObjectType, flagToCheck: ObjectFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isObjectFlagSet")(objectType.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isScopeBoundary(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isStrictNullChecksEnabled(options: CompilerOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStrictNullChecksEnabled")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSymbolFlagSet(symbol: Symbol, flagToCheck: SymbolFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolFlagSet")(symbol.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isTypeFlagSet(`type`: Type, flagToCheck: TypeFlags): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeFlagSet")(`type`.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isTypedRule(rule: IRule): /* is tslint.tslint/lib/language/rule/rule.ITypedRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedRule")(rule.asInstanceOf[js.Any]).asInstanceOf[/* is tslint.tslint/lib/language/rule/rule.ITypedRule */ Boolean]

inline def isWhiteSpace(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhiteSpace")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def loadRules(ruleOptionsList: js.Array[IOptions]): js.Array[IRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any]).asInstanceOf[js.Array[IRule]]
inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]
inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: String, isJs: Boolean): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]
inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String]): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]
inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: js.Array[String], isJs: Boolean): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]
inline def loadRules(ruleOptionsList: js.Array[IOptions], rulesDirectories: Unit, isJs: Boolean): js.Array[IRule] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[IRule]]

inline def removeDisabledFailures(
  sourceFile: SourceFile,
  failures: js.Array[typingsJapgolly.tslint.libLanguageRuleRuleMod.RuleFailure]
): js.Array[typingsJapgolly.tslint.libLanguageRuleRuleMod.RuleFailure] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDisabledFailures")(sourceFile.asInstanceOf[js.Any], failures.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.tslint.libLanguageRuleRuleMod.RuleFailure]]

inline def someAncestor(node: Node, predicate: js.Function1[/* n */ Node, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("someAncestor")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def unwrapParentheses(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapParentheses")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
