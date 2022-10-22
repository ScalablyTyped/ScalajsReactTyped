package typingsJapgolly.nivoPie.distTypesTypesMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DatumId = String | Double

type MouseEventHandler[RawDatum, ElementType] = js.Function2[
/* datum */ ComputedDatum[RawDatum], 
/* event */ ReactMouseEventFrom[ElementType & Element], 
Unit]

type PieCustomLayer[RawDatum] = FC[PieCustomLayerProps[RawDatum]]

type PieLayer[RawDatum] = PieLayerId | PieCustomLayer[RawDatum]
