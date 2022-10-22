package typingsJapgolly.cypress

import org.scalajs.dom.Element
import typingsJapgolly.cypress.JQuery.AjaxSettings
import typingsJapgolly.cypress.JQuery.Callbacks
import typingsJapgolly.cypress.JQuery.Coordinates
import typingsJapgolly.cypress.JQuery.Deferred
import typingsJapgolly.cypress.JQuery.EffectsOptions
import typingsJapgolly.cypress.JQuery.EventStatic
import typingsJapgolly.cypress.JQuery.NameValuePair
import typingsJapgolly.cypress.JQuery.PlainObject
import typingsJapgolly.cypress.JQuery.Promise
import typingsJapgolly.cypress.JQuery.Thenable
import typingsJapgolly.cypress.JQuery.TypeOrArray
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DragEvent = org.scalajs.dom.DragEvent

type Event = org.scalajs.dom.Event

type EventEmitter2 = typingsJapgolly.eventemitter2.mod.EventEmitter2

type FocusEvent = org.scalajs.dom.FocusEvent

// tslint:disable-next-line:strict-export-declare-modifiers
type GlobalFunction = js.Function

// tslint:disable-next-line:strict-export-declare-modifiers
type GlobalPartial[T] = Partial[T]

// tslint:disable-next-line:no-empty-interface
type JQueryAjaxSettings = AjaxSettings[Any]

type JQueryAnimationOptions = EffectsOptions[Element]

type JQueryCallback = Callbacks[js.Function]

// tslint:disable-next-line:no-empty-interface
type JQueryCoordinates = Coordinates

type JQueryDeferred[T] = Deferred[T, Any, Any]

/**
  * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
  */
type JQueryEasingFunction = js.Function1[/* percent */ Double, Double]

// tslint:disable-next-line:no-empty-interface
type JQueryEventConstructor = EventStatic

type JQueryGenericPromise[T] = Thenable[T]

/**
  * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
  */
type JQueryParam = js.Function2[/* obj */ Any, /* traditional */ js.UndefOr[Boolean], String]

type JQueryPromise[T] = Promise[T, Any, Any]

// Legacy types that are not represented in the current type definitions are marked deprecated.
/**
  * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
  */
type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ Any, Unit]

/**
  * @deprecated ​ Deprecated.
  */
type JQueryPromiseOperator[T, U] = js.Function2[
/* callback1 */ TypeOrArray[JQueryPromiseCallback[T]], 
/* repeated */ TypeOrArray[JQueryPromiseCallback[Any]], 
JQueryPromise[U]]

// tslint:disable-next-line:no-empty-interface
type JQuerySerializeArrayElement = NameValuePair

/**
  * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
  */
// tslint:disable-next-line:no-empty-interface
type JQuerySupport = PlainObject[Any]

type KeyboardEvent = org.scalajs.dom.KeyboardEvent

type MouseEvent = org.scalajs.dom.MouseEvent

type TouchEvent = org.scalajs.dom.TouchEvent

type UIEvent = org.scalajs.dom.UIEvent
