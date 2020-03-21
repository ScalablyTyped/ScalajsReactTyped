package typingsJapgolly.reactInstantsearch

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

@JSImport("react-instantsearch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function1[
    /* stateless */ StatelessComponent[ConnectorProvided[TProvided]], 
    ComponentClassP[TExposed with js.Object]
  ]) with (js.Function1[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    ComponentClassP[
      (Omit[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided]]) with TExposed with js.Object
    ]
  ]) = js.native
}

