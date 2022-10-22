package typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a LaTeX typesetter.
  */
trait ILatexTypesetter extends StObject {
  
  /**
    * Typeset a DOM element.
    *
    * @param element - the DOM element to typeset. The typesetting may
    *   happen synchronously or asynchronously.
    *
    * #### Notes
    * The application-wide rendermime object has a settable
    * `latexTypesetter` property which is used wherever LaTeX
    * typesetting is required. Extensions wishing to provide their
    * own typesetter may replace that on the global `lab.rendermime`.
    */
  def typeset(element: HTMLElement): Unit
}
object ILatexTypesetter {
  
  inline def apply(typeset: HTMLElement => Callback): ILatexTypesetter = {
    val __obj = js.Dynamic.literal(typeset = js.Any.fromFunction1((t0: HTMLElement) => typeset(t0).runNow()))
    __obj.asInstanceOf[ILatexTypesetter]
  }
  
  extension [Self <: ILatexTypesetter](x: Self) {
    
    inline def setTypeset(value: HTMLElement => Callback): Self = StObject.set(x, "typeset", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
  }
}
