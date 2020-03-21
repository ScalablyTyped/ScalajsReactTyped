package typingsJapgolly.typescriptServices.TypeScript.Syntax

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax
import typingsJapgolly.typescriptServices.TypeScript.ArrayLiteralExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ArrayTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.BinaryExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.BlockSyntax
import typingsJapgolly.typescriptServices.TypeScript.BreakStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.CaseSwitchClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.CastExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.ClassDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConditionalExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConstructSignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConstructorDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.ConstructorTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.ContinueStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.DebuggerStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.DefaultSwitchClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.DeleteExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.DoStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ElementAccessExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ElseClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.EmptyStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.EnumDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.EnumElementSyntax
import typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.ExportAssignmentSyntax
import typingsJapgolly.typescriptServices.TypeScript.ExpressionStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ExternalModuleReferenceSyntax
import typingsJapgolly.typescriptServices.TypeScript.FinallyClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.ForInStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ForStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.FunctionDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.FunctionExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax
import typingsJapgolly.typescriptServices.TypeScript.FunctionTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.GenericTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.GetAccessorSyntax
import typingsJapgolly.typescriptServices.TypeScript.HeritageClauseSyntax
import typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.IMemberExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.IModuleReferenceSyntax
import typingsJapgolly.typescriptServices.TypeScript.INameSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxList
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.IfStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.ImportDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.IndexMemberDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.InterfaceDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.InvocationExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.LabeledStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.MemberAccessExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.MemberFunctionDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.MethodSignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.ModuleDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.ModuleNameModuleReferenceSyntax
import typingsJapgolly.typescriptServices.TypeScript.ObjectCreationExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ObjectTypeSyntax
import typingsJapgolly.typescriptServices.TypeScript.OmittedExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax
import typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax
import typingsJapgolly.typescriptServices.TypeScript.ParenthesizedArrowFunctionExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.ParenthesizedExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.PostfixUnaryExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.PropertySignatureSyntax
import typingsJapgolly.typescriptServices.TypeScript.QualifiedNameSyntax
import typingsJapgolly.typescriptServices.TypeScript.ReturnStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.SetAccessorSyntax
import typingsJapgolly.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.SimplePropertyAssignmentSyntax
import typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax
import typingsJapgolly.typescriptServices.TypeScript.SwitchStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import typingsJapgolly.typescriptServices.TypeScript.ThrowStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.TryStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeOfExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeParameterSyntax
import typingsJapgolly.typescriptServices.TypeScript.TypeQuerySyntax
import typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax
import typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax
import typingsJapgolly.typescriptServices.TypeScript.VariableStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.VoidExpressionSyntax
import typingsJapgolly.typescriptServices.TypeScript.WhileStatementSyntax
import typingsJapgolly.typescriptServices.TypeScript.WithStatementSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFactory extends js.Object {
  def argumentList(
    typeArgumentList: TypeArgumentListSyntax,
    openParenToken: ISyntaxToken,
    arguments: ISeparatedSyntaxList,
    closeParenToken: ISyntaxToken
  ): ArgumentListSyntax
  def arrayLiteralExpression(openBracketToken: ISyntaxToken, expressions: ISeparatedSyntaxList, closeBracketToken: ISyntaxToken): ArrayLiteralExpressionSyntax
  def arrayType(`type`: ITypeSyntax, openBracketToken: ISyntaxToken, closeBracketToken: ISyntaxToken): ArrayTypeSyntax
  def binaryExpression(kind: SyntaxKind, left: IExpressionSyntax, operatorToken: ISyntaxToken, right: IExpressionSyntax): BinaryExpressionSyntax
  def block(openBraceToken: ISyntaxToken, statements: ISyntaxList, closeBraceToken: ISyntaxToken): BlockSyntax
  def breakStatement(breakKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): BreakStatementSyntax
  def callSignature(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax
  ): CallSignatureSyntax
  def caseSwitchClause(
    caseKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    colonToken: ISyntaxToken,
    statements: ISyntaxList
  ): CaseSwitchClauseSyntax
  def castExpression(
    lessThanToken: ISyntaxToken,
    `type`: ITypeSyntax,
    greaterThanToken: ISyntaxToken,
    expression: IUnaryExpressionSyntax
  ): CastExpressionSyntax
  def catchClause(
    catchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    identifier: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    closeParenToken: ISyntaxToken,
    block: BlockSyntax
  ): CatchClauseSyntax
  def classDeclaration(
    modifiers: ISyntaxList,
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    openBraceToken: ISyntaxToken,
    classElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ClassDeclarationSyntax
  def conditionalExpression(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax
  ): ConditionalExpressionSyntax
  def constraint(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): ConstraintSyntax
  def constructSignature(newKeyword: ISyntaxToken, callSignature: CallSignatureSyntax): ConstructSignatureSyntax
  def constructorDeclaration(
    modifiers: ISyntaxList,
    constructorKeyword: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): ConstructorDeclarationSyntax
  def constructorType(
    newKeyword: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): ConstructorTypeSyntax
  def continueStatement(continueKeyword: ISyntaxToken, identifier: ISyntaxToken, semicolonToken: ISyntaxToken): ContinueStatementSyntax
  def debuggerStatement(debuggerKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): DebuggerStatementSyntax
  def defaultSwitchClause(defaultKeyword: ISyntaxToken, colonToken: ISyntaxToken, statements: ISyntaxList): DefaultSwitchClauseSyntax
  def deleteExpression(deleteKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): DeleteExpressionSyntax
  def doStatement(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): DoStatementSyntax
  def elementAccessExpression(
    expression: IExpressionSyntax,
    openBracketToken: ISyntaxToken,
    argumentExpression: IExpressionSyntax,
    closeBracketToken: ISyntaxToken
  ): ElementAccessExpressionSyntax
  def elseClause(elseKeyword: ISyntaxToken, statement: IStatementSyntax): ElseClauseSyntax
  def emptyStatement(semicolonToken: ISyntaxToken): EmptyStatementSyntax
  def enumDeclaration(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): EnumDeclarationSyntax
  def enumElement(propertyName: ISyntaxToken, equalsValueClause: EqualsValueClauseSyntax): EnumElementSyntax
  def equalsValueClause(equalsToken: ISyntaxToken, value: IExpressionSyntax): EqualsValueClauseSyntax
  def exportAssignment(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): ExportAssignmentSyntax
  def expressionStatement(expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ExpressionStatementSyntax
  def externalModuleReference(
    requireKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    stringLiteral: ISyntaxToken,
    closeParenToken: ISyntaxToken
  ): ExternalModuleReferenceSyntax
  def finallyClause(finallyKeyword: ISyntaxToken, block: BlockSyntax): FinallyClauseSyntax
  def forInStatement(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForInStatementSyntax
  def forStatement(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    initializer: IExpressionSyntax,
    firstSemicolonToken: ISyntaxToken,
    condition: IExpressionSyntax,
    secondSemicolonToken: ISyntaxToken,
    incrementor: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForStatementSyntax
  def functionDeclaration(
    modifiers: ISyntaxList,
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): FunctionDeclarationSyntax
  def functionExpression(
    functionKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax
  ): FunctionExpressionSyntax
  def functionPropertyAssignment(propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax): FunctionPropertyAssignmentSyntax
  def functionType(
    typeParameterList: TypeParameterListSyntax,
    parameterList: ParameterListSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    `type`: ITypeSyntax
  ): FunctionTypeSyntax
  def genericType(name: INameSyntax, typeArgumentList: TypeArgumentListSyntax): GenericTypeSyntax
  def getAccessor(
    modifiers: ISyntaxList,
    getKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    typeAnnotation: TypeAnnotationSyntax,
    block: BlockSyntax
  ): GetAccessorSyntax
  def heritageClause(kind: SyntaxKind, extendsOrImplementsKeyword: ISyntaxToken, typeNames: ISeparatedSyntaxList): HeritageClauseSyntax
  def ifStatement(
    ifKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    elseClause: ElseClauseSyntax
  ): IfStatementSyntax
  def importDeclaration(
    modifiers: ISyntaxList,
    importKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    equalsToken: ISyntaxToken,
    moduleReference: IModuleReferenceSyntax,
    semicolonToken: ISyntaxToken
  ): ImportDeclarationSyntax
  def indexMemberDeclaration(modifiers: ISyntaxList, indexSignature: IndexSignatureSyntax, semicolonToken: ISyntaxToken): IndexMemberDeclarationSyntax
  def indexSignature(
    openBracketToken: ISyntaxToken,
    parameter: ParameterSyntax,
    closeBracketToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax
  ): IndexSignatureSyntax
  def interfaceDeclaration(
    modifiers: ISyntaxList,
    interfaceKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    body: ObjectTypeSyntax
  ): InterfaceDeclarationSyntax
  def invocationExpression(expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): InvocationExpressionSyntax
  def labeledStatement(identifier: ISyntaxToken, colonToken: ISyntaxToken, statement: IStatementSyntax): LabeledStatementSyntax
  def memberAccessExpression(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): MemberAccessExpressionSyntax
  def memberFunctionDeclaration(
    modifiers: ISyntaxList,
    propertyName: ISyntaxToken,
    callSignature: CallSignatureSyntax,
    block: BlockSyntax,
    semicolonToken: ISyntaxToken
  ): MemberFunctionDeclarationSyntax
  def memberVariableDeclaration(modifiers: ISyntaxList, variableDeclarator: VariableDeclaratorSyntax, semicolonToken: ISyntaxToken): MemberVariableDeclarationSyntax
  def methodSignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, callSignature: CallSignatureSyntax): MethodSignatureSyntax
  def moduleDeclaration(
    modifiers: ISyntaxList,
    moduleKeyword: ISyntaxToken,
    name: INameSyntax,
    stringLiteral: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    moduleElements: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): ModuleDeclarationSyntax
  def moduleNameModuleReference(moduleName: INameSyntax): ModuleNameModuleReferenceSyntax
  def objectCreationExpression(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax
  def objectLiteralExpression(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): ObjectLiteralExpressionSyntax
  def objectType(openBraceToken: ISyntaxToken, typeMembers: ISeparatedSyntaxList, closeBraceToken: ISyntaxToken): ObjectTypeSyntax
  def omittedExpression(): OmittedExpressionSyntax
  def parameter(
    dotDotDotToken: ISyntaxToken,
    modifiers: ISyntaxList,
    identifier: ISyntaxToken,
    questionToken: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): ParameterSyntax
  def parameterList(openParenToken: ISyntaxToken, parameters: ISeparatedSyntaxList, closeParenToken: ISyntaxToken): ParameterListSyntax
  def parenthesizedArrowFunctionExpression(
    callSignature: CallSignatureSyntax,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): ParenthesizedArrowFunctionExpressionSyntax
  def parenthesizedExpression(openParenToken: ISyntaxToken, expression: IExpressionSyntax, closeParenToken: ISyntaxToken): ParenthesizedExpressionSyntax
  def postfixUnaryExpression(kind: SyntaxKind, operand: IMemberExpressionSyntax, operatorToken: ISyntaxToken): PostfixUnaryExpressionSyntax
  def prefixUnaryExpression(kind: SyntaxKind, operatorToken: ISyntaxToken, operand: IUnaryExpressionSyntax): PrefixUnaryExpressionSyntax
  def propertySignature(propertyName: ISyntaxToken, questionToken: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax
  def qualifiedName(left: INameSyntax, dotToken: ISyntaxToken, right: ISyntaxToken): QualifiedNameSyntax
  def returnStatement(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ReturnStatementSyntax
  def setAccessor(
    modifiers: ISyntaxList,
    setKeyword: ISyntaxToken,
    propertyName: ISyntaxToken,
    parameterList: ParameterListSyntax,
    block: BlockSyntax
  ): SetAccessorSyntax
  def simpleArrowFunctionExpression(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: BlockSyntax,
    expression: IExpressionSyntax
  ): SimpleArrowFunctionExpressionSyntax
  def simplePropertyAssignment(propertyName: ISyntaxToken, colonToken: ISyntaxToken, expression: IExpressionSyntax): SimplePropertyAssignmentSyntax
  def sourceUnit(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): SourceUnitSyntax
  def switchStatement(
    switchKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    switchClauses: ISyntaxList,
    closeBraceToken: ISyntaxToken
  ): SwitchStatementSyntax
  def throwStatement(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ThrowStatementSyntax
  def tryStatement(
    tryKeyword: ISyntaxToken,
    block: BlockSyntax,
    catchClause: CatchClauseSyntax,
    finallyClause: FinallyClauseSyntax
  ): TryStatementSyntax
  def typeAnnotation(colonToken: ISyntaxToken, `type`: ITypeSyntax): TypeAnnotationSyntax
  def typeArgumentList(lessThanToken: ISyntaxToken, typeArguments: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeArgumentListSyntax
  def typeOfExpression(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax
  def typeParameter(identifier: ISyntaxToken, constraint: ConstraintSyntax): TypeParameterSyntax
  def typeParameterList(lessThanToken: ISyntaxToken, typeParameters: ISeparatedSyntaxList, greaterThanToken: ISyntaxToken): TypeParameterListSyntax
  def typeQuery(typeOfKeyword: ISyntaxToken, name: INameSyntax): TypeQuerySyntax
  def variableDeclaration(varKeyword: ISyntaxToken, variableDeclarators: ISeparatedSyntaxList): VariableDeclarationSyntax
  def variableDeclarator(
    propertyName: ISyntaxToken,
    typeAnnotation: TypeAnnotationSyntax,
    equalsValueClause: EqualsValueClauseSyntax
  ): VariableDeclaratorSyntax
  def variableStatement(
    modifiers: ISyntaxList,
    variableDeclaration: VariableDeclarationSyntax,
    semicolonToken: ISyntaxToken
  ): VariableStatementSyntax
  def voidExpression(voidKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): VoidExpressionSyntax
  def whileStatement(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WhileStatementSyntax
  def withStatement(
    withKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WithStatementSyntax
}

object IFactory {
  @scala.inline
  def apply(
    argumentList: (TypeArgumentListSyntax, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => CallbackTo[ArgumentListSyntax],
    arrayLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => CallbackTo[ArrayLiteralExpressionSyntax],
    arrayType: (ITypeSyntax, ISyntaxToken, ISyntaxToken) => CallbackTo[ArrayTypeSyntax],
    binaryExpression: (SyntaxKind, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => CallbackTo[BinaryExpressionSyntax],
    block: (ISyntaxToken, ISyntaxList, ISyntaxToken) => CallbackTo[BlockSyntax],
    breakStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => CallbackTo[BreakStatementSyntax],
    callSignature: (TypeParameterListSyntax, ParameterListSyntax, TypeAnnotationSyntax) => CallbackTo[CallSignatureSyntax],
    caseSwitchClause: (ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxList) => CallbackTo[CaseSwitchClauseSyntax],
    castExpression: (ISyntaxToken, ITypeSyntax, ISyntaxToken, IUnaryExpressionSyntax) => CallbackTo[CastExpressionSyntax],
    catchClause: (ISyntaxToken, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, ISyntaxToken, BlockSyntax) => CallbackTo[CatchClauseSyntax],
    classDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ISyntaxToken, ISyntaxList, ISyntaxToken) => CallbackTo[ClassDeclarationSyntax],
    conditionalExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax) => CallbackTo[ConditionalExpressionSyntax],
    constraint: (ISyntaxToken, ITypeSyntax) => CallbackTo[ConstraintSyntax],
    constructSignature: (ISyntaxToken, CallSignatureSyntax) => CallbackTo[ConstructSignatureSyntax],
    constructorDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => CallbackTo[ConstructorDeclarationSyntax],
    constructorType: (ISyntaxToken, TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => CallbackTo[ConstructorTypeSyntax],
    continueStatement: (ISyntaxToken, ISyntaxToken, ISyntaxToken) => CallbackTo[ContinueStatementSyntax],
    debuggerStatement: (ISyntaxToken, ISyntaxToken) => CallbackTo[DebuggerStatementSyntax],
    defaultSwitchClause: (ISyntaxToken, ISyntaxToken, ISyntaxList) => CallbackTo[DefaultSwitchClauseSyntax],
    deleteExpression: (ISyntaxToken, IUnaryExpressionSyntax) => CallbackTo[DeleteExpressionSyntax],
    doStatement: (ISyntaxToken, IStatementSyntax, ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken) => CallbackTo[DoStatementSyntax],
    elementAccessExpression: (IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken) => CallbackTo[ElementAccessExpressionSyntax],
    elseClause: (ISyntaxToken, IStatementSyntax) => CallbackTo[ElseClauseSyntax],
    emptyStatement: ISyntaxToken => CallbackTo[EmptyStatementSyntax],
    enumDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => CallbackTo[EnumDeclarationSyntax],
    enumElement: (ISyntaxToken, EqualsValueClauseSyntax) => CallbackTo[EnumElementSyntax],
    equalsValueClause: (ISyntaxToken, IExpressionSyntax) => CallbackTo[EqualsValueClauseSyntax],
    exportAssignment: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => CallbackTo[ExportAssignmentSyntax],
    expressionStatement: (IExpressionSyntax, ISyntaxToken) => CallbackTo[ExpressionStatementSyntax],
    externalModuleReference: (ISyntaxToken, ISyntaxToken, ISyntaxToken, ISyntaxToken) => CallbackTo[ExternalModuleReferenceSyntax],
    finallyClause: (ISyntaxToken, BlockSyntax) => CallbackTo[FinallyClauseSyntax],
    forInStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => CallbackTo[ForInStatementSyntax],
    forStatement: (ISyntaxToken, ISyntaxToken, VariableDeclarationSyntax, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => CallbackTo[ForStatementSyntax],
    functionDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => CallbackTo[FunctionDeclarationSyntax],
    functionExpression: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax, BlockSyntax) => CallbackTo[FunctionExpressionSyntax],
    functionPropertyAssignment: (ISyntaxToken, CallSignatureSyntax, BlockSyntax) => CallbackTo[FunctionPropertyAssignmentSyntax],
    functionType: (TypeParameterListSyntax, ParameterListSyntax, ISyntaxToken, ITypeSyntax) => CallbackTo[FunctionTypeSyntax],
    genericType: (INameSyntax, TypeArgumentListSyntax) => CallbackTo[GenericTypeSyntax],
    getAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, TypeAnnotationSyntax, BlockSyntax) => CallbackTo[GetAccessorSyntax],
    heritageClause: (SyntaxKind, ISyntaxToken, ISeparatedSyntaxList) => CallbackTo[HeritageClauseSyntax],
    ifStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax, ElseClauseSyntax) => CallbackTo[IfStatementSyntax],
    importDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, ISyntaxToken, IModuleReferenceSyntax, ISyntaxToken) => CallbackTo[ImportDeclarationSyntax],
    indexMemberDeclaration: (ISyntaxList, IndexSignatureSyntax, ISyntaxToken) => CallbackTo[IndexMemberDeclarationSyntax],
    indexSignature: (ISyntaxToken, ParameterSyntax, ISyntaxToken, TypeAnnotationSyntax) => CallbackTo[IndexSignatureSyntax],
    interfaceDeclaration: (ISyntaxList, ISyntaxToken, ISyntaxToken, TypeParameterListSyntax, ISyntaxList, ObjectTypeSyntax) => CallbackTo[InterfaceDeclarationSyntax],
    invocationExpression: (IMemberExpressionSyntax, ArgumentListSyntax) => CallbackTo[InvocationExpressionSyntax],
    labeledStatement: (ISyntaxToken, ISyntaxToken, IStatementSyntax) => CallbackTo[LabeledStatementSyntax],
    memberAccessExpression: (IExpressionSyntax, ISyntaxToken, ISyntaxToken) => CallbackTo[MemberAccessExpressionSyntax],
    memberFunctionDeclaration: (ISyntaxList, ISyntaxToken, CallSignatureSyntax, BlockSyntax, ISyntaxToken) => CallbackTo[MemberFunctionDeclarationSyntax],
    memberVariableDeclaration: (ISyntaxList, VariableDeclaratorSyntax, ISyntaxToken) => CallbackTo[MemberVariableDeclarationSyntax],
    methodSignature: (ISyntaxToken, ISyntaxToken, CallSignatureSyntax) => CallbackTo[MethodSignatureSyntax],
    moduleDeclaration: (ISyntaxList, ISyntaxToken, INameSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => CallbackTo[ModuleDeclarationSyntax],
    moduleNameModuleReference: INameSyntax => CallbackTo[ModuleNameModuleReferenceSyntax],
    objectCreationExpression: (ISyntaxToken, IMemberExpressionSyntax, ArgumentListSyntax) => CallbackTo[ObjectCreationExpressionSyntax],
    objectLiteralExpression: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => CallbackTo[ObjectLiteralExpressionSyntax],
    objectType: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => CallbackTo[ObjectTypeSyntax],
    omittedExpression: CallbackTo[OmittedExpressionSyntax],
    parameter: (ISyntaxToken, ISyntaxList, ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => CallbackTo[ParameterSyntax],
    parameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => CallbackTo[ParameterListSyntax],
    parenthesizedArrowFunctionExpression: (CallSignatureSyntax, ISyntaxToken, BlockSyntax, IExpressionSyntax) => CallbackTo[ParenthesizedArrowFunctionExpressionSyntax],
    parenthesizedExpression: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => CallbackTo[ParenthesizedExpressionSyntax],
    postfixUnaryExpression: (SyntaxKind, IMemberExpressionSyntax, ISyntaxToken) => CallbackTo[PostfixUnaryExpressionSyntax],
    prefixUnaryExpression: (SyntaxKind, ISyntaxToken, IUnaryExpressionSyntax) => CallbackTo[PrefixUnaryExpressionSyntax],
    propertySignature: (ISyntaxToken, ISyntaxToken, TypeAnnotationSyntax) => CallbackTo[PropertySignatureSyntax],
    qualifiedName: (INameSyntax, ISyntaxToken, ISyntaxToken) => CallbackTo[QualifiedNameSyntax],
    returnStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => CallbackTo[ReturnStatementSyntax],
    setAccessor: (ISyntaxList, ISyntaxToken, ISyntaxToken, ParameterListSyntax, BlockSyntax) => CallbackTo[SetAccessorSyntax],
    simpleArrowFunctionExpression: (ISyntaxToken, ISyntaxToken, BlockSyntax, IExpressionSyntax) => CallbackTo[SimpleArrowFunctionExpressionSyntax],
    simplePropertyAssignment: (ISyntaxToken, ISyntaxToken, IExpressionSyntax) => CallbackTo[SimplePropertyAssignmentSyntax],
    sourceUnit: (ISyntaxList, ISyntaxToken) => CallbackTo[SourceUnitSyntax],
    switchStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, ISyntaxToken, ISyntaxList, ISyntaxToken) => CallbackTo[SwitchStatementSyntax],
    throwStatement: (ISyntaxToken, IExpressionSyntax, ISyntaxToken) => CallbackTo[ThrowStatementSyntax],
    tryStatement: (ISyntaxToken, BlockSyntax, CatchClauseSyntax, FinallyClauseSyntax) => CallbackTo[TryStatementSyntax],
    typeAnnotation: (ISyntaxToken, ITypeSyntax) => CallbackTo[TypeAnnotationSyntax],
    typeArgumentList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => CallbackTo[TypeArgumentListSyntax],
    typeOfExpression: (ISyntaxToken, IUnaryExpressionSyntax) => CallbackTo[TypeOfExpressionSyntax],
    typeParameter: (ISyntaxToken, ConstraintSyntax) => CallbackTo[TypeParameterSyntax],
    typeParameterList: (ISyntaxToken, ISeparatedSyntaxList, ISyntaxToken) => CallbackTo[TypeParameterListSyntax],
    typeQuery: (ISyntaxToken, INameSyntax) => CallbackTo[TypeQuerySyntax],
    variableDeclaration: (ISyntaxToken, ISeparatedSyntaxList) => CallbackTo[VariableDeclarationSyntax],
    variableDeclarator: (ISyntaxToken, TypeAnnotationSyntax, EqualsValueClauseSyntax) => CallbackTo[VariableDeclaratorSyntax],
    variableStatement: (ISyntaxList, VariableDeclarationSyntax, ISyntaxToken) => CallbackTo[VariableStatementSyntax],
    voidExpression: (ISyntaxToken, IUnaryExpressionSyntax) => CallbackTo[VoidExpressionSyntax],
    whileStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => CallbackTo[WhileStatementSyntax],
    withStatement: (ISyntaxToken, ISyntaxToken, IExpressionSyntax, ISyntaxToken, IStatementSyntax) => CallbackTo[WithStatementSyntax]
  ): IFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argumentList")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => argumentList(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("arrayLiteralExpression")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => arrayLiteralExpression(t0, t1, t2).runNow()))
    __obj.updateDynamic("arrayType")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => arrayType(t0, t1, t2).runNow()))
    __obj.updateDynamic("binaryExpression")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind, t1: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax) => binaryExpression(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("block")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => block(t0, t1, t2).runNow()))
    __obj.updateDynamic("breakStatement")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => breakStatement(t0, t1, t2).runNow()))
    __obj.updateDynamic("callSignature")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax) => callSignature(t0, t1, t2).runNow()))
    __obj.updateDynamic("caseSwitchClause")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList) => caseSwitchClause(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("castExpression")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax) => castExpression(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("catchClause")(js.Any.fromFunction6((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t5: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax) => catchClause(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("classDeclaration")(js.Any.fromFunction8((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t5: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t6: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t7: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => classDeclaration(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    __obj.updateDynamic("conditionalExpression")(js.Any.fromFunction5((t0: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax) => conditionalExpression(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("constraint")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax) => constraint(t0, t1).runNow()))
    __obj.updateDynamic("constructSignature")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax) => constructSignature(t0, t1).runNow()))
    __obj.updateDynamic("constructorDeclaration")(js.Any.fromFunction5((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => constructorDeclaration(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("constructorType")(js.Any.fromFunction5((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax) => constructorType(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("continueStatement")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => continueStatement(t0, t1, t2).runNow()))
    __obj.updateDynamic("debuggerStatement")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => debuggerStatement(t0, t1).runNow()))
    __obj.updateDynamic("defaultSwitchClause")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList) => defaultSwitchClause(t0, t1, t2).runNow()))
    __obj.updateDynamic("deleteExpression")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax) => deleteExpression(t0, t1).runNow()))
    __obj.updateDynamic("doStatement")(js.Any.fromFunction7((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t5: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t6: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => doStatement(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.updateDynamic("elementAccessExpression")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => elementAccessExpression(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("elseClause")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax) => elseClause(t0, t1).runNow()))
    __obj.updateDynamic("emptyStatement")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => emptyStatement(t0).runNow()))
    __obj.updateDynamic("enumDeclaration")(js.Any.fromFunction6((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList, t5: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => enumDeclaration(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("enumElement")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax) => enumElement(t0, t1).runNow()))
    __obj.updateDynamic("equalsValueClause")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax) => equalsValueClause(t0, t1).runNow()))
    __obj.updateDynamic("exportAssignment")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => exportAssignment(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("expressionStatement")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => expressionStatement(t0, t1).runNow()))
    __obj.updateDynamic("externalModuleReference")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => externalModuleReference(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("finallyClause")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax) => finallyClause(t0, t1).runNow()))
    __obj.updateDynamic("forInStatement")(js.Any.fromFunction8((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t5: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t6: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t7: typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax) => forInStatement(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    __obj.updateDynamic("forStatement")(js.Any.fromFunction10((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t5: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t6: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t7: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t8: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t9: typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax) => forStatement(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9).runNow()))
    __obj.updateDynamic("functionDeclaration")(js.Any.fromFunction6((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax, t5: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => functionDeclaration(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("functionExpression")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax) => functionExpression(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("functionPropertyAssignment")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax) => functionPropertyAssignment(t0, t1, t2).runNow()))
    __obj.updateDynamic("functionType")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax) => functionType(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("genericType")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.INameSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.TypeArgumentListSyntax) => genericType(t0, t1).runNow()))
    __obj.updateDynamic("getAccessor")(js.Any.fromFunction6((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax, t5: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax) => getAccessor(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("heritageClause")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList) => heritageClause(t0, t1, t2).runNow()))
    __obj.updateDynamic("ifStatement")(js.Any.fromFunction6((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax, t5: typingsJapgolly.typescriptServices.TypeScript.ElseClauseSyntax) => ifStatement(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("importDeclaration")(js.Any.fromFunction6((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.IModuleReferenceSyntax, t5: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => importDeclaration(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("indexMemberDeclaration")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.IndexSignatureSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => indexMemberDeclaration(t0, t1, t2).runNow()))
    __obj.updateDynamic("indexSignature")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ParameterSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax) => indexSignature(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("interfaceDeclaration")(js.Any.fromFunction6((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.TypeParameterListSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t5: typingsJapgolly.typescriptServices.TypeScript.ObjectTypeSyntax) => interfaceDeclaration(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("invocationExpression")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.IMemberExpressionSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax) => invocationExpression(t0, t1).runNow()))
    __obj.updateDynamic("labeledStatement")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax) => labeledStatement(t0, t1, t2).runNow()))
    __obj.updateDynamic("memberAccessExpression")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => memberAccessExpression(t0, t1, t2).runNow()))
    __obj.updateDynamic("memberFunctionDeclaration")(js.Any.fromFunction5((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => memberFunctionDeclaration(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("memberVariableDeclaration")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.VariableDeclaratorSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => memberVariableDeclaration(t0, t1, t2).runNow()))
    __obj.updateDynamic("methodSignature")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax) => methodSignature(t0, t1, t2).runNow()))
    __obj.updateDynamic("moduleDeclaration")(js.Any.fromFunction7((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.INameSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t5: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t6: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => moduleDeclaration(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.updateDynamic("moduleNameModuleReference")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.INameSyntax) => moduleNameModuleReference(t0).runNow()))
    __obj.updateDynamic("objectCreationExpression")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IMemberExpressionSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ArgumentListSyntax) => objectCreationExpression(t0, t1, t2).runNow()))
    __obj.updateDynamic("objectLiteralExpression")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => objectLiteralExpression(t0, t1, t2).runNow()))
    __obj.updateDynamic("objectType")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => objectType(t0, t1, t2).runNow()))
    __obj.updateDynamic("omittedExpression")(omittedExpression.toJsFn)
    __obj.updateDynamic("parameter")(js.Any.fromFunction6((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax, t5: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax) => parameter(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("parameterList")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => parameterList(t0, t1, t2).runNow()))
    __obj.updateDynamic("parenthesizedArrowFunctionExpression")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.CallSignatureSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax) => parenthesizedArrowFunctionExpression(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("parenthesizedExpression")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => parenthesizedExpression(t0, t1, t2).runNow()))
    __obj.updateDynamic("postfixUnaryExpression")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind, t1: typingsJapgolly.typescriptServices.TypeScript.IMemberExpressionSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => postfixUnaryExpression(t0, t1, t2).runNow()))
    __obj.updateDynamic("prefixUnaryExpression")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax) => prefixUnaryExpression(t0, t1, t2).runNow()))
    __obj.updateDynamic("propertySignature")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax) => propertySignature(t0, t1, t2).runNow()))
    __obj.updateDynamic("qualifiedName")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.INameSyntax, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => qualifiedName(t0, t1, t2).runNow()))
    __obj.updateDynamic("returnStatement")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => returnStatement(t0, t1, t2).runNow()))
    __obj.updateDynamic("setAccessor")(js.Any.fromFunction5((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t3: typingsJapgolly.typescriptServices.TypeScript.ParameterListSyntax, t4: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax) => setAccessor(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("simpleArrowFunctionExpression")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax) => simpleArrowFunctionExpression(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("simplePropertyAssignment")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax) => simplePropertyAssignment(t0, t1, t2).runNow()))
    __obj.updateDynamic("sourceUnit")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => sourceUnit(t0, t1).runNow()))
    __obj.updateDynamic("switchStatement")(js.Any.fromFunction7((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t5: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t6: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => switchStatement(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.updateDynamic("throwStatement")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => throwStatement(t0, t1, t2).runNow()))
    __obj.updateDynamic("tryStatement")(js.Any.fromFunction4((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.BlockSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.CatchClauseSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.FinallyClauseSyntax) => tryStatement(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("typeAnnotation")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ITypeSyntax) => typeAnnotation(t0, t1).runNow()))
    __obj.updateDynamic("typeArgumentList")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => typeArgumentList(t0, t1, t2).runNow()))
    __obj.updateDynamic("typeOfExpression")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax) => typeOfExpression(t0, t1).runNow()))
    __obj.updateDynamic("typeParameter")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ConstraintSyntax) => typeParameter(t0, t1).runNow()))
    __obj.updateDynamic("typeParameterList")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => typeParameterList(t0, t1, t2).runNow()))
    __obj.updateDynamic("typeQuery")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.INameSyntax) => typeQuery(t0, t1).runNow()))
    __obj.updateDynamic("variableDeclaration")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList) => variableDeclaration(t0, t1).runNow()))
    __obj.updateDynamic("variableDeclarator")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.TypeAnnotationSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.EqualsValueClauseSyntax) => variableDeclarator(t0, t1, t2).runNow()))
    __obj.updateDynamic("variableStatement")(js.Any.fromFunction3((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList, t1: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarationSyntax, t2: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken) => variableStatement(t0, t1, t2).runNow()))
    __obj.updateDynamic("voidExpression")(js.Any.fromFunction2((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.IUnaryExpressionSyntax) => voidExpression(t0, t1).runNow()))
    __obj.updateDynamic("whileStatement")(js.Any.fromFunction5((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax) => whileStatement(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("withStatement")(js.Any.fromFunction5((t0: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t1: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t2: typingsJapgolly.typescriptServices.TypeScript.IExpressionSyntax, t3: typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken, t4: typingsJapgolly.typescriptServices.TypeScript.IStatementSyntax) => withStatement(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IFactory]
  }
}

