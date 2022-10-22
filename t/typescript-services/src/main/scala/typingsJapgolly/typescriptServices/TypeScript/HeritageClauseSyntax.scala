package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeritageClauseSyntax
  extends StObject
     with SyntaxNode {
  
  /* private */ var _kind: Any = js.native
  
  var extendsOrImplementsKeyword: ISyntaxToken = js.native
  
  var typeNames: ISeparatedSyntaxList = js.native
  
  def update(kind: SyntaxKind, extendsOrImplementsKeyword: ISyntaxToken, typeNames: ISeparatedSyntaxList): HeritageClauseSyntax = js.native
  
  def withExtendsOrImplementsKeyword(extendsOrImplementsKeyword: ISyntaxToken): HeritageClauseSyntax = js.native
  
  def withKind(kind: SyntaxKind): HeritageClauseSyntax = js.native
  
  def withTypeName(typeName: INameSyntax): HeritageClauseSyntax = js.native
  
  def withTypeNames(typeNames: ISeparatedSyntaxList): HeritageClauseSyntax = js.native
}
