package typingsJapgolly.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type FilterCallback = js.Function1[/* node */ typingsJapgolly.typescript.mod.Node, scala.Boolean]
  type ForEachCommentCallback = js.Function3[
    /* fullText */ java.lang.String, 
    /* kind */ typingsJapgolly.typescript.mod.SyntaxKind, 
    /* pos */ typingsJapgolly.tslint.utilsMod.TokenPosition, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typingsJapgolly.typescript.mod.SyntaxKind, 
    /* pos */ typingsJapgolly.tslint.utilsMod.TokenPosition, 
    /* parent */ typingsJapgolly.typescript.mod.Node, 
    scala.Unit
  ]
}
