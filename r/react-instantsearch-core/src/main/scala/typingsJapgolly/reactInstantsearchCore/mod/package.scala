package typingsJapgolly.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BasicDoc = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = japgolly.scalajs.react.raw.React.ComponentClassP[
    (typingsJapgolly.reactInstantsearchCore.mod.Omit[TProps, TProvidedProps]) with TExposedProps with js.Object
  ]
  type ConnectorProvided[TProvided] = typingsJapgolly.reactInstantsearchCore.AnonCreateURL with TProvided
  type HighlightProps[TDoc] = typingsJapgolly.reactInstantsearchCore.mod.HighlightProvided[TDoc] with typingsJapgolly.reactInstantsearchCore.mod.HighlightPassedThru[TDoc]
  type HighlightResult[TDoc] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TDoc ]:? react-instantsearch-core.react-instantsearch-core.HighlightResultField<TDoc[K]>}
    */ typingsJapgolly.reactInstantsearchCore.reactInstantsearchCoreStrings.HighlightResult with TDoc
  type HighlightResultArray[TItem] = js.Array[
    typingsJapgolly.reactInstantsearchCore.mod.HighlightResult[TItem] | typingsJapgolly.reactInstantsearchCore.mod.HighlightResultPrimitive
  ]
  type HighlightResultField[TField] = typingsJapgolly.reactInstantsearchCore.mod.HighlightResult[TField] | typingsJapgolly.reactInstantsearchCore.mod.HighlightResultPrimitive | typingsJapgolly.reactInstantsearchCore.mod.HighlightResultArray[js.Any]
  type Hit[TDoc] = TDoc with typingsJapgolly.reactInstantsearchCore.AnonHighlightResult[TDoc]
  type Omit[T1, T2] = typingsJapgolly.std.Pick[T1, typingsJapgolly.std.Exclude[java.lang.String, java.lang.String]]
  type Refinement = typingsJapgolly.reactInstantsearchCore.AnonAttribute with (typingsJapgolly.reactInstantsearchCore.AnonCurrentRefinement | typingsJapgolly.reactInstantsearchCore.AnonItems)
  type RefinementValue = js.Function1[
    /* searchState */ typingsJapgolly.reactInstantsearchCore.mod.SearchState, 
    typingsJapgolly.reactInstantsearchCore.mod.SearchState
  ]
}
