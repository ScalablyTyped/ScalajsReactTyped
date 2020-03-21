package typingsJapgolly.electronUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AboutMenuItemOptions = typingsJapgolly.electronUtil.mod.ShowAboutWindowOptions
  type Choices[Macos, Windows, Linux, Default] = typingsJapgolly.typeFest.mod.RequireAtLeastOne[
    typingsJapgolly.electronUtil.mod._Choices[Macos, Windows, Linux, Default], 
    typingsJapgolly.electronUtil.electronUtilStrings.macos | typingsJapgolly.electronUtil.electronUtilStrings.windows | typingsJapgolly.electronUtil.electronUtilStrings.linux
  ]
}
