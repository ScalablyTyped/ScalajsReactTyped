package typingsJapgolly.yaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ast {
  type DocumentConstructor = org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[/* options */ typingsJapgolly.yaml.mod.ParseOptions], 
    typingsJapgolly.yaml.mod.ast.Document
  ]
  type MapConstructor = org.scalablytyped.runtime.Instantiable0[typingsJapgolly.yaml.mod.ast.MapBase]
  type PairConstructor = org.scalablytyped.runtime.Instantiable2[
    /* key */ typingsJapgolly.yaml.mod.ast.AstNode | scala.Null, 
    js.UndefOr[typingsJapgolly.yaml.mod.ast.AstNode | scala.Null], 
    typingsJapgolly.yaml.mod.ast.Pair
  ]
  type ScalarConstructor = org.scalablytyped.runtime.Instantiable1[
    /* value */ scala.Null | scala.Boolean | scala.Double | java.lang.String, 
    typingsJapgolly.yaml.mod.ast.Scalar
  ]
  type SeqConstructor = org.scalablytyped.runtime.Instantiable0[typingsJapgolly.yaml.mod.ast.SeqBase]
}
