package typingsJapgolly.reactNativePermissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AndroidPermission = typingsJapgolly.reactNativePermissions.typesMod.Values[typingsJapgolly.reactNativePermissions.ReadonlyACCEPTHANDOVERand]
  type IOSPermission = typingsJapgolly.reactNativePermissions.typesMod.Values[typingsJapgolly.reactNativePermissions.ReadonlyBLUETOOTHPERIPHER]
  type Permission = typingsJapgolly.reactNativePermissions.typesMod.AndroidPermission | typingsJapgolly.reactNativePermissions.typesMod.IOSPermission
  type PermissionStatus = typingsJapgolly.reactNativePermissions.typesMod.Values[typingsJapgolly.reactNativePermissions.ReadonlyUNAVAILABLEunavai]
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
