package typingsJapgolly.pulumiKubernetes.typesOutputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helm {
  
  object v3 {
    
    trait ReleaseStatus extends StObject {
      
      /**
        * The version number of the application being deployed.
        */
      var appVersion: String
      
      /**
        * The name of the chart.
        */
      var chart: String
      
      /**
        * Name is the name of the release.
        */
      var name: String
      
      /**
        * Namespace is the kubernetes namespace of the release.
        */
      var namespace: String
      
      /**
        * Version is an int32 which represents the version of the release.
        */
      var revision: Double
      
      /**
        * Status of the release.
        */
      var status: String
      
      /**
        * A SemVer 2 conformant version string of the chart.
        */
      var version: String
    }
    object ReleaseStatus {
      
      inline def apply(
        appVersion: String,
        chart: String,
        name: String,
        namespace: String,
        revision: Double,
        status: String,
        version: String
      ): ReleaseStatus = {
        val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[ReleaseStatus]
      }
      
      extension [Self <: ReleaseStatus](x: Self) {
        
        inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
        
        inline def setChart(value: String): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Specification defining the Helm chart repository to use.
      */
    trait RepositoryOpts extends StObject {
      
      /**
        * The Repository's CA File
        */
      var caFile: String
      
      /**
        * The repository's cert file
        */
      var certFile: String
      
      /**
        * The repository's cert key file
        */
      var keyFile: String
      
      /**
        * Password for HTTP basic authentication
        */
      var password: String
      
      /**
        * Repository where to locate the requested chart. If is a URL the chart is installed without installing the repository.
        */
      var repo: String
      
      /**
        * Username for HTTP basic authentication
        */
      var username: String
    }
    object RepositoryOpts {
      
      inline def apply(
        caFile: String,
        certFile: String,
        keyFile: String,
        password: String,
        repo: String,
        username: String
      ): RepositoryOpts = {
        val __obj = js.Dynamic.literal(caFile = caFile.asInstanceOf[js.Any], certFile = certFile.asInstanceOf[js.Any], keyFile = keyFile.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[RepositoryOpts]
      }
      
      extension [Self <: RepositoryOpts](x: Self) {
        
        inline def setCaFile(value: String): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
        
        inline def setCertFile(value: String): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
        
        inline def setKeyFile(value: String): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
        
        inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
  }
}
