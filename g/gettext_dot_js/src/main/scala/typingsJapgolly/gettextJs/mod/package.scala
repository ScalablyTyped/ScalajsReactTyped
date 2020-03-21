package typingsJapgolly.gettextJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GettextStatic = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.gettextJs.mod.GettextOptions], 
    typingsJapgolly.gettextJs.mod.Gettext
  ]
  type JsonDataMessages = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | js.Array[java.lang.String] | typingsJapgolly.gettextJs.mod.JsonDataHeader
  ]
  type PluralForm = js.Function1[/* n */ scala.Double, scala.Double]
}
