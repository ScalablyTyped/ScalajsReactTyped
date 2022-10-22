package typingsJapgolly.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveMode extends StObject {
  
  var responsiveMode: js.UndefOr[
    typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  ] = js.undefined
}
object ResponsiveMode {
  
  inline def apply(): ResponsiveMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveMode]
  }
  
  extension [Self <: ResponsiveMode](x: Self) {
    
    inline def setResponsiveMode(
      value: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
    ): Self = StObject.set(x, "responsiveMode", value.asInstanceOf[js.Any])
    
    inline def setResponsiveModeUndefined: Self = StObject.set(x, "responsiveMode", js.undefined)
  }
}
