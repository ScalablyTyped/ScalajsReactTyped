package typingsJapgolly.fastCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parserTypesMod {
  type AsyncRowTransform = js.Function2[
    /* row */ typingsJapgolly.fastCsv.parserTypesMod.Row, 
    /* cb */ typingsJapgolly.fastCsv.parserTypesMod.RowTransformCallback, 
    scala.Unit
  ]
  type AsyncRowValidate = js.Function2[
    /* row */ typingsJapgolly.fastCsv.parserTypesMod.Row, 
    /* cb */ typingsJapgolly.fastCsv.parserTypesMod.RowValidateCallback, 
    scala.Unit
  ]
  type HeaderArray = js.Array[js.UndefOr[java.lang.String | scala.Null]]
  type HeaderTransformFunction = js.Function1[
    /* headers */ typingsJapgolly.fastCsv.parserTypesMod.HeaderArray, 
    typingsJapgolly.fastCsv.parserTypesMod.HeaderArray
  ]
  type Row = typingsJapgolly.fastCsv.parserTypesMod.RowMap | typingsJapgolly.fastCsv.parserTypesMod.RowArray
  type RowArray = js.Array[java.lang.String]
  type RowMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RowTransformCallback = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* row */ js.UndefOr[typingsJapgolly.fastCsv.parserTypesMod.Row], 
    scala.Unit
  ]
  type RowTransformFunction = typingsJapgolly.fastCsv.parserTypesMod.SyncRowTransform | typingsJapgolly.fastCsv.parserTypesMod.AsyncRowTransform
  type RowValidate = typingsJapgolly.fastCsv.parserTypesMod.AsyncRowValidate | typingsJapgolly.fastCsv.parserTypesMod.SyncRowValidate
  type RowValidateCallback = js.Function3[
    /* error */ js.UndefOr[js.Error | scala.Null], 
    /* isValid */ js.UndefOr[scala.Boolean], 
    /* reason */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type RowValidatorCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* result */ js.UndefOr[typingsJapgolly.fastCsv.parserTypesMod.RowValidationResult], 
    scala.Unit
  ]
  type SyncRowTransform = js.Function1[
    /* row */ typingsJapgolly.fastCsv.parserTypesMod.Row, 
    typingsJapgolly.fastCsv.parserTypesMod.Row
  ]
  type SyncRowValidate = js.Function1[/* row */ typingsJapgolly.fastCsv.parserTypesMod.Row, scala.Boolean]
}
