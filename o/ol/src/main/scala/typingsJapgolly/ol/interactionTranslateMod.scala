package typingsJapgolly.ol

import org.scalajs.dom.UIEvent
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.olStrings.translateend
import typingsJapgolly.ol.olStrings.translatestart
import typingsJapgolly.ol.olStrings.translating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionTranslateMod {
  
  @JSImport("ol/interaction/Translate", JSImport.Default)
  @js.native
  open class default () extends Translate {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/interaction/Translate", "TranslateEvent")
  @js.native
  open class TranslateEvent protected ()
    extends typingsJapgolly.ol.eventsEventMod.default {
    def this(
      `type`: TranslateEventType,
      features: typingsJapgolly.ol.collectionMod.default[
            typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
          ],
      coordinate: Coordinate,
      startCoordinate: Coordinate,
      mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent]
    ) = this()
    
    /**
      * The coordinate of the drag event.
      */
    var coordinate: Coordinate = js.native
    
    /**
      * The features being translated.
      */
    var features: typingsJapgolly.ol.collectionMod.default[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    
    /**
      * Associated {@link module:ol/MapBrowserEvent}.
      */
    var mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent] = js.native
    
    /**
      * The coordinate of the start position before translation started.
      */
    var startCoordinate: Coordinate = js.native
  }
  
  @js.native
  sealed trait TranslateEventType extends StObject
  @JSImport("ol/interaction/Translate", "TranslateEventType")
  @js.native
  object TranslateEventType extends StObject {
    
    @js.native
    sealed trait TRANSLATEEND
      extends StObject
         with TranslateEventType
    
    @js.native
    sealed trait TRANSLATESTART
      extends StObject
         with TranslateEventType
    
    @js.native
    sealed trait TRANSLATING
      extends StObject
         with TranslateEventType
  }
  
  type FilterFunction = js.Function2[
    /* p0 */ FeatureLike, 
    /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
    Boolean
  ]
  
  trait Options extends StObject {
    
    var features: js.UndefOr[
        typingsJapgolly.ol.collectionMod.default[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ]
      ] = js.undefined
    
    var filter: js.UndefOr[FilterFunction] = js.undefined
    
    var hitTolerance: js.UndefOr[Double] = js.undefined
    
    var layers: js.UndefOr[
        (js.Array[
          typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
        ]) | (js.Function1[
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          Boolean
        ])
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFeatures(
        value: typingsJapgolly.ol.collectionMod.default[
              typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
            ]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFilter(
        value: (/* p0 */ FeatureLike, /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHitTolerance(value: Double): Self = StObject.set(x, "hitTolerance", value.asInstanceOf[js.Any])
      
      inline def setHitToleranceUndefined: Self = StObject.set(x, "hitTolerance", js.undefined)
      
      inline def setLayers(
        value: (js.Array[
              typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
            ]) | (js.Function1[
              /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
              Boolean
            ])
      ): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersFunction1(
        value: /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default] => Boolean
      ): Self = StObject.set(x, "layers", js.Any.fromFunction1(value))
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]*): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
  
  @js.native
  trait Translate
    extends typingsJapgolly.ol.interactionPointerMod.default {
    
    /**
      * Returns the Hit-detection tolerance.
      */
    def getHitTolerance(): Double = js.native
    
    @JSName("on")
    def on_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
    
    /**
      * Hit-detection tolerance. Pixels inside the radius around the given position
      * will be checked for features.
      */
    def setHitTolerance(hitTolerance: Double): Unit = js.native
    
    @JSName("un")
    def un_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
  }
}
