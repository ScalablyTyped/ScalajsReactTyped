package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.reactAutosuggest.anon.PartialRecordThemeKeystri
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ContainerProps = InputHTMLAttributes[Any]

// types for functions - allowing reuse externally - e.g. as props and bound in the constructor
type GetSectionSuggestions[TSuggestion, TSection] = js.Function1[/* section */ TSection, js.Array[TSuggestion]]

type GetSuggestionValue[TSuggestion] = js.Function1[/* suggestion */ TSuggestion, String]

/**
  * Utilies types based on:
  * https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
  */
/** @internal */
type Omit[T, K /* <: /* keyof T */ String */] = Pick[
T, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any]

type OnSuggestionHighlighted = js.Function1[/* params */ SuggestionHighlightedParams, Unit]

type OnSuggestionSelected[TSuggestion] = js.Function2[
/* event */ ReactEventFrom[Any & Element], 
/* data */ SuggestionSelectedEventData[TSuggestion], 
Unit]

type OnSuggestionsClearRequested = js.Function0[Unit]

type RenderInputComponent = js.Function1[/* inputProps */ RenderInputComponentProps, Node]

type RenderSectionTitle = js.Function1[/* section */ Any, Node]

type RenderSuggestion[TSuggestion] = js.Function2[/* suggestion */ TSuggestion, /* params */ RenderSuggestionParams, Node]

type RenderSuggestionsContainer = js.Function1[/* params */ RenderSuggestionsContainerParams, Node]

type ShouldRenderSuggestions = js.Function2[/* value */ String, /* reason */ ShouldRenderReasons, Boolean]

type SuggestionsFetchRequested = js.Function1[/* request */ SuggestionsFetchRequestedParams, Unit]

type Theme = (Record[String, String | CSSProperties]) | PartialRecordThemeKeystri
