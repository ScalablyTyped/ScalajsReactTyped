package typingsJapgolly.tsModel.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSModelVisitor extends StObject {
  
  def betweenElements(): Unit
  
  def endTypeDeclaration(decl: TSTypeDeclaration): Unit
  
  def endVisitElement(decl: TSAPIElementDeclaration): Unit
  
  def startTypeDeclaration(decl: TSTypeDeclaration): Boolean
  
  def startVisitElement(decl: TSAPIElementDeclaration): Boolean
}
object TSModelVisitor {
  
  inline def apply(
    betweenElements: Callback,
    endTypeDeclaration: TSTypeDeclaration => Callback,
    endVisitElement: TSAPIElementDeclaration => Callback,
    startTypeDeclaration: TSTypeDeclaration => Boolean,
    startVisitElement: TSAPIElementDeclaration => Boolean
  ): TSModelVisitor = {
    val __obj = js.Dynamic.literal(betweenElements = betweenElements.toJsFn, endTypeDeclaration = js.Any.fromFunction1((t0: TSTypeDeclaration) => endTypeDeclaration(t0).runNow()), endVisitElement = js.Any.fromFunction1((t0: TSAPIElementDeclaration) => endVisitElement(t0).runNow()), startTypeDeclaration = js.Any.fromFunction1(startTypeDeclaration), startVisitElement = js.Any.fromFunction1(startVisitElement))
    __obj.asInstanceOf[TSModelVisitor]
  }
  
  extension [Self <: TSModelVisitor](x: Self) {
    
    inline def setBetweenElements(value: Callback): Self = StObject.set(x, "betweenElements", value.toJsFn)
    
    inline def setEndTypeDeclaration(value: TSTypeDeclaration => Callback): Self = StObject.set(x, "endTypeDeclaration", js.Any.fromFunction1((t0: TSTypeDeclaration) => value(t0).runNow()))
    
    inline def setEndVisitElement(value: TSAPIElementDeclaration => Callback): Self = StObject.set(x, "endVisitElement", js.Any.fromFunction1((t0: TSAPIElementDeclaration) => value(t0).runNow()))
    
    inline def setStartTypeDeclaration(value: TSTypeDeclaration => Boolean): Self = StObject.set(x, "startTypeDeclaration", js.Any.fromFunction1(value))
    
    inline def setStartVisitElement(value: TSAPIElementDeclaration => Boolean): Self = StObject.set(x, "startVisitElement", js.Any.fromFunction1(value))
  }
}
