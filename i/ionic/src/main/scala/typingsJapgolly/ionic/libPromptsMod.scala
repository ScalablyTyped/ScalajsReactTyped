package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IonicEnvironmentFlags
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestion
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromptsMod {
  
  @JSImport("ionic/lib/prompts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOnFallback(hasHasConfirmLog: CreateOnFallbackOptions): js.Function1[/* question */ PromptQuestion, String | Boolean | Unit | PromptValueCheckbox] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnFallback")(hasHasConfirmLog.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* question */ PromptQuestion, String | Boolean | Unit | PromptValueCheckbox]]
  
  trait CreateOnFallbackOptions extends StObject {
    
    val flags: IonicEnvironmentFlags
    
    val log: ILogger
  }
  object CreateOnFallbackOptions {
    
    inline def apply(flags: IonicEnvironmentFlags, log: ILogger): CreateOnFallbackOptions = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOnFallbackOptions]
    }
    
    extension [Self <: CreateOnFallbackOptions](x: Self) {
      
      inline def setFlags(value: IonicEnvironmentFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
}
