package typingsJapgolly.uifabricStyling

import typingsJapgolly.uifabricStyling.iconsMod.IIconRecord
import typingsJapgolly.uifabricStyling.iconsMod.IIconSubset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/utilities", JSImport.Namespace)
@js.native
object utilitiesMod extends js.Object {
  def buildClassMap[T /* <: js.Object */](styles: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? string}
    */ typingsJapgolly.uifabricStyling.uifabricStylingStrings.buildClassMap with js.Any = js.native
  def getIcon(): js.UndefOr[IIconRecord] = js.native
  def getIcon(name: String): js.UndefOr[IIconRecord] = js.native
  def getIconClassName(name: String): String = js.native
  def registerIconAlias(iconName: String, mappedToName: String): Unit = js.native
  def registerIcons(iconSubset: IIconSubset): Unit = js.native
  def registerIcons(iconSubset: IIconSubset, options: PartialIIconOptions): Unit = js.native
  def setIconOptions(options: PartialIIconOptions): Unit = js.native
  def unregisterIcons(iconNames: js.Array[String]): Unit = js.native
}

