package typingsJapgolly.imagesloaded

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.imagesloaded.imagesloadedBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImagesLoaded {
  
  type ElementSelector = Element | NodeList[Node] | js.Array[Element] | String
  
  @js.native
  trait ImagesLoaded
    extends StObject
       with Instantiable2[
          /* elem */ ElementSelector, 
          /* callback */ ImagesLoadedCallback, 
          typingsJapgolly.imagesloaded.ImagesLoaded.ImagesLoaded
        ] {
    
    var images: js.Array[LoadingImage] = js.native
    
    def off(event: String, listener: ImagesLoadedListener): Unit = js.native
    
    // event listeners
    def on(event: String, listener: ImagesLoadedListener): Unit = js.native
    
    def once(event: String, listener: ImagesLoadedListener): Unit = js.native
  }
  
  type ImagesLoadedCallback = js.Function1[
    /* instance */ js.UndefOr[typingsJapgolly.imagesloaded.ImagesLoaded.ImagesLoaded], 
    Unit
  ]
  
  @js.native
  trait ImagesLoadedConstructor extends StObject {
    
    def apply(elem: ElementSelector): typingsJapgolly.imagesloaded.ImagesLoaded.ImagesLoaded = js.native
    def apply(elem: ElementSelector, callback: ImagesLoadedCallback): typingsJapgolly.imagesloaded.ImagesLoaded.ImagesLoaded = js.native
    /**
      * Creates a new ImagesLoaded object with the provided callback
      * @param elem Element, NodeList, Element array, or selector string for images to watch
      * @param options object that can tell imagesloaded to watch background images as well
      * @param callback function triggered after all images have been loaded
      */
    def apply(elem: ElementSelector, options: ImagesLoadedOptions): typingsJapgolly.imagesloaded.ImagesLoaded.ImagesLoaded = js.native
    def apply(elem: ElementSelector, options: ImagesLoadedOptions, callback: ImagesLoadedCallback): typingsJapgolly.imagesloaded.ImagesLoaded.ImagesLoaded = js.native
  }
  
  type ImagesLoadedListener = js.Function2[
    /* instance */ typingsJapgolly.imagesloaded.ImagesLoaded.ImagesLoaded, 
    /* image */ js.UndefOr[LoadingImage], 
    Unit
  ]
  
  trait ImagesLoadedOptions extends StObject {
    
    var background: `true` | String
  }
  object ImagesLoadedOptions {
    
    inline def apply(background: `true` | String): ImagesLoadedOptions = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImagesLoadedOptions]
    }
    
    extension [Self <: ImagesLoadedOptions](x: Self) {
      
      inline def setBackground(value: `true` | String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    }
  }
  
  /** interface for an image currently loading or completed */
  trait LoadingImage extends StObject {
    
    var img: HTMLImageElement
    
    var isLoaded: Boolean
  }
  object LoadingImage {
    
    inline def apply(img: HTMLImageElement, isLoaded: Boolean): LoadingImage = {
      val __obj = js.Dynamic.literal(img = img.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingImage]
    }
    
    extension [Self <: LoadingImage](x: Self) {
      
      inline def setImg(value: HTMLImageElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
    }
  }
}
