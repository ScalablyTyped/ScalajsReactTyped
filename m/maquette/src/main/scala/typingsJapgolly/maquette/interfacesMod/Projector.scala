package typingsJapgolly.maquette.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projector extends ProjectorService {
  /**
    * Appends a new child node to the DOM using the result from the provided `renderFunction`.
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param parentNode - The parent node for the new child node.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def append(parentNode: Element, renderFunction: js.Function0[VNode]): Unit
  /**
    * Stops running the `renderFunction` to update the DOM. The `renderFunction` must have been
    * registered using [[append]], [[merge]], [[insertBefore]] or [[replace]].
    *
    * @returns The [[Projection]] which was created using this `renderFunction`.
    * The [[Projection]] contains a reference to the DOM Node that was rendered.
    */
  def detach(renderFunction: js.Function0[VNode]): Projection
  /**
    * Inserts a new DOM node using the result from the provided `renderFunction`.
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param beforeNode - The node that the DOM Node is inserted before.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def insertBefore(beforeNode: Element, renderFunction: js.Function0[VNode]): Unit
  /**
    * Merges a new DOM node using the result from the provided `renderFunction` with an existing DOM Node.
    * This means that the virtual DOM and real DOM have one overlapping element.
    * Therefore the selector for the root [[VNode]] will be ignored, but its properties and children will be applied to the Element provided
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param domNode - The existing element to adopt as the root of the new virtual DOM. Existing attributes and child nodes are preserved.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def merge(domNode: Element, renderFunction: js.Function0[VNode]): Unit
  /**
    * Replaces an existing DOM node with the result from the provided `renderFunction`.
    * The `renderFunction` will be invoked again to update the DOM when needed.
    * @param domNode - The DOM node to replace.
    * @param renderFunction - Function with zero arguments that returns a [[VNode]] tree.
    */
  def replace(domNode: Element, renderFunction: js.Function0[VNode]): Unit
  /**
    * Resumes the projector. Use this method to resume rendering after [[stop]] was called or an error occurred during rendering.
    */
  def resume(): Unit
  /**
    * Stops the projector. This means that the registered `render` functions will not be called anymore.
    *
    * Note that calling [[stop]] is not mandatory. A projector is a passive object that will get garbage collected
    * as usual if it is no longer in scope.
    */
  def stop(): Unit
}

object Projector {
  @scala.inline
  def apply(
    append: (Element, js.Function0[VNode]) => Callback,
    detach: js.Function0[VNode] => CallbackTo[Projection],
    insertBefore: (Element, js.Function0[VNode]) => Callback,
    merge: (Element, js.Function0[VNode]) => Callback,
    renderNow: Callback,
    replace: (Element, js.Function0[VNode]) => Callback,
    resume: Callback,
    scheduleRender: Callback,
    stop: Callback
  ): Projector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: js.Function0[typingsJapgolly.maquette.interfacesMod.VNode]) => append(t0, t1).runNow()))
    __obj.updateDynamic("detach")(js.Any.fromFunction1((t0: js.Function0[typingsJapgolly.maquette.interfacesMod.VNode]) => detach(t0).runNow()))
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: js.Function0[typingsJapgolly.maquette.interfacesMod.VNode]) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("merge")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: js.Function0[typingsJapgolly.maquette.interfacesMod.VNode]) => merge(t0, t1).runNow()))
    __obj.updateDynamic("renderNow")(renderNow.toJsFn)
    __obj.updateDynamic("replace")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: js.Function0[typingsJapgolly.maquette.interfacesMod.VNode]) => replace(t0, t1).runNow()))
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("scheduleRender")(scheduleRender.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Projector]
  }
}

