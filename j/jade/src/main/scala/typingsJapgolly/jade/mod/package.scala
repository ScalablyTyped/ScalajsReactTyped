package typingsJapgolly.jade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JadeCustomFilterFunction = js.Function2[
    /* text */ java.lang.String, 
    /* options */ org.scalablytyped.runtime.StringDictionary[scala.Boolean], 
    java.lang.String
  ]
  type JadeGenerationFunction = js.Function1[/* locals */ js.UndefOr[typingsJapgolly.jade.mod.TemplateLocals], java.lang.String]
  type TemplateLocals = org.scalablytyped.runtime.StringDictionary[js.Any]
}
