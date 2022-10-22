package typingsJapgolly.tableau.global.tableau

import org.scalajs.dom.HTMLElement
import typingsJapgolly.tableau.tableau.VizCreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tableau.Viz")
@js.native
open class Viz protected ()
  extends StObject
     with typingsJapgolly.tableau.tableau.Viz {
  /**
    * Creates a new Tableau Viz inside of the given HTML container, which is typically a <div> element.
    * Each option as well as the options parameter is optional.
    * If there is already a Viz associated with the parentElement, an exception is thrown.
    * Before reusing the parentElement you must first call dispose().
    */
  def this(node: HTMLElement, url: String) = this()
  def this(node: HTMLElement, url: String, options: VizCreateOptions) = this()
}
