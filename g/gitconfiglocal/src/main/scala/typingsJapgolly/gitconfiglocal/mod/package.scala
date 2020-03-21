package typingsJapgolly.gitconfiglocal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GitConfig = org.scalablytyped.runtime.StringDictionary[js.Any]
  type callback = js.Function2[
    /* error */ js.Error | typingsJapgolly.gitconfiglocal.gitconfiglocalBooleans.`false`, 
    /* config */ typingsJapgolly.gitconfiglocal.mod.GitConfig, 
    scala.Unit
  ]
}
