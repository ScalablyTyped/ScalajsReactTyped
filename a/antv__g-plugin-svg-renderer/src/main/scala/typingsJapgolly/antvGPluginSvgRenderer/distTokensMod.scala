package typingsJapgolly.antvGPluginSvgRenderer

import japgolly.scalajs.react.Callback
import org.scalajs.dom.SVGElement
import typingsJapgolly.antvGLite.mod.DisplayObject
import typingsJapgolly.antvGLite.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokensMod {
  
  trait ElementLifeCycleContribution extends StObject {
    
    def createElement(`object`: DisplayObject[Any, Any]): SVGElement
    
    def destroyElement(`object`: DisplayObject[Any, Any], $el: SVGElement): Unit
    
    def shouldUpdateElementAttribute(`object`: DisplayObject[Any, Any], attributeName: String): Boolean
    
    def updateElementAttribute(`object`: DisplayObject[Any, Any], $el: SVGElement): Unit
  }
  object ElementLifeCycleContribution {
    
    @JSImport("@antv/g-plugin-svg-renderer/dist/tokens", "ElementLifeCycleContribution")
    @js.native
    val ^ : DefinedToken = js.native
    
    extension [Self <: ElementLifeCycleContribution](x: Self) {
      
      inline def setCreateElement(value: DisplayObject[Any, Any] => SVGElement): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
      
      inline def setDestroyElement(value: (DisplayObject[Any, Any], SVGElement) => Callback): Self = StObject.set(x, "destroyElement", js.Any.fromFunction2((t0: DisplayObject[Any, Any], t1: SVGElement) => (value(t0, t1)).runNow()))
      
      inline def setShouldUpdateElementAttribute(value: (DisplayObject[Any, Any], String) => Boolean): Self = StObject.set(x, "shouldUpdateElementAttribute", js.Any.fromFunction2(value))
      
      inline def setUpdateElementAttribute(value: (DisplayObject[Any, Any], SVGElement) => Callback): Self = StObject.set(x, "updateElementAttribute", js.Any.fromFunction2((t0: DisplayObject[Any, Any], t1: SVGElement) => (value(t0, t1)).runNow()))
    }
  }
  
  trait SVGRendererPluginOptions extends StObject {
    
    var outputSVGElementId: Boolean
  }
  object SVGRendererPluginOptions {
    
    @JSImport("@antv/g-plugin-svg-renderer/dist/tokens", "SVGRendererPluginOptions")
    @js.native
    val ^ : DefinedToken = js.native
    
    extension [Self <: SVGRendererPluginOptions](x: Self) {
      
      inline def setOutputSVGElementId(value: Boolean): Self = StObject.set(x, "outputSVGElementId", value.asInstanceOf[js.Any])
    }
  }
}
