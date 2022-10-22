package typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadOptions extends StObject {
  
  var configDir: js.UndefOr[String] = js.undefined
  
  var extendServer: js.UndefOr[
    js.Function1[
      /* server */ Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ], 
      Unit
    ]
  ] = js.undefined
  
  var framework: String
  
  var frameworkPresets: js.Array[String]
  
  var ignorePreview: js.UndefOr[Boolean] = js.undefined
  
  var outputDir: js.UndefOr[String] = js.undefined
  
  var packageJson: PackageJson
}
object LoadOptions {
  
  inline def apply(framework: String, frameworkPresets: js.Array[String], packageJson: PackageJson): LoadOptions = {
    val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any], frameworkPresets = frameworkPresets.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadOptions]
  }
  
  extension [Self <: LoadOptions](x: Self) {
    
    inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
    
    inline def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
    
    inline def setExtendServer(
      value: /* server */ Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ] => Callback
    ): Self = StObject.set(x, "extendServer", js.Any.fromFunction1((t0: /* server */ Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]) => value(t0).runNow()))
    
    inline def setExtendServerUndefined: Self = StObject.set(x, "extendServer", js.undefined)
    
    inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkPresets(value: js.Array[String]): Self = StObject.set(x, "frameworkPresets", value.asInstanceOf[js.Any])
    
    inline def setFrameworkPresetsVarargs(value: String*): Self = StObject.set(x, "frameworkPresets", js.Array(value*))
    
    inline def setIgnorePreview(value: Boolean): Self = StObject.set(x, "ignorePreview", value.asInstanceOf[js.Any])
    
    inline def setIgnorePreviewUndefined: Self = StObject.set(x, "ignorePreview", js.undefined)
    
    inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
    
    inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
    
    inline def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
  }
}
