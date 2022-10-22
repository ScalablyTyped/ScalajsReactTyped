package typingsJapgolly.slickgrid.Slick

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AutoTooltips = Plugin[SlickData]

type CellCssStylesHash = NumberDictionary[StringDictionary[String]]

type Formatter[T /* <: SlickData */] = js.Function5[
/* row */ Double, 
/* cell */ Double, 
/* value */ Any, 
/* columnDef */ Column[T], 
/* dataContext */ SlickData, 
String]

type OnActiveCellPositionChangedEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnBeforeDestroyEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnColumnsReorderedEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnColumnsResizedEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnContextMenuEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnDragEndEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnDragEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnDragInitEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnDragStartEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnMouseEnterEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnMouseLeaveEventArgs[T /* <: SlickData */] = GridEventArgs[T]

type OnViewportChangedEventArgs[T /* <: SlickData */] = GridEventArgs[T]
