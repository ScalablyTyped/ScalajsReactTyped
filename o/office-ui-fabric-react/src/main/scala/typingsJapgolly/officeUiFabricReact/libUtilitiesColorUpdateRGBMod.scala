package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.a
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.b
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.g
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesColorUpdateRGBMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/updateRGB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateRGB(color: IColor, component: r | g | b | a, value: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRGB")(color.asInstanceOf[js.Any], component.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IColor]
}
