package typingsJapgolly.materialBase

import org.scalajs.dom.raw.Element
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  trait MDCComponent[A, F /* <: typingsJapgolly.materialBase.foundationMod.default[A] */] extends js.Object {
    // Subclasses may implement this method to release any resources / deregister any listeners they have
    // attached. An example of this might be deregistering a resize event from the window object.
    def destroy(): Unit = js.native
    /**
      * Fires a cross-browser-compatible custom event from the component root of the given type,
      * with the given data.
      */
    def emit(evtType: String, evtData: js.Any): Unit = js.native
    def emit(evtType: String, evtData: js.Any, shouldBubble: Boolean): Unit = js.native
    // Subclasses must override this method to return a properly configured foundation class for the
    // component.
    def getDefaultFoundation(): F = js.native
    // Subclasses should override this method if they need to perform work to synchronize with a host DOM
    // object. An example of this would be a form control wrapper that needs to synchronize its internal state
    // to some property or attribute of the host DOM. Please note: this is *not* the place to perform DOM
    // reads/writes that would cause layout / paint, as this is called synchronously from within the constructor.
    def initialSyncWithDOM(): Unit = js.native
    // Subclasses can override this to do any additional setup work that would be considered part of a
    // "constructor". Essentially, it is a hook into the parent constructor before the foundation is
    // initialized. Any additional arguments besides root and foundation will be passed in here.
    def initialize(args: js.Any*): Unit = js.native
    /**
      * Wrapper method to add an event listener to the component's root element. This is most useful when
      * listening for custom events.
      */
    def listen(evtType: String, handler: EventListener): Unit = js.native
    /**
      * Wrapper method to remove an event listener to the component's root element. This is most useful when
      * unlistening for custom events.
      */
    def unlisten(evtType: String, handler: EventListener): Unit = js.native
  }
  
  @js.native
  class default[A, F /* <: typingsJapgolly.materialBase.foundationMod.default[A] */] protected () extends MDCComponent[A, F] {
    def this(root: Element) = this()
    def this(root: Element, foundation: F, args: js.Any*) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def attachTo(root: Element): MDCComponent[_, typingsJapgolly.materialBase.foundationMod.default[_]] = js.native
  }
  
}

