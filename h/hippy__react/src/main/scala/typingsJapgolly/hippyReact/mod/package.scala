package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hippyReact.anon.AnimationId
import typingsJapgolly.hippyReact.hippyReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationCallback = js.Function0[Unit]

//
// Hippy React Module
// ----------------------------------------------------------------------
type AnimationValue = Double | AnimationId | String

type Attributes = StringDictionary[js.UndefOr[String | Double | `true`]]

type DataItem = Any

type EventListener = js.Function0[Unit]

type EventListeners = StringDictionary[HippyEventListener]

// interface RecursiveArray<T> extends Array<T | ReadonlyArray<T> | RecursiveArray<T>> {}
type GenericStyleProp[T] = T | js.Array[T]

type HippyEventRevoker = EventEmitterRevoker

type Image = Component[ImageProps & js.Object, js.Object]

type Modal = Component[ModalProps & js.Object, js.Object]

type Navigator = Component[NavigatorProps & js.Object, js.Object]

type NetworkChangeEventData = Any

type NetworkInfoCallback = js.Function1[/* data */ NetworkChangeEventData, Unit]

//
// Hippy Style
// ----------------------------------------------------------------------
type StyleObj = StringDictionary[Style]

type Text = Component[TextProps & js.Object, js.Object]

type TextStyleProp = GenericStyleProp[TextStyle]

type View = Component[ViewProps & js.Object, js.Object]

type ViewStyleProp = GenericStyleProp[ViewStyle]

type WebView = Component[WebViewProps & js.Object, js.Object]
