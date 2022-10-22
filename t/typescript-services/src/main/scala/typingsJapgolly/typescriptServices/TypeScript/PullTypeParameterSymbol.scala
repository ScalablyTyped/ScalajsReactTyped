package typingsJapgolly.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullTypeParameterSymbol
  extends StObject
     with PullTypeSymbol {
  
  /* private */ var _constraint: Any = js.native
  
  def getBaseConstraint(semanticInfoChain: SemanticInfoChain): PullTypeSymbol = js.native
  
  def getConstraint(): PullTypeSymbol = js.native
  
  /* private */ def getConstraintRecursively(visitedTypeParameters: Any): Any = js.native
  
  def getDefaultConstraint(semanticInfoChain: SemanticInfoChain): PullTypeSymbol = js.native
  
  /* InferMemberOverrides */
  override def getIsSpecialized(): Boolean = js.native
  
  def setConstraint(constraintType: PullTypeSymbol): Unit = js.native
}
