package typingsJapgolly.angularDevkitBuildAngular

import japgolly.scalajs.react.Callback
import typingsJapgolly.angularLocalize.mod.ɵParsedMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersExtractI18nIvyExtractLoaderMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/extract-i18n/ivy-extract-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(content: String, map: LoaderSourceMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(content.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type LoaderSourceMap = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<webpack.webpack.LoaderDefinitionFunction<{}, {}>>[1] */ js.Any
  
  trait LocalizeExtractLoaderOptions extends StObject {
    
    def messageHandler(messages: js.Array[ɵParsedMessage]): Unit
  }
  object LocalizeExtractLoaderOptions {
    
    inline def apply(messageHandler: js.Array[ɵParsedMessage] => Callback): LocalizeExtractLoaderOptions = {
      val __obj = js.Dynamic.literal(messageHandler = js.Any.fromFunction1((t0: js.Array[ɵParsedMessage]) => messageHandler(t0).runNow()))
      __obj.asInstanceOf[LocalizeExtractLoaderOptions]
    }
    
    extension [Self <: LocalizeExtractLoaderOptions](x: Self) {
      
      inline def setMessageHandler(value: js.Array[ɵParsedMessage] => Callback): Self = StObject.set(x, "messageHandler", js.Any.fromFunction1((t0: js.Array[ɵParsedMessage]) => value(t0).runNow()))
    }
  }
}
