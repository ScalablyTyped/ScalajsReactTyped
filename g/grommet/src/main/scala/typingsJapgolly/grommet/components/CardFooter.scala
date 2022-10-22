package typingsJapgolly.grommet.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardFooter {
  
  @JSImport("grommet/es6", "CardFooter")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CardFooter.type): SharedBuilder_BoxTypes_1312507900[HTMLDivElement] = new SharedBuilder_BoxTypes_1312507900[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BoxTypes): SharedBuilder_BoxTypes_1312507900[HTMLDivElement] = new SharedBuilder_BoxTypes_1312507900[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
