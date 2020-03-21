package typingsJapgolly.maquette.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.maquette.PartialCSSStyleDeclaratio
import typingsJapgolly.maquette.maquetteStrings.`HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeProperties
  extends /**
  * Everything that is not explicitly listed (properties and attributes that are either uncommon or custom).
  */
/* index */ StringDictionary[js.Any] {
  val accessKey: js.UndefOr[String] = js.undefined
  val action: js.UndefOr[String] = js.undefined
  /**
    * Callback that is executed after this node is added to the DOM. Child nodes and properties have
    * already been applied.
    * @param element - The element that was added to the DOM.
    * @param projectionOptions - The projection options that were used, see [[createProjector]].
    * @param vnodeSelector - The selector passed to the [[h]] function.
    * @param properties - The properties passed to the [[h]] function.
    * @param children - The children that were created.
    */
  var afterCreate: js.UndefOr[
    js.Function5[
      /* element */ Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ String, 
      /* properties */ this.type, 
      /* children */ js.UndefOr[js.Array[VNode]], 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback that is called when a node has been removed from the tree.
    * The callback is called during idle state or after a timeout (fallback).
    * {@link https://maquettejs.org/docs/dom-node-removal.html|More info}
    * @param element - The element that has been removed from the DOM.
    */
  var afterRemoved: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
  /**
    * Callback that is executed every time this node may have been updated. Child nodes and properties
    * have already been updated.
    * @param element - The element that may have been updated in the DOM.
    * @param projectionOptions - The projection options that were used, see [[createProjector]].
    * @param vnodeSelector - The selector passed to the [[h]] function.
    * @param properties - The properties passed to the [[h]] function.
    * @param children - The children for this node.
    */
  var afterUpdate: js.UndefOr[
    js.Function5[
      /* element */ Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ String, 
      /* properties */ this.type, 
      /* children */ js.UndefOr[js.Array[VNode]], 
      Unit
    ]
  ] = js.undefined
  val alt: js.UndefOr[String] = js.undefined
  val autocomplete: js.UndefOr[String] = js.undefined
  /**
    * When specified, the event handlers will be invoked with 'this' pointing to the value.
    * This is useful when using the prototype/class based implementation of MaquetteComponents.
    *
    * When no [[key]] is present, this object is also used to uniquely identify a DOM node.
    */
  val bind: js.UndefOr[js.Object] = js.undefined
  val checked: js.UndefOr[Boolean] = js.undefined
  val `class`: js.UndefOr[String] = js.undefined
  /**
    * Do not use className, use class instead
    */
  val className: js.UndefOr[
    `HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`
  ] = js.undefined
  /**
    * An object literal like `{important:true}` which allows css classes, like `important` to be added and removed
    * dynamically.
    */
  val classes: js.UndefOr[StringDictionary[js.UndefOr[Boolean | Null]]] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val draggable: js.UndefOr[Boolean] = js.undefined
  val encoding: js.UndefOr[String] = js.undefined
  val enctype: js.UndefOr[String] = js.undefined
  /**
    * The animation to perform when this node is added to an already existing parent.
    * {@link http://maquettejs.org/docs/animations.html|More about animations}.
    * @param element - Element that was just added to the DOM.
    * @param properties - The properties object that was supplied to the [[h]] method
    */
  var enterAnimation: js.UndefOr[
    js.Function2[/* element */ Element, /* properties */ js.UndefOr[VNodeProperties], Unit]
  ] = js.undefined
  /**
    * The animation to perform when this node is removed while its parent remains.
    * @param element - Element that ought to be removed from to the DOM.
    * @param removeElement - Function that removes the element from the DOM.
    * This argument is provided purely for convenience.
    * You may use this function to remove the element when the animation is done.
    * @param properties - The properties object that was supplied to the [[h]] method that rendered this [[VNode]] the previous time.
    */
  var exitAnimation: js.UndefOr[
    js.Function3[
      /* element */ Element, 
      /* removeElement */ js.Function0[Unit], 
      /* properties */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.undefined
  val href: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  /**
    * Puts a non-interactive string of html inside the DOM node.
    *
    * Note: if you use innerHTML, maquette cannot protect you from XSS vulnerabilities and you must make sure that the innerHTML value is safe.
    */
  val innerHTML: js.UndefOr[String] = js.undefined
  /**
    * Used to uniquely identify a DOM node among siblings.
    * A key is required when there are more children with the same selector and these children are added or removed dynamically.
    * NOTE: this does not have to be a string or number, a [[MaquetteComponent]] Object for instance is also common.
    */
  val key: js.UndefOr[js.Object] = js.undefined
  val method: js.UndefOr[String] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  var onblur: js.UndefOr[js.Function1[/* ev */ FocusEvent, Boolean | Unit]] = js.undefined
  var onchange: js.UndefOr[js.Function1[/* ev */ Event_, Boolean | Unit]] = js.undefined
  var onclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.undefined
  var ondblclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.undefined
  var ondrag: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.undefined
  var ondragend: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.undefined
  var ondragenter: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.undefined
  var ondragleave: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.undefined
  var ondragover: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.undefined
  var ondragstart: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.undefined
  var ondrop: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.undefined
  var onfocus: js.UndefOr[js.Function1[/* ev */ FocusEvent, Boolean | Unit]] = js.undefined
  var oninput: js.UndefOr[js.Function1[/* ev */ Event_, Boolean | Unit]] = js.undefined
  var onkeydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.undefined
  var onkeypress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.undefined
  var onkeyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.undefined
  var onload: js.UndefOr[js.Function1[/* ev */ Event_, Boolean | Unit]] = js.undefined
  var onmousedown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.undefined
  var onmouseenter: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.undefined
  var onmouseleave: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.undefined
  var onmousemove: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.undefined
  var onmouseout: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.undefined
  var onmouseover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.undefined
  var onmouseup: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.undefined
  var onmousewheel: js.UndefOr[js.Function1[/* ev */ WheelEvent | WheelEvent, Boolean | Unit]] = js.undefined
  var onscroll: js.UndefOr[js.Function1[/* ev */ UIEvent, Boolean | Unit]] = js.undefined
  var onsubmit: js.UndefOr[js.Function1[/* ev */ Event_, Boolean | Unit]] = js.undefined
  var ontouchcancel: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.undefined
  var ontouchend: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.undefined
  var ontouchmove: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.undefined
  var ontouchstart: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val readOnly: js.UndefOr[Boolean] = js.undefined
  val rel: js.UndefOr[String] = js.undefined
  val spellcheck: js.UndefOr[Boolean] = js.undefined
  val src: js.UndefOr[String] = js.undefined
  val srcset: js.UndefOr[String] = js.undefined
  /**
    * An object literal like `{height:'100px'}` which allows styles to be changed dynamically. All values must be strings.
    */
  val styles: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  val tabIndex: js.UndefOr[Double] = js.undefined
  val target: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[String] = js.undefined
  /**
    * The animation to perform when the properties of this node change.
    * This also includes attributes, styles, css classes. This callback is also invoked when node contains only text and that text changes.
    * {@link http://maquettejs.org/docs/animations.html|More about animations}.
    * @param element - Element that was modified in the DOM.
    * @param properties - The last properties object that was supplied to the [[h]] method
    * @param previousProperties - The previous properties object that was supplied to the [[h]] method
    */
  var updateAnimation: js.UndefOr[
    js.Function3[
      /* element */ Element, 
      /* properties */ js.UndefOr[this.type], 
      /* previousProperties */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.undefined
  val value: js.UndefOr[String] = js.undefined
}

object VNodeProperties {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Everything that is not explicitly listed (properties and attributes that are either uncommon or custom).
    */
  /* index */ StringDictionary[js.Any] = null,
    accessKey: String = null,
    action: String = null,
    afterCreate: (/* element */ Element, /* projectionOptions */ ProjectionOptions, /* vnodeSelector */ String, VNodeProperties, /* children */ js.UndefOr[js.Array[VNode]]) => Callback = null,
    afterRemoved: /* element */ Element => Callback = null,
    afterUpdate: (/* element */ Element, /* projectionOptions */ ProjectionOptions, /* vnodeSelector */ String, VNodeProperties, /* children */ js.UndefOr[js.Array[VNode]]) => Callback = null,
    alt: String = null,
    autocomplete: String = null,
    bind: js.Object = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    `class`: String = null,
    className: scala.Nothing | (`HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`) = null,
    classes: StringDictionary[js.UndefOr[Boolean | Null]] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    enctype: String = null,
    enterAnimation: (/* element */ Element, /* properties */ js.UndefOr[VNodeProperties]) => Callback = null,
    exitAnimation: (/* element */ Element, /* removeElement */ js.Function0[Unit], /* properties */ js.UndefOr[VNodeProperties]) => Callback = null,
    href: String = null,
    id: String = null,
    innerHTML: String = null,
    key: js.Object = null,
    method: String = null,
    name: String = null,
    onblur: /* ev */ FocusEvent => CallbackTo[Boolean | Unit] = null,
    onchange: /* ev */ Event_ => CallbackTo[Boolean | Unit] = null,
    onclick: /* ev */ MouseEvent => CallbackTo[Boolean | Unit] = null,
    ondblclick: /* ev */ MouseEvent => CallbackTo[Boolean | Unit] = null,
    ondrag: /* ev */ DragEvent => CallbackTo[Boolean | Unit] = null,
    ondragend: /* ev */ DragEvent => CallbackTo[Boolean | Unit] = null,
    ondragenter: /* ev */ DragEvent => CallbackTo[Boolean | Unit] = null,
    ondragleave: /* ev */ DragEvent => CallbackTo[Boolean | Unit] = null,
    ondragover: /* ev */ DragEvent => CallbackTo[Boolean | Unit] = null,
    ondragstart: /* ev */ DragEvent => CallbackTo[Boolean | Unit] = null,
    ondrop: /* ev */ DragEvent => CallbackTo[Boolean | Unit] = null,
    onfocus: /* ev */ FocusEvent => CallbackTo[Boolean | Unit] = null,
    oninput: /* ev */ Event_ => CallbackTo[Boolean | Unit] = null,
    onkeydown: /* ev */ KeyboardEvent => CallbackTo[Boolean | Unit] = null,
    onkeypress: /* ev */ KeyboardEvent => CallbackTo[Boolean | Unit] = null,
    onkeyup: /* ev */ KeyboardEvent => CallbackTo[Boolean | Unit] = null,
    onload: /* ev */ Event_ => CallbackTo[Boolean | Unit] = null,
    onmousedown: /* ev */ MouseEvent => CallbackTo[Boolean | Unit] = null,
    onmouseenter: /* ev */ MouseEvent => CallbackTo[Boolean | Unit] = null,
    onmouseleave: /* ev */ MouseEvent => CallbackTo[Boolean | Unit] = null,
    onmousemove: /* ev */ MouseEvent => CallbackTo[Boolean | Unit] = null,
    onmouseout: /* ev */ MouseEvent => CallbackTo[Boolean | Unit] = null,
    onmouseover: /* ev */ MouseEvent => CallbackTo[Boolean | Unit] = null,
    onmouseup: /* ev */ MouseEvent => CallbackTo[Boolean | Unit] = null,
    onmousewheel: /* ev */ WheelEvent | WheelEvent => CallbackTo[Boolean | Unit] = null,
    onscroll: /* ev */ UIEvent => CallbackTo[Boolean | Unit] = null,
    onsubmit: /* ev */ Event_ => CallbackTo[Boolean | Unit] = null,
    ontouchcancel: /* ev */ TouchEvent => CallbackTo[Boolean | Unit] = null,
    ontouchend: /* ev */ TouchEvent => CallbackTo[Boolean | Unit] = null,
    ontouchmove: /* ev */ TouchEvent => CallbackTo[Boolean | Unit] = null,
    ontouchstart: /* ev */ TouchEvent => CallbackTo[Boolean | Unit] = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rel: String = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    srcset: String = null,
    styles: PartialCSSStyleDeclaratio = null,
    tabIndex: Int | Double = null,
    target: String = null,
    title: String = null,
    `type`: String = null,
    updateAnimation: (/* element */ Element, /* properties */ js.UndefOr[VNodeProperties], /* previousProperties */ js.UndefOr[VNodeProperties]) => Callback = null,
    value: String = null
  ): VNodeProperties = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(js.Any.fromFunction5((t0: /* element */ org.scalajs.dom.raw.Element, t1: /* projectionOptions */ typingsJapgolly.maquette.interfacesMod.ProjectionOptions, t2: /* vnodeSelector */ java.lang.String, t3: typingsJapgolly.maquette.interfacesMod.VNodeProperties, t4: /* children */ js.UndefOr[js.Array[typingsJapgolly.maquette.interfacesMod.VNode]]) => afterCreate(t0, t1, t2, t3, t4).runNow()))
    if (afterRemoved != null) __obj.updateDynamic("afterRemoved")(js.Any.fromFunction1((t0: /* element */ org.scalajs.dom.raw.Element) => afterRemoved(t0).runNow()))
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(js.Any.fromFunction5((t0: /* element */ org.scalajs.dom.raw.Element, t1: /* projectionOptions */ typingsJapgolly.maquette.interfacesMod.ProjectionOptions, t2: /* vnodeSelector */ java.lang.String, t3: typingsJapgolly.maquette.interfacesMod.VNodeProperties, t4: /* children */ js.UndefOr[js.Array[typingsJapgolly.maquette.interfacesMod.VNode]]) => afterUpdate(t0, t1, t2, t3, t4).runNow()))
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (enctype != null) __obj.updateDynamic("enctype")(enctype.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element, t1: /* properties */ js.UndefOr[typingsJapgolly.maquette.interfacesMod.VNodeProperties]) => enterAnimation(t0, t1).runNow()))
    if (exitAnimation != null) __obj.updateDynamic("exitAnimation")(js.Any.fromFunction3((t0: /* element */ org.scalajs.dom.raw.Element, t1: /* removeElement */ js.Function0[scala.Unit], t2: /* properties */ js.UndefOr[typingsJapgolly.maquette.interfacesMod.VNodeProperties]) => exitAnimation(t0, t1, t2).runNow()))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerHTML != null) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => onblur(t0).runNow()))
    if (onchange != null) __obj.updateDynamic("onchange")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onchange(t0).runNow()))
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onclick(t0).runNow()))
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => ondblclick(t0).runNow()))
    if (ondrag != null) __obj.updateDynamic("ondrag")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => ondrag(t0).runNow()))
    if (ondragend != null) __obj.updateDynamic("ondragend")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => ondragend(t0).runNow()))
    if (ondragenter != null) __obj.updateDynamic("ondragenter")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => ondragenter(t0).runNow()))
    if (ondragleave != null) __obj.updateDynamic("ondragleave")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => ondragleave(t0).runNow()))
    if (ondragover != null) __obj.updateDynamic("ondragover")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => ondragover(t0).runNow()))
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => ondragstart(t0).runNow()))
    if (ondrop != null) __obj.updateDynamic("ondrop")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.DragEvent) => ondrop(t0).runNow()))
    if (onfocus != null) __obj.updateDynamic("onfocus")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.FocusEvent) => onfocus(t0).runNow()))
    if (oninput != null) __obj.updateDynamic("oninput")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => oninput(t0).runNow()))
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => onkeydown(t0).runNow()))
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => onkeypress(t0).runNow()))
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.KeyboardEvent) => onkeyup(t0).runNow()))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onload(t0).runNow()))
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onmousedown(t0).runNow()))
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onmouseenter(t0).runNow()))
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onmouseleave(t0).runNow()))
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onmousemove(t0).runNow()))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onmouseout(t0).runNow()))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onmouseover(t0).runNow()))
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.MouseEvent) => onmouseup(t0).runNow()))
    if (onmousewheel != null) __obj.updateDynamic("onmousewheel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.WheelEvent | org.scalajs.dom.raw.WheelEvent) => onmousewheel(t0).runNow()))
    if (onscroll != null) __obj.updateDynamic("onscroll")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.UIEvent) => onscroll(t0).runNow()))
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(js.Any.fromFunction1((t0: /* ev */ typingsJapgolly.std.Event_) => onsubmit(t0).runNow()))
    if (ontouchcancel != null) __obj.updateDynamic("ontouchcancel")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TouchEvent) => ontouchcancel(t0).runNow()))
    if (ontouchend != null) __obj.updateDynamic("ontouchend")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TouchEvent) => ontouchend(t0).runNow()))
    if (ontouchmove != null) __obj.updateDynamic("ontouchmove")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TouchEvent) => ontouchmove(t0).runNow()))
    if (ontouchstart != null) __obj.updateDynamic("ontouchstart")(js.Any.fromFunction1((t0: /* ev */ org.scalajs.dom.raw.TouchEvent) => ontouchstart(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcset != null) __obj.updateDynamic("srcset")(srcset.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updateAnimation != null) __obj.updateDynamic("updateAnimation")(js.Any.fromFunction3((t0: /* element */ org.scalajs.dom.raw.Element, t1: /* properties */ js.UndefOr[typingsJapgolly.maquette.interfacesMod.VNodeProperties], t2: /* previousProperties */ js.UndefOr[typingsJapgolly.maquette.interfacesMod.VNodeProperties]) => updateAnimation(t0, t1, t2).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNodeProperties]
  }
}

