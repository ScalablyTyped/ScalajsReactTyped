package typingsJapgolly.typescriptCompare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Any[Type] = typingsJapgolly.typescriptLogic.mod.And[
    typingsJapgolly.typescriptCompare.mod.prv.Extends[Type, typingsJapgolly.typescriptCompare.typescriptCompareNumbers.`0`], 
    typingsJapgolly.typescriptCompare.mod.prv.Extends[Type, typingsJapgolly.typescriptCompare.typescriptCompareNumbers.`1`]
  ]
  type Compare[A, B, Options /* <: typingsJapgolly.typescriptCompare.mod.Compare.Options */] = typingsJapgolly.typescriptLogic.mod.If[
    typingsJapgolly.typescriptCompare.mod.Extends[A, B], 
    typingsJapgolly.typescriptLogic.mod.If[
      typingsJapgolly.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal' | 'broaderRight' | 'broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    typingsJapgolly.typescriptLogic.mod.If[
      typingsJapgolly.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
  type Equal[A, B] = typingsJapgolly.typescriptLogic.mod.Or[
    typingsJapgolly.typescriptLogic.mod.And[
      typingsJapgolly.typescriptCompare.mod.Any[A], 
      typingsJapgolly.typescriptCompare.mod.Any[B]
    ], 
    typingsJapgolly.typescriptLogic.mod.And[
      typingsJapgolly.typescriptLogic.mod.And[
        typingsJapgolly.typescriptCompare.mod.NotAny[
          A, 
          typingsJapgolly.typescriptCompare.typescriptCompareBooleans.`true`, 
          typingsJapgolly.typescriptCompare.typescriptCompareBooleans.`true`
        ], 
        typingsJapgolly.typescriptCompare.mod.NotAny[
          B, 
          typingsJapgolly.typescriptCompare.typescriptCompareBooleans.`true`, 
          typingsJapgolly.typescriptCompare.typescriptCompareBooleans.`true`
        ]
      ], 
      typingsJapgolly.typescriptLogic.mod.And[
        typingsJapgolly.typescriptCompare.mod.Extends[A, B], 
        typingsJapgolly.typescriptCompare.mod.Extends[B, A]
      ]
    ]
  ]
  type Extends[A, B] = typingsJapgolly.typescriptLogic.mod.Or[
    typingsJapgolly.typescriptCompare.mod.Any[B], 
    typingsJapgolly.typescriptLogic.mod.If[
      typingsJapgolly.typescriptCompare.mod.Any[A], 
      typingsJapgolly.typescriptCompare.mod.Any[B], 
      typingsJapgolly.typescriptCompare.mod.prv.Extends[A, B]
    ]
  ]
  type NotAny[Type, True, False] = typingsJapgolly.typescriptLogic.mod.Not[typingsJapgolly.typescriptCompare.mod.Any[Type]]
  type NotEqual[A, B] = typingsJapgolly.typescriptLogic.mod.Not[typingsJapgolly.typescriptCompare.mod.Equal[A, B]]
}
