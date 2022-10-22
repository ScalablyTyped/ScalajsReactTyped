package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.srcViewViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverMutationobserverMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/mutationobserver", JSImport.Default)
  @js.native
  open class default () extends MutationObserver
  
  trait MutatedChildren extends StObject {
    
    var newChildren: js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    
    var node: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    
    var oldChildren: js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    
    var `type`: String
  }
  object MutatedChildren {
    
    inline def apply(
      newChildren: js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default],
      node: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default,
      oldChildren: js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default],
      `type`: String
    ): MutatedChildren = {
      val __obj = js.Dynamic.literal(newChildren = newChildren.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldChildren = oldChildren.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutatedChildren]
    }
    
    extension [Self <: MutatedChildren](x: Self) {
      
      inline def setNewChildren(value: js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default]): Self = StObject.set(x, "newChildren", value.asInstanceOf[js.Any])
      
      inline def setNewChildrenVarargs(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default*): Self = StObject.set(x, "newChildren", js.Array(value*))
      
      inline def setNode(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOldChildren(value: js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default]): Self = StObject.set(x, "oldChildren", value.asInstanceOf[js.Any])
      
      inline def setOldChildrenVarargs(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default*): Self = StObject.set(x, "oldChildren", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MutatedText extends StObject {
    
    var newText: String
    
    var node: typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default
    
    var oldText: String
    
    var `type`: String
  }
  object MutatedText {
    
    inline def apply(
      newText: String,
      node: typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default,
      oldText: String,
      `type`: String
    ): MutatedText = {
      val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutatedText]
    }
    
    extension [Self <: MutatedText](x: Self) {
      
      inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      inline def setNode(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MutationObserver
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcViewObserverObserverMod.default[View] {
    
    /**
      * Reference to the {@link module:engine/view/view~View#domConverter}.
      */
    val domConverter: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default = js.native
    
    /**
      * Synchronously fires {@link module:engine/view/document~Document#event:mutations} event with all mutations in record queue.
      * At the same time empties the queue so mutations will not be fired twice.
      */
    def flush(): Unit = js.native
    
    /**
      * Reference to the {@link module:engine/view/view~View#_renderer}.
      */
    val renderer: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRendererMod.default = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5EngineSrcViewViewAugmentingMod {
    
    trait Observers extends StObject {
      
      var MutationObserver: org.scalajs.dom.MutationObserver
    }
    object Observers {
      
      inline def apply(MutationObserver: org.scalajs.dom.MutationObserver): Observers = {
        val __obj = js.Dynamic.literal(MutationObserver = MutationObserver.asInstanceOf[js.Any])
        __obj.asInstanceOf[Observers]
      }
      
      extension [Self <: Observers](x: Self) {
        
        inline def setMutationObserver(value: org.scalajs.dom.MutationObserver): Self = StObject.set(x, "MutationObserver", value.asInstanceOf[js.Any])
      }
    }
  }
}
