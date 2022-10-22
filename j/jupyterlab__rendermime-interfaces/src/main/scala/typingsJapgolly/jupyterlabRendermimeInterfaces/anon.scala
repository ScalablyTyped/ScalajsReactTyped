package typingsJapgolly.jupyterlabRendermimeInterfaces

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @jupyterlab/rendermime-interfaces.@jupyterlab/rendermime-interfaces.IRenderMime.LabIcon.IIcon & std.Partial<@jupyterlab/rendermime-interfaces.@jupyterlab/rendermime-interfaces.IRenderMime.LabIcon.IRenderer> */
  trait IIconPartialIRenderer extends StObject {
    
    /**
      * The name of the icon. By convention, the icon name will be namespaced
      * as so:
      *
      *     "pkg-name:icon-name"
      */
    val name: String
    
    var render: js.UndefOr[js.Function2[/* container */ HTMLElement, /* options */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      * A string containing the raw contents of an svg file.
      */
    var svgstr: String
    
    var unrender: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  }
  object IIconPartialIRenderer {
    
    inline def apply(name: String, svgstr: String): IIconPartialIRenderer = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], svgstr = svgstr.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconPartialIRenderer]
    }
    
    extension [Self <: IIconPartialIRenderer](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRender(value: (/* container */ HTMLElement, /* options */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: /* container */ HTMLElement, t1: /* options */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSvgstr(value: String): Self = StObject.set(x, "svgstr", value.asInstanceOf[js.Any])
      
      inline def setUnrender(value: /* container */ HTMLElement => Callback): Self = StObject.set(x, "unrender", js.Any.fromFunction1((t0: /* container */ HTMLElement) => value(t0).runNow()))
      
      inline def setUnrenderUndefined: Self = StObject.set(x, "unrender", js.undefined)
    }
  }
}
