package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.Callback
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewViewMod.View
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.Record
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewObserverDomeventdataMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/observer/domeventdata", JSImport.Default)
  @js.native
  open class default[V /* <: View */, K /* <: InputEvent | ClipboardEvent | TransitionEvent | AnimationEvent | CompositionEvent | FormDataEvent | WheelEvent | ErrorEvent | DragEvent | KeyboardEvent | MouseEvent | SubmitEvent | UIEvent | PointerEvent | TouchEvent | FocusEvent | Event | ProgressEvent | SecurityPolicyViolationEvent */, L /* <: /* keyof K */ String */] protected ()
    extends StObject
       with DomEventData[V, K, L] {
    def this(view: View, domEvent: K) = this()
    def this(
      view: View,
      domEvent: K,
      additionalData: Record[
            L, 
            /* import warning: importer.ImportType#apply Failed type conversion: K[L] */ js.Any
          ]
    ) = this()
    
    /**
      * The instance of the document.
      */
    /* CompleteClass */
    override val document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default = js.native
    
    /**
      * The DOM event.
      */
    /* CompleteClass */
    override val domEvent: K = js.native
    
    /**
      * The DOM target.
      */
    /* CompleteClass */
    override val domTarget: /* import warning: importer.ImportType#apply Failed type conversion: K['target'] */ js.Any = js.native
    
    /**
      * Prevents the native's event default action.
      */
    /* CompleteClass */
    override def preventDefault(): Unit = js.native
    
    /**
      * Stops native event propagation.
      */
    /* CompleteClass */
    override def stopPropagation(): Unit = js.native
    
    /**
      * The tree view element representing the target.
      */
    /* CompleteClass */
    override val target: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    
    /**
      * Instance of the view controller.
      */
    /* CompleteClass */
    override val view: V = js.native
  }
  
  trait DomEventData[V /* <: View */, K /* <: InputEvent | ClipboardEvent | TransitionEvent | AnimationEvent | CompositionEvent | FormDataEvent | WheelEvent | ErrorEvent | DragEvent | KeyboardEvent | MouseEvent | SubmitEvent | UIEvent | PointerEvent | TouchEvent | FocusEvent | Event | ProgressEvent | SecurityPolicyViolationEvent */, L /* <: /* keyof K */ String */] extends StObject {
    
    /**
      * The instance of the document.
      */
    val document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default
    
    /**
      * The DOM event.
      */
    val domEvent: K
    
    /**
      * The DOM target.
      */
    val domTarget: /* import warning: importer.ImportType#apply Failed type conversion: K['target'] */ js.Any
    
    /**
      * Prevents the native's event default action.
      */
    def preventDefault(): Unit
    
    /**
      * Stops native event propagation.
      */
    def stopPropagation(): Unit
    
    /**
      * The tree view element representing the target.
      */
    val target: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    
    /**
      * Instance of the view controller.
      */
    val view: V
  }
  object DomEventData {
    
    inline def apply[V /* <: View */, K /* <: InputEvent | ClipboardEvent | TransitionEvent | AnimationEvent | CompositionEvent | FormDataEvent | WheelEvent | ErrorEvent | DragEvent | KeyboardEvent | MouseEvent | SubmitEvent | UIEvent | PointerEvent | TouchEvent | FocusEvent | Event | ProgressEvent | SecurityPolicyViolationEvent */, L /* <: /* keyof K */ String */](
      document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default,
      domEvent: K,
      domTarget: /* import warning: importer.ImportType#apply Failed type conversion: K['target'] */ js.Any,
      preventDefault: Callback,
      stopPropagation: Callback,
      target: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default,
      view: V
    ): DomEventData[V, K, L] = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], domEvent = domEvent.asInstanceOf[js.Any], domTarget = domTarget.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEventData[V, K, L]]
    }
    
    extension [Self <: DomEventData[?, ?, ?], V /* <: View */, K /* <: InputEvent | ClipboardEvent | TransitionEvent | AnimationEvent | CompositionEvent | FormDataEvent | WheelEvent | ErrorEvent | DragEvent | KeyboardEvent | MouseEvent | SubmitEvent | UIEvent | PointerEvent | TouchEvent | FocusEvent | Event | ProgressEvent | SecurityPolicyViolationEvent */, L /* <: /* keyof K */ String */](x: Self & (DomEventData[V, K, L])) {
      
      inline def setDocument(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDomEvent(value: K): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setDomTarget(value: /* import warning: importer.ImportType#apply Failed type conversion: K['target'] */ js.Any): Self = StObject.set(x, "domTarget", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTarget(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setView(value: V): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
