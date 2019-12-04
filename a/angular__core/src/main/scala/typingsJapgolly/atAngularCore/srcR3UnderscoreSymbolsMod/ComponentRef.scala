package typingsJapgolly.atAngularCore.srcR3UnderscoreSymbolsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a component created by a `ComponentFactory`.
  * Provides access to the component instance and related objects,
  * and provides the means of destroying the instance.
  *
  * @publicApi
  */
trait ComponentRef[C] extends js.Object {
  /**
    * The change detector for this component instance.
    */
  val changeDetectorRef: ChangeDetectorRef
  /**
    * The type of this component (as created by a `ComponentFactory` class).
    */
  val componentType: Type[_]
  /**
    * The [host view](guide/glossary#view-tree) defined by the template
    * for this component instance.
    */
  val hostView: ViewRef
  /**
    * The [dependency injector](guide/glossary#injector) for this component instance.
    */
  val injector: Injector
  /**
    * This component instance.
    */
  val instance: C
  /**
    * The host or anchor [element](guide/glossary#element) for this component instance.
    */
  val location: ElementRef[_]
  /**
    * Destroys the component instance and all of the data structures associated with it.
    */
  def destroy(): Unit
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for the component.
    * @param callback A handler function that cleans up developer-defined data
    * associated with this component. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): Unit
}

object ComponentRef {
  @scala.inline
  def apply[C](
    changeDetectorRef: ChangeDetectorRef,
    componentType: Type[_],
    destroy: Callback,
    hostView: ViewRef,
    injector: Injector,
    instance: C,
    location: ElementRef[_],
    onDestroy: js.Function => Callback
  ): ComponentRef[C] = {
    val __obj = js.Dynamic.literal(changeDetectorRef = changeDetectorRef.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], hostView = hostView.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("onDestroy")(js.Any.fromFunction1((t0: js.Function) => onDestroy(t0).runNow()))
    __obj.asInstanceOf[ComponentRef[C]]
  }
}

