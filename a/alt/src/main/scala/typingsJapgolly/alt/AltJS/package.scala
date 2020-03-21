package typingsJapgolly.alt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AltJS {
  type ActionHandler = js.Function1[/* repeated */ js.Any, js.Any]
  type Actions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.alt.AltJS.Action[js.Any]]
  type ActionsClassConstructor = org.scalablytyped.runtime.Instantiable1[/* alt */ typingsJapgolly.alt.AltJS.Alt, typingsJapgolly.alt.AltJS.ActionsClass]
  type ExportConfig = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  type Source = org.scalablytyped.runtime.StringDictionary[js.Function0[typingsJapgolly.alt.AltJS.SourceModel[js.Any]]]
  type StateTransform = js.Function1[
    /* store */ typingsJapgolly.alt.AltJS.StoreModel[js.Any], 
    typingsJapgolly.alt.AltJS.AltStore[js.Any]
  ]
}
