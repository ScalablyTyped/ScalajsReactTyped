package typingsJapgolly.prettier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AST = js.Any
  type BuiltInParser = js.Function2[
    /* text */ java.lang.String, 
    /* options */ js.UndefOr[js.Any], 
    typingsJapgolly.prettier.mod.AST
  ]
  type CustomParser = js.Function3[
    /* text */ java.lang.String, 
    /* parsers */ typingsJapgolly.prettier.RecordBuiltInParserNameBu, 
    /* options */ typingsJapgolly.prettier.mod.Options, 
    typingsJapgolly.prettier.mod.AST
  ]
  type Doc_ = typingsJapgolly.prettier.mod.doc.builders.Doc
  type SupportOptionValue = scala.Double | scala.Boolean | java.lang.String
}
