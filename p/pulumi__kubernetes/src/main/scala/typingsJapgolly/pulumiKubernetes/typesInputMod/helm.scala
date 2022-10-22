package typingsJapgolly.pulumiKubernetes.typesInputMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helm {
  
  object v3 {
    
    /**
      * Specification defining the Helm chart repository to use.
      */
    trait RepositoryOpts extends StObject {
      
      /**
        * The Repository's CA File
        */
      var caFile: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The repository's cert file
        */
      var certFile: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The repository's cert key file
        */
      var keyFile: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Password for HTTP basic authentication
        */
      var password: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository.
        */
      var repo: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Username for HTTP basic authentication
        */
      var username: js.UndefOr[Input[String]] = js.undefined
    }
    object RepositoryOpts {
      
      inline def apply(): RepositoryOpts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RepositoryOpts]
      }
      
      extension [Self <: RepositoryOpts](x: Self) {
        
        inline def setCaFile(value: Input[String]): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
        
        inline def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
        
        inline def setCertFile(value: Input[String]): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
        
        inline def setCertFileUndefined: Self = StObject.set(x, "certFile", js.undefined)
        
        inline def setKeyFile(value: Input[String]): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
        
        inline def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
        
        inline def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        inline def setRepo(value: Input[String]): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
        
        inline def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
        
        inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
  }
}
