package typingsJapgolly.kakaoJsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.kakaoJsSdk.Kakao.Link.LinkCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  // default false
  var callback: js.UndefOr[LinkCallback] = js.undefined
  
  var container: String | HTMLElement
  
  var installTalk: js.UndefOr[Boolean] = js.undefined
  
  var serverCallbackArgs: js.UndefOr[StringDictionary[Any] | String] = js.undefined
  
  var templateArgs: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var templateId: Double
}
object Callback {
  
  inline def apply(container: String | HTMLElement, templateId: Double): Callback = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  extension [Self <: Callback](x: Self) {
    
    inline def setCallback(value: LinkCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setInstallTalk(value: Boolean): Self = StObject.set(x, "installTalk", value.asInstanceOf[js.Any])
    
    inline def setInstallTalkUndefined: Self = StObject.set(x, "installTalk", js.undefined)
    
    inline def setServerCallbackArgs(value: StringDictionary[Any] | String): Self = StObject.set(x, "serverCallbackArgs", value.asInstanceOf[js.Any])
    
    inline def setServerCallbackArgsUndefined: Self = StObject.set(x, "serverCallbackArgs", js.undefined)
    
    inline def setTemplateArgs(value: StringDictionary[Any]): Self = StObject.set(x, "templateArgs", value.asInstanceOf[js.Any])
    
    inline def setTemplateArgsUndefined: Self = StObject.set(x, "templateArgs", js.undefined)
    
    inline def setTemplateId(value: Double): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
