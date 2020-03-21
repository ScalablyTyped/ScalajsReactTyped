package typingsJapgolly.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object executorMod {
  type HelpRPC[S /* <: typingsJapgolly.ionicCliFramework.helpMod.CommandHelpSchema | typingsJapgolly.ionicCliFramework.helpMod.NamespaceHelpSchema */] = typingsJapgolly.ionicCliFramework.ipcMod.RPC[
    typingsJapgolly.ionicCliFramework.ionicCliFrameworkStrings.help, 
    js.Array[js.Array[java.lang.String]], 
    S
  ]
}
