package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenFlags extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "TokenFlags")
@js.native
object TokenFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenFlags & Double] = js.native
  
  @js.native
  sealed trait BinarySpecifier
    extends StObject
       with TokenFlags
  /* 128 */ val BinarySpecifier: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenFlags.BinarySpecifier & Double = js.native
  
  @js.native
  sealed trait HexSpecifier
    extends StObject
       with TokenFlags
  /* 64 */ val HexSpecifier: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenFlags.HexSpecifier & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TokenFlags
  /* 0 */ val None: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenFlags.None & Double = js.native
  
  @js.native
  sealed trait Octal
    extends StObject
       with TokenFlags
  /* 32 */ val Octal: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenFlags.Octal & Double = js.native
  
  @js.native
  sealed trait OctalSpecifier
    extends StObject
       with TokenFlags
  /* 256 */ val OctalSpecifier: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenFlags.OctalSpecifier & Double = js.native
  
  @js.native
  sealed trait Scientific
    extends StObject
       with TokenFlags
  /* 16 */ val Scientific: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenFlags.Scientific & Double = js.native
}
