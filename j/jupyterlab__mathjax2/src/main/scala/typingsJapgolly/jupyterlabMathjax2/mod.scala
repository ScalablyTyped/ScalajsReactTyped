package typingsJapgolly.jupyterlabMathjax2

import org.scalajs.dom.HTMLElement
import typingsJapgolly.jupyterlabMathjax2.mod.MathJaxTypesetter.IOptions
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/mathjax2", "MathJaxTypesetter")
  @js.native
  open class MathJaxTypesetter protected ()
    extends StObject
       with ILatexTypesetter {
    /**
      * Create a new MathJax typesetter.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _config: Any = js.native
    
    /**
      * Initialize MathJax.
      */
    /* private */ var _init: Any = js.native
    
    /* private */ var _initPromise: Any = js.native
    
    /* private */ var _initialized: Any = js.native
    
    /**
      * Handle MathJax loading.
      */
    /* private */ var _onLoad: Any = js.native
    
    /* private */ var _url: Any = js.native
    
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
    /* CompleteClass */
    override def typeset(element: HTMLElement): Unit = js.native
  }
  object MathJaxTypesetter {
    
    /**
      * MathJaxTypesetter constructor options.
      */
    trait IOptions extends StObject {
      
      /**
        * A configuration string to compose into the MathJax URL.
        */
      var config: String
      
      /**
        * The url to load MathJax from.
        */
      var url: String
    }
    object IOptions {
      
      inline def apply(config: String, url: String): IOptions = {
        val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
