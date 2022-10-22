package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.SVGGradientElement
import typingsJapgolly.fabric.anon.ColorStops
import typingsJapgolly.fabric.fabricImplMod.Object
import typingsJapgolly.fabric.mod.fabric.Gradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGradient
  extends StObject
     with Instantiable1[/* options */ ColorStops, Gradient] {
  
  /**
    * Returns {@link fabric.Gradient} instance from an SVG element
    * @static
    * @memberOf fabric.Gradient
    * @param {SVGGradientElement} el SVG gradient element
    * @param {fabric.Object} instance
    * @return {fabric.Gradient} Gradient instance
    * @see http://www.w3.org/TR/SVG/pservers.html#LinearGradientElement
    * @see http://www.w3.org/TR/SVG/pservers.html#RadialGradientElement
    */
  def fromElement(el: SVGGradientElement, instance: Object): typingsJapgolly.fabric.fabricImplMod.Gradient = js.native
}
