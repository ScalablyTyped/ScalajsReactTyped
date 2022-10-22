package typingsJapgolly.reactDnd

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.reactDnd.distTypesOptionsMod.DragPreviewOptions
import typingsJapgolly.reactDnd.distTypesOptionsMod.DragSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConnectorsMod {
  
  type ConnectDragPreview = DragElementWrapper[DragPreviewOptions]
  
  type ConnectDragSource = DragElementWrapper[DragSourceOptions]
  
  type ConnectDropTarget = DragElementWrapper[Any]
  
  type ConnectableElement = RefHandle[Any] | Element | org.scalajs.dom.Element | Null
  
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ ConnectableElement, 
    /* options */ js.UndefOr[Options], 
    Element | Null
  ]
}
