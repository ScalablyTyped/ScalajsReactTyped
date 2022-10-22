package typingsJapgolly.babylonjs

import org.scalajs.dom.Element
import typingsJapgolly.babylonjs.anon.PartialXRSessionInit
import typingsJapgolly.babylonjs.typesMod.Nullable
import typingsJapgolly.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRDOMOverlayMod {
  
  @JSImport("babylonjs/XR/features/WebXRDOMOverlay", "WebXRDomOverlay")
  @js.native
  open class WebXRDomOverlay protected () extends WebXRAbstractFeature {
    /**
      * Creates a new instance of the dom-overlay feature
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param options options to use when constructing this feature
      */
    def this(
      _xrSessionManager: WebXRSessionManager,
      /**
      * options to use when constructing this feature
      */
    options: IWebXRDomOverlayOptions
    ) = this()
    
    /**
      * Event Listener to supress "beforexrselect" events.
      */
    /* private */ var _beforeXRSelectListener: Any = js.native
    
    /**
      * Type of overlay - non-null when available
      */
    /* private */ var _domOverlayType: Any = js.native
    
    /**
      * Element used for overlay
      */
    /* private */ var _element: Any = js.native
    
    /**
      * The type of DOM overlay (null when not supported).  Provided by UA and remains unchanged for duration of session.
      */
    def domOverlayType: Nullable[WebXRDomOverlayType] = js.native
    
    /**
      * Extends the session init object if needed
      * @returns augmentation object for the xr session init object.
      */
    @JSName("getXRSessionInitExtension")
    def getXRSessionInitExtension_MWebXRDomOverlay(): js.Promise[PartialXRSessionInit] = js.native
    
    /**
      * options to use when constructing this feature
      */
    val options: IWebXRDomOverlayOptions = js.native
  }
  /* static members */
  object WebXRDomOverlay {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRDOMOverlay", "WebXRDomOverlay.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRDOMOverlay", "WebXRDomOverlay.Version")
    @js.native
    val Version: Double = js.native
  }
  
  trait IWebXRDomOverlayOptions extends StObject {
    
    /**
      * DOM Element or document query selector string for overlay.
      *
      * NOTE: UA may make this element background transparent in XR.
      */
    var element: Element | String
    
    /**
      * Supress XR Select events on container element (DOM blocks interaction to scene).
      */
    var supressXRSelectEvents: js.UndefOr[Boolean] = js.undefined
  }
  object IWebXRDomOverlayOptions {
    
    inline def apply(element: Element | String): IWebXRDomOverlayOptions = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRDomOverlayOptions]
    }
    
    extension [Self <: IWebXRDomOverlayOptions](x: Self) {
      
      inline def setElement(value: Element | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setSupressXRSelectEvents(value: Boolean): Self = StObject.set(x, "supressXRSelectEvents", value.asInstanceOf[js.Any])
      
      inline def setSupressXRSelectEventsUndefined: Self = StObject.set(x, "supressXRSelectEvents", js.undefined)
    }
  }
  
  /**
    * Type of DOM overlay provided by UA.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babylonjs.babylonjsStrings.screen
    - typingsJapgolly.babylonjs.babylonjsStrings.floating
    - typingsJapgolly.babylonjs.babylonjsStrings.`head-locked`
  */
  trait WebXRDomOverlayType extends StObject
  object WebXRDomOverlayType {
    
    inline def floating: typingsJapgolly.babylonjs.babylonjsStrings.floating = "floating".asInstanceOf[typingsJapgolly.babylonjs.babylonjsStrings.floating]
    
    inline def `head-locked`: typingsJapgolly.babylonjs.babylonjsStrings.`head-locked` = "head-locked".asInstanceOf[typingsJapgolly.babylonjs.babylonjsStrings.`head-locked`]
    
    inline def screen: typingsJapgolly.babylonjs.babylonjsStrings.screen = "screen".asInstanceOf[typingsJapgolly.babylonjs.babylonjsStrings.screen]
  }
}
