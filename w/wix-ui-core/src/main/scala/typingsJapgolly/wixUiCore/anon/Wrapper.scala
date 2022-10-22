package typingsJapgolly.wixUiCore.anon

import typingsJapgolly.protractor.builtElementMod.ElementFinder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wrapper extends StObject {
  
  var dataHook: String
  
  var wrapper: js.UndefOr[ElementFinder] = js.undefined
}
object Wrapper {
  
  inline def apply(dataHook: String): Wrapper = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrapper]
  }
  
  extension [Self <: Wrapper](x: Self) {
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: ElementFinder): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
