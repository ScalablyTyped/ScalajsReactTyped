package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentStyle extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "IndentStyle")
@js.native
object IndentStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentStyle & Double] = js.native
  
  @js.native
  sealed trait Block
    extends StObject
       with IndentStyle
  /* 1 */ val Block: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.IndentStyle.Block & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with IndentStyle
  /* 0 */ val None: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.IndentStyle.None & Double = js.native
  
  @js.native
  sealed trait Smart
    extends StObject
       with IndentStyle
  /* 2 */ val Smart: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.IndentStyle.Smart & Double = js.native
}
