package typingsJapgolly.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object App {
  type AppConstructor = js.Function1[
    /* options */ (typingsJapgolly.uniApp.App.AppInstance[
      typingsJapgolly.uniApp.AnyObject with typingsJapgolly.uniApp.App.AppInstance[js.Object]
    ]) with typingsJapgolly.uniApp.AnyObject with typingsJapgolly.uniApp.App.AppInstance[js.Object], 
    scala.Unit
  ]
  type GetApp = js.Function1[
    /* opts */ js.UndefOr[typingsJapgolly.uniApp.App.GetAppOption], 
    typingsJapgolly.uniApp.App.AppInstance[typingsJapgolly.uniApp.AnyObject] with typingsJapgolly.uniApp.AnyObject
  ]
}
