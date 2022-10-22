package typingsJapgolly.sigmajs

import org.scalajs.dom.Element
import typingsJapgolly.sigmajs.SigmaJs.CustomShapes
import typingsJapgolly.sigmajs.SigmaJs.Sigma
import typingsJapgolly.sigmajs.SigmaJs.SigmaConfigs
import typingsJapgolly.sigmajs.SigmaJs.SigmaFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("CustomShapes")
  @js.native
  def CustomShapes: typingsJapgolly.sigmajs.SigmaJs.CustomShapes = js.native
  inline def CustomShapes_=(x: CustomShapes): Unit = js.Dynamic.global.updateDynamic("CustomShapes")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ShapeLibrary")
  @js.native
  def ShapeLibrary: CustomShapes = js.native
  inline def ShapeLibrary_=(x: CustomShapes): Unit = js.Dynamic.global.updateDynamic("ShapeLibrary")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("sigma")
  @js.native
  open class sigma ()
    extends StObject
       with Sigma {
    def this(configuration: SigmaConfigs) = this()
    def this(container: String) = this()
    def this(container: Element) = this()
  }
  @JSGlobal("sigma")
  @js.native
  def sigma: SigmaFactory = js.native
  inline def sigma_=(x: SigmaFactory): Unit = js.Dynamic.global.updateDynamic("sigma")(x.asInstanceOf[js.Any])
}
