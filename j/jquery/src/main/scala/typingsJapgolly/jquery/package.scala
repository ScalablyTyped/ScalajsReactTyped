package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jquery {
  type DragEvent = org.scalajs.dom.raw.DragEvent
  type Event = typingsJapgolly.std.Event_
  type FocusEvent = org.scalajs.dom.raw.FocusEvent
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = typingsJapgolly.jquery.JQuery_.AjaxSettings[js.Any]
  type JQueryAnimationOptions = typingsJapgolly.jquery.JQuery_.EffectsOptions[org.scalajs.dom.raw.Element]
  type JQueryCallback = typingsJapgolly.jquery.JQuery_.Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = typingsJapgolly.jquery.JQuery_.Coordinates
  type JQueryDeferred[T] = typingsJapgolly.jquery.JQuery_.Deferred[T, js.Any, js.Any]
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = typingsJapgolly.jquery.JQuery_.EventStatic
  type JQueryGenericPromise[T] = typingsJapgolly.jquery.JQuery_.Thenable[T]
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  type JQueryPromise[T] = typingsJapgolly.jquery.JQuery_.Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typingsJapgolly.jquery.JQuery_.TypeOrArray[typingsJapgolly.jquery.JQueryPromiseCallback[T]], 
    /* repeated */ typingsJapgolly.jquery.JQuery_.TypeOrArray[typingsJapgolly.jquery.JQueryPromiseCallback[js.Any]], 
    typingsJapgolly.jquery.JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = typingsJapgolly.jquery.JQuery_.NameValuePair
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = typingsJapgolly.jquery.JQuery_.PlainObject[js.Any]
  type JQuery_[TElement] = typingsJapgolly.jquery.JQuery__[TElement]
  type KeyboardEvent = org.scalajs.dom.raw.KeyboardEvent
  type MouseEvent = org.scalajs.dom.raw.MouseEvent
  type TouchEvent = org.scalajs.dom.raw.TouchEvent
  type UIEvent = org.scalajs.dom.raw.UIEvent
}
