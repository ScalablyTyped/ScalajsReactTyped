package typingsJapgolly.uifabricStyling

import typingsJapgolly.uifabricStyling.anon.PartialIIconOptions
import typingsJapgolly.uifabricStyling.libUtilitiesIconsMod.IIconRecord
import typingsJapgolly.uifabricStyling.libUtilitiesIconsMod.IIconSubset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMod {
  
  @JSImport("@uifabric/styling/lib/Icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIcon(): js.UndefOr[IIconRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcon")().asInstanceOf[js.UndefOr[IIconRecord]]
  inline def getIcon(name: String): js.UndefOr[IIconRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcon")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IIconRecord]]
  
  inline def getIconClassName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconClassName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def registerIconAlias(iconName: String, mappedToName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIconAlias")(iconName.asInstanceOf[js.Any], mappedToName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerIcons(iconSubset: IIconSubset): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerIcons")(iconSubset.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerIcons(iconSubset: IIconSubset, options: PartialIIconOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIcons")(iconSubset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setIconOptions(options: PartialIIconOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIconOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterIcons(iconNames: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterIcons")(iconNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
