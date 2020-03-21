package typingsJapgolly.slickgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Slick {
  type CellCssStylesHash = org.scalablytyped.runtime.NumberDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  type Formatter[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = js.Function5[
    /* row */ scala.Double, 
    /* cell */ scala.Double, 
    /* value */ js.Any, 
    /* columnDef */ typingsJapgolly.slickgrid.Slick.Column[T], 
    /* dataContext */ typingsJapgolly.slickgrid.Slick.SlickData, 
    java.lang.String
  ]
  type OnActiveCellPositionChangedEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnBeforeDestroyEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnColumnsReorderedEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnColumnsResizedEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnContextMenuEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnDragEndEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnDragEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnDragInitEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnDragStartEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnMouseEnterEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnMouseLeaveEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
  type OnViewportChangedEventArgs[T /* <: typingsJapgolly.slickgrid.Slick.SlickData */] = typingsJapgolly.slickgrid.Slick.GridEventArgs[T]
}
