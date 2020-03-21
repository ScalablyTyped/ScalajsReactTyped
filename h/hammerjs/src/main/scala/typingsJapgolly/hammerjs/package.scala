package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hammerjs {
  type HammerListener = js.Function1[/* event */ typingsJapgolly.hammerjs.HammerInput, scala.Unit]
  type PanRecognizer = typingsJapgolly.hammerjs.AttrRecognizer
  type PinchRecognizer = typingsJapgolly.hammerjs.AttrRecognizer
  type PressRecognizer = typingsJapgolly.hammerjs.AttrRecognizer
  type RecognizerTuple = js.Array[typingsJapgolly.hammerjs.RecognizerStatic] | (js.Tuple2[
    typingsJapgolly.hammerjs.RecognizerStatic, 
    typingsJapgolly.hammerjs.RecognizerOptions
  ]) | (js.Tuple3[
    typingsJapgolly.hammerjs.RecognizerStatic, 
    typingsJapgolly.hammerjs.RecognizerOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]) | (js.Tuple4[
    typingsJapgolly.hammerjs.RecognizerStatic, 
    typingsJapgolly.hammerjs.RecognizerOptions, 
    java.lang.String | js.Array[java.lang.String], 
    java.lang.String | typingsJapgolly.hammerjs.Recognizer | (js.Array[java.lang.String | typingsJapgolly.hammerjs.Recognizer])
  ])
  type RotateRecognizer = typingsJapgolly.hammerjs.AttrRecognizer
  type SwipeRecognizer = typingsJapgolly.hammerjs.AttrRecognizer
  type TapRecognizer = typingsJapgolly.hammerjs.AttrRecognizer
}
