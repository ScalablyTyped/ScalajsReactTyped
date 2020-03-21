package typingsJapgolly.mitt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mitt {
  type Handler = js.Function1[/* event */ js.UndefOr[js.Any], scala.Unit]
  type MittStatic = js.Function1[
    /* all */ js.UndefOr[
      org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.mitt.mitt.Handler]]
    ], 
    typingsJapgolly.mitt.mitt.Emitter
  ]
  type WildcardHandler = js.Function2[/* type */ js.UndefOr[java.lang.String], /* event */ js.UndefOr[js.Any], scala.Unit]
}
