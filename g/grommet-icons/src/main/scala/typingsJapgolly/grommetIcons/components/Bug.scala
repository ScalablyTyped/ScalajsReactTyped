package typingsJapgolly.grommetIcons.components

import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.grommetIcons.es6IconsMod.IconProps
import typingsJapgolly.react.mod.SVGProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bug {
  
  @JSImport("grommet-icons/es6", "Bug")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Bug.type): SharedBuilder_IconPropsSVGProps_867722073[SVGSVGElement] = new SharedBuilder_IconPropsSVGProps_867722073[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IconProps & SVGProps[SVGSVGElement]): SharedBuilder_IconPropsSVGProps_867722073[SVGSVGElement] = new SharedBuilder_IconPropsSVGProps_867722073[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
