package typingsJapgolly.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type EventArgs = js.Array[js.Any]
  type InternalNamePath = js.Array[java.lang.String | scala.Double]
  type InternalValidateFields = js.Function2[
    /* nameList */ js.UndefOr[js.Array[typingsJapgolly.rcFieldForm.interfaceMod.NamePath]], 
    /* options */ js.UndefOr[typingsJapgolly.rcFieldForm.interfaceMod.ValidateOptions], 
    js.Promise[typingsJapgolly.rcFieldForm.interfaceMod.Store]
  ]
  type NamePath = java.lang.String | scala.Double | typingsJapgolly.rcFieldForm.interfaceMod.InternalNamePath
  type Rule = typingsJapgolly.rcFieldForm.interfaceMod.RuleObject | typingsJapgolly.rcFieldForm.interfaceMod.RuleRender
  type RuleRender = js.Function1[
    /* form */ typingsJapgolly.rcFieldForm.interfaceMod.FormInstance, 
    typingsJapgolly.rcFieldForm.interfaceMod.RuleObject
  ]
  type Store = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.rcFieldForm.interfaceMod.StoreValue]
  type StoreValue = js.Any
  type ValidateFields = js.Function1[
    /* nameList */ js.UndefOr[js.Array[typingsJapgolly.rcFieldForm.interfaceMod.NamePath]], 
    js.Promise[typingsJapgolly.rcFieldForm.interfaceMod.Store]
  ]
  type ValidateMessage = java.lang.String | js.Function0[java.lang.String]
  type Validator = js.Function3[
    /* rule */ typingsJapgolly.rcFieldForm.interfaceMod.RuleObject, 
    /* value */ typingsJapgolly.rcFieldForm.interfaceMod.StoreValue, 
    /* callback */ js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit], 
    js.Promise[scala.Unit] | scala.Unit
  ]
}
