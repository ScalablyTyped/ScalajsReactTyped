package typingsJapgolly.bagpipes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Fitting = js.Function2[
    /* context */ typingsJapgolly.bagpipes.mod.FittingContext, 
    /* next */ js.Function2[
      /* err */ js.UndefOr[js.Error | scala.Null], 
      /* res */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type FittingFactory = js.Function2[
    /* fittingDef */ typingsJapgolly.bagpipes.mod.FittingDef, 
    /* bagpipes */ js.Any, 
    typingsJapgolly.bagpipes.mod.Fitting
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bagpipes.bagpipesStrings.system
    - typingsJapgolly.bagpipes.bagpipesStrings.user
    - java.lang.String
  */
  type FittingType = typingsJapgolly.bagpipes.mod._FittingType | java.lang.String
  type FittingTypesMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.bagpipes.mod.FittingFactory]
  type PipeDef = js.Array[js.Any] | java.lang.String | typingsJapgolly.bagpipes.mod.FittingDef
  type PipeDefMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.bagpipes.mod.PipeDef]
}
