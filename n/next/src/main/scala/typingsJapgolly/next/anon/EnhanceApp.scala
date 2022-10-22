package typingsJapgolly.next.anon

import typingsJapgolly.next.distSharedLibUtilsMod.AppType
import typingsJapgolly.next.distSharedLibUtilsMod.Enhancer
import typingsJapgolly.next.distSharedLibUtilsMod.NextComponentType
import typingsJapgolly.next.distSharedLibUtilsMod.NextPageContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhanceApp extends StObject {
  
  var enhanceApp: js.UndefOr[Enhancer[AppType[js.Object]]] = js.undefined
  
  var enhanceComponent: js.UndefOr[Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]] = js.undefined
}
object EnhanceApp {
  
  inline def apply(): EnhanceApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhanceApp]
  }
  
  extension [Self <: EnhanceApp](x: Self) {
    
    inline def setEnhanceApp(value: AppType[js.Object] => AppType[js.Object]): Self = StObject.set(x, "enhanceApp", js.Any.fromFunction1(value))
    
    inline def setEnhanceAppUndefined: Self = StObject.set(x, "enhanceApp", js.undefined)
    
    inline def setEnhanceComponent(
      value: NextComponentType[NextPageContext, js.Object, js.Object] => NextComponentType[NextPageContext, js.Object, js.Object]
    ): Self = StObject.set(x, "enhanceComponent", js.Any.fromFunction1(value))
    
    inline def setEnhanceComponentUndefined: Self = StObject.set(x, "enhanceComponent", js.undefined)
  }
}
