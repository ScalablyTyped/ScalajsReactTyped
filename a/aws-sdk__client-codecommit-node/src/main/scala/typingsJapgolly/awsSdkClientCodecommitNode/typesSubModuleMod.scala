package typingsJapgolly.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSubModuleMod {
  
  trait SubModule extends StObject {
    
    /**
      * <p>The fully qualified path to the folder that contains the reference to the submodule.</p>
      */
    var absolutePath: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The commit ID that contains the reference to the submodule.</p>
      */
    var commitId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The relative path of the submodule from the folder where the query originated.</p>
      */
    var relativePath: js.UndefOr[String] = js.undefined
  }
  object SubModule {
    
    inline def apply(): SubModule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubModule]
    }
    
    extension [Self <: SubModule](x: Self) {
      
      inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    }
  }
  
  type UnmarshalledSubModule = SubModule
}
