package typingsJapgolly.pkgcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ProviderOptions = typingsJapgolly.pkgcloud.mod.BaseProviderOptions with (typingsJapgolly.std.Partial[
    typingsJapgolly.pkgcloud.mod.AmazonProviderOptions | typingsJapgolly.pkgcloud.mod.AzureProviderOptions | typingsJapgolly.pkgcloud.mod.GoogleProviderOptions | typingsJapgolly.pkgcloud.mod.OpenstackProviderOptions | typingsJapgolly.pkgcloud.mod.RackspaceProviderOptions
  ])
}
