package typingsJapgolly.objectInspect

import typingsJapgolly.objectInspect.objectInspectStrings.Charactertabulation
import typingsJapgolly.objectInspect.objectInspectStrings.double
import typingsJapgolly.objectInspect.objectInspectStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Return a string `s` with the string representation of `obj` up to a depth of `opts.depth`.
    *
    * @param obj Object to inspect
    * @param opts Inspection options. Default: `{}`.
    * @return String representation of `obj`
    */
  inline def apply(obj: Any): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(obj: Any, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("object-inspect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Inspection options
    */
  trait Options extends StObject {
    
    /**
      * When true, a custom inspect method function will be invoked. Default true.
      */
    var customInspect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum depth of the inspection. Default: `5`.
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Must be "\t", null, or a positive integer. Default null.
      */
    var indent: js.UndefOr[Double | Charactertabulation | Null] = js.undefined
    
    /**
      * Must be 0, a positive integer, Infinity, or null, if present. Default Infinity.
      */
    var maxStringLength: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Must be "single" or "double", if present.
      */
    var quoteStyle: js.UndefOr[single | double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      inline def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setIndent(value: Double | Charactertabulation): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentNull: Self = StObject.set(x, "indent", null)
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setMaxStringLength(value: Double): Self = StObject.set(x, "maxStringLength", value.asInstanceOf[js.Any])
      
      inline def setMaxStringLengthNull: Self = StObject.set(x, "maxStringLength", null)
      
      inline def setMaxStringLengthUndefined: Self = StObject.set(x, "maxStringLength", js.undefined)
      
      inline def setQuoteStyle(value: single | double): Self = StObject.set(x, "quoteStyle", value.asInstanceOf[js.Any])
      
      inline def setQuoteStyleUndefined: Self = StObject.set(x, "quoteStyle", js.undefined)
    }
  }
}
