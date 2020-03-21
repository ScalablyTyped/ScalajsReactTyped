package typingsJapgolly.npmLicenseCrawler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* licenses */ typingsJapgolly.npmLicenseCrawler.mod.Licenses, 
    scala.Unit
  ]
  type Licenses = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.npmLicenseCrawler.AnonLicenseUrl]
}
