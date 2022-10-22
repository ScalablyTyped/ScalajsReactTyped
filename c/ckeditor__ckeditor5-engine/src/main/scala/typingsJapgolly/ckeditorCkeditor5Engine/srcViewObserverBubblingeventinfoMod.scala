package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.Node
import org.scalajs.dom.Window
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.atTarget
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.bubbling
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.capturing
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverBubblingeventinfoMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/bubblingeventinfo", JSImport.Default)
  @js.native
  open class default[S /* <: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any) | Node | Window */] protected ()
    extends StObject
       with BubblingEventInfo[S] {
    def this(
      source: S,
      name: String,
      startRange: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default
    ) = this()
    
    /**
      * The current bubbling target.
      */
    /* CompleteClass */
    override val currentTarget: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null = js.native
    
    /**
      * The current event phase.
      */
    /* CompleteClass */
    override val eventPhase: none | capturing | atTarget | bubbling = js.native
    
    /**
      * The view range that the bubbling should start from.
      */
    /* CompleteClass */
    override val startRange: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo * / any */ trait BubblingEventInfo[S /* <: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any) | Node | Window */] extends StObject {
    
    /**
      * The current bubbling target.
      */
    val currentTarget: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null
    
    /**
      * The current event phase.
      */
    val eventPhase: none | capturing | atTarget | bubbling
    
    /**
      * The view range that the bubbling should start from.
      */
    val startRange: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default
  }
  object BubblingEventInfo {
    
    inline def apply[S /* <: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any) | Node | Window */](
      eventPhase: none | capturing | atTarget | bubbling,
      startRange: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default
    ): BubblingEventInfo[S] = {
      val __obj = js.Dynamic.literal(eventPhase = eventPhase.asInstanceOf[js.Any], startRange = startRange.asInstanceOf[js.Any], currentTarget = null)
      __obj.asInstanceOf[BubblingEventInfo[S]]
    }
    
    extension [Self <: BubblingEventInfo[?], S /* <: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any) | Node | Window */](x: Self & BubblingEventInfo[S]) {
      
      inline def setCurrentTarget(
        value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default
      ): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      inline def setEventPhase(value: none | capturing | atTarget | bubbling): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setStartRange(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default): Self = StObject.set(x, "startRange", value.asInstanceOf[js.Any])
    }
  }
}
