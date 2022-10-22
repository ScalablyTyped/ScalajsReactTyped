package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
import typingsJapgolly.officeUiFabricReact.libUtilitiesColorInterfacesMod.IHSV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesColorGetColorFromHSVMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/getColorFromHSV", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getColorFromHSV(hsv: IHSV): IColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromHSV")(hsv.asInstanceOf[js.Any]).asInstanceOf[IColor]
  inline def getColorFromHSV(hsv: IHSV, a: Double): IColor = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromHSV")(hsv.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[IColor]
}
