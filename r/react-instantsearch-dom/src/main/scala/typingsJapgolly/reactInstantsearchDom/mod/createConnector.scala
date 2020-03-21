package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.mod.ConnectorDescription
import typingsJapgolly.reactInstantsearchCore.mod.ConnectorProvided
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "createConnector")
@js.native
object createConnector extends js.Object {
  def apply[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ StatelessComponent[ConnectorProvided[TProvided]], 
    ComponentClassP[TExposed with js.Object]
  ]) with (js.Function1[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    ComponentClassP[
      (Omit[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided]]) with TExposed with js.Object
    ]
  ]) = js.native
}

