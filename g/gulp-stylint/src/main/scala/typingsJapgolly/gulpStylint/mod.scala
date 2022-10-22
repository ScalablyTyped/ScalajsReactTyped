package typingsJapgolly.gulpStylint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gulpStylint.anon.FailOnWarning
import typingsJapgolly.gulpStylint.gulpStylintBooleans.`true`
import typingsJapgolly.gulpStylint.gulpStylintStrings.fail
import typingsJapgolly.gulpStylint.mod.GulpStylint.Options
import typingsJapgolly.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-stylint", JSImport.Namespace)
  @js.native
  val ^ : GulpStylint = js.native
  
  @js.native
  trait GulpStylint extends StObject {
    
    def apply(): ReadWriteStream = js.native
    def apply(options: Options): ReadWriteStream = js.native
    
    def reporter(): ReadWriteStream = js.native
    def reporter(options: GulpStylint): ReadWriteStream = js.native
    @JSName("reporter")
    def reporter_fail(identifier: fail): ReadWriteStream = js.native
    @JSName("reporter")
    def reporter_fail(identifier: fail, options: FailOnWarning): ReadWriteStream = js.native
  }
  object GulpStylint {
    
    trait FailReporterOptions extends StObject {
      
      var failOnWarning: `true`
    }
    object FailReporterOptions {
      
      inline def apply(): FailReporterOptions = {
        val __obj = js.Dynamic.literal(failOnWarning = true)
        __obj.asInstanceOf[FailReporterOptions]
      }
      
      extension [Self <: FailReporterOptions](x: Self) {
        
        inline def setFailOnWarning(value: `true`): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      var config: js.UndefOr[String] = js.undefined
      
      var reporter: js.UndefOr[Any] = js.undefined
      
      var rules: js.UndefOr[StringDictionary[Any]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
        
        inline def setReporter(value: Any): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
        
        inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
        
        inline def setRules(value: StringDictionary[Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
        
        inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      }
    }
    
    trait ReporterOptions extends StObject {
      
      var logger: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object ReporterOptions {
      
      inline def apply(): ReporterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ReporterOptions]
      }
      
      extension [Self <: ReporterOptions](x: Self) {
        
        inline def setLogger(value: Callback): Self = StObject.set(x, "logger", value.toJsFn)
        
        inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      }
    }
  }
  
  type _To = GulpStylint
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpStylint = ^
}
