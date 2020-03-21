package typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a LaTeX typesetter.
  */
trait ILatexTypesetter extends js.Object {
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
  @scala.inline
  def apply(typeset: HTMLElement => Callback): ILatexTypesetter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("typeset")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => typeset(t0).runNow()))
    __obj.asInstanceOf[ILatexTypesetter]
  }
}

