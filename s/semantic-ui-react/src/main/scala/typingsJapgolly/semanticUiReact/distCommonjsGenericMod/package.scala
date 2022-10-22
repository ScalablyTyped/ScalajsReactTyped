package typingsJapgolly.semanticUiReact.distCommonjsGenericMod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.anon.Children
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.children
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type SemanticShorthandCollection[TProps] = js.Array[SemanticShorthandItem[TProps]]

type SemanticShorthandContent = Node

type SemanticShorthandItem[TProps /* <: Record[String, Any] */] = Node | SemanticShorthandItemFunc[TProps] | ((Omit[TProps, children]) & Children[TProps])

type SemanticShorthandItemFunc[TProps] = js.Function3[
/* component */ ElementType, 
/* props */ TProps, 
/* children */ js.UndefOr[Node | ReactNodeArray], 
Element | Null]

type ShorthandRenderFunction[C /* <: ElementType */, P] = js.Function2[/* Component */ C, /* props */ P, Node]
