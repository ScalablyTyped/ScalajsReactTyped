package typingsJapgolly.vmap

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.vmap.vmapStrings.breakEnd
import typingsJapgolly.vmap.vmapStrings.breakStart
import typingsJapgolly.vmap.vmapStrings.display
import typingsJapgolly.vmap.vmapStrings.error
import typingsJapgolly.vmap.vmapStrings.linear
import typingsJapgolly.vmap.vmapStrings.nonlinear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * VMAP parser
    */
  @JSImport("vmap", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with VMAP {
    def this(xml: Document) = this()
    
    /**
      * An array of VMAPAdBreak objects
      */
    /* CompleteClass */
    var adBreaks: js.Array[VMAPAdBreak] = js.native
    
    /**
      * An array of VMAPExtension objects
      */
    /* CompleteClass */
    var extensions: js.Array[VMAPExtension] = js.native
    
    /**
      * The VMAP version (should be 1.0)
      */
    /* CompleteClass */
    var version: String = js.native
  }
  
  /**
    * VMAP parser
    */
  trait VMAP extends StObject {
    
    /**
      * An array of VMAPAdBreak objects
      */
    var adBreaks: js.Array[VMAPAdBreak]
    
    /**
      * An array of VMAPExtension objects
      */
    var extensions: js.Array[VMAPExtension]
    
    /**
      * The VMAP version (should be 1.0)
      */
    var version: String
  }
  object VMAP {
    
    inline def apply(adBreaks: js.Array[VMAPAdBreak], extensions: js.Array[VMAPExtension], version: String): VMAP = {
      val __obj = js.Dynamic.literal(adBreaks = adBreaks.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VMAP]
    }
    
    extension [Self <: VMAP](x: Self) {
      
      inline def setAdBreaks(value: js.Array[VMAPAdBreak]): Self = StObject.set(x, "adBreaks", value.asInstanceOf[js.Any])
      
      inline def setAdBreaksVarargs(value: VMAPAdBreak*): Self = StObject.set(x, "adBreaks", js.Array(value*))
      
      inline def setExtensions(value: js.Array[VMAPExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: VMAPExtension*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides information about an ad break
    */
  @js.native
  trait VMAPAdBreak extends StObject {
    
    /**
      * A VMAPAdSource object
      */
    var adSource: VMAPAdSource = js.native
    
    /**
      * An optional string identifier for the ad break
      */
    var breakId: js.UndefOr[String] = js.native
    
    /**
      * Identifies whether the ad break allows "linear", "nonlinear" or "display" ads
      */
    var breakType: linear | nonlinear | display = js.native
    
    /**
      * An array of VMAPExtension objects
      */
    var extensions: js.Array[VMAPExtension] = js.native
    
    /**
      * An option used to distribute ad breaks equally spaced apart from one another along a linear timeline
      */
    var repeatAfter: String = js.native
    
    /**
      * Represents the timing of the ad break
      */
    var timeOffset: String = js.native
    
    /**
      * Call the trackers for the given event with an option error code parameter for error events
      */
    def track(event: String): Unit = js.native
    def track(event: String, errorCode: String): Unit = js.native
    
    /**
      * An array of VMAPTrackingEvent objects with tracking URLs
      */
    var trackingEvents: js.Array[VMAPTrackingEvent] = js.native
  }
  
  /**
    * Provides the player with either an inline ad response or a reference to an ad response
    */
  trait VMAPAdSource extends StObject {
    
    /**
      * Contains a URI to the VAST
      */
    var adTagURI: String
    
    /**
      * Indicates whether a VAST ad pod or multple buffet of ads can be served into an ad break
      */
    var allowMultipleAds: Boolean
    
    /**
      * Contains custom ad data
      */
    var customData: Any
    
    /**
      * Indicates whether the video player should honor the redirects within an ad response
      */
    var followRedirects: Boolean
    
    /**
      * Ad identifier for the ad source
      */
    var id: String
    
    /**
      * Contains an embedded VAST response
      */
    var vastAdData: Element
  }
  object VMAPAdSource {
    
    inline def apply(
      adTagURI: String,
      allowMultipleAds: Boolean,
      customData: Any,
      followRedirects: Boolean,
      id: String,
      vastAdData: Element
    ): VMAPAdSource = {
      val __obj = js.Dynamic.literal(adTagURI = adTagURI.asInstanceOf[js.Any], allowMultipleAds = allowMultipleAds.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], followRedirects = followRedirects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], vastAdData = vastAdData.asInstanceOf[js.Any])
      __obj.asInstanceOf[VMAPAdSource]
    }
    
    extension [Self <: VMAPAdSource](x: Self) {
      
      inline def setAdTagURI(value: String): Self = StObject.set(x, "adTagURI", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleAds(value: Boolean): Self = StObject.set(x, "allowMultipleAds", value.asInstanceOf[js.Any])
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVastAdData(value: Element): Self = StObject.set(x, "vastAdData", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides information about VMAP extension
    */
  trait VMAPExtension extends StObject {
    
    /**
      * Object containing all this extension attributes and their name as the key
      */
    var attribute: Any
    
    /**
      * Object containing all this extension children and their name as the key
      */
    var children: Any
    
    /**
      * Object parsed from CDATA or as a fallback all of the text nodes of this extension concatenated
      */
    var value: Any
  }
  object VMAPExtension {
    
    inline def apply(attribute: Any, children: Any, value: Any): VMAPExtension = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VMAPExtension]
    }
    
    extension [Self <: VMAPExtension](x: Self) {
      
      inline def setAttribute(value: Any): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides information about a VMAP tracking event
    */
  trait VMAPTrackingEvent extends StObject {
    
    /**
      * The name of the event to track for the element. Can be one of breakStart, breakEnd or error
      */
    var event: breakStart | breakEnd | error
    
    /**
      * The URI of the tracker
      */
    var uri: String
  }
  object VMAPTrackingEvent {
    
    inline def apply(event: breakStart | breakEnd | error, uri: String): VMAPTrackingEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[VMAPTrackingEvent]
    }
    
    extension [Self <: VMAPTrackingEvent](x: Self) {
      
      inline def setEvent(value: breakStart | breakEnd | error): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
