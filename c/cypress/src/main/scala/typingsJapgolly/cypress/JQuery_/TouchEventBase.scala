package typingsJapgolly.cypress.JQuery_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.TouchList
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region TouchEvent
// #region TouchEvent
trait TouchEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // MouseEvent, KeyboardEvent, TouchEvent
  @JSName("altKey")
  var altKey_TouchEventBase: Boolean
  // MouseEvent
  @JSName("button")
  var button_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("buttons")
  var buttons_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  // TouchEvent
  @JSName("changedTouches")
  var changedTouches_TouchEventBase: TouchList
  /** @deprecated */
  @JSName("charCode")
  var charCode_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  // KeyboardEvent
  /** @deprecated */
  @JSName("char")
  var char_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("clientX")
  var clientX_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("clientY")
  var clientY_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("ctrlKey")
  var ctrlKey_TouchEventBase: Boolean
  /** @deprecated */
  @JSName("keyCode")
  var keyCode_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("key")
  var key_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Indicates whether the META key was pressed when the event fired.
    * @see \`{@link https://api.jquery.com/event.metaKey/ }\`
    * @since 1.0.4
    * @example ​ ````Determine whether the META key was pressed when the event fired.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.metaKey demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <button value="Test" name="Test" id="checkMetaKey">Click me!</button>
  <div id="display"></div>
  ​
  <script>
  $( "#checkMetaKey" ).click(function( event ) {
    $( "#display" ).text( event.metaKey );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("metaKey")
  var metaKey_TouchEventBase: Boolean
  @JSName("offsetX")
  var offsetX_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("offsetY")
  var offsetY_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("originalEvent")
  var originalEvent_TouchEventBase: js.UndefOr[TouchEvent] = js.undefined
  /**
    * The mouse position relative to the left edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageX/ }\`
    * @since 1.0.4
    * @example ​ ````Show the mouse position relative to the left and top edges of the document (within this iframe).
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.pageX demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  ​
  <script>
  $( document ).on( "mousemove", function( event ) {
    $( "#log" ).text( "pageX: " + event.pageX + ", pageY: " + event.pageY );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("pageX")
  var pageX_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * The mouse position relative to the top edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageY/ }\`
    * @since 1.0.4
    * @example ​ ````Show the mouse position relative to the left and top edges of the document (within this iframe).
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.pageY demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  ​
  <script>
  $( document ).on( "mousemove", function( event ) {
    $( "#log" ).text( "pageX: " + event.pageX + ", pageY: " + event.pageY );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("pageY")
  var pageY_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  // PointerEvent
  @JSName("pointerId")
  var pointerId_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("pointerType")
  var pointerType_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * The other DOM element involved in the event, if any.
    * @see \`{@link https://api.jquery.com/event.relatedTarget/ }\`
    * @since 1.1.4
    * @example ​ ````On mouseout of anchors, alert the element type being entered.
  ```javascript
  $( "a" ).mouseout(function( event ) {
    alert( event.relatedTarget.nodeName ); // "DIV"
  });
  ```
    */
  var relatedTarget: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("screenX")
  var screenX_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("screenY")
  var screenY_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("shiftKey")
  var shiftKey_TouchEventBase: Boolean
  @JSName("targetTouches")
  var targetTouches_TouchEventBase: TouchList
  /** @deprecated */
  @JSName("toElement")
  var toElement_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("touches")
  var touches_TouchEventBase: TouchList
  // MouseEvent, KeyboardEvent
  /**
    * For key or mouse events, this property indicates the specific key or button that was pressed.
    * @see \`{@link https://api.jquery.com/event.which/ }\`
    * @since 1.1.3
    * @deprecated ​ Deprecated since 3.3. See \`{@link https://github.com/jquery/api.jquery.com/issues/821 }\`.
    * @example ​ ````Log which key was depressed.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.which demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <input id="whichkey" value="type something">
  <div id="log"></div>
  ​
  <script>
  $( "#whichkey" ).on( "keydown", function( event ) {
    $( "#log" ).html( event.type + ": " +  event.which );
  });
  </script>
  ​
  </body>
  </html>
  ```
    * @example ​ ````Log which mouse button was depressed.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.which demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <input id="whichkey" value="click here">
  <div id="log"></div>
  ​
  <script>
  $( "#whichkey" ).on( "mousedown", function( event ) {
    $( "#log" ).html( event.type + ": " +  event.which );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("which")
  var which_TouchEventBase: js.UndefOr[scala.Nothing] = js.undefined
}

object TouchEventBase {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    altKey: Boolean,
    bubbles: Boolean,
    cancelable: Boolean,
    changedTouches: TouchList,
    ctrlKey: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    metaKey: Boolean,
    preventDefault: Callback,
    shiftKey: Boolean,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: TTarget,
    targetTouches: TouchList,
    timeStamp: Double,
    touches: TouchList,
    `type`: String,
    view: Window_,
    button: js.UndefOr[scala.Nothing] = js.undefined,
    buttons: js.UndefOr[scala.Nothing] = js.undefined,
    char: js.UndefOr[scala.Nothing] = js.undefined,
    charCode: js.UndefOr[scala.Nothing] = js.undefined,
    clientX: js.UndefOr[scala.Nothing] = js.undefined,
    clientY: js.UndefOr[scala.Nothing] = js.undefined,
    key: js.UndefOr[scala.Nothing] = js.undefined,
    keyCode: js.UndefOr[scala.Nothing] = js.undefined,
    namespace: String = null,
    offsetX: js.UndefOr[scala.Nothing] = js.undefined,
    offsetY: js.UndefOr[scala.Nothing] = js.undefined,
    originalEvent: TouchEvent = null,
    pageX: js.UndefOr[scala.Nothing] = js.undefined,
    pageY: js.UndefOr[scala.Nothing] = js.undefined,
    pointerId: js.UndefOr[scala.Nothing] = js.undefined,
    pointerType: js.UndefOr[scala.Nothing] = js.undefined,
    relatedTarget: js.UndefOr[scala.Nothing] = js.undefined,
    result: js.Any = null,
    screenX: js.UndefOr[scala.Nothing] = js.undefined,
    screenY: js.UndefOr[scala.Nothing] = js.undefined,
    toElement: js.UndefOr[scala.Nothing] = js.undefined,
    which: js.UndefOr[scala.Nothing] = js.undefined
  ): TouchEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], changedTouches = changedTouches.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(char)) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode.asInstanceOf[js.Any])
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (!js.isUndefined(pointerId)) __obj.updateDynamic("pointerId")(pointerId.asInstanceOf[js.Any])
    if (!js.isUndefined(pointerType)) __obj.updateDynamic("pointerType")(pointerType.asInstanceOf[js.Any])
    if (!js.isUndefined(relatedTarget)) __obj.updateDynamic("relatedTarget")(relatedTarget.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(screenX)) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (!js.isUndefined(screenY)) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (!js.isUndefined(toElement)) __obj.updateDynamic("toElement")(toElement.asInstanceOf[js.Any])
    if (!js.isUndefined(which)) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}

