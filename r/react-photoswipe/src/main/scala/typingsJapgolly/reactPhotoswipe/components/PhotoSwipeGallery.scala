package typingsJapgolly.reactPhotoswipe.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.photoswipe.mod.Item
import typingsJapgolly.photoswipe.mod.Options
import typingsJapgolly.reactPhotoswipe.anon.Prevent
import typingsJapgolly.reactPhotoswipe.anon.X
import typingsJapgolly.reactPhotoswipe.mod.PhotoSwipeGalleryItem
import typingsJapgolly.reactPhotoswipe.mod.PhotoSwipeGalleryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhotoSwipeGallery {
  
  inline def apply(items: js.Array[PhotoSwipeGalleryItem], thumbnailContent: PhotoSwipeGalleryItem => Node): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], thumbnailContent = js.Any.fromFunction1(thumbnailContent))
    new Builder(js.Array(this.component, __props.asInstanceOf[PhotoSwipeGalleryProps]))
  }
  
  @JSImport("react-photoswipe", "PhotoSwipeGallery")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPhotoswipe.mod.PhotoSwipeGallery] {
    
    inline def afterChange(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("afterChange", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def beforeChange(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("beforeChange", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def close(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("close", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def destroy(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("destroy", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def gettingData(
      value: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* index */ Double, /* item */ Item) => Callback
    ): this.type = set("gettingData", js.Any.fromFunction3((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* index */ Double, t2: /* item */ Item) => (value(t0, t1, t2)).runNow()))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def imageLoadComplete(
      value: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* index */ Double, /* item */ Item) => Callback
    ): this.type = set("imageLoadComplete", js.Any.fromFunction3((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* index */ Double, t2: /* item */ Item) => (value(t0, t1, t2)).runNow()))
    
    inline def initialZoomIn(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("initialZoomIn", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def initialZoomInEnd(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("initialZoomInEnd", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def initialZoomOut(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("initialZoomOut", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def initialZoomOutEnd(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("initialZoomOutEnd", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def mouseUsed(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("mouseUsed", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def options(value: Options): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def parseVerticalMargin(
      value: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* item */ Item) => Callback
    ): this.type = set("parseVerticalMargin", js.Any.fromFunction2((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* item */ Item) => (value(t0, t1)).runNow()))
    
    inline def preventDragEvent(
      value: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* e */ MouseEvent, /* isDown */ Boolean, /* preventObj */ Prevent) => Callback
    ): this.type = set("preventDragEvent", js.Any.fromFunction4((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* e */ MouseEvent, t2: /* isDown */ Boolean, t3: /* preventObj */ Prevent) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def resize(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("resize", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def shareLinkClick(
      value: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* e */ MouseEvent, /* item */ Item) => Callback
    ): this.type = set("shareLinkClick", js.Any.fromFunction3((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* e */ MouseEvent, t2: /* item */ Item) => (value(t0, t1, t2)).runNow()))
    
    inline def unbindEvents(value: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe => Callback): this.type = set("unbindEvents", js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe) => value(t0).runNow()))
    
    inline def updateScrollOffset(
      value: (/* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, /* _offset */ X) => Callback
    ): this.type = set("updateScrollOffset", js.Any.fromFunction2((t0: /* instance */ typingsJapgolly.reactPhotoswipe.mod.PhotoSwipe, t1: /* _offset */ X) => (value(t0, t1)).runNow()))
  }
  
  def withProps(p: PhotoSwipeGalleryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
