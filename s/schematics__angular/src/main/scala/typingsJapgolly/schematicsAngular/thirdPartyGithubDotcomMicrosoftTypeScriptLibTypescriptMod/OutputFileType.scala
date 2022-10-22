package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputFileType extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "OutputFileType")
@js.native
object OutputFileType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputFileType & Double] = js.native
  
  @js.native
  sealed trait Declaration
    extends StObject
       with OutputFileType
  /* 2 */ val Declaration: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OutputFileType.Declaration & Double = js.native
  
  @js.native
  sealed trait JavaScript
    extends StObject
       with OutputFileType
  /* 0 */ val JavaScript: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OutputFileType.JavaScript & Double = js.native
  
  @js.native
  sealed trait SourceMap
    extends StObject
       with OutputFileType
  /* 1 */ val SourceMap: typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OutputFileType.SourceMap & Double = js.native
}
