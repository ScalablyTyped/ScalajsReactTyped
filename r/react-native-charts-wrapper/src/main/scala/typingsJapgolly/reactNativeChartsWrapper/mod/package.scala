package typingsJapgolly.reactNativeChartsWrapper.mod

import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNativeChartsWrapper.anon.Action
import typingsJapgolly.reactNativeChartsWrapper.anon.FnCall
import typingsJapgolly.reactNativeChartsWrapper.anon.Y
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ChartChangeEvent = NativeSyntheticEvent[Action]

type ChartSelectEvent = NativeSyntheticEvent[Y | Null]

type Color = ReturnType[FnCall]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.largeValue
  - typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.percent
  - typingsJapgolly.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.date
  - java.lang.String
  - js.Array[java.lang.String]
*/
type ValueFormatter = _ValueFormatter | js.Array[String] | String
