package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cypress {
  type DragEvent = org.scalajs.dom.raw.DragEvent
  type Event = typingsJapgolly.std.Event_
  type FocusEvent = org.scalajs.dom.raw.FocusEvent
  // tslint:disable-next-line:strict-export-declare-modifiers
  type GlobalPartial[T] = typingsJapgolly.std.Partial[T]
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = typingsJapgolly.cypress.JQuery_.AjaxSettings[js.Any]
  type JQueryAnimationOptions = typingsJapgolly.cypress.JQuery_.EffectsOptions[org.scalajs.dom.raw.Element]
  type JQueryCallback = typingsJapgolly.cypress.JQuery_.Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = typingsJapgolly.cypress.JQuery_.Coordinates
  type JQueryDeferred[T] = typingsJapgolly.cypress.JQuery_.Deferred[T, js.Any, js.Any]
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = typingsJapgolly.cypress.JQuery_.EventStatic
  type JQueryGenericPromise[T] = typingsJapgolly.cypress.JQuery_.Thenable[T]
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  type JQueryPromise[T] = typingsJapgolly.cypress.JQuery_.Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typingsJapgolly.cypress.JQuery_.TypeOrArray[typingsJapgolly.cypress.JQueryPromiseCallback[T]], 
    /* repeated */ typingsJapgolly.cypress.JQuery_.TypeOrArray[typingsJapgolly.cypress.JQueryPromiseCallback[js.Any]], 
    typingsJapgolly.cypress.JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = typingsJapgolly.cypress.JQuery_.NameValuePair
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = typingsJapgolly.cypress.JQuery_.PlainObject[js.Any]
  type JQuery_[TElement] = typingsJapgolly.cypress.JQuery__[TElement]
  type KeyboardEvent = org.scalajs.dom.raw.KeyboardEvent
  // #endregion Browser augmentations
  // #region Deprecations
  /** @deprecated use `Mocha.Done` instead. */
  type MochaDone = typingsJapgolly.cypress.Mocha_.Done
  type Mocha_ = typingsJapgolly.cypress.Mocha__
  type MouseEvent = org.scalajs.dom.raw.MouseEvent
  /** @deprecated use `Mocha.ReporterConstructor` instead. */
  type ReporterConstructor = typingsJapgolly.cypress.Mocha_.ReporterConstructor
  type TouchEvent = org.scalajs.dom.raw.TouchEvent
  type UIEvent = org.scalajs.dom.raw.UIEvent
}
