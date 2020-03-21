package typingsJapgolly.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  type Publish = typingsJapgolly.builderUtilRuntime.publishOptionsMod.AllPublishOptions | typingsJapgolly.appBuilderLib.snapStorePublisherMod.SnapStoreOptions | (js.Array[
    typingsJapgolly.builderUtilRuntime.publishOptionsMod.AllPublishOptions | typingsJapgolly.appBuilderLib.snapStorePublisherMod.SnapStoreOptions
  ]) | scala.Null
  type TargetConfigType = (js.Array[java.lang.String | typingsJapgolly.appBuilderLib.coreMod.TargetConfiguration]) | java.lang.String | typingsJapgolly.appBuilderLib.coreMod.TargetConfiguration | scala.Null
}
