package typingsJapgolly.clipboard

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Base class which takes one or more elements, adds event listeners to them,
    * and instantiates a new `ClipboardAction` on each click.
    */
  @JSImport("clipboard", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ClipboardJS {
    def this(selector: String) = this()
    def this(selector: Element) = this()
    def this(selector: NodeList[Element & Node]) = this()
    def this(selector: String, options: Options) = this()
    def this(selector: Element, options: Options) = this()
    def this(selector: NodeList[Element & Node], options: Options) = this()
  }
  @JSImport("clipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fires a copy action
    */
  /* static member */
  inline def copy(target: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def copy(target: String, options: CopyActionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def copy(target: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def copy(target: Element, options: CopyActionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Fires a cut action
    */
  /* static member */
  inline def cut(target: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cut(target: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cut")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Checks if clipboard.js is supported
    */
  /* static member */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.clipboard.clipboardStrings.cut
    - typingsJapgolly.clipboard.clipboardStrings.copy
  */
  trait Action extends StObject
  object Action {
    
    inline def copy: typingsJapgolly.clipboard.clipboardStrings.copy = "copy".asInstanceOf[typingsJapgolly.clipboard.clipboardStrings.copy]
    
    inline def cut: typingsJapgolly.clipboard.clipboardStrings.cut = "cut".asInstanceOf[typingsJapgolly.clipboard.clipboardStrings.cut]
  }
  
  /**
    * Base class which takes one or more elements, adds event listeners to them,
    * and instantiates a new `ClipboardAction` on each click.
    */
  @js.native
  trait ClipboardJS extends StObject {
    
    /**
      * Clears all event bindings.
      */
    def destroy(): Unit = js.native
    
    def on(`type`: String, handler: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    /**
      * Subscribes to events that indicate the result of a copy/cut operation.
      * @param type Event type ('success' or 'error').
      * @param handler Callback function.
      */
    def on(`type`: Response, handler: js.Function1[/* e */ Event, Unit]): this.type = js.native
  }
  
  trait CopyActionOptions extends StObject {
    
    var container: js.UndefOr[Element] = js.undefined
  }
  object CopyActionOptions {
    
    inline def apply(): CopyActionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyActionOptions]
    }
    
    extension [Self <: CopyActionOptions](x: Self) {
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var action: String
    
    def clearSelection(): Unit
    
    var text: String
    
    var trigger: Element
  }
  object Event {
    
    inline def apply(action: String, clearSelection: Callback, text: String, trigger: Element): Event = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], clearSelection = clearSelection.toJsFn, text = text.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setClearSelection(value: Callback): Self = StObject.set(x, "clearSelection", value.toJsFn)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTrigger(value: Element): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Overwrites default command ('cut' or 'copy').
      * @param elem Current element
      */
    var action: js.UndefOr[js.Function1[/* elem */ Element, Action]] = js.undefined
    
    /**
      * For use in Bootstrap Modals or with any
      * other library that changes the focus
      * you'll want to set the focused element
      * as the container value.
      */
    var container: js.UndefOr[Element] = js.undefined
    
    /**
      * Overwrites default target input element.
      * @param elem Current element
      * @returns <input> element to use.
      */
    var target: js.UndefOr[js.Function1[/* elem */ Element, Element]] = js.undefined
    
    /**
      * Returns the explicit text to copy.
      * @param elem Current element
      * @returns Text to be copied.
      */
    var text: js.UndefOr[js.Function1[/* elem */ Element, String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAction(value: /* elem */ Element => Action): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setTarget(value: /* elem */ Element => Element): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: /* elem */ Element => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.clipboard.clipboardStrings.success
    - typingsJapgolly.clipboard.clipboardStrings.error
  */
  trait Response extends StObject
  object Response {
    
    inline def error: typingsJapgolly.clipboard.clipboardStrings.error = "error".asInstanceOf[typingsJapgolly.clipboard.clipboardStrings.error]
    
    inline def success: typingsJapgolly.clipboard.clipboardStrings.success = "success".asInstanceOf[typingsJapgolly.clipboard.clipboardStrings.success]
  }
}
