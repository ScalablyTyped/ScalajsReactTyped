package typingsJapgolly.cloudConfigClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigSource = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LoadCallback = js.Function2[
    /* error */ js.Error, 
    /* config */ js.UndefOr[typingsJapgolly.cloudConfigClient.mod.Config], 
    scala.Unit
  ]
}
