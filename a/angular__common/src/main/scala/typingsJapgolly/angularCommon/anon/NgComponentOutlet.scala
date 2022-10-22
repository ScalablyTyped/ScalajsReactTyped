package typingsJapgolly.angularCommon.anon

import typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutlet
import typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutletContent
import typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutletInjector
import typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutletNgModule
import typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutletNgModuleFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgComponentOutlet extends StObject {
  
  var ngComponentOutlet: typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutlet
  
  var ngComponentOutletContent: typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutletContent
  
  var ngComponentOutletInjector: typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutletInjector
  
  var ngComponentOutletNgModule: typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutletNgModule
  
  var ngComponentOutletNgModuleFactory: typingsJapgolly.angularCommon.angularCommonStrings.ngComponentOutletNgModuleFactory
}
object NgComponentOutlet {
  
  inline def apply(): NgComponentOutlet = {
    val __obj = js.Dynamic.literal(ngComponentOutlet = "ngComponentOutlet", ngComponentOutletContent = "ngComponentOutletContent", ngComponentOutletInjector = "ngComponentOutletInjector", ngComponentOutletNgModule = "ngComponentOutletNgModule", ngComponentOutletNgModuleFactory = "ngComponentOutletNgModuleFactory")
    __obj.asInstanceOf[NgComponentOutlet]
  }
  
  extension [Self <: NgComponentOutlet](x: Self) {
    
    inline def setNgComponentOutlet(value: ngComponentOutlet): Self = StObject.set(x, "ngComponentOutlet", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletContent(value: ngComponentOutletContent): Self = StObject.set(x, "ngComponentOutletContent", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletInjector(value: ngComponentOutletInjector): Self = StObject.set(x, "ngComponentOutletInjector", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletNgModule(value: ngComponentOutletNgModule): Self = StObject.set(x, "ngComponentOutletNgModule", value.asInstanceOf[js.Any])
    
    inline def setNgComponentOutletNgModuleFactory(value: ngComponentOutletNgModuleFactory): Self = StObject.set(x, "ngComponentOutletNgModuleFactory", value.asInstanceOf[js.Any])
  }
}
