package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "ModuleKind")
@js.native
object ModuleKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleKind & Double] = js.native
  
  @js.native
  sealed trait AMD
    extends StObject
       with ModuleKind
  /* 2 */ val AMD: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.AMD & Double = js.native
  
  @js.native
  sealed trait CommonJS
    extends StObject
       with ModuleKind
  /* 1 */ val CommonJS: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.CommonJS & Double = js.native
  
  @js.native
  sealed trait ES2015
    extends StObject
       with ModuleKind
  /* 5 */ val ES2015: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.ES2015 & Double = js.native
  
  @js.native
  sealed trait ES2020
    extends StObject
       with ModuleKind
  /* 6 */ val ES2020: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.ES2020 & Double = js.native
  
  @js.native
  sealed trait ES2022
    extends StObject
       with ModuleKind
  /* 7 */ val ES2022: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.ES2022 & Double = js.native
  
  @js.native
  sealed trait ESNext
    extends StObject
       with ModuleKind
  /* 99 */ val ESNext: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.ESNext & Double = js.native
  
  @js.native
  sealed trait Node16
    extends StObject
       with ModuleKind
  /* 100 */ val Node16: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.Node16 & Double = js.native
  
  @js.native
  sealed trait NodeNext
    extends StObject
       with ModuleKind
  /* 199 */ val NodeNext: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.NodeNext & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ModuleKind
  /* 0 */ val None: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.None & Double = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with ModuleKind
  /* 4 */ val System: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.System & Double = js.native
  
  @js.native
  sealed trait UMD
    extends StObject
       with ModuleKind
  /* 3 */ val UMD: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.ModuleKind.UMD & Double = js.native
}
