package typingsJapgolly.jimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pluginsMod {
  type ClassOrConstantPlugin[T /* <: typingsJapgolly.jimpCore.etcMod.Image */] = typingsJapgolly.jimpCore.pluginsMod.WellFormedPlugin[T] with (typingsJapgolly.std.Required[
    typingsJapgolly.std.Pick[
      typingsJapgolly.jimpCore.pluginsMod.WellFormedPlugin[T], 
      typingsJapgolly.jimpCore.jimpCoreStrings.`class` | typingsJapgolly.jimpCore.jimpCoreStrings.constants
    ]
  ])
  type IllformedPlugin = (typingsJapgolly.jimpCore.utilsMod.Omit[
    _, 
    typingsJapgolly.jimpCore.jimpCoreStrings.`class` | typingsJapgolly.jimpCore.jimpCoreStrings.constants
  ]) with js.Object
  type JimpPlugin[T /* <: typingsJapgolly.jimpCore.etcMod.Image */] = typingsJapgolly.jimpCore.pluginsMod.ClassOrConstantPlugin[T] | typingsJapgolly.jimpCore.pluginsMod.IllformedPlugin
}
