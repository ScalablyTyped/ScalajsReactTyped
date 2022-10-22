package typingsJapgolly.reactGalleryCarousel

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactGalleryCarousel.anon.GoLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The carousel component.
    * @see {@link https://github.com/yifaneye/react-gallery-carousel#props}
    */
  inline def apply(props: CarouselProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-gallery-carousel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The props of the carousel
    * @see {@link https://github.com/yifaneye/react-gallery-carousel#props}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactGalleryCarousel.anon.CarouselWithChildrenParti
    - typingsJapgolly.reactGalleryCarousel.anon.CarouselWithImagesPartial
  */
  trait CarouselProps extends StObject
  object CarouselProps {
    
    inline def CarouselWithChildrenParti(): typingsJapgolly.reactGalleryCarousel.anon.CarouselWithChildrenParti = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[typingsJapgolly.reactGalleryCarousel.anon.CarouselWithChildrenParti]
    }
    
    inline def CarouselWithImagesPartial(images: Images): typingsJapgolly.reactGalleryCarousel.anon.CarouselWithImagesPartial = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactGalleryCarousel.anon.CarouselWithImagesPartial]
    }
  }
  
  /**
    * The Ref carousel element with the imperative handlers.
    * @see {@link https://github.com/yifaneye/react-gallery-carousel#handlers}
    */
  type CarouselRef[T] = T & GoLeft
  
  // Carousel with children has optional images.
  trait CarouselWithChildren extends StObject {
    
    var children: Node
    
    var images: js.UndefOr[Images] = js.undefined
  }
  object CarouselWithChildren {
    
    inline def apply(): CarouselWithChildren = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[CarouselWithChildren]
    }
    
    extension [Self <: CarouselWithChildren](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImages(value: Images): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
  
  // Carousel has the props images mandatory if children do not exists.
  trait CarouselWithImages extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var images: Images
  }
  object CarouselWithImages {
    
    inline def apply(images: Images): CarouselWithImages = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselWithImages]
    }
    
    extension [Self <: CarouselWithImages](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImages(value: Images): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
  
  /**
    * The image object used in the images array
    * @example
    * {
    *   src: `https://placedog.net/700/420?id=1`,
    *   srcset: `https://placedog.net/400/240?id=1 400w, https://placedog.net/700/420?id=1 700w`,
    *   sizes: '(max-width: 1000px) 400px, (max-width: 2000px) 700px, 1000px',
    *   alt: `Dogs are domesticated mammals, not natural wild animals.`,
    *   thumbnail: `https://placedog.net/100/60?id=1`
    * }
    *
    * @see {@link https://github.com/yifaneye/react-gallery-carousel/blob/3adffccaf131e69eb084736aa24a0a2b47268fa8/README.md#image-object-example}
    */
  trait Image extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var src: String
    
    var srcset: js.UndefOr[String] = js.undefined
    
    var thumbnail: js.UndefOr[String] = js.undefined
  }
  object Image {
    
    inline def apply(src: String): Image = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
  
  /**
    * Array of image(s) to be placed in the carousel. Each image object in the array has a required attribute 'src'.
    * @example
    * [
    *    {
    *      src: `https://placedog.net/700/420?id=1`,
    *      srcset: `https://placedog.net/400/240?id=1 400w, https://placedog.net/700/420?id=1 700w`,
    *      sizes: '(max-width: 1000px) 400px, (max-width: 2000px) 700px, 1000px',
    *      alt: `Dogs are domesticated mammals, not natural wild animals.`,
    *      thumbnail: `https://placedog.net/100/60?id=1`
    *    },
    *    {
    *      src: `https://placedog.net/700/420?id=2`,
    *      srcset: `https://placedog.net/400/240?id=2 400w, https://placedog.net/700/420?id=2 700w`,
    *      sizes: '(max-width: 1000px) 400px, (max-width: 2000px) 700px, 1000px',
    *      alt: `Dogs are domesticated mammals, not natural wild animals.`,
    *      thumbnail: `https://placedog.net/100/60?id=2`
    *    }
    * ]
    */
  type Images = js.Array[Image]
  
  /**
    * The available position for large widgets
    * @see
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.top
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottom
  */
  trait LargeWidgetPositions extends StObject
  object LargeWidgetPositions {
    
    inline def bottom: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottom]
    
    inline def top: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.top = "top".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.top]
  }
  
  type ObjectFit = js.UndefOr[typingsJapgolly.csstype.mod.Property.ObjectFit]
  
  /**
    * The available position for small widgets
    * @see https://github.com/yifaneye/react-gallery-carousel#small-widget-positions
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.topLeft
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.topCenter
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.topRight
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.centerLeft
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.centerCenter
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.centerRight
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottomLeft
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottomCenter
    - typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottomRight
  */
  trait SmallWidgetPositions extends StObject
  object SmallWidgetPositions {
    
    inline def bottomCenter: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottomCenter = "bottomCenter".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottomCenter]
    
    inline def bottomLeft: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.bottomRight]
    
    inline def centerCenter: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.centerCenter = "centerCenter".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.centerCenter]
    
    inline def centerLeft: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.centerLeft = "centerLeft".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.centerLeft]
    
    inline def centerRight: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.centerRight = "centerRight".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.centerRight]
    
    inline def topCenter: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.topCenter = "topCenter".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.topCenter]
    
    inline def topLeft: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.topLeft]
    
    inline def topRight: typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.reactGalleryCarousel.reactGalleryCarouselStrings.topRight]
  }
}
