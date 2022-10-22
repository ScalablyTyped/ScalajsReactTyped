package typingsJapgolly.nivoBar.distTypesTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.nivoBar.anon.Partialkeystringxnumberyn
import typingsJapgolly.nivoBar.anon.`0`
import typingsJapgolly.nivoBar.nivoBarStrings.markers
import typingsJapgolly.react.mod.FC
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BarCanvasCustomLayer[RawDatum] = js.Function2[
/* context */ CanvasRenderingContext2D, 
/* props */ BarCanvasCustomLayerProps[RawDatum], 
Unit]

type BarCanvasLayer[RawDatum] = (Exclude[BarLayerId, markers]) | BarCanvasCustomLayer[RawDatum]

type BarCustomLayer[RawDatum] = FC[BarCustomLayerProps[RawDatum]]

type BarDatum = StringDictionary[String | Double]

type BarLayer[RawDatum] = BarLayerId | BarCustomLayer[RawDatum]

type BarsWithHidden[RawDatum] = js.Array[Partialkeystringxnumberyn & `0`[RawDatum]]

type LabelFormatter = js.Function1[/* label */ String | Double, String | Double]

type ValueFormatter = js.Function1[/* value */ Double, String | Double]
