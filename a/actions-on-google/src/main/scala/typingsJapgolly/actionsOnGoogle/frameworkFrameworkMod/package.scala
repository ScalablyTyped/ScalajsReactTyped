package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frameworkFrameworkMod {
  type FrameworkMetadata = /** @public */
  org.scalablytyped.runtime.StringDictionary[js.Any]
  type Frameworks = /** @public */
  org.scalablytyped.runtime.StringDictionary[typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.Framework[js.Function]]
  type Headers = /** @public */
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  type StandardHandler = js.Function3[
    /* body */ typingsJapgolly.actionsOnGoogle.commonMod.JsonObject, 
    /* headers */ typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.Headers, 
    /* metadata */ js.UndefOr[typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata], 
    js.Promise[typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.StandardResponse]
  ]
}
