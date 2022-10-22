package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.landscape
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.large
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.medium
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.portrait
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.small
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xlarge
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xsmall
import typingsJapgolly.arcgisJsApi.esri.BreakpointsOwner
import typingsJapgolly.arcgisJsApi.esri.BreakpointsOwnerBreakpoints
import typingsJapgolly.arcgisJsApi.esri.BreakpointsOwnerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsBreakpointsOwnerMod extends Shortcut {
  
  @JSImport("esri/views/BreakpointsOwner", JSImport.Namespace)
  @js.native
  val ^ : BreakpointsOwnerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/BreakpointsOwner", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with BreakpointsOwner {
    
    /**
      * A convenience property used for defining the breakpoints on the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#height) and [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#width) of the view.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#breakpoints)
      */
    /* CompleteClass */
    var breakpoints: BreakpointsOwnerBreakpoints = js.native
    
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
      * A convenience property indicating the general size of the view's width.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BreakpointsOwner.html#widthBreakpoint)
      */
    /* CompleteClass */
    var widthBreakpoint: xsmall | small | medium | large | xlarge = js.native
  }
  
  type _To = BreakpointsOwnerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsBreakpointsOwnerMod.foo` */
  override def _to: BreakpointsOwnerConstructor = ^
}
