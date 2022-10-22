package typingsJapgolly.atlaskitTokens

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.deleted
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.deprecated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArtifactsRenameMappingMod extends Shortcut {
  
  @JSImport("@atlaskit/tokens/dist/types/artifacts/rename-mapping", JSImport.Default)
  @js.native
  val default: js.Array[RenameMap] = js.native
  
  trait RenameMap extends StObject {
    
    var path: String
    
    var replacement: Token
    
    var state: deprecated | deleted
  }
  object RenameMap {
    
    inline def apply(path: String, replacement: Token, state: deprecated | deleted): RenameMap = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenameMap]
    }
    
    extension [Self <: RenameMap](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setReplacement(value: Token): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      inline def setState(value: deprecated | deleted): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblue
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotblueDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotred
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotredDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotorange
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotorangeDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotyellow
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotyellowDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgreen
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgreenDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotpurple
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotpurpleDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotteal
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDottealDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotmagenta
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotmagentaDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgray
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotaccentDotgrayDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottext
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotdisabled
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotinverse
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotbrand
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotselected
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotdanger
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotwarning
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotwarningDotinverse
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotsuccess
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotdiscovery
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotinformation
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDothighEmphasis
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotlinkDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotlinkDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotlowEmphasis
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotmediumEmphasis
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotonBold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDottextDotonBoldWarning
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotblue
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotred
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotorange
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotyellow
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotgreen
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotpurple
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotteal
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotmagenta
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotaccentDotgray
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticon
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotinverse
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotdisabled
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotbrand
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotselected
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotdanger
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotwarning
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotwarningDotinverse
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotsuccess
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotdiscovery
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonDotinformation
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotblue
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotred
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotorange
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotyellow
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotgreen
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotpurple
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotteal
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotmagenta
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotaccentDotgray
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotinverse
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotfocused
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotinput
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotdisabled
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotbrand
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotselected
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotdanger
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotwarning
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotsuccess
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotdiscovery
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotinformation
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotfocus
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotborderDotneutral
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotsubtler
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblue
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotblueDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotsubtler
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotred
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotredDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotsubtler
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorange
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotorangeDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotsubtler
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellow
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotyellowDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotsubtler
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreen
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgreenDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotsubtler
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotteal
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDottealDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotsubtler
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurple
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotpurpleDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotsubtler
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagenta
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotmagentaDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotsubtlest
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotsubtler
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotaccentDotgrayDotbolder
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdisabled
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverseDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverseDotsubtleDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverseDotsubtleDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinverse
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinput
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinputDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinputDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutral
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotsubtleDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotsubtleDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotboldDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotneutralDotboldDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotboldDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotboldDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrand
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotbrandDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselected
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotboldDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotboldDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotselectedDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdanger
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDotboldDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdangerDotboldDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarning
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDotboldDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotwarningDotboldDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccess
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDotboldDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsuccessDotboldDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscovery
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDotboldDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdiscoveryDotboldDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformation
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDotbold
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDotboldDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotinformationDotboldDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotblanket
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldBrandDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldBrandDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldBrandDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDangerDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDangerDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDangerDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDiscoveryDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDiscoveryDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldDiscoveryDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldNeutralDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldNeutralDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldNeutralDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldSuccessDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldSuccessDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldSuccessDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldWarningDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldWarningDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotboldWarningDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotcard
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotdefault
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotoverlay
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBorderedNeutralDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBorderedNeutralDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBrandDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBrandDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleBrandDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDangerDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDangerDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDangerDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDiscoveryDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDiscoveryDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleDiscoveryDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleNeutralDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleNeutralDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleNeutralDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleSuccessDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleSuccessDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleSuccessDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleWarningDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleWarningDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsubtleWarningDotresting
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDotsunken
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDottransparentNeutralDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotbackgroundDottransparentNeutralDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotblanket
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotblanketDotselected
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotblanketDotdanger
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDotinverseDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotinteractionDotinverseDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotskeleton
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotskeletonDotsubtle
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotlink
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotlinkDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldBlue
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldGreen
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldOrange
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldPurple
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldRed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotboldTeal
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleBlue
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleGreen
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleMagenta
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleOrange
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtlePurple
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleRed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotaccentDotsubtleTeal
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotbrand
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotdanger
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotdiscovery
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotsuccess
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDoticonBorderDotwarning
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotoverlayDothover
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.colorDotoverlayDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.shadowDotcard
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.shadowDotoverlay
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotraised
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotoverflow
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotshadowDotoverlay
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurface
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotsunken
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotraised
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotraisedDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotraisedDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotoverlay
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotoverlayDothovered
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.elevationDotsurfaceDotoverlayDotpressed
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.opacityDotdisabled
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.opacityDotloading
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.utilityDotUNSAFE_utilDottransparent
    - typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.utilityDotUNSAFE_utilDotMISSING_TOKEN
    - java.lang.String
  */
  type Token = _Token | String
  
  type _To = js.Array[RenameMap]
  
  trait _Token extends StObject
  
  /* This means you don't have to write `default`, but can instead just say `distTypesArtifactsRenameMappingMod.foo` */
  override def _to: js.Array[RenameMap] = default
}
