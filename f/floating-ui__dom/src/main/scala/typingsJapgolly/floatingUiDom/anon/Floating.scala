package typingsJapgolly.floatingUiDom.anon

import org.scalajs.dom.HTMLElement
import typingsJapgolly.floatingUiCore.srcTypesMod.Strategy
import typingsJapgolly.floatingUiDom.srcTypesMod.ReferenceElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Floating extends StObject {
  
  var floating: HTMLElement
  
  var reference: ReferenceElement
  
  var strategy: Strategy
}
object Floating {
  
  inline def apply(floating: HTMLElement, reference: ReferenceElement, strategy: Strategy): Floating = {
    val __obj = js.Dynamic.literal(floating = floating.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Floating]
  }
  
  extension [Self <: Floating](x: Self) {
    
    inline def setFloating(value: HTMLElement): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setReference(value: ReferenceElement): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
