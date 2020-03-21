package typingsJapgolly.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LogErrorType = js.Function2[
    /* errorMeta */ java.lang.String | js.Object, 
    /* error */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type LogMessageType = js.Function1[/* format */ java.lang.String, scala.Unit]
  type PluginCallback = js.Function2[/* err */ js.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  type ReactProps[T /* <: org.scalajs.dom.raw.Element */] = typingsJapgolly.react.mod.DetailedHTMLProps[typingsJapgolly.react.mod.HTMLAttributes[T], T]
  type RenderCallback[T] = js.Function1[/* data */ T, japgolly.scalajs.react.raw.React.Node]
}
