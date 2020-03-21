package typingsJapgolly.turndown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Filter = typingsJapgolly.turndown.mod.TagName | js.Array[typingsJapgolly.turndown.mod.TagName] | typingsJapgolly.turndown.mod.FilterFunction
  type FilterFunction = js.Function2[
    /* node */ org.scalajs.dom.raw.HTMLElement, 
    /* options */ typingsJapgolly.turndown.mod.Options, 
    scala.Boolean
  ]
  type Node = org.scalajs.dom.raw.HTMLElement | typingsJapgolly.std.Document_ | org.scalajs.dom.raw.DocumentFragment
  type Plugin = js.Function1[/* service */ typingsJapgolly.turndown.mod.TurndownService, scala.Unit]
  type ReplacementFunction = js.Function3[
    /* content */ java.lang.String, 
    /* node */ typingsJapgolly.turndown.mod.Node, 
    /* options */ typingsJapgolly.turndown.mod.Options, 
    java.lang.String
  ]
}
