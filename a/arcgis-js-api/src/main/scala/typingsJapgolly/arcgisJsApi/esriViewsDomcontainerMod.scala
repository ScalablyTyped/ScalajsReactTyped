package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.arcgisJsApi.esri.DOMContainer
import typingsJapgolly.arcgisJsApi.esri.DOMContainerConstructor
import typingsJapgolly.arcgisJsApi.esri.DefaultUI
import typingsJapgolly.arcgisJsApi.esri.Popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDomcontainerMod extends Shortcut {
  
  @JSImport("esri/views/DOMContainer", JSImport.Namespace)
  @js.native
  val ^ : DOMContainerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/DOMContainer", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with DOMContainer {
    
    /**
      * The `id` or node representing the DOM element containing the view.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container)
      */
    /* CompleteClass */
    var container: HTMLDivElement = js.native
    
    /**
      * Indicates if the browser focus is on the view.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#focused)
      */
    /* CompleteClass */
    override val focused: Boolean = js.native
    
    /**
      * The height of the view in pixels read from the view container element.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height)
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * A Popup object that displays general content or attributes from [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#map).
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#popup)
      */
    /* CompleteClass */
    var popup: Popup = js.native
    
    /**
      * Indicates if the view is being resized.
      *
      * @default false
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#resizing)
      */
    /* CompleteClass */
    override val resizing: Boolean = js.native
    
    /**
      * An array containing the width and height of the view in pixels, e.g.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#size)
      */
    /* CompleteClass */
    override val size: js.Array[Double] = js.native
    
    /**
      * Indicates if the view is visible on the page.
      *
      * @default true
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#suspended)
      */
    /* CompleteClass */
    override val suspended: Boolean = js.native
    
    /**
      * Exposes the default widgets available in the view and allows you to toggle them on and off.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#ui)
      */
    /* CompleteClass */
    var ui: DefaultUI = js.native
    
    /**
      * The width of the view in pixels read from the view container element.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width)
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  
  type _To = DOMContainerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsDomcontainerMod.foo` */
  override def _to: DOMContainerConstructor = ^
}
