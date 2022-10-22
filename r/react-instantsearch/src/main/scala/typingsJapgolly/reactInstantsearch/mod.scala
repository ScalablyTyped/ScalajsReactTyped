package typingsJapgolly.reactInstantsearch

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactInstantsearchCore.mod.AdditionalWidgetProperties
import typingsJapgolly.reactInstantsearchCore.mod.ConnectedComponentClass
import typingsJapgolly.reactInstantsearchCore.mod.ConnectorDescription
import typingsJapgolly.reactInstantsearchCore.mod.ConnectorProvided
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-instantsearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function2[
    /* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ComponentClassP[TExposed & js.Object]
  ]) & (js.Function2[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnector")(connectorDesc.asInstanceOf[js.Any]).asInstanceOf[(js.Function2[
    /* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ComponentClassP[TExposed & js.Object]
  ]) & (js.Function2[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ])]
}
