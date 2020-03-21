package typingsJapgolly.estreeWalker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type WalkerListener = js.ThisFunction4[
    /* this */ typingsJapgolly.estreeWalker.mod.WalkerContext, 
    /* node */ typingsJapgolly.estreeWalker.mod.Node, 
    /* parent */ js.UndefOr[typingsJapgolly.estreeWalker.mod.Node], 
    /* prop */ js.UndefOr[java.lang.String], 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
