package typingsJapgolly.vscodeLanguageserver

import typingsJapgolly.vscodeLanguageserver.anon.OnRefresh
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.Feature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod._Languages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonInlineValueMod {
  
  @JSImport("vscode-languageserver/lib/common/inlineValue", "InlineValueFeature")
  @js.native
  val InlineValueFeature: Feature[_Languages, InlineValueFeatureShape] = js.native
  
  trait InlineValueFeatureShape extends StObject {
    
    var inlineValue: OnRefresh
  }
  object InlineValueFeatureShape {
    
    inline def apply(inlineValue: OnRefresh): InlineValueFeatureShape = {
      val __obj = js.Dynamic.literal(inlineValue = inlineValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineValueFeatureShape]
    }
    
    extension [Self <: InlineValueFeatureShape](x: Self) {
      
      inline def setInlineValue(value: OnRefresh): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
    }
  }
}
