package typingsJapgolly.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "FunctionPropertyAssignment")
@js.native
open class FunctionPropertyAssignment protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.FunctionPropertyAssignment {
  def this(
    propertyName: typingsJapgolly.typescriptServices.TypeScript.Identifier,
    callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignature,
    block: typingsJapgolly.typescriptServices.TypeScript.Block
  ) = this()
  
  /* private */ /* CompleteClass */
  var _astID: Any = js.native
  
  /* CompleteClass */
  var _end: Double = js.native
  
  /* private */ /* CompleteClass */
  var _postComments: Any = js.native
  
  /* private */ /* CompleteClass */
  var _preComments: Any = js.native
  
  /* CompleteClass */
  var _start: Double = js.native
  
  /* CompleteClass */
  var _trailingTriviaWidth: Double = js.native
  
  /* CompleteClass */
  var block: typingsJapgolly.typescriptServices.TypeScript.Block = js.native
  
  /* CompleteClass */
  var callSignature: typingsJapgolly.typescriptServices.TypeScript.CallSignature = js.native
  
  /* CompleteClass */
  override def end(): Double = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  
  /* CompleteClass */
  override def kind(): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  
  /* CompleteClass */
  var parent: typingsJapgolly.typescriptServices.TypeScript.AST = js.native
  
  /* CompleteClass */
  override def postComments(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  override def preComments(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment] = js.native
  
  /* CompleteClass */
  var propertyName: typingsJapgolly.typescriptServices.TypeScript.Identifier = js.native
  
  /* CompleteClass */
  override def setPostComments(comments: js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def setPreComments(comments: js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
  
  /* CompleteClass */
  override def structuralEquals(ast: typingsJapgolly.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
}
