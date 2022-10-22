package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.landscape
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.large
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.medium
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.portrait
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.small
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xlarge
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xsmall
import typingsJapgolly.arcgisJsApi.esri.BreakpointsOwnerBreakpoints
import typingsJapgolly.arcgisJsApi.esri.DefaultUI
import typingsJapgolly.arcgisJsApi.esri.Popup
import typingsJapgolly.arcgisJsApi.esri.SceneView
import typingsJapgolly.arcgisJsApi.esri.SceneViewConstructor
import typingsJapgolly.arcgisJsApi.esri.SceneViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsSceneViewMod extends Shortcut {
  
  @JSImport("esri/views/SceneView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SceneViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/SceneView", JSImport.Namespace)
  @js.native
  /**
    * A SceneView displays a 3D view of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) or [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) instance using WebGL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html)
    */
  open class Class ()
    extends StObject
       with SceneView {
    def this(properties: SceneViewProperties) = this()
    
    /**
      * A convenience property used for defining the breakpoints on the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) and [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
      */
    /* CompleteClass */
    var breakpoints: BreakpointsOwnerBreakpoints = js.native
    
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
      * A convenience property indicating the general size of the view's height.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#heightBreakpoint)
      */
    /* CompleteClass */
    var heightBreakpoint: xsmall | small | medium | large | xlarge = js.native
    
    /**
      * A convenience property indicating the view's orientation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#orientation)
      */
    /* CompleteClass */
    override val orientation: landscape | portrait = js.native
    
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
    
    /**
      * A convenience property indicating the general size of the view's width.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint)
      */
    /* CompleteClass */
    var widthBreakpoint: xsmall | small | medium | large | xlarge = js.native
  }
  
  type _To = js.Object & SceneViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsSceneViewMod.foo` */
  override def _to: js.Object & SceneViewConstructor = ^
}
