package typingsJapgolly.gulpLesshint

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gulpLesshint.anon.On
import typingsJapgolly.gulpLesshint.anon.ResultCount
import typingsJapgolly.gulpLesshint.mod.gulpLesshint.Plugin
import typingsJapgolly.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-lesshint", JSImport.Namespace)
  @js.native
  val ^ : Plugin = js.native
  
  type _To = Plugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin = ^
  
  object gulpLesshint {
    
    trait LessHintFile
      extends StObject
         with /* key */ StringDictionary[Any] {
      
      var lesshint: ResultCount
    }
    object LessHintFile {
      
      inline def apply(lesshint: ResultCount): LessHintFile = {
        val __obj = js.Dynamic.literal(lesshint = lesshint.asInstanceOf[js.Any])
        __obj.asInstanceOf[LessHintFile]
      }
      
      extension [Self <: LessHintFile](x: Self) {
        
        inline def setLesshint(value: ResultCount): Self = StObject.set(x, "lesshint", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      var configPath: js.UndefOr[String] = js.undefined
      
      var maxWarnings: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
        
        inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
        
        inline def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
        
        inline def setMaxWarningsUndefined: Self = StObject.set(x, "maxWarnings", js.undefined)
      }
    }
    
    @js.native
    trait Plugin extends StObject {
      
      def apply(): On & Transform = js.native
      def apply(options: Options): On & Transform = js.native
      
      def failOnError(): Transform = js.native
      
      def failOnWarning(): Transform = js.native
      
      def reporter(): Transform = js.native
      def reporter(reporter: String): Transform = js.native
    }
  }
}
