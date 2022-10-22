package typingsJapgolly.photoswipe

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.HTMLElement
import typingsJapgolly.photoswipe.mod.Item
import typingsJapgolly.photoswipe.mod.Options
import typingsJapgolly.photoswipe.mod.UI
import typingsJapgolly.photoswipe.mod.UIFramework
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object PhotoSwipe {
    
    /**
      * Base PhotoSwipe class. Derived from http://photoswipe.com/documentation/api.html
      */
    @JSGlobal("PhotoSwipe")
    @js.native
    open class ^[T /* <: Options */] protected ()
      extends typingsJapgolly.photoswipe.mod.^[T] {
      /**
        * Constructs a PhotoSwipe.
        *
        * Note: By default Typescript will not correctly typecheck the options parameter. Make sure to
        * explicitly annotate the type of options being passed into the constructor like so:
        *
        * new PhotoSwipe<PhotoSwipeUI_Default.Options>( element, PhotoSwipeUI_Default, items, options );
        *
        * It accepts 4 arguments:
        *
        * (1) PhotoSwipe element (it must be added to DOM).
        * (2) PhotoSwipe UI class. If you included default photoswipe-ui-default.js, class will be PhotoSwipeUI_Default. Can be "false".
        * (3) Array with objects (slides).
        * (4) Options.
        */
      def this(
        pswpElement: HTMLElement,
        uiConstructor: Instantiable2[
                /* pswp */ typingsJapgolly.photoswipe.mod.PhotoSwipe[T], 
                /* framework */ UIFramework, 
                UI[T]
              ],
        items: js.Array[Item],
        options: T
      ) = this()
      def this(pswpElement: HTMLElement, uiConstructor: Boolean, items: js.Array[Item], options: T) = this()
    }
  }
}
