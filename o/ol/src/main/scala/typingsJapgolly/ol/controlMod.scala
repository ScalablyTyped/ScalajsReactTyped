package typingsJapgolly.ol

import typingsJapgolly.ol.controlAttributionMod.Options
import typingsJapgolly.ol.controlAttributionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod {
  
  @JSImport("ol/control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/control", "Attribution")
  @js.native
  open class Attribution () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/control", "Control")
  @js.native
  open class Control protected ()
    extends typingsJapgolly.ol.controlControlMod.default {
    def this(options: typingsJapgolly.ol.controlControlMod.Options) = this()
  }
  
  @JSImport("ol/control", "FullScreen")
  @js.native
  open class FullScreen ()
    extends typingsJapgolly.ol.controlFullScreenMod.default {
    def this(opt_options: typingsJapgolly.ol.controlFullScreenMod.Options) = this()
  }
  
  @JSImport("ol/control", "MousePosition")
  @js.native
  open class MousePosition ()
    extends typingsJapgolly.ol.controlMousePositionMod.default {
    def this(opt_options: typingsJapgolly.ol.controlMousePositionMod.Options) = this()
  }
  
  @JSImport("ol/control", "OverviewMap")
  @js.native
  open class OverviewMap ()
    extends typingsJapgolly.ol.controlOverviewMapMod.default {
    def this(opt_options: typingsJapgolly.ol.controlOverviewMapMod.Options) = this()
  }
  
  @JSImport("ol/control", "Rotate")
  @js.native
  open class Rotate ()
    extends typingsJapgolly.ol.controlRotateMod.default {
    def this(opt_options: typingsJapgolly.ol.controlRotateMod.Options) = this()
  }
  
  @JSImport("ol/control", "ScaleLine")
  @js.native
  open class ScaleLine ()
    extends typingsJapgolly.ol.controlScaleLineMod.default {
    def this(opt_options: typingsJapgolly.ol.controlScaleLineMod.Options) = this()
  }
  
  @JSImport("ol/control", "Zoom")
  @js.native
  open class Zoom ()
    extends typingsJapgolly.ol.controlZoomMod.default {
    def this(opt_options: typingsJapgolly.ol.controlZoomMod.Options) = this()
  }
  
  @JSImport("ol/control", "ZoomSlider")
  @js.native
  open class ZoomSlider ()
    extends typingsJapgolly.ol.controlZoomSliderMod.default {
    def this(opt_options: typingsJapgolly.ol.controlZoomSliderMod.Options) = this()
  }
  
  @JSImport("ol/control", "ZoomToExtent")
  @js.native
  open class ZoomToExtent ()
    extends typingsJapgolly.ol.controlZoomToExtentMod.default {
    def this(opt_options: typingsJapgolly.ol.controlZoomToExtentMod.Options) = this()
  }
  
  inline def defaults(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default]]
  inline def defaults(opt_options: DefaultsOptions): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt_options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.controlControlMod.default]]
  
  trait DefaultsOptions extends StObject {
    
    var attribution: js.UndefOr[Boolean] = js.undefined
    
    var attributionOptions: js.UndefOr[Options] = js.undefined
    
    var rotate: js.UndefOr[Boolean] = js.undefined
    
    var rotateOptions: js.UndefOr[typingsJapgolly.ol.controlRotateMod.Options] = js.undefined
    
    var zoom: js.UndefOr[Boolean] = js.undefined
    
    var zoomOptions: js.UndefOr[typingsJapgolly.ol.controlZoomMod.Options] = js.undefined
  }
  object DefaultsOptions {
    
    inline def apply(): DefaultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsOptions]
    }
    
    extension [Self <: DefaultsOptions](x: Self) {
      
      inline def setAttribution(value: Boolean): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionOptions(value: Options): Self = StObject.set(x, "attributionOptions", value.asInstanceOf[js.Any])
      
      inline def setAttributionOptionsUndefined: Self = StObject.set(x, "attributionOptions", js.undefined)
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateOptions(value: typingsJapgolly.ol.controlRotateMod.Options): Self = StObject.set(x, "rotateOptions", value.asInstanceOf[js.Any])
      
      inline def setRotateOptionsUndefined: Self = StObject.set(x, "rotateOptions", js.undefined)
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomOptions(value: typingsJapgolly.ol.controlZoomMod.Options): Self = StObject.set(x, "zoomOptions", value.asInstanceOf[js.Any])
      
      inline def setZoomOptionsUndefined: Self = StObject.set(x, "zoomOptions", js.undefined)
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
