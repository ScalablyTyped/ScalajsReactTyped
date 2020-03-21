package typingsJapgolly.cavy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RefCallback = js.Function1[/* element */ japgolly.scalajs.react.raw.React.Node | scala.Null, scala.Unit]
  type TestHookGenerator = typingsJapgolly.cavy.mod.TestHookGeneratorWithRefCallback with typingsJapgolly.cavy.mod.TestHookGeneratorWithRefObject
  type TestHookGeneratorWithRefCallback = js.Function2[
    /* label */ java.lang.String, 
    /* ref */ js.UndefOr[typingsJapgolly.cavy.mod.RefCallback], 
    typingsJapgolly.cavy.mod.RefCallback
  ]
  type TestHookGeneratorWithRefObject = js.Function2[
    /* label */ java.lang.String, 
    /* ref */ js.UndefOr[japgolly.scalajs.react.raw.React.RefHandle[js.Any]], 
    japgolly.scalajs.react.raw.React.RefHandle[js.Any]
  ]
  type WithTestHook[P /* <: js.Object */] = P with typingsJapgolly.cavy.AnonGenerateTestHook
}
