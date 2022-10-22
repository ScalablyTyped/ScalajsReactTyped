package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.NumericLiteral")
@js.native
open class NumericLiteral protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.NumericLiteral {
  def this(_value: Double, _text: String, _valueText: String) = this()
  
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
  
  /* private */ /* CompleteClass */
  var _text: Any = js.native
  
  /* CompleteClass */
  var _trailingTriviaWidth: Double = js.native
  
  /* private */ /* CompleteClass */
  var _value: Any = js.native
  
  /* private */ /* CompleteClass */
  var _valueText: Any = js.native
  
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
  override def setPostComments(comments: js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def setPreComments(comments: js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment]): Unit = js.native
  
  /* CompleteClass */
  override def start(): Double = js.native
  
  /* CompleteClass */
  override def structuralEquals(ast: typingsJapgolly.typescriptServices.TypeScript.AST, includingPosition: Boolean): Boolean = js.native
  /* CompleteClass */
  override def structuralEquals(ast: typingsJapgolly.typescriptServices.TypeScript.NumericLiteral, includingPosition: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def syntaxID(): Double = js.native
  
  /* CompleteClass */
  override def text(): String = js.native
  
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  
  /* CompleteClass */
  override def value(): Any = js.native
  
  /* CompleteClass */
  override def valueText(): String = js.native
  
  /* CompleteClass */
  override def width(): Double = js.native
}
