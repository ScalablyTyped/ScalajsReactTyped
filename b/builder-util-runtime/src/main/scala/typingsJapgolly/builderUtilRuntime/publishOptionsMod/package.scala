package typingsJapgolly.builderUtilRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object publishOptionsMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.builderUtilRuntime.publishOptionsMod.GithubOptions
    - typingsJapgolly.builderUtilRuntime.publishOptionsMod.S3Options
    - typingsJapgolly.builderUtilRuntime.publishOptionsMod.SpacesOptions
    - typingsJapgolly.builderUtilRuntime.publishOptionsMod.GenericServerOptions
    - typingsJapgolly.builderUtilRuntime.publishOptionsMod.BintrayOptions
    - typingsJapgolly.builderUtilRuntime.publishOptionsMod.CustomPublishOptions
  */
  type AllPublishOptions = typingsJapgolly.builderUtilRuntime.publishOptionsMod._AllPublishOptions | java.lang.String
  type Publish = typingsJapgolly.builderUtilRuntime.publishOptionsMod.AllPublishOptions | js.Array[typingsJapgolly.builderUtilRuntime.publishOptionsMod.AllPublishOptions] | scala.Null
}
