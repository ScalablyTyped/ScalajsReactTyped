package typingsJapgolly.grommetIcons.components

import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.grommetIcons.es6IconsMod.IconProps
import typingsJapgolly.react.mod.SVGProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Device {
  
  @JSImport("grommet-icons/es6", "Device")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Device.type): SharedBuilder_IconPropsSVGProps_867722073[SVGSVGElement] = new SharedBuilder_IconPropsSVGProps_867722073[SVGSVGElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IconProps & SVGProps[SVGSVGElement]): SharedBuilder_IconPropsSVGProps_867722073[SVGSVGElement] = new SharedBuilder_IconPropsSVGProps_867722073[SVGSVGElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
