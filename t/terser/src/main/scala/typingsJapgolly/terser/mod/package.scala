package typingsJapgolly.terser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ASTAccessor = typingsJapgolly.terser.mod.ASTLambda
  type ASTArrow = typingsJapgolly.terser.mod.ASTLambda
  type ASTAssign = typingsJapgolly.terser.mod.ASTBinary
  type ASTAtom = typingsJapgolly.terser.mod.ASTConstant
  type ASTBlockStatement = typingsJapgolly.terser.mod.ASTBlock
  type ASTBoolean = typingsJapgolly.terser.mod.ASTAtom
  type ASTBreak = typingsJapgolly.terser.mod.ASTLoopControl
  type ASTClassExpression = typingsJapgolly.terser.mod.ASTClass
  type ASTConst = typingsJapgolly.terser.mod.ASTDefinitions
  type ASTConstant = typingsJapgolly.terser.mod.ASTNode
  type ASTContinue = typingsJapgolly.terser.mod.ASTLoopControl
  type ASTDebugger = typingsJapgolly.terser.mod.ASTStatement
  type ASTDefClass = typingsJapgolly.terser.mod.ASTClass
  type ASTDefault = typingsJapgolly.terser.mod.ASTSwitchBranch
  type ASTDefaultAssign = typingsJapgolly.terser.mod.ASTBinary
  type ASTDefun = typingsJapgolly.terser.mod.ASTLambda
  type ASTDo = typingsJapgolly.terser.mod.ASTDWLoop
  type ASTDot = typingsJapgolly.terser.mod.ASTPropAccess
  type ASTEmptyStatement = typingsJapgolly.terser.mod.ASTStatement
  type ASTFalse = typingsJapgolly.terser.mod.ASTBoolean
  type ASTFinally = typingsJapgolly.terser.mod.ASTBlock
  type ASTFunction = typingsJapgolly.terser.mod.ASTLambda
  type ASTHole = typingsJapgolly.terser.mod.ASTAtom
  type ASTInfinity = typingsJapgolly.terser.mod.ASTAtom
  type ASTJump = typingsJapgolly.terser.mod.ASTStatement
  type ASTLabelRef = typingsJapgolly.terser.mod.ASTSymbol
  type ASTLet = typingsJapgolly.terser.mod.ASTDefinitions
  type ASTNaN = typingsJapgolly.terser.mod.ASTAtom
  type ASTNew = typingsJapgolly.terser.mod.ASTCall
  type ASTNewTarget = typingsJapgolly.terser.mod.ASTNode
  type ASTNull = typingsJapgolly.terser.mod.ASTAtom
  type ASTReturn = typingsJapgolly.terser.mod.ASTExit
  type ASTStatement = typingsJapgolly.terser.mod.ASTNode
  type ASTSub = typingsJapgolly.terser.mod.ASTPropAccess
  type ASTSuper = typingsJapgolly.terser.mod.ASTThis
  type ASTSwitchBranch = typingsJapgolly.terser.mod.ASTBlock
  type ASTSymbolBlockDeclaration = typingsJapgolly.terser.mod.ASTSymbolDeclaration
  type ASTSymbolCatch = typingsJapgolly.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolClass = typingsJapgolly.terser.mod.ASTSymbolDeclaration
  type ASTSymbolConst = typingsJapgolly.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolDefClass = typingsJapgolly.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolDefun = typingsJapgolly.terser.mod.ASTSymbolDeclaration
  type ASTSymbolExport = typingsJapgolly.terser.mod.ASTSymbolRef
  type ASTSymbolExportForeign = typingsJapgolly.terser.mod.ASTSymbol
  type ASTSymbolFunarg = typingsJapgolly.terser.mod.ASTSymbolVar
  type ASTSymbolImport = typingsJapgolly.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolImportForeign = typingsJapgolly.terser.mod.ASTSymbol
  type ASTSymbolLambda = typingsJapgolly.terser.mod.ASTSymbolDeclaration
  type ASTSymbolLet = typingsJapgolly.terser.mod.ASTSymbolBlockDeclaration
  type ASTSymbolMethod = typingsJapgolly.terser.mod.ASTSymbol
  type ASTSymbolRef = typingsJapgolly.terser.mod.ASTSymbol
  type ASTSymbolVar = typingsJapgolly.terser.mod.ASTSymbolDeclaration
  type ASTThis = typingsJapgolly.terser.mod.ASTSymbol
  type ASTThrow = typingsJapgolly.terser.mod.ASTExit
  type ASTTrue = typingsJapgolly.terser.mod.ASTBoolean
  type ASTUnaryPostfix = typingsJapgolly.terser.mod.ASTUnary
  type ASTUnaryPrefix = typingsJapgolly.terser.mod.ASTUnary
  type ASTUndefined = typingsJapgolly.terser.mod.ASTAtom
  type ASTVar = typingsJapgolly.terser.mod.ASTDefinitions
  type ASTWhile = typingsJapgolly.terser.mod.ASTDWLoop
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.terser.mod.ASTSymbolFunarg
    - typingsJapgolly.terser.mod.ASTDefaultAssign
    - typingsJapgolly.terser.mod.ASTDestructuring
    - typingsJapgolly.terser.mod.ASTExpansion
  */
  type ArgType = typingsJapgolly.terser.mod._ArgType | typingsJapgolly.terser.mod.ASTSymbolFunarg | typingsJapgolly.terser.mod.ASTDefaultAssign
}
