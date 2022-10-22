package typingsJapgolly.ol

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DragEvent
import org.scalajs.dom.File
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.olStrings.addfeatures
import typingsJapgolly.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragAndDropMod {
  
  @JSImport("ol/interaction/DragAndDrop", JSImport.Default)
  @js.native
  open class default () extends DragAndDrop {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/interaction/DragAndDrop", "DragAndDropEvent")
  @js.native
  open class DragAndDropEvent protected ()
    extends typingsJapgolly.ol.eventsEventMod.default {
    def this(`type`: DragAndDropEventType, file: File) = this()
    def this(
      `type`: DragAndDropEventType,
      file: File,
      opt_features: js.Array[
            typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
          ]
    ) = this()
    def this(
      `type`: DragAndDropEventType,
      file: File,
      opt_features: js.Array[
            typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
          ],
      opt_projection: typingsJapgolly.ol.projProjectionMod.default
    ) = this()
    def this(
      `type`: DragAndDropEventType,
      file: File,
      opt_features: Unit,
      opt_projection: typingsJapgolly.ol.projProjectionMod.default
    ) = this()
    
    /**
      * The features parsed from dropped data.
      */
    var features: js.Array[FeatureLike] = js.native
    
    /**
      * The dropped file.
      */
    var file: File = js.native
    
    /**
      * The feature projection.
      */
    var projection: typingsJapgolly.ol.projProjectionMod.default = js.native
  }
  
  @js.native
  sealed trait DragAndDropEventType extends StObject
  @JSImport("ol/interaction/DragAndDrop", "DragAndDropEventType")
  @js.native
  object DragAndDropEventType extends StObject {
    
    @js.native
    sealed trait ADD_FEATURES
      extends StObject
         with DragAndDropEventType
  }
  
  @js.native
  trait DragAndDrop
    extends typingsJapgolly.ol.interactionInteractionMod.default {
    
    def handleDrop(event: DragEvent): Unit = js.native
    
    def handleStop(event: DragEvent): Unit = js.native
    
    @JSName("on")
    def on_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
    
    @JSName("un")
    def un_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var formatConstructors: js.UndefOr[
        js.Array[
          Instantiable0[typingsJapgolly.ol.formatFeatureMod.default] | typingsJapgolly.ol.formatFeatureMod.default
        ]
      ] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var source: js.UndefOr[
        typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.undefined
    
    var target: js.UndefOr[HTMLElement] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFormatConstructors(
        value: js.Array[
              Instantiable0[typingsJapgolly.ol.formatFeatureMod.default] | typingsJapgolly.ol.formatFeatureMod.default
            ]
      ): Self = StObject.set(x, "formatConstructors", value.asInstanceOf[js.Any])
      
      inline def setFormatConstructorsUndefined: Self = StObject.set(x, "formatConstructors", js.undefined)
      
      inline def setFormatConstructorsVarargs(
        value: (Instantiable0[typingsJapgolly.ol.formatFeatureMod.default] | typingsJapgolly.ol.formatFeatureMod.default)*
      ): Self = StObject.set(x, "formatConstructors", js.Array(value*))
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setSource(value: typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geomGeometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
