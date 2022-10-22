package typingsJapgolly.expoPrebuildConfig.anon

import typingsJapgolly.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBBoolean
import typingsJapgolly.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBContentMode
import typingsJapgolly.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBTextAlignment
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.alignBaselines
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.characterWrap
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.clip
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.headTruncation
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.middleTruncation
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.none
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.tailTruncation
import typingsJapgolly.expoPrebuildConfig.expoPrebuildConfigStrings.wordWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustsFontSizeToFit extends StObject {
  
  var adjustsFontSizeToFit: IBBoolean
  
  var baselineAdjustment: js.UndefOr[none | alignBaselines] = js.undefined
  
  var contentMode: IBContentMode
  
  var fixedFrame: IBBoolean
  
  var horizontalHuggingPriority: Double
  
  var id: String
  
  var lineBreakMode: clip | characterWrap | wordWrap | headTruncation | middleTruncation | tailTruncation
  
  var opaque: IBBoolean
  
  /** The main value. */
  var text: String
  
  var textAlignment: js.UndefOr[IBTextAlignment] = js.undefined
  
  var translatesAutoresizingMaskIntoConstraints: js.UndefOr[IBBoolean] = js.undefined
  
  var userInteractionEnabled: IBBoolean
  
  var verticalHuggingPriority: Double
}
object AdjustsFontSizeToFit {
  
  inline def apply(
    adjustsFontSizeToFit: IBBoolean,
    contentMode: IBContentMode,
    fixedFrame: IBBoolean,
    horizontalHuggingPriority: Double,
    id: String,
    lineBreakMode: clip | characterWrap | wordWrap | headTruncation | middleTruncation | tailTruncation,
    opaque: IBBoolean,
    text: String,
    userInteractionEnabled: IBBoolean,
    verticalHuggingPriority: Double
  ): AdjustsFontSizeToFit = {
    val __obj = js.Dynamic.literal(adjustsFontSizeToFit = adjustsFontSizeToFit.asInstanceOf[js.Any], contentMode = contentMode.asInstanceOf[js.Any], fixedFrame = fixedFrame.asInstanceOf[js.Any], horizontalHuggingPriority = horizontalHuggingPriority.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lineBreakMode = lineBreakMode.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], userInteractionEnabled = userInteractionEnabled.asInstanceOf[js.Any], verticalHuggingPriority = verticalHuggingPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustsFontSizeToFit]
  }
  
  extension [Self <: AdjustsFontSizeToFit](x: Self) {
    
    inline def setAdjustsFontSizeToFit(value: IBBoolean): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    inline def setBaselineAdjustment(value: none | alignBaselines): Self = StObject.set(x, "baselineAdjustment", value.asInstanceOf[js.Any])
    
    inline def setBaselineAdjustmentUndefined: Self = StObject.set(x, "baselineAdjustment", js.undefined)
    
    inline def setContentMode(value: IBContentMode): Self = StObject.set(x, "contentMode", value.asInstanceOf[js.Any])
    
    inline def setFixedFrame(value: IBBoolean): Self = StObject.set(x, "fixedFrame", value.asInstanceOf[js.Any])
    
    inline def setHorizontalHuggingPriority(value: Double): Self = StObject.set(x, "horizontalHuggingPriority", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLineBreakMode(value: clip | characterWrap | wordWrap | headTruncation | middleTruncation | tailTruncation): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    inline def setOpaque(value: IBBoolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAlignment(value: IBTextAlignment): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
    
    inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
    
    inline def setTranslatesAutoresizingMaskIntoConstraints(value: IBBoolean): Self = StObject.set(x, "translatesAutoresizingMaskIntoConstraints", value.asInstanceOf[js.Any])
    
    inline def setTranslatesAutoresizingMaskIntoConstraintsUndefined: Self = StObject.set(x, "translatesAutoresizingMaskIntoConstraints", js.undefined)
    
    inline def setUserInteractionEnabled(value: IBBoolean): Self = StObject.set(x, "userInteractionEnabled", value.asInstanceOf[js.Any])
    
    inline def setVerticalHuggingPriority(value: Double): Self = StObject.set(x, "verticalHuggingPriority", value.asInstanceOf[js.Any])
  }
}
