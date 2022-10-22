package typingsJapgolly.gestalt.mod

import typingsJapgolly.gestalt.anon.Target
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.errorBare
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.gestaltStrings.infoBare
import typingsJapgolly.gestalt.gestaltStrings.neutral
import typingsJapgolly.gestalt.gestaltStrings.recommendation
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.successBare
import typingsJapgolly.gestalt.gestaltStrings.warning
import typingsJapgolly.gestalt.gestaltStrings.warningBare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlimBannerProps extends StObject {
  
  /**
    * Helper [Link](https://gestalt.pinterest.systems/link) to be placed after the message. See the [helperLink variant](https://gestalt.pinterest.systems/slimbanner#helperLink) to learn more.
    */
  var helperLink: js.UndefOr[Target] = js.undefined
  
  /**
    * Label to describe the status icon’s purpose. See the [Accessibility guidelines](https://gestalt.pinterest.systems/slimbanner#Accessibility) for details on proper usage.
    */
  var iconAccessibilityLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Main content of SlimBanner. Content should be [localized](https://gestalt.pinterest.systems/slimbanner#Localization).
    *
    */
  var message: String
  
  /**
    * The type of SlimBanner. See the [variants](https://gestalt.pinterest.systems/slimbanner#Variants) to learn more.
    */
  var `type`: js.UndefOr[
    neutral | error | info | warning | success | errorBare | infoBare | warningBare | successBare | recommendation
  ] = js.undefined
}
object SlimBannerProps {
  
  inline def apply(message: String): SlimBannerProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlimBannerProps]
  }
  
  extension [Self <: SlimBannerProps](x: Self) {
    
    inline def setHelperLink(value: Target): Self = StObject.set(x, "helperLink", value.asInstanceOf[js.Any])
    
    inline def setHelperLinkUndefined: Self = StObject.set(x, "helperLink", js.undefined)
    
    inline def setIconAccessibilityLabel(value: String): Self = StObject.set(x, "iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setIconAccessibilityLabelUndefined: Self = StObject.set(x, "iconAccessibilityLabel", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: neutral | error | info | warning | success | errorBare | infoBare | warningBare | successBare | recommendation
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
