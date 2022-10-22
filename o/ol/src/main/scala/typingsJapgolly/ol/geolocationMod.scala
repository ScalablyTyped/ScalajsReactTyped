package typingsJapgolly.ol

import org.scalajs.dom.PositionOptions
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColonaccuracy
import typingsJapgolly.ol.olStrings.changeColonaccuracyGeometry
import typingsJapgolly.ol.olStrings.changeColonaltitude
import typingsJapgolly.ol.olStrings.changeColonaltitudeAccuracy
import typingsJapgolly.ol.olStrings.changeColonheading
import typingsJapgolly.ol.olStrings.changeColonposition
import typingsJapgolly.ol.olStrings.changeColonprojection
import typingsJapgolly.ol.olStrings.changeColonspeed
import typingsJapgolly.ol.olStrings.changeColontracking
import typingsJapgolly.ol.olStrings.changeColontrackingOptions
import typingsJapgolly.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geolocationMod {
  
  @JSImport("ol/Geolocation", JSImport.Default)
  @js.native
  open class default () extends Geolocation {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait Geolocation
    extends typingsJapgolly.ol.objectMod.default {
    
    /**
      * Get the accuracy of the position in meters.
      */
    def getAccuracy(): js.UndefOr[Double] = js.native
    
    /**
      * Get a geometry of the position accuracy.
      */
    def getAccuracyGeometry(): typingsJapgolly.ol.geomPolygonMod.default = js.native
    
    /**
      * Get the altitude associated with the position.
      */
    def getAltitude(): js.UndefOr[Double] = js.native
    
    /**
      * Get the altitude accuracy of the position.
      */
    def getAltitudeAccuracy(): js.UndefOr[Double] = js.native
    
    /**
      * Get the heading as radians clockwise from North.
      * Note: depending on the browser, the heading is only defined if the enableHighAccuracy
      * is set to true in the tracking options.
      */
    def getHeading(): js.UndefOr[Double] = js.native
    
    /**
      * Get the position of the device.
      */
    def getPosition(): js.UndefOr[Coordinate] = js.native
    
    /**
      * Get the projection associated with the position.
      */
    def getProjection(): js.UndefOr[typingsJapgolly.ol.projProjectionMod.default] = js.native
    
    /**
      * Get the speed in meters per second.
      */
    def getSpeed(): js.UndefOr[Double] = js.native
    
    /**
      * Determine if the device location is being tracked.
      */
    def getTracking(): Boolean = js.native
    
    /**
      * Get the tracking options.
      * See http://www.w3.org/TR/geolocation-API/#position-options.
      */
    def getTrackingOptions(): js.UndefOr[PositionOptions] = js.native
    
    @JSName("on")
    def on_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the projection to use for transforming the coordinates.
      */
    def setProjection(projection: ProjectionLike): Unit = js.native
    
    /**
      * Enable or disable tracking.
      */
    def setTracking(tracking: Boolean): Unit = js.native
    
    /**
      * Set the tracking options.
      * See http://www.w3.org/TR/geolocation-API/#position-options.
      */
    def setTrackingOptions(options: PositionOptions): Unit = js.native
    
    @JSName("un")
    def un_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait GeolocationError
    extends typingsJapgolly.ol.eventsEventMod.default {
    
    var code: Double = js.native
    
    var message: String = js.native
  }
  
  trait Options extends StObject {
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var tracking: js.UndefOr[Boolean] = js.undefined
    
    var trackingOptions: js.UndefOr[PositionOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setTracking(value: Boolean): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
      
      inline def setTrackingOptions(value: PositionOptions): Self = StObject.set(x, "trackingOptions", value.asInstanceOf[js.Any])
      
      inline def setTrackingOptionsUndefined: Self = StObject.set(x, "trackingOptions", js.undefined)
      
      inline def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
    }
  }
}
