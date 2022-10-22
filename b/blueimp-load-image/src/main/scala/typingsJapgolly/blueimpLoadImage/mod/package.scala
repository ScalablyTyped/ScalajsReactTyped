package typingsJapgolly.blueimpLoadImage.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AspectRatio = Double

type ExifTagValue = Double | String | js.Array[String]

type Iptc = NumberDictionary[Double | String | js.Array[String]]

type LoadImageCallback = js.Function2[
/* eventOrImage */ Event | HTMLCanvasElement | HTMLImageElement, 
/* data */ js.UndefOr[MetaData], 
Unit]

type LoadImageOptions = BasicOptions & CanvasOptions & CropOptions & MetaOptions

type Orientation = Double | Boolean

type ParseMetaDataCallback = js.Function1[/* data */ MetaData, Unit]
