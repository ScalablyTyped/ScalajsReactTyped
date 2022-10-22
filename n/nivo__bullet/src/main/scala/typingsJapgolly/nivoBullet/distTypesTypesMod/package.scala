package typingsJapgolly.nivoBullet.distTypesTypesMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.nivoBullet.anon.IdDatumId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DatumId = String | Double

type DatumValue = Double

type MouseEventHandler[D, T] = js.Function2[/* datum */ D, /* event */ ReactMouseEventFrom[T & Element], Unit]

type MouseEventWithDatum[D, Element] = js.Function2[
/* datum */ D, 
/* event */ ReactMouseEventFrom[Element & org.scalajs.dom.Element], 
Unit]

type WithDatumId[R] = R & IdDatumId
