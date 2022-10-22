package typingsJapgolly.nivoLine.mod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.nivoLine.anon.X
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessorFunc = js.Function1[/* datum */ X, String]

type CanvasLayer = LineLayerType | CustomCanvasLayer

type CustomCanvasLayer = js.Function1[/* props */ CustomCanvasLayerProps, Unit]

type CustomLayer = js.Function1[/* props */ CustomLayerProps, Node]

type DatumValue = typingsJapgolly.nivoCore.mod.DatumValue

type Layer = LineLayerType | CustomLayer

type PointMouseHandler = js.Function2[/* point */ Point, /* event */ ReactMouseEventFrom[Element], Unit]

type PointTooltip = FunctionComponent[PointTooltipProps]

type SliceTooltip = FunctionComponent[SliceTooltipProps]
