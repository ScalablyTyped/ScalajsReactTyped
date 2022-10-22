package typingsJapgolly.ol

import org.scalajs.dom.UIEvent
import typingsJapgolly.ol.eventsConditionMod.Condition
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.olStrings.select
import typingsJapgolly.ol.styleStyleMod.Style
import typingsJapgolly.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionSelectMod {
  
  @JSImport("ol/interaction/Select", JSImport.Default)
  @js.native
  open class default () extends Select {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/interaction/Select", "SelectEvent")
  @js.native
  open class SelectEvent protected ()
    extends typingsJapgolly.ol.eventsEventMod.default {
    def this(
      `type`: SelectEventType,
      selected: js.Array[
            typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
          ],
      deselected: js.Array[
            typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
          ],
      mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent]
    ) = this()
    
    /**
      * Deselected features array.
      */
    var deselected: js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    
    /**
      * Associated {@link module:ol/MapBrowserEvent}.
      */
    var mapBrowserEvent: typingsJapgolly.ol.mapBrowserEventMod.default[UIEvent] = js.native
    
    /**
      * Selected features array.
      */
    var selected: js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
  }
  
  @js.native
  sealed trait SelectEventType extends StObject
  @JSImport("ol/interaction/Select", "SelectEventType")
  @js.native
  object SelectEventType extends StObject {
    
    @js.native
    sealed trait SELECT
      extends StObject
         with SelectEventType
  }
  
  type FilterFunction = js.Function2[
    /* p0 */ FeatureLike, 
    /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
    Boolean
  ]
  
  trait Options extends StObject {
    
    var addCondition: js.UndefOr[Condition] = js.undefined
    
    var condition: js.UndefOr[Condition] = js.undefined
    
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
    
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var removeCondition: js.UndefOr[Condition] = js.undefined
    
    var style: js.UndefOr[StyleLike | Null] = js.undefined
    
    var toggleCondition: js.UndefOr[Condition] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddCondition(value: Condition): Self = StObject.set(x, "addCondition", value.asInstanceOf[js.Any])
      
      inline def setAddConditionUndefined: Self = StObject.set(x, "addCondition", js.undefined)
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
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
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setRemoveCondition(value: Condition): Self = StObject.set(x, "removeCondition", value.asInstanceOf[js.Any])
      
      inline def setRemoveConditionUndefined: Self = StObject.set(x, "removeCondition", js.undefined)
      
      inline def setStyle(value: StyleLike): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Style*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setToggleCondition(value: Condition): Self = StObject.set(x, "toggleCondition", value.asInstanceOf[js.Any])
      
      inline def setToggleConditionUndefined: Self = StObject.set(x, "toggleCondition", js.undefined)
    }
  }
  
  @js.native
  trait Select
    extends typingsJapgolly.ol.interactionInteractionMod.default {
    
    /**
      * Get the selected features.
      */
    def getFeatures(): typingsJapgolly.ol.collectionMod.default[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    
    /**
      * Returns the Hit-detection tolerance.
      */
    def getHitTolerance(): Double = js.native
    
    /**
      * Returns the associated {@link module:ol/layer/Vector~Vector vectorlayer} of
      * the (last) selected feature. Note that this will not work with any
      * programmatic method like pushing features to
      * {@link module:ol/interaction/Select~Select#getFeatures collection}.
      */
    def getLayer(feature: FeatureLike): typingsJapgolly.ol.layerVectorMod.default = js.native
    
    def getStyle(): StyleLike | Null = js.native
    
    @JSName("on")
    def on_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): EventsKey = js.native
    
    /**
      * Hit-detection tolerance. Pixels inside the radius around the given position
      * will be checked for features.
      */
    def setHitTolerance(hitTolerance: Double): Unit = js.native
    
    @JSName("un")
    def un_select(`type`: select, listener: js.Function1[/* evt */ SelectEvent, Unit]): Unit = js.native
  }
}
