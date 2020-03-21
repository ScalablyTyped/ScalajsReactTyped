package typingsJapgolly.ngTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object publicInterfacesMod {
  type DynamicTableColField[T] = typingsJapgolly.ngTable.publicInterfacesMod.IDynamicTableColFieldFunc[T] | T
  type IDynamicTableColFieldFunc[T] = js.Function1[/* context */ typingsJapgolly.ngTable.publicInterfacesMod.ColumnFieldContext, T]
  type IFilterTemplateDefMap = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | typingsJapgolly.ngTable.publicInterfacesMod.IFilterTemplateDef
  ]
  type ISelectDataFunc = js.Function0[
    js.Array[typingsJapgolly.ngTable.publicInterfacesMod.ISelectOption] | typingsJapgolly.angular.mod.IPromise[js.Array[typingsJapgolly.ngTable.publicInterfacesMod.ISelectOption]]
  ]
  type SelectData = js.Array[typingsJapgolly.ngTable.publicInterfacesMod.ISelectOption] | typingsJapgolly.ngTable.publicInterfacesMod.ISelectDataFunc
}
