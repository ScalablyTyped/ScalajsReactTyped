package typingsJapgolly.atAngularCore

import typingsJapgolly.std.Exclude
import typingsJapgolly.typescript.typescriptMod.ComputedPropertyName
import typingsJapgolly.typescript.typescriptMod.PropertyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/schematics/utils/typescript/property_name", JSImport.Namespace)
@js.native
object schematicsUtilsTypescriptPropertyUnderscoreNameMod extends js.Object {
  def getPropertyNameText(node: PropertyName): String | Null = js.native
  def hasPropertyNameText(node: PropertyName): /* is @angular/core.@angular/core/schematics/utils/typescript/property_name.PropertyNameWithText */ Boolean = js.native
  /** Type that describes a property name with an obtainable text. */
  type PropertyNameWithText = Exclude[PropertyName, ComputedPropertyName]
}

