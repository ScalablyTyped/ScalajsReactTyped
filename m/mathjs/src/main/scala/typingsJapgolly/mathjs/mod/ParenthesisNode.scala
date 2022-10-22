package typingsJapgolly.mathjs.mod

import typingsJapgolly.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParenthesisNode[TContent /* <: MathNode */]
  extends StObject
     with MathNode {
  
  var content: TContent = js.native
  
  var isParenthesisNode: `true` = js.native
  
  @JSName("type")
  var type_ParenthesisNode: typingsJapgolly.mathjs.mathjsStrings.ParenthesisNode = js.native
}
