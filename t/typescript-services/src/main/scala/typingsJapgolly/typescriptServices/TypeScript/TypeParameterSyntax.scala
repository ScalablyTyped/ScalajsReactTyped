package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParameterSyntax
  extends StObject
     with SyntaxNode {
  
  var constraint: ConstraintSyntax = js.native
  
  var identifier: ISyntaxToken = js.native
  
  def update(identifier: ISyntaxToken, constraint: ConstraintSyntax): TypeParameterSyntax = js.native
  
  def withConstraint(constraint: ConstraintSyntax): TypeParameterSyntax = js.native
  
  def withIdentifier(identifier: ISyntaxToken): TypeParameterSyntax = js.native
}
