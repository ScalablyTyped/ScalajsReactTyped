package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.FileReplacement
import typingsJapgolly.angularDevkitCore.mod.BaseException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsNormalizeFileReplacementsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/normalize-file-replacements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/utils/normalize-file-replacements", "MissingFileReplacementException")
  @js.native
  open class MissingFileReplacementException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  inline def normalizeFileReplacements(fileReplacements: js.Array[FileReplacement], workspaceRoot: String): js.Array[NormalizedFileReplacement] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeFileReplacements")(fileReplacements.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any])).asInstanceOf[js.Array[NormalizedFileReplacement]]
  
  trait NormalizedFileReplacement extends StObject {
    
    var replace: String
    
    var `with`: String
  }
  object NormalizedFileReplacement {
    
    inline def apply(replace: String, `with`: String): NormalizedFileReplacement = {
      val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any])
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedFileReplacement]
    }
    
    extension [Self <: NormalizedFileReplacement](x: Self) {
      
      inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setWith(value: String): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    }
  }
}
