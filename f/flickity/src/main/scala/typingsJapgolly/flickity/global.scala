package typingsJapgolly.flickity

import org.scalajs.dom.Element
import typingsJapgolly.flickity.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Flickity {
    
    @JSGlobal("Flickity")
    @js.native
    open class ^ protected ()
      extends typingsJapgolly.flickity.mod.^ {
      /**
        * Initializes an new instance of Flickity .
        *
        * @param element Element selector string or container Element to initialize Flickity on
        * @param options (IOptions) Flickity options
        */
      def this(selector: String) = this()
      def this(selector: Element) = this()
      def this(selector: String, options: Options) = this()
      def this(selector: Element, options: Options) = this()
    }
    
    @JSGlobal("Flickity")
    @js.native
    val ^ : js.Any = js.native
    
    // static methods
    /**
      * (static) Get the Flickity instance.
      *
      * @param element Element selector string
      */
    /* static member */
    inline def data(element: String): typingsJapgolly.flickity.mod.Flickity = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.flickity.mod.Flickity]
    inline def data(element: Element): typingsJapgolly.flickity.mod.Flickity = ^.asInstanceOf[js.Dynamic].applyDynamic("data")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.flickity.mod.Flickity]
  }
}
