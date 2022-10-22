package typingsJapgolly.gestalt.mod

import typingsJapgolly.gestalt.anon.Path
import typingsJapgolly.gestalt.gestaltStrings.brandPrimary
import typingsJapgolly.gestalt.gestaltStrings.dark
import typingsJapgolly.gestalt.gestaltStrings.default
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.gestaltStrings.inverse
import typingsJapgolly.gestalt.gestaltStrings.light
import typingsJapgolly.gestalt.gestaltStrings.shopping
import typingsJapgolly.gestalt.gestaltStrings.subtle
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconProps extends StObject {
  
  var accessibilityLabel: String
  
  var color: js.UndefOr[
    default | subtle | success | error | warning | info | inverse | shopping | brandPrimary | light | dark
  ] = js.undefined
  
  var dangerouslySetSvgPath: js.UndefOr[Path] = js.undefined
  
  var icon: js.UndefOr[Icons] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double | String] = js.undefined
}
object IconProps {
  
  inline def apply(accessibilityLabel: String): IconProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
  
  extension [Self <: IconProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setColor(
      value: default | subtle | success | error | warning | info | inverse | shopping | brandPrimary | light | dark
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDangerouslySetSvgPath(value: Path): Self = StObject.set(x, "dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetSvgPathUndefined: Self = StObject.set(x, "dangerouslySetSvgPath", js.undefined)
    
    inline def setIcon(value: Icons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
